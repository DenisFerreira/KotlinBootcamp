package Chapter5.Buildings

open class BaseBuildingMaterial {
    open val numberNeeded:Int = 1
    fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
        if (building.actualMaterialsNeeded < 500) println("Small building")
        else println("large building")
    }
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}
class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<T: BaseBuildingMaterial>(private val buildingMaterial: T) {
    companion object{
        const val baseMaterialsNeeded:Int = 100
    }

    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
    fun isSmallBuilding(){
        if (actualMaterialsNeeded < 500) println("Small building")
        else println("large building")
    }
}

fun main() {
    Building(Wood()).build()
    Building(Brick()).build()

    firstLoop@ for (i in 1 .. 100)
        for (j in 1..100){
            if(i > 5) {
                println("i=$i j=$j")
                break@firstLoop
            }
        }

}