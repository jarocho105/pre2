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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.PresuTransferenciaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class PresuTransferenciaDetalleFormJInternalFrame extends PresuTransferenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresuTransferencia;
	
	protected JMenuBar jmenuBarDetallePresuTransferencia;
	
	protected JMenu jmenuDetallePresuTransferencia;
	protected JMenu jmenuDetalleArchivoPresuTransferencia;
	protected JMenu jmenuDetalleAccionesPresuTransferencia;
	protected JMenu jmenuDetalleDatosPresuTransferencia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuTransferencia;	
	protected GridBagConstraints gridBagConstraintsPresuTransferencia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresuTransferenciaBeanSwingJInternalFrameAdditional jInternalFrameDetallePresuTransferencia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PresuProyectoBeanSwingJInternalFrame presuproyectoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_presuproyecto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledestino="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public PresuTransferenciaSessionBean presutransferenciaSessionBean;
	
	
	
	
	public PresuProyectoSessionBean presuproyectoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontabledestinoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public PresuTransferenciaLogic presutransferenciaLogic;
	
	public JScrollPane jScrollPanelDatosPresuTransferencia;
	public JScrollPane jScrollPanelDatosEdicionPresuTransferencia;
	public JScrollPane jScrollPanelDatosGeneralPresuTransferencia;
	
	protected JPanel jPanelCamposPresuTransferencia;    
	protected JPanel jPanelCamposOcultosPresuTransferencia;    	
	protected JPanel jPanelAccionesPresuTransferencia;
	protected JPanel jPanelAccionesFormularioPresuTransferencia;
    
	
	
	protected Integer iXPanelCamposPresuTransferencia=0;
	protected Integer iYPanelCamposPresuTransferencia=0;
	
	protected Integer iXPanelCamposOcultosPresuTransferencia=0;
	protected Integer iYPanelCamposOcultosPresuTransferencia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresuTransferencia;
	public JButton jButtonModificarPresuTransferencia;
	public JButton jButtonActualizarPresuTransferencia;
    public JButton jButtonEliminarPresuTransferencia;
	public JButton jButtonCancelarPresuTransferencia;
    public JButton jButtonGuardarCambiosPresuTransferencia;
	public JButton jButtonGuardarCambiosTablaPresuTransferencia;
	protected JButton jButtonCerrarPresuTransferencia;
	
	
	protected JButton jButtonProcesarInformacionPresuTransferencia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresuTransferencia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresuTransferencia;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresuTransferencia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuTransferencia;
	protected JButton jButtonModificarToolBarPresuTransferencia;
	protected JButton jButtonActualizarToolBarPresuTransferencia;
    protected JButton jButtonEliminarToolBarPresuTransferencia;
	protected JButton jButtonCancelarToolBarPresuTransferencia;
    protected JButton jButtonGuardarCambiosToolBarPresuTransferencia;
	protected JButton jButtonGuardarCambiosTablaToolBarPresuTransferencia;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuTransferencia;
	protected JButton jButtonCerrarToolBarPresuTransferencia;
	
	protected JButton jButtonProcesarInformacionToolBarPresuTransferencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuTransferencia;
	protected JMenuItem jMenuItemModificarPresuTransferencia;
	protected JMenuItem jMenuItemActualizarPresuTransferencia;
    protected JMenuItem jMenuItemEliminarPresuTransferencia;
	protected JMenuItem jMenuItemCancelarPresuTransferencia;
    protected JMenuItem jMenuItemGuardarCambiosPresuTransferencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuTransferencia;
	protected JMenuItem jMenuItemCerrarPresuTransferencia;
	protected JMenuItem jMenuItemDetalleCerrarPresuTransferencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuTransferencia;
	
	protected JMenuItem jMenuItemProcesarInformacionPresuTransferencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuTransferencia;
	protected JMenuItem jMenuItemMostrarOcultarPresuTransferencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuTransferencia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuTransferencia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresuTransferencia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresuTransferencia;
	public JLabel jLabelIdPresuTransferencia;
	public JLabel jLabelidPresuTransferencia;
	public JButton jButtonidPresuTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelfechaPresuTransferencia;
	public JLabel jLabelfechaPresuTransferencia;
	//public JFormattedTextField jDateChooserfechaPresuTransferencia;

	public JDateChooser jDateChooserfechaPresuTransferencia;
	public JButton jButtonfechaPresuTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelvalorPresuTransferencia;
	public JLabel jLabelvalorPresuTransferencia;
	public JTextField jTextFieldvalorPresuTransferencia;
	public JButton jButtonvalorPresuTransferenciaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPresuTransferencia;
	public JLabel jLabeldescripcionPresuTransferencia;
	public JTextArea jTextAreadescripcionPresuTransferencia;
	public JScrollPane jscrollPanedescripcionPresuTransferencia;
	public JButton jButtondescripcionPresuTransferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_presu_proyectoPresuTransferencia;
	public JLabel jLabelid_presu_proyectoPresuTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_presu_proyectoPresuTransferencia;
	public JButton jButtonid_presu_proyectoPresuTransferencia= new JButtonMe();
	public JButton jButtonid_presu_proyectoPresuTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_presu_proyectoPresuTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contablePresuTransferencia;
	public JLabel jLabelid_cuenta_contablePresuTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contablePresuTransferencia;
	public JButton jButtonid_cuenta_contablePresuTransferencia= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresuTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresuTransferenciaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contablePresuTransferenciaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_destinoPresuTransferencia;
	public JLabel jLabelid_cuenta_contable_destinoPresuTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_destinoPresuTransferencia;
	public JButton jButtonid_cuenta_contable_destinoPresuTransferencia= new JButtonMe();
	public JButton jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_destinoPresuTransferenciaArbol= new JButtonMe();

	public JPanel jPanelid_empleadoPresuTransferencia;
	public JLabel jLabelid_empleadoPresuTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoPresuTransferencia;
	public JButton jButtonid_empleadoPresuTransferencia= new JButtonMe();
	public JButton jButtonid_empleadoPresuTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoPresuTransferenciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresuTransferencia;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PresuTransferenciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresuTransferencia=new JPanel();
				this.jPanelAccionesFormularioPresuTransferencia=new JPanel();
				this.jmenuBarDetallePresuTransferencia=new JMenuBar();
				this.jTtoolBarDetallePresuTransferencia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTransferenciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresuTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresuTransferenciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresuTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTransferenciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTransferenciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTransferenciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresuTransferencia() {
		return this.jButtonActualizarToolBarPresuTransferencia;
	}
	
	public JButton getjButtonEliminarToolBarPresuTransferencia() {
		return this.jButtonEliminarToolBarPresuTransferencia;
	}
	
	public JButton getjButtonCancelarToolBarPresuTransferencia() {
		return this.jButtonCancelarToolBarPresuTransferencia;
	}		
	
	public JButton getjButtonProcesarInformacionPresuTransferencia() {
		return this.jButtonProcesarInformacionPresuTransferencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuTransferencia)	{
		this.jButtonProcesarInformacionPresuTransferencia = jButtonProcesarInformacionPresuTransferencia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuTransferencia() {
		return this.jComboBoxTiposAccionesPresuTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuTransferencia(
			JComboBox jComboBoxTiposRelacionesPresuTransferencia) {
		this.jComboBoxTiposRelacionesPresuTransferencia = jComboBoxTiposRelacionesPresuTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuTransferencia(
			JComboBox jComboBoxTiposAccionesPresuTransferencia) {
		this.jComboBoxTiposAccionesPresuTransferencia = jComboBoxTiposAccionesPresuTransferencia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresuTransferencia() {
		return this.jComboBoxTiposAccionesFormularioPresuTransferencia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresuTransferencia(
			JComboBox jComboBoxTiposAccionesFormularioPresuTransferencia) {
		this.jComboBoxTiposAccionesFormularioPresuTransferencia = jComboBoxTiposAccionesFormularioPresuTransferencia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presutransferenciaSessionBean=new PresuTransferenciaSessionBean();
		
		this.presutransferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presutransferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presutransferenciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuTransferenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transferencia MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
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
	
		PresuTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresuTransferencia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresuTransferencia=new JButtonMe();
				this.jButtonModificarToolBarPresuTransferencia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresuTransferencia,this.jTtoolBarDetallePresuTransferencia,
							"actualizar","actualizar","Actualizar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresuTransferencia,this.jTtoolBarDetallePresuTransferencia,
							"eliminar","eliminar","Eliminar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresuTransferencia,this.jTtoolBarDetallePresuTransferencia,
							"cancelar","cancelar","Cancelar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresuTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresuTransferencia,this.jTtoolBarDetallePresuTransferencia,
							"guardarcambios","guardarcambios","Guardar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresuTransferencia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresuTransferencia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresuTransferencia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresuTransferencia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresuTransferencia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuTransferencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuTransferencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuTransferencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresuTransferencia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresuTransferencia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresuTransferencia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresuTransferencia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresuTransferencia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresuTransferencia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresuTransferencia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresuTransferencia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresuTransferencia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresuTransferencia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresuTransferencia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresuTransferencia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresuTransferencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuTransferencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuTransferencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuTransferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuTransferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuTransferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresuTransferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresuTransferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresuTransferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresuTransferencia.add(this.jMenuItemDetalleCerrarPresuTransferencia);
		
		this.jmenuDetalleAccionesPresuTransferencia.add(this.jMenuItemActualizarPresuTransferencia);
		this.jmenuDetalleAccionesPresuTransferencia.add(this.jMenuItemEliminarPresuTransferencia);
		this.jmenuDetalleAccionesPresuTransferencia.add(this.jMenuItemCancelarPresuTransferencia);		
		
		//this.jmenuDetalleDatosPresuTransferencia.add(this.jMenuItemDetalleAbrirOrderByPresuTransferencia);				
		this.jmenuDetalleDatosPresuTransferencia.add(this.jMenuItemDetalleMostarOcultarPresuTransferencia);				
				
		//this.jmenuDetalleAccionesPresuTransferencia.add(this.jMenuItemGuardarCambiosPresuTransferencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresuTransferencia.add(this.jmenuDetalleArchivoPresuTransferencia);		
		this.jmenuBarDetallePresuTransferencia.add(this.jmenuDetalleAccionesPresuTransferencia);		
		this.jmenuBarDetallePresuTransferencia.add(this.jmenuDetalleDatosPresuTransferencia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresuTransferencia);				
	}
	
	
	public void inicializarElementosCamposPresuTransferencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresuTransferencia = new JLabelMe();
		jLabelIdPresuTransferencia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresuTransferencia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresuTransferencia.setToolTipText(PresuTransferenciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresuTransferencia= new GridBagLayout();

		this.jPanelidPresuTransferencia.setLayout(this.gridaBagLayoutPresuTransferencia);

		jLabelidPresuTransferencia = new JLabel();
		jLabelidPresuTransferencia.setText("Id");

		jLabelidPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaPresuTransferencia = new JLabelMe();
		this.jLabelfechaPresuTransferencia.setText(""+PresuTransferenciaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaPresuTransferencia.setToolTipText("Fecha");
		this.jLabelfechaPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaPresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaPresuTransferencia.setToolTipText(PresuTransferenciaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutPresuTransferencia = new GridBagLayout();
		this.jPanelfechaPresuTransferencia.setLayout(this.gridaBagLayoutPresuTransferencia);


		//jFormattedTextFieldfechaPresuTransferencia= new JFormattedTextFieldMe();

		jDateChooserfechaPresuTransferencia= new JDateChooser();
		jDateChooserfechaPresuTransferencia.setEnabled(false);
		jDateChooserfechaPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaPresuTransferencia.setDate(new Date());
		jDateChooserfechaPresuTransferencia.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaPresuTransferencia.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaPresuTransferenciaBusqueda= new JButtonMe();
		this.jButtonfechaPresuTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPresuTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaPresuTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaPresuTransferenciaBusqueda.setText("U");
		this.jButtonfechaPresuTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaPresuTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaPresuTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaPresuTransferenciaBusqueda"));

		if(this.presutransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaPresuTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelvalorPresuTransferencia = new JLabelMe();
		this.jLabelvalorPresuTransferencia.setText(""+PresuTransferenciaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorPresuTransferencia.setToolTipText("Valor");
		this.jLabelvalorPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorPresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorPresuTransferencia.setToolTipText(PresuTransferenciaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutPresuTransferencia = new GridBagLayout();
		this.jPanelvalorPresuTransferencia.setLayout(this.gridaBagLayoutPresuTransferencia);


		jTextFieldvalorPresuTransferencia= new JTextFieldMe();
		jTextFieldvalorPresuTransferencia.setEnabled(false);
		jTextFieldvalorPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorPresuTransferencia.setText("0.0");

		this.jButtonvalorPresuTransferenciaBusqueda= new JButtonMe();
		this.jButtonvalorPresuTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresuTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorPresuTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorPresuTransferenciaBusqueda.setText("U");
		this.jButtonvalorPresuTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorPresuTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorPresuTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorPresuTransferenciaBusqueda"));

		if(this.presutransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorPresuTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPresuTransferencia = new JLabelMe();
		this.jLabeldescripcionPresuTransferencia.setText(""+PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPresuTransferencia.setToolTipText("Descripcion");
		this.jLabeldescripcionPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPresuTransferencia.setToolTipText(PresuTransferenciaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPresuTransferencia = new GridBagLayout();
		this.jPaneldescripcionPresuTransferencia.setLayout(this.gridaBagLayoutPresuTransferencia);


		jTextAreadescripcionPresuTransferencia= new JTextAreaMe();
		jTextAreadescripcionPresuTransferencia.setEnabled(false);
		jTextAreadescripcionPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPresuTransferencia.setLineWrap(true);
		jTextAreadescripcionPresuTransferencia.setWrapStyleWord(true);
		jTextAreadescripcionPresuTransferencia.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPresuTransferencia.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPresuTransferencia = new JScrollPane(jTextAreadescripcionPresuTransferencia);
		jscrollPanedescripcionPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPresuTransferenciaBusqueda= new JButtonMe();
		this.jButtondescripcionPresuTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPresuTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPresuTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPresuTransferenciaBusqueda.setText("U");
		this.jButtondescripcionPresuTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPresuTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPresuTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPresuTransferenciaBusqueda"));

		if(this.presutransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPresuTransferenciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresuTransferencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_presu_proyectoPresuTransferencia = new JLabelMe();
		this.jLabelid_presu_proyectoPresuTransferencia.setText(""+PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO+" : *");
		this.jLabelid_presu_proyectoPresuTransferencia.setToolTipText("Proyecto");
		this.jLabelid_presu_proyectoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_proyectoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_presu_proyectoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_presu_proyectoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_presu_proyectoPresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_presu_proyectoPresuTransferencia.setToolTipText(PresuTransferenciaConstantesFunciones.LABEL_IDPRESUPROYECTO);
		this.gridaBagLayoutPresuTransferencia = new GridBagLayout();
		this.jPanelid_presu_proyectoPresuTransferencia.setLayout(this.gridaBagLayoutPresuTransferencia);


		jComboBoxid_presu_proyectoPresuTransferencia= new JComboBoxMe();
		jComboBoxid_presu_proyectoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_presu_proyectoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_presu_proyectoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_presu_proyectoPresuTransferencia= new JButtonMe();
		this.jButtonid_presu_proyectoPresuTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_proyectoPresuTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_proyectoPresuTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_presu_proyectoPresuTransferencia.setText("Buscar");
		this.jButtonid_presu_proyectoPresuTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_presu_proyectoPresuTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_proyectoPresuTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_presu_proyectoPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_proyectoPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_proyectoPresuTransferencia"));

		this.jButtonid_presu_proyectoPresuTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_presu_proyectoPresuTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyectoPresuTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyectoPresuTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_proyectoPresuTransferenciaBusqueda.setText("U");
		this.jButtonid_presu_proyectoPresuTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_presu_proyectoPresuTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_proyectoPresuTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_presu_proyectoPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_proyectoPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_proyectoPresuTransferenciaBusqueda"));

		if(this.presutransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_presu_proyectoPresuTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_presu_proyectoPresuTransferenciaUpdate= new JButtonMe();
		this.jButtonid_presu_proyectoPresuTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyectoPresuTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_presu_proyectoPresuTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_presu_proyectoPresuTransferenciaUpdate.setText("U");
		this.jButtonid_presu_proyectoPresuTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_presu_proyectoPresuTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_presu_proyectoPresuTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_presu_proyectoPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_presu_proyectoPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_presu_proyectoPresuTransferenciaUpdate"));



					
		this.jLabelid_cuenta_contablePresuTransferencia = new JLabelMe();
		this.jLabelid_cuenta_contablePresuTransferencia.setText(""+PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contablePresuTransferencia.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contablePresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contablePresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contablePresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contablePresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contablePresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contablePresuTransferencia.setToolTipText(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutPresuTransferencia = new GridBagLayout();
		this.jPanelid_cuenta_contablePresuTransferencia.setLayout(this.gridaBagLayoutPresuTransferencia);


		jComboBoxid_cuenta_contablePresuTransferencia= new JComboBoxMe();
		jComboBoxid_cuenta_contablePresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contablePresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contablePresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contablePresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contablePresuTransferencia= new JButtonMe();
		this.jButtonid_cuenta_contablePresuTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresuTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresuTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contablePresuTransferencia.setText("Buscar");
		this.jButtonid_cuenta_contablePresuTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contablePresuTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresuTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contablePresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresuTransferencia"));

		this.jButtonid_cuenta_contablePresuTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contablePresuTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresuTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresuTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contablePresuTransferenciaBusqueda.setText("U");
		this.jButtonid_cuenta_contablePresuTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contablePresuTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresuTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contablePresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresuTransferenciaBusqueda"));

		if(this.presutransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contablePresuTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contablePresuTransferenciaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contablePresuTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresuTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contablePresuTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contablePresuTransferenciaUpdate.setText("U");
		this.jButtonid_cuenta_contablePresuTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contablePresuTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresuTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contablePresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresuTransferenciaUpdate"));


		jButtonid_cuenta_contablePresuTransferenciaArbol= new JButtonMe();
		jButtonid_cuenta_contablePresuTransferenciaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresuTransferenciaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresuTransferenciaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contablePresuTransferenciaArbol.setText("Arbol");
		jButtonid_cuenta_contablePresuTransferenciaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contablePresuTransferenciaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contablePresuTransferenciaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contablePresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contablePresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contablePresuTransferenciaArbol"));



					
		this.jLabelid_cuenta_contable_destinoPresuTransferencia = new JLabelMe();
		this.jLabelid_cuenta_contable_destinoPresuTransferencia.setText(""+PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO+" : *");
		this.jLabelid_cuenta_contable_destinoPresuTransferencia.setToolTipText("Cuenta Contable Destino");
		this.jLabelid_cuenta_contable_destinoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_destinoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_destinoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_destinoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_destinoPresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_destinoPresuTransferencia.setToolTipText(PresuTransferenciaConstantesFunciones.LABEL_IDCUENTACONTABLEDESTINO);
		this.gridaBagLayoutPresuTransferencia = new GridBagLayout();
		this.jPanelid_cuenta_contable_destinoPresuTransferencia.setLayout(this.gridaBagLayoutPresuTransferencia);


		jComboBoxid_cuenta_contable_destinoPresuTransferencia= new JComboBoxMe();
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_destinoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_destinoPresuTransferencia= new JButtonMe();
		this.jButtonid_cuenta_contable_destinoPresuTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_destinoPresuTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_destinoPresuTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_destinoPresuTransferencia.setText("Buscar");
		this.jButtonid_cuenta_contable_destinoPresuTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_destinoPresuTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_destinoPresuTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_destinoPresuTransferencia"));

		this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_destinoPresuTransferenciaBusqueda"));

		if(this.presutransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate.setText("U");
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_destinoPresuTransferenciaUpdate"));


		jButtonid_cuenta_contable_destinoPresuTransferenciaArbol= new JButtonMe();
		jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.setText("Arbol");
		jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_destinoPresuTransferenciaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_destinoPresuTransferenciaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_destinoPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_destinoPresuTransferenciaArbol"));



					
		this.jLabelid_empleadoPresuTransferencia = new JLabelMe();
		this.jLabelid_empleadoPresuTransferencia.setText(""+PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoPresuTransferencia.setToolTipText("Empleado");
		this.jLabelid_empleadoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoPresuTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoPresuTransferencia.setToolTipText(PresuTransferenciaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutPresuTransferencia = new GridBagLayout();
		this.jPanelid_empleadoPresuTransferencia.setLayout(this.gridaBagLayoutPresuTransferencia);


		jComboBoxid_empleadoPresuTransferencia= new JComboBoxMe();
		jComboBoxid_empleadoPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoPresuTransferencia= new JButtonMe();
		this.jButtonid_empleadoPresuTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPresuTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPresuTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoPresuTransferencia.setText("Buscar");
		this.jButtonid_empleadoPresuTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoPresuTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPresuTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPresuTransferencia"));

		this.jButtonid_empleadoPresuTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_empleadoPresuTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPresuTransferenciaBusqueda.setText("U");
		this.jButtonid_empleadoPresuTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoPresuTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPresuTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPresuTransferenciaBusqueda"));

		if(this.presutransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoPresuTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoPresuTransferenciaUpdate= new JButtonMe();
		this.jButtonid_empleadoPresuTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoPresuTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoPresuTransferenciaUpdate.setText("U");
		this.jButtonid_empleadoPresuTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoPresuTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoPresuTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoPresuTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoPresuTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoPresuTransferenciaUpdate"));



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
		//this.jInternalFrameDetallePresuTransferencia = new PresuTransferenciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transferencia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuTransferencia= new GridBagLayout();
		

		
		String sToolTipPresuTransferencia="";
		sToolTipPresuTransferencia=PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuTransferencia+="(Contabilidad.PresuTransferencia)";
		}
		
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuTransferencia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresuTransferencia = new JButtonMe();
		this.jButtonModificarPresuTransferencia = new JButtonMe();
        this.jButtonActualizarPresuTransferencia = new JButtonMe();
        this.jButtonEliminarPresuTransferencia = new JButtonMe();
        this.jButtonCancelarPresuTransferencia = new JButtonMe();
        this.jButtonGuardarCambiosPresuTransferencia = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresuTransferencia = new JButtonMe();
		this.jButtonCerrarPresuTransferencia = new JButtonMe();
		
		this.jScrollPanelDatosPresuTransferencia = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresuTransferencia = new JScrollPane();
		this.jScrollPanelDatosGeneralPresuTransferencia = new JScrollPane();
				
		
		
		this.jPanelCamposPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Transferencia";
		
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferenciaes" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresuTransferencia.setName("jPanelCamposPresuTransferencia"); 

		this.jPanelCamposOcultosPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresuTransferencia.setName("jPanelCamposOcultosPresuTransferencia"); 

        this.jPanelAccionesPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuTransferencia.setToolTipText("Acciones");
        this.jPanelAccionesPresuTransferencia.setName("Acciones"); 

		this.jPanelAccionesFormularioPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresuTransferencia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresuTransferencia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresuTransferencia.setText("Nuevo");
		this.jButtonModificarPresuTransferencia.setText("Editar");
        this.jButtonActualizarPresuTransferencia.setText("Actualizar");
        this.jButtonEliminarPresuTransferencia.setText("Eliminar");
        this.jButtonCancelarPresuTransferencia.setText("Cancelar");
        this.jButtonGuardarCambiosPresuTransferencia.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresuTransferencia.setText("Guardar");
		this.jButtonCerrarPresuTransferencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuTransferencia,"nuevo_button","Nuevo",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresuTransferencia,"modificar_button","Editar",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresuTransferencia,"actualizar_button","Actualizar",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresuTransferencia,"eliminar_button","Eliminar",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresuTransferencia,"cancelar_button","Cancelar",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresuTransferencia,"guardarcambios_button","Guardar",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuTransferencia,"guardarcambiostabla_button","Guardar",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuTransferencia,"cerrar_button","Salir",this.presutransferenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresuTransferencia.setToolTipText("Nuevo"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresuTransferencia.setToolTipText("Editar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresuTransferencia.setToolTipText("Actualizar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresuTransferencia.setToolTipText("Eliminar)"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresuTransferencia.setToolTipText("Cancelar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresuTransferencia.setToolTipText("Guardar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresuTransferencia.setToolTipText("Guardar"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuTransferencia.setToolTipText("Salir"+" "+PresuTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuTransferencia";
		inputMap = this.jButtonNuevoPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuTransferencia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresuTransferencia";
		inputMap = this.jButtonActualizarPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresuTransferencia"));
		
		//ELIMINAR
		sMapKey = "EliminarPresuTransferencia";
		inputMap = this.jButtonEliminarPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresuTransferencia"));
		
		//CANCELAR	
		sMapKey = "CancelarPresuTransferencia";
		inputMap = this.jButtonCancelarPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresuTransferencia"));
		
		//CERRAR		
		sMapKey = "CerrarPresuTransferencia";
		inputMap = this.jButtonCerrarPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuTransferencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuTransferencia";
		inputMap = this.jButtonGuardarCambiosTablaPresuTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuTransferencia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresuTransferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresuTransferencia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresuTransferencia.setToolTipText("Nuevo PresuTransferencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresuTransferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresuTransferencia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresuTransferencia.setToolTipText("Sin Cerrar Ventana PresuTransferencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresuTransferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresuTransferencia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresuTransferencia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuTransferencia.setText("Accion");
		this.jComboBoxTiposAccionesPresuTransferencia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresuTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresuTransferencia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresuTransferencia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresuTransferencia = new JLabelMe();
		
		this.jLabelAccionesPresuTransferencia.setText("Acciones");		
		this.jLabelAccionesPresuTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresuTransferencia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresuTransferencia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresuTransferencia=new JTabbedPane();
		this.jTabbedPaneRelacionesPresuTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresuTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresuTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresuTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuTransferencia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresuTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresuTransferencia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresuTransferencia = new GridBagLayout();
		
		this.jPanelCamposPresuTransferencia.setLayout(gridaBagLayoutCamposPresuTransferencia);
		this.jPanelCamposOcultosPresuTransferencia.setLayout(gridaBagLayoutCamposOcultosPresuTransferencia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 0;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresuTransferencia.add(jLabelIdPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 1;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresuTransferencia.add(jLabelidPresuTransferencia, this.gridBagConstraintsPresuTransferencia);


	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 0;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_presu_proyectoPresuTransferencia.add(jLabelid_presu_proyectoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 2;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_proyectoPresuTransferencia.add(jButtonid_presu_proyectoPresuTransferenciaBusqueda, this.gridBagConstraintsPresuTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 3;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_presu_proyectoPresuTransferencia.add(jButtonid_presu_proyectoPresuTransferenciaUpdate, this.gridBagConstraintsPresuTransferencia);
	}

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 1;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_presu_proyectoPresuTransferencia.add(jComboBoxid_presu_proyectoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);


	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 0;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contablePresuTransferencia.add(jLabelid_cuenta_contablePresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 2;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contablePresuTransferencia.add(jButtonid_cuenta_contablePresuTransferencia, this.gridBagConstraintsPresuTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 3;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contablePresuTransferencia.add(jButtonid_cuenta_contablePresuTransferenciaArbol, this.gridBagConstraintsPresuTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 4;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contablePresuTransferencia.add(jButtonid_cuenta_contablePresuTransferenciaBusqueda, this.gridBagConstraintsPresuTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 5;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contablePresuTransferencia.add(jButtonid_cuenta_contablePresuTransferenciaUpdate, this.gridBagConstraintsPresuTransferencia);
	}

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 1;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contablePresuTransferencia.add(jComboBoxid_cuenta_contablePresuTransferencia, this.gridBagConstraintsPresuTransferencia);


	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 0;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_destinoPresuTransferencia.add(jLabelid_cuenta_contable_destinoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 2;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_destinoPresuTransferencia.add(jButtonid_cuenta_contable_destinoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 3;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_destinoPresuTransferencia.add(jButtonid_cuenta_contable_destinoPresuTransferenciaArbol, this.gridBagConstraintsPresuTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 4;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_destinoPresuTransferencia.add(jButtonid_cuenta_contable_destinoPresuTransferenciaBusqueda, this.gridBagConstraintsPresuTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 5;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_destinoPresuTransferencia.add(jButtonid_cuenta_contable_destinoPresuTransferenciaUpdate, this.gridBagConstraintsPresuTransferencia);
	}

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 1;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_destinoPresuTransferencia.add(jComboBoxid_cuenta_contable_destinoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);


	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 0;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoPresuTransferencia.add(jLabelid_empleadoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 2;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoPresuTransferencia.add(jButtonid_empleadoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 3;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPresuTransferencia.add(jButtonid_empleadoPresuTransferenciaBusqueda, this.gridBagConstraintsPresuTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 4;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoPresuTransferencia.add(jButtonid_empleadoPresuTransferenciaUpdate, this.gridBagConstraintsPresuTransferencia);
	}

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 1;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoPresuTransferencia.add(jComboBoxid_empleadoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);


	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 0;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaPresuTransferencia.add(jLabelfechaPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 2;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaPresuTransferencia.add(jButtonfechaPresuTransferenciaBusqueda, this.gridBagConstraintsPresuTransferencia);
	}

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 1;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaPresuTransferencia.add(jDateChooserfechaPresuTransferencia, this.gridBagConstraintsPresuTransferencia);


	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 0;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorPresuTransferencia.add(jLabelvalorPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 2;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorPresuTransferencia.add(jButtonvalorPresuTransferenciaBusqueda, this.gridBagConstraintsPresuTransferencia);
	}

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 1;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorPresuTransferencia.add(jTextFieldvalorPresuTransferencia, this.gridBagConstraintsPresuTransferencia);


	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 0;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPresuTransferencia.add(jLabeldescripcionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = 2;
		this.gridBagConstraintsPresuTransferencia.ipadx = 0;
		this.gridBagConstraintsPresuTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPresuTransferencia.add(jButtondescripcionPresuTransferenciaBusqueda, this.gridBagConstraintsPresuTransferencia);
	}

	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTransferencia.gridy = 0;
	this.gridBagConstraintsPresuTransferencia.gridx = 1;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPresuTransferencia.add(jscrollPanedescripcionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTransferencia.gridy = iYPanelCamposPresuTransferencia;
	this.gridBagConstraintsPresuTransferencia.gridx = iXPanelCamposPresuTransferencia++;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTransferencia.add(this.jPanelidPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(iXPanelCamposPresuTransferencia % 1==0) {
		iXPanelCamposPresuTransferencia=0;
		iYPanelCamposPresuTransferencia++;
	}
	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTransferencia.gridy = iYPanelCamposPresuTransferencia;
	this.gridBagConstraintsPresuTransferencia.gridx = iXPanelCamposPresuTransferencia++;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTransferencia.add(this.jPanelid_presu_proyectoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(iXPanelCamposPresuTransferencia % 1==0) {
		iXPanelCamposPresuTransferencia=0;
		iYPanelCamposPresuTransferencia++;
	}
	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTransferencia.gridy = iYPanelCamposPresuTransferencia;
	this.gridBagConstraintsPresuTransferencia.gridx = iXPanelCamposPresuTransferencia++;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTransferencia.add(this.jPanelid_cuenta_contablePresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(iXPanelCamposPresuTransferencia % 1==0) {
		iXPanelCamposPresuTransferencia=0;
		iYPanelCamposPresuTransferencia++;
	}
	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTransferencia.gridy = iYPanelCamposPresuTransferencia;
	this.gridBagConstraintsPresuTransferencia.gridx = iXPanelCamposPresuTransferencia++;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTransferencia.add(this.jPanelid_cuenta_contable_destinoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(iXPanelCamposPresuTransferencia % 1==0) {
		iXPanelCamposPresuTransferencia=0;
		iYPanelCamposPresuTransferencia++;
	}
	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTransferencia.gridy = iYPanelCamposPresuTransferencia;
	this.gridBagConstraintsPresuTransferencia.gridx = iXPanelCamposPresuTransferencia++;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTransferencia.add(this.jPanelid_empleadoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(iXPanelCamposPresuTransferencia % 1==0) {
		iXPanelCamposPresuTransferencia=0;
		iYPanelCamposPresuTransferencia++;
	}
	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTransferencia.gridy = iYPanelCamposPresuTransferencia;
	this.gridBagConstraintsPresuTransferencia.gridx = iXPanelCamposPresuTransferencia++;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTransferencia.add(this.jPanelfechaPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(iXPanelCamposPresuTransferencia % 1==0) {
		iXPanelCamposPresuTransferencia=0;
		iYPanelCamposPresuTransferencia++;
	}
	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTransferencia.gridy = iYPanelCamposPresuTransferencia;
	this.gridBagConstraintsPresuTransferencia.gridx = iXPanelCamposPresuTransferencia++;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTransferencia.add(this.jPanelvalorPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(iXPanelCamposPresuTransferencia % 1==0) {
		iXPanelCamposPresuTransferencia=0;
		iYPanelCamposPresuTransferencia++;
	}
	this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTransferencia.gridy = iYPanelCamposPresuTransferencia;
	this.gridBagConstraintsPresuTransferencia.gridx = iXPanelCamposPresuTransferencia++;
	this.gridBagConstraintsPresuTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTransferencia.add(this.jPaneldescripcionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);



	if(iXPanelCamposPresuTransferencia % 1==0) {
		iXPanelCamposPresuTransferencia=0;
		iYPanelCamposPresuTransferencia++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresuTransferencia= new GridBagLayout();
		this.jPanelAccionesPresuTransferencia.setLayout(gridaBagLayoutAccionesPresuTransferencia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresuTransferencia= new GridBagLayout();
		this.jPanelAccionesFormularioPresuTransferencia.setLayout(gridaBagLayoutAccionesFormularioPresuTransferencia);
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuTransferencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuTransferencia.add(this.jComboBoxTiposAccionesFormularioPresuTransferencia, this.gridBagConstraintsPresuTransferencia);

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuTransferencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuTransferencia.add(this.jCheckBoxPostAccionNuevoPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuTransferencia.add(this.jCheckBoxPostAccionSinCerrarPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presutransferenciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presutransferenciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuTransferencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuTransferencia.add(this.jCheckBoxPostAccionSinMensajePresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresuTransferencia.add(this.jButtonModificarPresuTransferencia, this.gridBagConstraintsPresuTransferencia);							

		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTransferencia.gridy = 0;
		this.gridBagConstraintsPresuTransferencia.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresuTransferencia.add(this.jButtonEliminarPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
			
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = 0;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuTransferencia.add(this.jButtonActualizarPresuTransferencia, this.gridBagConstraintsPresuTransferencia);


		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = 0;		
		this.gridBagConstraintsPresuTransferencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuTransferencia.add(this.jButtonGuardarCambiosPresuTransferencia, this.gridBagConstraintsPresuTransferencia);	
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = 0;		
		this.gridBagConstraintsPresuTransferencia.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresuTransferencia.add(this.jButtonCancelarPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuTransferencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuTransferencia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presutransferenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();						
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuTransferencia.gridx = 0;		
			//this.gridBagConstraintsPresuTransferencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuTransferencia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuTransferencia.gridx =0;
		this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuTransferencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresuTransferenciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresuTransferencia = new PresuTransferenciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transferencia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transferencia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transferencia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresuTransferenciaModel presutransferenciaModel=new PresuTransferenciaModel(this);
			
			//SI USARA CLASE INTERNA
			//PresuTransferenciaModel.PresuTransferenciaFocusTraversalPolicy presutransferenciaFocusTraversalPolicy = presutransferenciaModel.new PresuTransferenciaFocusTraversalPolicy(this);
			
			//presutransferenciaFocusTraversalPolicy.setpresutransferenciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presutransferenciaModel);
			
			
			this.jContentPaneDetallePresuTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresuTransferencia = new GridBagLayout();	
			this.jContentPaneDetallePresuTransferencia.setLayout(gridaBagLayoutDetallePresuTransferencia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuTransferencia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
				this.gridBagConstraintsPresuTransferencia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresuTransferencia.gridx = 0;
					
				
				this.jContentPaneDetallePresuTransferencia.add(jTtoolBarDetallePresuTransferencia, gridBagConstraintsPresuTransferencia);								
				
}
			
			this.jScrollPanelDatosEdicionPresuTransferencia=   new JScrollPane(jContentPaneDetallePresuTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresuTransferencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresuTransferencia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresuTransferencia.gridx = 0;
	        
			this.jContentPaneDetallePresuTransferencia.add(jPanelCamposPresuTransferencia, gridBagConstraintsPresuTransferencia);
			
			
			
			
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
						&& presutransferenciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presutransferenciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresuTransferencia= new GridBagConstraints();
						this.gridBagConstraintsPresuTransferencia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresuTransferencia.gridx = 0;
						this.jContentPaneDetallePresuTransferencia.add(this.jTabbedPaneRelacionesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresuTransferencia.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresuTransferencia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
					this.gridBagConstraintsPresuTransferencia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresuTransferencia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresuTransferencia.gridx = 0;
					
				
					this.jContentPaneDetallePresuTransferencia.add(jPanelCamposOcultosPresuTransferencia, gridBagConstraintsPresuTransferencia);
				
					this.jPanelCamposOcultosPresuTransferencia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresuTransferencia.gridx = 0;
	        this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresuTransferencia.add(this.jPanelAccionesFormularioPresuTransferencia, this.gridBagConstraintsPresuTransferencia);							
			
			
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
	        this.gridBagConstraintsPresuTransferencia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresuTransferencia.gridx = 0;
	        
			
			this.jContentPaneDetallePresuTransferencia.add(this.jPanelAccionesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresuTransferencia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresuTransferencia=   new JScrollPane(this.jPanelCamposPresuTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresuTransferencia.gridx = 0;
			this.gridBagConstraintsPresuTransferencia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresuTransferencia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresuTransferencia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuTransferencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresuTransferencia, this.gridBagConstraintsPresuTransferencia);			
			
			this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
			this.gridBagConstraintsPresuTransferencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuTransferencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
			
			
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		
			
		this.gridBagConstraintsPresuTransferencia = new GridBagConstraints();
		this.gridBagConstraintsPresuTransferencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuTransferencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuTransferencia, this.gridBagConstraintsPresuTransferencia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresuTransferencia;//jContentPane;
		
		return jScrollPanelDatosEdicionPresuTransferencia;
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
