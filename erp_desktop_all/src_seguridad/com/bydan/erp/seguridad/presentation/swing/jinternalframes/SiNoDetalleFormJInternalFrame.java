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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.SiNoConstantesFunciones;

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
public class SiNoDetalleFormJInternalFrame extends SiNoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSiNo;
	
	protected JMenuBar jmenuBarDetalleSiNo;
	
	protected JMenu jmenuDetalleSiNo;
	protected JMenu jmenuDetalleArchivoSiNo;
	protected JMenu jmenuDetalleAccionesSiNo;
	protected JMenu jmenuDetalleDatosSiNo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSiNo;	
	protected GridBagConstraints gridBagConstraintsSiNo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SiNoBeanSwingJInternalFrameAdditional jInternalFrameDetalleSiNo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public SiNoSessionBean sinoSessionBean;
	
	
	
		
	
	public SiNoLogic sinoLogic;
	
	public JScrollPane jScrollPanelDatosSiNo;
	public JScrollPane jScrollPanelDatosEdicionSiNo;
	public JScrollPane jScrollPanelDatosGeneralSiNo;
	
	protected JPanel jPanelCamposSiNo;    
	protected JPanel jPanelCamposOcultosSiNo;    	
	protected JPanel jPanelAccionesSiNo;
	protected JPanel jPanelAccionesFormularioSiNo;
    
	
	
	protected Integer iXPanelCamposSiNo=0;
	protected Integer iYPanelCamposSiNo=0;
	
	protected Integer iXPanelCamposOcultosSiNo=0;
	protected Integer iYPanelCamposOcultosSiNo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSiNo;
	public JButton jButtonModificarSiNo;
	public JButton jButtonActualizarSiNo;
    public JButton jButtonEliminarSiNo;
	public JButton jButtonCancelarSiNo;
    public JButton jButtonGuardarCambiosSiNo;
	public JButton jButtonGuardarCambiosTablaSiNo;
	protected JButton jButtonCerrarSiNo;
	
	
	protected JButton jButtonProcesarInformacionSiNo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSiNo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSiNo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSiNo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSiNo;
	protected JButton jButtonModificarToolBarSiNo;
	protected JButton jButtonActualizarToolBarSiNo;
    protected JButton jButtonEliminarToolBarSiNo;
	protected JButton jButtonCancelarToolBarSiNo;
    protected JButton jButtonGuardarCambiosToolBarSiNo;
	protected JButton jButtonGuardarCambiosTablaToolBarSiNo;
	protected JButton jButtonMostrarOcultarTablaToolBarSiNo;
	protected JButton jButtonCerrarToolBarSiNo;
	
	protected JButton jButtonProcesarInformacionToolBarSiNo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSiNo;
	protected JMenuItem jMenuItemModificarSiNo;
	protected JMenuItem jMenuItemActualizarSiNo;
    protected JMenuItem jMenuItemEliminarSiNo;
	protected JMenuItem jMenuItemCancelarSiNo;
    protected JMenuItem jMenuItemGuardarCambiosSiNo;
	protected JMenuItem jMenuItemGuardarCambiosTablaSiNo;
	protected JMenuItem jMenuItemCerrarSiNo;
	protected JMenuItem jMenuItemDetalleCerrarSiNo;
	protected JMenuItem jMenuItemDetalleMostarOcultarSiNo;
	
	protected JMenuItem jMenuItemProcesarInformacionSiNo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSiNo;
	protected JMenuItem jMenuItemMostrarOcultarSiNo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSiNo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSiNo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSiNo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSiNo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSiNo;
	public JLabel jLabelIdSiNo;
	public JTextFieldMe jTextFieldidSiNo;
	public JButton jButtonidSiNoBusqueda= new JButtonMe();

	public JPanel jPanelnombreSiNo;
	public JLabel jLabelnombreSiNo;
	public JTextField jTextFieldnombreSiNo;
	public JButton jButtonnombreSiNoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSiNo;
	
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
	
	public SiNoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSiNo=new JPanel();
				this.jPanelAccionesFormularioSiNo=new JPanel();
				this.jmenuBarDetalleSiNo=new JMenuBar();
				this.jTtoolBarDetalleSiNo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SiNoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SiNo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SiNoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SiNo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SiNoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SiNo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SiNoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SiNo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SiNoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SiNo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSiNo() {
		return this.jButtonActualizarToolBarSiNo;
	}
	
	public JButton getjButtonEliminarToolBarSiNo() {
		return this.jButtonEliminarToolBarSiNo;
	}
	
	public JButton getjButtonCancelarToolBarSiNo() {
		return this.jButtonCancelarToolBarSiNo;
	}		
	
	public JButton getjButtonProcesarInformacionSiNo() {
		return this.jButtonProcesarInformacionSiNo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSiNo)	{
		this.jButtonProcesarInformacionSiNo = jButtonProcesarInformacionSiNo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSiNo() {
		return this.jComboBoxTiposAccionesSiNo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSiNo(
			JComboBox jComboBoxTiposRelacionesSiNo) {
		this.jComboBoxTiposRelacionesSiNo = jComboBoxTiposRelacionesSiNo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSiNo(
			JComboBox jComboBoxTiposAccionesSiNo) {
		this.jComboBoxTiposAccionesSiNo = jComboBoxTiposAccionesSiNo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSiNo() {
		return this.jComboBoxTiposAccionesFormularioSiNo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSiNo(
			JComboBox jComboBoxTiposAccionesFormularioSiNo) {
		this.jComboBoxTiposAccionesFormularioSiNo = jComboBoxTiposAccionesFormularioSiNo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.sinoSessionBean=new SiNoSessionBean();
		
		this.sinoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sinoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sinoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SiNoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SiNoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SiNoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Si/no MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
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
	
		SiNoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSiNo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSiNo=new JButtonMe();
				this.jButtonModificarToolBarSiNo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSiNo,this.jTtoolBarDetalleSiNo,
							"actualizar","actualizar","Actualizar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSiNo,this.jTtoolBarDetalleSiNo,
							"eliminar","eliminar","Eliminar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSiNo,this.jTtoolBarDetalleSiNo,
							"cancelar","cancelar","Cancelar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSiNo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSiNo,this.jTtoolBarDetalleSiNo,
							"guardarcambios","guardarcambios","Guardar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSiNo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSiNo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSiNo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSiNo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSiNo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSiNo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSiNo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSiNo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSiNo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSiNo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSiNo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSiNo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSiNo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSiNo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSiNo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSiNo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSiNo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSiNo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSiNo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSiNo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSiNo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSiNo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSiNo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSiNo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSiNo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSiNo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSiNo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSiNo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSiNo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSiNo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSiNo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSiNo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSiNo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSiNo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSiNo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSiNo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSiNo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSiNo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSiNo.add(this.jMenuItemDetalleCerrarSiNo);
		
		this.jmenuDetalleAccionesSiNo.add(this.jMenuItemActualizarSiNo);
		this.jmenuDetalleAccionesSiNo.add(this.jMenuItemEliminarSiNo);
		this.jmenuDetalleAccionesSiNo.add(this.jMenuItemCancelarSiNo);		
		
		//this.jmenuDetalleDatosSiNo.add(this.jMenuItemDetalleAbrirOrderBySiNo);				
		this.jmenuDetalleDatosSiNo.add(this.jMenuItemDetalleMostarOcultarSiNo);				
				
		//this.jmenuDetalleAccionesSiNo.add(this.jMenuItemGuardarCambiosSiNo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSiNo.add(this.jmenuDetalleArchivoSiNo);		
		this.jmenuBarDetalleSiNo.add(this.jmenuDetalleAccionesSiNo);		
		this.jmenuBarDetalleSiNo.add(this.jmenuDetalleDatosSiNo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSiNo);				
	}
	
	
	public void inicializarElementosCamposSiNo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSiNo = new JLabelMe();
		jLabelIdSiNo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSiNo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSiNo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSiNo.setToolTipText(SiNoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSiNo= new GridBagLayout();

		this.jPanelidSiNo.setLayout(this.gridaBagLayoutSiNo);

		jTextFieldidSiNo = new JTextFieldMe();
		jTextFieldidSiNo.setText("Id");

		jTextFieldidSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreSiNo = new JLabelMe();
		this.jLabelnombreSiNo.setText(""+SiNoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSiNo.setToolTipText("Nombre");
		this.jLabelnombreSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSiNo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSiNo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSiNo.setToolTipText(SiNoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSiNo = new GridBagLayout();
		this.jPanelnombreSiNo.setLayout(this.gridaBagLayoutSiNo);


		jTextFieldnombreSiNo= new JTextFieldMe();

		jTextFieldnombreSiNo.setEnabled(false);
		jTextFieldnombreSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreSiNo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreSiNoBusqueda= new JButtonMe();
		this.jButtonnombreSiNoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSiNoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSiNoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSiNoBusqueda.setText("U");
		this.jButtonnombreSiNoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSiNoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSiNoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreSiNo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreSiNo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSiNoBusqueda"));

		if(this.sinoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSiNoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSiNo() {
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
		//this.jInternalFrameDetalleSiNo = new SiNoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Si/no DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSiNo= new GridBagLayout();
		

		
		String sToolTipSiNo="";
		sToolTipSiNo=SiNoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSiNo+="(Seguridad.SiNo)";
		}
		
		if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
			sToolTipSiNo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSiNo = new JButtonMe();
		this.jButtonModificarSiNo = new JButtonMe();
        this.jButtonActualizarSiNo = new JButtonMe();
        this.jButtonEliminarSiNo = new JButtonMe();
        this.jButtonCancelarSiNo = new JButtonMe();
        this.jButtonGuardarCambiosSiNo = new JButtonMe();
		this.jButtonGuardarCambiosTablaSiNo = new JButtonMe();
		this.jButtonCerrarSiNo = new JButtonMe();
		
		this.jScrollPanelDatosSiNo = new JScrollPane();   
        this.jScrollPanelDatosEdicionSiNo = new JScrollPane();
		this.jScrollPanelDatosGeneralSiNo = new JScrollPane();
				
		
		
		this.jPanelCamposSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Si/no";
		
		if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Si/no" + this.sPath));
		} else {
			this.jScrollPanelDatosSiNo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSiNo.setName("jPanelCamposSiNo"); 

		this.jPanelCamposOcultosSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSiNo.setName("jPanelCamposOcultosSiNo"); 

        this.jPanelAccionesSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSiNo.setToolTipText("Acciones");
        this.jPanelAccionesSiNo.setName("Acciones"); 

		this.jPanelAccionesFormularioSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSiNo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSiNo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSiNo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSiNo.setText("Nuevo");
		this.jButtonModificarSiNo.setText("Editar");
        this.jButtonActualizarSiNo.setText("Actualizar");
        this.jButtonEliminarSiNo.setText("Eliminar");
        this.jButtonCancelarSiNo.setText("Cancelar");
        this.jButtonGuardarCambiosSiNo.setText("Guardar");
		this.jButtonGuardarCambiosTablaSiNo.setText("Guardar");
		this.jButtonCerrarSiNo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSiNo,"nuevo_button","Nuevo",this.sinoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSiNo,"modificar_button","Editar",this.sinoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSiNo,"actualizar_button","Actualizar",this.sinoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSiNo,"eliminar_button","Eliminar",this.sinoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSiNo,"cancelar_button","Cancelar",this.sinoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSiNo,"guardarcambios_button","Guardar",this.sinoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSiNo,"guardarcambiostabla_button","Guardar",this.sinoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSiNo,"cerrar_button","Salir",this.sinoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSiNo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSiNo.setToolTipText("Nuevo"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSiNo.setToolTipText("Editar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSiNo.setToolTipText("Actualizar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSiNo.setToolTipText("Eliminar)"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSiNo.setToolTipText("Cancelar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSiNo.setToolTipText("Guardar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSiNo.setToolTipText("Guardar"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSiNo.setToolTipText("Salir"+" "+SiNoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSiNo";
		inputMap = this.jButtonNuevoSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSiNo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSiNo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSiNo";
		inputMap = this.jButtonActualizarSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSiNo"));
		
		//ELIMINAR
		sMapKey = "EliminarSiNo";
		inputMap = this.jButtonEliminarSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSiNo"));
		
		//CANCELAR	
		sMapKey = "CancelarSiNo";
		inputMap = this.jButtonCancelarSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSiNo"));
		
		//CERRAR		
		sMapKey = "CerrarSiNo";
		inputMap = this.jButtonCerrarSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSiNo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSiNo";
		inputMap = this.jButtonGuardarCambiosTablaSiNo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSiNo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSiNo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSiNo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSiNo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSiNo.setToolTipText("Nuevo SiNo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSiNo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSiNo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSiNo.setToolTipText("Sin Cerrar Ventana SiNo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSiNo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSiNo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSiNo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSiNo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSiNo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSiNo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSiNo.setText("Accion");
		this.jComboBoxTiposAccionesSiNo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSiNo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSiNo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSiNo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSiNo = new JLabelMe();
		
		this.jLabelAccionesSiNo.setText("Acciones");		
		this.jLabelAccionesSiNo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSiNo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSiNo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSiNo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSiNo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSiNo=new JTabbedPane();
		this.jTabbedPaneRelacionesSiNo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSiNo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSiNo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSiNo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSiNo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSiNo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSiNo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSiNo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSiNo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSiNo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSiNo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSiNo = new GridBagLayout();
		
		this.jPanelCamposSiNo.setLayout(gridaBagLayoutCamposSiNo);
		this.jPanelCamposOcultosSiNo.setLayout(gridaBagLayoutCamposOcultosSiNo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSiNo = new GridBagConstraints();
	this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSiNo.gridy = 0;
	this.gridBagConstraintsSiNo.gridx = 0;
	this.gridBagConstraintsSiNo.ipadx = 0;
	this.gridBagConstraintsSiNo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSiNo.add(jLabelIdSiNo, this.gridBagConstraintsSiNo);



	this.gridBagConstraintsSiNo = new GridBagConstraints();
	this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSiNo.gridy = 0;
	this.gridBagConstraintsSiNo.gridx = 1;
	this.gridBagConstraintsSiNo.ipadx = 0;
	this.gridBagConstraintsSiNo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSiNo.add(jTextFieldidSiNo, this.gridBagConstraintsSiNo);


	this.gridBagConstraintsSiNo = new GridBagConstraints();
	this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSiNo.gridy = 0;
	this.gridBagConstraintsSiNo.gridx = 0;
	this.gridBagConstraintsSiNo.ipadx = 0;
	this.gridBagConstraintsSiNo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSiNo.add(jLabelnombreSiNo, this.gridBagConstraintsSiNo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSiNo = new GridBagConstraints();
		//this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSiNo.gridy = 0;
		this.gridBagConstraintsSiNo.gridx = 2;
		this.gridBagConstraintsSiNo.ipadx = 0;
		this.gridBagConstraintsSiNo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSiNo.add(jButtonnombreSiNoBusqueda, this.gridBagConstraintsSiNo);
	}

	this.gridBagConstraintsSiNo = new GridBagConstraints();
	this.gridBagConstraintsSiNo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSiNo.gridy = 0;
	this.gridBagConstraintsSiNo.gridx = 1;
	this.gridBagConstraintsSiNo.ipadx = 0;
	this.gridBagConstraintsSiNo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSiNo.add(jTextFieldnombreSiNo, this.gridBagConstraintsSiNo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSiNo = new GridBagConstraints();
	this.gridBagConstraintsSiNo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSiNo.gridy = iYPanelCamposSiNo;
	this.gridBagConstraintsSiNo.gridx = iXPanelCamposSiNo++;
	this.gridBagConstraintsSiNo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSiNo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSiNo.add(this.jPanelidSiNo, this.gridBagConstraintsSiNo);



	if(iXPanelCamposSiNo % 1==0) {
		iXPanelCamposSiNo=0;
		iYPanelCamposSiNo++;
	}
	this.gridBagConstraintsSiNo = new GridBagConstraints();
	this.gridBagConstraintsSiNo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSiNo.gridy = iYPanelCamposSiNo;
	this.gridBagConstraintsSiNo.gridx = iXPanelCamposSiNo++;
	this.gridBagConstraintsSiNo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSiNo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSiNo.add(this.jPanelnombreSiNo, this.gridBagConstraintsSiNo);



	if(iXPanelCamposSiNo % 1==0) {
		iXPanelCamposSiNo=0;
		iYPanelCamposSiNo++;
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
			
		GridBagLayout gridaBagLayoutAccionesSiNo= new GridBagLayout();
		this.jPanelAccionesSiNo.setLayout(gridaBagLayoutAccionesSiNo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSiNo= new GridBagLayout();
		this.jPanelAccionesFormularioSiNo.setLayout(gridaBagLayoutAccionesFormularioSiNo);
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSiNo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSiNo.add(this.jComboBoxTiposAccionesFormularioSiNo, this.gridBagConstraintsSiNo);

		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSiNo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSiNo.add(this.jCheckBoxPostAccionNuevoSiNo, this.gridBagConstraintsSiNo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.sinoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSiNo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSiNo.add(this.jCheckBoxPostAccionSinCerrarSiNo, this.gridBagConstraintsSiNo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.sinoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.sinoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSiNo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSiNo.add(this.jCheckBoxPostAccionSinMensajeSiNo, this.gridBagConstraintsSiNo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = 0;
		this.gridBagConstraintsSiNo.gridx = iPosXAccion++;
			
		this.jPanelAccionesSiNo.add(this.jButtonModificarSiNo, this.gridBagConstraintsSiNo);							

		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSiNo.gridy = 0;
		this.gridBagConstraintsSiNo.gridx =iPosXAccion++;
			
		this.jPanelAccionesSiNo.add(this.jButtonEliminarSiNo, this.gridBagConstraintsSiNo);
		
			
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = 0;		
		this.gridBagConstraintsSiNo.gridx = iPosXAccion++;
		
		this.jPanelAccionesSiNo.add(this.jButtonActualizarSiNo, this.gridBagConstraintsSiNo);


		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = 0;		
		this.gridBagConstraintsSiNo.gridx = iPosXAccion++;
		
		this.jPanelAccionesSiNo.add(this.jButtonGuardarCambiosSiNo, this.gridBagConstraintsSiNo);	
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = 0;		
		this.gridBagConstraintsSiNo.gridx =iPosXAccion++;
		
		this.jPanelAccionesSiNo.add(this.jButtonCancelarSiNo, this.gridBagConstraintsSiNo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSiNo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSiNo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sinoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSiNo = new GridBagConstraints();						
			this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSiNo.gridx = 0;		
			//this.gridBagConstraintsSiNo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSiNo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSiNo.gridx =0;
		this.gridBagConstraintsSiNo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSiNo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSiNo, this.gridBagConstraintsSiNo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SiNoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSiNo = new SiNoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Si/no DATOS");
			
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
			
	        //this.setTitle("[FOR] - Si/no DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Si/no Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SiNoModel sinoModel=new SiNoModel(this);
			
			//SI USARA CLASE INTERNA
			//SiNoModel.SiNoFocusTraversalPolicy sinoFocusTraversalPolicy = sinoModel.new SiNoFocusTraversalPolicy(this);
			
			//sinoFocusTraversalPolicy.setsinoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(sinoModel);
			
			
			this.jContentPaneDetalleSiNo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSiNo = new GridBagLayout();	
			this.jContentPaneDetalleSiNo.setLayout(gridaBagLayoutDetalleSiNo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSiNo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSiNo = new GridBagConstraints();
				this.gridBagConstraintsSiNo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSiNo.gridx = 0;
					
				
				this.jContentPaneDetalleSiNo.add(jTtoolBarDetalleSiNo, gridBagConstraintsSiNo);								
				
}
			
			this.jScrollPanelDatosEdicionSiNo=   new JScrollPane(jContentPaneDetalleSiNo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSiNo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSiNo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSiNo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSiNo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSiNo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSiNo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSiNo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSiNo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSiNo.gridx = 0;
	        
			this.jContentPaneDetalleSiNo.add(jPanelCamposSiNo, gridBagConstraintsSiNo);
			
			
			
			
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
						&& sinoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.sinoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSiNo= new GridBagConstraints();
						this.gridBagConstraintsSiNo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSiNo.gridx = 0;
						this.jContentPaneDetalleSiNo.add(this.jTabbedPaneRelacionesSiNo, this.gridBagConstraintsSiNo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSiNo.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSiNo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSiNo = new GridBagConstraints();
					this.gridBagConstraintsSiNo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSiNo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSiNo.gridx = 0;
					
				
					this.jContentPaneDetalleSiNo.add(jPanelCamposOcultosSiNo, gridBagConstraintsSiNo);
				
					this.jPanelCamposOcultosSiNo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSiNo.gridx = 0;
	        this.gridBagConstraintsSiNo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSiNo.add(this.jPanelAccionesFormularioSiNo, this.gridBagConstraintsSiNo);							
			
			
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
	        this.gridBagConstraintsSiNo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSiNo.gridx = 0;
	        
			
			this.jContentPaneDetalleSiNo.add(this.jPanelAccionesSiNo, this.gridBagConstraintsSiNo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSiNo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSiNo=   new JScrollPane(this.jPanelCamposSiNo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSiNo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSiNo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSiNo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSiNo.gridx = 0;
			this.gridBagConstraintsSiNo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSiNo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSiNo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSiNo, this.gridBagConstraintsSiNo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSiNo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSiNo, this.gridBagConstraintsSiNo);			
			
			this.gridBagConstraintsSiNo = new GridBagConstraints();
			this.gridBagConstraintsSiNo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSiNo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSiNo, this.gridBagConstraintsSiNo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSiNo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSiNo, this.gridBagConstraintsSiNo);
			
			
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSiNo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSiNo, this.gridBagConstraintsSiNo);
		
			
		this.gridBagConstraintsSiNo = new GridBagConstraints();
		this.gridBagConstraintsSiNo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSiNo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSiNo, this.gridBagConstraintsSiNo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSiNo;//jContentPane;
		
		return jScrollPanelDatosEdicionSiNo;
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
