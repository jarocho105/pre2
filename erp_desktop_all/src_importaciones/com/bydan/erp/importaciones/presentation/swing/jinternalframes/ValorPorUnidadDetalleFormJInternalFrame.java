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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.ValorPorUnidadConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class ValorPorUnidadDetalleFormJInternalFrame extends ValorPorUnidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleValorPorUnidad;
	
	protected JMenuBar jmenuBarDetalleValorPorUnidad;
	
	protected JMenu jmenuDetalleValorPorUnidad;
	protected JMenu jmenuDetalleArchivoValorPorUnidad;
	protected JMenu jmenuDetalleAccionesValorPorUnidad;
	protected JMenu jmenuDetalleDatosValorPorUnidad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutValorPorUnidad;	
	protected GridBagConstraints gridBagConstraintsValorPorUnidad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ValorPorUnidadBeanSwingJInternalFrameAdditional jInternalFrameDetalleValorPorUnidad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ValorPorUnidadSessionBean valorporunidadSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ValorPorUnidadLogic valorporunidadLogic;
	
	public JScrollPane jScrollPanelDatosValorPorUnidad;
	public JScrollPane jScrollPanelDatosEdicionValorPorUnidad;
	public JScrollPane jScrollPanelDatosGeneralValorPorUnidad;
	
	protected JPanel jPanelCamposValorPorUnidad;    
	protected JPanel jPanelCamposOcultosValorPorUnidad;    	
	protected JPanel jPanelAccionesValorPorUnidad;
	protected JPanel jPanelAccionesFormularioValorPorUnidad;
    
	
	
	protected Integer iXPanelCamposValorPorUnidad=0;
	protected Integer iYPanelCamposValorPorUnidad=0;
	
	protected Integer iXPanelCamposOcultosValorPorUnidad=0;
	protected Integer iYPanelCamposOcultosValorPorUnidad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoValorPorUnidad;
	public JButton jButtonModificarValorPorUnidad;
	public JButton jButtonActualizarValorPorUnidad;
    public JButton jButtonEliminarValorPorUnidad;
	public JButton jButtonCancelarValorPorUnidad;
    public JButton jButtonGuardarCambiosValorPorUnidad;
	public JButton jButtonGuardarCambiosTablaValorPorUnidad;
	protected JButton jButtonCerrarValorPorUnidad;
	
	
	protected JButton jButtonProcesarInformacionValorPorUnidad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoValorPorUnidad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarValorPorUnidad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeValorPorUnidad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarValorPorUnidad;
	protected JButton jButtonModificarToolBarValorPorUnidad;
	protected JButton jButtonActualizarToolBarValorPorUnidad;
    protected JButton jButtonEliminarToolBarValorPorUnidad;
	protected JButton jButtonCancelarToolBarValorPorUnidad;
    protected JButton jButtonGuardarCambiosToolBarValorPorUnidad;
	protected JButton jButtonGuardarCambiosTablaToolBarValorPorUnidad;
	protected JButton jButtonMostrarOcultarTablaToolBarValorPorUnidad;
	protected JButton jButtonCerrarToolBarValorPorUnidad;
	
	protected JButton jButtonProcesarInformacionToolBarValorPorUnidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoValorPorUnidad;
	protected JMenuItem jMenuItemModificarValorPorUnidad;
	protected JMenuItem jMenuItemActualizarValorPorUnidad;
    protected JMenuItem jMenuItemEliminarValorPorUnidad;
	protected JMenuItem jMenuItemCancelarValorPorUnidad;
    protected JMenuItem jMenuItemGuardarCambiosValorPorUnidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaValorPorUnidad;
	protected JMenuItem jMenuItemCerrarValorPorUnidad;
	protected JMenuItem jMenuItemDetalleCerrarValorPorUnidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarValorPorUnidad;
	
	protected JMenuItem jMenuItemProcesarInformacionValorPorUnidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosValorPorUnidad;
	protected JMenuItem jMenuItemMostrarOcultarValorPorUnidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesValorPorUnidad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesValorPorUnidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesValorPorUnidad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioValorPorUnidad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidValorPorUnidad;
	public JLabel jLabelIdValorPorUnidad;
	public JLabel jLabelidValorPorUnidad;
	public JButton jButtonidValorPorUnidadBusqueda= new JButtonMe();

	public JPanel jPanelvalorValorPorUnidad;
	public JLabel jLabelvalorValorPorUnidad;
	public JTextField jTextFieldvalorValorPorUnidad;
	public JButton jButtonvalorValorPorUnidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaValorPorUnidad;
	public JLabel jLabelid_empresaValorPorUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaValorPorUnidad;
	public JButton jButtonid_empresaValorPorUnidad= new JButtonMe();
	public JButton jButtonid_empresaValorPorUnidadUpdate= new JButtonMe();
	public JButton jButtonid_empresaValorPorUnidadBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadValorPorUnidad;
	public JLabel jLabelid_unidadValorPorUnidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadValorPorUnidad;
	public JButton jButtonid_unidadValorPorUnidad= new JButtonMe();
	public JButton jButtonid_unidadValorPorUnidadUpdate= new JButtonMe();
	public JButton jButtonid_unidadValorPorUnidadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesValorPorUnidad;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ValorPorUnidadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposValorPorUnidad=new JPanel();
				this.jPanelAccionesFormularioValorPorUnidad=new JPanel();
				this.jmenuBarDetalleValorPorUnidad=new JMenuBar();
				this.jTtoolBarDetalleValorPorUnidad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorPorUnidadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ValorPorUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ValorPorUnidadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ValorPorUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorPorUnidadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ValorPorUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorPorUnidadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ValorPorUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorPorUnidadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ValorPorUnidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarValorPorUnidad() {
		return this.jButtonActualizarToolBarValorPorUnidad;
	}
	
	public JButton getjButtonEliminarToolBarValorPorUnidad() {
		return this.jButtonEliminarToolBarValorPorUnidad;
	}
	
	public JButton getjButtonCancelarToolBarValorPorUnidad() {
		return this.jButtonCancelarToolBarValorPorUnidad;
	}		
	
	public JButton getjButtonProcesarInformacionValorPorUnidad() {
		return this.jButtonProcesarInformacionValorPorUnidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionValorPorUnidad)	{
		this.jButtonProcesarInformacionValorPorUnidad = jButtonProcesarInformacionValorPorUnidad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesValorPorUnidad() {
		return this.jComboBoxTiposAccionesValorPorUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesValorPorUnidad(
			JComboBox jComboBoxTiposRelacionesValorPorUnidad) {
		this.jComboBoxTiposRelacionesValorPorUnidad = jComboBoxTiposRelacionesValorPorUnidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesValorPorUnidad(
			JComboBox jComboBoxTiposAccionesValorPorUnidad) {
		this.jComboBoxTiposAccionesValorPorUnidad = jComboBoxTiposAccionesValorPorUnidad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioValorPorUnidad() {
		return this.jComboBoxTiposAccionesFormularioValorPorUnidad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioValorPorUnidad(
			JComboBox jComboBoxTiposAccionesFormularioValorPorUnidad) {
		this.jComboBoxTiposAccionesFormularioValorPorUnidad = jComboBoxTiposAccionesFormularioValorPorUnidad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.valorporunidadSessionBean=new ValorPorUnidadSessionBean();
		
		this.valorporunidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.valorporunidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.valorporunidadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ValorPorUnidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ValorPorUnidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ValorPorUnidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Valor Por Unidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
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
	
		ValorPorUnidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleValorPorUnidad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarValorPorUnidad=new JButtonMe();
				this.jButtonModificarToolBarValorPorUnidad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarValorPorUnidad,this.jTtoolBarDetalleValorPorUnidad,
							"actualizar","actualizar","Actualizar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarValorPorUnidad,this.jTtoolBarDetalleValorPorUnidad,
							"eliminar","eliminar","Eliminar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarValorPorUnidad,this.jTtoolBarDetalleValorPorUnidad,
							"cancelar","cancelar","Cancelar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarValorPorUnidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarValorPorUnidad,this.jTtoolBarDetalleValorPorUnidad,
							"guardarcambios","guardarcambios","Guardar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleValorPorUnidad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleValorPorUnidad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoValorPorUnidad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesValorPorUnidad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosValorPorUnidad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoValorPorUnidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoValorPorUnidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoValorPorUnidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarValorPorUnidad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarValorPorUnidad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarValorPorUnidad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarValorPorUnidad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarValorPorUnidad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarValorPorUnidad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarValorPorUnidad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarValorPorUnidad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarValorPorUnidad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarValorPorUnidad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarValorPorUnidad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarValorPorUnidad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosValorPorUnidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosValorPorUnidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosValorPorUnidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarValorPorUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarValorPorUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarValorPorUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarValorPorUnidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarValorPorUnidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarValorPorUnidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarValorPorUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarValorPorUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarValorPorUnidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarValorPorUnidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarValorPorUnidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarValorPorUnidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoValorPorUnidad.add(this.jMenuItemDetalleCerrarValorPorUnidad);
		
		this.jmenuDetalleAccionesValorPorUnidad.add(this.jMenuItemActualizarValorPorUnidad);
		this.jmenuDetalleAccionesValorPorUnidad.add(this.jMenuItemEliminarValorPorUnidad);
		this.jmenuDetalleAccionesValorPorUnidad.add(this.jMenuItemCancelarValorPorUnidad);		
		
		//this.jmenuDetalleDatosValorPorUnidad.add(this.jMenuItemDetalleAbrirOrderByValorPorUnidad);				
		this.jmenuDetalleDatosValorPorUnidad.add(this.jMenuItemDetalleMostarOcultarValorPorUnidad);				
				
		//this.jmenuDetalleAccionesValorPorUnidad.add(this.jMenuItemGuardarCambiosValorPorUnidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleValorPorUnidad.add(this.jmenuDetalleArchivoValorPorUnidad);		
		this.jmenuBarDetalleValorPorUnidad.add(this.jmenuDetalleAccionesValorPorUnidad);		
		this.jmenuBarDetalleValorPorUnidad.add(this.jmenuDetalleDatosValorPorUnidad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleValorPorUnidad);				
	}
	
	
	public void inicializarElementosCamposValorPorUnidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdValorPorUnidad = new JLabelMe();
		jLabelIdValorPorUnidad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidValorPorUnidad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidValorPorUnidad.setToolTipText(ValorPorUnidadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutValorPorUnidad= new GridBagLayout();

		this.jPanelidValorPorUnidad.setLayout(this.gridaBagLayoutValorPorUnidad);

		jLabelidValorPorUnidad = new JLabel();
		jLabelidValorPorUnidad.setText("Id");

		jLabelidValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorValorPorUnidad = new JLabelMe();
		this.jLabelvalorValorPorUnidad.setText(""+ValorPorUnidadConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorValorPorUnidad.setToolTipText("Valor");
		this.jLabelvalorValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorValorPorUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorValorPorUnidad.setToolTipText(ValorPorUnidadConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutValorPorUnidad = new GridBagLayout();
		this.jPanelvalorValorPorUnidad.setLayout(this.gridaBagLayoutValorPorUnidad);


		jTextFieldvalorValorPorUnidad= new JTextFieldMe();
		jTextFieldvalorValorPorUnidad.setEnabled(false);
		jTextFieldvalorValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorValorPorUnidad.setText("0.0");

		this.jButtonvalorValorPorUnidadBusqueda= new JButtonMe();
		this.jButtonvalorValorPorUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorValorPorUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorValorPorUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorValorPorUnidadBusqueda.setText("U");
		this.jButtonvalorValorPorUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorValorPorUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorValorPorUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorValorPorUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorValorPorUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorValorPorUnidadBusqueda"));

		if(this.valorporunidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorValorPorUnidadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysValorPorUnidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaValorPorUnidad = new JLabelMe();
		this.jLabelid_empresaValorPorUnidad.setText(""+ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaValorPorUnidad.setToolTipText("Empresa");
		this.jLabelid_empresaValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaValorPorUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaValorPorUnidad.setToolTipText(ValorPorUnidadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutValorPorUnidad = new GridBagLayout();
		this.jPanelid_empresaValorPorUnidad.setLayout(this.gridaBagLayoutValorPorUnidad);


		jComboBoxid_empresaValorPorUnidad= new JComboBoxMe();
		jComboBoxid_empresaValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaValorPorUnidad.setEnabled(false);

		this.jButtonid_empresaValorPorUnidad= new JButtonMe();
		this.jButtonid_empresaValorPorUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaValorPorUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaValorPorUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaValorPorUnidad.setText("Buscar");
		this.jButtonid_empresaValorPorUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaValorPorUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaValorPorUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaValorPorUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaValorPorUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaValorPorUnidad"));

		this.jButtonid_empresaValorPorUnidadBusqueda= new JButtonMe();
		this.jButtonid_empresaValorPorUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaValorPorUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaValorPorUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaValorPorUnidadBusqueda.setText("U");
		this.jButtonid_empresaValorPorUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaValorPorUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaValorPorUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaValorPorUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaValorPorUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaValorPorUnidadBusqueda"));

		if(this.valorporunidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaValorPorUnidadBusqueda.setVisible(false);		}

		this.jButtonid_empresaValorPorUnidadUpdate= new JButtonMe();
		this.jButtonid_empresaValorPorUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaValorPorUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaValorPorUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaValorPorUnidadUpdate.setText("U");
		this.jButtonid_empresaValorPorUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaValorPorUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaValorPorUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaValorPorUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaValorPorUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaValorPorUnidadUpdate"));



					
		this.jLabelid_unidadValorPorUnidad = new JLabelMe();
		this.jLabelid_unidadValorPorUnidad.setText(""+ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadValorPorUnidad.setToolTipText("Unidad");
		this.jLabelid_unidadValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadValorPorUnidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadValorPorUnidad.setToolTipText(ValorPorUnidadConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutValorPorUnidad = new GridBagLayout();
		this.jPanelid_unidadValorPorUnidad.setLayout(this.gridaBagLayoutValorPorUnidad);


		jComboBoxid_unidadValorPorUnidad= new JComboBoxMe();
		jComboBoxid_unidadValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadValorPorUnidad= new JButtonMe();
		this.jButtonid_unidadValorPorUnidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadValorPorUnidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadValorPorUnidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadValorPorUnidad.setText("Buscar");
		this.jButtonid_unidadValorPorUnidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadValorPorUnidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadValorPorUnidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadValorPorUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadValorPorUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadValorPorUnidad"));

		this.jButtonid_unidadValorPorUnidadBusqueda= new JButtonMe();
		this.jButtonid_unidadValorPorUnidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadValorPorUnidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadValorPorUnidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadValorPorUnidadBusqueda.setText("U");
		this.jButtonid_unidadValorPorUnidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadValorPorUnidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadValorPorUnidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadValorPorUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadValorPorUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadValorPorUnidadBusqueda"));

		if(this.valorporunidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadValorPorUnidadBusqueda.setVisible(false);		}

		this.jButtonid_unidadValorPorUnidadUpdate= new JButtonMe();
		this.jButtonid_unidadValorPorUnidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadValorPorUnidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadValorPorUnidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadValorPorUnidadUpdate.setText("U");
		this.jButtonid_unidadValorPorUnidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadValorPorUnidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadValorPorUnidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadValorPorUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadValorPorUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadValorPorUnidadUpdate"));



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
		//this.jInternalFrameDetalleValorPorUnidad = new ValorPorUnidadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Valor Por Unidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutValorPorUnidad= new GridBagLayout();
		

		
		String sToolTipValorPorUnidad="";
		sToolTipValorPorUnidad=ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipValorPorUnidad+="(Importaciones.ValorPorUnidad)";
		}
		
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipValorPorUnidad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoValorPorUnidad = new JButtonMe();
		this.jButtonModificarValorPorUnidad = new JButtonMe();
        this.jButtonActualizarValorPorUnidad = new JButtonMe();
        this.jButtonEliminarValorPorUnidad = new JButtonMe();
        this.jButtonCancelarValorPorUnidad = new JButtonMe();
        this.jButtonGuardarCambiosValorPorUnidad = new JButtonMe();
		this.jButtonGuardarCambiosTablaValorPorUnidad = new JButtonMe();
		this.jButtonCerrarValorPorUnidad = new JButtonMe();
		
		this.jScrollPanelDatosValorPorUnidad = new JScrollPane();   
        this.jScrollPanelDatosEdicionValorPorUnidad = new JScrollPane();
		this.jScrollPanelDatosGeneralValorPorUnidad = new JScrollPane();
				
		
		
		this.jPanelCamposValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Valor Por Unidad";
		
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Por Unidades" + this.sPath));
		} else {
			this.jScrollPanelDatosValorPorUnidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposValorPorUnidad.setName("jPanelCamposValorPorUnidad"); 

		this.jPanelCamposOcultosValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosValorPorUnidad.setName("jPanelCamposOcultosValorPorUnidad"); 

        this.jPanelAccionesValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesValorPorUnidad.setToolTipText("Acciones");
        this.jPanelAccionesValorPorUnidad.setName("Acciones"); 

		this.jPanelAccionesFormularioValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioValorPorUnidad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioValorPorUnidad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoValorPorUnidad.setText("Nuevo");
		this.jButtonModificarValorPorUnidad.setText("Editar");
        this.jButtonActualizarValorPorUnidad.setText("Actualizar");
        this.jButtonEliminarValorPorUnidad.setText("Eliminar");
        this.jButtonCancelarValorPorUnidad.setText("Cancelar");
        this.jButtonGuardarCambiosValorPorUnidad.setText("Guardar");
		this.jButtonGuardarCambiosTablaValorPorUnidad.setText("Guardar");
		this.jButtonCerrarValorPorUnidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoValorPorUnidad,"nuevo_button","Nuevo",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarValorPorUnidad,"modificar_button","Editar",this.valorporunidadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarValorPorUnidad,"actualizar_button","Actualizar",this.valorporunidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarValorPorUnidad,"eliminar_button","Eliminar",this.valorporunidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarValorPorUnidad,"cancelar_button","Cancelar",this.valorporunidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosValorPorUnidad,"guardarcambios_button","Guardar",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaValorPorUnidad,"guardarcambiostabla_button","Guardar",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarValorPorUnidad,"cerrar_button","Salir",this.valorporunidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoValorPorUnidad.setToolTipText("Nuevo"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarValorPorUnidad.setToolTipText("Editar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarValorPorUnidad.setToolTipText("Actualizar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarValorPorUnidad.setToolTipText("Eliminar)"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarValorPorUnidad.setToolTipText("Cancelar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosValorPorUnidad.setToolTipText("Guardar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaValorPorUnidad.setToolTipText("Guardar"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarValorPorUnidad.setToolTipText("Salir"+" "+ValorPorUnidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoValorPorUnidad";
		inputMap = this.jButtonNuevoValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoValorPorUnidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoValorPorUnidad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarValorPorUnidad";
		inputMap = this.jButtonActualizarValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarValorPorUnidad"));
		
		//ELIMINAR
		sMapKey = "EliminarValorPorUnidad";
		inputMap = this.jButtonEliminarValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarValorPorUnidad"));
		
		//CANCELAR	
		sMapKey = "CancelarValorPorUnidad";
		inputMap = this.jButtonCancelarValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarValorPorUnidad"));
		
		//CERRAR		
		sMapKey = "CerrarValorPorUnidad";
		inputMap = this.jButtonCerrarValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarValorPorUnidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaValorPorUnidad";
		inputMap = this.jButtonGuardarCambiosTablaValorPorUnidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaValorPorUnidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaValorPorUnidad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoValorPorUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoValorPorUnidad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoValorPorUnidad.setToolTipText("Nuevo ValorPorUnidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarValorPorUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarValorPorUnidad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarValorPorUnidad.setToolTipText("Sin Cerrar Ventana ValorPorUnidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeValorPorUnidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeValorPorUnidad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeValorPorUnidad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesValorPorUnidad.setText("Accion");
		this.jComboBoxTiposAccionesValorPorUnidad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioValorPorUnidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioValorPorUnidad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioValorPorUnidad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesValorPorUnidad = new JLabelMe();
		
		this.jLabelAccionesValorPorUnidad.setText("Acciones");		
		this.jLabelAccionesValorPorUnidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesValorPorUnidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesValorPorUnidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposValorPorUnidad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysValorPorUnidad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesValorPorUnidad=new JTabbedPane();
		this.jTabbedPaneRelacionesValorPorUnidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesValorPorUnidad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesValorPorUnidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesValorPorUnidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesValorPorUnidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesValorPorUnidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioValorPorUnidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioValorPorUnidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioValorPorUnidad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioValorPorUnidad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposValorPorUnidad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosValorPorUnidad = new GridBagLayout();
		
		this.jPanelCamposValorPorUnidad.setLayout(gridaBagLayoutCamposValorPorUnidad);
		this.jPanelCamposOcultosValorPorUnidad.setLayout(gridaBagLayoutCamposOcultosValorPorUnidad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorPorUnidad.gridy = 0;
	this.gridBagConstraintsValorPorUnidad.gridx = 0;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidValorPorUnidad.add(jLabelIdValorPorUnidad, this.gridBagConstraintsValorPorUnidad);



	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorPorUnidad.gridy = 0;
	this.gridBagConstraintsValorPorUnidad.gridx = 1;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidValorPorUnidad.add(jLabelidValorPorUnidad, this.gridBagConstraintsValorPorUnidad);


	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorPorUnidad.gridy = 0;
	this.gridBagConstraintsValorPorUnidad.gridx = 0;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaValorPorUnidad.add(jLabelid_empresaValorPorUnidad, this.gridBagConstraintsValorPorUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		//this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = 0;
		this.gridBagConstraintsValorPorUnidad.gridx = 2;
		this.gridBagConstraintsValorPorUnidad.ipadx = 0;
		this.gridBagConstraintsValorPorUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaValorPorUnidad.add(jButtonid_empresaValorPorUnidadBusqueda, this.gridBagConstraintsValorPorUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		//this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = 0;
		this.gridBagConstraintsValorPorUnidad.gridx = 3;
		this.gridBagConstraintsValorPorUnidad.ipadx = 0;
		this.gridBagConstraintsValorPorUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaValorPorUnidad.add(jButtonid_empresaValorPorUnidadUpdate, this.gridBagConstraintsValorPorUnidad);
	}

	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorPorUnidad.gridy = 0;
	this.gridBagConstraintsValorPorUnidad.gridx = 1;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaValorPorUnidad.add(jComboBoxid_empresaValorPorUnidad, this.gridBagConstraintsValorPorUnidad);


	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorPorUnidad.gridy = 0;
	this.gridBagConstraintsValorPorUnidad.gridx = 0;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadValorPorUnidad.add(jLabelid_unidadValorPorUnidad, this.gridBagConstraintsValorPorUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		//this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = 0;
		this.gridBagConstraintsValorPorUnidad.gridx = 2;
		this.gridBagConstraintsValorPorUnidad.ipadx = 0;
		this.gridBagConstraintsValorPorUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadValorPorUnidad.add(jButtonid_unidadValorPorUnidadBusqueda, this.gridBagConstraintsValorPorUnidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		//this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = 0;
		this.gridBagConstraintsValorPorUnidad.gridx = 3;
		this.gridBagConstraintsValorPorUnidad.ipadx = 0;
		this.gridBagConstraintsValorPorUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadValorPorUnidad.add(jButtonid_unidadValorPorUnidadUpdate, this.gridBagConstraintsValorPorUnidad);
	}

	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorPorUnidad.gridy = 0;
	this.gridBagConstraintsValorPorUnidad.gridx = 1;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadValorPorUnidad.add(jComboBoxid_unidadValorPorUnidad, this.gridBagConstraintsValorPorUnidad);


	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorPorUnidad.gridy = 0;
	this.gridBagConstraintsValorPorUnidad.gridx = 0;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorValorPorUnidad.add(jLabelvalorValorPorUnidad, this.gridBagConstraintsValorPorUnidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		//this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorPorUnidad.gridy = 0;
		this.gridBagConstraintsValorPorUnidad.gridx = 2;
		this.gridBagConstraintsValorPorUnidad.ipadx = 0;
		this.gridBagConstraintsValorPorUnidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorValorPorUnidad.add(jButtonvalorValorPorUnidadBusqueda, this.gridBagConstraintsValorPorUnidad);
	}

	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorPorUnidad.gridy = 0;
	this.gridBagConstraintsValorPorUnidad.gridx = 1;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorValorPorUnidad.add(jTextFieldvalorValorPorUnidad, this.gridBagConstraintsValorPorUnidad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsValorPorUnidad.gridy = iYPanelCamposValorPorUnidad;
	this.gridBagConstraintsValorPorUnidad.gridx = iXPanelCamposValorPorUnidad++;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposValorPorUnidad.add(this.jPanelidValorPorUnidad, this.gridBagConstraintsValorPorUnidad);



	if(iXPanelCamposValorPorUnidad % 1==0) {
		iXPanelCamposValorPorUnidad=0;
		iYPanelCamposValorPorUnidad++;
	}
	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsValorPorUnidad.gridy = iYPanelCamposValorPorUnidad;
	this.gridBagConstraintsValorPorUnidad.gridx = iXPanelCamposValorPorUnidad++;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposValorPorUnidad.add(this.jPanelid_unidadValorPorUnidad, this.gridBagConstraintsValorPorUnidad);



	if(iXPanelCamposValorPorUnidad % 1==0) {
		iXPanelCamposValorPorUnidad=0;
		iYPanelCamposValorPorUnidad++;
	}
	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsValorPorUnidad.gridy = iYPanelCamposValorPorUnidad;
	this.gridBagConstraintsValorPorUnidad.gridx = iXPanelCamposValorPorUnidad++;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposValorPorUnidad.add(this.jPanelvalorValorPorUnidad, this.gridBagConstraintsValorPorUnidad);



	if(iXPanelCamposValorPorUnidad % 1==0) {
		iXPanelCamposValorPorUnidad=0;
		iYPanelCamposValorPorUnidad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsValorPorUnidad.gridy = iYPanelCamposOcultosValorPorUnidad;
	this.gridBagConstraintsValorPorUnidad.gridx = iXPanelCamposOcultosValorPorUnidad++;
	this.gridBagConstraintsValorPorUnidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsValorPorUnidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosValorPorUnidad.add(this.jPanelid_empresaValorPorUnidad, this.gridBagConstraintsValorPorUnidad);



	if(iXPanelCamposOcultosValorPorUnidad % 1==0) {
		iXPanelCamposOcultosValorPorUnidad=0;
		iYPanelCamposOcultosValorPorUnidad++;
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
			
		GridBagLayout gridaBagLayoutAccionesValorPorUnidad= new GridBagLayout();
		this.jPanelAccionesValorPorUnidad.setLayout(gridaBagLayoutAccionesValorPorUnidad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioValorPorUnidad= new GridBagLayout();
		this.jPanelAccionesFormularioValorPorUnidad.setLayout(gridaBagLayoutAccionesFormularioValorPorUnidad);
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsValorPorUnidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioValorPorUnidad.add(this.jComboBoxTiposAccionesFormularioValorPorUnidad, this.gridBagConstraintsValorPorUnidad);

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsValorPorUnidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioValorPorUnidad.add(this.jCheckBoxPostAccionNuevoValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.valorporunidadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioValorPorUnidad.add(this.jCheckBoxPostAccionSinCerrarValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.valorporunidadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.valorporunidadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsValorPorUnidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioValorPorUnidad.add(this.jCheckBoxPostAccionSinMensajeValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = 0;
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccion++;
			
		this.jPanelAccionesValorPorUnidad.add(this.jButtonModificarValorPorUnidad, this.gridBagConstraintsValorPorUnidad);							

		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorPorUnidad.gridy = 0;
		this.gridBagConstraintsValorPorUnidad.gridx =iPosXAccion++;
			
		this.jPanelAccionesValorPorUnidad.add(this.jButtonEliminarValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
			
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = 0;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesValorPorUnidad.add(this.jButtonActualizarValorPorUnidad, this.gridBagConstraintsValorPorUnidad);


		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = 0;		
		this.gridBagConstraintsValorPorUnidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesValorPorUnidad.add(this.jButtonGuardarCambiosValorPorUnidad, this.gridBagConstraintsValorPorUnidad);	
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = 0;		
		this.gridBagConstraintsValorPorUnidad.gridx =iPosXAccion++;
		
		this.jPanelAccionesValorPorUnidad.add(this.jButtonCancelarValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutValorPorUnidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutValorPorUnidad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.valorporunidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();						
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsValorPorUnidad.gridx = 0;		
			//this.gridBagConstraintsValorPorUnidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsValorPorUnidad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsValorPorUnidad.gridx =0;
		this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsValorPorUnidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ValorPorUnidadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleValorPorUnidad = new ValorPorUnidadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Valor Por Unidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Valor Por Unidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Valor Por Unidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ValorPorUnidadModel valorporunidadModel=new ValorPorUnidadModel(this);
			
			//SI USARA CLASE INTERNA
			//ValorPorUnidadModel.ValorPorUnidadFocusTraversalPolicy valorporunidadFocusTraversalPolicy = valorporunidadModel.new ValorPorUnidadFocusTraversalPolicy(this);
			
			//valorporunidadFocusTraversalPolicy.setvalorporunidadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(valorporunidadModel);
			
			
			this.jContentPaneDetalleValorPorUnidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleValorPorUnidad = new GridBagLayout();	
			this.jContentPaneDetalleValorPorUnidad.setLayout(gridaBagLayoutDetalleValorPorUnidad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosValorPorUnidad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
				this.gridBagConstraintsValorPorUnidad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsValorPorUnidad.gridx = 0;
					
				
				this.jContentPaneDetalleValorPorUnidad.add(jTtoolBarDetalleValorPorUnidad, gridBagConstraintsValorPorUnidad);								
				
}
			
			this.jScrollPanelDatosEdicionValorPorUnidad=   new JScrollPane(jContentPaneDetalleValorPorUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionValorPorUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionValorPorUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionValorPorUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralValorPorUnidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralValorPorUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralValorPorUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralValorPorUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsValorPorUnidad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsValorPorUnidad.gridx = 0;
	        
			this.jContentPaneDetalleValorPorUnidad.add(jPanelCamposValorPorUnidad, gridBagConstraintsValorPorUnidad);
			
			
			
			
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
						&& valorporunidadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.valorporunidadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsValorPorUnidad= new GridBagConstraints();
						this.gridBagConstraintsValorPorUnidad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsValorPorUnidad.gridx = 0;
						this.jContentPaneDetalleValorPorUnidad.add(this.jTabbedPaneRelacionesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesValorPorUnidad.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosValorPorUnidad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
					this.gridBagConstraintsValorPorUnidad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsValorPorUnidad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsValorPorUnidad.gridx = 0;
					
				
					this.jContentPaneDetalleValorPorUnidad.add(jPanelCamposOcultosValorPorUnidad, gridBagConstraintsValorPorUnidad);
				
					this.jPanelCamposOcultosValorPorUnidad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsValorPorUnidad.gridx = 0;
	        this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleValorPorUnidad.add(this.jPanelAccionesFormularioValorPorUnidad, this.gridBagConstraintsValorPorUnidad);							
			
			
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
	        this.gridBagConstraintsValorPorUnidad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsValorPorUnidad.gridx = 0;
	        
			
			this.jContentPaneDetalleValorPorUnidad.add(this.jPanelAccionesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionValorPorUnidad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionValorPorUnidad=   new JScrollPane(this.jPanelCamposValorPorUnidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionValorPorUnidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionValorPorUnidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionValorPorUnidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsValorPorUnidad.gridx = 0;
			this.gridBagConstraintsValorPorUnidad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsValorPorUnidad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsValorPorUnidad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsValorPorUnidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioValorPorUnidad, this.gridBagConstraintsValorPorUnidad);			
			
			this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
			this.gridBagConstraintsValorPorUnidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsValorPorUnidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorPorUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
			
			
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorPorUnidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		
			
		this.gridBagConstraintsValorPorUnidad = new GridBagConstraints();
		this.gridBagConstraintsValorPorUnidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsValorPorUnidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesValorPorUnidad, this.gridBagConstraintsValorPorUnidad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralValorPorUnidad;//jContentPane;
		
		return jScrollPanelDatosEdicionValorPorUnidad;
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
