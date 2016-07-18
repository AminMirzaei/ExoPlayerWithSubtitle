/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.amin.exopalyer3;

import com.google.android.exoplayer.util.Util;

import java.util.Locale;

/**
 * Holds statically defined sample definitions.
 */
/* package */ class Samples {

  public static class Sample {

    public final String name;
    public final String contentId;
    public final String provider;
    public final String uri;
    public final int type;
    public final String subtitleUri;

    public Sample(String name, String uri, int type,String subtitleUri) {
      this(name, name.toLowerCase(Locale.US).replaceAll("\\s", ""), "", uri, type,subtitleUri);
    }

    public Sample(String name, String contentId, String provider, String uri, int type,String subtitleUri) {
      this.name = name;
      this.contentId = contentId;
      this.provider = provider;
      this.uri = uri;
      this.type = type;
      this.subtitleUri=subtitleUri;
    }

  }
  private static final String WIDEVINE_GTS_MPD =
      "https://storage.googleapis.com/wvmedia/cenc/h264/tears/tears.mpd";
  public static final Sample[] WIDEVINE_GTS = new Sample[] {
    new Sample("WV: HDCP not specified", "d286538032258a1c", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: HDCP not required", "48fcc369939ac96c", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: HDCP required", "e06c39f1151da3df", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure video path required (MP4,H264)", "0894c7c8719b28a0", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure video path required (WebM,VP9)", "0894c7c8719b28a0", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/vp9/tears/tears.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure video path required (MP4,H265)", "0894c7c8719b28a0", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/hevc/tears/tears.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: HDCP + secure video path required", "efd045b1eb61888a", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: 30s license duration (fails at ~30s)", "f9a34cab7b05881a", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
  };

  public static final Sample[] WIDEVINE_HDCP = new Sample[] {
    new Sample("WV: HDCP: None (not required)", "HDCP_None", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: HDCP: 1.0 required", "HDCP_V1", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: HDCP: 2.0 required", "HDCP_V2", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: HDCP: 2.1 required", "HDCP_V2_1", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: HDCP: 2.2 required", "HDCP_V2_2", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: HDCP: No digital output", "HDCP_NO_DIGTAL_OUTPUT", "widevine_test",
        WIDEVINE_GTS_MPD, Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
  };

  public static final Sample[] WIDEVINE_H264_MP4_CLEAR = new Sample[] {
    new Sample("WV: Clear SD & HD (MP4,H264)",
        "https://storage.googleapis.com/wvmedia/clear/h264/tears/tears.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Clear SD (MP4,H264)",
        "https://storage.googleapis.com/wvmedia/clear/h264/tears/tears_sd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Clear HD (MP4,H264)",
        "https://storage.googleapis.com/wvmedia/clear/h264/tears/tears_hd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Clear UHD (MP4,H264)",
        "https://storage.googleapis.com/wvmedia/clear/h264/tears/tears_uhd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
  };

  public static final Sample[] WIDEVINE_H264_MP4_SECURE = new Sample[] {
    new Sample("WV: Secure SD & HD (MP4,H264)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/h264/tears/tears.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure SD (MP4,H264)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/h264/tears/tears_sd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure HD (MP4,H264)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/h264/tears/tears_hd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure UHD (MP4,H264)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/h264/tears/tears_uhd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
  };

  public static final Sample[] WIDEVINE_VP9_WEBM_CLEAR = new Sample[] {
    new Sample("WV: Clear SD & HD (WebM,VP9)",
        "https://storage.googleapis.com/wvmedia/clear/vp9/tears/tears.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Clear SD (WebM,VP9)",
        "https://storage.googleapis.com/wvmedia/clear/vp9/tears/tears_sd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Clear HD (WebM,VP9)",
        "https://storage.googleapis.com/wvmedia/clear/vp9/tears/tears_hd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Clear UHD (WebM,VP9)",
        "https://storage.googleapis.com/wvmedia/clear/vp9/tears/tears_uhd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
  };

  public static final Sample[] WIDEVINE_VP9_WEBM_SECURE = new Sample[] {
    new Sample("WV: Secure SD & HD (WebM,VP9)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/vp9/tears/tears.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure SD (WebM,VP9)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/vp9/tears/tears_sd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure HD (WebM,VP9)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/vp9/tears/tears_hd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure UHD (WebM,VP9)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/vp9/tears/tears_uhd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
  };

  public static final Sample[] WIDEVINE_H265_MP4_CLEAR = new Sample[] {
    new Sample("WV: Clear SD & HD (MP4,H265)",
        "https://storage.googleapis.com/wvmedia/clear/hevc/tears/tears.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Clear SD (MP4,H265)",
        "https://storage.googleapis.com/wvmedia/clear/hevc/tears/tears_sd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Clear HD (MP4,H265)",
        "https://storage.googleapis.com/wvmedia/clear/hevc/tears/tears_hd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Clear UHD (MP4,H265)",
        "https://storage.googleapis.com/wvmedia/clear/hevc/tears/tears_uhd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
  };

  public static final Sample[] WIDEVINE_H265_MP4_SECURE = new Sample[] {
    new Sample("WV: Secure SD & HD (MP4,H265)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/hevc/tears/tears.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure SD (MP4,H265)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/hevc/tears/tears_sd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure HD (MP4,H265)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/hevc/tears/tears_hd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
    new Sample("WV: Secure UHD (MP4,H265)", "", "widevine_test",
        "https://storage.googleapis.com/wvmedia/cenc/hevc/tears/tears_uhd.mpd",
        Util.TYPE_DASH,"http://aminmirzaei.xzn.ir/amin.srt"),
  };




  private Samples() {}

}
