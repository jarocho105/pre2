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
import com.bydan.erp.cartera.util.MontoConstantesFunciones;

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
public class MontoDetalleFormJInternalFrame extends MontoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMonto;
	
	protected JMenuBar jmenuBarDetalleMonto;
	
	protected JMenu jmenuDetalleMonto;
	protected JMenu jmenuDetalleArchivoMonto;
	protected JMenu jmenuDetalleAccionesMonto;
	protected JMenu jmenuDetalleDatosMonto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMonto;	
	protected GridBagConstraints gridBagConstraintsMonto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MontoBeanSwingJInternalFrameAdditional jInternalFrameDetalleMonto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public MontoSessionBean montoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public MontoLogic montoLogic;
	
	public JScrollPane jScrollPanelDatosMonto;
	public JScrollPane jScrollPanelDatosEdicionMonto;
	public JScrollPane jScrollPanelDatosGeneralMonto;
	
	protected JPanel jPanelCamposMonto;    
	protected JPanel jPanelCamposOcultosMonto;    	
	protected JPanel jPanelAccionesMonto;
	protected JPanel jPanelAccionesFormularioMonto;
    
	
	
	protected Integer iXPanelCamposMonto=0;
	protected Integer iYPanelCamposMonto=0;
	
	protected Integer iXPanelCamposOcultosMonto=0;
	protected Integer iYPanelCamposOcultosMonto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMonto;
	public JButton jButtonModificarMonto;
	public JButton jButtonActualizarMonto;
    public JButton jButtonEliminarMonto;
	public JButton jButtonCancelarMonto;
    public JButton jButtonGuardarCambiosMonto;
	public JButton jButtonGuardarCambiosTablaMonto;
	protected JButton jButtonCerrarMonto;
	
	
	protected JButton jButtonProcesarInformacionMonto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMonto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMonto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMonto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMonto;
	protected JButton jButtonModificarToolBarMonto;
	protected JButton jButtonActualizarToolBarMonto;
    protected JButton jButtonEliminarToolBarMonto;
	protected JButton jButtonCancelarToolBarMonto;
    protected JButton jButtonGuardarCambiosToolBarMonto;
	protected JButton jButtonGuardarCambiosTablaToolBarMonto;
	protected JButton jButtonMostrarOcultarTablaToolBarMonto;
	protected JButton jButtonCerrarToolBarMonto;
	
	protected JButton jButtonProcesarInformacionToolBarMonto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMonto;
	protected JMenuItem jMenuItemModificarMonto;
	protected JMenuItem jMenuItemActualizarMonto;
    protected JMenuItem jMenuItemEliminarMonto;
	protected JMenuItem jMenuItemCancelarMonto;
    protected JMenuItem jMenuItemGuardarCambiosMonto;
	protected JMenuItem jMenuItemGuardarCambiosTablaMonto;
	protected JMenuItem jMenuItemCerrarMonto;
	protected JMenuItem jMenuItemDetalleCerrarMonto;
	protected JMenuItem jMenuItemDetalleMostarOcultarMonto;
	
	protected JMenuItem jMenuItemProcesarInformacionMonto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMonto;
	protected JMenuItem jMenuItemMostrarOcultarMonto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMonto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMonto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMonto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMonto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMonto;
	public JLabel jLabelIdMonto;
	public JLabel jLabelidMonto;
	public JButton jButtonidMontoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_inicioMonto;
	public JLabel jLabelvalor_inicioMonto;
	public JTextField jTextFieldvalor_inicioMonto;
	public JButton jButtonvalor_inicioMontoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_finMonto;
	public JLabel jLabelvalor_finMonto;
	public JTextField jTextFieldvalor_finMonto;
	public JButton jButtonvalor_finMontoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasMonto;
	public JLabel jLabelnumero_diasMonto;
	public JTextField jTextFieldnumero_diasMonto;
	public JButton jButtonnumero_diasMontoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuotaMonto;
	public JLabel jLabelnumero_cuotaMonto;
	public JTextField jTextFieldnumero_cuotaMonto;
	public JButton jButtonnumero_cuotaMontoBusqueda= new JButtonMe();

	public JPanel jPaneles_generalMonto;
	public JLabel jLabeles_generalMonto;
	public JCheckBox jCheckBoxes_generalMonto;
	public JButton jButtones_generalMontoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMonto;
	public JLabel jLabelid_empresaMonto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMonto;
	public JButton jButtonid_empresaMonto= new JButtonMe();
	public JButton jButtonid_empresaMontoUpdate= new JButtonMe();
	public JButton jButtonid_empresaMontoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalMonto;
	public JLabel jLabelid_sucursalMonto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalMonto;
	public JButton jButtonid_sucursalMonto= new JButtonMe();
	public JButton jButtonid_sucursalMontoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalMontoBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteMonto;
	public JLabel jLabelid_clienteMonto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteMonto;
	public JButton jButtonid_clienteMonto= new JButtonMe();
	public JButton jButtonid_clienteMontoUpdate= new JButtonMe();
	public JButton jButtonid_clienteMontoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMonto;
	
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
	
	public MontoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMonto=new JPanel();
				this.jPanelAccionesFormularioMonto=new JPanel();
				this.jmenuBarDetalleMonto=new JMenuBar();
				this.jTtoolBarDetalleMonto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MontoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Monto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MontoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Monto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MontoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Monto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MontoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Monto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MontoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Monto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMonto() {
		return this.jButtonActualizarToolBarMonto;
	}
	
	public JButton getjButtonEliminarToolBarMonto() {
		return this.jButtonEliminarToolBarMonto;
	}
	
	public JButton getjButtonCancelarToolBarMonto() {
		return this.jButtonCancelarToolBarMonto;
	}		
	
	public JButton getjButtonProcesarInformacionMonto() {
		return this.jButtonProcesarInformacionMonto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMonto)	{
		this.jButtonProcesarInformacionMonto = jButtonProcesarInformacionMonto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMonto() {
		return this.jComboBoxTiposAccionesMonto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMonto(
			JComboBox jComboBoxTiposRelacionesMonto) {
		this.jComboBoxTiposRelacionesMonto = jComboBoxTiposRelacionesMonto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMonto(
			JComboBox jComboBoxTiposAccionesMonto) {
		this.jComboBoxTiposAccionesMonto = jComboBoxTiposAccionesMonto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMonto() {
		return this.jComboBoxTiposAccionesFormularioMonto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMonto(
			JComboBox jComboBoxTiposAccionesFormularioMonto) {
		this.jComboBoxTiposAccionesFormularioMonto = jComboBoxTiposAccionesFormularioMonto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.montoSessionBean=new MontoSessionBean();
		
		this.montoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.montoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.montoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MontoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MontoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MontoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Monto De Facturacion MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.montoSessionBean.getEsGuardarRelacionado()) {
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
	
		MontoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMonto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMonto=new JButtonMe();
				this.jButtonModificarToolBarMonto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMonto,this.jTtoolBarDetalleMonto,
							"actualizar","actualizar","Actualizar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMonto,this.jTtoolBarDetalleMonto,
							"eliminar","eliminar","Eliminar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMonto,this.jTtoolBarDetalleMonto,
							"cancelar","cancelar","Cancelar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMonto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMonto,this.jTtoolBarDetalleMonto,
							"guardarcambios","guardarcambios","Guardar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMonto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMonto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMonto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMonto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMonto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMonto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMonto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMonto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMonto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMonto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMonto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMonto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMonto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMonto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMonto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMonto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMonto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMonto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMonto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMonto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMonto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMonto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMonto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMonto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMonto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMonto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMonto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMonto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMonto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMonto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMonto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMonto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMonto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMonto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMonto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMonto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMonto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMonto.add(this.jMenuItemDetalleCerrarMonto);
		
		this.jmenuDetalleAccionesMonto.add(this.jMenuItemActualizarMonto);
		this.jmenuDetalleAccionesMonto.add(this.jMenuItemEliminarMonto);
		this.jmenuDetalleAccionesMonto.add(this.jMenuItemCancelarMonto);		
		
		//this.jmenuDetalleDatosMonto.add(this.jMenuItemDetalleAbrirOrderByMonto);				
		this.jmenuDetalleDatosMonto.add(this.jMenuItemDetalleMostarOcultarMonto);				
				
		//this.jmenuDetalleAccionesMonto.add(this.jMenuItemGuardarCambiosMonto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMonto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMonto.add(this.jmenuDetalleArchivoMonto);		
		this.jmenuBarDetalleMonto.add(this.jmenuDetalleAccionesMonto);		
		this.jmenuBarDetalleMonto.add(this.jmenuDetalleDatosMonto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMonto);				
	}
	
	
	public void inicializarElementosCamposMonto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMonto = new JLabelMe();
		jLabelIdMonto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMonto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMonto.setToolTipText(MontoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMonto= new GridBagLayout();

		this.jPanelidMonto.setLayout(this.gridaBagLayoutMonto);

		jLabelidMonto = new JLabel();
		jLabelidMonto.setText("Id");

		jLabelidMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalor_inicioMonto = new JLabelMe();
		this.jLabelvalor_inicioMonto.setText(""+MontoConstantesFunciones.LABEL_VALORINICIO+" : *");
		this.jLabelvalor_inicioMonto.setToolTipText("Valor Inicio");
		this.jLabelvalor_inicioMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_inicioMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_inicioMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_inicioMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_inicioMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_inicioMonto.setToolTipText(MontoConstantesFunciones.LABEL_VALORINICIO);
		this.gridaBagLayoutMonto = new GridBagLayout();
		this.jPanelvalor_inicioMonto.setLayout(this.gridaBagLayoutMonto);


		jTextFieldvalor_inicioMonto= new JTextFieldMe();
		jTextFieldvalor_inicioMonto.setEnabled(false);
		jTextFieldvalor_inicioMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_inicioMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_inicioMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_inicioMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_inicioMonto.setText("0.0");

		this.jButtonvalor_inicioMontoBusqueda= new JButtonMe();
		this.jButtonvalor_inicioMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_inicioMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_inicioMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_inicioMontoBusqueda.setText("U");
		this.jButtonvalor_inicioMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_inicioMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_inicioMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_inicioMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_inicioMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_inicioMontoBusqueda"));

		if(this.montoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_inicioMontoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_finMonto = new JLabelMe();
		this.jLabelvalor_finMonto.setText(""+MontoConstantesFunciones.LABEL_VALORFIN+" : *");
		this.jLabelvalor_finMonto.setToolTipText("Valor Fin");
		this.jLabelvalor_finMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_finMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_finMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_finMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_finMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_finMonto.setToolTipText(MontoConstantesFunciones.LABEL_VALORFIN);
		this.gridaBagLayoutMonto = new GridBagLayout();
		this.jPanelvalor_finMonto.setLayout(this.gridaBagLayoutMonto);


		jTextFieldvalor_finMonto= new JTextFieldMe();
		jTextFieldvalor_finMonto.setEnabled(false);
		jTextFieldvalor_finMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_finMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_finMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_finMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_finMonto.setText("0.0");

		this.jButtonvalor_finMontoBusqueda= new JButtonMe();
		this.jButtonvalor_finMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_finMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_finMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_finMontoBusqueda.setText("U");
		this.jButtonvalor_finMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_finMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_finMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_finMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_finMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_finMontoBusqueda"));

		if(this.montoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_finMontoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasMonto = new JLabelMe();
		this.jLabelnumero_diasMonto.setText(""+MontoConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasMonto.setToolTipText("Numero Dias");
		this.jLabelnumero_diasMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasMonto.setToolTipText(MontoConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutMonto = new GridBagLayout();
		this.jPanelnumero_diasMonto.setLayout(this.gridaBagLayoutMonto);


		jTextFieldnumero_diasMonto= new JTextFieldMe();
		jTextFieldnumero_diasMonto.setEnabled(false);
		jTextFieldnumero_diasMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasMonto.setText("0");

		this.jButtonnumero_diasMontoBusqueda= new JButtonMe();
		this.jButtonnumero_diasMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasMontoBusqueda.setText("U");
		this.jButtonnumero_diasMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasMontoBusqueda"));

		if(this.montoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasMontoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuotaMonto = new JLabelMe();
		this.jLabelnumero_cuotaMonto.setText(""+MontoConstantesFunciones.LABEL_NUMEROCUOTA+" : *");
		this.jLabelnumero_cuotaMonto.setToolTipText("Numero Cuota");
		this.jLabelnumero_cuotaMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotaMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuotaMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuotaMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuotaMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuotaMonto.setToolTipText(MontoConstantesFunciones.LABEL_NUMEROCUOTA);
		this.gridaBagLayoutMonto = new GridBagLayout();
		this.jPanelnumero_cuotaMonto.setLayout(this.gridaBagLayoutMonto);


		jTextFieldnumero_cuotaMonto= new JTextFieldMe();
		jTextFieldnumero_cuotaMonto.setEnabled(false);
		jTextFieldnumero_cuotaMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotaMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuotaMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuotaMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_cuotaMonto.setText("0");

		this.jButtonnumero_cuotaMontoBusqueda= new JButtonMe();
		this.jButtonnumero_cuotaMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotaMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuotaMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuotaMontoBusqueda.setText("U");
		this.jButtonnumero_cuotaMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuotaMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuotaMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuotaMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuotaMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuotaMontoBusqueda"));

		if(this.montoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuotaMontoBusqueda.setVisible(false);		}


					
		this.jLabeles_generalMonto = new JLabelMe();
		this.jLabeles_generalMonto.setText(""+MontoConstantesFunciones.LABEL_ESGENERAL+" : *");
		this.jLabeles_generalMonto.setToolTipText("Es General");
		this.jLabeles_generalMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_generalMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_generalMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_generalMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_generalMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_generalMonto.setToolTipText(MontoConstantesFunciones.LABEL_ESGENERAL);
		this.gridaBagLayoutMonto = new GridBagLayout();
		this.jPaneles_generalMonto.setLayout(this.gridaBagLayoutMonto);


		jCheckBoxes_generalMonto= new JCheckBoxMe();
		jCheckBoxes_generalMonto.setEnabled(false);

		jCheckBoxes_generalMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_generalMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_generalMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_generalMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_generalMontoBusqueda= new JButtonMe();
		this.jButtones_generalMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_generalMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_generalMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_generalMontoBusqueda.setText("U");
		this.jButtones_generalMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_generalMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_generalMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_generalMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_generalMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_generalMontoBusqueda"));

		if(this.montoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_generalMontoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMonto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMonto = new JLabelMe();
		this.jLabelid_empresaMonto.setText(""+MontoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMonto.setToolTipText("Empresa");
		this.jLabelid_empresaMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMonto.setToolTipText(MontoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMonto = new GridBagLayout();
		this.jPanelid_empresaMonto.setLayout(this.gridaBagLayoutMonto);


		jComboBoxid_empresaMonto= new JComboBoxMe();
		jComboBoxid_empresaMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMonto.setEnabled(false);

		this.jButtonid_empresaMonto= new JButtonMe();
		this.jButtonid_empresaMonto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMonto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMonto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMonto.setText("Buscar");
		this.jButtonid_empresaMonto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMonto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMonto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMonto"));

		this.jButtonid_empresaMontoBusqueda= new JButtonMe();
		this.jButtonid_empresaMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMontoBusqueda.setText("U");
		this.jButtonid_empresaMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMontoBusqueda"));

		if(this.montoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMontoBusqueda.setVisible(false);		}

		this.jButtonid_empresaMontoUpdate= new JButtonMe();
		this.jButtonid_empresaMontoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMontoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMontoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMontoUpdate.setText("U");
		this.jButtonid_empresaMontoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMontoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMontoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMontoUpdate"));



					
		this.jLabelid_sucursalMonto = new JLabelMe();
		this.jLabelid_sucursalMonto.setText(""+MontoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalMonto.setToolTipText("Sucursal");
		this.jLabelid_sucursalMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalMonto.setToolTipText(MontoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutMonto = new GridBagLayout();
		this.jPanelid_sucursalMonto.setLayout(this.gridaBagLayoutMonto);


		jComboBoxid_sucursalMonto= new JComboBoxMe();
		jComboBoxid_sucursalMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalMonto.setEnabled(false);

		this.jButtonid_sucursalMonto= new JButtonMe();
		this.jButtonid_sucursalMonto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMonto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMonto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMonto.setText("Buscar");
		this.jButtonid_sucursalMonto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalMonto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMonto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMonto"));

		this.jButtonid_sucursalMontoBusqueda= new JButtonMe();
		this.jButtonid_sucursalMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMontoBusqueda.setText("U");
		this.jButtonid_sucursalMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMontoBusqueda"));

		if(this.montoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalMontoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalMontoUpdate= new JButtonMe();
		this.jButtonid_sucursalMontoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMontoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMontoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMontoUpdate.setText("U");
		this.jButtonid_sucursalMontoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalMontoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMontoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMontoUpdate"));



					
		this.jLabelid_clienteMonto = new JLabelMe();
		this.jLabelid_clienteMonto.setText(""+MontoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteMonto.setToolTipText("Cliente");
		this.jLabelid_clienteMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteMonto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteMonto.setToolTipText(MontoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutMonto = new GridBagLayout();
		this.jPanelid_clienteMonto.setLayout(this.gridaBagLayoutMonto);


		jComboBoxid_clienteMonto= new JComboBoxMe();
		jComboBoxid_clienteMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteMonto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteMonto= new JButtonMe();
		this.jButtonid_clienteMonto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteMonto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteMonto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteMonto.setText("Buscar");
		this.jButtonid_clienteMonto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteMonto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteMonto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteMonto"));

		this.jButtonid_clienteMontoBusqueda= new JButtonMe();
		this.jButtonid_clienteMontoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteMontoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteMontoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteMontoBusqueda.setText("U");
		this.jButtonid_clienteMontoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteMontoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteMontoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteMontoBusqueda"));

		if(this.montoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteMontoBusqueda.setVisible(false);		}

		this.jButtonid_clienteMontoUpdate= new JButtonMe();
		this.jButtonid_clienteMontoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteMontoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteMontoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteMontoUpdate.setText("U");
		this.jButtonid_clienteMontoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteMontoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteMontoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteMonto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteMonto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteMontoUpdate"));



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
		//this.jInternalFrameDetalleMonto = new MontoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Monto De Facturacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMonto= new GridBagLayout();
		

		
		String sToolTipMonto="";
		sToolTipMonto=MontoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMonto+="(Cartera.Monto)";
		}
		
		if(!this.montoSessionBean.getEsGuardarRelacionado()) {
			sToolTipMonto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMonto = new JButtonMe();
		this.jButtonModificarMonto = new JButtonMe();
        this.jButtonActualizarMonto = new JButtonMe();
        this.jButtonEliminarMonto = new JButtonMe();
        this.jButtonCancelarMonto = new JButtonMe();
        this.jButtonGuardarCambiosMonto = new JButtonMe();
		this.jButtonGuardarCambiosTablaMonto = new JButtonMe();
		this.jButtonCerrarMonto = new JButtonMe();
		
		this.jScrollPanelDatosMonto = new JScrollPane();   
        this.jScrollPanelDatosEdicionMonto = new JScrollPane();
		this.jScrollPanelDatosGeneralMonto = new JScrollPane();
				
		
		
		this.jPanelCamposMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Monto De Facturacion";
		
		if(!this.montoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Monto De Facturacions" + this.sPath));
		} else {
			this.jScrollPanelDatosMonto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMonto.setName("jPanelCamposMonto"); 

		this.jPanelCamposOcultosMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMonto.setName("jPanelCamposOcultosMonto"); 

        this.jPanelAccionesMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMonto.setToolTipText("Acciones");
        this.jPanelAccionesMonto.setName("Acciones"); 

		this.jPanelAccionesFormularioMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMonto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMonto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMonto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMonto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMonto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMonto.setText("Nuevo");
		this.jButtonModificarMonto.setText("Editar");
        this.jButtonActualizarMonto.setText("Actualizar");
        this.jButtonEliminarMonto.setText("Eliminar");
        this.jButtonCancelarMonto.setText("Cancelar");
        this.jButtonGuardarCambiosMonto.setText("Guardar");
		this.jButtonGuardarCambiosTablaMonto.setText("Guardar");
		this.jButtonCerrarMonto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMonto,"nuevo_button","Nuevo",this.montoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMonto,"modificar_button","Editar",this.montoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMonto,"actualizar_button","Actualizar",this.montoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMonto,"eliminar_button","Eliminar",this.montoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMonto,"cancelar_button","Cancelar",this.montoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMonto,"guardarcambios_button","Guardar",this.montoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMonto,"guardarcambiostabla_button","Guardar",this.montoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMonto,"cerrar_button","Salir",this.montoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMonto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMonto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMonto.setToolTipText("Nuevo"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMonto.setToolTipText("Editar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMonto.setToolTipText("Actualizar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMonto.setToolTipText("Eliminar)"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMonto.setToolTipText("Cancelar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMonto.setToolTipText("Guardar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMonto.setToolTipText("Guardar"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMonto.setToolTipText("Salir"+" "+MontoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMonto";
		inputMap = this.jButtonNuevoMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMonto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMonto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMonto";
		inputMap = this.jButtonActualizarMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMonto"));
		
		//ELIMINAR
		sMapKey = "EliminarMonto";
		inputMap = this.jButtonEliminarMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMonto"));
		
		//CANCELAR	
		sMapKey = "CancelarMonto";
		inputMap = this.jButtonCancelarMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMonto"));
		
		//CERRAR		
		sMapKey = "CerrarMonto";
		inputMap = this.jButtonCerrarMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMonto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMonto";
		inputMap = this.jButtonGuardarCambiosTablaMonto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMonto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMonto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMonto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMonto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMonto.setToolTipText("Nuevo Monto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMonto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMonto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMonto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMonto.setToolTipText("Sin Cerrar Ventana Monto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMonto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMonto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMonto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMonto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMonto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMonto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMonto.setText("Accion");
		this.jComboBoxTiposAccionesMonto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMonto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMonto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMonto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMonto = new JLabelMe();
		
		this.jLabelAccionesMonto.setText("Acciones");		
		this.jLabelAccionesMonto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMonto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMonto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMonto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMonto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMonto=new JTabbedPane();
		this.jTabbedPaneRelacionesMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMonto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMonto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMonto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMonto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMonto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMonto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMonto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMonto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMonto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMonto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMonto = new GridBagLayout();
		
		this.jPanelCamposMonto.setLayout(gridaBagLayoutCamposMonto);
		this.jPanelCamposOcultosMonto.setLayout(gridaBagLayoutCamposOcultosMonto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 0;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMonto.add(jLabelIdMonto, this.gridBagConstraintsMonto);



	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 1;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMonto.add(jLabelidMonto, this.gridBagConstraintsMonto);


	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 0;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMonto.add(jLabelid_empresaMonto, this.gridBagConstraintsMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 2;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMonto.add(jButtonid_empresaMontoBusqueda, this.gridBagConstraintsMonto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 3;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMonto.add(jButtonid_empresaMontoUpdate, this.gridBagConstraintsMonto);
	}

	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 1;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMonto.add(jComboBoxid_empresaMonto, this.gridBagConstraintsMonto);


	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 0;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalMonto.add(jLabelid_sucursalMonto, this.gridBagConstraintsMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 2;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMonto.add(jButtonid_sucursalMontoBusqueda, this.gridBagConstraintsMonto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 3;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMonto.add(jButtonid_sucursalMontoUpdate, this.gridBagConstraintsMonto);
	}

	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 1;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalMonto.add(jComboBoxid_sucursalMonto, this.gridBagConstraintsMonto);


	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 0;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteMonto.add(jLabelid_clienteMonto, this.gridBagConstraintsMonto);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsMonto = new GridBagConstraints();
	//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 2;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteMonto.add(jButtonid_clienteMonto, this.gridBagConstraintsMonto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 3;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteMonto.add(jButtonid_clienteMontoBusqueda, this.gridBagConstraintsMonto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 4;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteMonto.add(jButtonid_clienteMontoUpdate, this.gridBagConstraintsMonto);
	}

	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 1;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteMonto.add(jComboBoxid_clienteMonto, this.gridBagConstraintsMonto);


	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 0;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_inicioMonto.add(jLabelvalor_inicioMonto, this.gridBagConstraintsMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 2;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_inicioMonto.add(jButtonvalor_inicioMontoBusqueda, this.gridBagConstraintsMonto);
	}

	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 1;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_inicioMonto.add(jTextFieldvalor_inicioMonto, this.gridBagConstraintsMonto);


	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 0;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_finMonto.add(jLabelvalor_finMonto, this.gridBagConstraintsMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 2;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_finMonto.add(jButtonvalor_finMontoBusqueda, this.gridBagConstraintsMonto);
	}

	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 1;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_finMonto.add(jTextFieldvalor_finMonto, this.gridBagConstraintsMonto);


	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 0;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasMonto.add(jLabelnumero_diasMonto, this.gridBagConstraintsMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 2;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasMonto.add(jButtonnumero_diasMontoBusqueda, this.gridBagConstraintsMonto);
	}

	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 1;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasMonto.add(jTextFieldnumero_diasMonto, this.gridBagConstraintsMonto);


	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 0;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuotaMonto.add(jLabelnumero_cuotaMonto, this.gridBagConstraintsMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 2;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuotaMonto.add(jButtonnumero_cuotaMontoBusqueda, this.gridBagConstraintsMonto);
	}

	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 1;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuotaMonto.add(jTextFieldnumero_cuotaMonto, this.gridBagConstraintsMonto);


	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 0;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_generalMonto.add(jLabeles_generalMonto, this.gridBagConstraintsMonto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMonto = new GridBagConstraints();
		//this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = 2;
		this.gridBagConstraintsMonto.ipadx = 0;
		this.gridBagConstraintsMonto.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_generalMonto.add(jButtones_generalMontoBusqueda, this.gridBagConstraintsMonto);
	}

	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMonto.gridy = 0;
	this.gridBagConstraintsMonto.gridx = 1;
	this.gridBagConstraintsMonto.ipadx = 0;
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_generalMonto.add(jCheckBoxes_generalMonto, this.gridBagConstraintsMonto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMonto.gridy = iYPanelCamposMonto;
	this.gridBagConstraintsMonto.gridx = iXPanelCamposMonto++;
	this.gridBagConstraintsMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMonto.add(this.jPanelidMonto, this.gridBagConstraintsMonto);



	if(iXPanelCamposMonto % 1==0) {
		iXPanelCamposMonto=0;
		iYPanelCamposMonto++;
	}
	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMonto.gridy = iYPanelCamposMonto;
	this.gridBagConstraintsMonto.gridx = iXPanelCamposMonto++;
	this.gridBagConstraintsMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMonto.add(this.jPanelid_clienteMonto, this.gridBagConstraintsMonto);



	if(iXPanelCamposMonto % 1==0) {
		iXPanelCamposMonto=0;
		iYPanelCamposMonto++;
	}
	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMonto.gridy = iYPanelCamposMonto;
	this.gridBagConstraintsMonto.gridx = iXPanelCamposMonto++;
	this.gridBagConstraintsMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMonto.add(this.jPanelvalor_inicioMonto, this.gridBagConstraintsMonto);



	if(iXPanelCamposMonto % 1==0) {
		iXPanelCamposMonto=0;
		iYPanelCamposMonto++;
	}
	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMonto.gridy = iYPanelCamposMonto;
	this.gridBagConstraintsMonto.gridx = iXPanelCamposMonto++;
	this.gridBagConstraintsMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMonto.add(this.jPanelvalor_finMonto, this.gridBagConstraintsMonto);



	if(iXPanelCamposMonto % 1==0) {
		iXPanelCamposMonto=0;
		iYPanelCamposMonto++;
	}
	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMonto.gridy = iYPanelCamposMonto;
	this.gridBagConstraintsMonto.gridx = iXPanelCamposMonto++;
	this.gridBagConstraintsMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMonto.add(this.jPanelnumero_diasMonto, this.gridBagConstraintsMonto);



	if(iXPanelCamposMonto % 1==0) {
		iXPanelCamposMonto=0;
		iYPanelCamposMonto++;
	}
	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMonto.gridy = iYPanelCamposMonto;
	this.gridBagConstraintsMonto.gridx = iXPanelCamposMonto++;
	this.gridBagConstraintsMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMonto.add(this.jPanelnumero_cuotaMonto, this.gridBagConstraintsMonto);



	if(iXPanelCamposMonto % 1==0) {
		iXPanelCamposMonto=0;
		iYPanelCamposMonto++;
	}
	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMonto.gridy = iYPanelCamposMonto;
	this.gridBagConstraintsMonto.gridx = iXPanelCamposMonto++;
	this.gridBagConstraintsMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMonto.add(this.jPaneles_generalMonto, this.gridBagConstraintsMonto);



	if(iXPanelCamposMonto % 1==0) {
		iXPanelCamposMonto=0;
		iYPanelCamposMonto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMonto.gridy = iYPanelCamposOcultosMonto;
	this.gridBagConstraintsMonto.gridx = iXPanelCamposOcultosMonto++;
	this.gridBagConstraintsMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMonto.add(this.jPanelid_empresaMonto, this.gridBagConstraintsMonto);



	if(iXPanelCamposOcultosMonto % 1==0) {
		iXPanelCamposOcultosMonto=0;
		iYPanelCamposOcultosMonto++;
	}
	this.gridBagConstraintsMonto = new GridBagConstraints();
	this.gridBagConstraintsMonto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMonto.gridy = iYPanelCamposOcultosMonto;
	this.gridBagConstraintsMonto.gridx = iXPanelCamposOcultosMonto++;
	this.gridBagConstraintsMonto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMonto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMonto.add(this.jPanelid_sucursalMonto, this.gridBagConstraintsMonto);



	if(iXPanelCamposOcultosMonto % 1==0) {
		iXPanelCamposOcultosMonto=0;
		iYPanelCamposOcultosMonto++;
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
			
		GridBagLayout gridaBagLayoutAccionesMonto= new GridBagLayout();
		this.jPanelAccionesMonto.setLayout(gridaBagLayoutAccionesMonto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMonto= new GridBagLayout();
		this.jPanelAccionesFormularioMonto.setLayout(gridaBagLayoutAccionesFormularioMonto);
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMonto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMonto.add(this.jComboBoxTiposAccionesFormularioMonto, this.gridBagConstraintsMonto);

		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMonto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMonto.add(this.jCheckBoxPostAccionNuevoMonto, this.gridBagConstraintsMonto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.montoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMonto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMonto.add(this.jCheckBoxPostAccionSinCerrarMonto, this.gridBagConstraintsMonto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.montoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.montoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMonto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMonto.add(this.jCheckBoxPostAccionSinMensajeMonto, this.gridBagConstraintsMonto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx = iPosXAccion++;
			
		this.jPanelAccionesMonto.add(this.jButtonModificarMonto, this.gridBagConstraintsMonto);							

		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMonto.gridy = 0;
		this.gridBagConstraintsMonto.gridx =iPosXAccion++;
			
		this.jPanelAccionesMonto.add(this.jButtonEliminarMonto, this.gridBagConstraintsMonto);
		
			
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = 0;		
		this.gridBagConstraintsMonto.gridx = iPosXAccion++;
		
		this.jPanelAccionesMonto.add(this.jButtonActualizarMonto, this.gridBagConstraintsMonto);


		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = 0;		
		this.gridBagConstraintsMonto.gridx = iPosXAccion++;
		
		this.jPanelAccionesMonto.add(this.jButtonGuardarCambiosMonto, this.gridBagConstraintsMonto);	
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = 0;		
		this.gridBagConstraintsMonto.gridx =iPosXAccion++;
		
		this.jPanelAccionesMonto.add(this.jButtonCancelarMonto, this.gridBagConstraintsMonto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMonto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMonto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.montoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMonto = new GridBagConstraints();						
			this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMonto.gridx = 0;		
			//this.gridBagConstraintsMonto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMonto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMonto.gridx =0;
		this.gridBagConstraintsMonto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMonto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMonto, this.gridBagConstraintsMonto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MontoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMonto = new MontoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Monto De Facturacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Monto De Facturacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Monto De Facturacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MontoModel montoModel=new MontoModel(this);
			
			//SI USARA CLASE INTERNA
			//MontoModel.MontoFocusTraversalPolicy montoFocusTraversalPolicy = montoModel.new MontoFocusTraversalPolicy(this);
			
			//montoFocusTraversalPolicy.setmontoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(montoModel);
			
			
			this.jContentPaneDetalleMonto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMonto = new GridBagLayout();	
			this.jContentPaneDetalleMonto.setLayout(gridaBagLayoutDetalleMonto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMonto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMonto = new GridBagConstraints();
				this.gridBagConstraintsMonto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMonto.gridx = 0;
					
				
				this.jContentPaneDetalleMonto.add(jTtoolBarDetalleMonto, gridBagConstraintsMonto);								
				
}
			
			this.jScrollPanelDatosEdicionMonto=   new JScrollPane(jContentPaneDetalleMonto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMonto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMonto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMonto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMonto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMonto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMonto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMonto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMonto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMonto.gridx = 0;
	        
			this.jContentPaneDetalleMonto.add(jPanelCamposMonto, gridBagConstraintsMonto);
			
			
			
			
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
						&& montoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.montoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMonto= new GridBagConstraints();
						this.gridBagConstraintsMonto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMonto.gridx = 0;
						this.jContentPaneDetalleMonto.add(this.jTabbedPaneRelacionesMonto, this.gridBagConstraintsMonto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMonto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMonto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMonto = new GridBagConstraints();
					this.gridBagConstraintsMonto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMonto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMonto.gridx = 0;
					
				
					this.jContentPaneDetalleMonto.add(jPanelCamposOcultosMonto, gridBagConstraintsMonto);
				
					this.jPanelCamposOcultosMonto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMonto.gridx = 0;
	        this.gridBagConstraintsMonto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMonto.add(this.jPanelAccionesFormularioMonto, this.gridBagConstraintsMonto);							
			
			
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
	        this.gridBagConstraintsMonto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMonto.gridx = 0;
	        
			
			this.jContentPaneDetalleMonto.add(this.jPanelAccionesMonto, this.gridBagConstraintsMonto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMonto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMonto=   new JScrollPane(this.jPanelCamposMonto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMonto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMonto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMonto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMonto.gridx = 0;
			this.gridBagConstraintsMonto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMonto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMonto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMonto, this.gridBagConstraintsMonto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMonto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMonto, this.gridBagConstraintsMonto);			
			
			this.gridBagConstraintsMonto = new GridBagConstraints();
			this.gridBagConstraintsMonto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMonto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMonto, this.gridBagConstraintsMonto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMonto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMonto, this.gridBagConstraintsMonto);
			
			
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMonto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMonto, this.gridBagConstraintsMonto);
		
			
		this.gridBagConstraintsMonto = new GridBagConstraints();
		this.gridBagConstraintsMonto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMonto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMonto, this.gridBagConstraintsMonto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMonto;//jContentPane;
		
		return jScrollPanelDatosEdicionMonto;
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
