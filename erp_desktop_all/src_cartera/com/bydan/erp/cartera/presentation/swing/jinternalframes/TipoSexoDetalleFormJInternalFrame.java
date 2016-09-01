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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoSexoConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoSexoDetalleFormJInternalFrame extends TipoSexoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoSexo;
	
	protected JMenuBar jmenuBarDetalleTipoSexo;
	
	protected JMenu jmenuDetalleTipoSexo;
	protected JMenu jmenuDetalleArchivoTipoSexo;
	protected JMenu jmenuDetalleAccionesTipoSexo;
	protected JMenu jmenuDetalleDatosTipoSexo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoSexo;	
	protected GridBagConstraints gridBagConstraintsTipoSexo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoSexoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoSexo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoSexoSessionBean tiposexoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoSexoLogic tiposexoLogic;
	
	public JScrollPane jScrollPanelDatosTipoSexo;
	public JScrollPane jScrollPanelDatosEdicionTipoSexo;
	public JScrollPane jScrollPanelDatosGeneralTipoSexo;
	
	protected JPanel jPanelCamposTipoSexo;    
	protected JPanel jPanelCamposOcultosTipoSexo;    	
	protected JPanel jPanelAccionesTipoSexo;
	protected JPanel jPanelAccionesFormularioTipoSexo;
    
	
	
	protected Integer iXPanelCamposTipoSexo=0;
	protected Integer iYPanelCamposTipoSexo=0;
	
	protected Integer iXPanelCamposOcultosTipoSexo=0;
	protected Integer iYPanelCamposOcultosTipoSexo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoSexo;
	public JButton jButtonModificarTipoSexo;
	public JButton jButtonActualizarTipoSexo;
    public JButton jButtonEliminarTipoSexo;
	public JButton jButtonCancelarTipoSexo;
    public JButton jButtonGuardarCambiosTipoSexo;
	public JButton jButtonGuardarCambiosTablaTipoSexo;
	protected JButton jButtonCerrarTipoSexo;
	
	
	protected JButton jButtonProcesarInformacionTipoSexo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoSexo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoSexo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoSexo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoSexo;
	protected JButton jButtonModificarToolBarTipoSexo;
	protected JButton jButtonActualizarToolBarTipoSexo;
    protected JButton jButtonEliminarToolBarTipoSexo;
	protected JButton jButtonCancelarToolBarTipoSexo;
    protected JButton jButtonGuardarCambiosToolBarTipoSexo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoSexo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoSexo;
	protected JButton jButtonCerrarToolBarTipoSexo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoSexo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoSexo;
	protected JMenuItem jMenuItemModificarTipoSexo;
	protected JMenuItem jMenuItemActualizarTipoSexo;
    protected JMenuItem jMenuItemEliminarTipoSexo;
	protected JMenuItem jMenuItemCancelarTipoSexo;
    protected JMenuItem jMenuItemGuardarCambiosTipoSexo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoSexo;
	protected JMenuItem jMenuItemCerrarTipoSexo;
	protected JMenuItem jMenuItemDetalleCerrarTipoSexo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoSexo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoSexo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoSexo;
	protected JMenuItem jMenuItemMostrarOcultarTipoSexo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoSexo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoSexo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoSexo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoSexo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoSexo;
	public JLabel jLabelIdTipoSexo;
	public JLabel jLabelidTipoSexo;
	public JButton jButtonidTipoSexoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoSexo;
	public JLabel jLabelcodigoTipoSexo;
	public JTextField jTextFieldcodigoTipoSexo;
	public JButton jButtoncodigoTipoSexoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoSexo;
	public JLabel jLabelnombreTipoSexo;
	public JTextArea jTextAreanombreTipoSexo;
	public JScrollPane jscrollPanenombreTipoSexo;
	public JButton jButtonnombreTipoSexoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoSexo;
	public JLabel jLabelid_empresaTipoSexo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoSexo;
	public JButton jButtonid_empresaTipoSexo= new JButtonMe();
	public JButton jButtonid_empresaTipoSexoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoSexoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoSexo;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoSexoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoSexo=new JPanel();
				this.jPanelAccionesFormularioTipoSexo=new JPanel();
				this.jmenuBarDetalleTipoSexo=new JMenuBar();
				this.jTtoolBarDetalleTipoSexo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSexoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoSexo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoSexoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoSexo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSexoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSexo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSexoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSexo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSexoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoSexo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoSexo() {
		return this.jButtonActualizarToolBarTipoSexo;
	}
	
	public JButton getjButtonEliminarToolBarTipoSexo() {
		return this.jButtonEliminarToolBarTipoSexo;
	}
	
	public JButton getjButtonCancelarToolBarTipoSexo() {
		return this.jButtonCancelarToolBarTipoSexo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoSexo() {
		return this.jButtonProcesarInformacionTipoSexo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoSexo)	{
		this.jButtonProcesarInformacionTipoSexo = jButtonProcesarInformacionTipoSexo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoSexo() {
		return this.jComboBoxTiposAccionesTipoSexo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoSexo(
			JComboBox jComboBoxTiposRelacionesTipoSexo) {
		this.jComboBoxTiposRelacionesTipoSexo = jComboBoxTiposRelacionesTipoSexo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoSexo(
			JComboBox jComboBoxTiposAccionesTipoSexo) {
		this.jComboBoxTiposAccionesTipoSexo = jComboBoxTiposAccionesTipoSexo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoSexo() {
		return this.jComboBoxTiposAccionesFormularioTipoSexo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoSexo(
			JComboBox jComboBoxTiposAccionesFormularioTipoSexo) {
		this.jComboBoxTiposAccionesFormularioTipoSexo = jComboBoxTiposAccionesFormularioTipoSexo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiposexoSessionBean=new TipoSexoSessionBean();
		
		this.tiposexoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposexoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposexoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoSexoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoSexoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoSexoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Sexo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoSexoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoSexo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoSexo=new JButtonMe();
				this.jButtonModificarToolBarTipoSexo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoSexo,this.jTtoolBarDetalleTipoSexo,
							"actualizar","actualizar","Actualizar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoSexo,this.jTtoolBarDetalleTipoSexo,
							"eliminar","eliminar","Eliminar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoSexo,this.jTtoolBarDetalleTipoSexo,
							"cancelar","cancelar","Cancelar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoSexo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoSexo,this.jTtoolBarDetalleTipoSexo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoSexo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoSexo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoSexo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoSexo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoSexo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoSexo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoSexo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoSexo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoSexo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoSexo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoSexo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoSexo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoSexo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoSexo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoSexo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoSexo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoSexo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoSexo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoSexo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoSexo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoSexo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoSexo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoSexo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoSexo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoSexo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoSexo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoSexo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoSexo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoSexo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoSexo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoSexo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoSexo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoSexo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoSexo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoSexo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoSexo.add(this.jMenuItemDetalleCerrarTipoSexo);
		
		this.jmenuDetalleAccionesTipoSexo.add(this.jMenuItemActualizarTipoSexo);
		this.jmenuDetalleAccionesTipoSexo.add(this.jMenuItemEliminarTipoSexo);
		this.jmenuDetalleAccionesTipoSexo.add(this.jMenuItemCancelarTipoSexo);		
		
		//this.jmenuDetalleDatosTipoSexo.add(this.jMenuItemDetalleAbrirOrderByTipoSexo);				
		this.jmenuDetalleDatosTipoSexo.add(this.jMenuItemDetalleMostarOcultarTipoSexo);				
				
		//this.jmenuDetalleAccionesTipoSexo.add(this.jMenuItemGuardarCambiosTipoSexo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoSexo.add(this.jmenuDetalleArchivoTipoSexo);		
		this.jmenuBarDetalleTipoSexo.add(this.jmenuDetalleAccionesTipoSexo);		
		this.jmenuBarDetalleTipoSexo.add(this.jmenuDetalleDatosTipoSexo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoSexo);				
	}
	
	
	public void inicializarElementosCamposTipoSexo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoSexo = new JLabelMe();
		jLabelIdTipoSexo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoSexo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoSexo.setToolTipText(TipoSexoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoSexo= new GridBagLayout();

		this.jPanelidTipoSexo.setLayout(this.gridaBagLayoutTipoSexo);

		jLabelidTipoSexo = new JLabel();
		jLabelidTipoSexo.setText("Id");

		jLabelidTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoSexo = new JLabelMe();
		this.jLabelcodigoTipoSexo.setText(""+TipoSexoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoSexo.setToolTipText("Codigo");
		this.jLabelcodigoTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoSexo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoSexo.setToolTipText(TipoSexoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoSexo = new GridBagLayout();
		this.jPanelcodigoTipoSexo.setLayout(this.gridaBagLayoutTipoSexo);


		jTextFieldcodigoTipoSexo= new JTextFieldMe();

		jTextFieldcodigoTipoSexo.setEnabled(false);
		jTextFieldcodigoTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoSexoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoSexoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoSexoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoSexoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoSexoBusqueda.setText("U");
		this.jButtoncodigoTipoSexoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoSexoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoSexoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoSexo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoSexo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoSexoBusqueda"));

		if(this.tiposexoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoSexoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoSexo = new JLabelMe();
		this.jLabelnombreTipoSexo.setText(""+TipoSexoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoSexo.setToolTipText("Nombre");
		this.jLabelnombreTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoSexo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoSexo.setToolTipText(TipoSexoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoSexo = new GridBagLayout();
		this.jPanelnombreTipoSexo.setLayout(this.gridaBagLayoutTipoSexo);


		jTextAreanombreTipoSexo= new JTextAreaMe();
		jTextAreanombreTipoSexo.setEnabled(false);
		jTextAreanombreTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSexo.setLineWrap(true);
		jTextAreanombreTipoSexo.setWrapStyleWord(true);
		jTextAreanombreTipoSexo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoSexo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoSexo = new JScrollPane(jTextAreanombreTipoSexo);
		jscrollPanenombreTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoSexoBusqueda= new JButtonMe();
		this.jButtonnombreTipoSexoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoSexoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoSexoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoSexoBusqueda.setText("U");
		this.jButtonnombreTipoSexoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoSexoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoSexoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoSexo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoSexo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoSexoBusqueda"));

		if(this.tiposexoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoSexoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoSexo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoSexo = new JLabelMe();
		this.jLabelid_empresaTipoSexo.setText(""+TipoSexoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoSexo.setToolTipText("Empresa");
		this.jLabelid_empresaTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoSexo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoSexo.setToolTipText(TipoSexoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoSexo = new GridBagLayout();
		this.jPanelid_empresaTipoSexo.setLayout(this.gridaBagLayoutTipoSexo);


		jComboBoxid_empresaTipoSexo= new JComboBoxMe();
		jComboBoxid_empresaTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoSexo.setEnabled(false);

		this.jButtonid_empresaTipoSexo= new JButtonMe();
		this.jButtonid_empresaTipoSexo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSexo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSexo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSexo.setText("Buscar");
		this.jButtonid_empresaTipoSexo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoSexo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSexo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoSexo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSexo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSexo"));

		this.jButtonid_empresaTipoSexoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoSexoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSexoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSexoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoSexoBusqueda.setText("U");
		this.jButtonid_empresaTipoSexoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoSexoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSexoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoSexo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSexo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSexoBusqueda"));

		if(this.tiposexoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoSexoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoSexoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoSexoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSexoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSexoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoSexoUpdate.setText("U");
		this.jButtonid_empresaTipoSexoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoSexoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSexoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoSexo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSexo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSexoUpdate"));



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
		//this.jInternalFrameDetalleTipoSexo = new TipoSexoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Sexo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoSexo= new GridBagLayout();
		

		
		String sToolTipTipoSexo="";
		sToolTipTipoSexo=TipoSexoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoSexo+="(Cartera.TipoSexo)";
		}
		
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoSexo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoSexo = new JButtonMe();
		this.jButtonModificarTipoSexo = new JButtonMe();
        this.jButtonActualizarTipoSexo = new JButtonMe();
        this.jButtonEliminarTipoSexo = new JButtonMe();
        this.jButtonCancelarTipoSexo = new JButtonMe();
        this.jButtonGuardarCambiosTipoSexo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoSexo = new JButtonMe();
		this.jButtonCerrarTipoSexo = new JButtonMe();
		
		this.jScrollPanelDatosTipoSexo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoSexo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoSexo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Sexo";
		
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sexos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoSexo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoSexo.setName("jPanelCamposTipoSexo"); 

		this.jPanelCamposOcultosTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoSexo.setName("jPanelCamposOcultosTipoSexo"); 

        this.jPanelAccionesTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoSexo.setToolTipText("Acciones");
        this.jPanelAccionesTipoSexo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoSexo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoSexo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoSexo.setText("Nuevo");
		this.jButtonModificarTipoSexo.setText("Editar");
        this.jButtonActualizarTipoSexo.setText("Actualizar");
        this.jButtonEliminarTipoSexo.setText("Eliminar");
        this.jButtonCancelarTipoSexo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoSexo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoSexo.setText("Guardar");
		this.jButtonCerrarTipoSexo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoSexo,"nuevo_button","Nuevo",this.tiposexoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoSexo,"modificar_button","Editar",this.tiposexoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoSexo,"actualizar_button","Actualizar",this.tiposexoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoSexo,"eliminar_button","Eliminar",this.tiposexoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoSexo,"cancelar_button","Cancelar",this.tiposexoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoSexo,"guardarcambios_button","Guardar",this.tiposexoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoSexo,"guardarcambiostabla_button","Guardar",this.tiposexoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoSexo,"cerrar_button","Salir",this.tiposexoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoSexo.setToolTipText("Nuevo"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoSexo.setToolTipText("Editar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoSexo.setToolTipText("Actualizar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoSexo.setToolTipText("Eliminar)"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoSexo.setToolTipText("Cancelar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoSexo.setToolTipText("Guardar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoSexo.setToolTipText("Guardar"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoSexo.setToolTipText("Salir"+" "+TipoSexoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoSexo";
		inputMap = this.jButtonNuevoTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoSexo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoSexo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoSexo";
		inputMap = this.jButtonActualizarTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoSexo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoSexo";
		inputMap = this.jButtonEliminarTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoSexo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoSexo";
		inputMap = this.jButtonCancelarTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoSexo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoSexo";
		inputMap = this.jButtonCerrarTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoSexo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoSexo";
		inputMap = this.jButtonGuardarCambiosTablaTipoSexo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoSexo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoSexo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoSexo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoSexo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoSexo.setToolTipText("Nuevo TipoSexo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoSexo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoSexo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoSexo.setToolTipText("Sin Cerrar Ventana TipoSexo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoSexo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoSexo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoSexo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoSexo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoSexo.setText("Accion");
		this.jComboBoxTiposAccionesTipoSexo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoSexo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoSexo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoSexo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoSexo = new JLabelMe();
		
		this.jLabelAccionesTipoSexo.setText("Acciones");		
		this.jLabelAccionesTipoSexo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSexo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSexo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoSexo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoSexo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoSexo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoSexo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoSexo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSexo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSexo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoSexo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoSexo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoSexo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoSexo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoSexo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoSexo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoSexo = new GridBagLayout();
		
		this.jPanelCamposTipoSexo.setLayout(gridaBagLayoutCamposTipoSexo);
		this.jPanelCamposOcultosTipoSexo.setLayout(gridaBagLayoutCamposOcultosTipoSexo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSexo.gridy = 0;
	this.gridBagConstraintsTipoSexo.gridx = 0;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoSexo.add(jLabelIdTipoSexo, this.gridBagConstraintsTipoSexo);



	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSexo.gridy = 0;
	this.gridBagConstraintsTipoSexo.gridx = 1;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoSexo.add(jLabelidTipoSexo, this.gridBagConstraintsTipoSexo);


	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSexo.gridy = 0;
	this.gridBagConstraintsTipoSexo.gridx = 0;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoSexo.add(jLabelid_empresaTipoSexo, this.gridBagConstraintsTipoSexo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		//this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSexo.gridy = 0;
		this.gridBagConstraintsTipoSexo.gridx = 2;
		this.gridBagConstraintsTipoSexo.ipadx = 0;
		this.gridBagConstraintsTipoSexo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoSexo.add(jButtonid_empresaTipoSexoBusqueda, this.gridBagConstraintsTipoSexo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		//this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSexo.gridy = 0;
		this.gridBagConstraintsTipoSexo.gridx = 3;
		this.gridBagConstraintsTipoSexo.ipadx = 0;
		this.gridBagConstraintsTipoSexo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoSexo.add(jButtonid_empresaTipoSexoUpdate, this.gridBagConstraintsTipoSexo);
	}

	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSexo.gridy = 0;
	this.gridBagConstraintsTipoSexo.gridx = 1;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoSexo.add(jComboBoxid_empresaTipoSexo, this.gridBagConstraintsTipoSexo);


	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSexo.gridy = 0;
	this.gridBagConstraintsTipoSexo.gridx = 0;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoSexo.add(jLabelcodigoTipoSexo, this.gridBagConstraintsTipoSexo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		//this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSexo.gridy = 0;
		this.gridBagConstraintsTipoSexo.gridx = 2;
		this.gridBagConstraintsTipoSexo.ipadx = 0;
		this.gridBagConstraintsTipoSexo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoSexo.add(jButtoncodigoTipoSexoBusqueda, this.gridBagConstraintsTipoSexo);
	}

	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSexo.gridy = 0;
	this.gridBagConstraintsTipoSexo.gridx = 1;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoSexo.add(jTextFieldcodigoTipoSexo, this.gridBagConstraintsTipoSexo);


	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSexo.gridy = 0;
	this.gridBagConstraintsTipoSexo.gridx = 0;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoSexo.add(jLabelnombreTipoSexo, this.gridBagConstraintsTipoSexo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		//this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSexo.gridy = 0;
		this.gridBagConstraintsTipoSexo.gridx = 2;
		this.gridBagConstraintsTipoSexo.ipadx = 0;
		this.gridBagConstraintsTipoSexo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoSexo.add(jButtonnombreTipoSexoBusqueda, this.gridBagConstraintsTipoSexo);
	}

	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSexo.gridy = 0;
	this.gridBagConstraintsTipoSexo.gridx = 1;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoSexo.add(jscrollPanenombreTipoSexo, this.gridBagConstraintsTipoSexo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSexo.gridy = iYPanelCamposTipoSexo;
	this.gridBagConstraintsTipoSexo.gridx = iXPanelCamposTipoSexo++;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSexo.add(this.jPanelidTipoSexo, this.gridBagConstraintsTipoSexo);



	if(iXPanelCamposTipoSexo % 1==0) {
		iXPanelCamposTipoSexo=0;
		iYPanelCamposTipoSexo++;
	}
	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSexo.gridy = iYPanelCamposTipoSexo;
	this.gridBagConstraintsTipoSexo.gridx = iXPanelCamposTipoSexo++;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSexo.add(this.jPanelcodigoTipoSexo, this.gridBagConstraintsTipoSexo);



	if(iXPanelCamposTipoSexo % 1==0) {
		iXPanelCamposTipoSexo=0;
		iYPanelCamposTipoSexo++;
	}
	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSexo.gridy = iYPanelCamposTipoSexo;
	this.gridBagConstraintsTipoSexo.gridx = iXPanelCamposTipoSexo++;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSexo.add(this.jPanelnombreTipoSexo, this.gridBagConstraintsTipoSexo);



	if(iXPanelCamposTipoSexo % 1==0) {
		iXPanelCamposTipoSexo=0;
		iYPanelCamposTipoSexo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSexo.gridy = iYPanelCamposOcultosTipoSexo;
	this.gridBagConstraintsTipoSexo.gridx = iXPanelCamposOcultosTipoSexo++;
	this.gridBagConstraintsTipoSexo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSexo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoSexo.add(this.jPanelid_empresaTipoSexo, this.gridBagConstraintsTipoSexo);



	if(iXPanelCamposOcultosTipoSexo % 1==0) {
		iXPanelCamposOcultosTipoSexo=0;
		iYPanelCamposOcultosTipoSexo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoSexo= new GridBagLayout();
		this.jPanelAccionesTipoSexo.setLayout(gridaBagLayoutAccionesTipoSexo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoSexo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoSexo.setLayout(gridaBagLayoutAccionesFormularioTipoSexo);
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoSexo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoSexo.add(this.jComboBoxTiposAccionesFormularioTipoSexo, this.gridBagConstraintsTipoSexo);

		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoSexo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoSexo.add(this.jCheckBoxPostAccionNuevoTipoSexo, this.gridBagConstraintsTipoSexo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiposexoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoSexo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoSexo.add(this.jCheckBoxPostAccionSinCerrarTipoSexo, this.gridBagConstraintsTipoSexo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiposexoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoSexo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoSexo.add(this.jCheckBoxPostAccionSinMensajeTipoSexo, this.gridBagConstraintsTipoSexo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = 0;
		this.gridBagConstraintsTipoSexo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoSexo.add(this.jButtonModificarTipoSexo, this.gridBagConstraintsTipoSexo);							

		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSexo.gridy = 0;
		this.gridBagConstraintsTipoSexo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoSexo.add(this.jButtonEliminarTipoSexo, this.gridBagConstraintsTipoSexo);
		
			
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = 0;		
		this.gridBagConstraintsTipoSexo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoSexo.add(this.jButtonActualizarTipoSexo, this.gridBagConstraintsTipoSexo);


		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = 0;		
		this.gridBagConstraintsTipoSexo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoSexo.add(this.jButtonGuardarCambiosTipoSexo, this.gridBagConstraintsTipoSexo);	
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = 0;		
		this.gridBagConstraintsTipoSexo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoSexo.add(this.jButtonCancelarTipoSexo, this.gridBagConstraintsTipoSexo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoSexo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoSexo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();						
			this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSexo.gridx = 0;		
			//this.gridBagConstraintsTipoSexo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoSexo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoSexo.gridx =0;
		this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoSexo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoSexo, this.gridBagConstraintsTipoSexo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoSexoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoSexo = new TipoSexoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Sexo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Sexo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Sexo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoSexoModel tiposexoModel=new TipoSexoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoSexoModel.TipoSexoFocusTraversalPolicy tiposexoFocusTraversalPolicy = tiposexoModel.new TipoSexoFocusTraversalPolicy(this);
			
			//tiposexoFocusTraversalPolicy.settiposexoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiposexoModel);
			
			
			this.jContentPaneDetalleTipoSexo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoSexo = new GridBagLayout();	
			this.jContentPaneDetalleTipoSexo.setLayout(gridaBagLayoutDetalleTipoSexo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoSexo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoSexo = new GridBagConstraints();
				this.gridBagConstraintsTipoSexo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoSexo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoSexo.add(jTtoolBarDetalleTipoSexo, gridBagConstraintsTipoSexo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoSexo=   new JScrollPane(jContentPaneDetalleTipoSexo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoSexo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSexo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSexo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoSexo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoSexo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSexo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSexo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoSexo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoSexo.gridx = 0;
	        
			this.jContentPaneDetalleTipoSexo.add(jPanelCamposTipoSexo, gridBagConstraintsTipoSexo);
			
			
			
			
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
						&& tiposexoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tiposexoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoSexo= new GridBagConstraints();
						this.gridBagConstraintsTipoSexo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoSexo.gridx = 0;
						this.jContentPaneDetalleTipoSexo.add(this.jTabbedPaneRelacionesTipoSexo, this.gridBagConstraintsTipoSexo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoSexo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoSexo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoSexo = new GridBagConstraints();
					this.gridBagConstraintsTipoSexo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoSexo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoSexo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoSexo.add(jPanelCamposOcultosTipoSexo, gridBagConstraintsTipoSexo);
				
					this.jPanelCamposOcultosTipoSexo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoSexo.gridx = 0;
	        this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoSexo.add(this.jPanelAccionesFormularioTipoSexo, this.gridBagConstraintsTipoSexo);							
			
			
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
	        this.gridBagConstraintsTipoSexo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoSexo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoSexo.add(this.jPanelAccionesTipoSexo, this.gridBagConstraintsTipoSexo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoSexo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoSexo=   new JScrollPane(this.jPanelCamposTipoSexo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoSexo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSexo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSexo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoSexo.gridx = 0;
			this.gridBagConstraintsTipoSexo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoSexo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoSexo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoSexo, this.gridBagConstraintsTipoSexo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoSexo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoSexo, this.gridBagConstraintsTipoSexo);			
			
			this.gridBagConstraintsTipoSexo = new GridBagConstraints();
			this.gridBagConstraintsTipoSexo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoSexo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoSexo, this.gridBagConstraintsTipoSexo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSexo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoSexo, this.gridBagConstraintsTipoSexo);
			
			
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSexo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoSexo, this.gridBagConstraintsTipoSexo);
		
			
		this.gridBagConstraintsTipoSexo = new GridBagConstraints();
		this.gridBagConstraintsTipoSexo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoSexo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoSexo, this.gridBagConstraintsTipoSexo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoSexo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoSexo;
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
