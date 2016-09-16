package edu.mum.cs.cs401.model.entity;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.Date;

/**
 * Created by 985333 on 9/14/2016.
 */
public class CheckOutEntry {

    public SimpleObjectProperty<CopyBook> copyBook = new SimpleObjectProperty<>();
    public SimpleObjectProperty<Date> checkoutDate = new SimpleObjectProperty<>();
    public SimpleObjectProperty<Date> dueDate = new SimpleObjectProperty<>();

    public Date getCheckoutDate() {
        return checkoutDate.get();
    }

    public SimpleObjectProperty<Date> checkoutDateProperty() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate.set(checkoutDate);
    }

    public Date getDueDate() {
        return dueDate.get();
    }

    public SimpleObjectProperty<Date> dueDateProperty() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate.set(dueDate);
    }

    public CopyBook getCopyBook() {
        return copyBook.get();
    }

    public void setCopyBook(CopyBook copyBook) {
        this.copyBook.set(copyBook);
    }


}
