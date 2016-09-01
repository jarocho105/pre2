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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.PartidaPresuConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class PartidaPresuDetalleFormJInternalFrame extends PartidaPresuBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePartidaPresu;
	
	protected JMenuBar jmenuBarDetallePartidaPresu;
	
	protected JMenu jmenuDetallePartidaPresu;
	protected JMenu jmenuDetalleArchivoPartidaPresu;
	protected JMenu jmenuDetalleAccionesPartidaPresu;
	protected JMenu jmenuDetalleDatosPartidaPresu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPartidaPresu;	
	protected GridBagConstraints gridBagConstraintsPartidaPresu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PartidaPresuBeanSwingJInternalFrameAdditional jInternalFrameDetallePartidaPresu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PartidaPresuSessionBean partidapresuSessionBean;
	
	

	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;
	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleActivoFijo=false;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public PartidaPresuLogic partidapresuLogic;
	
	public JScrollPane jScrollPanelDatosPartidaPresu;
	public JScrollPane jScrollPanelDatosEdicionPartidaPresu;
	public JScrollPane jScrollPanelDatosGeneralPartidaPresu;
	
	protected JPanel jPanelCamposPartidaPresu;    
	protected JPanel jPanelCamposOcultosPartidaPresu;    	
	protected JPanel jPanelAccionesPartidaPresu;
	protected JPanel jPanelAccionesFormularioPartidaPresu;
    
	
	
	protected Integer iXPanelCamposPartidaPresu=0;
	protected Integer iYPanelCamposPartidaPresu=0;
	
	protected Integer iXPanelCamposOcultosPartidaPresu=0;
	protected Integer iYPanelCamposOcultosPartidaPresu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPartidaPresu;
	public JButton jButtonModificarPartidaPresu;
	public JButton jButtonActualizarPartidaPresu;
    public JButton jButtonEliminarPartidaPresu;
	public JButton jButtonCancelarPartidaPresu;
    public JButton jButtonGuardarCambiosPartidaPresu;
	public JButton jButtonGuardarCambiosTablaPartidaPresu;
	protected JButton jButtonCerrarPartidaPresu;
	
	
	protected JButton jButtonProcesarInformacionPartidaPresu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPartidaPresu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPartidaPresu;
	protected JCheckBox jCheckBoxPostAccionSinMensajePartidaPresu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPartidaPresu;
	protected JButton jButtonModificarToolBarPartidaPresu;
	protected JButton jButtonActualizarToolBarPartidaPresu;
    protected JButton jButtonEliminarToolBarPartidaPresu;
	protected JButton jButtonCancelarToolBarPartidaPresu;
    protected JButton jButtonGuardarCambiosToolBarPartidaPresu;
	protected JButton jButtonGuardarCambiosTablaToolBarPartidaPresu;
	protected JButton jButtonMostrarOcultarTablaToolBarPartidaPresu;
	protected JButton jButtonCerrarToolBarPartidaPresu;
	
	protected JButton jButtonProcesarInformacionToolBarPartidaPresu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPartidaPresu;
	protected JMenuItem jMenuItemModificarPartidaPresu;
	protected JMenuItem jMenuItemActualizarPartidaPresu;
    protected JMenuItem jMenuItemEliminarPartidaPresu;
	protected JMenuItem jMenuItemCancelarPartidaPresu;
    protected JMenuItem jMenuItemGuardarCambiosPartidaPresu;
	protected JMenuItem jMenuItemGuardarCambiosTablaPartidaPresu;
	protected JMenuItem jMenuItemCerrarPartidaPresu;
	protected JMenuItem jMenuItemDetalleCerrarPartidaPresu;
	protected JMenuItem jMenuItemDetalleMostarOcultarPartidaPresu;
	
	protected JMenuItem jMenuItemProcesarInformacionPartidaPresu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPartidaPresu;
	protected JMenuItem jMenuItemMostrarOcultarPartidaPresu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPartidaPresu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPartidaPresu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPartidaPresu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPartidaPresu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPartidaPresu;
	public JLabel jLabelIdPartidaPresu;
	public JLabel jLabelidPartidaPresu;
	public JButton jButtonidPartidaPresuBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPartidaPresu;
	public JLabel jLabelcodigoPartidaPresu;
	public JTextField jTextFieldcodigoPartidaPresu;
	public JButton jButtoncodigoPartidaPresuBusqueda= new JButtonMe();

	public JPanel jPanelnombrePartidaPresu;
	public JLabel jLabelnombrePartidaPresu;
	public JTextArea jTextAreanombrePartidaPresu;
	public JScrollPane jscrollPanenombrePartidaPresu;
	public JButton jButtonnombrePartidaPresuBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPartidaPresu;
	public JLabel jLabelid_empresaPartidaPresu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPartidaPresu;
	public JButton jButtonid_empresaPartidaPresu= new JButtonMe();
	public JButton jButtonid_empresaPartidaPresuUpdate= new JButtonMe();
	public JButton jButtonid_empresaPartidaPresuBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPartidaPresu;
	
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
	
	public PartidaPresuDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPartidaPresu=new JPanel();
				this.jPanelAccionesFormularioPartidaPresu=new JPanel();
				this.jmenuBarDetallePartidaPresu=new JMenuBar();
				this.jTtoolBarDetallePartidaPresu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PartidaPresuDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PartidaPresu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PartidaPresuDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PartidaPresu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PartidaPresuDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PartidaPresu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PartidaPresuDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PartidaPresu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PartidaPresuDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PartidaPresu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPartidaPresu() {
		return this.jButtonActualizarToolBarPartidaPresu;
	}
	
	public JButton getjButtonEliminarToolBarPartidaPresu() {
		return this.jButtonEliminarToolBarPartidaPresu;
	}
	
	public JButton getjButtonCancelarToolBarPartidaPresu() {
		return this.jButtonCancelarToolBarPartidaPresu;
	}		
	
	public JButton getjButtonProcesarInformacionPartidaPresu() {
		return this.jButtonProcesarInformacionPartidaPresu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPartidaPresu)	{
		this.jButtonProcesarInformacionPartidaPresu = jButtonProcesarInformacionPartidaPresu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPartidaPresu() {
		return this.jComboBoxTiposAccionesPartidaPresu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPartidaPresu(
			JComboBox jComboBoxTiposRelacionesPartidaPresu) {
		this.jComboBoxTiposRelacionesPartidaPresu = jComboBoxTiposRelacionesPartidaPresu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPartidaPresu(
			JComboBox jComboBoxTiposAccionesPartidaPresu) {
		this.jComboBoxTiposAccionesPartidaPresu = jComboBoxTiposAccionesPartidaPresu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPartidaPresu() {
		return this.jComboBoxTiposAccionesFormularioPartidaPresu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPartidaPresu(
			JComboBox jComboBoxTiposAccionesFormularioPartidaPresu) {
		this.jComboBoxTiposAccionesFormularioPartidaPresu = jComboBoxTiposAccionesFormularioPartidaPresu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.partidapresuSessionBean=new PartidaPresuSessionBean();
		
		this.partidapresuSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.partidapresuSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.partidapresuSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PartidaPresuJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PartidaPresuJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PartidaPresuJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Partida Presupuestaria MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
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
	
		PartidaPresuJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePartidaPresu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPartidaPresu=new JButtonMe();
				this.jButtonModificarToolBarPartidaPresu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPartidaPresu,this.jTtoolBarDetallePartidaPresu,
							"actualizar","actualizar","Actualizar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPartidaPresu,this.jTtoolBarDetallePartidaPresu,
							"eliminar","eliminar","Eliminar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPartidaPresu,this.jTtoolBarDetallePartidaPresu,
							"cancelar","cancelar","Cancelar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPartidaPresu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPartidaPresu,this.jTtoolBarDetallePartidaPresu,
							"guardarcambios","guardarcambios","Guardar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePartidaPresu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePartidaPresu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPartidaPresu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPartidaPresu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPartidaPresu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPartidaPresu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPartidaPresu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPartidaPresu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPartidaPresu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPartidaPresu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPartidaPresu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPartidaPresu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPartidaPresu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPartidaPresu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPartidaPresu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPartidaPresu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPartidaPresu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPartidaPresu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPartidaPresu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPartidaPresu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPartidaPresu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPartidaPresu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPartidaPresu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPartidaPresu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPartidaPresu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPartidaPresu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPartidaPresu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPartidaPresu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPartidaPresu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPartidaPresu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPartidaPresu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPartidaPresu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPartidaPresu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPartidaPresu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPartidaPresu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPartidaPresu.add(this.jMenuItemDetalleCerrarPartidaPresu);
		
		this.jmenuDetalleAccionesPartidaPresu.add(this.jMenuItemActualizarPartidaPresu);
		this.jmenuDetalleAccionesPartidaPresu.add(this.jMenuItemEliminarPartidaPresu);
		this.jmenuDetalleAccionesPartidaPresu.add(this.jMenuItemCancelarPartidaPresu);		
		
		//this.jmenuDetalleDatosPartidaPresu.add(this.jMenuItemDetalleAbrirOrderByPartidaPresu);				
		this.jmenuDetalleDatosPartidaPresu.add(this.jMenuItemDetalleMostarOcultarPartidaPresu);				
				
		//this.jmenuDetalleAccionesPartidaPresu.add(this.jMenuItemGuardarCambiosPartidaPresu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePartidaPresu.add(this.jmenuDetalleArchivoPartidaPresu);		
		this.jmenuBarDetallePartidaPresu.add(this.jmenuDetalleAccionesPartidaPresu);		
		this.jmenuBarDetallePartidaPresu.add(this.jmenuDetalleDatosPartidaPresu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePartidaPresu.add(this.jmenuDetallePartidaPresu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePartidaPresu);				
	}
	
	
	public void inicializarElementosCamposPartidaPresu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPartidaPresu = new JLabelMe();
		jLabelIdPartidaPresu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPartidaPresu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPartidaPresu.setToolTipText(PartidaPresuConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPartidaPresu= new GridBagLayout();

		this.jPanelidPartidaPresu.setLayout(this.gridaBagLayoutPartidaPresu);

		jLabelidPartidaPresu = new JLabel();
		jLabelidPartidaPresu.setText("Id");

		jLabelidPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPartidaPresu = new JLabelMe();
		this.jLabelcodigoPartidaPresu.setText(""+PartidaPresuConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPartidaPresu.setToolTipText("Codigo");
		this.jLabelcodigoPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPartidaPresu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPartidaPresu.setToolTipText(PartidaPresuConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPartidaPresu = new GridBagLayout();
		this.jPanelcodigoPartidaPresu.setLayout(this.gridaBagLayoutPartidaPresu);


		jTextFieldcodigoPartidaPresu= new JTextFieldMe();

		jTextFieldcodigoPartidaPresu.setEnabled(false);
		jTextFieldcodigoPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPartidaPresuBusqueda= new JButtonMe();
		this.jButtoncodigoPartidaPresuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPartidaPresuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPartidaPresuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPartidaPresuBusqueda.setText("U");
		this.jButtoncodigoPartidaPresuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPartidaPresuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPartidaPresuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPartidaPresu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPartidaPresu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPartidaPresuBusqueda"));

		if(this.partidapresuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPartidaPresuBusqueda.setVisible(false);		}


					
		this.jLabelnombrePartidaPresu = new JLabelMe();
		this.jLabelnombrePartidaPresu.setText(""+PartidaPresuConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePartidaPresu.setToolTipText("Nombre");
		this.jLabelnombrePartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePartidaPresu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePartidaPresu.setToolTipText(PartidaPresuConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPartidaPresu = new GridBagLayout();
		this.jPanelnombrePartidaPresu.setLayout(this.gridaBagLayoutPartidaPresu);


		jTextAreanombrePartidaPresu= new JTextAreaMe();
		jTextAreanombrePartidaPresu.setEnabled(false);
		jTextAreanombrePartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePartidaPresu.setLineWrap(true);
		jTextAreanombrePartidaPresu.setWrapStyleWord(true);
		jTextAreanombrePartidaPresu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePartidaPresu.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePartidaPresu = new JScrollPane(jTextAreanombrePartidaPresu);
		jscrollPanenombrePartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombrePartidaPresuBusqueda= new JButtonMe();
		this.jButtonnombrePartidaPresuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePartidaPresuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePartidaPresuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePartidaPresuBusqueda.setText("U");
		this.jButtonnombrePartidaPresuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePartidaPresuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePartidaPresuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePartidaPresu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePartidaPresu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePartidaPresuBusqueda"));

		if(this.partidapresuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePartidaPresuBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPartidaPresu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPartidaPresu = new JLabelMe();
		this.jLabelid_empresaPartidaPresu.setText(""+PartidaPresuConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPartidaPresu.setToolTipText("Empresa");
		this.jLabelid_empresaPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPartidaPresu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPartidaPresu.setToolTipText(PartidaPresuConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPartidaPresu = new GridBagLayout();
		this.jPanelid_empresaPartidaPresu.setLayout(this.gridaBagLayoutPartidaPresu);


		jComboBoxid_empresaPartidaPresu= new JComboBoxMe();
		jComboBoxid_empresaPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPartidaPresu.setEnabled(false);

		this.jButtonid_empresaPartidaPresu= new JButtonMe();
		this.jButtonid_empresaPartidaPresu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPartidaPresu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPartidaPresu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPartidaPresu.setText("Buscar");
		this.jButtonid_empresaPartidaPresu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPartidaPresu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPartidaPresu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPartidaPresu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPartidaPresu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPartidaPresu"));

		this.jButtonid_empresaPartidaPresuBusqueda= new JButtonMe();
		this.jButtonid_empresaPartidaPresuBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPartidaPresuBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPartidaPresuBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPartidaPresuBusqueda.setText("U");
		this.jButtonid_empresaPartidaPresuBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPartidaPresuBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPartidaPresuBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPartidaPresu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPartidaPresu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPartidaPresuBusqueda"));

		if(this.partidapresuSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPartidaPresuBusqueda.setVisible(false);		}

		this.jButtonid_empresaPartidaPresuUpdate= new JButtonMe();
		this.jButtonid_empresaPartidaPresuUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPartidaPresuUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPartidaPresuUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPartidaPresuUpdate.setText("U");
		this.jButtonid_empresaPartidaPresuUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPartidaPresuUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPartidaPresuUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPartidaPresu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPartidaPresu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPartidaPresuUpdate"));



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
		//this.jInternalFrameDetallePartidaPresu = new PartidaPresuBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Partida Presupuestaria DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPartidaPresu= new GridBagLayout();
		

		
		String sToolTipPartidaPresu="";
		sToolTipPartidaPresu=PartidaPresuConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPartidaPresu+="(ActivosFijos.PartidaPresu)";
		}
		
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
			sToolTipPartidaPresu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPartidaPresu = new JButtonMe();
		this.jButtonModificarPartidaPresu = new JButtonMe();
        this.jButtonActualizarPartidaPresu = new JButtonMe();
        this.jButtonEliminarPartidaPresu = new JButtonMe();
        this.jButtonCancelarPartidaPresu = new JButtonMe();
        this.jButtonGuardarCambiosPartidaPresu = new JButtonMe();
		this.jButtonGuardarCambiosTablaPartidaPresu = new JButtonMe();
		this.jButtonCerrarPartidaPresu = new JButtonMe();
		
		this.jScrollPanelDatosPartidaPresu = new JScrollPane();   
        this.jScrollPanelDatosEdicionPartidaPresu = new JScrollPane();
		this.jScrollPanelDatosGeneralPartidaPresu = new JScrollPane();
				
		
		
		this.jPanelCamposPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Partida Presupuestaria";
		
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Partida Presupuestarias" + this.sPath));
		} else {
			this.jScrollPanelDatosPartidaPresu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPartidaPresu.setName("jPanelCamposPartidaPresu"); 

		this.jPanelCamposOcultosPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPartidaPresu.setName("jPanelCamposOcultosPartidaPresu"); 

        this.jPanelAccionesPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPartidaPresu.setToolTipText("Acciones");
        this.jPanelAccionesPartidaPresu.setName("Acciones"); 

		this.jPanelAccionesFormularioPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPartidaPresu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPartidaPresu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPartidaPresu.setText("Nuevo");
		this.jButtonModificarPartidaPresu.setText("Editar");
        this.jButtonActualizarPartidaPresu.setText("Actualizar");
        this.jButtonEliminarPartidaPresu.setText("Eliminar");
        this.jButtonCancelarPartidaPresu.setText("Cancelar");
        this.jButtonGuardarCambiosPartidaPresu.setText("Guardar");
		this.jButtonGuardarCambiosTablaPartidaPresu.setText("Guardar");
		this.jButtonCerrarPartidaPresu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPartidaPresu,"nuevo_button","Nuevo",this.partidapresuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPartidaPresu,"modificar_button","Editar",this.partidapresuSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPartidaPresu,"actualizar_button","Actualizar",this.partidapresuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPartidaPresu,"eliminar_button","Eliminar",this.partidapresuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPartidaPresu,"cancelar_button","Cancelar",this.partidapresuSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPartidaPresu,"guardarcambios_button","Guardar",this.partidapresuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPartidaPresu,"guardarcambiostabla_button","Guardar",this.partidapresuSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPartidaPresu,"cerrar_button","Salir",this.partidapresuSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPartidaPresu.setToolTipText("Nuevo"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPartidaPresu.setToolTipText("Editar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPartidaPresu.setToolTipText("Actualizar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPartidaPresu.setToolTipText("Eliminar)"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPartidaPresu.setToolTipText("Cancelar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPartidaPresu.setToolTipText("Guardar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPartidaPresu.setToolTipText("Guardar"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPartidaPresu.setToolTipText("Salir"+" "+PartidaPresuConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPartidaPresu";
		inputMap = this.jButtonNuevoPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPartidaPresu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPartidaPresu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPartidaPresu";
		inputMap = this.jButtonActualizarPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPartidaPresu"));
		
		//ELIMINAR
		sMapKey = "EliminarPartidaPresu";
		inputMap = this.jButtonEliminarPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPartidaPresu"));
		
		//CANCELAR	
		sMapKey = "CancelarPartidaPresu";
		inputMap = this.jButtonCancelarPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPartidaPresu"));
		
		//CERRAR		
		sMapKey = "CerrarPartidaPresu";
		inputMap = this.jButtonCerrarPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPartidaPresu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPartidaPresu";
		inputMap = this.jButtonGuardarCambiosTablaPartidaPresu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPartidaPresu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPartidaPresu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPartidaPresu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPartidaPresu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPartidaPresu.setToolTipText("Nuevo PartidaPresu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPartidaPresu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPartidaPresu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPartidaPresu.setToolTipText("Sin Cerrar Ventana PartidaPresu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePartidaPresu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePartidaPresu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePartidaPresu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPartidaPresu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPartidaPresu.setText("Accion");
		this.jComboBoxTiposAccionesPartidaPresu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPartidaPresu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPartidaPresu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPartidaPresu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPartidaPresu = new JLabelMe();
		
		this.jLabelAccionesPartidaPresu.setText("Acciones");		
		this.jLabelAccionesPartidaPresu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPartidaPresu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPartidaPresu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPartidaPresu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPartidaPresu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPartidaPresu=new JTabbedPane();
		this.jTabbedPaneRelacionesPartidaPresu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPartidaPresu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPartidaPresu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPartidaPresu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPartidaPresu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPartidaPresu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPartidaPresu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPartidaPresu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPartidaPresu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPartidaPresu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPartidaPresu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPartidaPresu = new GridBagLayout();
		
		this.jPanelCamposPartidaPresu.setLayout(gridaBagLayoutCamposPartidaPresu);
		this.jPanelCamposOcultosPartidaPresu.setLayout(gridaBagLayoutCamposOcultosPartidaPresu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPartidaPresu.gridy = 0;
	this.gridBagConstraintsPartidaPresu.gridx = 0;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPartidaPresu.add(jLabelIdPartidaPresu, this.gridBagConstraintsPartidaPresu);



	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPartidaPresu.gridy = 0;
	this.gridBagConstraintsPartidaPresu.gridx = 1;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPartidaPresu.add(jLabelidPartidaPresu, this.gridBagConstraintsPartidaPresu);


	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPartidaPresu.gridy = 0;
	this.gridBagConstraintsPartidaPresu.gridx = 0;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPartidaPresu.add(jLabelid_empresaPartidaPresu, this.gridBagConstraintsPartidaPresu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		//this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = 0;
		this.gridBagConstraintsPartidaPresu.gridx = 2;
		this.gridBagConstraintsPartidaPresu.ipadx = 0;
		this.gridBagConstraintsPartidaPresu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPartidaPresu.add(jButtonid_empresaPartidaPresuBusqueda, this.gridBagConstraintsPartidaPresu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		//this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = 0;
		this.gridBagConstraintsPartidaPresu.gridx = 3;
		this.gridBagConstraintsPartidaPresu.ipadx = 0;
		this.gridBagConstraintsPartidaPresu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPartidaPresu.add(jButtonid_empresaPartidaPresuUpdate, this.gridBagConstraintsPartidaPresu);
	}

	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPartidaPresu.gridy = 0;
	this.gridBagConstraintsPartidaPresu.gridx = 1;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPartidaPresu.add(jComboBoxid_empresaPartidaPresu, this.gridBagConstraintsPartidaPresu);


	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPartidaPresu.gridy = 0;
	this.gridBagConstraintsPartidaPresu.gridx = 0;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPartidaPresu.add(jLabelcodigoPartidaPresu, this.gridBagConstraintsPartidaPresu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		//this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = 0;
		this.gridBagConstraintsPartidaPresu.gridx = 2;
		this.gridBagConstraintsPartidaPresu.ipadx = 0;
		this.gridBagConstraintsPartidaPresu.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPartidaPresu.add(jButtoncodigoPartidaPresuBusqueda, this.gridBagConstraintsPartidaPresu);
	}

	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPartidaPresu.gridy = 0;
	this.gridBagConstraintsPartidaPresu.gridx = 1;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPartidaPresu.add(jTextFieldcodigoPartidaPresu, this.gridBagConstraintsPartidaPresu);


	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPartidaPresu.gridy = 0;
	this.gridBagConstraintsPartidaPresu.gridx = 0;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePartidaPresu.add(jLabelnombrePartidaPresu, this.gridBagConstraintsPartidaPresu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		//this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPartidaPresu.gridy = 0;
		this.gridBagConstraintsPartidaPresu.gridx = 2;
		this.gridBagConstraintsPartidaPresu.ipadx = 0;
		this.gridBagConstraintsPartidaPresu.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePartidaPresu.add(jButtonnombrePartidaPresuBusqueda, this.gridBagConstraintsPartidaPresu);
	}

	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPartidaPresu.gridy = 0;
	this.gridBagConstraintsPartidaPresu.gridx = 1;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePartidaPresu.add(jscrollPanenombrePartidaPresu, this.gridBagConstraintsPartidaPresu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPartidaPresu.gridy = iYPanelCamposPartidaPresu;
	this.gridBagConstraintsPartidaPresu.gridx = iXPanelCamposPartidaPresu++;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPartidaPresu.add(this.jPanelidPartidaPresu, this.gridBagConstraintsPartidaPresu);



	if(iXPanelCamposPartidaPresu % 1==0) {
		iXPanelCamposPartidaPresu=0;
		iYPanelCamposPartidaPresu++;
	}
	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPartidaPresu.gridy = iYPanelCamposPartidaPresu;
	this.gridBagConstraintsPartidaPresu.gridx = iXPanelCamposPartidaPresu++;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPartidaPresu.add(this.jPanelcodigoPartidaPresu, this.gridBagConstraintsPartidaPresu);



	if(iXPanelCamposPartidaPresu % 1==0) {
		iXPanelCamposPartidaPresu=0;
		iYPanelCamposPartidaPresu++;
	}
	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPartidaPresu.gridy = iYPanelCamposPartidaPresu;
	this.gridBagConstraintsPartidaPresu.gridx = iXPanelCamposPartidaPresu++;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPartidaPresu.add(this.jPanelnombrePartidaPresu, this.gridBagConstraintsPartidaPresu);



	if(iXPanelCamposPartidaPresu % 1==0) {
		iXPanelCamposPartidaPresu=0;
		iYPanelCamposPartidaPresu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPartidaPresu.gridy = iYPanelCamposOcultosPartidaPresu;
	this.gridBagConstraintsPartidaPresu.gridx = iXPanelCamposOcultosPartidaPresu++;
	this.gridBagConstraintsPartidaPresu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPartidaPresu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPartidaPresu.add(this.jPanelid_empresaPartidaPresu, this.gridBagConstraintsPartidaPresu);



	if(iXPanelCamposOcultosPartidaPresu % 1==0) {
		iXPanelCamposOcultosPartidaPresu=0;
		iYPanelCamposOcultosPartidaPresu++;
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
			
		GridBagLayout gridaBagLayoutAccionesPartidaPresu= new GridBagLayout();
		this.jPanelAccionesPartidaPresu.setLayout(gridaBagLayoutAccionesPartidaPresu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPartidaPresu= new GridBagLayout();
		this.jPanelAccionesFormularioPartidaPresu.setLayout(gridaBagLayoutAccionesFormularioPartidaPresu);
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPartidaPresu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPartidaPresu.add(this.jComboBoxTiposAccionesFormularioPartidaPresu, this.gridBagConstraintsPartidaPresu);

		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPartidaPresu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPartidaPresu.add(this.jCheckBoxPostAccionNuevoPartidaPresu, this.gridBagConstraintsPartidaPresu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.partidapresuSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPartidaPresu.add(this.jCheckBoxPostAccionSinCerrarPartidaPresu, this.gridBagConstraintsPartidaPresu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.partidapresuSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.partidapresuSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPartidaPresu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPartidaPresu.add(this.jCheckBoxPostAccionSinMensajePartidaPresu, this.gridBagConstraintsPartidaPresu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = 0;
		this.gridBagConstraintsPartidaPresu.gridx = iPosXAccion++;
			
		this.jPanelAccionesPartidaPresu.add(this.jButtonModificarPartidaPresu, this.gridBagConstraintsPartidaPresu);							

		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPartidaPresu.gridy = 0;
		this.gridBagConstraintsPartidaPresu.gridx =iPosXAccion++;
			
		this.jPanelAccionesPartidaPresu.add(this.jButtonEliminarPartidaPresu, this.gridBagConstraintsPartidaPresu);
		
			
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = 0;		
		this.gridBagConstraintsPartidaPresu.gridx = iPosXAccion++;
		
		this.jPanelAccionesPartidaPresu.add(this.jButtonActualizarPartidaPresu, this.gridBagConstraintsPartidaPresu);


		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = 0;		
		this.gridBagConstraintsPartidaPresu.gridx = iPosXAccion++;
		
		this.jPanelAccionesPartidaPresu.add(this.jButtonGuardarCambiosPartidaPresu, this.gridBagConstraintsPartidaPresu);	
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = 0;		
		this.gridBagConstraintsPartidaPresu.gridx =iPosXAccion++;
		
		this.jPanelAccionesPartidaPresu.add(this.jButtonCancelarPartidaPresu, this.gridBagConstraintsPartidaPresu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPartidaPresu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPartidaPresu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.partidapresuSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();						
			this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPartidaPresu.gridx = 0;		
			//this.gridBagConstraintsPartidaPresu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPartidaPresu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPartidaPresu.gridx =0;
		this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPartidaPresu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPartidaPresu, this.gridBagConstraintsPartidaPresu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PartidaPresuJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePartidaPresu = new PartidaPresuBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Partida Presupuestaria DATOS");
			
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
			
	        //this.setTitle("[FOR] - Partida Presupuestaria DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Partida Presupuestaria Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PartidaPresuModel partidapresuModel=new PartidaPresuModel(this);
			
			//SI USARA CLASE INTERNA
			//PartidaPresuModel.PartidaPresuFocusTraversalPolicy partidapresuFocusTraversalPolicy = partidapresuModel.new PartidaPresuFocusTraversalPolicy(this);
			
			//partidapresuFocusTraversalPolicy.setpartidapresuJInternalFrame(this);
			
			this.setFocusTraversalPolicy(partidapresuModel);
			
			
			this.jContentPaneDetallePartidaPresu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePartidaPresu = new GridBagLayout();	
			this.jContentPaneDetallePartidaPresu.setLayout(gridaBagLayoutDetallePartidaPresu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPartidaPresu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
				this.gridBagConstraintsPartidaPresu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPartidaPresu.gridx = 0;
					
				
				this.jContentPaneDetallePartidaPresu.add(jTtoolBarDetallePartidaPresu, gridBagConstraintsPartidaPresu);								
				
}
			
			this.jScrollPanelDatosEdicionPartidaPresu=   new JScrollPane(jContentPaneDetallePartidaPresu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPartidaPresu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPartidaPresu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPartidaPresu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPartidaPresu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPartidaPresu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPartidaPresu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPartidaPresu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPartidaPresu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPartidaPresu.gridx = 0;
	        
			this.jContentPaneDetallePartidaPresu.add(jPanelCamposPartidaPresu, gridBagConstraintsPartidaPresu);
			
			
			
			
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
						&& partidapresuSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(this.puedeCargarPorParteDetalleActivoFijo,false,-1);
					
					if(this.partidapresuSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPartidaPresu= new GridBagConstraints();
						this.gridBagConstraintsPartidaPresu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPartidaPresu.gridx = 0;
						this.jContentPaneDetallePartidaPresu.add(this.jTabbedPaneRelacionesPartidaPresu, this.gridBagConstraintsPartidaPresu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPartidaPresu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPartidaPresu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
					this.gridBagConstraintsPartidaPresu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPartidaPresu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPartidaPresu.gridx = 0;
					
				
					this.jContentPaneDetallePartidaPresu.add(jPanelCamposOcultosPartidaPresu, gridBagConstraintsPartidaPresu);
				
					this.jPanelCamposOcultosPartidaPresu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsPartidaPresu.gridx = 0;
	        this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePartidaPresu.add(this.jPanelAccionesFormularioPartidaPresu, this.gridBagConstraintsPartidaPresu);							
			
			
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
	        this.gridBagConstraintsPartidaPresu.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsPartidaPresu.gridx = 0;
	        
			
			this.jContentPaneDetallePartidaPresu.add(this.jPanelAccionesPartidaPresu, this.gridBagConstraintsPartidaPresu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPartidaPresu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPartidaPresu=   new JScrollPane(this.jPanelCamposPartidaPresu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPartidaPresu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPartidaPresu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPartidaPresu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPartidaPresu.gridx = 0;
			this.gridBagConstraintsPartidaPresu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPartidaPresu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPartidaPresu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPartidaPresu, this.gridBagConstraintsPartidaPresu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPartidaPresu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPartidaPresu, this.gridBagConstraintsPartidaPresu);			
			
			this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
			this.gridBagConstraintsPartidaPresu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPartidaPresu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPartidaPresu, this.gridBagConstraintsPartidaPresu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPartidaPresu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPartidaPresu, this.gridBagConstraintsPartidaPresu);
			
			
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPartidaPresu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPartidaPresu, this.gridBagConstraintsPartidaPresu);
		
			
		this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
		this.gridBagConstraintsPartidaPresu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPartidaPresu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPartidaPresu, this.gridBagConstraintsPartidaPresu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPartidaPresu;//jContentPane;
		
		return jScrollPanelDatosEdicionPartidaPresu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		this.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
		this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {

				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=PartidaPresuJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PartidaPresuJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleactivofijoBeanSwingJInternalFrame.setdetalleactivofijoSessionBean(this.detalleactivofijoSessionBean);

				//this.gridBagConstraintsPartidaPresu = new GridBagConstraints();
				//this.gridBagConstraintsPartidaPresu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPartidaPresu.gridx = 0;
				//this.jContentPaneDetallePartidaPresu.add(this.detalleactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPartidaPresu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPartidaPresu.add("Detalle Activo Fijos",this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPartidaPresu.setComponentAt(iIndexTab,this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleActivoFijo) {
					this.jTabbedPaneRelacionesPartidaPresu.add("Detalle Activo Fijos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleActivoFijoBeanSwingJInternalFrame(List<PartidaPresu> partidapresus,PartidaPresu partidapresu,DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.partidapresuLogic.getConnexion());

					detalleactivofijoBeanSwingJInternalFrame.setpartidapresusForeignKey(partidapresus);
					detalleactivofijoBeanSwingJInternalFrame.setpartidapresuForeignKey(partidapresu);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionPartidaPresu(true);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setlidPartidaPresuActual(partidapresu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaPartidaPresu(true);
					detalleactivofijoBeanSwingJInternalFrame.setid_partida_presuFK_IdPartidaPresu(partidapresu.getId());

					if(!this.conCargarFormDetalle) {
						detalleactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFramePartidaPresuForeignKey(partidapresu,1,false,true,true);
					detalleactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdPartidaPresu");
					detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPartidaPresu");
					detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleActivoFijo("n",detalleactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("relacionado");
					} else {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");
					}

					detalleactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
