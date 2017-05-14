package i_introduction._4_Lambdas

fun task4(collection: Collection<Int>): Boolean {
    return collection.any { it % 42 == 0 }
}