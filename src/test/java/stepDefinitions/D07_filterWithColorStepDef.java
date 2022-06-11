package stepDefinitions;

import Pages.FilterWithColor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class D07_filterWithColorStepDef {
    FilterWithColor Filter= new FilterWithColor();

    @Given("user select a Apparel category then hover to Shoes subcategory")
    public void Apparel_subcategory()
    {
        Filter.Apparel_subcategory();
    }
    @And("user select shoes subCategory")
    public void shoesCategory()
    {

        Filter.shoesCategory().click();
    }
    @Then("filter by Red color")
public void Filter_Color()
    {
        Filter.Filter_Color().click();
    }
}
