package Lesson_29.InterfaceSegregation.Example_3.Methods_2;

import Lesson_29.InterfaceSegregation.Example_3.Methods.DateMethod;
import Lesson_29.InterfaceSegregation.Example_3.Methods.PrintMethod;
import Lesson_29.InterfaceSegregation.Example_3.Methods.SearchMethod;

public interface Monitor extends DateMethod, PrintMethod, SearchMethod {
}
