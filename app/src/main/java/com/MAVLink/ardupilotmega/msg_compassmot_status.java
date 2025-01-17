/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE COMPASSMOT_STATUS PACKING
package com.MAVLink.ardupilotmega;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * Status of compassmot calibration
 */
public class msg_compassmot_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_COMPASSMOT_STATUS = 177;
    public static final int MAVLINK_MSG_LENGTH = 20;
    private static final long serialVersionUID = MAVLINK_MSG_ID_COMPASSMOT_STATUS;


    /**
     * current (Ampere)
     */
    public float current;

    /**
     * Motor Compensation X
     */
    public float CompensationX;

    /**
     * Motor Compensation Y
     */
    public float CompensationY;

    /**
     * Motor Compensation Z
     */
    public float CompensationZ;

    /**
     * throttle (percent*10)
     */
    public int throttle;

    /**
     * interference (percent)
     */
    public int interference;


    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_compassmot_status() {
        msgid = MAVLINK_MSG_ID_COMPASSMOT_STATUS;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_compassmot_status(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_COMPASSMOT_STATUS;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_COMPASSMOT_STATUS;

        packet.payload.putFloat(current);

        packet.payload.putFloat(CompensationX);

        packet.payload.putFloat(CompensationY);

        packet.payload.putFloat(CompensationZ);

        packet.payload.putUnsignedShort(throttle);

        packet.payload.putUnsignedShort(interference);

        return packet;
    }

    /**
     * Decode a compassmot_status message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.current = payload.getFloat();

        this.CompensationX = payload.getFloat();

        this.CompensationY = payload.getFloat();

        this.CompensationZ = payload.getFloat();

        this.throttle = payload.getUnsignedShort();

        this.interference = payload.getUnsignedShort();

    }

    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_COMPASSMOT_STATUS - sysid:" + sysid + " compid:" + compid + " current:" + current + " CompensationX:" + CompensationX + " CompensationY:" + CompensationY + " CompensationZ:" + CompensationZ + " throttle:" + throttle + " interference:" + interference + "";
    }
}
        