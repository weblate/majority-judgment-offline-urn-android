

## Deep App Links

https://developer.android.com/training/app-links/create-deeplinks

The default QR Code scanner does not support custom URL schemes (eg: `mju://`) since Android 12.

Google decided to be fascist about this because they have not checked their privileges in a while
and they assume that everyone has disposable money to throw away in domain and server renting.

As usual, they hide this imperialism behind a goo of "it's for your own good, mom knows best".

Therefore, we nned to also support App Links using the `https://` scheme.

> Android queries the corresponding websites for the Digital Asset Links file
> at https://hostname/.well-known/assetlinks.json


### assetlinks.json

> https://support.google.com/googleplay/android-developer/answer/16641489?hl=en

See file at https://mju.mieuxvoter.fr/.well-known/assetlinks.json

#### Example contents

```json
[
  {
    "relation": [
      "delegate_permission/common.handle_all_urls"
    ],
    "target": {
      "namespace": "android_app",
      "package_name": "com.illiouchine.jm",
      "sha256_cert_fingerprints": [
        "FC:D2:B7:03:0D:9A:0C:46:DC:C2:0E:0F:5F:C5:D2:E8:C0:29:67:6F:F5:23:1C:DB:C5:B3:86:56:36:6C:61:B2",
        "75:DF:18:56:85:89:C9:64:C9:5F:A2:13:1B:B4:E4:9F:21:8D:4B:DD:0E:3F:D9:D7:35:C0:28:CA:B0:D5:52:3F",
        "73:0E:BE:D1:B5:B5:A9:76:33:93:EA:2B:37:BD:0E:81:DE:3D:EB:3E:84:2A:64:F4:19:3C:CC:4E:5A:CC:11:98"
      ]
    }
  },
  {
    "relation": [
      "delegate_permission/common.handle_all_urls"
    ],
    "target": {
      "namespace": "android_app",
      "package_name": "fr.mieuxvoter.urn",
      "sha256_cert_fingerprints": [
        "FC:D2:B7:03:0D:9A:0C:46:DC:C2:0E:0F:5F:C5:D2:E8:C0:29:67:6F:F5:23:1C:DB:C5:B3:86:56:36:6C:61:B2",
        "75:DF:18:56:85:89:C9:64:C9:5F:A2:13:1B:B4:E4:9F:21:8D:4B:DD:0E:3F:D9:D7:35:C0:28:CA:B0:D5:52:3F",
        "73:0E:BE:D1:B5:B5:A9:76:33:93:EA:2B:37:BD:0E:81:DE:3D:EB:3E:84:2A:64:F4:19:3C:CC:4E:5A:CC:11:98"
      ]
    }
  }
]
```
