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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.puntoventa.util.FormulaConstantesFunciones;

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
public class FormulaDetalleFormJInternalFrame extends FormulaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFormula;
	
	protected JMenuBar jmenuBarDetalleFormula;
	
	protected JMenu jmenuDetalleFormula;
	protected JMenu jmenuDetalleArchivoFormula;
	protected JMenu jmenuDetalleAccionesFormula;
	protected JMenu jmenuDetalleDatosFormula;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormula;	
	protected GridBagConstraints gridBagConstraintsFormula;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormulaBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormula;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoFormulaBeanSwingJInternalFrame tipoformulaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformula="";
	
	public FormulaSessionBean formulaSessionBean;
	
	

	public TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame=null;
	public TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTarjetaCredito=false;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoFormulaSessionBean tipoformulaSessionBean;	
	
	public FormulaLogic formulaLogic;
	
	public JScrollPane jScrollPanelDatosFormula;
	public JScrollPane jScrollPanelDatosEdicionFormula;
	public JScrollPane jScrollPanelDatosGeneralFormula;
	
	protected JPanel jPanelCamposFormula;    
	protected JPanel jPanelCamposOcultosFormula;    	
	protected JPanel jPanelAccionesFormula;
	protected JPanel jPanelAccionesFormularioFormula;
    
	
	
	protected Integer iXPanelCamposFormula=0;
	protected Integer iYPanelCamposFormula=0;
	
	protected Integer iXPanelCamposOcultosFormula=0;
	protected Integer iYPanelCamposOcultosFormula=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormula;
	public JButton jButtonModificarFormula;
	public JButton jButtonActualizarFormula;
    public JButton jButtonEliminarFormula;
	public JButton jButtonCancelarFormula;
    public JButton jButtonGuardarCambiosFormula;
	public JButton jButtonGuardarCambiosTablaFormula;
	protected JButton jButtonCerrarFormula;
	
	
	protected JButton jButtonProcesarInformacionFormula;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormula;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormula;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormula;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFormula;
	protected JButton jButtonModificarToolBarFormula;
	protected JButton jButtonActualizarToolBarFormula;
    protected JButton jButtonEliminarToolBarFormula;
	protected JButton jButtonCancelarToolBarFormula;
    protected JButton jButtonGuardarCambiosToolBarFormula;
	protected JButton jButtonGuardarCambiosTablaToolBarFormula;
	protected JButton jButtonMostrarOcultarTablaToolBarFormula;
	protected JButton jButtonCerrarToolBarFormula;
	
	protected JButton jButtonProcesarInformacionToolBarFormula;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFormula;
	protected JMenuItem jMenuItemModificarFormula;
	protected JMenuItem jMenuItemActualizarFormula;
    protected JMenuItem jMenuItemEliminarFormula;
	protected JMenuItem jMenuItemCancelarFormula;
    protected JMenuItem jMenuItemGuardarCambiosFormula;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormula;
	protected JMenuItem jMenuItemCerrarFormula;
	protected JMenuItem jMenuItemDetalleCerrarFormula;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormula;
	
	protected JMenuItem jMenuItemProcesarInformacionFormula;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormula;
	protected JMenuItem jMenuItemMostrarOcultarFormula;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFormula;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormula;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormula;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormula;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormula;
	public JLabel jLabelIdFormula;
	public JLabel jLabelidFormula;
	public JButton jButtonidFormulaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoFormula;
	public JLabel jLabelcodigoFormula;
	public JTextField jTextFieldcodigoFormula;
	public JButton jButtoncodigoFormulaBusqueda= new JButtonMe();

	public JPanel jPanelnombreFormula;
	public JLabel jLabelnombreFormula;
	public JTextArea jTextAreanombreFormula;
	public JScrollPane jscrollPanenombreFormula;
	public JButton jButtonnombreFormulaBusqueda= new JButtonMe();

	public JPanel jPanelaliasFormula;
	public JLabel jLabelaliasFormula;
	public JTextField jTextFieldaliasFormula;
	public JButton jButtonaliasFormulaBusqueda= new JButtonMe();

	public JPanel jPanelvalorFormula;
	public JLabel jLabelvalorFormula;
	public JTextField jTextFieldvalorFormula;
	public JButton jButtonvalorFormulaBusqueda= new JButtonMe();

	public JPanel jPanelformula1Formula;
	public JLabel jLabelformula1Formula;
	public JTextArea jTextAreaformula1Formula;
	public JScrollPane jscrollPaneformula1Formula;
	public JButton jButtonformula1FormulaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormula;
	public JLabel jLabelid_empresaFormula;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormula;
	public JButton jButtonid_empresaFormula= new JButtonMe();
	public JButton jButtonid_empresaFormulaUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormulaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_formulaFormula;
	public JLabel jLabelid_tipo_formulaFormula;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_formulaFormula;
	public JButton jButtonid_tipo_formulaFormula= new JButtonMe();
	public JButton jButtonid_tipo_formulaFormulaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_formulaFormulaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormula;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormulaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormula=new JPanel();
				this.jPanelAccionesFormularioFormula=new JPanel();
				this.jmenuBarDetalleFormula=new JMenuBar();
				this.jTtoolBarDetalleFormula=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormulaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Formula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormulaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Formula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormulaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Formula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormulaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Formula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormulaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Formula No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFormula() {
		return this.jButtonActualizarToolBarFormula;
	}
	
	public JButton getjButtonEliminarToolBarFormula() {
		return this.jButtonEliminarToolBarFormula;
	}
	
	public JButton getjButtonCancelarToolBarFormula() {
		return this.jButtonCancelarToolBarFormula;
	}		
	
	public JButton getjButtonProcesarInformacionFormula() {
		return this.jButtonProcesarInformacionFormula;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormula)	{
		this.jButtonProcesarInformacionFormula = jButtonProcesarInformacionFormula;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormula() {
		return this.jComboBoxTiposAccionesFormula;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormula(
			JComboBox jComboBoxTiposRelacionesFormula) {
		this.jComboBoxTiposRelacionesFormula = jComboBoxTiposRelacionesFormula;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormula(
			JComboBox jComboBoxTiposAccionesFormula) {
		this.jComboBoxTiposAccionesFormula = jComboBoxTiposAccionesFormula;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormula() {
		return this.jComboBoxTiposAccionesFormularioFormula;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormula(
			JComboBox jComboBoxTiposAccionesFormularioFormula) {
		this.jComboBoxTiposAccionesFormularioFormula = jComboBoxTiposAccionesFormularioFormula;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formulaSessionBean=new FormulaSessionBean();
		
		this.formulaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formulaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormulaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormulaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormulaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Formula MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
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
	
		FormulaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormula= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormula=new JButtonMe();
				this.jButtonModificarToolBarFormula=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormula,this.jTtoolBarDetalleFormula,
							"actualizar","actualizar","Actualizar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormula,this.jTtoolBarDetalleFormula,
							"eliminar","eliminar","Eliminar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormula,this.jTtoolBarDetalleFormula,
							"cancelar","cancelar","Cancelar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormula=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormula,this.jTtoolBarDetalleFormula,
							"guardarcambios","guardarcambios","Guardar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormula,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormula,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormula,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormula=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormula=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormula=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormula=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormula=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormula= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormula.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormula,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormula= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormula.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormula,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormula= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormula.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormula,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormula= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormula.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormula,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormula= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormula.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormula,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormula= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormula.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormula,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormula= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormula.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormula,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormula= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormula.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormula,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormula= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormula.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormula,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormula= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormula.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormula,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormula, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormula.add(this.jMenuItemDetalleCerrarFormula);
		
		this.jmenuDetalleAccionesFormula.add(this.jMenuItemActualizarFormula);
		this.jmenuDetalleAccionesFormula.add(this.jMenuItemEliminarFormula);
		this.jmenuDetalleAccionesFormula.add(this.jMenuItemCancelarFormula);		
		
		//this.jmenuDetalleDatosFormula.add(this.jMenuItemDetalleAbrirOrderByFormula);				
		this.jmenuDetalleDatosFormula.add(this.jMenuItemDetalleMostarOcultarFormula);				
				
		//this.jmenuDetalleAccionesFormula.add(this.jMenuItemGuardarCambiosFormula);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormula, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormula.add(this.jmenuDetalleArchivoFormula);		
		this.jmenuBarDetalleFormula.add(this.jmenuDetalleAccionesFormula);		
		this.jmenuBarDetalleFormula.add(this.jmenuDetalleDatosFormula);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFormula, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFormula.add(this.jmenuDetalleFormula);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormula);				
	}
	
	
	public void inicializarElementosCamposFormula() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormula = new JLabelMe();
		jLabelIdFormula.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormula = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormula.setToolTipText(FormulaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormula= new GridBagLayout();

		this.jPanelidFormula.setLayout(this.gridaBagLayoutFormula);

		jLabelidFormula = new JLabel();
		jLabelidFormula.setText("Id");

		jLabelidFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoFormula = new JLabelMe();
		this.jLabelcodigoFormula.setText(""+FormulaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoFormula.setToolTipText("Codigo");
		this.jLabelcodigoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoFormula=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoFormula.setToolTipText(FormulaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutFormula = new GridBagLayout();
		this.jPanelcodigoFormula.setLayout(this.gridaBagLayoutFormula);


		jTextFieldcodigoFormula= new JTextFieldMe();

		jTextFieldcodigoFormula.setEnabled(false);
		jTextFieldcodigoFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoFormulaBusqueda= new JButtonMe();
		this.jButtoncodigoFormulaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoFormulaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoFormulaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoFormulaBusqueda.setText("U");
		this.jButtoncodigoFormulaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoFormulaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoFormulaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoFormulaBusqueda"));

		if(this.formulaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoFormulaBusqueda.setVisible(false);		}


					
		this.jLabelnombreFormula = new JLabelMe();
		this.jLabelnombreFormula.setText(""+FormulaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreFormula.setToolTipText("Nombre");
		this.jLabelnombreFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreFormula=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreFormula.setToolTipText(FormulaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutFormula = new GridBagLayout();
		this.jPanelnombreFormula.setLayout(this.gridaBagLayoutFormula);


		jTextAreanombreFormula= new JTextAreaMe();
		jTextAreanombreFormula.setEnabled(false);
		jTextAreanombreFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFormula.setLineWrap(true);
		jTextAreanombreFormula.setWrapStyleWord(true);
		jTextAreanombreFormula.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreFormula.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreFormula = new JScrollPane(jTextAreanombreFormula);
		jscrollPanenombreFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreFormulaBusqueda= new JButtonMe();
		this.jButtonnombreFormulaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFormulaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFormulaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreFormulaBusqueda.setText("U");
		this.jButtonnombreFormulaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreFormulaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreFormulaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreFormulaBusqueda"));

		if(this.formulaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreFormulaBusqueda.setVisible(false);		}


					
		this.jLabelaliasFormula = new JLabelMe();
		this.jLabelaliasFormula.setText(""+FormulaConstantesFunciones.LABEL_ALIAS+" :");
		this.jLabelaliasFormula.setToolTipText("Alias");
		this.jLabelaliasFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaliasFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaliasFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelaliasFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaliasFormula=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaliasFormula.setToolTipText(FormulaConstantesFunciones.LABEL_ALIAS);
		this.gridaBagLayoutFormula = new GridBagLayout();
		this.jPanelaliasFormula.setLayout(this.gridaBagLayoutFormula);


		jTextFieldaliasFormula= new JTextFieldMe();

		jTextFieldaliasFormula.setEnabled(false);
		jTextFieldaliasFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaliasFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaliasFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldaliasFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonaliasFormulaBusqueda= new JButtonMe();
		this.jButtonaliasFormulaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaliasFormulaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaliasFormulaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaliasFormulaBusqueda.setText("U");
		this.jButtonaliasFormulaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaliasFormulaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaliasFormulaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldaliasFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldaliasFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"aliasFormulaBusqueda"));

		if(this.formulaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaliasFormulaBusqueda.setVisible(false);		}


					
		this.jLabelvalorFormula = new JLabelMe();
		this.jLabelvalorFormula.setText(""+FormulaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorFormula.setToolTipText("Valor");
		this.jLabelvalorFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorFormula=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorFormula.setToolTipText(FormulaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutFormula = new GridBagLayout();
		this.jPanelvalorFormula.setLayout(this.gridaBagLayoutFormula);


		jTextFieldvalorFormula= new JTextFieldMe();
		jTextFieldvalorFormula.setEnabled(false);
		jTextFieldvalorFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorFormula.setText("0.0");

		this.jButtonvalorFormulaBusqueda= new JButtonMe();
		this.jButtonvalorFormulaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorFormulaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorFormulaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorFormulaBusqueda.setText("U");
		this.jButtonvalorFormulaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorFormulaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorFormulaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorFormulaBusqueda"));

		if(this.formulaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorFormulaBusqueda.setVisible(false);		}


					
		this.jLabelformula1Formula = new JLabelMe();
		this.jLabelformula1Formula.setText(""+FormulaConstantesFunciones.LABEL_FORMULA1+" :");
		this.jLabelformula1Formula.setToolTipText("Formula1");
		this.jLabelformula1Formula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelformula1Formula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelformula1Formula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelformula1Formula,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelformula1Formula=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelformula1Formula.setToolTipText(FormulaConstantesFunciones.LABEL_FORMULA1);
		this.gridaBagLayoutFormula = new GridBagLayout();
		this.jPanelformula1Formula.setLayout(this.gridaBagLayoutFormula);


		jTextAreaformula1Formula= new JTextAreaMe();
		jTextAreaformula1Formula.setEnabled(false);
		jTextAreaformula1Formula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformula1Formula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformula1Formula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformula1Formula.setLineWrap(true);
		jTextAreaformula1Formula.setWrapStyleWord(true);
		jTextAreaformula1Formula.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaformula1Formula.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaformula1Formula,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneformula1Formula = new JScrollPane(jTextAreaformula1Formula);
		jscrollPaneformula1Formula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneformula1Formula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneformula1Formula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonformula1FormulaBusqueda= new JButtonMe();
		this.jButtonformula1FormulaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonformula1FormulaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonformula1FormulaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonformula1FormulaBusqueda.setText("U");
		this.jButtonformula1FormulaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonformula1FormulaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonformula1FormulaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaformula1Formula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaformula1Formula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"formula1FormulaBusqueda"));

		if(this.formulaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonformula1FormulaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormula() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormula = new JLabelMe();
		this.jLabelid_empresaFormula.setText(""+FormulaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormula.setToolTipText("Empresa");
		this.jLabelid_empresaFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormula=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormula.setToolTipText(FormulaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormula = new GridBagLayout();
		this.jPanelid_empresaFormula.setLayout(this.gridaBagLayoutFormula);


		jComboBoxid_empresaFormula= new JComboBoxMe();
		jComboBoxid_empresaFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormula,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormula.setEnabled(false);

		this.jButtonid_empresaFormula= new JButtonMe();
		this.jButtonid_empresaFormula.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormula.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormula.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormula.setText("Buscar");
		this.jButtonid_empresaFormula.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormula.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormula,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormula"));

		this.jButtonid_empresaFormulaBusqueda= new JButtonMe();
		this.jButtonid_empresaFormulaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormulaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormulaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormulaBusqueda.setText("U");
		this.jButtonid_empresaFormulaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormulaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormulaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormulaBusqueda"));

		if(this.formulaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormulaBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormulaUpdate= new JButtonMe();
		this.jButtonid_empresaFormulaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormulaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormulaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormulaUpdate.setText("U");
		this.jButtonid_empresaFormulaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormulaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormulaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormulaUpdate"));



					
		this.jLabelid_tipo_formulaFormula = new JLabelMe();
		this.jLabelid_tipo_formulaFormula.setText(""+FormulaConstantesFunciones.LABEL_IDTIPOFORMULA+" : *");
		this.jLabelid_tipo_formulaFormula.setToolTipText("Tipo Formula");
		this.jLabelid_tipo_formulaFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_formulaFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_formulaFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_formulaFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_formulaFormula=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_formulaFormula.setToolTipText(FormulaConstantesFunciones.LABEL_IDTIPOFORMULA);
		this.gridaBagLayoutFormula = new GridBagLayout();
		this.jPanelid_tipo_formulaFormula.setLayout(this.gridaBagLayoutFormula);


		jComboBoxid_tipo_formulaFormula= new JComboBoxMe();
		jComboBoxid_tipo_formulaFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_formulaFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_formulaFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_formulaFormula,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_formulaFormula= new JButtonMe();
		this.jButtonid_tipo_formulaFormula.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_formulaFormula.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_formulaFormula.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_formulaFormula.setText("Buscar");
		this.jButtonid_tipo_formulaFormula.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_formulaFormula.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_formulaFormula,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_formulaFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_formulaFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_formulaFormula"));

		this.jButtonid_tipo_formulaFormulaBusqueda= new JButtonMe();
		this.jButtonid_tipo_formulaFormulaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_formulaFormulaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_formulaFormulaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_formulaFormulaBusqueda.setText("U");
		this.jButtonid_tipo_formulaFormulaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_formulaFormulaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_formulaFormulaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_formulaFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_formulaFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_formulaFormulaBusqueda"));

		if(this.formulaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_formulaFormulaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_formulaFormulaUpdate= new JButtonMe();
		this.jButtonid_tipo_formulaFormulaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_formulaFormulaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_formulaFormulaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_formulaFormulaUpdate.setText("U");
		this.jButtonid_tipo_formulaFormulaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_formulaFormulaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_formulaFormulaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_formulaFormula.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_formulaFormula.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_formulaFormulaUpdate"));



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
		//this.jInternalFrameDetalleFormula = new FormulaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Formula DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFormula= new GridBagLayout();
		

		
		String sToolTipFormula="";
		sToolTipFormula=FormulaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormula+="(PuntoVenta.Formula)";
		}
		
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormula+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormula = new JButtonMe();
		this.jButtonModificarFormula = new JButtonMe();
        this.jButtonActualizarFormula = new JButtonMe();
        this.jButtonEliminarFormula = new JButtonMe();
        this.jButtonCancelarFormula = new JButtonMe();
        this.jButtonGuardarCambiosFormula = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormula = new JButtonMe();
		this.jButtonCerrarFormula = new JButtonMe();
		
		this.jScrollPanelDatosFormula = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormula = new JScrollPane();
		this.jScrollPanelDatosGeneralFormula = new JScrollPane();
				
		
		
		this.jPanelCamposFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Formula";
		
		if(!this.formulaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Formulas" + this.sPath));
		} else {
			this.jScrollPanelDatosFormula.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormula.setName("jPanelCamposFormula"); 

		this.jPanelCamposOcultosFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormula.setName("jPanelCamposOcultosFormula"); 

        this.jPanelAccionesFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormula.setToolTipText("Acciones");
        this.jPanelAccionesFormula.setName("Acciones"); 

		this.jPanelAccionesFormularioFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormula.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormula.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormula, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormula, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormula, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormula.setText("Nuevo");
		this.jButtonModificarFormula.setText("Editar");
        this.jButtonActualizarFormula.setText("Actualizar");
        this.jButtonEliminarFormula.setText("Eliminar");
        this.jButtonCancelarFormula.setText("Cancelar");
        this.jButtonGuardarCambiosFormula.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormula.setText("Guardar");
		this.jButtonCerrarFormula.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormula,"nuevo_button","Nuevo",this.formulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormula,"modificar_button","Editar",this.formulaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormula,"actualizar_button","Actualizar",this.formulaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormula,"eliminar_button","Eliminar",this.formulaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormula,"cancelar_button","Cancelar",this.formulaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormula,"guardarcambios_button","Guardar",this.formulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormula,"guardarcambiostabla_button","Guardar",this.formulaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormula,"cerrar_button","Salir",this.formulaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormula, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormula, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormula.setToolTipText("Nuevo"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormula.setToolTipText("Editar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormula.setToolTipText("Actualizar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormula.setToolTipText("Eliminar)"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormula.setToolTipText("Cancelar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormula.setToolTipText("Guardar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormula.setToolTipText("Guardar"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormula.setToolTipText("Salir"+" "+FormulaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormula";
		inputMap = this.jButtonNuevoFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormula.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormula"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormula";
		inputMap = this.jButtonActualizarFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormula"));
		
		//ELIMINAR
		sMapKey = "EliminarFormula";
		inputMap = this.jButtonEliminarFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormula"));
		
		//CANCELAR	
		sMapKey = "CancelarFormula";
		inputMap = this.jButtonCancelarFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormula"));
		
		//CERRAR		
		sMapKey = "CerrarFormula";
		inputMap = this.jButtonCerrarFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormula"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormula";
		inputMap = this.jButtonGuardarCambiosTablaFormula.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormula.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormula"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormula = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormula.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormula.setToolTipText("Nuevo Formula");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormula, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormula = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormula.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormula.setToolTipText("Sin Cerrar Ventana Formula");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormula, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormula = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormula.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormula.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormula, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFormula = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormula.setText("Accion");
		this.jComboBoxTiposAccionesFormula.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFormula = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormula.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormula.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormula = new JLabelMe();
		
		this.jLabelAccionesFormula.setText("Acciones");		
		this.jLabelAccionesFormula.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormula.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormula.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormula();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormula();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormula=new JTabbedPane();
		this.jTabbedPaneRelacionesFormula.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormula,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFormula.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormula.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormula.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormula, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFormula.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormula.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormula.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormula, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormula = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormula = new GridBagLayout();
		
		this.jPanelCamposFormula.setLayout(gridaBagLayoutCamposFormula);
		this.jPanelCamposOcultosFormula.setLayout(gridaBagLayoutCamposOcultosFormula);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 0;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormula.add(jLabelIdFormula, this.gridBagConstraintsFormula);



	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 1;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormula.add(jLabelidFormula, this.gridBagConstraintsFormula);


	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 0;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormula.add(jLabelid_empresaFormula, this.gridBagConstraintsFormula);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormula = new GridBagConstraints();
		//this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = 2;
		this.gridBagConstraintsFormula.ipadx = 0;
		this.gridBagConstraintsFormula.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormula.add(jButtonid_empresaFormulaBusqueda, this.gridBagConstraintsFormula);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormula = new GridBagConstraints();
		//this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = 3;
		this.gridBagConstraintsFormula.ipadx = 0;
		this.gridBagConstraintsFormula.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormula.add(jButtonid_empresaFormulaUpdate, this.gridBagConstraintsFormula);
	}

	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 1;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormula.add(jComboBoxid_empresaFormula, this.gridBagConstraintsFormula);


	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 0;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_formulaFormula.add(jLabelid_tipo_formulaFormula, this.gridBagConstraintsFormula);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormula = new GridBagConstraints();
		//this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = 2;
		this.gridBagConstraintsFormula.ipadx = 0;
		this.gridBagConstraintsFormula.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_formulaFormula.add(jButtonid_tipo_formulaFormulaBusqueda, this.gridBagConstraintsFormula);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormula = new GridBagConstraints();
		//this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = 3;
		this.gridBagConstraintsFormula.ipadx = 0;
		this.gridBagConstraintsFormula.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_formulaFormula.add(jButtonid_tipo_formulaFormulaUpdate, this.gridBagConstraintsFormula);
	}

	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 1;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_formulaFormula.add(jComboBoxid_tipo_formulaFormula, this.gridBagConstraintsFormula);


	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 0;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoFormula.add(jLabelcodigoFormula, this.gridBagConstraintsFormula);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormula = new GridBagConstraints();
		//this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = 2;
		this.gridBagConstraintsFormula.ipadx = 0;
		this.gridBagConstraintsFormula.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoFormula.add(jButtoncodigoFormulaBusqueda, this.gridBagConstraintsFormula);
	}

	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 1;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoFormula.add(jTextFieldcodigoFormula, this.gridBagConstraintsFormula);


	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 0;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreFormula.add(jLabelnombreFormula, this.gridBagConstraintsFormula);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormula = new GridBagConstraints();
		//this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = 2;
		this.gridBagConstraintsFormula.ipadx = 0;
		this.gridBagConstraintsFormula.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreFormula.add(jButtonnombreFormulaBusqueda, this.gridBagConstraintsFormula);
	}

	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 1;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreFormula.add(jscrollPanenombreFormula, this.gridBagConstraintsFormula);


	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 0;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaliasFormula.add(jLabelaliasFormula, this.gridBagConstraintsFormula);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormula = new GridBagConstraints();
		//this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = 2;
		this.gridBagConstraintsFormula.ipadx = 0;
		this.gridBagConstraintsFormula.insets = new Insets(0, 0, 0, 0);
		this.jPanelaliasFormula.add(jButtonaliasFormulaBusqueda, this.gridBagConstraintsFormula);
	}

	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 1;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaliasFormula.add(jTextFieldaliasFormula, this.gridBagConstraintsFormula);


	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 0;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorFormula.add(jLabelvalorFormula, this.gridBagConstraintsFormula);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormula = new GridBagConstraints();
		//this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = 2;
		this.gridBagConstraintsFormula.ipadx = 0;
		this.gridBagConstraintsFormula.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorFormula.add(jButtonvalorFormulaBusqueda, this.gridBagConstraintsFormula);
	}

	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 1;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorFormula.add(jTextFieldvalorFormula, this.gridBagConstraintsFormula);


	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 0;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelformula1Formula.add(jLabelformula1Formula, this.gridBagConstraintsFormula);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormula = new GridBagConstraints();
		//this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = 2;
		this.gridBagConstraintsFormula.ipadx = 0;
		this.gridBagConstraintsFormula.insets = new Insets(0, 0, 0, 0);
		this.jPanelformula1Formula.add(jButtonformula1FormulaBusqueda, this.gridBagConstraintsFormula);
	}

	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormula.gridy = 0;
	this.gridBagConstraintsFormula.gridx = 1;
	this.gridBagConstraintsFormula.ipadx = 0;
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelformula1Formula.add(jscrollPaneformula1Formula, this.gridBagConstraintsFormula);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormula.gridy = iYPanelCamposFormula;
	this.gridBagConstraintsFormula.gridx = iXPanelCamposFormula++;
	this.gridBagConstraintsFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormula.add(this.jPanelidFormula, this.gridBagConstraintsFormula);



	if(iXPanelCamposFormula % 1==0) {
		iXPanelCamposFormula=0;
		iYPanelCamposFormula++;
	}
	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormula.gridy = iYPanelCamposFormula;
	this.gridBagConstraintsFormula.gridx = iXPanelCamposFormula++;
	this.gridBagConstraintsFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormula.add(this.jPanelid_tipo_formulaFormula, this.gridBagConstraintsFormula);



	if(iXPanelCamposFormula % 1==0) {
		iXPanelCamposFormula=0;
		iYPanelCamposFormula++;
	}
	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormula.gridy = iYPanelCamposFormula;
	this.gridBagConstraintsFormula.gridx = iXPanelCamposFormula++;
	this.gridBagConstraintsFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormula.add(this.jPanelcodigoFormula, this.gridBagConstraintsFormula);



	if(iXPanelCamposFormula % 1==0) {
		iXPanelCamposFormula=0;
		iYPanelCamposFormula++;
	}
	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormula.gridy = iYPanelCamposFormula;
	this.gridBagConstraintsFormula.gridx = iXPanelCamposFormula++;
	this.gridBagConstraintsFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormula.add(this.jPanelnombreFormula, this.gridBagConstraintsFormula);



	if(iXPanelCamposFormula % 1==0) {
		iXPanelCamposFormula=0;
		iYPanelCamposFormula++;
	}
	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormula.gridy = iYPanelCamposFormula;
	this.gridBagConstraintsFormula.gridx = iXPanelCamposFormula++;
	this.gridBagConstraintsFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormula.add(this.jPanelaliasFormula, this.gridBagConstraintsFormula);



	if(iXPanelCamposFormula % 1==0) {
		iXPanelCamposFormula=0;
		iYPanelCamposFormula++;
	}
	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormula.gridy = iYPanelCamposFormula;
	this.gridBagConstraintsFormula.gridx = iXPanelCamposFormula++;
	this.gridBagConstraintsFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormula.add(this.jPanelvalorFormula, this.gridBagConstraintsFormula);



	if(iXPanelCamposFormula % 1==0) {
		iXPanelCamposFormula=0;
		iYPanelCamposFormula++;
	}
	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormula.gridy = iYPanelCamposFormula;
	this.gridBagConstraintsFormula.gridx = iXPanelCamposFormula++;
	this.gridBagConstraintsFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormula.add(this.jPanelformula1Formula, this.gridBagConstraintsFormula);



	if(iXPanelCamposFormula % 1==0) {
		iXPanelCamposFormula=0;
		iYPanelCamposFormula++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormula = new GridBagConstraints();
	this.gridBagConstraintsFormula.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormula.gridy = iYPanelCamposOcultosFormula;
	this.gridBagConstraintsFormula.gridx = iXPanelCamposOcultosFormula++;
	this.gridBagConstraintsFormula.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormula.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormula.add(this.jPanelid_empresaFormula, this.gridBagConstraintsFormula);



	if(iXPanelCamposOcultosFormula % 1==0) {
		iXPanelCamposOcultosFormula=0;
		iYPanelCamposOcultosFormula++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormula= new GridBagLayout();
		this.jPanelAccionesFormula.setLayout(gridaBagLayoutAccionesFormula);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormula= new GridBagLayout();
		this.jPanelAccionesFormularioFormula.setLayout(gridaBagLayoutAccionesFormularioFormula);
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormula.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormula.add(this.jComboBoxTiposAccionesFormularioFormula, this.gridBagConstraintsFormula);

		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormula.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormula.add(this.jCheckBoxPostAccionNuevoFormula, this.gridBagConstraintsFormula);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formulaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormula.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormula.add(this.jCheckBoxPostAccionSinCerrarFormula, this.gridBagConstraintsFormula);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formulaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formulaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormula.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormula.add(this.jCheckBoxPostAccionSinMensajeFormula, this.gridBagConstraintsFormula);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormula.add(this.jButtonModificarFormula, this.gridBagConstraintsFormula);							

		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormula.gridy = 0;
		this.gridBagConstraintsFormula.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormula.add(this.jButtonEliminarFormula, this.gridBagConstraintsFormula);
		
			
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = 0;		
		this.gridBagConstraintsFormula.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormula.add(this.jButtonActualizarFormula, this.gridBagConstraintsFormula);


		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = 0;		
		this.gridBagConstraintsFormula.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormula.add(this.jButtonGuardarCambiosFormula, this.gridBagConstraintsFormula);	
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = 0;		
		this.gridBagConstraintsFormula.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormula.add(this.jButtonCancelarFormula, this.gridBagConstraintsFormula);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormula = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormula);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formulaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFormula = new GridBagConstraints();						
			this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormula.gridx = 0;		
			//this.gridBagConstraintsFormula.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormula.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormula.gridx =0;
		this.gridBagConstraintsFormula.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormula.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormula, this.gridBagConstraintsFormula);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormulaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormula = new FormulaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Formula DATOS");
			
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
			
	        //this.setTitle("[FOR] - Formula DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formula Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormulaModel formulaModel=new FormulaModel(this);
			
			//SI USARA CLASE INTERNA
			//FormulaModel.FormulaFocusTraversalPolicy formulaFocusTraversalPolicy = formulaModel.new FormulaFocusTraversalPolicy(this);
			
			//formulaFocusTraversalPolicy.setformulaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formulaModel);
			
			
			this.jContentPaneDetalleFormula = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormula = new GridBagLayout();	
			this.jContentPaneDetalleFormula.setLayout(gridaBagLayoutDetalleFormula);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormula = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormula = new GridBagConstraints();
				this.gridBagConstraintsFormula.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormula.gridx = 0;
					
				
				this.jContentPaneDetalleFormula.add(jTtoolBarDetalleFormula, gridBagConstraintsFormula);								
				
}
			
			this.jScrollPanelDatosEdicionFormula=   new JScrollPane(jContentPaneDetalleFormula,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormula.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormula.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormula.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormula=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormula.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormula.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormula.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormula.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormula.gridx = 0;
	        
			this.jContentPaneDetalleFormula.add(jPanelCamposFormula, gridBagConstraintsFormula);
			
			
			
			
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
						&& formulaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCredito(this.puedeCargarPorParteTarjetaCredito,false,-1);
					
					if(this.formulaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormula= new GridBagConstraints();
						this.gridBagConstraintsFormula.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormula.gridx = 0;
						this.jContentPaneDetalleFormula.add(this.jTabbedPaneRelacionesFormula, this.gridBagConstraintsFormula);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormula.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCredito(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormula.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormula = new GridBagConstraints();
					this.gridBagConstraintsFormula.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormula.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormula.gridx = 0;
					
				
					this.jContentPaneDetalleFormula.add(jPanelCamposOcultosFormula, gridBagConstraintsFormula);
				
					this.jPanelCamposOcultosFormula.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsFormula.gridx = 0;
	        this.gridBagConstraintsFormula.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormula.add(this.jPanelAccionesFormularioFormula, this.gridBagConstraintsFormula);							
			
			
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
	        this.gridBagConstraintsFormula.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsFormula.gridx = 0;
	        
			
			this.jContentPaneDetalleFormula.add(this.jPanelAccionesFormula, this.gridBagConstraintsFormula);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormula);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormula=   new JScrollPane(this.jPanelCamposFormula,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormula.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormula.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormula.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormula.gridx = 0;
			this.gridBagConstraintsFormula.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormula.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormula.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormula, this.gridBagConstraintsFormula);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormula.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormula, this.gridBagConstraintsFormula);			
			
			this.gridBagConstraintsFormula = new GridBagConstraints();
			this.gridBagConstraintsFormula.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormula.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormula, this.gridBagConstraintsFormula);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormula.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormula, this.gridBagConstraintsFormula);
			
			
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormula.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormula, this.gridBagConstraintsFormula);
		
			
		this.gridBagConstraintsFormula = new GridBagConstraints();
		this.gridBagConstraintsFormula.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormula.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormula, this.gridBagConstraintsFormula);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormula;//jContentPane;
		
		return jScrollPanelDatosEdicionFormula;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameTarjetaCredito(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
		this.tarjetacreditoSessionBean.setConGuardarRelaciones(false);
		this.tarjetacreditoSessionBean.setEsGuardarRelacionado(true);

		this.tarjetacreditoBeanSwingJInternalFrame=null;//new TarjetaCreditoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tarjetacreditoBeanSwingJInternalFramePopup=new TarjetaCreditoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tarjetacreditoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {

				TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=FormulaJInternalFrame.STIPO_TAMANIO_GENERAL;
				TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FormulaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tarjetacreditoSessionBean.setEsGuardarRelacionado(true);

				this.tarjetacreditoBeanSwingJInternalFrame=new TarjetaCreditoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tarjetacreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tarjetacreditoBeanSwingJInternalFrame.settarjetacreditoSessionBean(this.tarjetacreditoSessionBean);

				//this.gridBagConstraintsFormula = new GridBagConstraints();
				//this.gridBagConstraintsFormula.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFormula.gridx = 0;
				//this.jContentPaneDetalleFormula.add(this.tarjetacreditoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFormula);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFormula.add("Tarjeta Creditos",this.tarjetacreditoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFormula.setComponentAt(iIndexTab,this.tarjetacreditoBeanSwingJInternalFrame.getContentPane());
				}

				//TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tarjetacreditoSessionBean.setEsGuardarRelacionado(false);
				this.tarjetacreditoBeanSwingJInternalFrame=null;//new TarjetaCreditoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTarjetaCredito) {
					this.jTabbedPaneRelacionesFormula.add("Tarjeta Creditos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTarjetaCreditoBeanSwingJInternalFrame(List<Formula> formulas,Formula formula,TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tarjetacreditoBeanSwingJInternalFrame=new TarjetaCreditoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tarjetacreditoBeanSwingJInternalFrame.getTarjetaCreditoLogic().setConnexion(this.formulaLogic.getConnexion());

					tarjetacreditoBeanSwingJInternalFrame.setformulacomisionsForeignKey(formulas);
					tarjetacreditoBeanSwingJInternalFrame.setformulacomisionForeignKey(formula);
					tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setisBusquedaDesdeForeignKeySesionFormulaComision(true);
					tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setlidFormulaComisionActual(formula.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tarjetacreditoBeanSwingJInternalFrame.cargarCombosForeignKeyTarjetaCredito(tarjetacreditoBeanSwingJInternalFrame.isCargarCombosDependencia);
					tarjetacreditoBeanSwingJInternalFrame.setVisibilidadBusquedasParaFormulaComision(true);
					tarjetacreditoBeanSwingJInternalFrame.setid_formula_comisionFK_IdFormulaComision(formula.getId());

					if(!this.conCargarFormDetalle) {
						tarjetacreditoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tarjetacreditoBeanSwingJInternalFrame.setSelectedItemCombosFrameFormulaComisionForeignKey(formula,1,false,true,true);
					tarjetacreditoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tarjetacreditoBeanSwingJInternalFrame.procesarBusqueda("FK_IdFormula");
					tarjetacreditoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFormula");
					tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito(true);
					tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTarjetaCredito("n",tarjetacreditoBeanSwingJInternalFrame.isGuardarCambiosEnLote, tarjetacreditoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tarjetacreditoBeanSwingJInternalFrame.setAutoscrolls(true);
					tarjetacreditoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCredito("relacionado");
					} else {
						tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCredito("no_relacionado");
					}

					tarjetacreditoBeanSwingJInternalFrame.getjButtonRecargarInformacionTarjetaCredito().setVisible(false);

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
