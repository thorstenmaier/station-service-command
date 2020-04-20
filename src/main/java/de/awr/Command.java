package de.awr;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.awr.station.AddStationCommand;
import de.awr.station.DeleteStationCommand;
import de.awr.station.IsStationNameUniqueCommand;
import de.awr.station.ListStationCommand;
import de.awr.station.UpdateStationCommand;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AddStationCommand.class, name = "AddStationCommand"),
    @JsonSubTypes.Type(value = ListStationCommand.class, name = "ListStationCommand"),
    @JsonSubTypes.Type(value = UpdateStationCommand.class, name = "UpdateStationCommand"),
    @JsonSubTypes.Type(value = DeleteStationCommand.class, name = "DeleteStationCommand"),
    @JsonSubTypes.Type(value = IsStationNameUniqueCommand.class, name = "IsStationNameUniqueCommand"),
})
public class Command<R extends Result> {

}
