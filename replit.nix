{ pkgs }: {
    deps = [
        pkgs.openjdk
        pkgs.xorg.libX11
        pkgs.xorg.libXext
        pkgs.xorg.libXrender
        pkgs.xorg.libXtst
        pkgs.xorg.libXi
        pkgs.xorg.libXrandr
        pkgs.xorg.libXfixes
        pkgs.xorg.libXcursor
    ];
}
