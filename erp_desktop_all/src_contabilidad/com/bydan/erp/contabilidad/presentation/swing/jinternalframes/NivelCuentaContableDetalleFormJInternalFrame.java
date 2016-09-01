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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.NivelCuentaContableConstantesFunciones;

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
public class NivelCuentaContableDetalleFormJInternalFrame extends NivelCuentaContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNivelCuentaContable;
	
	protected JMenuBar jmenuBarDetalleNivelCuentaContable;
	
	protected JMenu jmenuDetalleNivelCuentaContable;
	protected JMenu jmenuDetalleArchivoNivelCuentaContable;
	protected JMenu jmenuDetalleAccionesNivelCuentaContable;
	protected JMenu jmenuDetalleDatosNivelCuentaContable;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNivelCuentaContable;	
	protected GridBagConstraints gridBagConstraintsNivelCuentaContable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NivelCuentaContableBeanSwingJInternalFrameAdditional jInternalFrameDetalleNivelCuentaContable;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public NivelCuentaContableSessionBean nivelcuentacontableSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public NivelCuentaContableLogic nivelcuentacontableLogic;
	
	public JScrollPane jScrollPanelDatosNivelCuentaContable;
	public JScrollPane jScrollPanelDatosEdicionNivelCuentaContable;
	public JScrollPane jScrollPanelDatosGeneralNivelCuentaContable;
	
	protected JPanel jPanelCamposNivelCuentaContable;    
	protected JPanel jPanelCamposOcultosNivelCuentaContable;    	
	protected JPanel jPanelAccionesNivelCuentaContable;
	protected JPanel jPanelAccionesFormularioNivelCuentaContable;
    
	
	
	protected Integer iXPanelCamposNivelCuentaContable=0;
	protected Integer iYPanelCamposNivelCuentaContable=0;
	
	protected Integer iXPanelCamposOcultosNivelCuentaContable=0;
	protected Integer iYPanelCamposOcultosNivelCuentaContable=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNivelCuentaContable;
	public JButton jButtonModificarNivelCuentaContable;
	public JButton jButtonActualizarNivelCuentaContable;
    public JButton jButtonEliminarNivelCuentaContable;
	public JButton jButtonCancelarNivelCuentaContable;
    public JButton jButtonGuardarCambiosNivelCuentaContable;
	public JButton jButtonGuardarCambiosTablaNivelCuentaContable;
	protected JButton jButtonCerrarNivelCuentaContable;
	
	
	protected JButton jButtonProcesarInformacionNivelCuentaContable;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNivelCuentaContable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNivelCuentaContable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNivelCuentaContable;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNivelCuentaContable;
	protected JButton jButtonModificarToolBarNivelCuentaContable;
	protected JButton jButtonActualizarToolBarNivelCuentaContable;
    protected JButton jButtonEliminarToolBarNivelCuentaContable;
	protected JButton jButtonCancelarToolBarNivelCuentaContable;
    protected JButton jButtonGuardarCambiosToolBarNivelCuentaContable;
	protected JButton jButtonGuardarCambiosTablaToolBarNivelCuentaContable;
	protected JButton jButtonMostrarOcultarTablaToolBarNivelCuentaContable;
	protected JButton jButtonCerrarToolBarNivelCuentaContable;
	
	protected JButton jButtonProcesarInformacionToolBarNivelCuentaContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNivelCuentaContable;
	protected JMenuItem jMenuItemModificarNivelCuentaContable;
	protected JMenuItem jMenuItemActualizarNivelCuentaContable;
    protected JMenuItem jMenuItemEliminarNivelCuentaContable;
	protected JMenuItem jMenuItemCancelarNivelCuentaContable;
    protected JMenuItem jMenuItemGuardarCambiosNivelCuentaContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaNivelCuentaContable;
	protected JMenuItem jMenuItemCerrarNivelCuentaContable;
	protected JMenuItem jMenuItemDetalleCerrarNivelCuentaContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarNivelCuentaContable;
	
	protected JMenuItem jMenuItemProcesarInformacionNivelCuentaContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNivelCuentaContable;
	protected JMenuItem jMenuItemMostrarOcultarNivelCuentaContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNivelCuentaContable;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNivelCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNivelCuentaContable;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNivelCuentaContable;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNivelCuentaContable;
	public JLabel jLabelIdNivelCuentaContable;
	public JLabel jLabelidNivelCuentaContable;
	public JButton jButtonidNivelCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelnivelNivelCuentaContable;
	public JLabel jLabelnivelNivelCuentaContable;
	public JTextField jTextFieldnivelNivelCuentaContable;
	public JButton jButtonnivelNivelCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelnumero_digitosNivelCuentaContable;
	public JLabel jLabelnumero_digitosNivelCuentaContable;
	public JTextField jTextFieldnumero_digitosNivelCuentaContable;
	public JButton jButtonnumero_digitosNivelCuentaContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNivelCuentaContable;
	public JLabel jLabelid_empresaNivelCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNivelCuentaContable;
	public JButton jButtonid_empresaNivelCuentaContable= new JButtonMe();
	public JButton jButtonid_empresaNivelCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_empresaNivelCuentaContableBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNivelCuentaContable;
	
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
	
	public NivelCuentaContableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNivelCuentaContable=new JPanel();
				this.jPanelAccionesFormularioNivelCuentaContable=new JPanel();
				this.jmenuBarDetalleNivelCuentaContable=new JMenuBar();
				this.jTtoolBarDetalleNivelCuentaContable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaContableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NivelCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NivelCuentaContableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NivelCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaContableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaContableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaContableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NivelCuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNivelCuentaContable() {
		return this.jButtonActualizarToolBarNivelCuentaContable;
	}
	
	public JButton getjButtonEliminarToolBarNivelCuentaContable() {
		return this.jButtonEliminarToolBarNivelCuentaContable;
	}
	
	public JButton getjButtonCancelarToolBarNivelCuentaContable() {
		return this.jButtonCancelarToolBarNivelCuentaContable;
	}		
	
	public JButton getjButtonProcesarInformacionNivelCuentaContable() {
		return this.jButtonProcesarInformacionNivelCuentaContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNivelCuentaContable)	{
		this.jButtonProcesarInformacionNivelCuentaContable = jButtonProcesarInformacionNivelCuentaContable;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNivelCuentaContable() {
		return this.jComboBoxTiposAccionesNivelCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNivelCuentaContable(
			JComboBox jComboBoxTiposRelacionesNivelCuentaContable) {
		this.jComboBoxTiposRelacionesNivelCuentaContable = jComboBoxTiposRelacionesNivelCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNivelCuentaContable(
			JComboBox jComboBoxTiposAccionesNivelCuentaContable) {
		this.jComboBoxTiposAccionesNivelCuentaContable = jComboBoxTiposAccionesNivelCuentaContable;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNivelCuentaContable() {
		return this.jComboBoxTiposAccionesFormularioNivelCuentaContable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNivelCuentaContable(
			JComboBox jComboBoxTiposAccionesFormularioNivelCuentaContable) {
		this.jComboBoxTiposAccionesFormularioNivelCuentaContable = jComboBoxTiposAccionesFormularioNivelCuentaContable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.nivelcuentacontableSessionBean=new NivelCuentaContableSessionBean();
		
		this.nivelcuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivelcuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nivelcuentacontableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NivelCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NivelCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NivelCuentaContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nivel Cuenta Contable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
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
	
		NivelCuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNivelCuentaContable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNivelCuentaContable=new JButtonMe();
				this.jButtonModificarToolBarNivelCuentaContable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNivelCuentaContable,this.jTtoolBarDetalleNivelCuentaContable,
							"actualizar","actualizar","Actualizar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNivelCuentaContable,this.jTtoolBarDetalleNivelCuentaContable,
							"eliminar","eliminar","Eliminar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNivelCuentaContable,this.jTtoolBarDetalleNivelCuentaContable,
							"cancelar","cancelar","Cancelar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNivelCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNivelCuentaContable,this.jTtoolBarDetalleNivelCuentaContable,
							"guardarcambios","guardarcambios","Guardar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNivelCuentaContable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNivelCuentaContable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNivelCuentaContable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNivelCuentaContable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNivelCuentaContable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNivelCuentaContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNivelCuentaContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNivelCuentaContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNivelCuentaContable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNivelCuentaContable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNivelCuentaContable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNivelCuentaContable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNivelCuentaContable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNivelCuentaContable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNivelCuentaContable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNivelCuentaContable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNivelCuentaContable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNivelCuentaContable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNivelCuentaContable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNivelCuentaContable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNivelCuentaContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNivelCuentaContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNivelCuentaContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNivelCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNivelCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNivelCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNivelCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNivelCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNivelCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNivelCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNivelCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNivelCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNivelCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNivelCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNivelCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNivelCuentaContable.add(this.jMenuItemDetalleCerrarNivelCuentaContable);
		
		this.jmenuDetalleAccionesNivelCuentaContable.add(this.jMenuItemActualizarNivelCuentaContable);
		this.jmenuDetalleAccionesNivelCuentaContable.add(this.jMenuItemEliminarNivelCuentaContable);
		this.jmenuDetalleAccionesNivelCuentaContable.add(this.jMenuItemCancelarNivelCuentaContable);		
		
		//this.jmenuDetalleDatosNivelCuentaContable.add(this.jMenuItemDetalleAbrirOrderByNivelCuentaContable);				
		this.jmenuDetalleDatosNivelCuentaContable.add(this.jMenuItemDetalleMostarOcultarNivelCuentaContable);				
				
		//this.jmenuDetalleAccionesNivelCuentaContable.add(this.jMenuItemGuardarCambiosNivelCuentaContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNivelCuentaContable.add(this.jmenuDetalleArchivoNivelCuentaContable);		
		this.jmenuBarDetalleNivelCuentaContable.add(this.jmenuDetalleAccionesNivelCuentaContable);		
		this.jmenuBarDetalleNivelCuentaContable.add(this.jmenuDetalleDatosNivelCuentaContable);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNivelCuentaContable);				
	}
	
	
	public void inicializarElementosCamposNivelCuentaContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNivelCuentaContable = new JLabelMe();
		jLabelIdNivelCuentaContable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNivelCuentaContable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNivelCuentaContable.setToolTipText(NivelCuentaContableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNivelCuentaContable= new GridBagLayout();

		this.jPanelidNivelCuentaContable.setLayout(this.gridaBagLayoutNivelCuentaContable);

		jLabelidNivelCuentaContable = new JLabel();
		jLabelidNivelCuentaContable.setText("Id");

		jLabelidNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnivelNivelCuentaContable = new JLabelMe();
		this.jLabelnivelNivelCuentaContable.setText(""+NivelCuentaContableConstantesFunciones.LABEL_NIVEL+" : *");
		this.jLabelnivelNivelCuentaContable.setToolTipText("Nivel");
		this.jLabelnivelNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnivelNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnivelNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnivelNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnivelNivelCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnivelNivelCuentaContable.setToolTipText(NivelCuentaContableConstantesFunciones.LABEL_NIVEL);
		this.gridaBagLayoutNivelCuentaContable = new GridBagLayout();
		this.jPanelnivelNivelCuentaContable.setLayout(this.gridaBagLayoutNivelCuentaContable);


		jTextFieldnivelNivelCuentaContable= new JTextFieldMe();
		jTextFieldnivelNivelCuentaContable.setEnabled(false);
		jTextFieldnivelNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnivelNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnivelNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnivelNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnivelNivelCuentaContable.setText("0");

		this.jButtonnivelNivelCuentaContableBusqueda= new JButtonMe();
		this.jButtonnivelNivelCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnivelNivelCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnivelNivelCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnivelNivelCuentaContableBusqueda.setText("U");
		this.jButtonnivelNivelCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnivelNivelCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnivelNivelCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnivelNivelCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnivelNivelCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nivelNivelCuentaContableBusqueda"));

		if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnivelNivelCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabelnumero_digitosNivelCuentaContable = new JLabelMe();
		this.jLabelnumero_digitosNivelCuentaContable.setText(""+NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS+" : *");
		this.jLabelnumero_digitosNivelCuentaContable.setToolTipText("Numero Digitos");
		this.jLabelnumero_digitosNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_digitosNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_digitosNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_digitosNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_digitosNivelCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_digitosNivelCuentaContable.setToolTipText(NivelCuentaContableConstantesFunciones.LABEL_NUMERODIGITOS);
		this.gridaBagLayoutNivelCuentaContable = new GridBagLayout();
		this.jPanelnumero_digitosNivelCuentaContable.setLayout(this.gridaBagLayoutNivelCuentaContable);


		jTextFieldnumero_digitosNivelCuentaContable= new JTextFieldMe();
		jTextFieldnumero_digitosNivelCuentaContable.setEnabled(false);
		jTextFieldnumero_digitosNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digitosNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_digitosNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_digitosNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_digitosNivelCuentaContable.setText("0");

		this.jButtonnumero_digitosNivelCuentaContableBusqueda= new JButtonMe();
		this.jButtonnumero_digitosNivelCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digitosNivelCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_digitosNivelCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_digitosNivelCuentaContableBusqueda.setText("U");
		this.jButtonnumero_digitosNivelCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_digitosNivelCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_digitosNivelCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_digitosNivelCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_digitosNivelCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_digitosNivelCuentaContableBusqueda"));

		if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_digitosNivelCuentaContableBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNivelCuentaContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNivelCuentaContable = new JLabelMe();
		this.jLabelid_empresaNivelCuentaContable.setText(""+NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNivelCuentaContable.setToolTipText("Empresa");
		this.jLabelid_empresaNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNivelCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNivelCuentaContable.setToolTipText(NivelCuentaContableConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNivelCuentaContable = new GridBagLayout();
		this.jPanelid_empresaNivelCuentaContable.setLayout(this.gridaBagLayoutNivelCuentaContable);


		jComboBoxid_empresaNivelCuentaContable= new JComboBoxMe();
		jComboBoxid_empresaNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNivelCuentaContable.setEnabled(false);

		this.jButtonid_empresaNivelCuentaContable= new JButtonMe();
		this.jButtonid_empresaNivelCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNivelCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNivelCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNivelCuentaContable.setText("Buscar");
		this.jButtonid_empresaNivelCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNivelCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNivelCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNivelCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNivelCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNivelCuentaContable"));

		this.jButtonid_empresaNivelCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_empresaNivelCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNivelCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNivelCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNivelCuentaContableBusqueda.setText("U");
		this.jButtonid_empresaNivelCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNivelCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNivelCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNivelCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNivelCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNivelCuentaContableBusqueda"));

		if(this.nivelcuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNivelCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_empresaNivelCuentaContableUpdate= new JButtonMe();
		this.jButtonid_empresaNivelCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNivelCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNivelCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNivelCuentaContableUpdate.setText("U");
		this.jButtonid_empresaNivelCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNivelCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNivelCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNivelCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNivelCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNivelCuentaContableUpdate"));



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
		//this.jInternalFrameDetalleNivelCuentaContable = new NivelCuentaContableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Nivel Cuenta Contable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNivelCuentaContable= new GridBagLayout();
		

		
		String sToolTipNivelCuentaContable="";
		sToolTipNivelCuentaContable=NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNivelCuentaContable+="(Contabilidad.NivelCuentaContable)";
		}
		
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipNivelCuentaContable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNivelCuentaContable = new JButtonMe();
		this.jButtonModificarNivelCuentaContable = new JButtonMe();
        this.jButtonActualizarNivelCuentaContable = new JButtonMe();
        this.jButtonEliminarNivelCuentaContable = new JButtonMe();
        this.jButtonCancelarNivelCuentaContable = new JButtonMe();
        this.jButtonGuardarCambiosNivelCuentaContable = new JButtonMe();
		this.jButtonGuardarCambiosTablaNivelCuentaContable = new JButtonMe();
		this.jButtonCerrarNivelCuentaContable = new JButtonMe();
		
		this.jScrollPanelDatosNivelCuentaContable = new JScrollPane();   
        this.jScrollPanelDatosEdicionNivelCuentaContable = new JScrollPane();
		this.jScrollPanelDatosGeneralNivelCuentaContable = new JScrollPane();
				
		
		
		this.jPanelCamposNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Nivel Cuenta Contable";
		
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuenta Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosNivelCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNivelCuentaContable.setName("jPanelCamposNivelCuentaContable"); 

		this.jPanelCamposOcultosNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNivelCuentaContable.setName("jPanelCamposOcultosNivelCuentaContable"); 

        this.jPanelAccionesNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNivelCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesNivelCuentaContable.setName("Acciones"); 

		this.jPanelAccionesFormularioNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNivelCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNivelCuentaContable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNivelCuentaContable.setText("Nuevo");
		this.jButtonModificarNivelCuentaContable.setText("Editar");
        this.jButtonActualizarNivelCuentaContable.setText("Actualizar");
        this.jButtonEliminarNivelCuentaContable.setText("Eliminar");
        this.jButtonCancelarNivelCuentaContable.setText("Cancelar");
        this.jButtonGuardarCambiosNivelCuentaContable.setText("Guardar");
		this.jButtonGuardarCambiosTablaNivelCuentaContable.setText("Guardar");
		this.jButtonCerrarNivelCuentaContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNivelCuentaContable,"nuevo_button","Nuevo",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNivelCuentaContable,"modificar_button","Editar",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNivelCuentaContable,"actualizar_button","Actualizar",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNivelCuentaContable,"eliminar_button","Eliminar",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNivelCuentaContable,"cancelar_button","Cancelar",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNivelCuentaContable,"guardarcambios_button","Guardar",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNivelCuentaContable,"guardarcambiostabla_button","Guardar",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNivelCuentaContable,"cerrar_button","Salir",this.nivelcuentacontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNivelCuentaContable.setToolTipText("Nuevo"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNivelCuentaContable.setToolTipText("Editar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNivelCuentaContable.setToolTipText("Actualizar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNivelCuentaContable.setToolTipText("Eliminar)"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNivelCuentaContable.setToolTipText("Cancelar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNivelCuentaContable.setToolTipText("Guardar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNivelCuentaContable.setToolTipText("Guardar"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNivelCuentaContable.setToolTipText("Salir"+" "+NivelCuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNivelCuentaContable";
		inputMap = this.jButtonNuevoNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNivelCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNivelCuentaContable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNivelCuentaContable";
		inputMap = this.jButtonActualizarNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNivelCuentaContable"));
		
		//ELIMINAR
		sMapKey = "EliminarNivelCuentaContable";
		inputMap = this.jButtonEliminarNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNivelCuentaContable"));
		
		//CANCELAR	
		sMapKey = "CancelarNivelCuentaContable";
		inputMap = this.jButtonCancelarNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNivelCuentaContable"));
		
		//CERRAR		
		sMapKey = "CerrarNivelCuentaContable";
		inputMap = this.jButtonCerrarNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNivelCuentaContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNivelCuentaContable";
		inputMap = this.jButtonGuardarCambiosTablaNivelCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNivelCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNivelCuentaContable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNivelCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNivelCuentaContable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNivelCuentaContable.setToolTipText("Nuevo NivelCuentaContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNivelCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNivelCuentaContable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNivelCuentaContable.setToolTipText("Sin Cerrar Ventana NivelCuentaContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNivelCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNivelCuentaContable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNivelCuentaContable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNivelCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNivelCuentaContable.setText("Accion");
		this.jComboBoxTiposAccionesNivelCuentaContable.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNivelCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNivelCuentaContable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNivelCuentaContable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNivelCuentaContable = new JLabelMe();
		
		this.jLabelAccionesNivelCuentaContable.setText("Acciones");		
		this.jLabelAccionesNivelCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNivelCuentaContable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNivelCuentaContable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNivelCuentaContable=new JTabbedPane();
		this.jTabbedPaneRelacionesNivelCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNivelCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNivelCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNivelCuentaContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNivelCuentaContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNivelCuentaContable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNivelCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNivelCuentaContable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNivelCuentaContable = new GridBagLayout();
		
		this.jPanelCamposNivelCuentaContable.setLayout(gridaBagLayoutCamposNivelCuentaContable);
		this.jPanelCamposOcultosNivelCuentaContable.setLayout(gridaBagLayoutCamposOcultosNivelCuentaContable);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuentaContable.gridy = 0;
	this.gridBagConstraintsNivelCuentaContable.gridx = 0;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNivelCuentaContable.add(jLabelIdNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);



	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuentaContable.gridy = 0;
	this.gridBagConstraintsNivelCuentaContable.gridx = 1;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNivelCuentaContable.add(jLabelidNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);


	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuentaContable.gridy = 0;
	this.gridBagConstraintsNivelCuentaContable.gridx = 0;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNivelCuentaContable.add(jLabelid_empresaNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = 0;
		this.gridBagConstraintsNivelCuentaContable.gridx = 2;
		this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
		this.gridBagConstraintsNivelCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNivelCuentaContable.add(jButtonid_empresaNivelCuentaContableBusqueda, this.gridBagConstraintsNivelCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = 0;
		this.gridBagConstraintsNivelCuentaContable.gridx = 3;
		this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
		this.gridBagConstraintsNivelCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNivelCuentaContable.add(jButtonid_empresaNivelCuentaContableUpdate, this.gridBagConstraintsNivelCuentaContable);
	}

	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuentaContable.gridy = 0;
	this.gridBagConstraintsNivelCuentaContable.gridx = 1;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNivelCuentaContable.add(jComboBoxid_empresaNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);


	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuentaContable.gridy = 0;
	this.gridBagConstraintsNivelCuentaContable.gridx = 0;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnivelNivelCuentaContable.add(jLabelnivelNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = 0;
		this.gridBagConstraintsNivelCuentaContable.gridx = 2;
		this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
		this.gridBagConstraintsNivelCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnivelNivelCuentaContable.add(jButtonnivelNivelCuentaContableBusqueda, this.gridBagConstraintsNivelCuentaContable);
	}

	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuentaContable.gridy = 0;
	this.gridBagConstraintsNivelCuentaContable.gridx = 1;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnivelNivelCuentaContable.add(jTextFieldnivelNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);


	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuentaContable.gridy = 0;
	this.gridBagConstraintsNivelCuentaContable.gridx = 0;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_digitosNivelCuentaContable.add(jLabelnumero_digitosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = 0;
		this.gridBagConstraintsNivelCuentaContable.gridx = 2;
		this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
		this.gridBagConstraintsNivelCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_digitosNivelCuentaContable.add(jButtonnumero_digitosNivelCuentaContableBusqueda, this.gridBagConstraintsNivelCuentaContable);
	}

	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuentaContable.gridy = 0;
	this.gridBagConstraintsNivelCuentaContable.gridx = 1;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_digitosNivelCuentaContable.add(jTextFieldnumero_digitosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelCuentaContable.gridy = iYPanelCamposNivelCuentaContable;
	this.gridBagConstraintsNivelCuentaContable.gridx = iXPanelCamposNivelCuentaContable++;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNivelCuentaContable.add(this.jPanelidNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);



	if(iXPanelCamposNivelCuentaContable % 1==0) {
		iXPanelCamposNivelCuentaContable=0;
		iYPanelCamposNivelCuentaContable++;
	}
	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelCuentaContable.gridy = iYPanelCamposNivelCuentaContable;
	this.gridBagConstraintsNivelCuentaContable.gridx = iXPanelCamposNivelCuentaContable++;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNivelCuentaContable.add(this.jPanelnivelNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);



	if(iXPanelCamposNivelCuentaContable % 1==0) {
		iXPanelCamposNivelCuentaContable=0;
		iYPanelCamposNivelCuentaContable++;
	}
	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelCuentaContable.gridy = iYPanelCamposNivelCuentaContable;
	this.gridBagConstraintsNivelCuentaContable.gridx = iXPanelCamposNivelCuentaContable++;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNivelCuentaContable.add(this.jPanelnumero_digitosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);



	if(iXPanelCamposNivelCuentaContable % 1==0) {
		iXPanelCamposNivelCuentaContable=0;
		iYPanelCamposNivelCuentaContable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelCuentaContable.gridy = iYPanelCamposOcultosNivelCuentaContable;
	this.gridBagConstraintsNivelCuentaContable.gridx = iXPanelCamposOcultosNivelCuentaContable++;
	this.gridBagConstraintsNivelCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNivelCuentaContable.add(this.jPanelid_empresaNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);



	if(iXPanelCamposOcultosNivelCuentaContable % 1==0) {
		iXPanelCamposOcultosNivelCuentaContable=0;
		iYPanelCamposOcultosNivelCuentaContable++;
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
			
		GridBagLayout gridaBagLayoutAccionesNivelCuentaContable= new GridBagLayout();
		this.jPanelAccionesNivelCuentaContable.setLayout(gridaBagLayoutAccionesNivelCuentaContable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNivelCuentaContable= new GridBagLayout();
		this.jPanelAccionesFormularioNivelCuentaContable.setLayout(gridaBagLayoutAccionesFormularioNivelCuentaContable);
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNivelCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNivelCuentaContable.add(this.jComboBoxTiposAccionesFormularioNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);

		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNivelCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNivelCuentaContable.add(this.jCheckBoxPostAccionNuevoNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNivelCuentaContable.add(this.jCheckBoxPostAccionSinCerrarNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.nivelcuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNivelCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNivelCuentaContable.add(this.jCheckBoxPostAccionSinMensajeNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = 0;
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccion++;
			
		this.jPanelAccionesNivelCuentaContable.add(this.jButtonModificarNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);							

		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuentaContable.gridy = 0;
		this.gridBagConstraintsNivelCuentaContable.gridx =iPosXAccion++;
			
		this.jPanelAccionesNivelCuentaContable.add(this.jButtonEliminarNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
			
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = 0;		
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesNivelCuentaContable.add(this.jButtonActualizarNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);


		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = 0;		
		this.gridBagConstraintsNivelCuentaContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesNivelCuentaContable.add(this.jButtonGuardarCambiosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);	
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = 0;		
		this.gridBagConstraintsNivelCuentaContable.gridx =iPosXAccion++;
		
		this.jPanelAccionesNivelCuentaContable.add(this.jButtonCancelarNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNivelCuentaContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNivelCuentaContable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nivelcuentacontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();						
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNivelCuentaContable.gridx = 0;		
			//this.gridBagConstraintsNivelCuentaContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNivelCuentaContable.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNivelCuentaContable.gridx =0;
		this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNivelCuentaContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NivelCuentaContableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNivelCuentaContable = new NivelCuentaContableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Nivel Cuenta Contable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Nivel Cuenta Contable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nivel Cuenta Contable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NivelCuentaContableModel nivelcuentacontableModel=new NivelCuentaContableModel(this);
			
			//SI USARA CLASE INTERNA
			//NivelCuentaContableModel.NivelCuentaContableFocusTraversalPolicy nivelcuentacontableFocusTraversalPolicy = nivelcuentacontableModel.new NivelCuentaContableFocusTraversalPolicy(this);
			
			//nivelcuentacontableFocusTraversalPolicy.setnivelcuentacontableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(nivelcuentacontableModel);
			
			
			this.jContentPaneDetalleNivelCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNivelCuentaContable = new GridBagLayout();	
			this.jContentPaneDetalleNivelCuentaContable.setLayout(gridaBagLayoutDetalleNivelCuentaContable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNivelCuentaContable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsNivelCuentaContable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNivelCuentaContable.gridx = 0;
					
				
				this.jContentPaneDetalleNivelCuentaContable.add(jTtoolBarDetalleNivelCuentaContable, gridBagConstraintsNivelCuentaContable);								
				
}
			
			this.jScrollPanelDatosEdicionNivelCuentaContable=   new JScrollPane(jContentPaneDetalleNivelCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNivelCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNivelCuentaContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNivelCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNivelCuentaContable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNivelCuentaContable.gridx = 0;
	        
			this.jContentPaneDetalleNivelCuentaContable.add(jPanelCamposNivelCuentaContable, gridBagConstraintsNivelCuentaContable);
			
			
			
			
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
						&& nivelcuentacontableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.nivelcuentacontableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNivelCuentaContable= new GridBagConstraints();
						this.gridBagConstraintsNivelCuentaContable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNivelCuentaContable.gridx = 0;
						this.jContentPaneDetalleNivelCuentaContable.add(this.jTabbedPaneRelacionesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNivelCuentaContable.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNivelCuentaContable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
					this.gridBagConstraintsNivelCuentaContable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNivelCuentaContable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNivelCuentaContable.gridx = 0;
					
				
					this.jContentPaneDetalleNivelCuentaContable.add(jPanelCamposOcultosNivelCuentaContable, gridBagConstraintsNivelCuentaContable);
				
					this.jPanelCamposOcultosNivelCuentaContable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsNivelCuentaContable.gridx = 0;
	        this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNivelCuentaContable.add(this.jPanelAccionesFormularioNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);							
			
			
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
	        this.gridBagConstraintsNivelCuentaContable.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsNivelCuentaContable.gridx = 0;
	        
			
			this.jContentPaneDetalleNivelCuentaContable.add(this.jPanelAccionesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNivelCuentaContable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNivelCuentaContable=   new JScrollPane(this.jPanelCamposNivelCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNivelCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNivelCuentaContable.gridx = 0;
			this.gridBagConstraintsNivelCuentaContable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNivelCuentaContable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNivelCuentaContable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNivelCuentaContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);			
			
			this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsNivelCuentaContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNivelCuentaContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
			
			
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		
			
		this.gridBagConstraintsNivelCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsNivelCuentaContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuentaContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNivelCuentaContable, this.gridBagConstraintsNivelCuentaContable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNivelCuentaContable;//jContentPane;
		
		return jScrollPanelDatosEdicionNivelCuentaContable;
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
