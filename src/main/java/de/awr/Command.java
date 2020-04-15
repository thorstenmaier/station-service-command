package de.awr;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import de.awr.station.AddStationCommand;
import de.awr.station.ListStationCommand;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AddStationCommand.class, name = "AddStationCommand"),
    @JsonSubTypes.Type(value = ListStationCommand.class, name = "ListStationCommand"),
})
public class Command<R extends Result> {

}
