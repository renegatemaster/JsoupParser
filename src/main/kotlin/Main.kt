package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

const val URL = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
const val ELEMENT_CLASS = ".sc-2aegk7-2.bzpNIu"

fun main() {
    val doc: Document = Jsoup.connect(URL).get()

    val quotes: Elements = doc.select(ELEMENT_CLASS)
    var counter = 1

    for (quote: Element in quotes) {
        println("$counter) ${quote.text()}")
        counter++
    }
}