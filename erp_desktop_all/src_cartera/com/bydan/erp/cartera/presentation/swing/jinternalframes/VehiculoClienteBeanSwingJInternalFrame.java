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




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.cartera.util.VehiculoClienteConstantesFunciones;
import com.bydan.erp.cartera.util.VehiculoClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.VehiculoClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.VehiculoClienteBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VehiculoClienteBeanSwingJInternalFrame extends VehiculoClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VehiculoClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VehiculoCliente> vehiculoclienteValidator = new ClassValidator<VehiculoCliente>(VehiculoCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VehiculoCliente vehiculocliente;	
	public VehiculoCliente vehiculoclienteAux;
	public VehiculoCliente vehiculoclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VehiculoCliente vehiculoclienteTotales;
	public Long idVehiculoClienteActual;
	public Long iIdNuevoVehiculoCliente=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoVehiculoCliente;
	public Boolean isPermisoNuevoVehiculoCliente;
	public Boolean isPermisoActualizarVehiculoCliente;
	public Boolean isPermisoActualizarOriginalVehiculoCliente;
	public Boolean isPermisoEliminarVehiculoCliente;
	public Boolean isPermisoGuardarCambiosVehiculoCliente;
	public Boolean isPermisoConsultaVehiculoCliente;
	public Boolean isPermisoBusquedaVehiculoCliente;
	public Boolean isPermisoReporteVehiculoCliente;
	public Boolean isPermisoPaginacionMedioVehiculoCliente;
	public Boolean isPermisoPaginacionAltoVehiculoCliente;
	public Boolean isPermisoPaginacionTodoVehiculoCliente;
	public Boolean isPermisoCopiarVehiculoCliente;
	public Boolean isPermisoVerFormVehiculoCliente;
	public Boolean isPermisoDuplicarVehiculoCliente;
	public Boolean isPermisoOrdenVehiculoCliente;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public VehiculoClienteParameterReturnGeneral vehiculoclienteReturnGeneral;
	public VehiculoClienteParameterReturnGeneral vehiculoclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVehiculoCliente=false;
	public Boolean esParaAccionDesdeFormularioVehiculoCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VehiculoClienteSessionBeanAdditional vehiculoclienteSessionBeanAdditional=null;
	
	public VehiculoClienteSessionBeanAdditional getVehiculoClienteSessionBeanAdditional() {
		return this.vehiculoclienteSessionBeanAdditional;
	}
	
	public void setVehiculoClienteSessionBeanAdditional(VehiculoClienteSessionBeanAdditional vehiculoclienteSessionBeanAdditional) {
		try {
			this.vehiculoclienteSessionBeanAdditional=vehiculoclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VehiculoClienteBeanSwingJInternalFrameAdditional vehiculoclienteBeanSwingJInternalFrameAdditional=null;
	//public class VehiculoClienteBeanSwingJInternalFrame
	
	public VehiculoClienteBeanSwingJInternalFrameAdditional getVehiculoClienteBeanSwingJInternalFrameAdditional() {
		return this.vehiculoclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setVehiculoClienteBeanSwingJInternalFrameAdditional(VehiculoClienteBeanSwingJInternalFrameAdditional vehiculoclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.vehiculoclienteBeanSwingJInternalFrameAdditional=vehiculoclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VehiculoClienteLogic vehiculoclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VehiculoCliente vehiculoclienteBean;
	public VehiculoClienteConstantesFunciones vehiculoclienteConstantesFunciones;
	//public VehiculoClienteParameterReturnGeneral vehiculoclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<VehiculoCliente> vehiculoclientes;	
	//public List<VehiculoCliente> vehiculoclientesEliminados;
	//public List<VehiculoCliente> vehiculoclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVehiculoCliente=false;
	public Boolean isVisibilidadCeldaDuplicarVehiculoCliente=true;
	public Boolean isVisibilidadCeldaCopiarVehiculoCliente=true;
	public Boolean isVisibilidadCeldaVerFormVehiculoCliente=true;
	public Boolean isVisibilidadCeldaOrdenVehiculoCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVehiculoCliente=false;
	public Boolean isVisibilidadCeldaModificarVehiculoCliente=false;
	public Boolean isVisibilidadCeldaActualizarVehiculoCliente=false;
	public Boolean isVisibilidadCeldaEliminarVehiculoCliente=false;
	public Boolean isVisibilidadCeldaCancelarVehiculoCliente=false;
	public Boolean isVisibilidadCeldaGuardarVehiculoCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVehiculoCliente=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoVehiculoCliente() {
		return this.iIdNuevoVehiculoCliente;
	}

	public void setiIdNuevoVehiculoCliente(Long iIdNuevoVehiculoCliente) {
		this.iIdNuevoVehiculoCliente = iIdNuevoVehiculoCliente;
	}
	
	public Long getidVehiculoClienteActual() {
		return this.idVehiculoClienteActual;
	}

	public void setidVehiculoClienteActual(Long idVehiculoClienteActual) {
		this.idVehiculoClienteActual = idVehiculoClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VehiculoCliente getvehiculocliente() {
		return this.vehiculocliente;
	}

	public void setvehiculocliente(VehiculoCliente vehiculocliente) {
		this.vehiculocliente = vehiculocliente;
	}
	
	public VehiculoCliente getvehiculoclienteAux() {
		return this.vehiculoclienteAux;
	}

	public void setvehiculoclienteAux(VehiculoCliente vehiculoclienteAux) {
		this.vehiculoclienteAux = vehiculoclienteAux;
	}				
	
	public VehiculoCliente getvehiculoclienteAnterior() {
		return this.vehiculoclienteAnterior;
	}

	public void setvehiculoclienteAnterior(VehiculoCliente vehiculoclienteAnterior) {
		this.vehiculoclienteAnterior = vehiculoclienteAnterior;
	}	
	
	public VehiculoCliente getvehiculoclienteTotales() {
		return this.vehiculoclienteTotales;
	}

	public void setvehiculoclienteTotales(VehiculoCliente vehiculoclienteTotales) {
		this.vehiculoclienteTotales = vehiculoclienteTotales;
	}	
	
	public VehiculoCliente getvehiculoclienteBean() {
		return this.vehiculoclienteBean;
	}

	public void setvehiculoclienteBean(VehiculoCliente vehiculoclienteBean) {
		this.vehiculoclienteBean = vehiculoclienteBean;
	}	
	
	public VehiculoClienteParameterReturnGeneral getvehiculoclienteReturnGeneral() {
		return this.vehiculoclienteReturnGeneral;
	}

	public void setvehiculoclienteReturnGeneral(VehiculoClienteParameterReturnGeneral vehiculoclienteReturnGeneral) {
		this.vehiculoclienteReturnGeneral = vehiculoclienteReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VehiculoClienteLogic getVehiculoClienteLogic()	{		
		return vehiculoclienteLogic;
	}

	public void setVehiculoClienteLogic(VehiculoClienteLogic vehiculoclienteLogic) {
		this.vehiculoclienteLogic = vehiculoclienteLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoVehiculoCliente() {
		return isEsNuevoVehiculoCliente;
	}

	public void setIsEsNuevoVehiculoCliente(Boolean isEsNuevoVehiculoCliente) {
		this.isEsNuevoVehiculoCliente = isEsNuevoVehiculoCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioVehiculoCliente() {
		return esParaAccionDesdeFormularioVehiculoCliente;
	}
	
	public void setEsParaAccionDesdeFormularioVehiculoCliente(Boolean esParaAccionDesdeFormularioVehiculoCliente) {
		this.esParaAccionDesdeFormularioVehiculoCliente = esParaAccionDesdeFormularioVehiculoCliente;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.vehiculoclienteSessionBean==null) {
				this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
			}

			if(!this.vehiculoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(vehiculoclienteSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.vehiculoclienteSessionBean==null) {
				this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
			}

			if(!this.vehiculoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(vehiculoclienteSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.vehiculocliente!=null) {
						this.vehiculocliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
						this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVehiculoCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
						if(this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVehiculoClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaVehiculoClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVehiculoClienteGenerico!=null && jComboBoxid_empresaVehiculoClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaVehiculoClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.vehiculocliente!=null) {
						this.vehiculocliente.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
						this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteVehiculoCliente.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
						if(this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteVehiculoCliente!=null) {
						jComboBoxid_clienteFK_IdClienteVehiculoCliente.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteVehiculoCliente!=null) {
							//jComboBoxid_clienteFK_IdClienteVehiculoCliente.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteVehiculoCliente.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteVehiculoCliente.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteVehiculoClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteVehiculoClienteGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteVehiculoClienteGenerico!=null && jComboBoxid_clienteVehiculoClienteGenerico.getItemCount()>0) {
					jComboBoxid_clienteVehiculoClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VehiculoCliente vehiculocliente,JComboBox jComboBoxid_empresaVehiculoClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVehiculoClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVehiculoClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				vehiculocliente.setid_empresa(empresaAux.getId());
				vehiculocliente.setempresa_descripcion(VehiculoClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				vehiculocliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(VehiculoCliente vehiculocliente,JComboBox jComboBoxid_clienteVehiculoClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteVehiculoClienteGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteVehiculoClienteGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				vehiculocliente.setid_cliente(clienteAux.getId());
				vehiculocliente.setcliente_descripcion(VehiculoClienteConstantesFunciones.getClienteDescripcion(clienteAux));
				vehiculocliente.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { 
							this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { 
					}

					if(!VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { 
							this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { 
					}

					if(!VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteVehiculoCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteVehiculoCliente.addItem(cliente);
							}
						}

						if(!VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
							this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
							this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
							this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
							this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteVehiculoCliente.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteVehiculoCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVehiculoCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			VehiculoClienteConstantesFunciones.refrescarForeignKeysDescripcionesVehiculoCliente(this.vehiculoclienteLogic.getVehiculoClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			VehiculoClienteConstantesFunciones.refrescarForeignKeysDescripcionesVehiculoCliente(this.vehiculoclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//vehiculoclienteLogic.setVehiculoClientes(this.vehiculoclientes);
			vehiculoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public VehiculoClienteParameterReturnGeneral getVehiculoClienteParameterGeneral() {
		return this.vehiculoclienteParameterGeneral;
	}
	
	public void setVehiculoClienteParameterGeneral(VehiculoClienteParameterReturnGeneral vehiculoclienteParameterGeneral) {
		this.vehiculoclienteParameterGeneral = vehiculoclienteParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoVehiculoCliente() {
		return isPermisoTodoVehiculoCliente;
	}

	public void setIsPermisoTodoVehiculoCliente(Boolean isPermisoTodoVehiculoCliente) {
		this.isPermisoTodoVehiculoCliente = isPermisoTodoVehiculoCliente;
	}

	public Boolean getIsPermisoNuevoVehiculoCliente() {
		return isPermisoNuevoVehiculoCliente;
	}

	public void setIsPermisoNuevoVehiculoCliente(Boolean isPermisoNuevoVehiculoCliente) {
		this.isPermisoNuevoVehiculoCliente = isPermisoNuevoVehiculoCliente;
	}

	public Boolean getIsPermisoActualizarVehiculoCliente() {
		return isPermisoActualizarVehiculoCliente;
	}

	public void setIsPermisoActualizarVehiculoCliente(Boolean isPermisoActualizarVehiculoCliente) {
		this.isPermisoActualizarVehiculoCliente = isPermisoActualizarVehiculoCliente;
	}

	public Boolean getIsPermisoEliminarVehiculoCliente() {
		return isPermisoEliminarVehiculoCliente;
	}

	public void setIsPermisoEliminarVehiculoCliente(Boolean isPermisoEliminarVehiculoCliente) {
		this.isPermisoEliminarVehiculoCliente = isPermisoEliminarVehiculoCliente;
	}

	public Boolean getIsPermisoGuardarCambiosVehiculoCliente() {
		return isPermisoGuardarCambiosVehiculoCliente;
	}

	public void setIsPermisoGuardarCambiosVehiculoCliente(Boolean isPermisoGuardarCambiosVehiculoCliente) {
		this.isPermisoGuardarCambiosVehiculoCliente = isPermisoGuardarCambiosVehiculoCliente;
	}
	
	public Boolean getIsPermisoConsultaVehiculoCliente() {
		return isPermisoConsultaVehiculoCliente;
	}

	public void setIsPermisoConsultaVehiculoCliente(Boolean isPermisoConsultaVehiculoCliente) {
		this.isPermisoConsultaVehiculoCliente = isPermisoConsultaVehiculoCliente;
	}

	public Boolean getIsPermisoBusquedaVehiculoCliente() {
		return isPermisoBusquedaVehiculoCliente;
	}

	public void setIsPermisoBusquedaVehiculoCliente(Boolean isPermisoBusquedaVehiculoCliente) {
		this.isPermisoBusquedaVehiculoCliente = isPermisoBusquedaVehiculoCliente;
	}

	public Boolean getIsPermisoReporteVehiculoCliente() {
		return isPermisoReporteVehiculoCliente;
	}

	public void setIsPermisoReporteVehiculoCliente(Boolean isPermisoReporteVehiculoCliente) {
		this.isPermisoReporteVehiculoCliente = isPermisoReporteVehiculoCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioVehiculoCliente() {
		return isPermisoPaginacionMedioVehiculoCliente;
	}

	public void setIsPermisoPaginacionMedioVehiculoCliente(Boolean isPermisoPaginacionMedioVehiculoCliente) {
		this.isPermisoPaginacionMedioVehiculoCliente = isPermisoPaginacionMedioVehiculoCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoVehiculoCliente() {
		return isPermisoPaginacionTodoVehiculoCliente;
	}

	public void setIsPermisoPaginacionTodoVehiculoCliente(Boolean isPermisoPaginacionTodoVehiculoCliente) {
		this.isPermisoPaginacionTodoVehiculoCliente = isPermisoPaginacionTodoVehiculoCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoVehiculoCliente() {
		return isPermisoPaginacionAltoVehiculoCliente;
	}

	public void setIsPermisoPaginacionAltoVehiculoCliente(Boolean isPermisoPaginacionAltoVehiculoCliente) {
		this.isPermisoPaginacionAltoVehiculoCliente = isPermisoPaginacionAltoVehiculoCliente;
	}
	
	public Boolean getIsPermisoCopiarVehiculoCliente() {
		return isPermisoCopiarVehiculoCliente;
	}

	public void setIsPermisoCopiarVehiculoCliente(Boolean isPermisoCopiarVehiculoCliente) {
		this.isPermisoCopiarVehiculoCliente = isPermisoCopiarVehiculoCliente;
	}
	
	public Boolean getIsPermisoVerFormVehiculoCliente() {
		return isPermisoVerFormVehiculoCliente;
	}

	public void setIsPermisoVerFormVehiculoCliente(Boolean isPermisoVerFormVehiculoCliente) {
		this.isPermisoVerFormVehiculoCliente = isPermisoVerFormVehiculoCliente;
	}
	
	public Boolean getIsPermisoDuplicarVehiculoCliente() {
		return isPermisoDuplicarVehiculoCliente;
	}

	public void setIsPermisoDuplicarVehiculoCliente(Boolean isPermisoDuplicarVehiculoCliente) {
		this.isPermisoDuplicarVehiculoCliente = isPermisoDuplicarVehiculoCliente;
	}
	
	public Boolean getIsPermisoOrdenVehiculoCliente() {
		return isPermisoOrdenVehiculoCliente;
	}

	public void setIsPermisoOrdenVehiculoCliente(Boolean isPermisoOrdenVehiculoCliente) {
		this.isPermisoOrdenVehiculoCliente = isPermisoOrdenVehiculoCliente;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoVehiculoCliente() {
		return isVisibilidadCeldaNuevoVehiculoCliente;
	}

	public void setIsVisibilidadCeldaNuevoVehiculoCliente(Boolean isVisibilidadCeldaNuevoVehiculoCliente) {
		this.isVisibilidadCeldaNuevoVehiculoCliente = isVisibilidadCeldaNuevoVehiculoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVehiculoCliente() {
		return isVisibilidadCeldaDuplicarVehiculoCliente;
	}

	public void setIsVisibilidadCeldaDuplicarVehiculoCliente(Boolean isVisibilidadCeldaDuplicarVehiculoCliente) {
		this.isVisibilidadCeldaDuplicarVehiculoCliente = isVisibilidadCeldaDuplicarVehiculoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVehiculoCliente() {
		return isVisibilidadCeldaCopiarVehiculoCliente;
	}

	public void setIsVisibilidadCeldaCopiarVehiculoCliente(Boolean isVisibilidadCeldaCopiarVehiculoCliente) {
		this.isVisibilidadCeldaCopiarVehiculoCliente = isVisibilidadCeldaCopiarVehiculoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVehiculoCliente() {
		return isVisibilidadCeldaVerFormVehiculoCliente;
	}

	public void setIsVisibilidadCeldaVerFormVehiculoCliente(Boolean isVisibilidadCeldaVerFormVehiculoCliente) {
		this.isVisibilidadCeldaVerFormVehiculoCliente = isVisibilidadCeldaVerFormVehiculoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVehiculoCliente() {
		return isVisibilidadCeldaOrdenVehiculoCliente;
	}

	public void setIsVisibilidadCeldaOrdenVehiculoCliente(Boolean isVisibilidadCeldaOrdenVehiculoCliente) {
		this.isVisibilidadCeldaOrdenVehiculoCliente = isVisibilidadCeldaOrdenVehiculoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVehiculoCliente() {
		return isVisibilidadCeldaNuevoRelacionesVehiculoCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVehiculoCliente(Boolean isVisibilidadCeldaNuevoRelacionesVehiculoCliente) {
		this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente = isVisibilidadCeldaNuevoRelacionesVehiculoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVehiculoCliente() {
		return isVisibilidadCeldaModificarVehiculoCliente;
	}

	public void setIsVisibilidadCeldaModificarVehiculoCliente(Boolean isVisibilidadCeldaModificarVehiculoCliente) {
		this.isVisibilidadCeldaModificarVehiculoCliente = isVisibilidadCeldaModificarVehiculoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVehiculoCliente() {
		return isVisibilidadCeldaActualizarVehiculoCliente;
	}

	public void setIsVisibilidadCeldaActualizarVehiculoCliente(Boolean isVisibilidadCeldaActualizarVehiculoCliente) {
		this.isVisibilidadCeldaActualizarVehiculoCliente = isVisibilidadCeldaActualizarVehiculoCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarVehiculoCliente() {
		return isVisibilidadCeldaEliminarVehiculoCliente;
	}

	public void setIsVisibilidadCeldaEliminarVehiculoCliente(Boolean isVisibilidadCeldaEliminarVehiculoCliente) {
		this.isVisibilidadCeldaEliminarVehiculoCliente = isVisibilidadCeldaEliminarVehiculoCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarVehiculoCliente() {
		return isVisibilidadCeldaCancelarVehiculoCliente;
	}

	public void setIsVisibilidadCeldaCancelarVehiculoCliente(Boolean isVisibilidadCeldaCancelarVehiculoCliente) {
		this.isVisibilidadCeldaCancelarVehiculoCliente = isVisibilidadCeldaCancelarVehiculoCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarVehiculoCliente() {
		return isVisibilidadCeldaGuardarVehiculoCliente;
	}

	public void setIsVisibilidadCeldaGuardarVehiculoCliente(Boolean isVisibilidadCeldaGuardarVehiculoCliente) {
		this.isVisibilidadCeldaGuardarVehiculoCliente = isVisibilidadCeldaGuardarVehiculoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVehiculoCliente() {
		return isVisibilidadCeldaGuardarCambiosVehiculoCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVehiculoCliente(Boolean isVisibilidadCeldaGuardarCambiosVehiculoCliente) {
		this.isVisibilidadCeldaGuardarCambiosVehiculoCliente = isVisibilidadCeldaGuardarCambiosVehiculoCliente;
	}
		
	public VehiculoClienteSessionBean getvehiculoclienteSessionBean() {
		return this.vehiculoclienteSessionBean;
	}
	
	public void setvehiculoclienteSessionBean(VehiculoClienteSessionBean vehiculoclienteSessionBean) {
		this.vehiculoclienteSessionBean=vehiculoclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(VehiculoCliente vehiculocliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(vehiculocliente,null);
				this.setActualParaGuardarClienteForeignKey(vehiculocliente,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(VehiculoCliente vehiculocliente,VehiculoCliente vehiculoclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVehiculoCliente(vehiculocliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		vehiculoclienteAux.setId(vehiculocliente.getId());
		vehiculoclienteAux.setVersionRow(vehiculocliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessVehiculoCliente();
		
			int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = vehiculoclienteValidator.getInvalidValues(this.vehiculocliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			vehiculoclienteLogic.setDatosCliente(datosCliente);
			vehiculoclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				vehiculoclienteAux=new  VehiculoCliente();
				
				vehiculoclienteAux.setIsNew(true);
				vehiculoclienteAux.setIsChanged(true);
				
				vehiculoclienteAux.setVehiculoClienteOriginal(this.vehiculocliente);
				
				vehiculoclienteAux.setId(this.vehiculocliente.getId());	
				vehiculoclienteAux.setVersionRow(this.vehiculocliente.getVersionRow());	
				vehiculoclienteAux.setid_empresa(this.vehiculocliente.getid_empresa());	
				vehiculoclienteAux.setid_cliente(this.vehiculocliente.getid_cliente());	
				vehiculoclienteAux.setcodigo(this.vehiculocliente.getcodigo());	
				vehiculoclienteAux.setmarca(this.vehiculocliente.getmarca());	
				vehiculoclienteAux.setmodelo(this.vehiculocliente.getmodelo());	
				vehiculoclienteAux.setplaca(this.vehiculocliente.getplaca());	
				vehiculoclienteAux.setanio(this.vehiculocliente.getanio());	
				vehiculoclienteAux.setes_prendado(this.vehiculocliente.getes_prendado());	
				vehiculoclienteAux.setvalor_avaluo(this.vehiculocliente.getvalor_avaluo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vehiculoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(vehiculoclienteAux,vehiculoclienteLogic.getVehiculoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vehiculoclienteAux,vehiculoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vehiculoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoclienteLogic.saveVehiculoClientes();//WithConnection
						//vehiculoclienteLogic.getSetVersionRowVehiculoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vehiculocliente,vehiculoclienteAux);
					
					this.refrescarForeignKeysDescripcionesVehiculoCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vehiculoclienteLogic.saveVehiculoClienteRelaciones(vehiculoclienteAux);//WithConnection
								//vehiculoclienteLogic.getSetVersionRowVehiculoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vehiculocliente,vehiculoclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vehiculoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vehiculoclienteAux,vehiculoclienteLogic.getVehiculoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vehiculoclienteAux,vehiculoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vehiculocliente,vehiculoclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				vehiculoclienteAux=new  VehiculoCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.vehiculoclienteSessionBean.getEsGuardarRelacionado() && this.vehiculocliente.getId()>=0)) {
						
					vehiculoclienteAux.setIsNew(false);
				}
				
				vehiculoclienteAux.setIsDeleted(false);
			
				vehiculoclienteAux.setId(this.vehiculocliente.getId());	
				vehiculoclienteAux.setVersionRow(this.vehiculocliente.getVersionRow());	
				vehiculoclienteAux.setid_empresa(this.vehiculocliente.getid_empresa());	
				vehiculoclienteAux.setid_cliente(this.vehiculocliente.getid_cliente());	
				vehiculoclienteAux.setcodigo(this.vehiculocliente.getcodigo());	
				vehiculoclienteAux.setmarca(this.vehiculocliente.getmarca());	
				vehiculoclienteAux.setmodelo(this.vehiculocliente.getmodelo());	
				vehiculoclienteAux.setplaca(this.vehiculocliente.getplaca());	
				vehiculoclienteAux.setanio(this.vehiculocliente.getanio());	
				vehiculoclienteAux.setes_prendado(this.vehiculocliente.getes_prendado());	
				vehiculoclienteAux.setvalor_avaluo(this.vehiculocliente.getvalor_avaluo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vehiculoclienteAux,vehiculoclienteLogic.getVehiculoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vehiculoclienteAux,vehiculoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vehiculoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoclienteLogic.saveVehiculoClientes();//WithConnection
						//vehiculoclienteLogic.getSetVersionRowVehiculoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vehiculocliente,vehiculoclienteAux);
					
					this.refrescarForeignKeysDescripcionesVehiculoCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vehiculoclienteLogic.saveVehiculoClienteRelaciones(vehiculoclienteAux);//WithConnection
								//vehiculoclienteLogic.getSetVersionRowVehiculoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vehiculocliente,vehiculoclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vehiculoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vehiculoclienteAux,vehiculoclienteLogic.getVehiculoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vehiculoclienteAux,vehiculoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vehiculocliente,vehiculoclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				vehiculoclienteAux=new  VehiculoCliente();
				
				vehiculoclienteAux.setIsNew(false);
				vehiculoclienteAux.setIsChanged(false);
				
				vehiculoclienteAux.setIsDeleted(true);
				
				vehiculoclienteAux.setId(this.vehiculocliente.getId());	
				vehiculoclienteAux.setVersionRow(this.vehiculocliente.getVersionRow());	
				vehiculoclienteAux.setid_empresa(this.vehiculocliente.getid_empresa());	
				vehiculoclienteAux.setid_cliente(this.vehiculocliente.getid_cliente());	
				vehiculoclienteAux.setcodigo(this.vehiculocliente.getcodigo());	
				vehiculoclienteAux.setmarca(this.vehiculocliente.getmarca());	
				vehiculoclienteAux.setmodelo(this.vehiculocliente.getmodelo());	
				vehiculoclienteAux.setplaca(this.vehiculocliente.getplaca());	
				vehiculoclienteAux.setanio(this.vehiculocliente.getanio());	
				vehiculoclienteAux.setes_prendado(this.vehiculocliente.getes_prendado());	
				vehiculoclienteAux.setvalor_avaluo(this.vehiculocliente.getvalor_avaluo());	
				
				if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.vehiculoclienteAux.getId()>=0) {	
						this.vehiculoclientesEliminados.add(vehiculoclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(vehiculoclienteAux,vehiculoclienteLogic.getVehiculoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vehiculoclienteAux,vehiculoclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vehiculoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoclienteLogic.saveVehiculoClientes();//WithConnection
						//vehiculoclienteLogic.getSetVersionRowVehiculoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vehiculoclienteLogic.saveVehiculoClienteRelaciones(vehiculoclienteAux);//WithConnection
								//vehiculoclienteLogic.getSetVersionRowVehiculoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.vehiculoclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(vehiculoclienteAux,vehiculoclienteLogic.getVehiculoClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(vehiculoclienteAux,vehiculoclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getVehiculoClientes().addAll(this.vehiculoclientesEliminados);
					
					vehiculoclienteLogic.saveVehiculoClientes();//WithConnection
					//vehiculoclienteLogic.getSetVersionRowVehiculoClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesVehiculoCliente();
				
				this.vehiculoclientesEliminados= new ArrayList<VehiculoCliente>();		
			}
			
			if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Vehiculo Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Vehiculo Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.vehiculocliente=vehiculoclienteAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessVehiculoCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(VehiculoCliente vehiculoclienteLocal) throws Exception {
		
		if(this.vehiculoclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VehiculoCliente vehiculoclienteLocal) throws Exception {	
		if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				vehiculoclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				vehiculoclienteLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVehiculoClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = vehiculoclienteValidator.getInvalidValues(this.vehiculocliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VehiculoCliente vehiculocliente,List<VehiculoCliente> vehiculoclientes) throws Exception {
		try	{		
			VehiculoClienteConstantesFunciones.actualizarLista(vehiculocliente,vehiculoclientes,this.vehiculoclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(VehiculoCliente vehiculocliente,List<VehiculoCliente> vehiculoclientes) throws Exception {
		try	{			
			VehiculoClienteConstantesFunciones.actualizarSelectedLista(vehiculocliente,vehiculoclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VehiculoCliente> vehiculoclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				vehiculoclientesLocal=this.vehiculoclienteLogic.getVehiculoClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				vehiculoclientesLocal=this.vehiculoclientes;
			}
			//ARCHITECTURE
		
			for(VehiculoCliente vehiculoclienteLocal:vehiculoclientesLocal) {
				if(this.permiteMantenimiento(vehiculoclienteLocal) && vehiculoclienteLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+VehiculoClienteConstantesFunciones.getVehiculoClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VehiculoClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelid_empresaVehiculoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoClienteConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelid_clienteVehiculoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoClienteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelcodigoVehiculoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoClienteConstantesFunciones.MARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelmarcaVehiculoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoClienteConstantesFunciones.MODELO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelmodeloVehiculoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoClienteConstantesFunciones.PLACA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelplacaVehiculoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoClienteConstantesFunciones.ANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelanioVehiculoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoClienteConstantesFunciones.ESPRENDADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabeles_prendadoVehiculoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoClienteConstantesFunciones.VALORAVALUO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelvalor_avaluoVehiculoCliente,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculoCliente.jLabelid_empresaVehiculoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculoCliente.jLabelid_clienteVehiculoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculoCliente.jLabelcodigoVehiculoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculoCliente.jLabelmarcaVehiculoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculoCliente.jLabelmodeloVehiculoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculoCliente.jLabelplacaVehiculoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculoCliente.jLabelanioVehiculoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculoCliente.jLabeles_prendadoVehiculoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculoCliente.jLabelvalor_avaluoVehiculoCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoVehiculoCliente--;	
		
		
		this.vehiculoclienteAux=new VehiculoCliente();
		
		this.vehiculoclienteAux.setId(this.iIdNuevoVehiculoCliente);
		this.vehiculoclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vehiculoclienteLogic.getVehiculoClientes().add(this.vehiculoclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.vehiculoclientes.add(this.vehiculoclienteAux);
		}
		//ARCHITECTURE
		
		this.vehiculocliente=this.vehiculoclienteAux;
		
		if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVehiculoCliente(this.vehiculocliente);
			this.setVariablesObjetoActualToFormularioForeignKeyVehiculoCliente(this.vehiculocliente);
		}
				
		//this.setDefaultControlesVehiculoCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVehiculoCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVehiculoCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVehiculoCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVehiculoCliente(this.vehiculoclienteBean,this.vehiculocliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(VehiculoClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.vehiculoclienteSessionBean.getConGuardarRelaciones()) {
			classes=VehiculoClienteConstantesFunciones.getClassesRelationshipsOfVehiculoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.vehiculoclienteReturnGeneral=vehiculoclienteLogic.procesarEventosVehiculoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vehiculoclienteLogic.getVehiculoClientes(),this.vehiculocliente,this.vehiculoclienteParameterGeneral,this.isEsNuevoVehiculoCliente,classes);//this.vehiculoclienteLogic.getVehiculoCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVehiculoCliente(this.vehiculoclienteReturnGeneral,this.vehiculoclienteBean,false);
		
		if(this.vehiculoclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVehiculoCliente(this.vehiculoclienteReturnGeneral.getVehiculoCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVehiculoCliente(this.vehiculoclienteReturnGeneral.getVehiculoCliente());
		}
		
		if(this.vehiculoclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVehiculoCliente(this.vehiculoclienteReturnGeneral.getVehiculoCliente(),classes);//this.vehiculoclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVehiculoCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVehiculoCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.RecargarFormVehiculoCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVehiculoCliente(false);
						
			if(vehiculoclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVehiculoCliente();
			}
			
			this.actualizarVisualTableDatosVehiculoCliente();
			
			this.jTableDatosVehiculoCliente.setRowSelectionInterval(this.getIndiceNuevoVehiculoCliente(), this.getIndiceNuevoVehiculoCliente());
			
			this.seleccionarFilaTablaVehiculoClienteActual();
						
			this.actualizarEstadoCeldasBotonesVehiculoCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVehiculoCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldcodigoVehiculoCliente.setEnabled(isHabilitar && this.vehiculoclienteConstantesFunciones.activarcodigoVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamarcaVehiculoCliente.setEnabled(isHabilitar && this.vehiculoclienteConstantesFunciones.activarmarcaVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamodeloVehiculoCliente.setEnabled(isHabilitar && this.vehiculoclienteConstantesFunciones.activarmodeloVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldplacaVehiculoCliente.setEnabled(isHabilitar && this.vehiculoclienteConstantesFunciones.activarplacaVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldanioVehiculoCliente.setEnabled(isHabilitar && this.vehiculoclienteConstantesFunciones.activaranioVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxes_prendadoVehiculoCliente.setEnabled(isHabilitar && this.vehiculoclienteConstantesFunciones.activares_prendadoVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldvalor_avaluoVehiculoCliente.setEnabled(isHabilitar && this.vehiculoclienteConstantesFunciones.activarvalor_avaluoVehiculoCliente);	
		//
		this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.setEnabled(isHabilitar && this.vehiculoclienteConstantesFunciones.activarid_empresaVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.setEnabled(isHabilitar && this.vehiculoclienteConstantesFunciones.activarid_clienteVehiculoCliente);
	};
	
	public void setDefaultControlesVehiculoCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVehiculoCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.vehiculoclienteSessionBean.setConGuardarRelaciones(true);			
			this.vehiculoclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVehiculoCliente.jTabbedPaneRelacionesVehiculoCliente.setVisible(true);
			
					
		} else {
			//this.vehiculoclienteSessionBean.setConGuardarRelaciones(false);			
			this.vehiculoclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVehiculoCliente.jTabbedPaneRelacionesVehiculoCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVehiculoCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VehiculoCliente vehiculoclienteAux:this.vehiculoclienteLogic.getVehiculoClientes()) {
				if(vehiculoclienteAux.getId().equals(this.iIdNuevoVehiculoCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VehiculoCliente vehiculoclienteAux:this.vehiculoclientes) {
				if(vehiculoclienteAux.getId().equals(this.iIdNuevoVehiculoCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualVehiculoCliente(VehiculoCliente vehiculocliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VehiculoCliente vehiculoclienteAux:this.vehiculoclienteLogic.getVehiculoClientes()) {
				if(vehiculoclienteAux.getId().equals(vehiculocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VehiculoCliente vehiculoclienteAux:this.vehiculoclientes) {
				if(vehiculoclienteAux.getId().equals(vehiculocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalVehiculoCliente(VehiculoCliente vehiculoclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VehiculoCliente vehiculoclienteAux:this.vehiculoclienteLogic.getVehiculoClientes()) {
				if(vehiculoclienteAux.getVehiculoClienteOriginal().getId().equals(vehiculoclienteOriginal.getId())) {
					existe=true;
					vehiculoclienteOriginal.setId(vehiculoclienteAux.getId());
					vehiculoclienteOriginal.setVersionRow(vehiculoclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VehiculoCliente vehiculoclienteAux:this.vehiculoclientes) {
				if(vehiculoclienteAux.getVehiculoClienteOriginal().getId().equals(vehiculoclienteOriginal.getId())) {
					existe=true;
					vehiculoclienteOriginal.setId(vehiculoclienteAux.getId());
					vehiculoclienteOriginal.setVersionRow(vehiculoclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVehiculoCliente(Boolean esParaCancelar) throws Exception {
		vehiculoclientesAux=new ArrayList<VehiculoCliente>();
		vehiculoclienteAux=new VehiculoCliente();
		
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VehiculoCliente vehiculoclienteAux:this.vehiculoclienteLogic.getVehiculoClientes()) {
					if(vehiculoclienteAux.getId()<0) {
						vehiculoclientesAux.add(vehiculoclienteAux);
					}		
				}
				this.iIdNuevoVehiculoCliente=0L;
				this.vehiculoclienteLogic.getVehiculoClientes().removeAll(vehiculoclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VehiculoCliente vehiculoclienteAux:this.vehiculoclientes) {
					if(vehiculoclienteAux.getId()<0) {
						vehiculoclientesAux.add(vehiculoclienteAux);
					}		
				}
				this.iIdNuevoVehiculoCliente=0L;
				this.vehiculoclientes.removeAll(vehiculoclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVehiculoCliente 
					&& this.vehiculoclienteLogic.getVehiculoClientes().size()>0
					) {
					vehiculoclienteAux=this.vehiculoclienteLogic.getVehiculoClientes().get(this.vehiculoclienteLogic.getVehiculoClientes().size() - 1);
				
					if(vehiculoclienteAux.getId()<0) {
						this.vehiculoclienteLogic.getVehiculoClientes().remove(vehiculoclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVehiculoCliente && this.vehiculoclientes.size()>0) {
					vehiculoclienteAux=this.vehiculoclientes.get(this.vehiculoclientes.size() - 1);
				
					if(vehiculoclienteAux.getId()<0) {
						this.vehiculoclientes.remove(vehiculoclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVehiculoCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(vehiculocliente.getId()<0) {
				this.vehiculoclienteLogic.getVehiculoClientes().remove(this.vehiculocliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(vehiculocliente.getId()<0) {
				this.vehiculoclientes.remove(this.vehiculocliente);
			}
		}			
	}
	
	public void setEstadosInicialesVehiculoCliente(List<VehiculoCliente> vehiculoclientesAux) throws Exception {
		VehiculoClienteConstantesFunciones.setEstadosInicialesVehiculoCliente(vehiculoclientesAux);
	}
	
	public void setEstadosInicialesVehiculoCliente(VehiculoCliente vehiculoclienteAux) throws Exception {
		VehiculoClienteConstantesFunciones.setEstadosInicialesVehiculoCliente(vehiculoclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVehiculoClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVehiculoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVehiculoClienteActual()) {
				if(!this.isEsNuevoVehiculoCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVehiculoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVehiculoCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVehiculoClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Vehiculo Cliente ?", "MANTENIMIENTO DE Vehiculo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVehiculoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VehiculoCliente vehiculocliente) throws Exception {
		VehiculoClienteConstantesFunciones.seleccionarAsignar(this.vehiculocliente,vehiculocliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVehiculoCliente=this.isPermisoActualizarOriginalVehiculoCliente;
			
			
			this.seleccionarAsignar(vehiculocliente);
			
			

			idClienteActual=vehiculocliente.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VehiculoClienteConstantesFunciones.quitarEspaciosVehiculoCliente(this.vehiculocliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesVehiculoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.vehiculoclienteSessionBean.setsFuncionBusquedaRapida(this.vehiculoclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVehiculoCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVehiculoCliente(esParaCancelar);				
				this.cancelarNuevoVehiculoCliente(esParaCancelar);								
			}
			
			this.vehiculocliente=new VehiculoCliente();
			
			this.inicializarVehiculoCliente();
			
			this.actualizarEstadoCeldasBotonesVehiculoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVehiculoCliente() throws Exception {
		try {
			VehiculoClienteConstantesFunciones.inicializarVehiculoCliente(this.vehiculocliente);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.vehiculoclienteLogic.getVehiculoClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVehiculoClientes(String sAccionBusqueda,List<VehiculoCliente> vehiculoclientesParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="VehiculoCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VehiculoClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VehiculoClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VehiculoCliente"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Vehiculo Clientes");		
		parameters.put("busquedapor", VehiculoClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVehiculoCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VehiculoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VehiculoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVehiculoCliente=new JRBeanArrayDataSource(VehiculoClienteJInternalFrame.TraerVehiculoClienteBeans(vehiculoclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVehiculoCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VehiculoClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VehiculoClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VehiculoClienteBean.TraerVehiculoClienteBeans(vehiculoclientesParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteVehiculoClientes(sAccionBusqueda,sTipoArchivoReporte,vehiculoclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVehiculoClientes(sAccionBusqueda,sTipoArchivoReporte,vehiculoclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVehiculoClienteActionPerformed(null);
					//this.generarExcelReporteVehiculoClientes(sAccionBusqueda,sTipoArchivoReporte,vehiculoclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVehiculoClientes(sAccionBusqueda,sTipoArchivoReporte,vehiculoclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVehiculoClientes(sAccionBusqueda,sTipoArchivoReporte,vehiculoclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVehiculoClientes(sAccionBusqueda,sTipoArchivoReporte,vehiculoclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVehiculoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<VehiculoCliente> vehiculoclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculocliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VehiculoClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVehiculoCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VehiculoCliente vehiculocliente : vehiculoclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VehiculoClienteConstantesFunciones.generarExcelReporteDataVehiculoCliente("NORMAL",row,workbook,vehiculocliente,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVehiculoCliente(String sTipo,Row row,Workbook workbook) {
		
		VehiculoClienteConstantesFunciones.generarExcelReporteHeaderVehiculoCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVehiculoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<VehiculoCliente> vehiculoclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculocliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VehiculoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VehiculoCliente vehiculocliente : vehiculoclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VehiculoClienteConstantesFunciones.getVehiculoClienteDescripcion(vehiculocliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculocliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculocliente.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoClienteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculocliente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoClienteConstantesFunciones.LABEL_MARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_MARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculocliente.getmarca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoClienteConstantesFunciones.LABEL_MODELO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_MODELO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculocliente.getmodelo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoClienteConstantesFunciones.LABEL_PLACA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_PLACA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculocliente.getplaca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoClienteConstantesFunciones.LABEL_ANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_ANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculocliente.getanio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(vehiculocliente.getes_prendado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculocliente.getvalor_avaluo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVehiculoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<VehiculoCliente> vehiculoclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VehiculoCliente> vehiculoclientesRespaldo=null;
		
		classes=VehiculoClienteConstantesFunciones.getClassesRelationshipsOfVehiculoCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.vehiculoclienteLogic.setDatosCliente(this.datosCliente);
		this.vehiculoclienteLogic.setDatosDeep(this.datosDeep);
		this.vehiculoclienteLogic.setIsConDeep(true);
		
		vehiculoclientesRespaldo=this.vehiculoclienteLogic.getVehiculoClientes();
		
		this.vehiculoclienteLogic.setVehiculoClientes(vehiculoclientesParaReportes);	
		this.vehiculoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		vehiculoclientesParaReportes=this.vehiculoclienteLogic.getVehiculoClientes();
		this.vehiculoclienteLogic.setVehiculoClientes(vehiculoclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculocliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VehiculoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVehiculoCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VehiculoCliente vehiculocliente : vehiculoclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVehiculoCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VehiculoClienteConstantesFunciones.generarExcelReporteDataVehiculoCliente("NORMAL",row,workbook,vehiculocliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VehiculoClienteConstantesFunciones.getVehiculoClienteDescripcion(vehiculocliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVehiculoCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVehiculoCliente() throws Exception {		
		this.startProcessVehiculoCliente(true);
	}
	
	public void startProcessVehiculoCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVehiculoCliente ,this.jPanelParametrosReportesVehiculoCliente, this.jScrollPanelDatosVehiculoCliente,this.jPanelPaginacionVehiculoCliente, this.jScrollPanelDatosEdicionVehiculoCliente, this.jPanelAccionesVehiculoCliente,this.jPanelAccionesFormularioVehiculoCliente,this.jmenuBarVehiculoCliente,this.jmenuBarDetalleVehiculoCliente,this.jTtoolBarVehiculoCliente,this.jTtoolBarDetalleVehiculoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasVehiculoCliente=this.jTabbedPaneBusquedasVehiculoCliente; 
		
		final JPanel jPanelParametrosReportesVehiculoCliente=this.jPanelParametrosReportesVehiculoCliente;
		//final JScrollPane jScrollPanelDatosVehiculoCliente=this.jScrollPanelDatosVehiculoCliente;
		final JTable jTableDatosVehiculoCliente=this.jTableDatosVehiculoCliente;		
		final JPanel jPanelPaginacionVehiculoCliente=this.jPanelPaginacionVehiculoCliente;
		//final JScrollPane jScrollPanelDatosEdicionVehiculoCliente=this.jScrollPanelDatosEdicionVehiculoCliente;
		final JPanel jPanelAccionesVehiculoCliente=this.jPanelAccionesVehiculoCliente;
		
		JPanel jPanelCamposAuxiliarVehiculoCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVehiculoCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			jPanelCamposAuxiliarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jPanelCamposVehiculoCliente;
			jPanelAccionesFormularioAuxiliarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jPanelAccionesFormularioVehiculoCliente;
		}
		
		final JPanel jPanelCamposVehiculoCliente=jPanelCamposAuxiliarVehiculoCliente;
		final JPanel jPanelAccionesFormularioVehiculoCliente=jPanelAccionesFormularioAuxiliarVehiculoCliente;
		
		
		final JMenuBar jmenuBarVehiculoCliente=this.jmenuBarVehiculoCliente;
		final JToolBar jTtoolBarVehiculoCliente=this.jTtoolBarVehiculoCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVehiculoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVehiculoCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			jmenuBarDetalleAuxiliarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jmenuBarDetalleVehiculoCliente;
			jTtoolBarDetalleAuxiliarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jTtoolBarDetalleVehiculoCliente;
		}
		
		final JMenuBar jmenuBarDetalleVehiculoCliente=jmenuBarDetalleAuxiliarVehiculoCliente;
		final JToolBar jTtoolBarDetalleVehiculoCliente=jTtoolBarDetalleAuxiliarVehiculoCliente;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVehiculoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVehiculoCliente;
			processRunnable.jTableDatos=jTableDatosVehiculoCliente;
			processRunnable.jPanelCampos=jPanelCamposVehiculoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionVehiculoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesVehiculoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVehiculoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarVehiculoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVehiculoCliente;
			processRunnable.jTtoolBar=jTtoolBarVehiculoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVehiculoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVehiculoCliente ,jPanelParametrosReportesVehiculoCliente,jTableDatosVehiculoCliente, /*jScrollPanelDatosVehiculoCliente,*/jPanelCamposVehiculoCliente,jPanelPaginacionVehiculoCliente, /*jScrollPanelDatosEdicionVehiculoCliente,*/ jPanelAccionesVehiculoCliente,jPanelAccionesFormularioVehiculoCliente,jmenuBarVehiculoCliente,jmenuBarDetalleVehiculoCliente,jTtoolBarVehiculoCliente,jTtoolBarDetalleVehiculoCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVehiculoCliente ,jPanelParametrosReportesVehiculoCliente, jScrollPanelDatosVehiculoCliente,jPanelPaginacionVehiculoCliente, jScrollPanelDatosEdicionVehiculoCliente, jPanelAccionesVehiculoCliente,jPanelAccionesFormularioVehiculoCliente,jmenuBarVehiculoCliente,jmenuBarDetalleVehiculoCliente,jTtoolBarVehiculoCliente,jTtoolBarDetalleVehiculoCliente);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessVehiculoCliente() {// throws Exception 
		this.finishProcessVehiculoCliente(true);
	}
	
	public void finishProcessVehiculoCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVehiculoCliente ,this.jPanelParametrosReportesVehiculoCliente, this.jScrollPanelDatosVehiculoCliente,this.jPanelPaginacionVehiculoCliente, this.jScrollPanelDatosEdicionVehiculoCliente, this.jPanelAccionesVehiculoCliente,this.jPanelAccionesFormularioVehiculoCliente,this.jmenuBarVehiculoCliente,this.jmenuBarDetalleVehiculoCliente,this.jTtoolBarVehiculoCliente,this.jTtoolBarDetalleVehiculoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasVehiculoCliente=this.jTabbedPaneBusquedasVehiculoCliente; 
		
		final JPanel jPanelParametrosReportesVehiculoCliente=this.jPanelParametrosReportesVehiculoCliente;
		//final JScrollPane jScrollPanelDatosVehiculoCliente=this.jScrollPanelDatosVehiculoCliente;
		final JTable jTableDatosVehiculoCliente=this.jTableDatosVehiculoCliente;		
		final JPanel jPanelPaginacionVehiculoCliente=this.jPanelPaginacionVehiculoCliente;
		//final JScrollPane jScrollPanelDatosEdicionVehiculoCliente=this.jScrollPanelDatosEdicionVehiculoCliente;
		final JPanel jPanelAccionesVehiculoCliente=this.jPanelAccionesVehiculoCliente;
		
		JPanel jPanelCamposAuxiliarVehiculoCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVehiculoCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			jPanelCamposAuxiliarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jPanelCamposVehiculoCliente;
			jPanelAccionesFormularioAuxiliarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jPanelAccionesFormularioVehiculoCliente;
		}
		
		final JPanel jPanelCamposVehiculoCliente=jPanelCamposAuxiliarVehiculoCliente;
		final JPanel jPanelAccionesFormularioVehiculoCliente=jPanelAccionesFormularioAuxiliarVehiculoCliente;
		
		
		final JMenuBar jmenuBarVehiculoCliente=this.jmenuBarVehiculoCliente;		
		final JToolBar jTtoolBarVehiculoCliente=this.jTtoolBarVehiculoCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarVehiculoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVehiculoCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			jmenuBarDetalleAuxiliarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jmenuBarDetalleVehiculoCliente;
			jTtoolBarDetalleAuxiliarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jTtoolBarDetalleVehiculoCliente;		
		}
		
		final JMenuBar jmenuBarDetalleVehiculoCliente=jmenuBarDetalleAuxiliarVehiculoCliente;
		final JToolBar jTtoolBarDetalleVehiculoCliente=jTtoolBarDetalleAuxiliarVehiculoCliente;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVehiculoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVehiculoCliente;
			processRunnable.jTableDatos=jTableDatosVehiculoCliente;
			processRunnable.jPanelCampos=jPanelCamposVehiculoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionVehiculoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesVehiculoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVehiculoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarVehiculoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVehiculoCliente;
			processRunnable.jTtoolBar=jTtoolBarVehiculoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVehiculoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVehiculoCliente ,jPanelParametrosReportesVehiculoCliente, jTableDatosVehiculoCliente,/*jScrollPanelDatosVehiculoCliente,*/jPanelCamposVehiculoCliente,jPanelPaginacionVehiculoCliente, /*jScrollPanelDatosEdicionVehiculoCliente,*/ jPanelAccionesVehiculoCliente,jPanelAccionesFormularioVehiculoCliente,jmenuBarVehiculoCliente,jmenuBarDetalleVehiculoCliente,jTtoolBarVehiculoCliente,jTtoolBarDetalleVehiculoCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVehiculoCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVehiculoCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVehiculoCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVehiculoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVehiculoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVehiculoCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVehiculoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVehiculoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVehiculoCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.vehiculoclienteConstantesFunciones.getsFinalQueryVehiculoCliente();
		String  finalQueryPaginacionTodos=this.vehiculoclienteConstantesFunciones.getsFinalQueryVehiculoCliente();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=VehiculoClienteConstantesFunciones.getArrayColumnasGlobalesNoVehiculoCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VehiculoClienteConstantesFunciones.getArrayColumnasGlobalesVehiculoCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VehiculoClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.vehiculoclientesEliminados= new ArrayList<VehiculoCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVehiculoCliente();
		
				///*VehiculoClienteSessionBean*/this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
			
			if(this.vehiculoclienteSessionBean==null) {
				this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=VehiculoClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VehiculoClienteConstantesFunciones.getClassesForeignKeysOfVehiculoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/vehiculocliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			vehiculoclientesAux= new ArrayList<VehiculoCliente>();
			
				
			vehiculoclienteLogic.setDatosCliente(this.datosCliente);
			vehiculoclienteLogic.setDatosDeep(this.datosDeep);
			vehiculoclienteLogic.setIsConDeep(true);
			
			
			vehiculoclienteLogic.getVehiculoClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					vehiculoclienteLogic.getTodosVehiculoClientes(finalQueryGlobal,pagination);
					
					//vehiculoclienteLogic.getTodosVehiculoClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(vehiculoclienteLogic.getVehiculoClientes()==null|| vehiculoclienteLogic.getVehiculoClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vehiculoclientesAux= new ArrayList<VehiculoCliente>();
							vehiculoclientesAux.addAll(vehiculoclienteLogic.getVehiculoClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculoclientesAux= new ArrayList<VehiculoCliente>();
							vehiculoclientesAux.addAll(vehiculoclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vehiculoclienteLogic.getTodosVehiculoClientes(finalQueryGlobal+"",this.pagination);												
							
							//vehiculoclienteLogic.getTodosVehiculoClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteVehiculoClientes("Todos",vehiculoclienteLogic.getVehiculoClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vehiculoclienteLogic.setVehiculoClientes(new ArrayList<VehiculoCliente>());					
							vehiculoclienteLogic.getVehiculoClientes().addAll(vehiculoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculoclientes=new ArrayList<VehiculoCliente>();
							vehiculoclientes.addAll(vehiculoclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVehiculoCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVehiculoCliente=this.idActual;
				
				} else if(this.idVehiculoClienteActual!=null && this.idVehiculoClienteActual!=0L) {
					idVehiculoCliente=idVehiculoClienteActual;
				}
				
					
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndicePorId(idVehiculoCliente);
				
				this.vehiculoclientes=new ArrayList<VehiculoCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					vehiculoclienteLogic.getEntity(idVehiculoCliente);
					
					//vehiculoclienteLogic.getEntityWithConnection(idVehiculoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vehiculoclienteLogic.setVehiculoClientes(new ArrayList<VehiculoCliente>());
					vehiculoclienteLogic.getVehiculoClientes().add(vehiculoclienteLogic.getVehiculoCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vehiculoclientes=new ArrayList<VehiculoCliente>();
					this.vehiculoclientes.add(vehiculocliente);
				}
				
				if(vehiculoclienteLogic.getVehiculoCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vehiculoclienteLogic.getVehiculoClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vehiculoclienteLogic.getVehiculoClientes()==null||vehiculoclienteLogic.getVehiculoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vehiculoclientes==null|| vehiculoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoclientesAux=new ArrayList<VehiculoCliente>();
						vehiculoclientesAux.addAll(vehiculoclienteLogic.getVehiculoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculoclientesAux=new ArrayList<VehiculoCliente>();
							vehiculoclientesAux.addAll(vehiculoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vehiculoclienteLogic.getVehiculoClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVehiculoClientes("FK_IdCliente",vehiculoclienteLogic.getVehiculoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVehiculoClientes("FK_IdCliente",vehiculoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoclienteLogic.setVehiculoClientes(new ArrayList<VehiculoCliente>());
						vehiculoclienteLogic.getVehiculoClientes().addAll(vehiculoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculoclientes=new ArrayList<VehiculoCliente>();
							vehiculoclientes.addAll(vehiculoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vehiculoclienteLogic.getVehiculoClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vehiculoclienteLogic.getVehiculoClientes()==null||vehiculoclienteLogic.getVehiculoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vehiculoclientes==null|| vehiculoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoclientesAux=new ArrayList<VehiculoCliente>();
						vehiculoclientesAux.addAll(vehiculoclienteLogic.getVehiculoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculoclientesAux=new ArrayList<VehiculoCliente>();
							vehiculoclientesAux.addAll(vehiculoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vehiculoclienteLogic.getVehiculoClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVehiculoClientes("FK_IdEmpresa",vehiculoclienteLogic.getVehiculoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVehiculoClientes("FK_IdEmpresa",vehiculoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoclienteLogic.setVehiculoClientes(new ArrayList<VehiculoCliente>());
						vehiculoclienteLogic.getVehiculoClientes().addAll(vehiculoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculoclientes=new ArrayList<VehiculoCliente>();
							vehiculoclientes.addAll(vehiculoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVehiculoCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVehiculoCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vehiculoclienteLogic.getVehiculoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vehiculoclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vehiculoclienteLogic.getVehiculoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vehiculoclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VehiculoCliente vehiculocliente) {
		Boolean permite=true;
		
		if(this.vehiculocliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VehiculoClienteConstantesFunciones.getOrderByListaVehiculoCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VehiculoClienteConstantesFunciones.getOrderByListaVehiculoCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VehiculoCliente vehiculocliente:vehiculoclienteLogic.getVehiculoClientes()) {
				if(vehiculocliente.getsType().equals(Constantes2.S_TOTALES)) {
					vehiculoclienteTotales=vehiculocliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VehiculoCliente vehiculocliente:this.vehiculoclientes) {
				if(vehiculocliente.getsType().equals(Constantes2.S_TOTALES)) {
					vehiculoclienteTotales=vehiculocliente;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.vehiculoclienteAux=new VehiculoCliente();
			this.vehiculoclienteAux.setsType(Constantes2.S_TOTALES);
			this.vehiculoclienteAux.setIsNew(false);
			this.vehiculoclienteAux.setIsChanged(false);
			this.vehiculoclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				VehiculoClienteConstantesFunciones.TotalizarValoresFilaVehiculoCliente(this.vehiculoclienteLogic.getVehiculoClientes(),this.vehiculoclienteAux);
				
				this.vehiculoclienteLogic.getVehiculoClientes().add(this.vehiculoclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VehiculoClienteConstantesFunciones.TotalizarValoresFilaVehiculoCliente(this.vehiculoclientes,this.vehiculoclienteAux);
				
				this.vehiculoclientes.add(this.vehiculoclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		vehiculoclienteTotales=new VehiculoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vehiculoclienteLogic.getVehiculoClientes().remove(vehiculoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vehiculoclientes.remove(vehiculoclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		vehiculoclienteTotales=new VehiculoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VehiculoCliente vehiculocliente:vehiculoclienteLogic.getVehiculoClientes()) {
				if(vehiculocliente.getsType().equals(Constantes2.S_TOTALES)) {
					vehiculoclienteTotales=vehiculocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VehiculoClienteConstantesFunciones.TotalizarValoresFilaVehiculoCliente(this.vehiculoclienteLogic.getVehiculoClientes(),vehiculoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VehiculoCliente vehiculocliente:this.vehiculoclientes) {
				if(vehiculocliente.getsType().equals(Constantes2.S_TOTALES)) {
					vehiculoclienteTotales=vehiculocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VehiculoClienteConstantesFunciones.TotalizarValoresFilaVehiculoCliente(this.vehiculoclientes,vehiculoclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVehiculoClientesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVehiculoClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVehiculoClientesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vehiculoclienteLogic.getVehiculoClientesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVehiculoClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vehiculoclienteLogic.getVehiculoClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosVehiculoCliente() {
		this.isPermisoTodoVehiculoCliente=false;
		this.isPermisoNuevoVehiculoCliente=false;
		this.isPermisoActualizarVehiculoCliente=false;
		this.isPermisoActualizarOriginalVehiculoCliente=false;
		this.isPermisoEliminarVehiculoCliente=false;
		this.isPermisoGuardarCambiosVehiculoCliente=false;
		this.isPermisoConsultaVehiculoCliente=false;
		this.isPermisoBusquedaVehiculoCliente=false;
		this.isPermisoReporteVehiculoCliente=false;		
		this.isPermisoOrdenVehiculoCliente=false;		
		this.isPermisoPaginacionMedioVehiculoCliente=false;		
		this.isPermisoPaginacionAltoVehiculoCliente=false;
		this.isPermisoPaginacionTodoVehiculoCliente=false;
		this.isPermisoCopiarVehiculoCliente=false;		
		this.isPermisoVerFormVehiculoCliente=false;		
		this.isPermisoDuplicarVehiculoCliente=false;		
		this.isPermisoOrdenVehiculoCliente=false;		
	}
	
	public void setPermisosUsuarioVehiculoCliente(Boolean isPermiso) {
		this.isPermisoTodoVehiculoCliente=isPermiso;
		this.isPermisoNuevoVehiculoCliente=isPermiso;
		this.isPermisoActualizarVehiculoCliente=isPermiso;
		this.isPermisoActualizarOriginalVehiculoCliente=isPermiso;
		this.isPermisoEliminarVehiculoCliente=isPermiso;
		this.isPermisoGuardarCambiosVehiculoCliente=isPermiso;
		this.isPermisoConsultaVehiculoCliente=isPermiso;
		this.isPermisoBusquedaVehiculoCliente=isPermiso;
		this.isPermisoReporteVehiculoCliente=isPermiso;
		this.isPermisoOrdenVehiculoCliente=isPermiso;		
		this.isPermisoPaginacionMedioVehiculoCliente=isPermiso;		
		this.isPermisoPaginacionAltoVehiculoCliente=isPermiso;		
		this.isPermisoPaginacionTodoVehiculoCliente=isPermiso;		
		this.isPermisoCopiarVehiculoCliente=isPermiso;		
		this.isPermisoVerFormVehiculoCliente=isPermiso;		
		this.isPermisoDuplicarVehiculoCliente=isPermiso;
		this.isPermisoOrdenVehiculoCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVehiculoCliente(Boolean isPermiso) {
		//this.isPermisoTodoVehiculoCliente=isPermiso;
		this.isPermisoNuevoVehiculoCliente=isPermiso;
		this.isPermisoActualizarVehiculoCliente=isPermiso;
		this.isPermisoActualizarOriginalVehiculoCliente=isPermiso;
		this.isPermisoEliminarVehiculoCliente=isPermiso;
		this.isPermisoGuardarCambiosVehiculoCliente=isPermiso;
		//this.isPermisoConsultaVehiculoCliente=isPermiso;
		//this.isPermisoBusquedaVehiculoCliente=isPermiso;
		//this.isPermisoReporteVehiculoCliente=isPermiso;
		//this.isPermisoOrdenVehiculoCliente=isPermiso;		
		//this.isPermisoPaginacionMedioVehiculoCliente=isPermiso;		
		//this.isPermisoPaginacionAltoVehiculoCliente=isPermiso;		
		//this.isPermisoPaginacionTodoVehiculoCliente=isPermiso;		
		//this.isPermisoCopiarVehiculoCliente=isPermiso;		
		//this.isPermisoDuplicarVehiculoCliente=isPermiso;
		//this.isPermisoOrdenVehiculoCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVehiculoClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VehiculoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebVehiculoCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVehiculoClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVehiculoClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVehiculoClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVehiculoClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVehiculoCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VehiculoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VehiculoClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVehiculoCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVehiculoCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVehiculoCliente=this.isPermisoActualizarVehiculoCliente;
			this.isPermisoEliminarVehiculoCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVehiculoCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVehiculoCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVehiculoCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVehiculoCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVehiculoCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVehiculoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVehiculoCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVehiculoCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVehiculoCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVehiculoCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVehiculoCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVehiculoCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVehiculoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVehiculoCliente.setToolTipText(this.jTableDatosVehiculoCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVehiculoCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVehiculoCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VehiculoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(VehiculoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioVehiculoCliente() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyVehiculoClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVehiculoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VehiculoClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyVehiculoClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyVehiculoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			VehiculoClienteParameterReturnGeneral vehiculoclienteReturnGeneral=new VehiculoClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.vehiculoclienteConstantesFunciones.cargarid_empresaVehiculoCliente)
					 || (this.esRecargarFks && this.vehiculoclienteConstantesFunciones.cargarid_empresaVehiculoCliente)) {

					if(!this.vehiculoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+vehiculoclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.vehiculoclienteConstantesFunciones.cargarid_clienteVehiculoCliente)
					 || (this.esRecargarFks && this.vehiculoclienteConstantesFunciones.cargarid_clienteVehiculoCliente)) {

					if(!this.vehiculoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+vehiculoclienteSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				vehiculoclienteReturnGeneral=vehiculoclienteLogic.cargarCombosLoteForeignKeyVehiculoCliente(finalQueryGlobalEmpresa,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=vehiculoclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=vehiculoclienteReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyVehiculoCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.vehiculoclienteSessionBean==null) {
				this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
			}

			if(!this.vehiculoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.vehiculoclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyVehiculoCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVehiculoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVehiculoCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVehiculoCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVehiculoCliente(VehiculoCliente vehiculocliente)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(vehiculocliente.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVehiculoCliente(VehiculoCliente vehiculocliente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(vehiculocliente.getCliente()!=null && !sTipoEvento.equals("id_clienteVehiculoCliente")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(vehiculocliente.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVehiculoCliente()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.vehiculoclienteConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVehiculoCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVehiculoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVehiculoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVehiculoCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVehiculoCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVehiculoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVehiculoCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public VehiculoClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VehiculoClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VehiculoClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean(); 
		this.vehiculoclienteConstantesFunciones=new VehiculoClienteConstantesFunciones(); 
		this.vehiculoclienteBean=new VehiculoCliente();//(this.vehiculoclienteConstantesFunciones); 		
		this.vehiculoclienteReturnGeneral=new VehiculoClienteParameterReturnGeneral(); 
		
		this.vehiculoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vehiculoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VehiculoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VehiculoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VehiculoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVehiculoCliente(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.vehiculoclienteConstantesFunciones=new VehiculoClienteConstantesFunciones(); 
			this.vehiculoclienteBean=new VehiculoCliente();//this.vehiculoclienteConstantesFunciones); 			
			this.vehiculoclienteReturnGeneral=new VehiculoClienteParameterReturnGeneral(); 
		
			VehiculoClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vehiculo Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.vehiculocliente=new VehiculoCliente();
			this.vehiculoclientes = new ArrayList<VehiculoCliente>();
			this.vehiculoclientesAux = new ArrayList<VehiculoCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic=new VehiculoClienteLogic();
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.vehiculoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.vehiculoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVehiculoCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVehiculoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVehiculoCliente);	
					}
					
					if(this.jInternalFrameImportacionVehiculoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVehiculoCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVehiculoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVehiculoCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVehiculoCliente);
				this.jInternalFrameDetalleFormVehiculoCliente.setVisible(false);
				this.jInternalFrameDetalleFormVehiculoCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVehiculoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVehiculoCliente);
					this.jInternalFrameReporteDinamicoVehiculoCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoVehiculoCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVehiculoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVehiculoCliente);
					this.jInternalFrameImportacionVehiculoCliente.setVisible(false);
					this.jInternalFrameImportacionVehiculoCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVehiculoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVehiculoCliente);
					this.jInternalFrameOrderByVehiculoCliente.setVisible(false);
					this.jInternalFrameOrderByVehiculoCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVehiculoClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VehiculoClienteConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.vehiculoclienteReturnGeneral=new VehiculoClienteParameterReturnGeneral();
			
			this.vehiculoclienteParameterGeneral=new VehiculoClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.vehiculoclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(VehiculoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VehiculoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vehiculoclienteSessionBean.getEsGuardarRelacionado(),this.vehiculoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VehiculoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vehiculoclienteSessionBean.getEsGuardarRelacionado(),this.vehiculoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoVehiculoCliente=false;
			this.isVisibilidadCeldaDuplicarVehiculoCliente=true;
			this.isVisibilidadCeldaCopiarVehiculoCliente=true;
			this.isVisibilidadCeldaVerFormVehiculoCliente=true;
			this.isVisibilidadCeldaOrdenVehiculoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=false;
			this.isVisibilidadCeldaModificarVehiculoCliente=false;
			this.isVisibilidadCeldaActualizarVehiculoCliente=false;
			this.isVisibilidadCeldaEliminarVehiculoCliente=false;
			this.isVisibilidadCeldaCancelarVehiculoCliente=false;
			this.isVisibilidadCeldaGuardarVehiculoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVehiculoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVehiculoCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVehiculoCliente(false);
			
			this.setPermisosUsuarioVehiculoCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.vehiculoclienteSessionBean.getEsGuardarRelacionado() && this.vehiculoclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVehiculoClienteClasesRelacionadas();
			}
			
			if(this.vehiculoclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVehiculoClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVehiculoCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVehiculoCliente();
			}
			
			if(!this.isPermisoBusquedaVehiculoCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVehiculoCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioVehiculoCliente,this.isPermisoPaginacionMedioVehiculoCliente,this.isPermisoPaginacionTodoVehiculoCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VehiculoClienteConstantesFunciones.getTiposSeleccionarVehiculoCliente());
				
				this.tiposColumnasSelect=VehiculoClienteConstantesFunciones.getTiposSeleccionarVehiculoCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVehiculoCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioVehiculoCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioVehiculoCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVehiculoCliente() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				vehiculoclienteImplementable= (VehiculoClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VehiculoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				vehiculoclienteImplementableHome= (VehiculoClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VehiculoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.vehiculoclientes= new ArrayList<VehiculoCliente>();
			this.vehiculoclientesEliminados= new ArrayList<VehiculoCliente>();
						
			this.isEsNuevoVehiculoCliente=false;
			this.esParaAccionDesdeFormularioVehiculoCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVehiculoCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVehiculoCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VehiculoClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VehiculoClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVehiculoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVehiculoCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVehiculoCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVehiculoCliente();
			}
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVehiculoCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVehiculoCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVehiculoCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVehiculoCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VehiculoCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVehiculoCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVehiculoCliente")) {
				iIndex=this.jInternalFrameDetalleFormVehiculoCliente.jTabbedPaneRelacionesVehiculoCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVehiculoCliente.jTabbedPaneRelacionesVehiculoCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVehiculoCliente();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyVehiculoCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVehiculoCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVehiculoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVehiculoClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVehiculoCliente();
		
		this.cargarCombosFrameForeignKeyVehiculoCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVehiculoCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVehiculoCliente();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoVehiculoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.vehiculoclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
			
			if(jTableDatosVehiculoCliente.getRowCount()>=1) {
				jTableDatosVehiculoCliente.removeRowSelectionInterval(0, jTableDatosVehiculoCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoVehiculoCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVehiculoCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVehiculoCliente(true);			
			//this.vehiculocliente=new VehiculoCliente();
			//this.vehiculocliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVehiculoCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVehiculoCliente() ;
			
			if(VehiculoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVehiculoCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.vehiculocliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);				
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
			if(this.vehiculoclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VehiculoCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVehiculoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVehiculoCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVehiculoCliente.getSelectedRows().length;			
			}
			
			vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVehiculoCliente--;			
				//VehiculoCliente vehiculoclienteAux= new VehiculoCliente();			
				//vehiculoclienteAux.setId(this.iIdNuevoVehiculoCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VehiculoCliente vehiculoclienteOrigen=new VehiculoCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VehiculoCliente vehiculoclienteOrigen : vehiculoclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							vehiculoclienteOrigen =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculoclienteOrigen =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVehiculoCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.vehiculocliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVehiculoCliente(vehiculoclienteOrigen,this.vehiculocliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vehiculoclienteLogic.getVehiculoClientes().add(this.vehiculoclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vehiculoclientes.add(this.vehiculoclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVehiculoCliente(false);
				
				this.jTableDatosVehiculoCliente.setRowSelectionInterval(this.getIndiceNuevoVehiculoCliente(), this.getIndiceNuevoVehiculoCliente());
				
				int iLastRow =  this.jTableDatosVehiculoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVehiculoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVehiculoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVehiculoCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();									
		
			VehiculoCliente vehiculoclienteOrigen=new VehiculoCliente();
			VehiculoCliente vehiculoclienteDestino=new VehiculoCliente();
				
			vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVehiculoCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || vehiculoclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVehiculoCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoclienteOrigen =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vehiculoclienteOrigen =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoclienteDestino =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vehiculoclienteDestino =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				vehiculoclienteOrigen =vehiculoclientesSeleccionados.get(0);
				vehiculoclienteDestino =vehiculoclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVehiculoCliente(vehiculoclienteOrigen,vehiculoclienteDestino,true,false);
				
				vehiculoclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vehiculoclienteDestino,vehiculoclienteLogic.getVehiculoClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vehiculoclienteDestino,vehiculoclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVehiculoCliente(false);
				
				//this.jTableDatosVehiculoCliente.setRowSelectionInterval(this.getIndiceNuevoVehiculoCliente(), this.getIndiceNuevoVehiculoCliente());
				
				int iLastRow =  this.jTableDatosVehiculoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVehiculoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVehiculoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVehiculoCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVehiculoCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVehiculoCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVehiculoCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVehiculoCliente.setVisible(!isVisible);
			this.jPanelPaginacionVehiculoCliente.setVisible(!isVisible);
			this.jPanelAccionesVehiculoCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVehiculoCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVehiculoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVehiculoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVehiculoCliente();
			
			this.abrirFrameOrderByVehiculoCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVehiculoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVehiculoCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVehiculoCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVehiculoCliente.isMaximum()) {
					this.jInternalFrameDetalleFormVehiculoCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVehiculoCliente.setSize(this.jInternalFrameDetalleFormVehiculoCliente.iWidthFormulario,this.jInternalFrameDetalleFormVehiculoCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVehiculoCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVehiculoCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVehiculoCliente.isMaximum()) {
						this.jInternalFrameDetalleFormVehiculoCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVehiculoCliente.jContentPaneDetalleVehiculoCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVehiculoCliente.jTabbedPaneRelacionesVehiculoCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVehiculoCliente.jContentPaneDetalleVehiculoCliente.getWidth(),VehiculoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVehiculoCliente.jTabbedPaneRelacionesVehiculoCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVehiculoCliente.jContentPaneDetalleVehiculoCliente.getWidth(),VehiculoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVehiculoCliente.jTabbedPaneRelacionesVehiculoCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVehiculoCliente.jContentPaneDetalleVehiculoCliente.getWidth(),VehiculoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVehiculoCliente.setVisible(true);
	        this.jInternalFrameDetalleFormVehiculoCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVehiculoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVehiculoCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVehiculoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVehiculoCliente,false,this);
				} else {
					this.jInternalFrameOrderByVehiculoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVehiculoCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVehiculoCliente);
				this.jInternalFrameOrderByVehiculoCliente.setVisible(false);
				this.jInternalFrameOrderByVehiculoCliente.setSelected(false);
				
				this.jInternalFrameOrderByVehiculoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVehiculoCliente"));
				
				this.inicializarActualizarBindingTablaOrderByVehiculoCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVehiculoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVehiculoCliente==null) {
				
				this.jInternalFrameImportacionVehiculoCliente=new ImportacionJInternalFrame(VehiculoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVehiculoCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVehiculoCliente);
				this.jInternalFrameImportacionVehiculoCliente.setVisible(false);
				this.jInternalFrameImportacionVehiculoCliente.setSelected(false);


				this.jInternalFrameImportacionVehiculoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVehiculoCliente"));
				this.jInternalFrameImportacionVehiculoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVehiculoCliente"));
				this.jInternalFrameImportacionVehiculoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVehiculoCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVehiculoCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVehiculoCliente==null) {
				this.jInternalFrameReporteDinamicoVehiculoCliente=new ReporteDinamicoJInternalFrame(VehiculoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVehiculoCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVehiculoCliente);
				this.jInternalFrameReporteDinamicoVehiculoCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoVehiculoCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVehiculoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVehiculoCliente"));
				this.jInternalFrameReporteDinamicoVehiculoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVehiculoCliente"));
				this.jInternalFrameReporteDinamicoVehiculoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVehiculoCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVehiculoCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVehiculoCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVehiculoCliente);
			
	       	this.jInternalFrameDetalleFormVehiculoCliente.setVisible(false);
	        this.jInternalFrameDetalleFormVehiculoCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormVehiculoCliente.dispose();
			//this.jInternalFrameDetalleFormVehiculoCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVehiculoCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVehiculoCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoVehiculoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVehiculoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVehiculoCliente.setVisible(true);
	        this.jInternalFrameImportacionVehiculoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVehiculoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVehiculoCliente.setVisible(true);
	        this.jInternalFrameOrderByVehiculoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVehiculoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVehiculoCliente.setVisible(false);
	        this.jInternalFrameOrderByVehiculoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVehiculoCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVehiculoCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoVehiculoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVehiculoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVehiculoCliente.setVisible(false);
	        this.jInternalFrameImportacionVehiculoCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVehiculoCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVehiculoCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVehiculoCliente(true);
			//this.isEsNuevoVehiculoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVehiculoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVehiculoCliente(false) ;
			
			if(vehiculoclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VehiculoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVehiculoCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVehiculoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVehiculoClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVehiculoCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVehiculoCliente(true);
			//this.isEsNuevoVehiculoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.vehiculocliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVehiculoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVehiculoCliente(false) ;
			
			if(VehiculoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVehiculoCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVehiculoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.vehiculoclienteConstantesFunciones.cargarid_clienteVehiculoCliente) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingVehiculoCliente(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVehiculoCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVehiculoCliente(false);
			
			//if(!this.isEsNuevoVehiculoCliente) {								
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				
			}
			
			if(this.permiteMantenimiento(this.vehiculocliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVehiculoCliente=true;
					this.inicializarActualizarBindingTablaVehiculoCliente(false);
					this.isEsNuevoVehiculoCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVehiculoCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVehiculoCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVehiculoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVehiculoCliente(false);
				
				this.habilitarDeshabilitarControlesVehiculoCliente(false);
			
												
				
				if(VehiculoClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVehiculoCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVehiculoClienteActionPerformed(evt,vehiculoclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVehiculoCliente(this.vehiculocliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVehiculoCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,vehiculoclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.vehiculocliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				this.vehiculocliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				this.vehiculocliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.vehiculocliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VehiculoClienteModel) this.jTableDatosVehiculoCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVehiculoCliente=true;
				this.inicializarActualizarBindingTablaVehiculoCliente(false);
				this.isEsNuevoVehiculoCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVehiculoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVehiculoCliente(false);
				
				this.habilitarDeshabilitarControlesVehiculoCliente(false);
				
				
				
				if(VehiculoClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVehiculoCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVehiculoCliente.getRowCount()>=1) {
				jTableDatosVehiculoCliente.removeRowSelectionInterval(0, jTableDatosVehiculoCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVehiculoCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVehiculoCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVehiculoCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVehiculoCliente(false) ;
			
			this.isEsNuevoVehiculoCliente=false;
			
			if(VehiculoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVehiculoCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVehiculoCliente(false);
				
				//SI ES MANUAL
				if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVehiculoCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVehiculoCliente--;			
			//VehiculoCliente vehiculoclienteAux= new VehiculoCliente();			
			//vehiculoclienteAux.setId(this.iIdNuevoVehiculoCliente);
			
			if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVehiculoCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
			
			this.vehiculocliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.vehiculoclienteLogic.getVehiculoClientes().add(this.vehiculoclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.vehiculoclientes.add(this.vehiculoclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVehiculoCliente(false);
			
			this.jTableDatosVehiculoCliente.setRowSelectionInterval(this.getIndiceNuevoVehiculoCliente(), this.getIndiceNuevoVehiculoCliente());
			
			int iLastRow =  this.jTableDatosVehiculoCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVehiculoCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVehiculoCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVehiculoCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVehiculoCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVehiculoCliente(false);
			
			//SI ES MANUAL
			if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVehiculoCliente();
			}
			
			//this.abrirFrameTreeVehiculoCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Vehiculo ClienteS ?", "MANTENIMIENTO DE Vehiculo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionVehiculoCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralVehiculoCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.vehiculoclienteReturnGeneral=vehiculoclienteLogic.procesarImportacionVehiculoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.vehiculoclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarVehiculoClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVehiculoCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVehiculoCliente.setFileImportacion(this.jInternalFrameImportacionVehiculoCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVehiculoCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVehiculoCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVehiculoCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVehiculoCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();		

		vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VehiculoClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VehiculoClienteBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteVehiculoClientes("Todos",vehiculoclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoClienteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoClienteConstantesFunciones.LABEL_MARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoClienteConstantesFunciones.LABEL_MODELO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_delo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_delo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_delo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_delo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoClienteConstantesFunciones.LABEL_PLACA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoClienteConstantesFunciones.LABEL_ANIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_io_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_io_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_io_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_io_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Prendado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Prendado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Prendado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Prendado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorAvaluo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorAvaluo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorAvaluo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorAvaluo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoVehiculoCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoria="marca";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_MODELO:
					sNombreCampoCategoria="modelo";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_PLACA:
					sNombreCampoCategoria="placa";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_ANIO:
					sNombreCampoCategoria="anio";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO:
					sNombreCampoCategoria="es_prendado";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO:
					sNombreCampoCategoria="valor_avaluo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoriaValor="marca";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_MODELO:
					sNombreCampoCategoriaValor="modelo";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_PLACA:
					sNombreCampoCategoriaValor="placa";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_ANIO:
					sNombreCampoCategoriaValor="anio";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO:
					sNombreCampoCategoriaValor="es_prendado";
					break;

				case VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO:
					sNombreCampoCategoriaValor="valor_avaluo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case VehiculoClienteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case VehiculoClienteConstantesFunciones.LABEL_MARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"marca");
					break;

				case VehiculoClienteConstantesFunciones.LABEL_MODELO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modelo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"modelo");
					break;

				case VehiculoClienteConstantesFunciones.LABEL_PLACA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Placa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"placa");
					break;

				case VehiculoClienteConstantesFunciones.LABEL_ANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"anio");
					break;

				case VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Prendado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_prendado");
					break;

				case VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Avaluo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_avaluo");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();		
		
		vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculocliente";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("VehiculoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VehiculoCliente vehiculocliente:vehiculoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculocliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(VehiculoCliente vehiculocliente:vehiculoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculocliente.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoClienteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(VehiculoCliente vehiculocliente:vehiculoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculocliente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoClienteConstantesFunciones.LABEL_MARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_MARCA);
					iRow++;

					for(VehiculoCliente vehiculocliente:vehiculoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculocliente.getmarca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoClienteConstantesFunciones.LABEL_MODELO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_MODELO);
					iRow++;

					for(VehiculoCliente vehiculocliente:vehiculoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculocliente.getmodelo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoClienteConstantesFunciones.LABEL_PLACA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_PLACA);
					iRow++;

					for(VehiculoCliente vehiculocliente:vehiculoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculocliente.getplaca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoClienteConstantesFunciones.LABEL_ANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_ANIO);
					iRow++;

					for(VehiculoCliente vehiculocliente:vehiculoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculocliente.getanio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO);
					iRow++;

					for(VehiculoCliente vehiculocliente:vehiculoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculocliente.getes_prendado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO);
					iRow++;

					for(VehiculoCliente vehiculocliente:vehiculoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculocliente.getvalor_avaluo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelVehiculoCliente(row);				
			//	iRow++;
			//}				
			
			//for(VehiculoCliente vehiculoclienteAux:vehiculoclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVehiculoCliente(vehiculoclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVehiculoCliente(false);
			
			//SI ES MANUAL
			if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVehiculoCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVehiculoCliente(false);
			
			//SI ES MANUAL
			if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVehiculoCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVehiculoCliente(false);
			
			//SI ES MANUAL
			if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVehiculoCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVehiculoCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVehiculoCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVehiculoCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVehiculoCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVehiculoCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVehiculoCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosVehiculoCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosVehiculoCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVehiculoCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVehiculoCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVehiculoCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVehiculoCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVehiculoCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVehiculoCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVehiculoCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVehiculoCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVehiculoCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVehiculoCliente();
		
		this.inicializarActualizarBindingBotonesManualVehiculoCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVehiculoCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVehiculoCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVehiculoCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVehiculoCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVehiculoCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVehiculoCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVehiculoCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxPostAccionNuevoVehiculoCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxPostAccionSinCerrarVehiculoCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxPostAccionSinMensajeVehiculoCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVehiculoCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVehiculoCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVehiculoCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
				this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxPostAccionNuevoVehiculoCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxPostAccionSinCerrarVehiculoCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxPostAccionSinMensajeVehiculoCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVehiculoCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVehiculoCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVehiculoCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVehiculoCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVehiculoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVehiculoCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVehiculoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVehiculoCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVehiculoCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVehiculoCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVehiculoCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVehiculoCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVehiculoCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVehiculoCliente() throws Exception {
		try	{
			if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVehiculoCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVehiculoCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVehiculoCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVehiculoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVehiculoCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVehiculoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVehiculoCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVehiculoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVehiculoCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVehiculoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVehiculoCliente.addItem(reporte);
			}
			
			
			if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVehiculoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVehiculoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVehiculoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVehiculoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVehiculoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVehiculoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVehiculoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVehiculoCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVehiculoCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVehiculoCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVehiculoCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVehiculoCliente!=null) {
				this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVehiculoCliente!=null) {
				this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVehiculoCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVehiculoCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VehiculoClienteConstantesFunciones.getTiposSeleccionarVehiculoCliente(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VehiculoClienteConstantesFunciones.getTiposSeleccionarVehiculoCliente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VehiculoClienteConstantesFunciones.getTiposSeleccionarVehiculoCliente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVehiculoCliente.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVehiculoCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteVehiculoCliente.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteVehiculoCliente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVehiculoCliente(Boolean esInicializar) throws Exception {				
		if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVehiculoCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVehiculoCliente() throws Exception {
		this.inicializarActualizarBindingTablaVehiculoCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVehiculoCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVehiculoClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVehiculoCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=vehiculoclienteLogic.getVehiculoClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=vehiculoclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVehiculoCliente.setModel(new VehiculoClienteModel(this.vehiculoclienteLogic.getVehiculoClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVehiculoCliente.setModel(new VehiculoClienteModel(this.vehiculoclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVehiculoCliente!=null && this.jInternalFrameOrderByVehiculoCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVehiculoCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO,vehiculoclienteConstantesFunciones.resaltarSeleccionarVehiculoCliente,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO,vehiculoclienteConstantesFunciones.resaltarSeleccionarVehiculoCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_ID));

		if(this.vehiculoclienteConstantesFunciones.mostraridVehiculoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vehiculoclienteConstantesFunciones.resaltaridVehiculoCliente,this.vehiculoclienteConstantesFunciones.activaridVehiculoCliente,iSizeTabla,this,true,"idVehiculoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoclienteConstantesFunciones.resaltaridVehiculoCliente,this.vehiculoclienteConstantesFunciones.activaridVehiculoCliente,this,true,"idVehiculoCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.vehiculoclienteConstantesFunciones.mostrarid_empresaVehiculoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.vehiculoclienteConstantesFunciones.resaltarid_empresaVehiculoCliente,this,this.vehiculoclienteConstantesFunciones.activarid_empresaVehiculoCliente,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.vehiculoclienteConstantesFunciones.resaltarid_empresaVehiculoCliente,this,this.vehiculoclienteConstantesFunciones.activarid_empresaVehiculoCliente,false,"id_empresaVehiculoCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE));

		if(this.vehiculoclienteConstantesFunciones.mostrarid_clienteVehiculoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.vehiculoclienteConstantesFunciones.resaltarid_clienteVehiculoCliente,this,this.vehiculoclienteConstantesFunciones.activarid_clienteVehiculoCliente,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.vehiculoclienteConstantesFunciones.resaltarid_clienteVehiculoCliente,this,this.vehiculoclienteConstantesFunciones.activarid_clienteVehiculoCliente,true,"id_clienteVehiculoCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_CODIGO));

		if(this.vehiculoclienteConstantesFunciones.mostrarcodigoVehiculoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoClienteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vehiculoclienteConstantesFunciones.resaltarcodigoVehiculoCliente,this.vehiculoclienteConstantesFunciones.activarcodigoVehiculoCliente,iSizeTabla,this,true,"codigoVehiculoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoclienteConstantesFunciones.resaltarcodigoVehiculoCliente,this.vehiculoclienteConstantesFunciones.activarcodigoVehiculoCliente,this,true,"codigoVehiculoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_MARCA));

		if(this.vehiculoclienteConstantesFunciones.mostrarmarcaVehiculoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoClienteConstantesFunciones.LABEL_MARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vehiculoclienteConstantesFunciones.resaltarmarcaVehiculoCliente,this.vehiculoclienteConstantesFunciones.activarmarcaVehiculoCliente,iSizeTabla,this,true,"marcaVehiculoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoclienteConstantesFunciones.resaltarmarcaVehiculoCliente,this.vehiculoclienteConstantesFunciones.activarmarcaVehiculoCliente,this,true,"marcaVehiculoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_MODELO));

		if(this.vehiculoclienteConstantesFunciones.mostrarmodeloVehiculoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoClienteConstantesFunciones.LABEL_MODELO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vehiculoclienteConstantesFunciones.resaltarmodeloVehiculoCliente,this.vehiculoclienteConstantesFunciones.activarmodeloVehiculoCliente,iSizeTabla,this,true,"modeloVehiculoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoclienteConstantesFunciones.resaltarmodeloVehiculoCliente,this.vehiculoclienteConstantesFunciones.activarmodeloVehiculoCliente,this,true,"modeloVehiculoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_PLACA));

		if(this.vehiculoclienteConstantesFunciones.mostrarplacaVehiculoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoClienteConstantesFunciones.LABEL_PLACA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vehiculoclienteConstantesFunciones.resaltarplacaVehiculoCliente,this.vehiculoclienteConstantesFunciones.activarplacaVehiculoCliente,iSizeTabla,this,true,"placaVehiculoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoclienteConstantesFunciones.resaltarplacaVehiculoCliente,this.vehiculoclienteConstantesFunciones.activarplacaVehiculoCliente,this,true,"placaVehiculoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_ANIO));

		if(this.vehiculoclienteConstantesFunciones.mostraranioVehiculoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoClienteConstantesFunciones.LABEL_ANIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vehiculoclienteConstantesFunciones.resaltaranioVehiculoCliente,this.vehiculoclienteConstantesFunciones.activaranioVehiculoCliente,iSizeTabla,this,true,"anioVehiculoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoclienteConstantesFunciones.resaltaranioVehiculoCliente,this.vehiculoclienteConstantesFunciones.activaranioVehiculoCliente,this,true,"anioVehiculoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO));

		if(this.vehiculoclienteConstantesFunciones.mostrares_prendadoVehiculoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.vehiculoclienteConstantesFunciones.resaltares_prendadoVehiculoCliente,this.vehiculoclienteConstantesFunciones.activares_prendadoVehiculoCliente,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.vehiculoclienteConstantesFunciones.resaltares_prendadoVehiculoCliente,this.vehiculoclienteConstantesFunciones.activares_prendadoVehiculoCliente,this,true,"es_prendadoVehiculoCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO));

		if(this.vehiculoclienteConstantesFunciones.mostrarvalor_avaluoVehiculoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vehiculoclienteConstantesFunciones.resaltarvalor_avaluoVehiculoCliente,this.vehiculoclienteConstantesFunciones.activarvalor_avaluoVehiculoCliente,iSizeTabla,this,true,"valor_avaluoVehiculoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoclienteConstantesFunciones.resaltarvalor_avaluoVehiculoCliente,this.vehiculoclienteConstantesFunciones.activarvalor_avaluoVehiculoCliente,this,true,"valor_avaluoVehiculoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VehiculoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vehiculoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vehiculoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVehiculoCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vehiculoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vehiculoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVehiculoCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.vehiculoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.vehiculoclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVehiculoCliente.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosVehiculoCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVehiculoCliente.moveColumn(this.jTableDatosVehiculoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVehiculoCliente.moveColumn(this.jTableDatosVehiculoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVehiculoCliente.moveColumn(this.jTableDatosVehiculoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVehiculoCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVehiculoCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVehiculoCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVehiculoCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVehiculoCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVehiculoCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVehiculoCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVehiculoCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=vehiculoclienteLogic.getVehiculoClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=vehiculoclientes.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosVehiculoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVehiculoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVehiculoCliente();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoVehiculoCliente=false;
					
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
				if(this.vehiculoclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVehiculoCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVehiculoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVehiculoCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.vehiculocliente.getsType().equals("DUPLICADO")
				   || this.vehiculocliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVehiculoCliente=true;
				
				} else {
					this.isEsNuevoVehiculoCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.vehiculocliente.getId()>=0 && !this.vehiculocliente.getIsNew()) {						
						this.isEsNuevoVehiculoCliente=false;
						
					} else {
						this.isEsNuevoVehiculoCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVehiculoCliente(esRelaciones);						
				
				this.seleccionarVehiculoCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.vehiculocliente.getId()<0) {
					this.isEsNuevoVehiculoCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVehiculoCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVehiculoCliente(evt,rowIndex);
				}	
				
				if(this.vehiculoclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VehiculoCliente: " + this.dDif); 
					}
				}								
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVehiculoCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.vehiculocliente)) {
					if(this.vehiculocliente.getId()>0) {
						this.vehiculocliente.setIsDeleted(true);
						
						this.vehiculoclientesEliminados.add(this.vehiculocliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vehiculoclienteLogic.getVehiculoClientes().remove(this.vehiculocliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vehiculoclientes.remove(this.vehiculocliente);				
					}
					
					
					((VehiculoClienteModel) this.jTableDatosVehiculoCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVehiculoCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVehiculoCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVehiculoCliente) {
			
			if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVehiculoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVehiculoCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVehiculoCliente(this.vehiculocliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.vehiculoclienteConstantesFunciones.cargarid_empresaVehiculoCliente || this.vehiculoclienteConstantesFunciones.event_dependid_empresaVehiculoCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.vehiculocliente.getid_empresa());
									//this.inicializarActualizarBindingVehiculoCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(vehiculocliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(vehiculocliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.vehiculocliente.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.vehiculoclienteConstantesFunciones.cargarid_clienteVehiculoCliente || this.vehiculoclienteConstantesFunciones.event_dependid_clienteVehiculoCliente) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.vehiculocliente.getid_cliente());
									//this.inicializarActualizarBindingVehiculoCliente(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(vehiculocliente.getCliente()!=null) {
							this.clientesForeignKey.add(vehiculocliente.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.vehiculocliente.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVehiculoCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVehiculoCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVehiculoCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVehiculoCliente(VehiculoCliente vehiculocliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVehiculoCliente(vehiculocliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVehiculoCliente(VehiculoCliente vehiculocliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVehiculoCliente(vehiculocliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVehiculoCliente(vehiculocliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVehiculoCliente(vehiculocliente);
	}
	
	public void setVariablesObjetoActualToFormularioVehiculoCliente(VehiculoCliente vehiculocliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.setText(vehiculocliente.getId().toString());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldcodigoVehiculoCliente.setText(vehiculocliente.getcodigo());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamarcaVehiculoCliente.setText(vehiculocliente.getmarca());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamodeloVehiculoCliente.setText(vehiculocliente.getmodelo());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldplacaVehiculoCliente.setText(vehiculocliente.getplaca());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldanioVehiculoCliente.setText(vehiculocliente.getanio().toString());
			this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxes_prendadoVehiculoCliente.setSelected(vehiculocliente.getes_prendado());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldvalor_avaluoVehiculoCliente.setText(vehiculocliente.getvalor_avaluo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VehiculoCliente vehiculoclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,vehiculoclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VehiculoCliente vehiculoclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				vehiculoclienteLocal=this.vehiculocliente;
			} else {
				vehiculoclienteLocal=this.vehiculoclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(vehiculoclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVehiculoCliente(vehiculoclienteLocal,true);
					
					if(vehiculoclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(vehiculoclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(vehiculoclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVehiculoCliente(VehiculoCliente vehiculocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVehiculoCliente(vehiculocliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(vehiculocliente);
	}
	
	public void setVariablesFormularioToObjetoActualVehiculoCliente(VehiculoCliente vehiculocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVehiculoCliente(vehiculocliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVehiculoCliente(VehiculoCliente vehiculocliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.getText()==null || this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.getText()=="" || this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.setText("0");
			}

			if(conColumnasBase) {vehiculocliente.setId(Long.parseLong(this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelIdVehiculoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculocliente.setcodigo(this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldcodigoVehiculoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoClienteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelcodigoVehiculoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculocliente.setmarca(this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamarcaVehiculoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoClienteConstantesFunciones.LABEL_MARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelmarcaVehiculoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculocliente.setmodelo(this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamodeloVehiculoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoClienteConstantesFunciones.LABEL_MODELO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelmodeloVehiculoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculocliente.setplaca(this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldplacaVehiculoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoClienteConstantesFunciones.LABEL_PLACA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelplacaVehiculoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculocliente.setanio(Integer.parseInt(this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldanioVehiculoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoClienteConstantesFunciones.LABEL_ANIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelanioVehiculoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculocliente.setes_prendado(this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxes_prendadoVehiculoCliente.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabeles_prendadoVehiculoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculocliente.setvalor_avaluo(Double.parseDouble(this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldvalor_avaluoVehiculoCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculoCliente.jLabelvalor_avaluoVehiculoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVehiculoCliente(VehiculoCliente vehiculoclienteBean,VehiculoCliente vehiculocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && vehiculoclienteBean.getid_cliente()!=null && !vehiculoclienteBean.getid_cliente().equals(-1L))) {vehiculocliente.setid_cliente(vehiculoclienteBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVehiculoCliente(VehiculoCliente vehiculoclienteOrigen,VehiculoCliente vehiculocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vehiculoclienteOrigen.getId()!=null && !vehiculoclienteOrigen.getId().equals(0L))) {vehiculocliente.setId(vehiculoclienteOrigen.getId());}}
			if(conDefault || (!conDefault && vehiculoclienteOrigen.getid_cliente()!=null && !vehiculoclienteOrigen.getid_cliente().equals(-1L))) {vehiculocliente.setid_cliente(vehiculoclienteOrigen.getid_cliente());}
			if(conDefault || (!conDefault && vehiculoclienteOrigen.getcodigo()!=null && !vehiculoclienteOrigen.getcodigo().equals(""))) {vehiculocliente.setcodigo(vehiculoclienteOrigen.getcodigo());}
			if(conDefault || (!conDefault && vehiculoclienteOrigen.getmarca()!=null && !vehiculoclienteOrigen.getmarca().equals(""))) {vehiculocliente.setmarca(vehiculoclienteOrigen.getmarca());}
			if(conDefault || (!conDefault && vehiculoclienteOrigen.getmodelo()!=null && !vehiculoclienteOrigen.getmodelo().equals(""))) {vehiculocliente.setmodelo(vehiculoclienteOrigen.getmodelo());}
			if(conDefault || (!conDefault && vehiculoclienteOrigen.getplaca()!=null && !vehiculoclienteOrigen.getplaca().equals(""))) {vehiculocliente.setplaca(vehiculoclienteOrigen.getplaca());}
			if(conDefault || (!conDefault && vehiculoclienteOrigen.getanio()!=null && !vehiculoclienteOrigen.getanio().equals(0))) {vehiculocliente.setanio(vehiculoclienteOrigen.getanio());}
			if(conDefault || (!conDefault && vehiculoclienteOrigen.getes_prendado()!=null && !vehiculoclienteOrigen.getes_prendado().equals(false))) {vehiculocliente.setes_prendado(vehiculoclienteOrigen.getes_prendado());}
			if(conDefault || (!conDefault && vehiculoclienteOrigen.getvalor_avaluo()!=null && !vehiculoclienteOrigen.getvalor_avaluo().equals(0.0))) {vehiculocliente.setvalor_avaluo(vehiculoclienteOrigen.getvalor_avaluo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVehiculoCliente(VehiculoCliente vehiculocliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.setText(vehiculocliente.getId().toString());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldcodigoVehiculoCliente.setText(vehiculocliente.getcodigo());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamarcaVehiculoCliente.setText(vehiculocliente.getmarca());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamodeloVehiculoCliente.setText(vehiculocliente.getmodelo());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldplacaVehiculoCliente.setText(vehiculocliente.getplaca());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldanioVehiculoCliente.setText(vehiculocliente.getanio().toString());
			this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxes_prendadoVehiculoCliente.setSelected(vehiculocliente.getes_prendado());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldvalor_avaluoVehiculoCliente.setText(vehiculocliente.getvalor_avaluo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVehiculoCliente(VehiculoClienteBean vehiculoclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.setText(vehiculoclienteBean.getId().toString());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldcodigoVehiculoCliente.setText(vehiculoclienteBean.getcodigo());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamarcaVehiculoCliente.setText(vehiculoclienteBean.getmarca());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamodeloVehiculoCliente.setText(vehiculoclienteBean.getmodelo());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldplacaVehiculoCliente.setText(vehiculoclienteBean.getplaca());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldanioVehiculoCliente.setText(vehiculoclienteBean.getanio().toString());
			this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxes_prendadoVehiculoCliente.setSelected(vehiculoclienteBean.getes_prendado());
			this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldvalor_avaluoVehiculoCliente.setText(vehiculoclienteBean.getvalor_avaluo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVehiculoCliente(VehiculoClienteParameterReturnGeneral vehiculoclienteReturnGeneral,VehiculoClienteBean vehiculoclienteBean,Boolean conDefault) throws Exception { 
		try {
			VehiculoCliente vehiculoclienteLocal=new VehiculoCliente();
			
			vehiculoclienteLocal=vehiculoclienteReturnGeneral.getVehiculoCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vehiculoclienteLocal.getId()!=null && !vehiculoclienteLocal.getId().equals(0L))) {vehiculoclienteBean.setId(vehiculoclienteLocal.getId());}}
			if(conDefault || (!conDefault && vehiculoclienteLocal.getid_cliente()!=null && !vehiculoclienteLocal.getid_cliente().equals(-1L))) {vehiculoclienteBean.setid_cliente(vehiculoclienteLocal.getid_cliente());}
			if(conDefault || (!conDefault && vehiculoclienteLocal.getcodigo()!=null && !vehiculoclienteLocal.getcodigo().equals(""))) {vehiculoclienteBean.setcodigo(vehiculoclienteLocal.getcodigo());}
			if(conDefault || (!conDefault && vehiculoclienteLocal.getmarca()!=null && !vehiculoclienteLocal.getmarca().equals(""))) {vehiculoclienteBean.setmarca(vehiculoclienteLocal.getmarca());}
			if(conDefault || (!conDefault && vehiculoclienteLocal.getmodelo()!=null && !vehiculoclienteLocal.getmodelo().equals(""))) {vehiculoclienteBean.setmodelo(vehiculoclienteLocal.getmodelo());}
			if(conDefault || (!conDefault && vehiculoclienteLocal.getplaca()!=null && !vehiculoclienteLocal.getplaca().equals(""))) {vehiculoclienteBean.setplaca(vehiculoclienteLocal.getplaca());}
			if(conDefault || (!conDefault && vehiculoclienteLocal.getanio()!=null && !vehiculoclienteLocal.getanio().equals(0))) {vehiculoclienteBean.setanio(vehiculoclienteLocal.getanio());}
			if(conDefault || (!conDefault && vehiculoclienteLocal.getes_prendado()!=null && !vehiculoclienteLocal.getes_prendado().equals(false))) {vehiculoclienteBean.setes_prendado(vehiculoclienteLocal.getes_prendado());}
			if(conDefault || (!conDefault && vehiculoclienteLocal.getvalor_avaluo()!=null && !vehiculoclienteLocal.getvalor_avaluo().equals(0.0))) {vehiculoclienteBean.setvalor_avaluo(vehiculoclienteLocal.getvalor_avaluo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVehiculoClienteGenerico(Long idVehiculoClienteSeleccionado,JComboBox jComboBoxVehiculoCliente,List<VehiculoCliente> vehiculoclientesLocal)throws Exception {
		try {
			VehiculoCliente  vehiculoclienteTemp=null;

			for(VehiculoCliente vehiculoclienteAux:vehiculoclientesLocal) {
				if(vehiculoclienteAux.getId()!=null && vehiculoclienteAux.getId().equals(idVehiculoClienteSeleccionado)) {
					vehiculoclienteTemp=vehiculoclienteAux;
					break;
				}
			}

			jComboBoxVehiculoCliente.setSelectedItem(vehiculoclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVehiculoClienteGenerico(JComboBox jComboBoxVehiculoCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVehiculoCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVehiculoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVehiculoCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVehiculoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vehiculocliente=(VehiculoCliente) vehiculoclienteLogic.getVehiculoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vehiculocliente =(VehiculoCliente) vehiculoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!vehiculocliente.getIsNew() && !vehiculocliente.getIsChanged() && !vehiculocliente.getIsDeleted()) {
				sDescripcion=vehiculocliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=vehiculocliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!vehiculocliente.getIsNew() && !vehiculocliente.getIsChanged() && !vehiculocliente.getIsDeleted()) {
				sDescripcion=vehiculocliente.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=vehiculocliente.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VehiculoCliente vehiculoclienteRow=new VehiculoCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vehiculoclienteRow=(VehiculoCliente) vehiculoclienteLogic.getVehiculoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vehiculoclienteRow=(VehiculoCliente) vehiculoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVehiculoCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVehiculoCliente.setVisible((this.isVisibilidadCeldaNuevoVehiculoCliente && this.isPermisoNuevoVehiculoCliente));			
			this.jButtonDuplicarVehiculoCliente.setVisible((this.isVisibilidadCeldaDuplicarVehiculoCliente && this.isPermisoDuplicarVehiculoCliente));			
			this.jButtonCopiarVehiculoCliente.setVisible((this.isVisibilidadCeldaCopiarVehiculoCliente && this.isPermisoCopiarVehiculoCliente));
			this.jButtonVerFormVehiculoCliente.setVisible((this.isVisibilidadCeldaVerFormVehiculoCliente && this.isPermisoVerFormVehiculoCliente));
			
			this.jButtonAbrirOrderByVehiculoCliente.setVisible((this.isVisibilidadCeldaOrdenVehiculoCliente && this.isPermisoOrdenVehiculoCliente));			
			
			this.jButtonNuevoRelacionesVehiculoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente && this.isPermisoNuevoVehiculoCliente));			
			this.jButtonNuevoGuardarCambiosVehiculoCliente.setVisible((this.isVisibilidadCeldaNuevoVehiculoCliente && this.isPermisoNuevoVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente));
			
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonModificarVehiculoCliente.setVisible((this.isVisibilidadCeldaModificarVehiculoCliente && this.isPermisoActualizarVehiculoCliente));	
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonActualizarVehiculoCliente.setVisible((this.isVisibilidadCeldaActualizarVehiculoCliente && this.isPermisoActualizarVehiculoCliente));	
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonEliminarVehiculoCliente.setVisible((this.isVisibilidadCeldaEliminarVehiculoCliente && this.isPermisoEliminarVehiculoCliente));
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonCancelarVehiculoCliente.setVisible(this.isVisibilidadCeldaCancelarVehiculoCliente);							
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosVehiculoCliente.setVisible((this.isVisibilidadCeldaGuardarVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaVehiculoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaNuevoVehiculoCliente && this.isPermisoNuevoVehiculoCliente));						
			this.jButtonDuplicarToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaDuplicarVehiculoCliente && this.isPermisoDuplicarVehiculoCliente));						
			this.jButtonCopiarToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaCopiarVehiculoCliente && this.isPermisoCopiarVehiculoCliente));			
			this.jButtonVerFormToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaVerFormVehiculoCliente && this.isPermisoVerFormVehiculoCliente));			
			this.jButtonAbrirOrderByToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaOrdenVehiculoCliente && this.isPermisoOrdenVehiculoCliente));
			this.jButtonNuevoRelacionesToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente && this.isPermisoNuevoVehiculoCliente));			
			this.jButtonNuevoGuardarCambiosToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaNuevoVehiculoCliente && this.isPermisoNuevoVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente));			
			
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonModificarToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaModificarVehiculoCliente && this.isPermisoActualizarVehiculoCliente));	
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonActualizarToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaActualizarVehiculoCliente  && this.isPermisoActualizarVehiculoCliente));	
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonEliminarToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaEliminarVehiculoCliente && this.isPermisoEliminarVehiculoCliente));
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonCancelarToolBarVehiculoCliente.setVisible(this.isVisibilidadCeldaCancelarVehiculoCliente);				
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaGuardarVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVehiculoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVehiculoCliente.setVisible((this.isVisibilidadCeldaNuevoVehiculoCliente && this.isPermisoNuevoVehiculoCliente));			
			this.jMenuItemDuplicarVehiculoCliente.setVisible((this.isVisibilidadCeldaDuplicarVehiculoCliente && this.isPermisoDuplicarVehiculoCliente));			
			this.jMenuItemCopiarVehiculoCliente.setVisible((this.isVisibilidadCeldaCopiarVehiculoCliente && this.isPermisoCopiarVehiculoCliente));			
			this.jMenuItemVerFormVehiculoCliente.setVisible((this.isVisibilidadCeldaVerFormVehiculoCliente && this.isPermisoVerFormVehiculoCliente));			
			this.jMenuItemAbrirOrderByVehiculoCliente.setVisible((this.isVisibilidadCeldaOrdenVehiculoCliente && this.isPermisoOrdenVehiculoCliente));			
			//this.jMenuItemMostrarOcultarVehiculoCliente.setVisible((this.isVisibilidadCeldaOrdenVehiculoCliente && this.isPermisoOrdenVehiculoCliente));
			this.jMenuItemDetalleAbrirOrderByVehiculoCliente.setVisible((this.isVisibilidadCeldaOrdenVehiculoCliente && this.isPermisoOrdenVehiculoCliente));			
			//this.jMenuItemDetalleMostrarOcultarVehiculoCliente.setVisible((this.isVisibilidadCeldaOrdenVehiculoCliente && this.isPermisoOrdenVehiculoCliente));			
			this.jMenuItemNuevoRelacionesVehiculoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente && this.isPermisoNuevoVehiculoCliente));			
			this.jMenuItemNuevoGuardarCambiosVehiculoCliente.setVisible((this.isVisibilidadCeldaNuevoVehiculoCliente && this.isPermisoNuevoVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente));									
			
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemModificarVehiculoCliente.setVisible((this.isVisibilidadCeldaModificarVehiculoCliente && this.isPermisoActualizarVehiculoCliente));	
			this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemActualizarVehiculoCliente.setVisible((this.isVisibilidadCeldaActualizarVehiculoCliente && this.isPermisoActualizarVehiculoCliente));	
			this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemEliminarVehiculoCliente.setVisible((this.isVisibilidadCeldaEliminarVehiculoCliente && this.isPermisoEliminarVehiculoCliente));
			this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemCancelarVehiculoCliente.setVisible(this.isVisibilidadCeldaCancelarVehiculoCliente);				
			}
			
			this.jMenuItemGuardarCambiosVehiculoCliente.setVisible((this.isVisibilidadCeldaGuardarVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente));						
			this.jMenuItemGuardarCambiosTablaVehiculoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVehiculoCliente=this.jButtonNuevoVehiculoCliente.isVisible();
			this.isVisibilidadCeldaDuplicarVehiculoCliente=this.jButtonDuplicarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaCopiarVehiculoCliente=this.jButtonCopiarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaVerFormVehiculoCliente=this.jButtonVerFormVehiculoCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenVehiculoCliente=this.jButtonAbrirOrderByVehiculoCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=this.jButtonNuevoRelacionesVehiculoCliente.isVisible();
			this.isVisibilidadCeldaModificarVehiculoCliente=this.jButtonModificarVehiculoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			this.isVisibilidadCeldaActualizarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jButtonActualizarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaEliminarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jButtonEliminarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaCancelarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jButtonCancelarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaGuardarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosVehiculoCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=this.jButtonGuardarCambiosTablaVehiculoCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVehiculoCliente=this.jButtonNuevoToolBarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=this.jButtonNuevoRelacionesToolBarVehiculoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			this.isVisibilidadCeldaModificarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jButtonModificarToolBarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaActualizarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jButtonActualizarToolBarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaEliminarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jButtonEliminarToolBarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaCancelarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jButtonCancelarToolBarVehiculoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVehiculoCliente=this.jButtonGuardarCambiosToolBarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=this.jButtonGuardarCambiosTablaToolBarVehiculoCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVehiculoCliente=this.jMenuItemNuevoVehiculoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=this.jMenuItemNuevoRelacionesVehiculoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			this.isVisibilidadCeldaModificarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemModificarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaActualizarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemActualizarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaEliminarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemEliminarVehiculoCliente.isVisible();
			this.isVisibilidadCeldaCancelarVehiculoCliente=this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemCancelarVehiculoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVehiculoCliente=this.jMenuItemGuardarCambiosVehiculoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=this.jMenuItemGuardarCambiosTablaVehiculoCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVehiculoCliente(Boolean esInicializar) {
		if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.vehiculoclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVehiculoCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualVehiculoCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVehiculoCliente() {
		this.jButtonNuevoVehiculoCliente.setVisible(this.isPermisoNuevoVehiculoCliente);			
		this.jButtonDuplicarVehiculoCliente.setVisible(this.isPermisoDuplicarVehiculoCliente);			
		this.jButtonCopiarVehiculoCliente.setVisible(this.isPermisoCopiarVehiculoCliente);			
		this.jButtonVerFormVehiculoCliente.setVisible(this.isPermisoVerFormVehiculoCliente);			
		
		this.jButtonAbrirOrderByVehiculoCliente.setVisible(this.isPermisoOrdenVehiculoCliente);					
		
		this.jButtonNuevoRelacionesVehiculoCliente.setVisible(this.isPermisoNuevoVehiculoCliente);			
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonModificarVehiculoCliente.setVisible(this.isPermisoActualizarVehiculoCliente);	
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonActualizarVehiculoCliente.setVisible(this.isPermisoActualizarVehiculoCliente);	
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonEliminarVehiculoCliente.setVisible(this.isPermisoEliminarVehiculoCliente);
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonCancelarVehiculoCliente.setVisible(this.isVisibilidadCeldaCancelarVehiculoCliente);						
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosVehiculoCliente.setVisible(this.isPermisoGuardarCambiosVehiculoCliente);							
		}
		
		this.jButtonGuardarCambiosTablaVehiculoCliente.setVisible(this.isPermisoActualizarVehiculoCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVehiculoCliente() {
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonModificarVehiculoCliente.setVisible(this.isPermisoActualizarVehiculoCliente);	
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonActualizarVehiculoCliente.setVisible(this.isPermisoActualizarVehiculoCliente);	
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonEliminarVehiculoCliente.setVisible(this.isPermisoEliminarVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonCancelarVehiculoCliente.setVisible(this.isVisibilidadCeldaCancelarVehiculoCliente);							
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosVehiculoCliente.setVisible((this.isVisibilidadCeldaGuardarVehiculoCliente && this.isPermisoGuardarCambiosVehiculoCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVehiculoCliente() {
		if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVehiculoCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVehiculoCliente() {
	}
	
	public void jTableDatosVehiculoClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVehiculoCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVehiculoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculocliente==null) {
						this.vehiculocliente = new VehiculoCliente();
					}

					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				}

				if(this.vehiculocliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.vehiculocliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVehiculoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVehiculoCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVehiculoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVehiculoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.vehiculoclienteLogic.getConnexion());

				if(this.vehiculocliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.vehiculocliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVehiculoCliente=(TitledBorder)this.jScrollPanelDatosVehiculoCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVehiculoCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVehiculoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculocliente==null) {
						this.vehiculocliente = new VehiculoCliente();
					}

					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				}

				if(this.vehiculocliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.vehiculocliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteVehiculoClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderVehiculoCliente=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosVehiculoCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderVehiculoCliente=(TitledBorder)this.jScrollPanelDatosVehiculoCliente.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderVehiculoCliente.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteVehiculoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebVehiculoCliente(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVehiculoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVehiculoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.vehiculoclienteLogic.getConnexion());

				if(this.vehiculocliente.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.vehiculocliente.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVehiculoCliente=(TitledBorder)this.jScrollPanelDatosVehiculoCliente.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderVehiculoCliente.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteVehiculoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculocliente==null) {
						this.vehiculocliente = new VehiculoCliente();
					}

					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				}

				if(this.vehiculocliente.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.vehiculocliente.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoVehiculoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculocliente==null) {
						this.vehiculocliente = new VehiculoCliente();
					}

					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				}

				if(this.vehiculocliente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.vehiculocliente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmarcaVehiculoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculocliente==null) {
						this.vehiculocliente = new VehiculoCliente();
					}

					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				}

				if(this.vehiculocliente.getmarca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where marca like '%"+this.vehiculocliente.getmarca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmodeloVehiculoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculocliente==null) {
						this.vehiculocliente = new VehiculoCliente();
					}

					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				}

				if(this.vehiculocliente.getmodelo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where modelo like '%"+this.vehiculocliente.getmodelo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonplacaVehiculoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculocliente==null) {
						this.vehiculocliente = new VehiculoCliente();
					}

					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				}

				if(this.vehiculocliente.getplaca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where placa like '%"+this.vehiculocliente.getplaca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonanioVehiculoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculocliente==null) {
						this.vehiculocliente = new VehiculoCliente();
					}

					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				}

				if(this.vehiculocliente.getanio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where anio = "+this.vehiculocliente.getanio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_prendadoVehiculoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculocliente==null) {
						this.vehiculocliente = new VehiculoCliente();
					}

					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				}

				if(this.vehiculocliente.getes_prendado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_prendado = "+this.vehiculocliente.getes_prendado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_avaluoVehiculoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.getvehiculocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculocliente==null) {
						this.vehiculocliente = new VehiculoCliente();
					}

					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);
				}

				if(this.vehiculocliente.getvalor_avaluo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_avaluo = "+this.vehiculocliente.getvalor_avaluo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVehiculoCliente(false,false);

			this.getVehiculoClientesFK_IdCliente();

			this.inicializarActualizarBindingVehiculoCliente(false);

			//if(VehiculoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVehiculoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVehiculoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVehiculoCliente(false,false);

			this.getVehiculoClientesFK_IdEmpresa();

			this.inicializarActualizarBindingVehiculoCliente(false);

			//if(VehiculoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVehiculoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVehiculoCliente() {
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
			this.jInternalFrameDetalleFormVehiculoCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormVehiculoCliente.dispose();
			this.jInternalFrameDetalleFormVehiculoCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVehiculoCliente!=null) {
			this.jInternalFrameReporteDinamicoVehiculoCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVehiculoCliente.dispose();
			this.jInternalFrameReporteDinamicoVehiculoCliente=null;
		}
		
		if(this.jInternalFrameImportacionVehiculoCliente!=null) {
			this.jInternalFrameImportacionVehiculoCliente.setVisible(false);	    			
			this.jInternalFrameImportacionVehiculoCliente.dispose();
			this.jInternalFrameImportacionVehiculoCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVehiculoCliente();
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoVehiculoCliente")) {
				jButtonNuevoVehiculoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVehiculoCliente")) {
				jButtonDuplicarVehiculoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVehiculoCliente")) {
				jButtonCopiarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormVehiculoCliente")) {
				jButtonVerFormVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVehiculoCliente")) {
				jButtonNuevoVehiculoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVehiculoCliente")) {
				jButtonDuplicarVehiculoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVehiculoCliente")) {
				jButtonNuevoVehiculoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVehiculoCliente")) {
				jButtonDuplicarVehiculoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVehiculoCliente")) {
				jButtonNuevoVehiculoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVehiculoCliente")) {
				jButtonNuevoVehiculoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVehiculoCliente")) {
				jButtonNuevoVehiculoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVehiculoCliente")) {
				jButtonModificarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVehiculoCliente")) {
				jButtonModificarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVehiculoCliente")) {
				jButtonModificarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVehiculoCliente")) {
				jButtonActualizarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVehiculoCliente")) {
				jButtonActualizarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVehiculoCliente")) {
				jButtonActualizarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarVehiculoCliente")) {
				jButtonEliminarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVehiculoCliente")) {
				jButtonEliminarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVehiculoCliente")) {
				jButtonEliminarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarVehiculoCliente")) {
				jButtonCancelarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVehiculoCliente")) {
				jButtonCancelarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVehiculoCliente")) {
				jButtonCancelarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarVehiculoCliente")) {
				jButtonCerrarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVehiculoCliente")) {
				jButtonCerrarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVehiculoCliente")) {
				jButtonCerrarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVehiculoCliente")) {
				jButtonMostrarOcultarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVehiculoCliente")) {
				jButtonCancelarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVehiculoCliente")) {
				jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVehiculoCliente")) {
				jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVehiculoCliente")) {
				jButtonCopiarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVehiculoCliente")) {
				jButtonVerFormVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVehiculoCliente")) {
				jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVehiculoCliente")) {
				jButtonCopiarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVehiculoCliente")) {
				jButtonVerFormVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVehiculoCliente")) {
				jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVehiculoCliente")) {
				jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVehiculoCliente")) {
				jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVehiculoCliente")) {
				jButtonRecargarInformacionVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVehiculoCliente")) {
				jButtonRecargarInformacionVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVehiculoCliente")) {
				jButtonRecargarInformacionVehiculoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVehiculoCliente")) {
				jButtonAnterioresVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVehiculoCliente")) {
				jButtonAnterioresVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVehiculoCliente")) {
				jButtonAnterioresVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVehiculoCliente")) {
				jButtonSiguientesVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVehiculoCliente")) {
				jButtonSiguientesVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVehiculoCliente")) {
				jButtonSiguientesVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVehiculoCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByVehiculoCliente")) {
				jButtonAbrirOrderByVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVehiculoCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarVehiculoCliente")) {
				jButtonMostrarOcultarVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVehiculoCliente")) {
				jButtonNuevoGuardarCambiosVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVehiculoCliente")) {
				jButtonNuevoGuardarCambiosVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVehiculoCliente")) {
				jButtonNuevoGuardarCambiosVehiculoClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVehiculoCliente")) {
				jButtonCerrarReporteDinamicoVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVehiculoCliente")) {
				jButtonGenerarReporteDinamicoVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVehiculoCliente")) {
				
				jButtonGenerarExcelReporteDinamicoVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVehiculoCliente")) {
				jButtonCerrarImportacionVehiculoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVehiculoCliente")) {
				
				jButtonGenerarImportacionVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVehiculoCliente")) {
				
				jButtonAbrirImportacionVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVehiculoCliente")) {
				jComboBoxTiposAccionesVehiculoClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVehiculoCliente")) {
				jComboBoxTiposRelacionesVehiculoClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVehiculoCliente")) {
				jComboBoxTiposAccionesVehiculoClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVehiculoCliente")) {
				
				jComboBoxTiposSeleccionarVehiculoClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVehiculoCliente")) {
				jTextFieldValorCampoGeneralVehiculoClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVehiculoCliente")) {
				jButtonAbrirOrderByVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVehiculoCliente")) {
				jButtonAbrirOrderByVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVehiculoCliente")) {
				jButtonCerrarOrderByVehiculoClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVehiculoClienteBusqueda")) {
				this.jButtonidVehiculoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVehiculoClienteUpdate")) {
				this.jButtonid_empresaVehiculoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVehiculoClienteBusqueda")) {
				this.jButtonid_empresaVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteVehiculoCliente")) {
				this.jButtonid_clienteVehiculoClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteVehiculoClienteUpdate")) {
				this.jButtonid_clienteVehiculoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteVehiculoClienteBusqueda")) {
				this.jButtonid_clienteVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoVehiculoClienteBusqueda")) {
				this.jButtoncodigoVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaVehiculoClienteBusqueda")) {
				this.jButtonmarcaVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modeloVehiculoClienteBusqueda")) {
				this.jButtonmodeloVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("placaVehiculoClienteBusqueda")) {
				this.jButtonplacaVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("anioVehiculoClienteBusqueda")) {
				this.jButtonanioVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_prendadoVehiculoClienteBusqueda")) {
				this.jButtones_prendadoVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_avaluoVehiculoClienteBusqueda")) {
				this.jButtonvalor_avaluoVehiculoClienteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteVehiculoCliente")) {
				this.jButtonid_clienteVehiculoClienteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteVehiculoCliente")) {
				this.jButtonFK_IdClienteVehiculoClienteActionPerformed(evt);
			}
			
			;
			
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVehiculoCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoClienteActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				


				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VehiculoCliente vehiculoclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				vehiculoclienteLocal=this.vehiculocliente;
			} else {
				vehiculoclienteLocal=this.vehiculoclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
							
				
				


				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoClienteActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
								
						
				


				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
								
				
				


				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
							
				
				


				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
								
				
				


				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoClienteActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVehiculoCliente")) {
					jCheckBoxSeleccionarTodosVehiculoClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVehiculoCliente")) {
					jCheckBoxSeleccionadosVehiculoClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVehiculoCliente")) {
					
				}
				
				


				
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
												
				
				


				
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoClienteActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculocliente);
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VehiculoCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VehiculoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculoclienteAnterior =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVehiculoCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVehiculoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVehiculoCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.vehiculocliente =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.vehiculocliente =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.vehiculocliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVehiculoCliente")) {
				
				}
				
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVehiculoCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVehiculoCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVehiculoCliente")) {
			
			}
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVehiculoCliente();
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
			if(sTipo.equals("NuevoVehiculoCliente")) {
				jButtonNuevoVehiculoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVehiculoCliente")) {
				jButtonDuplicarVehiculoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVehiculoCliente")) {
				jButtonCopiarVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVehiculoCliente")) {
				jButtonVerFormVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVehiculoCliente")) {
				jButtonNuevoVehiculoClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVehiculoCliente")) {
				jButtonModificarVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVehiculoCliente")) {
				jButtonActualizarVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVehiculoCliente")) {
				jButtonEliminarVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVehiculoCliente")) {
				jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVehiculoCliente")) {
				jButtonCancelarVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVehiculoCliente")) {
				jButtonCerrarVehiculoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVehiculoCliente")) {
				jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVehiculoCliente")) {
				jButtonNuevoGuardarCambiosVehiculoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVehiculoCliente")) {
				jButtonAbrirOrderByVehiculoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVehiculoCliente")) {
				jButtonRecargarInformacionVehiculoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVehiculoCliente")) {
				jButtonAnterioresVehiculoClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVehiculoCliente")) {
				jButtonSiguientesVehiculoClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVehiculoClienteBusqueda")) {
				this.jButtonidVehiculoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVehiculoClienteUpdate")) {
				this.jButtonid_empresaVehiculoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVehiculoClienteBusqueda")) {
				this.jButtonid_empresaVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteVehiculoCliente")) {
				this.jButtonid_clienteVehiculoClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteVehiculoClienteUpdate")) {
				this.jButtonid_clienteVehiculoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteVehiculoClienteBusqueda")) {
				this.jButtonid_clienteVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoVehiculoClienteBusqueda")) {
				this.jButtoncodigoVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaVehiculoClienteBusqueda")) {
				this.jButtonmarcaVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modeloVehiculoClienteBusqueda")) {
				this.jButtonmodeloVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("placaVehiculoClienteBusqueda")) {
				this.jButtonplacaVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("anioVehiculoClienteBusqueda")) {
				this.jButtonanioVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_prendadoVehiculoClienteBusqueda")) {
				this.jButtones_prendadoVehiculoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_avaluoVehiculoClienteBusqueda")) {
				this.jButtonvalor_avaluoVehiculoClienteBusquedaActionPerformed(evt);
			}
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVehiculoCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVehiculoCliente")) {
				closingInternalFrameVehiculoCliente();
				
			} else if(sTipo.equals("jButtonCancelarVehiculoCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormVehiculoCliente = (JInternalFrameBase)evt.getSource();
	            	
	            VehiculoClienteBeanSwingJInternalFrame jInternalFrameParent=(VehiculoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormVehiculoCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVehiculoClienteActionPerformed(null);
			}
			
			VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vehiculocliente,new Object(),this.vehiculoclienteParameterGeneral,this.vehiculoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVehiculoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVehiculoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVehiculoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.vehiculocliente)) {
			if(!esControlTabla) {
				if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);			
				}
				
				if(this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVehiculoCliente(this.vehiculocliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vehiculoclienteReturnGeneral=vehiculoclienteLogic.procesarEventosVehiculoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vehiculoclienteLogic.getVehiculoClientes(),this.vehiculocliente,this.vehiculoclienteParameterGeneral,this.isEsNuevoVehiculoCliente,classes);//this.vehiculoclienteLogic.getVehiculoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVehiculoCliente(this.vehiculoclienteReturnGeneral,this.vehiculoclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVehiculoCliente(classes,this.vehiculoclienteReturnGeneral,this.vehiculoclienteBean,false);
					}
						
					if(this.vehiculoclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVehiculoCliente(this.vehiculoclienteReturnGeneral.getVehiculoCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVehiculoCliente(this.vehiculoclienteReturnGeneral.getVehiculoCliente());	
					}
						
					if(this.vehiculoclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVehiculoCliente(this.vehiculoclienteReturnGeneral.getVehiculoCliente(),classes);//this.vehiculoclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVehiculoCliente(this.vehiculocliente,classes);//this.vehiculoclienteBean);									
				}
			
				if(VehiculoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVehiculoCliente(this.vehiculocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculoCliente(this.vehiculocliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.vehiculoclienteAnterior!=null) {
						this.vehiculocliente=this.vehiculoclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vehiculoclienteReturnGeneral=vehiculoclienteLogic.procesarEventosVehiculoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vehiculoclienteLogic.getVehiculoClientes(),this.vehiculocliente,this.vehiculoclienteParameterGeneral,this.isEsNuevoVehiculoCliente,classes);//this.vehiculoclienteLogic.getVehiculoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vehiculoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.vehiculoclienteReturnGeneral.getVehiculoCliente(),vehiculoclienteLogic.getVehiculoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.vehiculoclienteReturnGeneral.getVehiculoCliente(),this.vehiculoclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVehiculoCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosVehiculoCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVehiculoCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosVehiculoCliente() throws Exception {
		
		VehiculoClienteModel vehiculoclienteModel=(VehiculoClienteModel)this.jTableDatosVehiculoCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vehiculoclienteModel.vehiculoclientes=this.vehiculoclienteLogic.getVehiculoClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			vehiculoclienteModel.vehiculoclientes=this.vehiculoclientes;
		}
		
		
		((VehiculoClienteModel) this.jTableDatosVehiculoCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVehiculoCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvehiculoclienteAnterior(),this.vehiculoclienteLogic.getVehiculoClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvehiculoclienteAnterior(),this.vehiculoclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVehiculoCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVehiculoCliente(VehiculoCliente vehiculocliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vehiculocliente,new Object(),generalEntityParameterGeneral,this.vehiculoclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.vehiculoclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VehiculoClienteConstantesFunciones.getClassesRelationshipsOfVehiculoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VehiculoClienteConstantesFunciones.getClassesRelationshipsFromStringsOfVehiculoCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVehiculoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VehiculoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vehiculocliente,new Object(),generalEntityParameterGeneral,this.vehiculoclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVehiculoCliente(VehiculoClienteBean vehiculoclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVehiculoCliente(ArrayList<Classe> classes,VehiculoClienteReturnGeneral vehiculoclienteReturnGeneral,VehiculoClienteBean vehiculoclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVehiculoCliente(VehiculoCliente vehiculocliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.vehiculocliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVehiculoCliente = new VehiculoClienteDetalleFormJInternalFrame(jDesktopPane,this.vehiculoclienteSessionBean.getConGuardarRelaciones(),this.vehiculoclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.setVisible(false);
		this.jInternalFrameDetalleFormVehiculoCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormVehiculoCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVehiculoCliente.vehiculoclienteLogic=this.vehiculoclienteLogic;
		
		this.cargarCombosFrameForeignKeyVehiculoCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVehiculoCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVehiculoCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVehiculoCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVehiculoCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVehiculoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVehiculoCliente"));
		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonModificarVehiculoCliente.addActionListener(new ButtonActionListener(this,"ModificarVehiculoCliente"));

		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonModificarToolBarVehiculoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarVehiculoCliente"));
					
		this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemModificarVehiculoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarVehiculoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonActualizarVehiculoCliente.addActionListener (new ButtonActionListener(this,"ActualizarVehiculoCliente"));
		
		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonActualizarToolBarVehiculoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVehiculoCliente"));
						
		this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemActualizarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVehiculoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonEliminarVehiculoCliente.addActionListener (new ButtonActionListener(this,"EliminarVehiculoCliente"));
		
		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonEliminarToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarVehiculoCliente"));
								
		this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemEliminarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVehiculoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonCancelarVehiculoCliente.addActionListener (new ButtonActionListener(this,"CancelarVehiculoCliente"));
		
		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonCancelarToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarVehiculoCliente"));
					
		this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemCancelarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVehiculoCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemDetalleCerrarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVehiculoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVehiculoCliente"));
		
		
		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVehiculoCliente"));
		
		
		
		this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVehiculoCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonidVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idVehiculoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_empresaVehiculoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_empresaVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoClienteBusqueda"));
		//jButtonid_clienteVehiculoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteVehiculoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoCliente.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtoncodigoVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonmarcaVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"marcaVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonmodeloVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"modeloVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonplacaVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"placaVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonanioVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"anioVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtones_prendadoVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"es_prendadoVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonvalor_avaluoVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valor_avaluoVehiculoClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVehiculoCliente.jTabbedPaneRelacionesVehiculoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVehiculoCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVehiculoCliente"));
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVehiculoCliente"));
		}
		
		this.jTableDatosVehiculoCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVehiculoCliente"));
		
		this.jTableDatosVehiculoCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVehiculoCliente"));
		
		this.jButtonNuevoVehiculoCliente.addActionListener(new ButtonActionListener(this,"NuevoVehiculoCliente"));
		
		this.jButtonDuplicarVehiculoCliente.addActionListener(new ButtonActionListener(this,"DuplicarVehiculoCliente"));
		
		this.jButtonCopiarVehiculoCliente.addActionListener(new ButtonActionListener(this,"CopiarVehiculoCliente"));
		
		this.jButtonVerFormVehiculoCliente.addActionListener(new ButtonActionListener(this,"VerFormVehiculoCliente"));
		
		
		this.jButtonNuevoToolBarVehiculoCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarVehiculoCliente"));
			
		this.jButtonDuplicarToolBarVehiculoCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVehiculoCliente"));
			
		this.jMenuItemNuevoVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVehiculoCliente"));
			
		this.jMenuItemDuplicarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVehiculoCliente"));		
		
		
		this.jButtonNuevoRelacionesVehiculoCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVehiculoCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarVehiculoCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVehiculoCliente"));
			
		this.jMenuItemNuevoRelacionesVehiculoCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVehiculoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonModificarVehiculoCliente.addActionListener(new ButtonActionListener(this,"ModificarVehiculoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonModificarToolBarVehiculoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarVehiculoCliente"));
			
			this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemModificarVehiculoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarVehiculoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonActualizarVehiculoCliente.addActionListener (new ButtonActionListener(this,"ActualizarVehiculoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonActualizarToolBarVehiculoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVehiculoCliente"));
				
			this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemActualizarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVehiculoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonEliminarVehiculoCliente.addActionListener (new ButtonActionListener(this,"EliminarVehiculoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonEliminarToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarVehiculoCliente"));
						
			this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemEliminarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVehiculoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonCancelarVehiculoCliente.addActionListener (new ButtonActionListener(this,"CancelarVehiculoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonCancelarToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarVehiculoCliente"));
			
			this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemCancelarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVehiculoCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVehiculoCliente"));		
		
		
		this.jButtonCerrarVehiculoCliente.addActionListener (new ButtonActionListener(this,"CerrarVehiculoCliente"));
		
		
		this.jButtonCerrarToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarVehiculoCliente"));
			
		this.jMenuItemCerrarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVehiculoCliente"));
			
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jMenuItemDetalleCerrarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVehiculoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosVehiculoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosVehiculoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVehiculoCliente"));
		}
		
		this.jButtonCopiarToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarVehiculoCliente"));
			
		this.jButtonVerFormToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarVehiculoCliente"));
		
		this.jMenuItemGuardarCambiosVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVehiculoCliente"));
			
		this.jMenuItemCopiarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVehiculoCliente"));		
		
		this.jMenuItemVerFormVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVehiculoCliente"));		
		
		
		this.jButtonGuardarCambiosTablaVehiculoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVehiculoCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVehiculoCliente"));
			
		this.jMenuItemGuardarCambiosTablaVehiculoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVehiculoCliente"));		
		
		
		
		this.jButtonRecargarInformacionVehiculoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionVehiculoCliente"));
					
		this.jButtonRecargarInformacionToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVehiculoCliente"));
		
		this.jMenuItemRecargarInformacionVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVehiculoCliente"));		
		
		
		
		this.jButtonAnterioresVehiculoCliente.addActionListener (new ButtonActionListener(this,"AnterioresVehiculoCliente"));
		
		
		this.jButtonAnterioresToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVehiculoCliente"));
		
		this.jMenuItemAnterioresVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVehiculoCliente"));		
		
		
		this.jButtonSiguientesVehiculoCliente.addActionListener (new ButtonActionListener(this,"SiguientesVehiculoCliente"));
		
		
		this.jButtonSiguientesToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVehiculoCliente"));
			
		this.jMenuItemSiguientesVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVehiculoCliente"));
			
		this.jMenuItemAbrirOrderByVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVehiculoCliente"));
			
		this.jMenuItemMostrarOcultarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVehiculoCliente"));
			
		this.jMenuItemDetalleAbrirOrderByVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVehiculoCliente"));
			
		this.jMenuItemDetalleMostarOcultarVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVehiculoCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosVehiculoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVehiculoCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVehiculoCliente"));
			
		this.jMenuItemNuevoGuardarCambiosVehiculoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVehiculoCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVehiculoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVehiculoCliente"));

		this.jCheckBoxSeleccionadosVehiculoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVehiculoCliente"));
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVehiculoCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesVehiculoCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesVehiculoCliente"));
			
		this.jComboBoxTiposAccionesVehiculoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesVehiculoCliente"));
					
		this.jComboBoxTiposSeleccionarVehiculoCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVehiculoCliente"));
			
		this.jTextFieldValorCampoGeneralVehiculoCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVehiculoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonidVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idVehiculoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_empresaVehiculoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_empresaVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoClienteBusqueda"));
		//jButtonid_clienteVehiculoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteVehiculoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoCliente.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtoncodigoVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonmarcaVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"marcaVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonmodeloVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"modeloVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonplacaVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"placaVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonanioVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"anioVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtones_prendadoVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"es_prendadoVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonvalor_avaluoVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valor_avaluoVehiculoClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteVehiculoCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteVehiculoCliente"));

			this.jButtonBuscarFK_IdClienteid_clienteVehiculoCliente.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVehiculoCliente!=null) {
				this.jInternalFrameReporteDinamicoVehiculoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVehiculoCliente"));
				this.jInternalFrameReporteDinamicoVehiculoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVehiculoCliente"));
				this.jInternalFrameReporteDinamicoVehiculoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVehiculoCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoVehiculoCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVehiculoCliente"));				
			//this.jButtonGenerarReporteDinamicoVehiculoCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVehiculoCliente"));
			//this.jButtonGenerarExcelReporteDinamicoVehiculoCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVehiculoCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVehiculoCliente!=null) {
				this.jInternalFrameImportacionVehiculoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVehiculoCliente"));
				this.jInternalFrameImportacionVehiculoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVehiculoCliente"));
				this.jInternalFrameImportacionVehiculoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVehiculoCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVehiculoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByVehiculoCliente"));
			
			this.jButtonAbrirOrderByToolBarVehiculoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVehiculoCliente"));			
			
			if(this.jInternalFrameOrderByVehiculoCliente!=null) {
				this.jInternalFrameOrderByVehiculoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVehiculoCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculoCliente.jTabbedPaneRelacionesVehiculoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVehiculoCliente"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameVehiculoCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVehiculoCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVehiculoCliente = (JInternalFrameBase)event.getSource();
	            	
	            VehiculoClienteBeanSwingJInternalFrame jInternalFrameParent=(VehiculoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormVehiculoCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVehiculoClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVehiculoCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVehiculoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVehiculoCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVehiculoCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVehiculoCliente";
		inputMap = this.jButtonNuevoVehiculoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVehiculoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVehiculoClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVehiculoCliente";
		inputMap = this.jButtonNuevoRelacionesVehiculoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVehiculoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVehiculoClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVehiculoCliente";
		inputMap = this.jButtonModificarVehiculoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVehiculoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVehiculoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVehiculoCliente";
		inputMap = this.jButtonActualizarVehiculoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVehiculoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVehiculoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVehiculoCliente";
		inputMap = this.jButtonEliminarVehiculoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVehiculoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVehiculoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVehiculoCliente";
		inputMap = this.jButtonCancelarVehiculoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVehiculoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVehiculoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVehiculoCliente";
		inputMap = this.jButtonCerrarVehiculoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVehiculoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVehiculoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVehiculoCliente";
		inputMap = this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosVehiculoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonGuardarCambiosVehiculoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVehiculoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVehiculoCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVehiculoClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVehiculoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVehiculoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVehiculoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVehiculoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVehiculoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVehiculoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonidVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idVehiculoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_empresaVehiculoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_empresaVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoClienteBusqueda"));
		//jButtonid_clienteVehiculoCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteVehiculoClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoCliente.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtoncodigoVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonmarcaVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"marcaVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonmodeloVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"modeloVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonplacaVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"placaVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonanioVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"anioVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtones_prendadoVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"es_prendadoVehiculoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculoCliente.jButtonvalor_avaluoVehiculoClienteBusqueda.addActionListener(new ButtonActionListener(this,"valor_avaluoVehiculoClienteBusqueda"));
		
		
		this.jButtonFK_IdClienteVehiculoCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteVehiculoCliente"));

		this.jButtonBuscarFK_IdClienteid_clienteVehiculoCliente.addActionListener(new ButtonActionListener(this,"id_clienteVehiculoCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVehiculoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVehiculoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVehiculoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVehiculoCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVehiculoCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VehiculoCliente vehiculoclienteAux:this.vehiculoclienteLogic.getVehiculoClientes()) {
					vehiculoclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VehiculoCliente vehiculoclienteAux:vehiculoclientes) {
					vehiculoclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVehiculoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVehiculoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VehiculoCliente vehiculoclienteAux:this.vehiculoclienteLogic.getVehiculoClientes()) {
						vehiculoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VehiculoCliente vehiculoclienteAux:vehiculoclientes) {
						vehiculoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VehiculoCliente vehiculoclienteAux:this.vehiculoclienteLogic.getVehiculoClientes()) {
					
						if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO)) {
							existe=true;
							vehiculoclienteAux.setes_prendado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VehiculoCliente vehiculoclienteAux:vehiculoclientes) {
						
						if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO)) {
							existe=true;
							vehiculoclienteAux.setes_prendado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVehiculoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVehiculoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVehiculoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVehiculoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVehiculoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVehiculoCliente.getSelectedRows();
			
			VehiculoCliente vehiculoclienteLocal=new VehiculoCliente();
			
			//this.seleccionarTodosVehiculoCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vehiculoclienteLocal =(VehiculoCliente) this.vehiculoclienteLogic.getVehiculoClientes().toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					vehiculoclienteLocal =(VehiculoCliente) this.vehiculoclientes.toArray()[this.jTableDatosVehiculoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				vehiculoclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VehiculoCliente vehiculoclienteAux:this.vehiculoclienteLogic.getVehiculoClientes()) {
						vehiculoclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VehiculoCliente vehiculoclienteAux:vehiculoclientes) {
						vehiculoclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVehiculoCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVehiculoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVehiculoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVehiculoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVehiculoClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVehiculoClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVehiculoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVehiculoCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVehiculoCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VehiculoCliente vehiculoclienteAux:this.vehiculoclienteLogic.getVehiculoClientes()) {
				
						if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							vehiculoclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							vehiculoclienteAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_MODELO)) {
							existe=true;
							vehiculoclienteAux.setmodelo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_PLACA)) {
							existe=true;
							vehiculoclienteAux.setplaca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_ANIO)) {
							existe=true;
							vehiculoclienteAux.setanio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO)) {
							existe=true;
							vehiculoclienteAux.setvalor_avaluo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VehiculoCliente vehiculoclienteAux:vehiculoclientes) {
					
						if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							vehiculoclienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							vehiculoclienteAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_MODELO)) {
							existe=true;
							vehiculoclienteAux.setmodelo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_PLACA)) {
							existe=true;
							vehiculoclienteAux.setplaca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_ANIO)) {
							existe=true;
							vehiculoclienteAux.setanio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO)) {
							existe=true;
							vehiculoclienteAux.setvalor_avaluo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVehiculoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVehiculoClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVehiculoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVehiculoCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVehiculoCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVehiculoCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessVehiculoCliente(conSplash);
				
					this.generarReporteVehiculoClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVehiculoClientesSeleccionados();
				//this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVehiculoClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVehiculoClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVehiculoCliente();
				
				this.exportarVehiculoClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVehiculoClientes();
				//this.importarVehiculoClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVehiculoCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVehiculoClientesSeleccionados();
				//this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Vehiculo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVehiculoCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVehiculoCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVehiculoCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Vehiculo Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(VehiculoClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVehiculoCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVehiculoCliente(conSplash);
					
						//this.actualizarParametrosGeneralVehiculoCliente();
						
						this.generarReporteProcesoAccionVehiculoClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VehiculoClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Vehiculo ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Vehiculo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVehiculoCliente();
				
						this.actualizarParametrosGeneralVehiculoCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.vehiculoclienteReturnGeneral=vehiculoclienteLogic.procesarAccionVehiculoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.vehiculoclienteLogic.getVehiculoClientes(),this.vehiculoclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVehiculoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVehiculoCliente();
					
					VehiculoClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVehiculoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVehiculoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxTiposAccionesFormularioVehiculoCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVehiculoCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVehiculoClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVehiculoCliente();
			
			if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();		
			VehiculoCliente vehiculocliente=new VehiculoCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVehiculoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVehiculoCliente.getSelectedItem();
			
			
			
			
			vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(vehiculoclientesSeleccionados.size()==1) {
				for(VehiculoCliente vehiculoclienteAux:vehiculoclientesSeleccionados) {
					vehiculocliente=vehiculoclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVehiculoCliente();
			
      		//this.finishProcessVehiculoCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVehiculoClienteReturnGeneral() throws Exception {
		if(this.vehiculoclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.vehiculoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.vehiculoclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.vehiculoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.vehiculoclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.vehiculoclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVehiculoCliente(false);
		}
		
		if(this.vehiculoclienteReturnGeneral.getConRetornoLista() || this.vehiculoclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.vehiculoclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vehiculoclienteLogic.setVehiculoClientes(this.vehiculoclienteReturnGeneral.getVehiculoClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.vehiculoclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vehiculoclienteLogic.setVehiculoCliente(this.vehiculoclienteReturnGeneral.getVehiculoCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingVehiculoCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralVehiculoCliente() throws Exception {
		
		
	}
	
	public ArrayList<VehiculoCliente> getVehiculoClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVehiculoCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VehiculoCliente vehiculoclienteAux:vehiculoclienteLogic.getVehiculoClientes()) {
					if(vehiculoclienteAux.getIsSelected()) {
						vehiculoclientesSeleccionados.add(vehiculoclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VehiculoCliente vehiculoclienteAux:this.vehiculoclientes) {
					if(vehiculoclienteAux.getIsSelected()) {
						vehiculoclientesSeleccionados.add(vehiculoclienteAux);				
					}
				}
			}
			
			if(vehiculoclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						vehiculoclientesSeleccionados.addAll(this.vehiculoclienteLogic.getVehiculoClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						vehiculoclientesSeleccionados.addAll(this.vehiculoclientes);				
					}
				}
			}
		} else {
			vehiculoclientesSeleccionados.add(this.vehiculocliente);
		}
		
		return vehiculoclientesSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteVehiculoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVehiculoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVehiculoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVehiculoClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVehiculoClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Vehiculo Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVehiculoClientesSeleccionados() throws Exception {
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();		
		
		vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVehiculoClientes("Todos",vehiculoclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalVehiculoClientesSeleccionados() throws Exception {
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();		
		
		vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVehiculoClientes("Todos",vehiculoclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVehiculoClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();
		
		vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVehiculoClientes("Todos",vehiculoclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVehiculoClientesSeleccionados() throws Exception {
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVehiculoCliente();
		
		
		vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVehiculoCliente();
		
		
		//this.generarReporteVehiculoClientes("Todos",vehiculoclientesSeleccionados ,vehiculoclienteImplementable,vehiculoclienteImplementableHome);
	}
	
	public void mostrarImportacionVehiculoClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVehiculoCliente();
		
		this.abrirFrameImportacionVehiculoCliente();		
		
			
		//this.generarReporteVehiculoClientes("Todos",vehiculoclientesSeleccionados ,vehiculoclienteImplementable,vehiculoclienteImplementableHome);
	}
	
	public void importarVehiculoClientes() throws Exception {		
	
	}
	
	public void exportarVehiculoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVehiculoClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVehiculoClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVehiculoClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Vehiculo Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVehiculoClientesSeleccionados() throws Exception {
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();		
		
		vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculocliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVehiculoCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VehiculoCliente vehiculoclienteAux:vehiculoclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVehiculoCliente(vehiculoclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//vehiculoclienteAux.setsDetalleGeneralEntityReporte(vehiculoclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVehiculoCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_MARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_MODELO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_PLACA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_ANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVehiculoCliente(VehiculoCliente vehiculocliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=vehiculocliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculocliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculocliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculocliente.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculocliente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculocliente.getmarca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculocliente.getmodelo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculocliente.getplaca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculocliente.getanio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculocliente.getes_prendado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculocliente.getvalor_avaluo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVehiculoClientesSeleccionados() throws Exception {
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();		
		
		vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculocliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VehiculoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVehiculoCliente(row);				
				iRow++;
			}				
			
			for(VehiculoCliente vehiculoclienteAux:vehiculoclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVehiculoCliente(vehiculoclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVehiculoClientesSeleccionados() throws Exception {
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();		
		
		vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculocliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("vehiculoclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("vehiculocliente");
			//elementRoot.appendChild(element);
		
			for(VehiculoCliente vehiculoclienteAux:vehiculoclientesSeleccionados) {
				element = document.createElement("vehiculocliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVehiculoCliente(vehiculoclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVehiculoCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_MARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_MODELO);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_PLACA);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_ANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVehiculoCliente(VehiculoCliente vehiculocliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculocliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculocliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculocliente.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculocliente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculocliente.getmarca());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculocliente.getmodelo());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculocliente.getplaca());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculocliente.getanio());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculocliente.getes_prendado());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculocliente.getvalor_avaluo());				
	}
	
	public void setFilaDatosExportarXmlVehiculoCliente(VehiculoCliente vehiculocliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VehiculoClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(vehiculocliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VehiculoClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(vehiculocliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VehiculoClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(vehiculocliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(VehiculoClienteConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(vehiculocliente.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementcodigo = document.createElement(VehiculoClienteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(vehiculocliente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementmarca = document.createElement(VehiculoClienteConstantesFunciones.MARCA);
		elementmarca.appendChild(document.createTextNode(vehiculocliente.getmarca().trim()));
		element.appendChild(elementmarca);

		Element elementmodelo = document.createElement(VehiculoClienteConstantesFunciones.MODELO);
		elementmodelo.appendChild(document.createTextNode(vehiculocliente.getmodelo().trim()));
		element.appendChild(elementmodelo);

		Element elementplaca = document.createElement(VehiculoClienteConstantesFunciones.PLACA);
		elementplaca.appendChild(document.createTextNode(vehiculocliente.getplaca().trim()));
		element.appendChild(elementplaca);

		Element elementanio = document.createElement(VehiculoClienteConstantesFunciones.ANIO);
		elementanio.appendChild(document.createTextNode(vehiculocliente.getanio().toString().trim()));
		element.appendChild(elementanio);

		Element elementes_prendado = document.createElement(VehiculoClienteConstantesFunciones.ESPRENDADO);
		elementes_prendado.appendChild(document.createTextNode(vehiculocliente.getes_prendado().toString().trim()));
		element.appendChild(elementes_prendado);

		Element elementvalor_avaluo = document.createElement(VehiculoClienteConstantesFunciones.VALORAVALUO);
		elementvalor_avaluo.appendChild(document.createTextNode(vehiculocliente.getvalor_avaluo().toString().trim()));
		element.appendChild(elementvalor_avaluo);
	}
	
	public void generarReporteGroupGenericoVehiculoClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VehiculoCliente> vehiculoclientesSeleccionados=new ArrayList<VehiculoCliente>();
		
		vehiculoclientesSeleccionados=this.getVehiculoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoVehiculoCliente(vehiculoclientesSeleccionados);
		
		this.generarReporteVehiculoClientes("Todos",vehiculoclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVehiculoCliente(ArrayList<VehiculoCliente> vehiculoclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VehiculoCliente vehiculoclienteAux:vehiculoclientesSeleccionados) {
				vehiculoclienteAux.setsDetalleGeneralEntityReporte(vehiculoclienteAux.toString());
			
				if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					vehiculoclienteAux.setsDescripcionGeneralEntityReporte1(vehiculoclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					vehiculoclienteAux.setsDescripcionGeneralEntityReporte1(vehiculoclienteAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					vehiculoclienteAux.setsDescripcionGeneralEntityReporte1(vehiculoclienteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_MARCA)) {
					existe=true;
					vehiculoclienteAux.setsDescripcionGeneralEntityReporte1(vehiculoclienteAux.getmarca());
				}
				 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_MODELO)) {
					existe=true;
					vehiculoclienteAux.setsDescripcionGeneralEntityReporte1(vehiculoclienteAux.getmodelo());
				}
				 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_PLACA)) {
					existe=true;
					vehiculoclienteAux.setsDescripcionGeneralEntityReporte1(vehiculoclienteAux.getplaca());
				}
				 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_ANIO)) {
					existe=true;
					vehiculoclienteAux.setsDescripcionGeneralEntityReporte1(vehiculoclienteAux.getanio().toString());
				}
				 else if(sTipoSeleccionar.equals(VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO)) {
					existe=true;
					vehiculoclienteAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(vehiculoclienteAux.getes_prendado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVehiculoCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVehiculoCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=true;
				this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=true;
			}
			
			this.isVisibilidadCeldaModificarVehiculoCliente=false;
			this.isVisibilidadCeldaActualizarVehiculoCliente=false;
			this.isVisibilidadCeldaEliminarVehiculoCliente=false;
			this.isVisibilidadCeldaCancelarVehiculoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarVehiculoCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVehiculoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=false;
			this.isVisibilidadCeldaModificarVehiculoCliente=false;
			this.isVisibilidadCeldaActualizarVehiculoCliente=true;
			this.isVisibilidadCeldaEliminarVehiculoCliente=false;
			this.isVisibilidadCeldaCancelarVehiculoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarVehiculoCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVehiculoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=false;
			this.isVisibilidadCeldaModificarVehiculoCliente=false;
			this.isVisibilidadCeldaActualizarVehiculoCliente=true;
			this.isVisibilidadCeldaEliminarVehiculoCliente=true;
			this.isVisibilidadCeldaCancelarVehiculoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarVehiculoCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVehiculoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=false;
			this.isVisibilidadCeldaModificarVehiculoCliente=false;
			this.isVisibilidadCeldaActualizarVehiculoCliente=true;
			this.isVisibilidadCeldaEliminarVehiculoCliente=false;
			this.isVisibilidadCeldaCancelarVehiculoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarVehiculoCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVehiculoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=true;
			this.isVisibilidadCeldaModificarVehiculoCliente=false;
			this.isVisibilidadCeldaActualizarVehiculoCliente=false;
			this.isVisibilidadCeldaEliminarVehiculoCliente=false;
			this.isVisibilidadCeldaCancelarVehiculoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarVehiculoCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVehiculoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=false;
			this.isVisibilidadCeldaActualizarVehiculoCliente=false;
			this.isVisibilidadCeldaEliminarVehiculoCliente=false;
			this.isVisibilidadCeldaCancelarVehiculoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarVehiculoCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVehiculoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=false;
			this.isVisibilidadCeldaModificarVehiculoCliente=true;
			this.isVisibilidadCeldaActualizarVehiculoCliente=false;
			this.isVisibilidadCeldaEliminarVehiculoCliente=false;
			this.isVisibilidadCeldaCancelarVehiculoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarVehiculoCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VehiculoClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVehiculoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=true;
		} else {
			this.actualizarEstadoPanelsVehiculoCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVehiculoCliente=false;
			//this.isVisibilidadCeldaVerFormVehiculoCliente=false;
			this.isVisibilidadCeldaDuplicarVehiculoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!vehiculoclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoVehiculoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!vehiculoclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=false;												
			}
			
			this.jButtonCerrarVehiculoCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVehiculoCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.vehiculocliente)) {
			this.isVisibilidadCeldaActualizarVehiculoCliente=false;
			this.isVisibilidadCeldaEliminarVehiculoCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVehiculoCliente() {
	}
	
	public void actualizarEstadoPanelsVehiculoCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVehiculoCliente!=null) {
				this.jScrollPanelDatosEdicionVehiculoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculoCliente!=null) {
				this.jTabbedPaneBusquedasVehiculoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVehiculoCliente!=null) {
				this.jScrollPanelDatosVehiculoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionVehiculoCliente!=null) {
				this.jPanelPaginacionVehiculoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVehiculoCliente!=null) {
				this.jPanelParametrosReportesVehiculoCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVehiculoCliente!=null) {
				this.jScrollPanelDatosEdicionVehiculoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculoCliente!=null) {
				this.jTabbedPaneBusquedasVehiculoCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVehiculoCliente!=null) {
				this.jScrollPanelDatosVehiculoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionVehiculoCliente!=null) {
				this.jPanelPaginacionVehiculoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVehiculoCliente!=null) {
				this.jPanelParametrosReportesVehiculoCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVehiculoCliente!=null) {
				this.jScrollPanelDatosEdicionVehiculoCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculoCliente!=null) {
				this.jTabbedPaneBusquedasVehiculoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVehiculoCliente!=null) {
				this.jScrollPanelDatosVehiculoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionVehiculoCliente!=null) {
				this.jPanelPaginacionVehiculoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVehiculoCliente!=null) {
				this.jPanelParametrosReportesVehiculoCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVehiculoCliente!=null) {
				this.jScrollPanelDatosEdicionVehiculoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculoCliente!=null) {
				this.jTabbedPaneBusquedasVehiculoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVehiculoCliente!=null) {
				this.jScrollPanelDatosVehiculoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionVehiculoCliente!=null) {
				this.jPanelPaginacionVehiculoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVehiculoCliente!=null) {
				this.jPanelParametrosReportesVehiculoCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVehiculoCliente!=null) {
				this.jScrollPanelDatosEdicionVehiculoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculoCliente!=null) {
				this.jTabbedPaneBusquedasVehiculoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVehiculoCliente!=null) {
				this.jScrollPanelDatosVehiculoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionVehiculoCliente!=null) {
				this.jPanelPaginacionVehiculoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVehiculoCliente!=null) {
				this.jPanelParametrosReportesVehiculoCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVehiculoCliente!=null) {
				this.jScrollPanelDatosEdicionVehiculoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculoCliente!=null) {
				this.jTabbedPaneBusquedasVehiculoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVehiculoCliente!=null) {
				this.jScrollPanelDatosVehiculoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionVehiculoCliente!=null) {
				this.jPanelPaginacionVehiculoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVehiculoCliente!=null) {
				this.jPanelParametrosReportesVehiculoCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVehiculoCliente!=null) {
				this.jScrollPanelDatosEdicionVehiculoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculoCliente!=null) {
				this.jTabbedPaneBusquedasVehiculoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVehiculoCliente!=null) {
				this.jScrollPanelDatosVehiculoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionVehiculoCliente!=null) {
				this.jPanelPaginacionVehiculoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVehiculoCliente!=null) {
				this.jPanelParametrosReportesVehiculoCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVehiculoCliente!=null) {
					this.jTabbedPaneBusquedasVehiculoCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVehiculoCliente!=null) {
				this.jPanelParametrosReportesVehiculoCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculoCliente!=null) {
				this.jTabbedPaneBusquedasVehiculoCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVehiculoCliente!=null) {
				this.jPanelParametrosReportesVehiculoCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasVehiculoCliente.remove(jPanelFK_IdClienteVehiculoCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasVehiculoCliente.remove(jPanelFK_IdClienteVehiculoCliente);}
		}
		
	}
	
	
	
	

	public String registrarSesionVehiculoClienteParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(vehiculoclienteSessionBean==null) {
				vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(vehiculoclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.vehiculoclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(VehiculoClienteConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionVehiculoCliente(true);
			//clienteSessionBean.setlidVehiculoClienteActual(this.idVehiculoClienteActual);

			vehiculoclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyVehiculoCliente(true);
			vehiculoclienteSessionBean.setlIdVehiculoClienteActualForeignKey(this.idVehiculoClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VehiculoClienteSessionBean vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
		
		if(this.vehiculoclienteSessionBean==null) {
			this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
		}
		
		this.vehiculoclienteSessionBean.setsUltimaBusquedaVehiculoCliente(this.getsAccionBusqueda());
		this.vehiculoclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.vehiculoclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			vehiculoclienteSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			vehiculoclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VehiculoClienteSessionBean vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
		
		if(this.vehiculoclienteSessionBean==null) {
			this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
		}
		
		if(this.vehiculoclienteSessionBean.getsUltimaBusquedaVehiculoCliente()!=null&&!this.vehiculoclienteSessionBean.getsUltimaBusquedaVehiculoCliente().equals("")) {
			this.setsAccionBusqueda(vehiculoclienteSessionBean.getsUltimaBusquedaVehiculoCliente());
			this.setiNumeroPaginacion(vehiculoclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(vehiculoclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(vehiculoclienteSessionBean.getid_cliente());
				vehiculoclienteSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(vehiculoclienteSessionBean.getid_empresa());
				vehiculoclienteSessionBean.setid_empresa(-1L);
			}
		}
		
		this.vehiculoclienteSessionBean.setsUltimaBusquedaVehiculoCliente("");
		this.vehiculoclienteSessionBean.setiNumeroPaginacion(VehiculoClienteConstantesFunciones.INUMEROPAGINACION);
		this.vehiculoclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaVehiculoCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVehiculoCliente() {
		this.updateBorderResaltarBusquedasFormularioVehiculoCliente();
		this.updateVisibilidadBusquedasFormularioVehiculoCliente();
		this.updateHabilitarBusquedasFormularioVehiculoCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioVehiculoCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVehiculoCliente.getComponents().length>0) {
	

		if(this.vehiculoclienteConstantesFunciones.resaltarFK_IdClienteVehiculoCliente!=null) {
			index= this.jTabbedPaneBusquedasVehiculoCliente.indexOfComponent(this.jPanelFK_IdClienteVehiculoCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculoCliente.getComponent(index);
				jPanel.setBorder(this.vehiculoclienteConstantesFunciones.resaltarFK_IdClienteVehiculoCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVehiculoCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVehiculoCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVehiculoCliente.indexOfComponent(this.jPanelFK_IdClienteVehiculoCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculoCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vehiculoclienteConstantesFunciones.mostrarFK_IdClienteVehiculoCliente);
			if(!this.vehiculoclienteConstantesFunciones.mostrarFK_IdClienteVehiculoCliente && index>-1) {
				this.jTabbedPaneBusquedasVehiculoCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVehiculoCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVehiculoCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVehiculoCliente.indexOfComponent(this.jPanelFK_IdClienteVehiculoCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculoCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vehiculoclienteConstantesFunciones.activarFK_IdClienteVehiculoCliente);
				this.jTabbedPaneBusquedasVehiculoCliente.setEnabledAt(index,this.vehiculoclienteConstantesFunciones.activarFK_IdClienteVehiculoCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVehiculoCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasVehiculoCliente.indexOfComponent(this.jPanelFK_IdClienteVehiculoCliente);

			this.jTabbedPaneBusquedasVehiculoCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculoCliente.getComponent(index);

			this.vehiculoclienteConstantesFunciones.setResaltarFK_IdClienteVehiculoCliente(resaltar);

			jPanel.setBorder(this.vehiculoclienteConstantesFunciones.resaltarFK_IdClienteVehiculoCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVehiculoCliente.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioVehiculoCliente() throws Exception {

		if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVehiculoCliente();
		this.updateVisibilidadResaltarControlesFormularioVehiculoCliente();
		this.updateHabilitarResaltarControlesFormularioVehiculoCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioVehiculoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.vehiculoclienteConstantesFunciones.resaltaridVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente!=null) {this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.setBorder(this.vehiculoclienteConstantesFunciones.resaltaridVehiculoCliente);}
		if(this.vehiculoclienteConstantesFunciones.resaltarid_empresaVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente!=null) {this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.setBorder(this.vehiculoclienteConstantesFunciones.resaltarid_empresaVehiculoCliente);}
		if(this.vehiculoclienteConstantesFunciones.resaltarid_clienteVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente!=null) {this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.setBorder(this.vehiculoclienteConstantesFunciones.resaltarid_clienteVehiculoCliente);}
		if(this.vehiculoclienteConstantesFunciones.resaltarcodigoVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente!=null) {this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldcodigoVehiculoCliente.setBorder(this.vehiculoclienteConstantesFunciones.resaltarcodigoVehiculoCliente);}
		if(this.vehiculoclienteConstantesFunciones.resaltarmarcaVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente!=null) {this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamarcaVehiculoCliente.setBorder(this.vehiculoclienteConstantesFunciones.resaltarmarcaVehiculoCliente);}
		if(this.vehiculoclienteConstantesFunciones.resaltarmodeloVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente!=null) {this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamodeloVehiculoCliente.setBorder(this.vehiculoclienteConstantesFunciones.resaltarmodeloVehiculoCliente);}
		if(this.vehiculoclienteConstantesFunciones.resaltarplacaVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente!=null) {this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldplacaVehiculoCliente.setBorder(this.vehiculoclienteConstantesFunciones.resaltarplacaVehiculoCliente);}
		if(this.vehiculoclienteConstantesFunciones.resaltaranioVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente!=null) {this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldanioVehiculoCliente.setBorder(this.vehiculoclienteConstantesFunciones.resaltaranioVehiculoCliente);}
		if(this.vehiculoclienteConstantesFunciones.resaltares_prendadoVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente!=null) {this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxes_prendadoVehiculoCliente.setBorderPainted(true);this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxes_prendadoVehiculoCliente.setBorder(this.vehiculoclienteConstantesFunciones.resaltares_prendadoVehiculoCliente);}
		if(this.vehiculoclienteConstantesFunciones.resaltarvalor_avaluoVehiculoCliente!=null && this.jInternalFrameDetalleFormVehiculoCliente!=null) {this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldvalor_avaluoVehiculoCliente.setBorder(this.vehiculoclienteConstantesFunciones.resaltarvalor_avaluoVehiculoCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVehiculoCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
	
		//this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostraridVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jPanelidVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostraridVehiculoCliente);
		//this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarid_empresaVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jPanelid_empresaVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarid_empresaVehiculoCliente);
		//this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarid_clienteVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jPanelid_clienteVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarid_clienteVehiculoCliente);
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarid_clienteVehiculoCliente);
		//this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldcodigoVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarcodigoVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jPanelcodigoVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarcodigoVehiculoCliente);
		//this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamarcaVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarmarcaVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jPanelmarcaVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarmarcaVehiculoCliente);
		//this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamodeloVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarmodeloVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jPanelmodeloVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarmodeloVehiculoCliente);
		//this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldplacaVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarplacaVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jPanelplacaVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarplacaVehiculoCliente);
		//this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldanioVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostraranioVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jPanelanioVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostraranioVehiculoCliente);
		//this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxes_prendadoVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrares_prendadoVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jPaneles_prendadoVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrares_prendadoVehiculoCliente);
		//this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldvalor_avaluoVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarvalor_avaluoVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jPanelvalor_avaluoVehiculoCliente.setVisible(this.vehiculoclienteConstantesFunciones.mostrarvalor_avaluoVehiculoCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVehiculoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormVehiculoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVehiculoCliente!=null) {
	
		this.jInternalFrameDetalleFormVehiculoCliente.jLabelidVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activaridVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_empresaVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activarid_empresaVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jComboBoxid_clienteVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activarid_clienteVehiculoCliente);
			this.jInternalFrameDetalleFormVehiculoCliente.jButtonid_clienteVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activarid_clienteVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldcodigoVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activarcodigoVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamarcaVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activarmarcaVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextAreamodeloVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activarmodeloVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldplacaVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activarplacaVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldanioVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activaranioVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jCheckBoxes_prendadoVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activares_prendadoVehiculoCliente);
		this.jInternalFrameDetalleFormVehiculoCliente.jTextFieldvalor_avaluoVehiculoCliente.setEnabled(this.vehiculoclienteConstantesFunciones.activarvalor_avaluoVehiculoCliente);
		}
	}
	
		
}