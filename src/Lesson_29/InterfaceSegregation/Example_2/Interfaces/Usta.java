package Lesson_29.InterfaceSegregation.Example_2.Interfaces;

import Lesson_29.InterfaceSegregation.Example_2.Methods.Eats;
import Lesson_29.InterfaceSegregation.Example_2.Methods.Money;
import Lesson_29.InterfaceSegregation.Example_2.Methods.Tinchlik;

public interface Usta extends Master, Money, Eats, Tinchlik {
}
