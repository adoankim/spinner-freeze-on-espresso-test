Espresso Test Spinner freeze (Appcompat-v7 24.2.0)
================================================

This project show the behaviour of Espresso test in Activities with:

 - CoordinatorLayout
 - AppBarLayout with Toolbar
 - NestedScrollView
 - Spinner

When the Spinner drops down, the tests pass.
When the Spinner drops up, the tests fail (it freeze).

Activities and layouts are the same, just adding a margin to the spinner to force drop up.
