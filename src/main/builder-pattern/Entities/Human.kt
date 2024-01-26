package Entities

open abstract class Human(var name: String,
                 var role: RoleType,
                 var imageURL: String,
                 var storeName: String,
                 var maxNumberItems: Int,
                 var creditCardNumber: Long) {

    constructor() : this("", RoleType.Default, "", "", 0, 0)
    val longZero : Long = 0

    override fun toString(): String {
        var infoString = "Name:${name}; Role:${role}; "
        if (imageURL != "") infoString += "imageURL:${imageURL}; "
        if (storeName != "") infoString += "storeName:${storeName}; "
        if (maxNumberItems != 0) infoString += "maxNumberItems:${maxNumberItems}; "
        if (creditCardNumber != longZero) infoString += "creditCardNumber: ${creditCardNumber}; "
        return infoString
    }
}