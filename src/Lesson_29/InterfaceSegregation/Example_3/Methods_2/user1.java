package Lesson_29.InterfaceSegregation.Example_3.Methods_2;

import Lesson_29.InterfaceSegregation.Example_3.Methods.LogInMethod;
import Lesson_29.InterfaceSegregation.Example_3.Methods.RegistrationMethod;
import Lesson_29.InterfaceSegregation.Example_3.Methods.SignInMethod;

public interface user1 extends LogInMethod, SignInMethod, RegistrationMethod {
}
