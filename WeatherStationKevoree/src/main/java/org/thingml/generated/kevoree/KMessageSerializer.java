/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated.kevoree;
import org.thingml.generated.*;
import org.kevoree.annotation.*;
import org.thingml.java.*;
import org.thingml.java.ext.*;


@ComponentType
 @Library(name = "ThingML")
 public class KMessageSerializer extends MessageSerializer{//The Kevoree wrapper extends the associated ThingML component
//Attributes
@Param (defaultValue = "3")
private int PacketManager_CODE_POSITION__var = 3;
@Param (defaultValue = "4")
private int PacketManager_LENGTH_POSITION__var = 4;
@Param (defaultValue = "5")
private int PacketManager_DATA_POSITION__var = 5;
@Param (defaultValue = "0")
private int PacketManager_index__var = 0;
//Getters and Setters for non readonly/final attributes
@Override
public int getPacketManager_CODE_POSITION__var() {
return PacketManager_CODE_POSITION__var;
}

@Override
public void setPacketManager_CODE_POSITION__var(int PacketManager_CODE_POSITION__var) {
this.PacketManager_CODE_POSITION__var = PacketManager_CODE_POSITION__var;
}

@Override
public int getPacketManager_LENGTH_POSITION__var() {
return PacketManager_LENGTH_POSITION__var;
}

@Override
public void setPacketManager_LENGTH_POSITION__var(int PacketManager_LENGTH_POSITION__var) {
this.PacketManager_LENGTH_POSITION__var = PacketManager_LENGTH_POSITION__var;
}

@Override
public int getPacketManager_DATA_POSITION__var() {
return PacketManager_DATA_POSITION__var;
}

@Override
public void setPacketManager_DATA_POSITION__var(int PacketManager_DATA_POSITION__var) {
this.PacketManager_DATA_POSITION__var = PacketManager_DATA_POSITION__var;
}

@Override
public int getPacketManager_index__var() {
return PacketManager_index__var;
}

@Override
public void setPacketManager_index__var(int PacketManager_index__var) {
this.PacketManager_index__var = PacketManager_index__var;
}

@Output
private org.kevoree.api.Port outPort_out;
//Empty Constructor
public KMessageSerializer() {
super();//binding internal connectors we do not want to expose to Kevoree
}

//Constructor (all attributes)
public KMessageSerializer(String name, final byte PacketManager_lengthInteger__var, final byte PacketManager_lengthString__var, final byte PacketManager_lengthUInt16__var, final short PacketManager_MAX_PACKET_SIZE__var, final byte PacketManager_START_BYTE__var, final byte PacketManager_STOP_BYTE__var, final byte PacketManager_ESCAPE_BYTE__var, final int PacketManager_CODE_POSITION__var, final int PacketManager_LENGTH_POSITION__var, final int PacketManager_DATA_POSITION__var, final byte[] PacketManager_buffer__var, final int PacketManager_index__var) {
super(name, PacketManager_lengthInteger__var, PacketManager_lengthString__var, PacketManager_lengthUInt16__var, PacketManager_MAX_PACKET_SIZE__var, PacketManager_START_BYTE__var, PacketManager_STOP_BYTE__var, PacketManager_ESCAPE_BYTE__var, PacketManager_CODE_POSITION__var, PacketManager_LENGTH_POSITION__var, PacketManager_DATA_POSITION__var, PacketManager_buffer__var, PacketManager_index__var);
}

@Override
public void start() {
queue = new java.util.concurrent.ArrayBlockingQueue<Event>(1024);
super.start();
}

@Override
public void stop() {
super.stop();
queue = null;
}

@Override
public void receive(Event event, Port p) {
if (queue != null) {
super.receive(event, p);
}
}

@Start
public void startComponent() {
if (behavior == null){
buildBehavior();
}
start();
}

@Stop
public void stopComponent() {stop();
}

@Override
public void send(Event e, Port p) {
if (p.getName().equals("out")) {
outPort_out.send(e);
}
else {//Internal channel managed by ThingML
super.send(e, p);
}
}

@Input
public void RemoteControlPort(Object o) {
receive((Event)o, getRemoteControl_port());
}

}

