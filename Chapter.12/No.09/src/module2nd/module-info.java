module module2nd {
    // requires module3rd;
    requires transitive module3rd;

    exports app;
}