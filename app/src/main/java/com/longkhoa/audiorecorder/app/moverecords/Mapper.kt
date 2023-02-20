package com.longkhoa.audiorecorder.app.moverecords

import com.longkhoa.audiorecorder.app.formatRecordInformation
import com.longkhoa.audiorecorder.app.settings.SettingsMapper
import com.longkhoa.audiorecorder.data.database.Record

fun recordToMoveRecordsItem(settingsMapper: SettingsMapper, item: Record): MoveRecordsItem {
	return MoveRecordsItem(
		item.id,
		item.name,
		formatRecordInformation(settingsMapper, item.format, item.sampleRate, item.size)
	)
}

fun recordsToMoveRecordsItems(settingsMapper: SettingsMapper, items: List<Record>): List<MoveRecordsItem> {
	return items.map { recordToMoveRecordsItem(settingsMapper, it) }
}
