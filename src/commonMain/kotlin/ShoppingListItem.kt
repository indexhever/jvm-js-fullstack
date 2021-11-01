import kotlinx.serialization.Serializable

@Serializable
data class ShoppingListItem(val desc: String, val priority: Int) {
    // This is enough for our toy example, but certainly an oversimplification for working with
    // real data. If you are working with real data, it would be preferable to include tried and
    // tested mechanisms to generate identifiers for your objects – from UUIDs to autoincrementing
    // IDs backed by the database of your choice.
    val id: Int = desc.hashCode()

    companion object {
        const val path = "/shoppingList"
    }
}