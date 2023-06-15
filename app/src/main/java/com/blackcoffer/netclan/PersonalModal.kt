package com.blackcoffer.netclan

data class Model(val name: String,val place:String,val distance:String,val hobby:String,val desc:String)




object MockList {

    fun getModel(): List<Model> {


        val itemModel1 = Model(
            "George Paul",
            "udupi|Lawyer",
            "within 1 km",
            "Hobbies | Friendship | Movies",
            "Hi Community i am open to new connctions",

        )
        val itemModel2 = Model(
            "james Dsouza",
            "Mangalore|Doctor",
            "within 3 km",
            "Hobbies | Friendship | Movies",
            "Hi Community i am open to new connctions",

            )

        val itemModel3 = Model(
            "rakesh",
            "Manglore|Engineer",
            "within 5 km",
            "Hobbies | Friendship | Movies",
            "Hi Community i am open to new connctions",

            )
        val itemModel4 = Model(
            "Roshan",
            "Manglore|Lecturer",
            "within 25 km",
            "Hobbies | Friendship | Movies",
            "Hi Community i am open to new connctions",
            )

        val itemList: ArrayList<Model> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)

        return itemList
    }

}