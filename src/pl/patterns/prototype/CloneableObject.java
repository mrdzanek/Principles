/* Pattern used for creating new objects by copyting prototypical instance. */
package pl.patterns.prototype;

class CloneableObject implements Cloneable{
    private String name;

    public CloneableObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public CloneableObject clone() throws CloneNotSupportedException {
        return new CloneableObject(name);
    }
}
