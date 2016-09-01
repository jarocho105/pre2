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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.BimestreConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class BimestreDetalleFormJInternalFrame extends BimestreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBimestre;
	
	protected JMenuBar jmenuBarDetalleBimestre;
	
	protected JMenu jmenuDetalleBimestre;
	protected JMenu jmenuDetalleArchivoBimestre;
	protected JMenu jmenuDetalleAccionesBimestre;
	protected JMenu jmenuDetalleDatosBimestre;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBimestre;	
	protected GridBagConstraints gridBagConstraintsBimestre;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BimestreBeanSwingJInternalFrameAdditional jInternalFrameDetalleBimestre;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public BimestreSessionBean bimestreSessionBean;
	
	
	
		
	
	public BimestreLogic bimestreLogic;
	
	public JScrollPane jScrollPanelDatosBimestre;
	public JScrollPane jScrollPanelDatosEdicionBimestre;
	public JScrollPane jScrollPanelDatosGeneralBimestre;
	
	protected JPanel jPanelCamposBimestre;    
	protected JPanel jPanelCamposOcultosBimestre;    	
	protected JPanel jPanelAccionesBimestre;
	protected JPanel jPanelAccionesFormularioBimestre;
    
	
	
	protected Integer iXPanelCamposBimestre=0;
	protected Integer iYPanelCamposBimestre=0;
	
	protected Integer iXPanelCamposOcultosBimestre=0;
	protected Integer iYPanelCamposOcultosBimestre=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBimestre;
	public JButton jButtonModificarBimestre;
	public JButton jButtonActualizarBimestre;
    public JButton jButtonEliminarBimestre;
	public JButton jButtonCancelarBimestre;
    public JButton jButtonGuardarCambiosBimestre;
	public JButton jButtonGuardarCambiosTablaBimestre;
	protected JButton jButtonCerrarBimestre;
	
	
	protected JButton jButtonProcesarInformacionBimestre;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBimestre;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBimestre;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBimestre;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBimestre;
	protected JButton jButtonModificarToolBarBimestre;
	protected JButton jButtonActualizarToolBarBimestre;
    protected JButton jButtonEliminarToolBarBimestre;
	protected JButton jButtonCancelarToolBarBimestre;
    protected JButton jButtonGuardarCambiosToolBarBimestre;
	protected JButton jButtonGuardarCambiosTablaToolBarBimestre;
	protected JButton jButtonMostrarOcultarTablaToolBarBimestre;
	protected JButton jButtonCerrarToolBarBimestre;
	
	protected JButton jButtonProcesarInformacionToolBarBimestre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBimestre;
	protected JMenuItem jMenuItemModificarBimestre;
	protected JMenuItem jMenuItemActualizarBimestre;
    protected JMenuItem jMenuItemEliminarBimestre;
	protected JMenuItem jMenuItemCancelarBimestre;
    protected JMenuItem jMenuItemGuardarCambiosBimestre;
	protected JMenuItem jMenuItemGuardarCambiosTablaBimestre;
	protected JMenuItem jMenuItemCerrarBimestre;
	protected JMenuItem jMenuItemDetalleCerrarBimestre;
	protected JMenuItem jMenuItemDetalleMostarOcultarBimestre;
	
	protected JMenuItem jMenuItemProcesarInformacionBimestre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBimestre;
	protected JMenuItem jMenuItemMostrarOcultarBimestre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBimestre;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBimestre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBimestre;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBimestre;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBimestre;
	public JLabel jLabelIdBimestre;
	public JTextFieldMe jTextFieldidBimestre;
	public JButton jButtonidBimestreBusqueda= new JButtonMe();

	public JPanel jPanelnombreBimestre;
	public JLabel jLabelnombreBimestre;
	public JTextField jTextFieldnombreBimestre;
	public JButton jButtonnombreBimestreBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBimestre;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BimestreDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBimestre=new JPanel();
				this.jPanelAccionesFormularioBimestre=new JPanel();
				this.jmenuBarDetalleBimestre=new JMenuBar();
				this.jTtoolBarDetalleBimestre=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BimestreDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Bimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BimestreDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Bimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BimestreDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BimestreDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Bimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BimestreDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Bimestre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBimestre() {
		return this.jButtonActualizarToolBarBimestre;
	}
	
	public JButton getjButtonEliminarToolBarBimestre() {
		return this.jButtonEliminarToolBarBimestre;
	}
	
	public JButton getjButtonCancelarToolBarBimestre() {
		return this.jButtonCancelarToolBarBimestre;
	}		
	
	public JButton getjButtonProcesarInformacionBimestre() {
		return this.jButtonProcesarInformacionBimestre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBimestre)	{
		this.jButtonProcesarInformacionBimestre = jButtonProcesarInformacionBimestre;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBimestre() {
		return this.jComboBoxTiposAccionesBimestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBimestre(
			JComboBox jComboBoxTiposRelacionesBimestre) {
		this.jComboBoxTiposRelacionesBimestre = jComboBoxTiposRelacionesBimestre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBimestre(
			JComboBox jComboBoxTiposAccionesBimestre) {
		this.jComboBoxTiposAccionesBimestre = jComboBoxTiposAccionesBimestre;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBimestre() {
		return this.jComboBoxTiposAccionesFormularioBimestre;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBimestre(
			JComboBox jComboBoxTiposAccionesFormularioBimestre) {
		this.jComboBoxTiposAccionesFormularioBimestre = jComboBoxTiposAccionesFormularioBimestre;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.bimestreSessionBean=new BimestreSessionBean();
		
		this.bimestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bimestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bimestreSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BimestreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BimestreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BimestreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bimestre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
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
	
		BimestreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBimestre= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBimestre=new JButtonMe();
				this.jButtonModificarToolBarBimestre=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBimestre,this.jTtoolBarDetalleBimestre,
							"actualizar","actualizar","Actualizar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBimestre,this.jTtoolBarDetalleBimestre,
							"eliminar","eliminar","Eliminar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBimestre,this.jTtoolBarDetalleBimestre,
							"cancelar","cancelar","Cancelar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBimestre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBimestre,this.jTtoolBarDetalleBimestre,
							"guardarcambios","guardarcambios","Guardar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBimestre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBimestre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBimestre,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBimestre=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBimestre=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBimestre=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBimestre=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBimestre=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBimestre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBimestre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBimestre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBimestre= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBimestre.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBimestre,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBimestre= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBimestre.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBimestre,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBimestre= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBimestre.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBimestre,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBimestre= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBimestre.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBimestre,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBimestre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBimestre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBimestre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBimestre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBimestre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBimestre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBimestre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBimestre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBimestre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBimestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBimestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBimestre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBimestre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBimestre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBimestre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBimestre.add(this.jMenuItemDetalleCerrarBimestre);
		
		this.jmenuDetalleAccionesBimestre.add(this.jMenuItemActualizarBimestre);
		this.jmenuDetalleAccionesBimestre.add(this.jMenuItemEliminarBimestre);
		this.jmenuDetalleAccionesBimestre.add(this.jMenuItemCancelarBimestre);		
		
		//this.jmenuDetalleDatosBimestre.add(this.jMenuItemDetalleAbrirOrderByBimestre);				
		this.jmenuDetalleDatosBimestre.add(this.jMenuItemDetalleMostarOcultarBimestre);				
				
		//this.jmenuDetalleAccionesBimestre.add(this.jMenuItemGuardarCambiosBimestre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBimestre.add(this.jmenuDetalleArchivoBimestre);		
		this.jmenuBarDetalleBimestre.add(this.jmenuDetalleAccionesBimestre);		
		this.jmenuBarDetalleBimestre.add(this.jmenuDetalleDatosBimestre);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBimestre);				
	}
	
	
	public void inicializarElementosCamposBimestre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBimestre = new JLabelMe();
		jLabelIdBimestre.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBimestre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBimestre = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBimestre.setToolTipText(BimestreConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBimestre= new GridBagLayout();

		this.jPanelidBimestre.setLayout(this.gridaBagLayoutBimestre);

		jTextFieldidBimestre = new JTextFieldMe();
		jTextFieldidBimestre.setText("Id");

		jTextFieldidBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreBimestre = new JLabelMe();
		this.jLabelnombreBimestre.setText(""+BimestreConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreBimestre.setToolTipText("Nombre");
		this.jLabelnombreBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreBimestre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreBimestre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreBimestre.setToolTipText(BimestreConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutBimestre = new GridBagLayout();
		this.jPanelnombreBimestre.setLayout(this.gridaBagLayoutBimestre);


		jTextFieldnombreBimestre= new JTextFieldMe();

		jTextFieldnombreBimestre.setEnabled(false);
		jTextFieldnombreBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreBimestre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreBimestreBusqueda= new JButtonMe();
		this.jButtonnombreBimestreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreBimestreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreBimestreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreBimestreBusqueda.setText("U");
		this.jButtonnombreBimestreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreBimestreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreBimestreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreBimestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreBimestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreBimestreBusqueda"));

		if(this.bimestreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreBimestreBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBimestre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleBimestre = new BimestreBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Bimestre DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBimestre= new GridBagLayout();
		

		
		String sToolTipBimestre="";
		sToolTipBimestre=BimestreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBimestre+="(Seguridad.Bimestre)";
		}
		
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
			sToolTipBimestre+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBimestre = new JButtonMe();
		this.jButtonModificarBimestre = new JButtonMe();
        this.jButtonActualizarBimestre = new JButtonMe();
        this.jButtonEliminarBimestre = new JButtonMe();
        this.jButtonCancelarBimestre = new JButtonMe();
        this.jButtonGuardarCambiosBimestre = new JButtonMe();
		this.jButtonGuardarCambiosTablaBimestre = new JButtonMe();
		this.jButtonCerrarBimestre = new JButtonMe();
		
		this.jScrollPanelDatosBimestre = new JScrollPane();   
        this.jScrollPanelDatosEdicionBimestre = new JScrollPane();
		this.jScrollPanelDatosGeneralBimestre = new JScrollPane();
				
		
		
		this.jPanelCamposBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Bimestre";
		
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bimestres" + this.sPath));
		} else {
			this.jScrollPanelDatosBimestre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBimestre.setName("jPanelCamposBimestre"); 

		this.jPanelCamposOcultosBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBimestre.setName("jPanelCamposOcultosBimestre"); 

        this.jPanelAccionesBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBimestre.setToolTipText("Acciones");
        this.jPanelAccionesBimestre.setName("Acciones"); 

		this.jPanelAccionesFormularioBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBimestre.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBimestre.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBimestre, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBimestre.setText("Nuevo");
		this.jButtonModificarBimestre.setText("Editar");
        this.jButtonActualizarBimestre.setText("Actualizar");
        this.jButtonEliminarBimestre.setText("Eliminar");
        this.jButtonCancelarBimestre.setText("Cancelar");
        this.jButtonGuardarCambiosBimestre.setText("Guardar");
		this.jButtonGuardarCambiosTablaBimestre.setText("Guardar");
		this.jButtonCerrarBimestre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBimestre,"nuevo_button","Nuevo",this.bimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBimestre,"modificar_button","Editar",this.bimestreSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBimestre,"actualizar_button","Actualizar",this.bimestreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBimestre,"eliminar_button","Eliminar",this.bimestreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBimestre,"cancelar_button","Cancelar",this.bimestreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBimestre,"guardarcambios_button","Guardar",this.bimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBimestre,"guardarcambiostabla_button","Guardar",this.bimestreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBimestre,"cerrar_button","Salir",this.bimestreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBimestre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBimestre.setToolTipText("Nuevo"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBimestre.setToolTipText("Editar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBimestre.setToolTipText("Actualizar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBimestre.setToolTipText("Eliminar)"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBimestre.setToolTipText("Cancelar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBimestre.setToolTipText("Guardar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBimestre.setToolTipText("Guardar"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBimestre.setToolTipText("Salir"+" "+BimestreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBimestre";
		inputMap = this.jButtonNuevoBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBimestre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBimestre"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBimestre";
		inputMap = this.jButtonActualizarBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBimestre"));
		
		//ELIMINAR
		sMapKey = "EliminarBimestre";
		inputMap = this.jButtonEliminarBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBimestre"));
		
		//CANCELAR	
		sMapKey = "CancelarBimestre";
		inputMap = this.jButtonCancelarBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBimestre"));
		
		//CERRAR		
		sMapKey = "CerrarBimestre";
		inputMap = this.jButtonCerrarBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBimestre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBimestre";
		inputMap = this.jButtonGuardarCambiosTablaBimestre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBimestre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBimestre"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBimestre = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBimestre.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBimestre.setToolTipText("Nuevo Bimestre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBimestre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBimestre.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBimestre.setToolTipText("Sin Cerrar Ventana Bimestre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBimestre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBimestre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBimestre.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBimestre.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBimestre, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBimestre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBimestre.setText("Accion");
		this.jComboBoxTiposAccionesBimestre.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBimestre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBimestre.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBimestre.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBimestre = new JLabelMe();
		
		this.jLabelAccionesBimestre.setText("Acciones");		
		this.jLabelAccionesBimestre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBimestre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBimestre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBimestre();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBimestre();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBimestre=new JTabbedPane();
		this.jTabbedPaneRelacionesBimestre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBimestre,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBimestre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBimestre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBimestre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBimestre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBimestre.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBimestre.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBimestre.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBimestre, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBimestre = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBimestre = new GridBagLayout();
		
		this.jPanelCamposBimestre.setLayout(gridaBagLayoutCamposBimestre);
		this.jPanelCamposOcultosBimestre.setLayout(gridaBagLayoutCamposOcultosBimestre);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBimestre = new GridBagConstraints();
	this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBimestre.gridy = 0;
	this.gridBagConstraintsBimestre.gridx = 0;
	this.gridBagConstraintsBimestre.ipadx = 0;
	this.gridBagConstraintsBimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBimestre.add(jLabelIdBimestre, this.gridBagConstraintsBimestre);



	this.gridBagConstraintsBimestre = new GridBagConstraints();
	this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBimestre.gridy = 0;
	this.gridBagConstraintsBimestre.gridx = 1;
	this.gridBagConstraintsBimestre.ipadx = 0;
	this.gridBagConstraintsBimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBimestre.add(jTextFieldidBimestre, this.gridBagConstraintsBimestre);


	this.gridBagConstraintsBimestre = new GridBagConstraints();
	this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBimestre.gridy = 0;
	this.gridBagConstraintsBimestre.gridx = 0;
	this.gridBagConstraintsBimestre.ipadx = 0;
	this.gridBagConstraintsBimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreBimestre.add(jLabelnombreBimestre, this.gridBagConstraintsBimestre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBimestre = new GridBagConstraints();
		//this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBimestre.gridy = 0;
		this.gridBagConstraintsBimestre.gridx = 2;
		this.gridBagConstraintsBimestre.ipadx = 0;
		this.gridBagConstraintsBimestre.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreBimestre.add(jButtonnombreBimestreBusqueda, this.gridBagConstraintsBimestre);
	}

	this.gridBagConstraintsBimestre = new GridBagConstraints();
	this.gridBagConstraintsBimestre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBimestre.gridy = 0;
	this.gridBagConstraintsBimestre.gridx = 1;
	this.gridBagConstraintsBimestre.ipadx = 0;
	this.gridBagConstraintsBimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreBimestre.add(jTextFieldnombreBimestre, this.gridBagConstraintsBimestre);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBimestre = new GridBagConstraints();
	this.gridBagConstraintsBimestre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBimestre.gridy = iYPanelCamposBimestre;
	this.gridBagConstraintsBimestre.gridx = iXPanelCamposBimestre++;
	this.gridBagConstraintsBimestre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBimestre.add(this.jPanelidBimestre, this.gridBagConstraintsBimestre);



	if(iXPanelCamposBimestre % 1==0) {
		iXPanelCamposBimestre=0;
		iYPanelCamposBimestre++;
	}
	this.gridBagConstraintsBimestre = new GridBagConstraints();
	this.gridBagConstraintsBimestre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBimestre.gridy = iYPanelCamposBimestre;
	this.gridBagConstraintsBimestre.gridx = iXPanelCamposBimestre++;
	this.gridBagConstraintsBimestre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBimestre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBimestre.add(this.jPanelnombreBimestre, this.gridBagConstraintsBimestre);



	if(iXPanelCamposBimestre % 1==0) {
		iXPanelCamposBimestre=0;
		iYPanelCamposBimestre++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesBimestre= new GridBagLayout();
		this.jPanelAccionesBimestre.setLayout(gridaBagLayoutAccionesBimestre);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBimestre= new GridBagLayout();
		this.jPanelAccionesFormularioBimestre.setLayout(gridaBagLayoutAccionesFormularioBimestre);
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBimestre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBimestre.add(this.jComboBoxTiposAccionesFormularioBimestre, this.gridBagConstraintsBimestre);

		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBimestre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBimestre.add(this.jCheckBoxPostAccionNuevoBimestre, this.gridBagConstraintsBimestre);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.bimestreSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBimestre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBimestre.add(this.jCheckBoxPostAccionSinCerrarBimestre, this.gridBagConstraintsBimestre);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.bimestreSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.bimestreSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBimestre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBimestre.add(this.jCheckBoxPostAccionSinMensajeBimestre, this.gridBagConstraintsBimestre);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = 0;
		this.gridBagConstraintsBimestre.gridx = iPosXAccion++;
			
		this.jPanelAccionesBimestre.add(this.jButtonModificarBimestre, this.gridBagConstraintsBimestre);							

		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBimestre.gridy = 0;
		this.gridBagConstraintsBimestre.gridx =iPosXAccion++;
			
		this.jPanelAccionesBimestre.add(this.jButtonEliminarBimestre, this.gridBagConstraintsBimestre);
		
			
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = 0;		
		this.gridBagConstraintsBimestre.gridx = iPosXAccion++;
		
		this.jPanelAccionesBimestre.add(this.jButtonActualizarBimestre, this.gridBagConstraintsBimestre);


		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = 0;		
		this.gridBagConstraintsBimestre.gridx = iPosXAccion++;
		
		this.jPanelAccionesBimestre.add(this.jButtonGuardarCambiosBimestre, this.gridBagConstraintsBimestre);	
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = 0;		
		this.gridBagConstraintsBimestre.gridx =iPosXAccion++;
		
		this.jPanelAccionesBimestre.add(this.jButtonCancelarBimestre, this.gridBagConstraintsBimestre);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBimestre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBimestre);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bimestreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBimestre = new GridBagConstraints();						
			this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBimestre.gridx = 0;		
			//this.gridBagConstraintsBimestre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBimestre.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBimestre.gridx =0;
		this.gridBagConstraintsBimestre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBimestre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBimestre, this.gridBagConstraintsBimestre);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BimestreJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBimestre = new BimestreBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Bimestre DATOS");
			
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
			
	        //this.setTitle("[FOR] - Bimestre DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bimestre Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BimestreModel bimestreModel=new BimestreModel(this);
			
			//SI USARA CLASE INTERNA
			//BimestreModel.BimestreFocusTraversalPolicy bimestreFocusTraversalPolicy = bimestreModel.new BimestreFocusTraversalPolicy(this);
			
			//bimestreFocusTraversalPolicy.setbimestreJInternalFrame(this);
			
			this.setFocusTraversalPolicy(bimestreModel);
			
			
			this.jContentPaneDetalleBimestre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBimestre = new GridBagLayout();	
			this.jContentPaneDetalleBimestre.setLayout(gridaBagLayoutDetalleBimestre);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBimestre = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBimestre = new GridBagConstraints();
				this.gridBagConstraintsBimestre.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBimestre.gridx = 0;
					
				
				this.jContentPaneDetalleBimestre.add(jTtoolBarDetalleBimestre, gridBagConstraintsBimestre);								
				
}
			
			this.jScrollPanelDatosEdicionBimestre=   new JScrollPane(jContentPaneDetalleBimestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBimestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBimestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBimestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBimestre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBimestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBimestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBimestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBimestre.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBimestre.gridx = 0;
	        
			this.jContentPaneDetalleBimestre.add(jPanelCamposBimestre, gridBagConstraintsBimestre);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& bimestreSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.bimestreSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBimestre= new GridBagConstraints();
						this.gridBagConstraintsBimestre.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBimestre.gridx = 0;
						this.jContentPaneDetalleBimestre.add(this.jTabbedPaneRelacionesBimestre, this.gridBagConstraintsBimestre);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBimestre.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBimestre.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBimestre = new GridBagConstraints();
					this.gridBagConstraintsBimestre.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBimestre.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBimestre.gridx = 0;
					
				
					this.jContentPaneDetalleBimestre.add(jPanelCamposOcultosBimestre, gridBagConstraintsBimestre);
				
					this.jPanelCamposOcultosBimestre.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBimestre.gridx = 0;
	        this.gridBagConstraintsBimestre.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBimestre.add(this.jPanelAccionesFormularioBimestre, this.gridBagConstraintsBimestre);							
			
			
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
	        this.gridBagConstraintsBimestre.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBimestre.gridx = 0;
	        
			
			this.jContentPaneDetalleBimestre.add(this.jPanelAccionesBimestre, this.gridBagConstraintsBimestre);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBimestre);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBimestre=   new JScrollPane(this.jPanelCamposBimestre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBimestre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBimestre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBimestre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBimestre.gridx = 0;
			this.gridBagConstraintsBimestre.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBimestre.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBimestre.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBimestre, this.gridBagConstraintsBimestre);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBimestre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBimestre, this.gridBagConstraintsBimestre);			
			
			this.gridBagConstraintsBimestre = new GridBagConstraints();
			this.gridBagConstraintsBimestre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBimestre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBimestre, this.gridBagConstraintsBimestre);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBimestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBimestre, this.gridBagConstraintsBimestre);
			
			
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBimestre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBimestre, this.gridBagConstraintsBimestre);
		
			
		this.gridBagConstraintsBimestre = new GridBagConstraints();
		this.gridBagConstraintsBimestre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBimestre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBimestre, this.gridBagConstraintsBimestre);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBimestre;//jContentPane;
		
		return jScrollPanelDatosEdicionBimestre;
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
