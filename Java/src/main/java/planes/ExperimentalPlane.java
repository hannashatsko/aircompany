package planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

import java.util.Objects;

public class ExperimentalPlane extends Plane {
    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalTypes getType() {
        return type;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ExperimentalPlane)) return false;
        if (!super.equals(object)) return false;
        ExperimentalPlane plane = (ExperimentalPlane) object;
        return type == plane.getType() && classificationLevel == plane.getClassificationLevel();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, classificationLevel);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + type + ", classificationLevel=" + classificationLevel +
                        '}');
    }
}