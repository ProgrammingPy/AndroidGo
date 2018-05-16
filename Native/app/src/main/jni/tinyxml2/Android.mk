LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES := tinyxml2.cpp
LOCAL_MODULE := libtinyxml2

#当前文件include头文件
LOCAL_C_INCLUDES := $(LOCAL_PATH)/include

#导出头文件给其它模块使用
LOCAL_EXPORT_C_INCLUDES := $(LOCAL_PATH)/include

include $(BUILD_SHARED_LIBRARY)

