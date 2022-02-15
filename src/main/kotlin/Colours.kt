class Colours {

    private val colours = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet", "Black", "Silver")

    fun getAll (): List<String>{


       return colours
    }

    fun numberOfColours (): Int{
        //TODO return the size of the colours list

        return colours.size
    }

    fun firstColour() : String{
        //TODO return the first colour in the list
        return colours[0]
        //or you can return colours.get(0)
    }

    fun lastColour() : String{
        //TODO return the last colour list
        return colours[colours.size-1]
    }

    fun coloursInAplhabeticOrder() : List<String>{
        //TODO return the colours in alphabetical order
        return colours.sortedBy { it }

    }

    fun coloursInAllCapitals() : List<String>{
        //TODO return the colours in ALL CAPS
        return listOf(colours.toString().uppercase())
    }

    fun coloursStartingWithLetter(letter: Char) : List<String>{
        //TODO return the colours starting with the letter passed as a parameter
        return colours.filter { it.startsWith('B') }
    }

    fun coloursWithSpecificNumberOfChars(size: Int) : List<String>{
        //TODO return the colours that have exactly the same number of chars as the number passed as a parameter
        return colours.filter { it.length==size}
    }

    fun coloursWithLessCharsThan(size: Int) : List<String>{
        //TODO return the colours that have less chars than the number passed as s parameter
        return colours.filter { it.length<size }
    }

    fun isColourInTheList(colour : String) : Boolean{
        //TODO return true of the colour passed as a parameter is in the list and false otherwise
        // Note: the search should be case insensitive - if blue is passed as a parameter it should find Blue, BLUE etc.
        if(colours.contains("Blue")||colours.contains("BLUE")|| colours.contains("blue")){
            return true
        }

            return false

    }
    fun eachColor(){
        for(color in colours){
            println(color)
        }

    }

    //TODO Write THREE additional functions of your choice that will perform some sort of
    // analysis on the colours list.

    fun reversedAlphabetical() : List<String>{
        return coloursInAplhabeticOrder().reversed()
    }

    fun primaryColors(): Boolean {
        if (colours.contains("Red") && colours.contains("Green") && colours.contains("Blue")){
            return true
        }
        return false
    }

    fun listMaths(number: Int): Int {
        return colours.size-number
    }
}