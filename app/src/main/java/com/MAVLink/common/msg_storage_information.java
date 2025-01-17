/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE STORAGE_INFORMATION PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * WIP: Information about a storage medium.
 */
public class msg_storage_information extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_STORAGE_INFORMATION = 261;
    public static final int MAVLINK_MSG_LENGTH = 27;
    private static final long serialVersionUID = MAVLINK_MSG_ID_STORAGE_INFORMATION;


    /**
     * Timestamp (milliseconds since system boot)
     */
    public long time_boot_ms;

    /**
     * Total capacity in MiB
     */
    public float total_capacity;

    /**
     * Used capacity in MiB
     */
    public float used_capacity;

    /**
     * Available capacity in MiB
     */
    public float available_capacity;

    /**
     * Read speed in MiB/s
     */
    public float read_speed;

    /**
     * Write speed in MiB/s
     */
    public float write_speed;

    /**
     * Storage ID (1 for first, 2 for second, etc.)
     */
    public short storage_id;

    /**
     * Number of storage devices
     */
    public short storage_count;

    /**
     * Status of storage (0 not available, 1 unformatted, 2 formatted)
     */
    public short status;


    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_storage_information() {
        msgid = MAVLINK_MSG_ID_STORAGE_INFORMATION;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_storage_information(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_STORAGE_INFORMATION;
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
        packet.msgid = MAVLINK_MSG_ID_STORAGE_INFORMATION;

        packet.payload.putUnsignedInt(time_boot_ms);

        packet.payload.putFloat(total_capacity);

        packet.payload.putFloat(used_capacity);

        packet.payload.putFloat(available_capacity);

        packet.payload.putFloat(read_speed);

        packet.payload.putFloat(write_speed);

        packet.payload.putUnsignedByte(storage_id);

        packet.payload.putUnsignedByte(storage_count);

        packet.payload.putUnsignedByte(status);

        return packet;
    }

    /**
     * Decode a storage_information message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();

        this.total_capacity = payload.getFloat();

        this.used_capacity = payload.getFloat();

        this.available_capacity = payload.getFloat();

        this.read_speed = payload.getFloat();

        this.write_speed = payload.getFloat();

        this.storage_id = payload.getUnsignedByte();

        this.storage_count = payload.getUnsignedByte();

        this.status = payload.getUnsignedByte();

    }

    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_STORAGE_INFORMATION - sysid:" + sysid + " compid:" + compid + " time_boot_ms:" + time_boot_ms + " total_capacity:" + total_capacity + " used_capacity:" + used_capacity + " available_capacity:" + available_capacity + " read_speed:" + read_speed + " write_speed:" + write_speed + " storage_id:" + storage_id + " storage_count:" + storage_count + " status:" + status + "";
    }
}
        