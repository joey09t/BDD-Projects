$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("showProduct.feature");
formatter.feature({
  "line": 1,
  "name": "Show Product",
  "description": "",
  "id": "show-product",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User will add product to cart on Amazon",
  "description": "",
  "id": "show-product;user-will-add-product-to-cart-on-amazon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User will select products",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User will add products to cart",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "User clicks on show cart",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "show the list of products to user from cart",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.user_will_select_products()"
});
formatter.result({
  "duration": 132543696,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinition.Test.user_will_select_products(Test.java:13)\r\n\tat ✽.Given User will select products(showProduct.feature:3)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "Test.user_will_add_products_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Test.user_clicks_on_show_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Test.show_the_list_of_products_to_user_from_cart()"
});
formatter.result({
  "status": "skipped"
});
});