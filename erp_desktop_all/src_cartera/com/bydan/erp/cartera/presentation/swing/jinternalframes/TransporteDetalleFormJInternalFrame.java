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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.TransporteConstantesFunciones;

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
public class TransporteDetalleFormJInternalFrame extends TransporteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransporte;
	
	protected JMenuBar jmenuBarDetalleTransporte;
	
	protected JMenu jmenuDetalleTransporte;
	protected JMenu jmenuDetalleArchivoTransporte;
	protected JMenu jmenuDetalleAccionesTransporte;
	protected JMenu jmenuDetalleDatosTransporte;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransporte;	
	protected GridBagConstraints gridBagConstraintsTransporte;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransporteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransporte;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";
	
	public TransporteSessionBean transporteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;	
	
	public TransporteLogic transporteLogic;
	
	public JScrollPane jScrollPanelDatosTransporte;
	public JScrollPane jScrollPanelDatosEdicionTransporte;
	public JScrollPane jScrollPanelDatosGeneralTransporte;
	
	protected JPanel jPanelCamposTransporte;    
	protected JPanel jPanelCamposOcultosTransporte;    	
	protected JPanel jPanelAccionesTransporte;
	protected JPanel jPanelAccionesFormularioTransporte;
    
	
	
	protected Integer iXPanelCamposTransporte=0;
	protected Integer iYPanelCamposTransporte=0;
	
	protected Integer iXPanelCamposOcultosTransporte=0;
	protected Integer iYPanelCamposOcultosTransporte=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransporte;
	public JButton jButtonModificarTransporte;
	public JButton jButtonActualizarTransporte;
    public JButton jButtonEliminarTransporte;
	public JButton jButtonCancelarTransporte;
    public JButton jButtonGuardarCambiosTransporte;
	public JButton jButtonGuardarCambiosTablaTransporte;
	protected JButton jButtonCerrarTransporte;
	
	
	protected JButton jButtonProcesarInformacionTransporte;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransporte;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransporte;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransporte;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransporte;
	protected JButton jButtonModificarToolBarTransporte;
	protected JButton jButtonActualizarToolBarTransporte;
    protected JButton jButtonEliminarToolBarTransporte;
	protected JButton jButtonCancelarToolBarTransporte;
    protected JButton jButtonGuardarCambiosToolBarTransporte;
	protected JButton jButtonGuardarCambiosTablaToolBarTransporte;
	protected JButton jButtonMostrarOcultarTablaToolBarTransporte;
	protected JButton jButtonCerrarToolBarTransporte;
	
	protected JButton jButtonProcesarInformacionToolBarTransporte;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransporte;
	protected JMenuItem jMenuItemModificarTransporte;
	protected JMenuItem jMenuItemActualizarTransporte;
    protected JMenuItem jMenuItemEliminarTransporte;
	protected JMenuItem jMenuItemCancelarTransporte;
    protected JMenuItem jMenuItemGuardarCambiosTransporte;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransporte;
	protected JMenuItem jMenuItemCerrarTransporte;
	protected JMenuItem jMenuItemDetalleCerrarTransporte;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransporte;
	
	protected JMenuItem jMenuItemProcesarInformacionTransporte;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransporte;
	protected JMenuItem jMenuItemMostrarOcultarTransporte;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransporte;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransporte;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransporte;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransporte;
	public JLabel jLabelIdTransporte;
	public JLabel jLabelidTransporte;
	public JButton jButtonidTransporteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTransporte;
	public JLabel jLabelcodigoTransporte;
	public JTextField jTextFieldcodigoTransporte;
	public JButton jButtoncodigoTransporteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTransporte;
	public JLabel jLabelnombreTransporte;
	public JTextArea jTextAreanombreTransporte;
	public JScrollPane jscrollPanenombreTransporte;
	public JButton jButtonnombreTransporteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTransporte;
	public JLabel jLabelid_empresaTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTransporte;
	public JButton jButtonid_empresaTransporte= new JButtonMe();
	public JButton jButtonid_empresaTransporteUpdate= new JButtonMe();
	public JButton jButtonid_empresaTransporteBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_via_transporteTransporte;
	public JLabel jLabelid_tipo_via_transporteTransporte;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteTransporte;
	public JButton jButtonid_tipo_via_transporteTransporte= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteTransporteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteTransporteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransporte;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransporteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransporte=new JPanel();
				this.jPanelAccionesFormularioTransporte=new JPanel();
				this.jmenuBarDetalleTransporte=new JMenuBar();
				this.jTtoolBarDetalleTransporte=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransporteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Transporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransporteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Transporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransporteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransporteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransporteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Transporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransporte() {
		return this.jButtonActualizarToolBarTransporte;
	}
	
	public JButton getjButtonEliminarToolBarTransporte() {
		return this.jButtonEliminarToolBarTransporte;
	}
	
	public JButton getjButtonCancelarToolBarTransporte() {
		return this.jButtonCancelarToolBarTransporte;
	}		
	
	public JButton getjButtonProcesarInformacionTransporte() {
		return this.jButtonProcesarInformacionTransporte;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransporte)	{
		this.jButtonProcesarInformacionTransporte = jButtonProcesarInformacionTransporte;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransporte() {
		return this.jComboBoxTiposAccionesTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransporte(
			JComboBox jComboBoxTiposRelacionesTransporte) {
		this.jComboBoxTiposRelacionesTransporte = jComboBoxTiposRelacionesTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransporte(
			JComboBox jComboBoxTiposAccionesTransporte) {
		this.jComboBoxTiposAccionesTransporte = jComboBoxTiposAccionesTransporte;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransporte() {
		return this.jComboBoxTiposAccionesFormularioTransporte;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransporte(
			JComboBox jComboBoxTiposAccionesFormularioTransporte) {
		this.jComboBoxTiposAccionesFormularioTransporte = jComboBoxTiposAccionesFormularioTransporte;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transporteSessionBean=new TransporteSessionBean();
		
		this.transporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transporteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransporteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransporteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transporte MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
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
	
		TransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransporte= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransporte=new JButtonMe();
				this.jButtonModificarToolBarTransporte=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransporte,this.jTtoolBarDetalleTransporte,
							"actualizar","actualizar","Actualizar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransporte,this.jTtoolBarDetalleTransporte,
							"eliminar","eliminar","Eliminar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransporte,this.jTtoolBarDetalleTransporte,
							"cancelar","cancelar","Cancelar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransporte,this.jTtoolBarDetalleTransporte,
							"guardarcambios","guardarcambios","Guardar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransporte=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransporte=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransporte=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransporte=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransporte=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransporte= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransporte.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransporte,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransporte= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransporte.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransporte,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransporte= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransporte.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransporte,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransporte= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransporte.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransporte,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransporte= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransporte.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransporte,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransporte= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransporte.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransporte,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransporte,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransporte,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransporte.add(this.jMenuItemDetalleCerrarTransporte);
		
		this.jmenuDetalleAccionesTransporte.add(this.jMenuItemActualizarTransporte);
		this.jmenuDetalleAccionesTransporte.add(this.jMenuItemEliminarTransporte);
		this.jmenuDetalleAccionesTransporte.add(this.jMenuItemCancelarTransporte);		
		
		//this.jmenuDetalleDatosTransporte.add(this.jMenuItemDetalleAbrirOrderByTransporte);				
		this.jmenuDetalleDatosTransporte.add(this.jMenuItemDetalleMostarOcultarTransporte);				
				
		//this.jmenuDetalleAccionesTransporte.add(this.jMenuItemGuardarCambiosTransporte);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransporte.add(this.jmenuDetalleArchivoTransporte);		
		this.jmenuBarDetalleTransporte.add(this.jmenuDetalleAccionesTransporte);		
		this.jmenuBarDetalleTransporte.add(this.jmenuDetalleDatosTransporte);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransporte);				
	}
	
	
	public void inicializarElementosCamposTransporte() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransporte = new JLabelMe();
		jLabelIdTransporte.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransporte = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransporte.setToolTipText(TransporteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransporte= new GridBagLayout();

		this.jPanelidTransporte.setLayout(this.gridaBagLayoutTransporte);

		jLabelidTransporte = new JLabel();
		jLabelidTransporte.setText("Id");

		jLabelidTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTransporte = new JLabelMe();
		this.jLabelcodigoTransporte.setText(""+TransporteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTransporte.setToolTipText("Codigo");
		this.jLabelcodigoTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTransporte.setToolTipText(TransporteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTransporte = new GridBagLayout();
		this.jPanelcodigoTransporte.setLayout(this.gridaBagLayoutTransporte);


		jTextFieldcodigoTransporte= new JTextFieldMe();

		jTextFieldcodigoTransporte.setEnabled(false);
		jTextFieldcodigoTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTransporteBusqueda= new JButtonMe();
		this.jButtoncodigoTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTransporteBusqueda.setText("U");
		this.jButtoncodigoTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTransporteBusqueda"));

		if(this.transporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTransporteBusqueda.setVisible(false);		}


					
		this.jLabelnombreTransporte = new JLabelMe();
		this.jLabelnombreTransporte.setText(""+TransporteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTransporte.setToolTipText("Nombre");
		this.jLabelnombreTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTransporte.setToolTipText(TransporteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTransporte = new GridBagLayout();
		this.jPanelnombreTransporte.setLayout(this.gridaBagLayoutTransporte);


		jTextAreanombreTransporte= new JTextAreaMe();
		jTextAreanombreTransporte.setEnabled(false);
		jTextAreanombreTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTransporte.setLineWrap(true);
		jTextAreanombreTransporte.setWrapStyleWord(true);
		jTextAreanombreTransporte.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTransporte.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTransporte = new JScrollPane(jTextAreanombreTransporte);
		jscrollPanenombreTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTransporteBusqueda= new JButtonMe();
		this.jButtonnombreTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTransporteBusqueda.setText("U");
		this.jButtonnombreTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTransporteBusqueda"));

		if(this.transporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTransporteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransporte() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTransporte = new JLabelMe();
		this.jLabelid_empresaTransporte.setText(""+TransporteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTransporte.setToolTipText("Empresa");
		this.jLabelid_empresaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTransporte.setToolTipText(TransporteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTransporte = new GridBagLayout();
		this.jPanelid_empresaTransporte.setLayout(this.gridaBagLayoutTransporte);


		jComboBoxid_empresaTransporte= new JComboBoxMe();
		jComboBoxid_empresaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTransporte.setEnabled(false);

		this.jButtonid_empresaTransporte= new JButtonMe();
		this.jButtonid_empresaTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransporte.setText("Buscar");
		this.jButtonid_empresaTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransporte"));

		this.jButtonid_empresaTransporteBusqueda= new JButtonMe();
		this.jButtonid_empresaTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransporteBusqueda.setText("U");
		this.jButtonid_empresaTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransporteBusqueda"));

		if(this.transporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTransporteBusqueda.setVisible(false);		}

		this.jButtonid_empresaTransporteUpdate= new JButtonMe();
		this.jButtonid_empresaTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransporteUpdate.setText("U");
		this.jButtonid_empresaTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransporteUpdate"));



					
		this.jLabelid_tipo_via_transporteTransporte = new JLabelMe();
		this.jLabelid_tipo_via_transporteTransporte.setText(""+TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE+" : *");
		this.jLabelid_tipo_via_transporteTransporte.setToolTipText("Tipo Via Transporte");
		this.jLabelid_tipo_via_transporteTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transporteTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_via_transporteTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_via_transporteTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_via_transporteTransporte.setToolTipText(TransporteConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
		this.gridaBagLayoutTransporte = new GridBagLayout();
		this.jPanelid_tipo_via_transporteTransporte.setLayout(this.gridaBagLayoutTransporte);


		jComboBoxid_tipo_via_transporteTransporte= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_via_transporteTransporte= new JButtonMe();
		this.jButtonid_tipo_via_transporteTransporte.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteTransporte.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteTransporte.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteTransporte.setText("Buscar");
		this.jButtonid_tipo_via_transporteTransporte.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_via_transporteTransporte.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteTransporte,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_via_transporteTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteTransporte"));

		this.jButtonid_tipo_via_transporteTransporteBusqueda= new JButtonMe();
		this.jButtonid_tipo_via_transporteTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteTransporteBusqueda.setText("U");
		this.jButtonid_tipo_via_transporteTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_via_transporteTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_via_transporteTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteTransporteBusqueda"));

		if(this.transporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_via_transporteTransporteBusqueda.setVisible(false);		}

		this.jButtonid_tipo_via_transporteTransporteUpdate= new JButtonMe();
		this.jButtonid_tipo_via_transporteTransporteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteTransporteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteTransporteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteTransporteUpdate.setText("U");
		this.jButtonid_tipo_via_transporteTransporteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_via_transporteTransporteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteTransporteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_via_transporteTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteTransporteUpdate"));



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
		//this.jInternalFrameDetalleTransporte = new TransporteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transporte DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransporte= new GridBagLayout();
		

		
		String sToolTipTransporte="";
		sToolTipTransporte=TransporteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransporte+="(Cartera.Transporte)";
		}
		
		if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransporte+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransporte = new JButtonMe();
		this.jButtonModificarTransporte = new JButtonMe();
        this.jButtonActualizarTransporte = new JButtonMe();
        this.jButtonEliminarTransporte = new JButtonMe();
        this.jButtonCancelarTransporte = new JButtonMe();
        this.jButtonGuardarCambiosTransporte = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransporte = new JButtonMe();
		this.jButtonCerrarTransporte = new JButtonMe();
		
		this.jScrollPanelDatosTransporte = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransporte = new JScrollPane();
		this.jScrollPanelDatosGeneralTransporte = new JScrollPane();
				
		
		
		this.jPanelCamposTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Transporte";
		
		if(!this.transporteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transportes" + this.sPath));
		} else {
			this.jScrollPanelDatosTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransporte.setName("jPanelCamposTransporte"); 

		this.jPanelCamposOcultosTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransporte.setName("jPanelCamposOcultosTransporte"); 

        this.jPanelAccionesTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransporte.setToolTipText("Acciones");
        this.jPanelAccionesTransporte.setName("Acciones"); 

		this.jPanelAccionesFormularioTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransporte.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransporte.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransporte, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransporte.setText("Nuevo");
		this.jButtonModificarTransporte.setText("Editar");
        this.jButtonActualizarTransporte.setText("Actualizar");
        this.jButtonEliminarTransporte.setText("Eliminar");
        this.jButtonCancelarTransporte.setText("Cancelar");
        this.jButtonGuardarCambiosTransporte.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransporte.setText("Guardar");
		this.jButtonCerrarTransporte.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransporte,"nuevo_button","Nuevo",this.transporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransporte,"modificar_button","Editar",this.transporteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransporte,"actualizar_button","Actualizar",this.transporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransporte,"eliminar_button","Eliminar",this.transporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransporte,"cancelar_button","Cancelar",this.transporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransporte,"guardarcambios_button","Guardar",this.transporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransporte,"guardarcambiostabla_button","Guardar",this.transporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransporte,"cerrar_button","Salir",this.transporteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransporte.setToolTipText("Nuevo"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransporte.setToolTipText("Editar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransporte.setToolTipText("Actualizar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransporte.setToolTipText("Eliminar)"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransporte.setToolTipText("Cancelar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransporte.setToolTipText("Guardar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransporte.setToolTipText("Guardar"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransporte.setToolTipText("Salir"+" "+TransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransporte";
		inputMap = this.jButtonNuevoTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransporte"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransporte";
		inputMap = this.jButtonActualizarTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransporte"));
		
		//ELIMINAR
		sMapKey = "EliminarTransporte";
		inputMap = this.jButtonEliminarTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransporte"));
		
		//CANCELAR	
		sMapKey = "CancelarTransporte";
		inputMap = this.jButtonCancelarTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransporte"));
		
		//CERRAR		
		sMapKey = "CerrarTransporte";
		inputMap = this.jButtonCerrarTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransporte"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransporte";
		inputMap = this.jButtonGuardarCambiosTablaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransporte"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransporte.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransporte.setToolTipText("Nuevo Transporte");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransporte.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransporte.setToolTipText("Sin Cerrar Ventana Transporte");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransporte.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransporte.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransporte, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransporte.setText("Accion");
		this.jComboBoxTiposAccionesTransporte.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransporte.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransporte.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransporte = new JLabelMe();
		
		this.jLabelAccionesTransporte.setText("Acciones");		
		this.jLabelAccionesTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransporte();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransporte();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransporte=new JTabbedPane();
		this.jTabbedPaneRelacionesTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransporte.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransporte, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransporte = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransporte = new GridBagLayout();
		
		this.jPanelCamposTransporte.setLayout(gridaBagLayoutCamposTransporte);
		this.jPanelCamposOcultosTransporte.setLayout(gridaBagLayoutCamposOcultosTransporte);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransporte.gridy = 0;
	this.gridBagConstraintsTransporte.gridx = 0;
	this.gridBagConstraintsTransporte.ipadx = 0;
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransporte.add(jLabelIdTransporte, this.gridBagConstraintsTransporte);



	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransporte.gridy = 0;
	this.gridBagConstraintsTransporte.gridx = 1;
	this.gridBagConstraintsTransporte.ipadx = 0;
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransporte.add(jLabelidTransporte, this.gridBagConstraintsTransporte);


	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransporte.gridy = 0;
	this.gridBagConstraintsTransporte.gridx = 0;
	this.gridBagConstraintsTransporte.ipadx = 0;
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTransporte.add(jLabelid_empresaTransporte, this.gridBagConstraintsTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransporte = new GridBagConstraints();
		//this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = 0;
		this.gridBagConstraintsTransporte.gridx = 2;
		this.gridBagConstraintsTransporte.ipadx = 0;
		this.gridBagConstraintsTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransporte.add(jButtonid_empresaTransporteBusqueda, this.gridBagConstraintsTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransporte = new GridBagConstraints();
		//this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = 0;
		this.gridBagConstraintsTransporte.gridx = 3;
		this.gridBagConstraintsTransporte.ipadx = 0;
		this.gridBagConstraintsTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransporte.add(jButtonid_empresaTransporteUpdate, this.gridBagConstraintsTransporte);
	}

	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransporte.gridy = 0;
	this.gridBagConstraintsTransporte.gridx = 1;
	this.gridBagConstraintsTransporte.ipadx = 0;
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTransporte.add(jComboBoxid_empresaTransporte, this.gridBagConstraintsTransporte);


	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransporte.gridy = 0;
	this.gridBagConstraintsTransporte.gridx = 0;
	this.gridBagConstraintsTransporte.ipadx = 0;
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_via_transporteTransporte.add(jLabelid_tipo_via_transporteTransporte, this.gridBagConstraintsTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransporte = new GridBagConstraints();
		//this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = 0;
		this.gridBagConstraintsTransporte.gridx = 2;
		this.gridBagConstraintsTransporte.ipadx = 0;
		this.gridBagConstraintsTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteTransporte.add(jButtonid_tipo_via_transporteTransporteBusqueda, this.gridBagConstraintsTransporte);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransporte = new GridBagConstraints();
		//this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = 0;
		this.gridBagConstraintsTransporte.gridx = 3;
		this.gridBagConstraintsTransporte.ipadx = 0;
		this.gridBagConstraintsTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteTransporte.add(jButtonid_tipo_via_transporteTransporteUpdate, this.gridBagConstraintsTransporte);
	}

	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransporte.gridy = 0;
	this.gridBagConstraintsTransporte.gridx = 1;
	this.gridBagConstraintsTransporte.ipadx = 0;
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_via_transporteTransporte.add(jComboBoxid_tipo_via_transporteTransporte, this.gridBagConstraintsTransporte);


	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransporte.gridy = 0;
	this.gridBagConstraintsTransporte.gridx = 0;
	this.gridBagConstraintsTransporte.ipadx = 0;
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTransporte.add(jLabelcodigoTransporte, this.gridBagConstraintsTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransporte = new GridBagConstraints();
		//this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = 0;
		this.gridBagConstraintsTransporte.gridx = 2;
		this.gridBagConstraintsTransporte.ipadx = 0;
		this.gridBagConstraintsTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTransporte.add(jButtoncodigoTransporteBusqueda, this.gridBagConstraintsTransporte);
	}

	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransporte.gridy = 0;
	this.gridBagConstraintsTransporte.gridx = 1;
	this.gridBagConstraintsTransporte.ipadx = 0;
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTransporte.add(jTextFieldcodigoTransporte, this.gridBagConstraintsTransporte);


	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransporte.gridy = 0;
	this.gridBagConstraintsTransporte.gridx = 0;
	this.gridBagConstraintsTransporte.ipadx = 0;
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTransporte.add(jLabelnombreTransporte, this.gridBagConstraintsTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransporte = new GridBagConstraints();
		//this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransporte.gridy = 0;
		this.gridBagConstraintsTransporte.gridx = 2;
		this.gridBagConstraintsTransporte.ipadx = 0;
		this.gridBagConstraintsTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTransporte.add(jButtonnombreTransporteBusqueda, this.gridBagConstraintsTransporte);
	}

	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransporte.gridy = 0;
	this.gridBagConstraintsTransporte.gridx = 1;
	this.gridBagConstraintsTransporte.ipadx = 0;
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTransporte.add(jscrollPanenombreTransporte, this.gridBagConstraintsTransporte);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransporte.gridy = iYPanelCamposTransporte;
	this.gridBagConstraintsTransporte.gridx = iXPanelCamposTransporte++;
	this.gridBagConstraintsTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransporte.add(this.jPanelidTransporte, this.gridBagConstraintsTransporte);



	if(iXPanelCamposTransporte % 1==0) {
		iXPanelCamposTransporte=0;
		iYPanelCamposTransporte++;
	}
	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransporte.gridy = iYPanelCamposTransporte;
	this.gridBagConstraintsTransporte.gridx = iXPanelCamposTransporte++;
	this.gridBagConstraintsTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransporte.add(this.jPanelid_tipo_via_transporteTransporte, this.gridBagConstraintsTransporte);



	if(iXPanelCamposTransporte % 1==0) {
		iXPanelCamposTransporte=0;
		iYPanelCamposTransporte++;
	}
	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransporte.gridy = iYPanelCamposTransporte;
	this.gridBagConstraintsTransporte.gridx = iXPanelCamposTransporte++;
	this.gridBagConstraintsTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransporte.add(this.jPanelcodigoTransporte, this.gridBagConstraintsTransporte);



	if(iXPanelCamposTransporte % 1==0) {
		iXPanelCamposTransporte=0;
		iYPanelCamposTransporte++;
	}
	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransporte.gridy = iYPanelCamposTransporte;
	this.gridBagConstraintsTransporte.gridx = iXPanelCamposTransporte++;
	this.gridBagConstraintsTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransporte.add(this.jPanelnombreTransporte, this.gridBagConstraintsTransporte);



	if(iXPanelCamposTransporte % 1==0) {
		iXPanelCamposTransporte=0;
		iYPanelCamposTransporte++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransporte = new GridBagConstraints();
	this.gridBagConstraintsTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransporte.gridy = iYPanelCamposOcultosTransporte;
	this.gridBagConstraintsTransporte.gridx = iXPanelCamposOcultosTransporte++;
	this.gridBagConstraintsTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransporte.add(this.jPanelid_empresaTransporte, this.gridBagConstraintsTransporte);



	if(iXPanelCamposOcultosTransporte % 1==0) {
		iXPanelCamposOcultosTransporte=0;
		iYPanelCamposOcultosTransporte++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransporte= new GridBagLayout();
		this.jPanelAccionesTransporte.setLayout(gridaBagLayoutAccionesTransporte);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransporte= new GridBagLayout();
		this.jPanelAccionesFormularioTransporte.setLayout(gridaBagLayoutAccionesFormularioTransporte);
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransporte.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransporte.add(this.jComboBoxTiposAccionesFormularioTransporte, this.gridBagConstraintsTransporte);

		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransporte.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransporte.add(this.jCheckBoxPostAccionNuevoTransporte, this.gridBagConstraintsTransporte);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.transporteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransporte.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransporte.add(this.jCheckBoxPostAccionSinCerrarTransporte, this.gridBagConstraintsTransporte);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.transporteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.transporteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransporte.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransporte.add(this.jCheckBoxPostAccionSinMensajeTransporte, this.gridBagConstraintsTransporte);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = 0;
		this.gridBagConstraintsTransporte.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransporte.add(this.jButtonModificarTransporte, this.gridBagConstraintsTransporte);							

		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransporte.gridy = 0;
		this.gridBagConstraintsTransporte.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransporte.add(this.jButtonEliminarTransporte, this.gridBagConstraintsTransporte);
		
			
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = 0;		
		this.gridBagConstraintsTransporte.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransporte.add(this.jButtonActualizarTransporte, this.gridBagConstraintsTransporte);


		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = 0;		
		this.gridBagConstraintsTransporte.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransporte.add(this.jButtonGuardarCambiosTransporte, this.gridBagConstraintsTransporte);	
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = 0;		
		this.gridBagConstraintsTransporte.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransporte.add(this.jButtonCancelarTransporte, this.gridBagConstraintsTransporte);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransporte = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransporte);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transporteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransporte = new GridBagConstraints();						
			this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransporte.gridx = 0;		
			//this.gridBagConstraintsTransporte.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransporte.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransporte.gridx =0;
		this.gridBagConstraintsTransporte.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransporte.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransporte, this.gridBagConstraintsTransporte);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransporteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransporte = new TransporteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transporte DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transporte DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transporte Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransporteModel transporteModel=new TransporteModel(this);
			
			//SI USARA CLASE INTERNA
			//TransporteModel.TransporteFocusTraversalPolicy transporteFocusTraversalPolicy = transporteModel.new TransporteFocusTraversalPolicy(this);
			
			//transporteFocusTraversalPolicy.settransporteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transporteModel);
			
			
			this.jContentPaneDetalleTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransporte = new GridBagLayout();	
			this.jContentPaneDetalleTransporte.setLayout(gridaBagLayoutDetalleTransporte);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransporte = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransporte = new GridBagConstraints();
				this.gridBagConstraintsTransporte.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransporte.gridx = 0;
					
				
				this.jContentPaneDetalleTransporte.add(jTtoolBarDetalleTransporte, gridBagConstraintsTransporte);								
				
}
			
			this.jScrollPanelDatosEdicionTransporte=   new JScrollPane(jContentPaneDetalleTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransporte=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTransporte.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransporte.gridx = 0;
	        
			this.jContentPaneDetalleTransporte.add(jPanelCamposTransporte, gridBagConstraintsTransporte);
			
			
			
			
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
						&& transporteSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.transporteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransporte= new GridBagConstraints();
						this.gridBagConstraintsTransporte.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransporte.gridx = 0;
						this.jContentPaneDetalleTransporte.add(this.jTabbedPaneRelacionesTransporte, this.gridBagConstraintsTransporte);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransporte.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransporte.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransporte = new GridBagConstraints();
					this.gridBagConstraintsTransporte.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransporte.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransporte.gridx = 0;
					
				
					this.jContentPaneDetalleTransporte.add(jPanelCamposOcultosTransporte, gridBagConstraintsTransporte);
				
					this.jPanelCamposOcultosTransporte.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTransporte.gridx = 0;
	        this.gridBagConstraintsTransporte.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransporte.add(this.jPanelAccionesFormularioTransporte, this.gridBagConstraintsTransporte);							
			
			
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
	        this.gridBagConstraintsTransporte.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTransporte.gridx = 0;
	        
			
			this.jContentPaneDetalleTransporte.add(this.jPanelAccionesTransporte, this.gridBagConstraintsTransporte);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransporte);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransporte=   new JScrollPane(this.jPanelCamposTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransporte.gridx = 0;
			this.gridBagConstraintsTransporte.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransporte.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransporte.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransporte, this.gridBagConstraintsTransporte);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransporte.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransporte, this.gridBagConstraintsTransporte);			
			
			this.gridBagConstraintsTransporte = new GridBagConstraints();
			this.gridBagConstraintsTransporte.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransporte.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransporte, this.gridBagConstraintsTransporte);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransporte, this.gridBagConstraintsTransporte);
			
			
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransporte, this.gridBagConstraintsTransporte);
		
			
		this.gridBagConstraintsTransporte = new GridBagConstraints();
		this.gridBagConstraintsTransporte.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransporte.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransporte, this.gridBagConstraintsTransporte);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransporte;//jContentPane;
		
		return jScrollPanelDatosEdicionTransporte;
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
