package kotlinequivalent

// Руководитель компании
class CompanyManager(private val name: String) {

    fun changeCompanyName(company: Company, newName: String) {
        println("\nРуководитель $name изменил название компании с \"${company.getName()}\" на \"$newName\".")
        company.setName(newName)
    }

    fun changeCompanyPlan(company: Company, newPlan: String) {
        println("\nРуководитель $name изменил план компании с \"${company.plan}\" на \"$newPlan\".")
        company.plan = newPlan
    }
}
