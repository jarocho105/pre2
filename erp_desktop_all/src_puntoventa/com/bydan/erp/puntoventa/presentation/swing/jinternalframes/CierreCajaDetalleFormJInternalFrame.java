/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.CierreCajaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class CierreCajaDetalleFormJInternalFrame extends CierreCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCierreCaja;
	
	protected JMenuBar jmenuBarDetalleCierreCaja;
	
	protected JMenu jmenuDetalleCierreCaja;
	protected JMenu jmenuDetalleArchivoCierreCaja;
	protected JMenu jmenuDetalleAccionesCierreCaja;
	protected JMenu jmenuDetalleDatosCierreCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCierreCaja;	
	protected GridBagConstraints gridBagConstraintsCierreCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CierreCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleCierreCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";
	
	public CierreCajaSessionBean cierrecajaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;	
	
	public CierreCajaLogic cierrecajaLogic;
	
	public JScrollPane jScrollPanelDatosCierreCaja;
	public JScrollPane jScrollPanelDatosEdicionCierreCaja;
	public JScrollPane jScrollPanelDatosGeneralCierreCaja;
	
	protected JPanel jPanelCamposCierreCaja;    
	protected JPanel jPanelCamposOcultosCierreCaja;    	
	protected JPanel jPanelAccionesCierreCaja;
	protected JPanel jPanelAccionesFormularioCierreCaja;
    
	
	
	protected Integer iXPanelCamposCierreCaja=0;
	protected Integer iYPanelCamposCierreCaja=0;
	
	protected Integer iXPanelCamposOcultosCierreCaja=0;
	protected Integer iYPanelCamposOcultosCierreCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCierreCaja;
	public JButton jButtonModificarCierreCaja;
	public JButton jButtonActualizarCierreCaja;
    public JButton jButtonEliminarCierreCaja;
	public JButton jButtonCancelarCierreCaja;
    public JButton jButtonGuardarCambiosCierreCaja;
	public JButton jButtonGuardarCambiosTablaCierreCaja;
	protected JButton jButtonCerrarCierreCaja;
	
	
	protected JButton jButtonProcesarInformacionCierreCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCierreCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCierreCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCierreCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCierreCaja;
	protected JButton jButtonModificarToolBarCierreCaja;
	protected JButton jButtonActualizarToolBarCierreCaja;
    protected JButton jButtonEliminarToolBarCierreCaja;
	protected JButton jButtonCancelarToolBarCierreCaja;
    protected JButton jButtonGuardarCambiosToolBarCierreCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarCierreCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarCierreCaja;
	protected JButton jButtonCerrarToolBarCierreCaja;
	
	protected JButton jButtonProcesarInformacionToolBarCierreCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCierreCaja;
	protected JMenuItem jMenuItemModificarCierreCaja;
	protected JMenuItem jMenuItemActualizarCierreCaja;
    protected JMenuItem jMenuItemEliminarCierreCaja;
	protected JMenuItem jMenuItemCancelarCierreCaja;
    protected JMenuItem jMenuItemGuardarCambiosCierreCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaCierreCaja;
	protected JMenuItem jMenuItemCerrarCierreCaja;
	protected JMenuItem jMenuItemDetalleCerrarCierreCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarCierreCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionCierreCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCierreCaja;
	protected JMenuItem jMenuItemMostrarOcultarCierreCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCierreCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCierreCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCierreCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCierreCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCierreCaja;
	public JLabel jLabelIdCierreCaja;
	public JLabel jLabelidCierreCaja;
	public JButton jButtonidCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelfechaCierreCaja;
	public JLabel jLabelfechaCierreCaja;
	//public JFormattedTextField jDateChooserfechaCierreCaja;

	public JDateChooser jDateChooserfechaCierreCaja;
	public JButton jButtonfechaCierreCajaBusqueda= new JButtonMe();

	public JPanel jPaneltotalCierreCaja;
	public JLabel jLabeltotalCierreCaja;
	public JTextField jTextFieldtotalCierreCaja;
	public JButton jButtontotalCierreCajaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_diferenciaCierreCaja;
	public JLabel jLabeltotal_diferenciaCierreCaja;
	public JTextField jTextFieldtotal_diferenciaCierreCaja;
	public JButton jButtontotal_diferenciaCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoCierreCaja;
	public JLabel jLabelesta_activoCierreCaja;
	public JCheckBox jCheckBoxesta_activoCierreCaja;
	public JButton jButtonesta_activoCierreCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCierreCaja;
	public JLabel jLabelid_empresaCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCierreCaja;
	public JButton jButtonid_empresaCierreCaja= new JButtonMe();
	public JButton jButtonid_empresaCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCierreCaja;
	public JLabel jLabelid_sucursalCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCierreCaja;
	public JButton jButtonid_sucursalCierreCaja= new JButtonMe();
	public JButton jButtonid_sucursalCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioCierreCaja;
	public JLabel jLabelid_usuarioCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioCierreCaja;
	public JButton jButtonid_usuarioCierreCaja= new JButtonMe();
	public JButton jButtonid_usuarioCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioCierreCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoCierreCaja;
	public JLabel jLabelid_tipo_forma_pagoCierreCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoCierreCaja;
	public JButton jButtonid_tipo_forma_pagoCierreCaja= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoCierreCajaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoCierreCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCierreCaja;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CierreCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCierreCaja=new JPanel();
				this.jPanelAccionesFormularioCierreCaja=new JPanel();
				this.jmenuBarDetalleCierreCaja=new JMenuBar();
				this.jTtoolBarDetalleCierreCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CierreCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CierreCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CierreCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarCierreCaja() {
		return this.jButtonActualizarToolBarCierreCaja;
	}
	
	public JButton getjButtonEliminarToolBarCierreCaja() {
		return this.jButtonEliminarToolBarCierreCaja;
	}
	
	public JButton getjButtonCancelarToolBarCierreCaja() {
		return this.jButtonCancelarToolBarCierreCaja;
	}		
	
	public JButton getjButtonProcesarInformacionCierreCaja() {
		return this.jButtonProcesarInformacionCierreCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCierreCaja)	{
		this.jButtonProcesarInformacionCierreCaja = jButtonProcesarInformacionCierreCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCierreCaja() {
		return this.jComboBoxTiposAccionesCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCierreCaja(
			JComboBox jComboBoxTiposRelacionesCierreCaja) {
		this.jComboBoxTiposRelacionesCierreCaja = jComboBoxTiposRelacionesCierreCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCierreCaja(
			JComboBox jComboBoxTiposAccionesCierreCaja) {
		this.jComboBoxTiposAccionesCierreCaja = jComboBoxTiposAccionesCierreCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCierreCaja() {
		return this.jComboBoxTiposAccionesFormularioCierreCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCierreCaja(
			JComboBox jComboBoxTiposAccionesFormularioCierreCaja) {
		this.jComboBoxTiposAccionesFormularioCierreCaja = jComboBoxTiposAccionesFormularioCierreCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cierrecajaSessionBean=new CierreCajaSessionBean();
		
		this.cierrecajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cierrecajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cierrecajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CierreCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CierreCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cierre Caja MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		CierreCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCierreCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCierreCaja=new JButtonMe();
				this.jButtonModificarToolBarCierreCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCierreCaja,this.jTtoolBarDetalleCierreCaja,
							"actualizar","actualizar","Actualizar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCierreCaja,this.jTtoolBarDetalleCierreCaja,
							"eliminar","eliminar","Eliminar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCierreCaja,this.jTtoolBarDetalleCierreCaja,
							"cancelar","cancelar","Cancelar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCierreCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCierreCaja,this.jTtoolBarDetalleCierreCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCierreCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCierreCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCierreCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCierreCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCierreCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCierreCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCierreCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCierreCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCierreCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCierreCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCierreCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCierreCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCierreCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCierreCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCierreCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCierreCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCierreCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCierreCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCierreCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCierreCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCierreCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCierreCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCierreCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCierreCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCierreCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCierreCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCierreCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCierreCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCierreCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCierreCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCierreCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCierreCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCierreCaja.add(this.jMenuItemDetalleCerrarCierreCaja);
		
		this.jmenuDetalleAccionesCierreCaja.add(this.jMenuItemActualizarCierreCaja);
		this.jmenuDetalleAccionesCierreCaja.add(this.jMenuItemEliminarCierreCaja);
		this.jmenuDetalleAccionesCierreCaja.add(this.jMenuItemCancelarCierreCaja);		
		
		//this.jmenuDetalleDatosCierreCaja.add(this.jMenuItemDetalleAbrirOrderByCierreCaja);				
		this.jmenuDetalleDatosCierreCaja.add(this.jMenuItemDetalleMostarOcultarCierreCaja);				
				
		//this.jmenuDetalleAccionesCierreCaja.add(this.jMenuItemGuardarCambiosCierreCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCierreCaja.add(this.jmenuDetalleArchivoCierreCaja);		
		this.jmenuBarDetalleCierreCaja.add(this.jmenuDetalleAccionesCierreCaja);		
		this.jmenuBarDetalleCierreCaja.add(this.jmenuDetalleDatosCierreCaja);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCierreCaja);				
	}
	
	
	public void inicializarElementosCamposCierreCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCierreCaja = new JLabelMe();
		jLabelIdCierreCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCierreCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCierreCaja.setToolTipText(CierreCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCierreCaja= new GridBagLayout();

		this.jPanelidCierreCaja.setLayout(this.gridaBagLayoutCierreCaja);

		jLabelidCierreCaja = new JLabel();
		jLabelidCierreCaja.setText("Id");

		jLabelidCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaCierreCaja = new JLabelMe();
		this.jLabelfechaCierreCaja.setText(""+CierreCajaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaCierreCaja.setToolTipText("Fecha");
		this.jLabelfechaCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaCierreCaja.setToolTipText(CierreCajaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutCierreCaja = new GridBagLayout();
		this.jPanelfechaCierreCaja.setLayout(this.gridaBagLayoutCierreCaja);


		//jFormattedTextFieldfechaCierreCaja= new JFormattedTextFieldMe();

		jDateChooserfechaCierreCaja= new JDateChooser();
		jDateChooserfechaCierreCaja.setEnabled(false);
		jDateChooserfechaCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaCierreCaja.setDate(new Date());
		jDateChooserfechaCierreCaja.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaCierreCaja.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaCierreCajaBusqueda= new JButtonMe();
		this.jButtonfechaCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaCierreCajaBusqueda.setText("U");
		this.jButtonfechaCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaCierreCajaBusqueda"));

		if(this.cierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaCierreCajaBusqueda.setVisible(false);		}


					
		this.jLabeltotalCierreCaja = new JLabelMe();
		this.jLabeltotalCierreCaja.setText(""+CierreCajaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalCierreCaja.setToolTipText("Total");
		this.jLabeltotalCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalCierreCaja.setToolTipText(CierreCajaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutCierreCaja = new GridBagLayout();
		this.jPaneltotalCierreCaja.setLayout(this.gridaBagLayoutCierreCaja);


		jTextFieldtotalCierreCaja= new JTextFieldMe();
		jTextFieldtotalCierreCaja.setEnabled(false);
		jTextFieldtotalCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalCierreCaja.setText("0.0");

		this.jButtontotalCierreCajaBusqueda= new JButtonMe();
		this.jButtontotalCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalCierreCajaBusqueda.setText("U");
		this.jButtontotalCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalCierreCajaBusqueda"));

		if(this.cierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalCierreCajaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_diferenciaCierreCaja = new JLabelMe();
		this.jLabeltotal_diferenciaCierreCaja.setText(""+CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA+" : *");
		this.jLabeltotal_diferenciaCierreCaja.setToolTipText("Total Diferencia");
		this.jLabeltotal_diferenciaCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_diferenciaCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_diferenciaCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_diferenciaCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_diferenciaCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_diferenciaCierreCaja.setToolTipText(CierreCajaConstantesFunciones.LABEL_TOTALDIFERENCIA);
		this.gridaBagLayoutCierreCaja = new GridBagLayout();
		this.jPaneltotal_diferenciaCierreCaja.setLayout(this.gridaBagLayoutCierreCaja);


		jTextFieldtotal_diferenciaCierreCaja= new JTextFieldMe();
		jTextFieldtotal_diferenciaCierreCaja.setEnabled(false);
		jTextFieldtotal_diferenciaCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_diferenciaCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_diferenciaCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_diferenciaCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_diferenciaCierreCaja.setText("0.0");

		this.jButtontotal_diferenciaCierreCajaBusqueda= new JButtonMe();
		this.jButtontotal_diferenciaCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_diferenciaCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_diferenciaCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_diferenciaCierreCajaBusqueda.setText("U");
		this.jButtontotal_diferenciaCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_diferenciaCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_diferenciaCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_diferenciaCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_diferenciaCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_diferenciaCierreCajaBusqueda"));

		if(this.cierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_diferenciaCierreCajaBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoCierreCaja = new JLabelMe();
		this.jLabelesta_activoCierreCaja.setText(""+CierreCajaConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoCierreCaja.setToolTipText("Esta Activo");
		this.jLabelesta_activoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoCierreCaja.setToolTipText(CierreCajaConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutCierreCaja = new GridBagLayout();
		this.jPanelesta_activoCierreCaja.setLayout(this.gridaBagLayoutCierreCaja);


		jCheckBoxesta_activoCierreCaja= new JCheckBoxMe();
		jCheckBoxesta_activoCierreCaja.setEnabled(false);

		jCheckBoxesta_activoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoCierreCajaBusqueda= new JButtonMe();
		this.jButtonesta_activoCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoCierreCajaBusqueda.setText("U");
		this.jButtonesta_activoCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoCierreCajaBusqueda"));

		if(this.cierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoCierreCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCierreCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCierreCaja = new JLabelMe();
		this.jLabelid_empresaCierreCaja.setText(""+CierreCajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCierreCaja.setToolTipText("Empresa");
		this.jLabelid_empresaCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCierreCaja.setToolTipText(CierreCajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCierreCaja = new GridBagLayout();
		this.jPanelid_empresaCierreCaja.setLayout(this.gridaBagLayoutCierreCaja);


		jComboBoxid_empresaCierreCaja= new JComboBoxMe();
		jComboBoxid_empresaCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCierreCaja.setEnabled(false);

		this.jButtonid_empresaCierreCaja= new JButtonMe();
		this.jButtonid_empresaCierreCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCierreCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCierreCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCierreCaja.setText("Buscar");
		this.jButtonid_empresaCierreCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCierreCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCierreCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCierreCaja"));

		this.jButtonid_empresaCierreCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCierreCajaBusqueda.setText("U");
		this.jButtonid_empresaCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCierreCajaBusqueda"));

		if(this.cierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCierreCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaCierreCajaUpdate= new JButtonMe();
		this.jButtonid_empresaCierreCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCierreCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCierreCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCierreCajaUpdate.setText("U");
		this.jButtonid_empresaCierreCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCierreCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCierreCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCierreCajaUpdate"));



					
		this.jLabelid_sucursalCierreCaja = new JLabelMe();
		this.jLabelid_sucursalCierreCaja.setText(""+CierreCajaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCierreCaja.setToolTipText("Sucursal");
		this.jLabelid_sucursalCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCierreCaja.setToolTipText(CierreCajaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCierreCaja = new GridBagLayout();
		this.jPanelid_sucursalCierreCaja.setLayout(this.gridaBagLayoutCierreCaja);


		jComboBoxid_sucursalCierreCaja= new JComboBoxMe();
		jComboBoxid_sucursalCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCierreCaja.setEnabled(false);

		this.jButtonid_sucursalCierreCaja= new JButtonMe();
		this.jButtonid_sucursalCierreCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCierreCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCierreCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCierreCaja.setText("Buscar");
		this.jButtonid_sucursalCierreCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCierreCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCierreCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCierreCaja"));

		this.jButtonid_sucursalCierreCajaBusqueda= new JButtonMe();
		this.jButtonid_sucursalCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCierreCajaBusqueda.setText("U");
		this.jButtonid_sucursalCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCierreCajaBusqueda"));

		if(this.cierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCierreCajaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCierreCajaUpdate= new JButtonMe();
		this.jButtonid_sucursalCierreCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCierreCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCierreCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCierreCajaUpdate.setText("U");
		this.jButtonid_sucursalCierreCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCierreCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCierreCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCierreCajaUpdate"));



					
		this.jLabelid_usuarioCierreCaja = new JLabelMe();
		this.jLabelid_usuarioCierreCaja.setText(""+CierreCajaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioCierreCaja.setToolTipText("Usuario");
		this.jLabelid_usuarioCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioCierreCaja.setToolTipText(CierreCajaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutCierreCaja = new GridBagLayout();
		this.jPanelid_usuarioCierreCaja.setLayout(this.gridaBagLayoutCierreCaja);


		jComboBoxid_usuarioCierreCaja= new JComboBoxMe();
		jComboBoxid_usuarioCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioCierreCaja.setEnabled(false);

		this.jButtonid_usuarioCierreCaja= new JButtonMe();
		this.jButtonid_usuarioCierreCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCierreCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCierreCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCierreCaja.setText("Buscar");
		this.jButtonid_usuarioCierreCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioCierreCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCierreCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCierreCaja"));

		this.jButtonid_usuarioCierreCajaBusqueda= new JButtonMe();
		this.jButtonid_usuarioCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCierreCajaBusqueda.setText("U");
		this.jButtonid_usuarioCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCierreCajaBusqueda"));

		if(this.cierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioCierreCajaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioCierreCajaUpdate= new JButtonMe();
		this.jButtonid_usuarioCierreCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCierreCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCierreCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCierreCajaUpdate.setText("U");
		this.jButtonid_usuarioCierreCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioCierreCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCierreCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCierreCajaUpdate"));



					
		this.jLabelid_tipo_forma_pagoCierreCaja = new JLabelMe();
		this.jLabelid_tipo_forma_pagoCierreCaja.setText(""+CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoCierreCaja.setToolTipText("Tipo Forma Pago");
		this.jLabelid_tipo_forma_pagoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoCierreCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoCierreCaja.setToolTipText(CierreCajaConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutCierreCaja = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoCierreCaja.setLayout(this.gridaBagLayoutCierreCaja);


		jComboBoxid_tipo_forma_pagoCierreCaja= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoCierreCaja= new JButtonMe();
		this.jButtonid_tipo_forma_pagoCierreCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoCierreCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoCierreCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoCierreCaja.setText("Buscar");
		this.jButtonid_tipo_forma_pagoCierreCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoCierreCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoCierreCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoCierreCaja"));

		this.jButtonid_tipo_forma_pagoCierreCajaBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoCierreCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoCierreCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoCierreCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoCierreCajaBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoCierreCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoCierreCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoCierreCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoCierreCajaBusqueda"));

		if(this.cierrecajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoCierreCajaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoCierreCajaUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoCierreCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoCierreCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoCierreCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoCierreCajaUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoCierreCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoCierreCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoCierreCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoCierreCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoCierreCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoCierreCajaUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleCierreCaja = new CierreCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cierre Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCierreCaja= new GridBagLayout();
		

		
		String sToolTipCierreCaja="";
		sToolTipCierreCaja=CierreCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCierreCaja+="(PuntoVenta.CierreCaja)";
		}
		
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCierreCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCierreCaja = new JButtonMe();
		this.jButtonModificarCierreCaja = new JButtonMe();
        this.jButtonActualizarCierreCaja = new JButtonMe();
        this.jButtonEliminarCierreCaja = new JButtonMe();
        this.jButtonCancelarCierreCaja = new JButtonMe();
        this.jButtonGuardarCambiosCierreCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaCierreCaja = new JButtonMe();
		this.jButtonCerrarCierreCaja = new JButtonMe();
		
		this.jScrollPanelDatosCierreCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionCierreCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralCierreCaja = new JScrollPane();
				
		
		
		this.jPanelCamposCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cierre Caja";
		
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cierre Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosCierreCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCierreCaja.setName("jPanelCamposCierreCaja"); 

		this.jPanelCamposOcultosCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCierreCaja.setName("jPanelCamposOcultosCierreCaja"); 

        this.jPanelAccionesCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCierreCaja.setToolTipText("Acciones");
        this.jPanelAccionesCierreCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCierreCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCierreCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCierreCaja.setText("Nuevo");
		this.jButtonModificarCierreCaja.setText("Editar");
        this.jButtonActualizarCierreCaja.setText("Actualizar");
        this.jButtonEliminarCierreCaja.setText("Eliminar");
        this.jButtonCancelarCierreCaja.setText("Cancelar");
        this.jButtonGuardarCambiosCierreCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaCierreCaja.setText("Guardar");
		this.jButtonCerrarCierreCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCierreCaja,"nuevo_button","Nuevo",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCierreCaja,"modificar_button","Editar",this.cierrecajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCierreCaja,"actualizar_button","Actualizar",this.cierrecajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCierreCaja,"eliminar_button","Eliminar",this.cierrecajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCierreCaja,"cancelar_button","Cancelar",this.cierrecajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCierreCaja,"guardarcambios_button","Guardar",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCierreCaja,"guardarcambiostabla_button","Guardar",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCierreCaja,"cerrar_button","Salir",this.cierrecajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCierreCaja.setToolTipText("Nuevo"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCierreCaja.setToolTipText("Editar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCierreCaja.setToolTipText("Actualizar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCierreCaja.setToolTipText("Eliminar)"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCierreCaja.setToolTipText("Cancelar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCierreCaja.setToolTipText("Guardar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCierreCaja.setToolTipText("Guardar"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCierreCaja.setToolTipText("Salir"+" "+CierreCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoCierreCaja";
		inputMap = this.jButtonNuevoCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCierreCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCierreCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCierreCaja";
		inputMap = this.jButtonActualizarCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCierreCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarCierreCaja";
		inputMap = this.jButtonEliminarCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCierreCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarCierreCaja";
		inputMap = this.jButtonCancelarCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCierreCaja"));
		
		//CERRAR		
		sMapKey = "CerrarCierreCaja";
		inputMap = this.jButtonCerrarCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCierreCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCierreCaja";
		inputMap = this.jButtonGuardarCambiosTablaCierreCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCierreCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCierreCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCierreCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCierreCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCierreCaja.setToolTipText("Nuevo CierreCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCierreCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCierreCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCierreCaja.setToolTipText("Sin Cerrar Ventana CierreCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCierreCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCierreCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCierreCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCierreCaja.setText("Accion");
		this.jComboBoxTiposAccionesCierreCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCierreCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCierreCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCierreCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCierreCaja = new JLabelMe();
		
		this.jLabelAccionesCierreCaja.setText("Acciones");		
		this.jLabelAccionesCierreCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCierreCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCierreCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCierreCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCierreCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCierreCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesCierreCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCierreCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCierreCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCierreCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCierreCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCierreCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCierreCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCierreCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCierreCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCierreCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCierreCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCierreCaja = new GridBagLayout();
		
		this.jPanelCamposCierreCaja.setLayout(gridaBagLayoutCamposCierreCaja);
		this.jPanelCamposOcultosCierreCaja.setLayout(gridaBagLayoutCamposOcultosCierreCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 0;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCierreCaja.add(jLabelIdCierreCaja, this.gridBagConstraintsCierreCaja);



	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 1;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCierreCaja.add(jLabelidCierreCaja, this.gridBagConstraintsCierreCaja);


	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 0;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCierreCaja.add(jLabelid_empresaCierreCaja, this.gridBagConstraintsCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 2;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCierreCaja.add(jButtonid_empresaCierreCajaBusqueda, this.gridBagConstraintsCierreCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 3;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCierreCaja.add(jButtonid_empresaCierreCajaUpdate, this.gridBagConstraintsCierreCaja);
	}

	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 1;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCierreCaja.add(jComboBoxid_empresaCierreCaja, this.gridBagConstraintsCierreCaja);


	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 0;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCierreCaja.add(jLabelid_sucursalCierreCaja, this.gridBagConstraintsCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 2;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCierreCaja.add(jButtonid_sucursalCierreCajaBusqueda, this.gridBagConstraintsCierreCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 3;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCierreCaja.add(jButtonid_sucursalCierreCajaUpdate, this.gridBagConstraintsCierreCaja);
	}

	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 1;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCierreCaja.add(jComboBoxid_sucursalCierreCaja, this.gridBagConstraintsCierreCaja);


	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 0;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioCierreCaja.add(jLabelid_usuarioCierreCaja, this.gridBagConstraintsCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 2;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCierreCaja.add(jButtonid_usuarioCierreCajaBusqueda, this.gridBagConstraintsCierreCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 3;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCierreCaja.add(jButtonid_usuarioCierreCajaUpdate, this.gridBagConstraintsCierreCaja);
	}

	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 1;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioCierreCaja.add(jComboBoxid_usuarioCierreCaja, this.gridBagConstraintsCierreCaja);


	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 0;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoCierreCaja.add(jLabelid_tipo_forma_pagoCierreCaja, this.gridBagConstraintsCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 2;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoCierreCaja.add(jButtonid_tipo_forma_pagoCierreCajaBusqueda, this.gridBagConstraintsCierreCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 3;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoCierreCaja.add(jButtonid_tipo_forma_pagoCierreCajaUpdate, this.gridBagConstraintsCierreCaja);
	}

	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 1;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoCierreCaja.add(jComboBoxid_tipo_forma_pagoCierreCaja, this.gridBagConstraintsCierreCaja);


	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 0;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaCierreCaja.add(jLabelfechaCierreCaja, this.gridBagConstraintsCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 2;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaCierreCaja.add(jButtonfechaCierreCajaBusqueda, this.gridBagConstraintsCierreCaja);
	}

	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 1;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaCierreCaja.add(jDateChooserfechaCierreCaja, this.gridBagConstraintsCierreCaja);


	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 0;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalCierreCaja.add(jLabeltotalCierreCaja, this.gridBagConstraintsCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 2;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalCierreCaja.add(jButtontotalCierreCajaBusqueda, this.gridBagConstraintsCierreCaja);
	}

	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 1;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalCierreCaja.add(jTextFieldtotalCierreCaja, this.gridBagConstraintsCierreCaja);


	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 0;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_diferenciaCierreCaja.add(jLabeltotal_diferenciaCierreCaja, this.gridBagConstraintsCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 2;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_diferenciaCierreCaja.add(jButtontotal_diferenciaCierreCajaBusqueda, this.gridBagConstraintsCierreCaja);
	}

	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 1;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_diferenciaCierreCaja.add(jTextFieldtotal_diferenciaCierreCaja, this.gridBagConstraintsCierreCaja);


	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 0;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoCierreCaja.add(jLabelesta_activoCierreCaja, this.gridBagConstraintsCierreCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		//this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = 2;
		this.gridBagConstraintsCierreCaja.ipadx = 0;
		this.gridBagConstraintsCierreCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoCierreCaja.add(jButtonesta_activoCierreCajaBusqueda, this.gridBagConstraintsCierreCaja);
	}

	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCierreCaja.gridy = 0;
	this.gridBagConstraintsCierreCaja.gridx = 1;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoCierreCaja.add(jCheckBoxesta_activoCierreCaja, this.gridBagConstraintsCierreCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreCaja.gridy = iYPanelCamposCierreCaja;
	this.gridBagConstraintsCierreCaja.gridx = iXPanelCamposCierreCaja++;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreCaja.add(this.jPanelidCierreCaja, this.gridBagConstraintsCierreCaja);



	if(iXPanelCamposCierreCaja % 1==0) {
		iXPanelCamposCierreCaja=0;
		iYPanelCamposCierreCaja++;
	}
	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreCaja.gridy = iYPanelCamposCierreCaja;
	this.gridBagConstraintsCierreCaja.gridx = iXPanelCamposCierreCaja++;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreCaja.add(this.jPanelid_tipo_forma_pagoCierreCaja, this.gridBagConstraintsCierreCaja);



	if(iXPanelCamposCierreCaja % 1==0) {
		iXPanelCamposCierreCaja=0;
		iYPanelCamposCierreCaja++;
	}
	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreCaja.gridy = iYPanelCamposCierreCaja;
	this.gridBagConstraintsCierreCaja.gridx = iXPanelCamposCierreCaja++;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreCaja.add(this.jPanelfechaCierreCaja, this.gridBagConstraintsCierreCaja);



	if(iXPanelCamposCierreCaja % 1==0) {
		iXPanelCamposCierreCaja=0;
		iYPanelCamposCierreCaja++;
	}
	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreCaja.gridy = iYPanelCamposCierreCaja;
	this.gridBagConstraintsCierreCaja.gridx = iXPanelCamposCierreCaja++;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreCaja.add(this.jPaneltotalCierreCaja, this.gridBagConstraintsCierreCaja);



	if(iXPanelCamposCierreCaja % 1==0) {
		iXPanelCamposCierreCaja=0;
		iYPanelCamposCierreCaja++;
	}
	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreCaja.gridy = iYPanelCamposCierreCaja;
	this.gridBagConstraintsCierreCaja.gridx = iXPanelCamposCierreCaja++;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreCaja.add(this.jPaneltotal_diferenciaCierreCaja, this.gridBagConstraintsCierreCaja);



	if(iXPanelCamposCierreCaja % 1==0) {
		iXPanelCamposCierreCaja=0;
		iYPanelCamposCierreCaja++;
	}
	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreCaja.gridy = iYPanelCamposCierreCaja;
	this.gridBagConstraintsCierreCaja.gridx = iXPanelCamposCierreCaja++;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCierreCaja.add(this.jPanelesta_activoCierreCaja, this.gridBagConstraintsCierreCaja);



	if(iXPanelCamposCierreCaja % 1==0) {
		iXPanelCamposCierreCaja=0;
		iYPanelCamposCierreCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreCaja.gridy = iYPanelCamposOcultosCierreCaja;
	this.gridBagConstraintsCierreCaja.gridx = iXPanelCamposOcultosCierreCaja++;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCierreCaja.add(this.jPanelid_empresaCierreCaja, this.gridBagConstraintsCierreCaja);



	if(iXPanelCamposOcultosCierreCaja % 1==0) {
		iXPanelCamposOcultosCierreCaja=0;
		iYPanelCamposOcultosCierreCaja++;
	}
	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreCaja.gridy = iYPanelCamposOcultosCierreCaja;
	this.gridBagConstraintsCierreCaja.gridx = iXPanelCamposOcultosCierreCaja++;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCierreCaja.add(this.jPanelid_sucursalCierreCaja, this.gridBagConstraintsCierreCaja);



	if(iXPanelCamposOcultosCierreCaja % 1==0) {
		iXPanelCamposOcultosCierreCaja=0;
		iYPanelCamposOcultosCierreCaja++;
	}
	this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCierreCaja.gridy = iYPanelCamposOcultosCierreCaja;
	this.gridBagConstraintsCierreCaja.gridx = iXPanelCamposOcultosCierreCaja++;
	this.gridBagConstraintsCierreCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCierreCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCierreCaja.add(this.jPanelid_usuarioCierreCaja, this.gridBagConstraintsCierreCaja);



	if(iXPanelCamposOcultosCierreCaja % 1==0) {
		iXPanelCamposOcultosCierreCaja=0;
		iYPanelCamposOcultosCierreCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesCierreCaja= new GridBagLayout();
		this.jPanelAccionesCierreCaja.setLayout(gridaBagLayoutAccionesCierreCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCierreCaja= new GridBagLayout();
		this.jPanelAccionesFormularioCierreCaja.setLayout(gridaBagLayoutAccionesFormularioCierreCaja);
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCierreCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCierreCaja.add(this.jComboBoxTiposAccionesFormularioCierreCaja, this.gridBagConstraintsCierreCaja);

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCierreCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCierreCaja.add(this.jCheckBoxPostAccionNuevoCierreCaja, this.gridBagConstraintsCierreCaja);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cierrecajaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCierreCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCierreCaja.add(this.jCheckBoxPostAccionSinCerrarCierreCaja, this.gridBagConstraintsCierreCaja);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cierrecajaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cierrecajaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCierreCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCierreCaja.add(this.jCheckBoxPostAccionSinMensajeCierreCaja, this.gridBagConstraintsCierreCaja);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesCierreCaja.add(this.jButtonModificarCierreCaja, this.gridBagConstraintsCierreCaja);							

		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCierreCaja.gridy = 0;
		this.gridBagConstraintsCierreCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesCierreCaja.add(this.jButtonEliminarCierreCaja, this.gridBagConstraintsCierreCaja);
		
			
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = 0;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesCierreCaja.add(this.jButtonActualizarCierreCaja, this.gridBagConstraintsCierreCaja);


		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = 0;		
		this.gridBagConstraintsCierreCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesCierreCaja.add(this.jButtonGuardarCambiosCierreCaja, this.gridBagConstraintsCierreCaja);	
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = 0;		
		this.gridBagConstraintsCierreCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesCierreCaja.add(this.jButtonCancelarCierreCaja, this.gridBagConstraintsCierreCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCierreCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCierreCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cierrecajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();						
			this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCierreCaja.gridx = 0;		
			//this.gridBagConstraintsCierreCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCierreCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCierreCaja.gridx =0;
		this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCierreCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCierreCaja, this.gridBagConstraintsCierreCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CierreCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCierreCaja = new CierreCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cierre Caja DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Cierre Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cierre Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CierreCajaModel cierrecajaModel=new CierreCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//CierreCajaModel.CierreCajaFocusTraversalPolicy cierrecajaFocusTraversalPolicy = cierrecajaModel.new CierreCajaFocusTraversalPolicy(this);
			
			//cierrecajaFocusTraversalPolicy.setcierrecajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cierrecajaModel);
			
			
			this.jContentPaneDetalleCierreCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCierreCaja = new GridBagLayout();	
			this.jContentPaneDetalleCierreCaja.setLayout(gridaBagLayoutDetalleCierreCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCierreCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCierreCaja = new GridBagConstraints();
				this.gridBagConstraintsCierreCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCierreCaja.gridx = 0;
					
				
				this.jContentPaneDetalleCierreCaja.add(jTtoolBarDetalleCierreCaja, gridBagConstraintsCierreCaja);								
				
}
			
			this.jScrollPanelDatosEdicionCierreCaja=   new JScrollPane(jContentPaneDetalleCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCierreCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCierreCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCierreCaja.gridx = 0;
	        
			this.jContentPaneDetalleCierreCaja.add(jPanelCamposCierreCaja, gridBagConstraintsCierreCaja);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& cierrecajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cierrecajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCierreCaja= new GridBagConstraints();
						this.gridBagConstraintsCierreCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCierreCaja.gridx = 0;
						this.jContentPaneDetalleCierreCaja.add(this.jTabbedPaneRelacionesCierreCaja, this.gridBagConstraintsCierreCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCierreCaja.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCierreCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCierreCaja = new GridBagConstraints();
					this.gridBagConstraintsCierreCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCierreCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCierreCaja.gridx = 0;
					
				
					this.jContentPaneDetalleCierreCaja.add(jPanelCamposOcultosCierreCaja, gridBagConstraintsCierreCaja);
				
					this.jPanelCamposOcultosCierreCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCierreCaja.gridx = 0;
	        this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCierreCaja.add(this.jPanelAccionesFormularioCierreCaja, this.gridBagConstraintsCierreCaja);							
			
			
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
	        this.gridBagConstraintsCierreCaja.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCierreCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleCierreCaja.add(this.jPanelAccionesCierreCaja, this.gridBagConstraintsCierreCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCierreCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCierreCaja=   new JScrollPane(this.jPanelCamposCierreCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCierreCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCierreCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCierreCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCierreCaja.gridx = 0;
			this.gridBagConstraintsCierreCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCierreCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCierreCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCierreCaja, this.gridBagConstraintsCierreCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCierreCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCierreCaja, this.gridBagConstraintsCierreCaja);			
			
			this.gridBagConstraintsCierreCaja = new GridBagConstraints();
			this.gridBagConstraintsCierreCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCierreCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCierreCaja, this.gridBagConstraintsCierreCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCierreCaja, this.gridBagConstraintsCierreCaja);
			
			
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCierreCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCierreCaja, this.gridBagConstraintsCierreCaja);
		
			
		this.gridBagConstraintsCierreCaja = new GridBagConstraints();
		this.gridBagConstraintsCierreCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCierreCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCierreCaja, this.gridBagConstraintsCierreCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCierreCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionCierreCaja;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
