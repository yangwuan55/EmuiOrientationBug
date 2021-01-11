# EmuiOrientationBug
旋转屏幕的bug:
当调用 ```Resources.getSystem()``` 时会出现几次反转屏幕后无法正确获取窗口方向的问题，但是调用```context.getResources()```没有问题。
