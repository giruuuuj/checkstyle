/*
FinalClass


*/

package com.puppycrawl.tools.checkstyle.checks.design.finalclass;

// Compact source file with multiple classes
class FirstClass // violation 'Class FirstClass should be declared as final'
{
    private FirstClass() {}
}

class SecondClass // violation 'Class SecondClass should be declared as final'
{
    private SecondClass() {}
}

class ThirdClass {
    public ThirdClass() {}
}
