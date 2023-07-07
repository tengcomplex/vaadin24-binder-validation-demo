package com.example.application.views.validation;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Validation Demo")
@Route(value = "")
public class ValidationView extends VerticalLayout {

  private TextField name;
  private TextField address;
  private Person person;
  private BeanValidationBinder<Person> binder;

  public ValidationView() {
    add(new H1("Vaadin 24 Validation Demo"));
    name = new TextField("Name");
    address = new TextField("Address");
    person = new Person();
    binder = new BeanValidationBinder<>(Person.class);
    binder.setBean(person);
    binder.bindInstanceFields(this);
    add(name, address);
  }
}
