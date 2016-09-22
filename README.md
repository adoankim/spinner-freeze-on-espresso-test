Espresso Test Spinner freeze (Appcompat-v7 24.2.0) on Kitkat and Lollipop devices
=================================================================================

This project show the behaviour of Espresso test in Activities with:

 - CoordinatorLayout
 - AppBarLayout with Toolbar
 - NestedScrollView
 - Spinner

When the Spinner drops down, the tests pass.
When the Spinner drops up, the tests fail ([it freeze](https://raw.githubusercontent.com/adoankim/spinner-freeze-on-espresso-test/master/stack_trace.log)).

*update* it seems to work on >= Marsmallow devices

Activities and layouts are the same, just adding a margin to the spinner to force drop up.

