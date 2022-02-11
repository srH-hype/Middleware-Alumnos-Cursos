package BussinessObject;

import java.util.Objects;

/**
 * @author orlandocamacho
 */
public class Course {
    
    private String name;
    private String id;
    private int semester;
    private int hours;
    private double points;

    /**
     * Course class constructor
     * @param name Course name
     * @param id Course id
     * @param semester Course semestre
     * @param hours Course hours
     * @param points Course points
     */
    public Course(String name, String id, int semester, int hours, double points) {
        this.name = name;
        this.id = id;
        this.hours = hours;
        this.semester = semester;
        this.points = points;
    }

    /**
     * Get the name of the course
     * @return Course name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the course
     * @param name Course name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the id of the course
     * @return Course id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the id of the course
     * @param id Course id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get the semester of the course
     * @return Course semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * Set the semester of the course
     * @param semester Course semester
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     * Get the hours of the course
     * @return Course hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * Set the hours of the course
     * @param hours Course hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Get the points of the course
     * @return Course points
     */
    public double getPoints() {
        return points;
    }

    /**
     * Set the ponts of the course
     * @param points Course points
     */
    public void setPoints(double points) {
        this.points = points;
    }

    /**
     * Hash method
     * @return hash code of the course object
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     * Check equality between 2 objects of the same type
     * @param obj object to compare
     * @return True if they are equals, false in the opposite case
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     * String of the course attributes
     * @return String
     */
    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", id=" + id + ", semester=" + semester + ", hours=" + hours + ", points=" + points + '}';
    }
}
