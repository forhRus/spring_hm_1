import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {

  //region Fields
  @SerializedName("field1")
  private String firstName;
  @SerializedName("field2")
  private String lastName;
  @SerializedName("field3")
  private int age;
  //endregion

  //region Consrtuctors
  public Person() {
  }

  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
  //endregion

  //region Methods
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }

    final Person o = (Person) obj;
    return new EqualsBuilder()
            .append(firstName, o.getFirstName())
            .append(lastName, o.getLastName())
            .append(age, o.getAge())
            .isEquals();
  }


  @Override
  public int hashCode() {
    return new HashCodeBuilder()
            .append(firstName)
            .append(lastName)
            .toHashCode();
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
            .append("firstName", firstName)
            .append("lastName", lastName)
            .append("age", age)
            .toString();
  }
  //endregion

  //region Getters & Setters
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  //endregion


}
