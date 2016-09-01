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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.OrdenProduConstantesFunciones;
import com.bydan.erp.produccion.util.OrdenProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.OrdenProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.OrdenProduBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class OrdenProduBeanSwingJInternalFrame extends OrdenProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(OrdenProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<OrdenProdu> ordenproduValidator = new ClassValidator<OrdenProdu>(OrdenProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public OrdenProdu ordenprodu;	
	public OrdenProdu ordenproduAux;
	public OrdenProdu ordenproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public OrdenProdu ordenproduTotales;
	public Long idOrdenProduActual;
	public Long iIdNuevoOrdenProdu=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboFormato="";

	public List<Formato> formatosForeignKey;

	public List<Formato> getformatosForeignKey() {
		return formatosForeignKey;
	}

	public void setformatosForeignKey(List<Formato> formatosForeignKey) {
		this.formatosForeignKey = formatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoForeignKey;

	public Formato getformatoForeignKey() {
		return formatoForeignKey;
	}

	public void setformatoForeignKey(Formato formatoForeignKey) {
		this.formatoForeignKey = formatoForeignKey;
	}

	public String sFinalQueryComboTipoPrioridadEmpresaProdu="";

	public List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusForeignKey;

	public List<TipoPrioridadEmpresaProdu> gettipoprioridadempresaprodusForeignKey() {
		return tipoprioridadempresaprodusForeignKey;
	}

	public void settipoprioridadempresaprodusForeignKey(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusForeignKey) {
		this.tipoprioridadempresaprodusForeignKey = tipoprioridadempresaprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoPrioridadEmpresaProdu tipoprioridadempresaproduForeignKey;

	public TipoPrioridadEmpresaProdu gettipoprioridadempresaproduForeignKey() {
		return tipoprioridadempresaproduForeignKey;
	}

	public void settipoprioridadempresaproduForeignKey(TipoPrioridadEmpresaProdu tipoprioridadempresaproduForeignKey) {
		this.tipoprioridadempresaproduForeignKey = tipoprioridadempresaproduForeignKey;
	}

	public String sFinalQueryComboEmpleadoResponsable="";

	public List<Empleado> empleadoresponsablesForeignKey;

	public List<Empleado> getempleadoresponsablesForeignKey() {
		return empleadoresponsablesForeignKey;
	}

	public void setempleadoresponsablesForeignKey(List<Empleado> empleadoresponsablesForeignKey) {
		this.empleadoresponsablesForeignKey = empleadoresponsablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoresponsableForeignKey;

	public Empleado getempleadoresponsableForeignKey() {
		return empleadoresponsableForeignKey;
	}

	public void setempleadoresponsableForeignKey(Empleado empleadoresponsableForeignKey) {
		this.empleadoresponsableForeignKey = empleadoresponsableForeignKey;
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

	public String sFinalQueryComboEstadoOrdenProdu="";

	public List<EstadoOrdenProdu> estadoordenprodusForeignKey;

	public List<EstadoOrdenProdu> getestadoordenprodusForeignKey() {
		return estadoordenprodusForeignKey;
	}

	public void setestadoordenprodusForeignKey(List<EstadoOrdenProdu> estadoordenprodusForeignKey) {
		this.estadoordenprodusForeignKey = estadoordenprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoOrdenProdu estadoordenproduForeignKey;

	public EstadoOrdenProdu getestadoordenproduForeignKey() {
		return estadoordenproduForeignKey;
	}

	public void setestadoordenproduForeignKey(EstadoOrdenProdu estadoordenproduForeignKey) {
		this.estadoordenproduForeignKey = estadoordenproduForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	
	

	public Boolean isTienePermisosOrdenDetaProdu=false;

	public Boolean getIsTienePermisosOrdenDetaProdu() {
		return isTienePermisosOrdenDetaProdu;
	}

	public void setIsTienePermisosOrdenDetaProdu(Boolean isTienePermisosOrdenDetaProdu) {
		this.isTienePermisosOrdenDetaProdu= isTienePermisosOrdenDetaProdu;
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
	
	public Boolean isPermisoTodoOrdenProdu;
	public Boolean isPermisoNuevoOrdenProdu;
	public Boolean isPermisoActualizarOrdenProdu;
	public Boolean isPermisoActualizarOriginalOrdenProdu;
	public Boolean isPermisoEliminarOrdenProdu;
	public Boolean isPermisoGuardarCambiosOrdenProdu;
	public Boolean isPermisoConsultaOrdenProdu;
	public Boolean isPermisoBusquedaOrdenProdu;
	public Boolean isPermisoReporteOrdenProdu;
	public Boolean isPermisoPaginacionMedioOrdenProdu;
	public Boolean isPermisoPaginacionAltoOrdenProdu;
	public Boolean isPermisoPaginacionTodoOrdenProdu;
	public Boolean isPermisoCopiarOrdenProdu;
	public Boolean isPermisoVerFormOrdenProdu;
	public Boolean isPermisoDuplicarOrdenProdu;
	public Boolean isPermisoOrdenOrdenProdu;
	
	
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
	
	public OrdenProduParameterReturnGeneral ordenproduReturnGeneral;
	public OrdenProduParameterReturnGeneral ordenproduParameterGeneral;
	
	

	public OrdenDetaProduLogic ordendetaproduLogic=null;

	public OrdenDetaProduLogic getOrdenDetaProduLogic() {
		return ordendetaproduLogic;
	}

	public void setOrdenDetaProduLogic(OrdenDetaProduLogic ordendetaproduLogic) {
		this.ordendetaproduLogic = ordendetaproduLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoOrdenProdu=false;
	public Boolean esParaAccionDesdeFormularioOrdenProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected OrdenProduSessionBeanAdditional ordenproduSessionBeanAdditional=null;
	
	public OrdenProduSessionBeanAdditional getOrdenProduSessionBeanAdditional() {
		return this.ordenproduSessionBeanAdditional;
	}
	
	public void setOrdenProduSessionBeanAdditional(OrdenProduSessionBeanAdditional ordenproduSessionBeanAdditional) {
		try {
			this.ordenproduSessionBeanAdditional=ordenproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected OrdenProduBeanSwingJInternalFrameAdditional ordenproduBeanSwingJInternalFrameAdditional=null;
	//public class OrdenProduBeanSwingJInternalFrame
	
	public OrdenProduBeanSwingJInternalFrameAdditional getOrdenProduBeanSwingJInternalFrameAdditional() {
		return this.ordenproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setOrdenProduBeanSwingJInternalFrameAdditional(OrdenProduBeanSwingJInternalFrameAdditional ordenproduBeanSwingJInternalFrameAdditional) {
		try {
			this.ordenproduBeanSwingJInternalFrameAdditional=ordenproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public OrdenProduLogic ordenproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public OrdenProdu ordenproduBean;
	public OrdenProduConstantesFunciones ordenproduConstantesFunciones;
	//public OrdenProduParameterReturnGeneral ordenproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public FormatoLogic formatoLogic;
	public TipoPrioridadEmpresaProduLogic tipoprioridadempresaproduLogic;
	public EmpleadoLogic empleadoresponsableLogic;
	public ClienteLogic clienteLogic;
	public EstadoOrdenProduLogic estadoordenproduLogic;
	
	//PARAMETROS
	
	
	//public List<OrdenProdu> ordenprodus;	
	//public List<OrdenProdu> ordenprodusEliminados;
	//public List<OrdenProdu> ordenprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoOrdenProdu=false;
	public Boolean isVisibilidadCeldaDuplicarOrdenProdu=true;
	public Boolean isVisibilidadCeldaCopiarOrdenProdu=true;
	public Boolean isVisibilidadCeldaVerFormOrdenProdu=true;
	public Boolean isVisibilidadCeldaOrdenOrdenProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesOrdenProdu=false;
	public Boolean isVisibilidadCeldaModificarOrdenProdu=false;
	public Boolean isVisibilidadCeldaActualizarOrdenProdu=false;
	public Boolean isVisibilidadCeldaEliminarOrdenProdu=false;
	public Boolean isVisibilidadCeldaCancelarOrdenProdu=false;
	public Boolean isVisibilidadCeldaGuardarOrdenProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosOrdenProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpleadoResponsable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoOrdenProdu=false;
	public Boolean isVisibilidadFK_IdFormato=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoPrioridadEmpresaProdu=false;
	
	public Long getiIdNuevoOrdenProdu() {
		return this.iIdNuevoOrdenProdu;
	}

	public void setiIdNuevoOrdenProdu(Long iIdNuevoOrdenProdu) {
		this.iIdNuevoOrdenProdu = iIdNuevoOrdenProdu;
	}
	
	public Long getidOrdenProduActual() {
		return this.idOrdenProduActual;
	}

	public void setidOrdenProduActual(Long idOrdenProduActual) {
		this.idOrdenProduActual = idOrdenProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public OrdenProdu getordenprodu() {
		return this.ordenprodu;
	}

	public void setordenprodu(OrdenProdu ordenprodu) {
		this.ordenprodu = ordenprodu;
	}
	
	public OrdenProdu getordenproduAux() {
		return this.ordenproduAux;
	}

	public void setordenproduAux(OrdenProdu ordenproduAux) {
		this.ordenproduAux = ordenproduAux;
	}				
	
	public OrdenProdu getordenproduAnterior() {
		return this.ordenproduAnterior;
	}

	public void setordenproduAnterior(OrdenProdu ordenproduAnterior) {
		this.ordenproduAnterior = ordenproduAnterior;
	}	
	
	public OrdenProdu getordenproduTotales() {
		return this.ordenproduTotales;
	}

	public void setordenproduTotales(OrdenProdu ordenproduTotales) {
		this.ordenproduTotales = ordenproduTotales;
	}	
	
	public OrdenProdu getordenproduBean() {
		return this.ordenproduBean;
	}

	public void setordenproduBean(OrdenProdu ordenproduBean) {
		this.ordenproduBean = ordenproduBean;
	}	
	
	public OrdenProduParameterReturnGeneral getordenproduReturnGeneral() {
		return this.ordenproduReturnGeneral;
	}

	public void setordenproduReturnGeneral(OrdenProduParameterReturnGeneral ordenproduReturnGeneral) {
		this.ordenproduReturnGeneral = ordenproduReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empleado_responsableFK_IdEmpleadoResponsable=-1L;

	public Long getid_empleado_responsableFK_IdEmpleadoResponsable() {
		return this.id_empleado_responsableFK_IdEmpleadoResponsable;
	}

	public void setid_empleado_responsableFK_IdEmpleadoResponsable(Long id_empleado_responsableFK_IdEmpleadoResponsable) {
		this.id_empleado_responsableFK_IdEmpleadoResponsable = id_empleado_responsableFK_IdEmpleadoResponsable;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_orden_produFK_IdEstadoOrdenProdu=-1L;

	public Long getid_estado_orden_produFK_IdEstadoOrdenProdu() {
		return this.id_estado_orden_produFK_IdEstadoOrdenProdu;
	}

	public void setid_estado_orden_produFK_IdEstadoOrdenProdu(Long id_estado_orden_produFK_IdEstadoOrdenProdu) {
		this.id_estado_orden_produFK_IdEstadoOrdenProdu = id_estado_orden_produFK_IdEstadoOrdenProdu;
	}

	public Long id_formatoFK_IdFormato=null;

	public Long getid_formatoFK_IdFormato() {
		return this.id_formatoFK_IdFormato;
	}

	public void setid_formatoFK_IdFormato(Long id_formatoFK_IdFormato) {
		this.id_formatoFK_IdFormato = id_formatoFK_IdFormato;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu=-1L;

	public Long getid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu() {
		return this.id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu;
	}

	public void setid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu(Long id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu) {
		this.id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu = id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public OrdenProduLogic getOrdenProduLogic()	{		
		return ordenproduLogic;
	}

	public void setOrdenProduLogic(OrdenProduLogic ordenproduLogic) {
		this.ordenproduLogic = ordenproduLogic;
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
	
	public Boolean getIsEsNuevoOrdenProdu() {
		return isEsNuevoOrdenProdu;
	}

	public void setIsEsNuevoOrdenProdu(Boolean isEsNuevoOrdenProdu) {
		this.isEsNuevoOrdenProdu = isEsNuevoOrdenProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioOrdenProdu() {
		return esParaAccionDesdeFormularioOrdenProdu;
	}
	
	public void setEsParaAccionDesdeFormularioOrdenProdu(Boolean esParaAccionDesdeFormularioOrdenProdu) {
		this.esParaAccionDesdeFormularioOrdenProdu = esParaAccionDesdeFormularioOrdenProdu;
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

			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ordenproduSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(ordenproduSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(ordenproduSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(ordenproduSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(ordenproduSessionBean.getlidFormatoActual());
					this.formatosForeignKey.add(formatoLogic.getFormato());
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

	public void cargarCombosTipoPrioridadEmpresaProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoprioridadempresaprodusForeignKey=new ArrayList<TipoPrioridadEmpresaProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoPrioridadEmpresaProduLogic tipoprioridadempresaproduLogic=new TipoPrioridadEmpresaProduLogic();

			//tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProduDataAccess().setIsForForeingKeyData(true);

			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProduDataAccess().setIsForForeingKeyData(true);

					tipoprioridadempresaproduLogic.getTodosTipoPrioridadEmpresaProdusWithConnection(sFinalQuery,new Pagination());

					this.tipoprioridadempresaprodusForeignKey=tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoPrioridadEmpresaProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprioridadempresaproduLogic.getEntityWithConnection(ordenproduSessionBean.getlidTipoPrioridadEmpresaProduActual());
					this.tipoprioridadempresaprodusForeignKey.add(tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdu());
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

	public void cargarCombosEmpleadoResponsablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadoresponsablesForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoResponsable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoresponsableLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadoresponsablesForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleadoResponsable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(ordenproduSessionBean.getlidEmpleadoResponsableActual());
					this.empleadoresponsablesForeignKey.add(empleadoLogic.getEmpleado());
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

			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(ordenproduSessionBean.getlidClienteActual());
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

	public void cargarCombosEstadoOrdenProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadoordenprodusForeignKey=new ArrayList<EstadoOrdenProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoOrdenProduLogic estadoordenproduLogic=new EstadoOrdenProduLogic();

			//estadoordenproduLogic.getEstadoOrdenProduDataAccess().setIsForForeingKeyData(true);

			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEstadoOrdenProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadoordenproduLogic.getEstadoOrdenProduDataAccess().setIsForForeingKeyData(true);

					estadoordenproduLogic.getTodosEstadoOrdenProdusWithConnection(sFinalQuery,new Pagination());

					this.estadoordenprodusForeignKey=estadoordenproduLogic.getEstadoOrdenProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoOrdenProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoordenproduLogic.getEntityWithConnection(ordenproduSessionBean.getlidEstadoOrdenProduActual());
					this.estadoordenprodusForeignKey.add(estadoordenproduLogic.getEstadoOrdenProdu());
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

					if(this.ordenprodu!=null) {
						this.ordenprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaOrdenProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaOrdenProduGenerico)throws Exception
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
				jComboBoxid_empresaOrdenProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaOrdenProduGenerico!=null && jComboBoxid_empresaOrdenProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaOrdenProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.ordenprodu!=null) {
						this.ordenprodu.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalOrdenProdu.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalOrdenProduGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalOrdenProduGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalOrdenProduGenerico!=null && jComboBoxid_sucursalOrdenProduGenerico.getItemCount()>0) {
					jComboBoxid_sucursalOrdenProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.ordenprodu!=null) {
						this.ordenprodu.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioOrdenProdu.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioOrdenProduGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioOrdenProduGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioOrdenProduGenerico!=null && jComboBoxid_ejercicioOrdenProduGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioOrdenProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.ordenprodu!=null) {
						this.ordenprodu.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoOrdenProdu.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoOrdenProduGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoOrdenProduGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoOrdenProduGenerico!=null && jComboBoxid_periodoOrdenProduGenerico.getItemCount()>0) {
					jComboBoxid_periodoOrdenProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoForeignKey(Long idFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoTemp!=null) {

					if(this.ordenprodu!=null) {
						this.ordenprodu.setFormato(formatoTemp);
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.setSelectedItem(formatoTemp);
					}
				} else {
					//jComboBoxid_formatoOrdenProdu.setSelectedItem(formatoTemp);
					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormato") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatoTemp!=null && jComboBoxid_formatoFK_IdFormatoOrdenProdu!=null) {
						jComboBoxid_formatoFK_IdFormatoOrdenProdu.setSelectedItem(formatoTemp);
					} else {
						if(jComboBoxid_formatoFK_IdFormatoOrdenProdu!=null) {
							//jComboBoxid_formatoFK_IdFormatoOrdenProdu.setSelectedItem(formatoTemp);
							if(jComboBoxid_formatoFK_IdFormatoOrdenProdu.getItemCount()>0) {
								jComboBoxid_formatoFK_IdFormatoOrdenProdu.setSelectedIndex(0);
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

	public String getActualFormatoForeignKeyDescripcion(Long idFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoForeignKeyGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxid_formatoOrdenProduGenerico)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(formatoTemp!=null) {
				jComboBoxid_formatoOrdenProduGenerico.setSelectedItem(formatoTemp);
			} else {
				if(jComboBoxid_formatoOrdenProduGenerico!=null && jComboBoxid_formatoOrdenProduGenerico.getItemCount()>0) {
					jComboBoxid_formatoOrdenProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoPrioridadEmpresaProduForeignKey(Long idTipoPrioridadEmpresaProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoPrioridadEmpresaProdu  tipoprioridadempresaproduTemp=null;

			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusForeignKey) {
				if(tipoprioridadempresaproduAux.getId()!=null && tipoprioridadempresaproduAux.getId().equals(idTipoPrioridadEmpresaProduSeleccionado)) {
					tipoprioridadempresaproduTemp=tipoprioridadempresaproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprioridadempresaproduTemp!=null) {

					if(this.ordenprodu!=null) {
						this.ordenprodu.setTipoPrioridadEmpresaProdu(tipoprioridadempresaproduTemp);
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setSelectedItem(tipoprioridadempresaproduTemp);
					}
				} else {
					//jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setSelectedItem(tipoprioridadempresaproduTemp);
					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoPrioridadEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprioridadempresaproduTemp!=null && jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu!=null) {
						jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setSelectedItem(tipoprioridadempresaproduTemp);
					} else {
						if(jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu!=null) {
							//jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setSelectedItem(tipoprioridadempresaproduTemp);
							if(jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.getItemCount()>0) {
								jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setSelectedIndex(0);
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

	public String getActualTipoPrioridadEmpresaProduForeignKeyDescripcion(Long idTipoPrioridadEmpresaProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoPrioridadEmpresaProdu  tipoprioridadempresaproduTemp=null;

			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusForeignKey) {
				if(tipoprioridadempresaproduAux.getId()!=null && tipoprioridadempresaproduAux.getId().equals(idTipoPrioridadEmpresaProduSeleccionado)) {
					tipoprioridadempresaproduTemp=tipoprioridadempresaproduAux;
					break;
				}
			}


			sDescripcion=TipoPrioridadEmpresaProduConstantesFunciones.getTipoPrioridadEmpresaProduDescripcion(tipoprioridadempresaproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoPrioridadEmpresaProduForeignKeyGenerico(Long idTipoPrioridadEmpresaProduSeleccionado,JComboBox jComboBoxid_tipo_prioridad_empresa_produOrdenProduGenerico)throws Exception
	{
		try
		{
			TipoPrioridadEmpresaProdu  tipoprioridadempresaproduTemp=null;

			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusForeignKey) {
				if(tipoprioridadempresaproduAux.getId()!=null && tipoprioridadempresaproduAux.getId().equals(idTipoPrioridadEmpresaProduSeleccionado)) {
					tipoprioridadempresaproduTemp=tipoprioridadempresaproduAux;
					break;
				}
			}

			if(tipoprioridadempresaproduTemp!=null) {
				jComboBoxid_tipo_prioridad_empresa_produOrdenProduGenerico.setSelectedItem(tipoprioridadempresaproduTemp);
			} else {
				if(jComboBoxid_tipo_prioridad_empresa_produOrdenProduGenerico!=null && jComboBoxid_tipo_prioridad_empresa_produOrdenProduGenerico.getItemCount()>0) {
					jComboBoxid_tipo_prioridad_empresa_produOrdenProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoResponsableForeignKey(Long idEmpleadoResponsableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoresponsableTemp=null;

			for(Empleado empleadoresponsableAux:empleadoresponsablesForeignKey) {
				if(empleadoresponsableAux.getId()!=null && empleadoresponsableAux.getId().equals(idEmpleadoResponsableSeleccionado)) {
					empleadoresponsableTemp=empleadoresponsableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoresponsableTemp!=null) {

					if(this.ordenprodu!=null) {
						this.ordenprodu.setEmpleadoResponsable(empleadoresponsableTemp);
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.setSelectedItem(empleadoresponsableTemp);
					}
				} else {
					//jComboBoxid_empleado_responsableOrdenProdu.setSelectedItem(empleadoresponsableTemp);
					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoResponsable") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoresponsableTemp!=null && jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu!=null) {
						jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setSelectedItem(empleadoresponsableTemp);
					} else {
						if(jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu!=null) {
							//jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setSelectedItem(empleadoresponsableTemp);
							if(jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.getItemCount()>0) {
								jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setSelectedIndex(0);
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

	public String getActualEmpleadoResponsableForeignKeyDescripcion(Long idEmpleadoResponsableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoresponsableTemp=null;

			for(Empleado empleadoresponsableAux:empleadoresponsablesForeignKey) {
				if(empleadoresponsableAux.getId()!=null && empleadoresponsableAux.getId().equals(idEmpleadoResponsableSeleccionado)) {
					empleadoresponsableTemp=empleadoresponsableAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoresponsableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoResponsableForeignKeyGenerico(Long idEmpleadoResponsableSeleccionado,JComboBox jComboBoxid_empleado_responsableOrdenProduGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoresponsableTemp=null;

			for(Empleado empleadoresponsableAux:empleadoresponsablesForeignKey) {
				if(empleadoresponsableAux.getId()!=null && empleadoresponsableAux.getId().equals(idEmpleadoResponsableSeleccionado)) {
					empleadoresponsableTemp=empleadoresponsableAux;
					break;
				}
			}

			if(empleadoresponsableTemp!=null) {
				jComboBoxid_empleado_responsableOrdenProduGenerico.setSelectedItem(empleadoresponsableTemp);
			} else {
				if(jComboBoxid_empleado_responsableOrdenProduGenerico!=null && jComboBoxid_empleado_responsableOrdenProduGenerico.getItemCount()>0) {
					jComboBoxid_empleado_responsableOrdenProduGenerico.setSelectedIndex(0);
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

					if(this.ordenprodu!=null) {
						this.ordenprodu.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteOrdenProdu.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteOrdenProdu!=null) {
						jComboBoxid_clienteFK_IdClienteOrdenProdu.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteOrdenProdu!=null) {
							//jComboBoxid_clienteFK_IdClienteOrdenProdu.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteOrdenProdu.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteOrdenProdu.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteOrdenProduGenerico)throws Exception
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
				jComboBoxid_clienteOrdenProduGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteOrdenProduGenerico!=null && jComboBoxid_clienteOrdenProduGenerico.getItemCount()>0) {
					jComboBoxid_clienteOrdenProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoOrdenProduForeignKey(Long idEstadoOrdenProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoOrdenProdu  estadoordenproduTemp=null;

			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusForeignKey) {
				if(estadoordenproduAux.getId()!=null && estadoordenproduAux.getId().equals(idEstadoOrdenProduSeleccionado)) {
					estadoordenproduTemp=estadoordenproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadoordenproduTemp!=null) {

					if(this.ordenprodu!=null) {
						this.ordenprodu.setEstadoOrdenProdu(estadoordenproduTemp);
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.setSelectedItem(estadoordenproduTemp);
					}
				} else {
					//jComboBoxid_estado_orden_produOrdenProdu.setSelectedItem(estadoordenproduTemp);
					if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
						if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoOrdenProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadoordenproduTemp!=null && jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu!=null) {
						jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setSelectedItem(estadoordenproduTemp);
					} else {
						if(jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu!=null) {
							//jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setSelectedItem(estadoordenproduTemp);
							if(jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.getItemCount()>0) {
								jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setSelectedIndex(0);
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

	public String getActualEstadoOrdenProduForeignKeyDescripcion(Long idEstadoOrdenProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoOrdenProdu  estadoordenproduTemp=null;

			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusForeignKey) {
				if(estadoordenproduAux.getId()!=null && estadoordenproduAux.getId().equals(idEstadoOrdenProduSeleccionado)) {
					estadoordenproduTemp=estadoordenproduAux;
					break;
				}
			}


			sDescripcion=EstadoOrdenProduConstantesFunciones.getEstadoOrdenProduDescripcion(estadoordenproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoOrdenProduForeignKeyGenerico(Long idEstadoOrdenProduSeleccionado,JComboBox jComboBoxid_estado_orden_produOrdenProduGenerico)throws Exception
	{
		try
		{
			EstadoOrdenProdu  estadoordenproduTemp=null;

			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusForeignKey) {
				if(estadoordenproduAux.getId()!=null && estadoordenproduAux.getId().equals(idEstadoOrdenProduSeleccionado)) {
					estadoordenproduTemp=estadoordenproduAux;
					break;
				}
			}

			if(estadoordenproduTemp!=null) {
				jComboBoxid_estado_orden_produOrdenProduGenerico.setSelectedItem(estadoordenproduTemp);
			} else {
				if(jComboBoxid_estado_orden_produOrdenProduGenerico!=null && jComboBoxid_estado_orden_produOrdenProduGenerico.getItemCount()>0) {
					jComboBoxid_estado_orden_produOrdenProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(OrdenProdu ordenprodu,JComboBox jComboBoxid_empresaOrdenProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaOrdenProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaOrdenProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ordenprodu.setid_empresa(empresaAux.getId());
				ordenprodu.setempresa_descripcion(OrdenProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ordenprodu.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(OrdenProdu ordenprodu,JComboBox jComboBoxid_sucursalOrdenProduGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalOrdenProduGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalOrdenProduGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				ordenprodu.setid_sucursal(sucursalAux.getId());
				ordenprodu.setsucursal_descripcion(OrdenProduConstantesFunciones.getSucursalDescripcion(sucursalAux));
				ordenprodu.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(OrdenProdu ordenprodu,JComboBox jComboBoxid_ejercicioOrdenProduGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioOrdenProduGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioOrdenProduGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				ordenprodu.setid_ejercicio(ejercicioAux.getId());
				ordenprodu.setejercicio_descripcion(OrdenProduConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				ordenprodu.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(OrdenProdu ordenprodu,JComboBox jComboBoxid_periodoOrdenProduGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoOrdenProduGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoOrdenProduGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				ordenprodu.setid_periodo(periodoAux.getId());
				ordenprodu.setperiodo_descripcion(OrdenProduConstantesFunciones.getPeriodoDescripcion(periodoAux));
				ordenprodu.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoForeignKey(OrdenProdu ordenprodu,JComboBox jComboBoxid_formatoOrdenProduGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formatoOrdenProduGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formatoOrdenProduGenerico.getSelectedItem();
			}

			if(formatoAux!=null) {
				ordenprodu.setid_formato(formatoAux.getId());
				ordenprodu.setformato_descripcion(OrdenProduConstantesFunciones.getFormatoDescripcion(formatoAux));
				ordenprodu.setFormato(formatoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPrioridadEmpresaProduForeignKey(OrdenProdu ordenprodu,JComboBox jComboBoxid_tipo_prioridad_empresa_produOrdenProduGenerico)throws Exception
	{
		try
		{
			TipoPrioridadEmpresaProdu  tipoprioridadempresaproduAux=new TipoPrioridadEmpresaProdu();

			if(jComboBoxid_tipo_prioridad_empresa_produOrdenProduGenerico==null) {
				tipoprioridadempresaproduAux=(TipoPrioridadEmpresaProdu)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.getSelectedItem();
			} else {
				tipoprioridadempresaproduAux=(TipoPrioridadEmpresaProdu)jComboBoxid_tipo_prioridad_empresa_produOrdenProduGenerico.getSelectedItem();
			}

			if(tipoprioridadempresaproduAux!=null && tipoprioridadempresaproduAux.getId()!=null) {
				ordenprodu.setid_tipo_prioridad_empresa_produ(tipoprioridadempresaproduAux.getId());
				ordenprodu.settipoprioridadempresaprodu_descripcion(OrdenProduConstantesFunciones.getTipoPrioridadEmpresaProduDescripcion(tipoprioridadempresaproduAux));
				ordenprodu.setTipoPrioridadEmpresaProdu(tipoprioridadempresaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoResponsableForeignKey(OrdenProdu ordenprodu,JComboBox jComboBoxid_empleado_responsableOrdenProduGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleado_responsableOrdenProduGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleado_responsableOrdenProduGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				ordenprodu.setid_empleado_responsable(empleadoAux.getId());
				ordenprodu.setempleadoresponsable_descripcion(OrdenProduConstantesFunciones.getEmpleadoResponsableDescripcion(empleadoAux));
				ordenprodu.setEmpleadoResponsable(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(OrdenProdu ordenprodu,JComboBox jComboBoxid_clienteOrdenProduGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteOrdenProduGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteOrdenProduGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				ordenprodu.setid_cliente(clienteAux.getId());
				ordenprodu.setcliente_descripcion(OrdenProduConstantesFunciones.getClienteDescripcion(clienteAux));
				ordenprodu.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoOrdenProduForeignKey(OrdenProdu ordenprodu,JComboBox jComboBoxid_estado_orden_produOrdenProduGenerico)throws Exception
	{
		try
		{
			EstadoOrdenProdu  estadoordenproduAux=new EstadoOrdenProdu();

			if(jComboBoxid_estado_orden_produOrdenProduGenerico==null) {
				estadoordenproduAux=(EstadoOrdenProdu)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.getSelectedItem();
			} else {
				estadoordenproduAux=(EstadoOrdenProdu)jComboBoxid_estado_orden_produOrdenProduGenerico.getSelectedItem();
			}

			if(estadoordenproduAux!=null && estadoordenproduAux.getId()!=null) {
				ordenprodu.setid_estado_orden_produ(estadoordenproduAux.getId());
				ordenprodu.setestadoordenprodu_descripcion(OrdenProduConstantesFunciones.getEstadoOrdenProduDescripcion(estadoordenproduAux));
				ordenprodu.setEstadoOrdenProdu(estadoordenproduAux);			}
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

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
					}

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
					}

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
					}

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
					}

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.addItem(formato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
					}

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormato") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formatoFK_IdFormatoOrdenProdu.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jComboBoxid_formatoFK_IdFormatoOrdenProdu.addItem(formato);
							}
						}

						if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoPrioridadEmpresaProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.removeAllItems();

							for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:this.tipoprioridadempresaprodusForeignKey) {
								this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.addItem(tipoprioridadempresaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
					}

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoPrioridadEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.removeAllItems();

							for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:this.tipoprioridadempresaprodusForeignKey) {
								this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.addItem(tipoprioridadempresaprodu);
							}
						}

						if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadoResponsablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.removeAllItems();

							for(Empleado empleadoresponsable:this.empleadoresponsablesForeignKey) {
								this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.addItem(empleadoresponsable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
					}

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoResponsable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.removeAllItems();

							for(Empleado empleadoresponsable:this.empleadoresponsablesForeignKey) {
								this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.addItem(empleadoresponsable);
							}
						}

						if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
					}

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteOrdenProdu.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteOrdenProdu.addItem(cliente);
							}
						}

						if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoOrdenProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoOrdenProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.removeAllItems();

							for(EstadoOrdenProdu estadoordenprodu:this.estadoordenprodusForeignKey) {
								this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.addItem(estadoordenprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormOrdenProdu!=null) { 
					}

					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoOrdenProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.removeAllItems();

							for(EstadoOrdenProdu estadoordenprodu:this.estadoordenprodusForeignKey) {
								this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.addItem(estadoordenprodu);
							}
						}

						if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFormatoForeignKey(Formato formato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.setSelectedItem(formato);
						}
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formatoFK_IdFormatoOrdenProdu.setSelectedItem(formato);
						} else {
							this.jComboBoxid_formatoFK_IdFormatoOrdenProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoPrioridadEmpresaProduForeignKey(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setSelectedItem(tipoprioridadempresaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setSelectedItem(tipoprioridadempresaprodu);
						} else {
							this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoResponsableForeignKey(Empleado empleadoresponsable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.setSelectedItem(empleadoresponsable);
						}
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setSelectedItem(empleadoresponsable);
						} else {
							this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteOrdenProdu.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteOrdenProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoOrdenProduForeignKey(EstadoOrdenProdu estadoordenprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.setSelectedItem(estadoordenprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setSelectedItem(estadoordenprodu);
						} else {
							this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesOrdenProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			OrdenProduConstantesFunciones.refrescarForeignKeysDescripcionesOrdenProdu(this.ordenproduLogic.getOrdenProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			OrdenProduConstantesFunciones.refrescarForeignKeysDescripcionesOrdenProdu(this.ordenprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Formato.class));
		classes.add(new Classe(TipoPrioridadEmpresaProdu.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(EstadoOrdenProdu.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//ordenproduLogic.setOrdenProdus(this.ordenprodus);
			ordenproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public OrdenProduParameterReturnGeneral getOrdenProduParameterGeneral() {
		return this.ordenproduParameterGeneral;
	}
	
	public void setOrdenProduParameterGeneral(OrdenProduParameterReturnGeneral ordenproduParameterGeneral) {
		this.ordenproduParameterGeneral = ordenproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoOrdenProdu() {
		return isPermisoTodoOrdenProdu;
	}

	public void setIsPermisoTodoOrdenProdu(Boolean isPermisoTodoOrdenProdu) {
		this.isPermisoTodoOrdenProdu = isPermisoTodoOrdenProdu;
	}

	public Boolean getIsPermisoNuevoOrdenProdu() {
		return isPermisoNuevoOrdenProdu;
	}

	public void setIsPermisoNuevoOrdenProdu(Boolean isPermisoNuevoOrdenProdu) {
		this.isPermisoNuevoOrdenProdu = isPermisoNuevoOrdenProdu;
	}

	public Boolean getIsPermisoActualizarOrdenProdu() {
		return isPermisoActualizarOrdenProdu;
	}

	public void setIsPermisoActualizarOrdenProdu(Boolean isPermisoActualizarOrdenProdu) {
		this.isPermisoActualizarOrdenProdu = isPermisoActualizarOrdenProdu;
	}

	public Boolean getIsPermisoEliminarOrdenProdu() {
		return isPermisoEliminarOrdenProdu;
	}

	public void setIsPermisoEliminarOrdenProdu(Boolean isPermisoEliminarOrdenProdu) {
		this.isPermisoEliminarOrdenProdu = isPermisoEliminarOrdenProdu;
	}

	public Boolean getIsPermisoGuardarCambiosOrdenProdu() {
		return isPermisoGuardarCambiosOrdenProdu;
	}

	public void setIsPermisoGuardarCambiosOrdenProdu(Boolean isPermisoGuardarCambiosOrdenProdu) {
		this.isPermisoGuardarCambiosOrdenProdu = isPermisoGuardarCambiosOrdenProdu;
	}
	
	public Boolean getIsPermisoConsultaOrdenProdu() {
		return isPermisoConsultaOrdenProdu;
	}

	public void setIsPermisoConsultaOrdenProdu(Boolean isPermisoConsultaOrdenProdu) {
		this.isPermisoConsultaOrdenProdu = isPermisoConsultaOrdenProdu;
	}

	public Boolean getIsPermisoBusquedaOrdenProdu() {
		return isPermisoBusquedaOrdenProdu;
	}

	public void setIsPermisoBusquedaOrdenProdu(Boolean isPermisoBusquedaOrdenProdu) {
		this.isPermisoBusquedaOrdenProdu = isPermisoBusquedaOrdenProdu;
	}

	public Boolean getIsPermisoReporteOrdenProdu() {
		return isPermisoReporteOrdenProdu;
	}

	public void setIsPermisoReporteOrdenProdu(Boolean isPermisoReporteOrdenProdu) {
		this.isPermisoReporteOrdenProdu = isPermisoReporteOrdenProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioOrdenProdu() {
		return isPermisoPaginacionMedioOrdenProdu;
	}

	public void setIsPermisoPaginacionMedioOrdenProdu(Boolean isPermisoPaginacionMedioOrdenProdu) {
		this.isPermisoPaginacionMedioOrdenProdu = isPermisoPaginacionMedioOrdenProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoOrdenProdu() {
		return isPermisoPaginacionTodoOrdenProdu;
	}

	public void setIsPermisoPaginacionTodoOrdenProdu(Boolean isPermisoPaginacionTodoOrdenProdu) {
		this.isPermisoPaginacionTodoOrdenProdu = isPermisoPaginacionTodoOrdenProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoOrdenProdu() {
		return isPermisoPaginacionAltoOrdenProdu;
	}

	public void setIsPermisoPaginacionAltoOrdenProdu(Boolean isPermisoPaginacionAltoOrdenProdu) {
		this.isPermisoPaginacionAltoOrdenProdu = isPermisoPaginacionAltoOrdenProdu;
	}
	
	public Boolean getIsPermisoCopiarOrdenProdu() {
		return isPermisoCopiarOrdenProdu;
	}

	public void setIsPermisoCopiarOrdenProdu(Boolean isPermisoCopiarOrdenProdu) {
		this.isPermisoCopiarOrdenProdu = isPermisoCopiarOrdenProdu;
	}
	
	public Boolean getIsPermisoVerFormOrdenProdu() {
		return isPermisoVerFormOrdenProdu;
	}

	public void setIsPermisoVerFormOrdenProdu(Boolean isPermisoVerFormOrdenProdu) {
		this.isPermisoVerFormOrdenProdu = isPermisoVerFormOrdenProdu;
	}
	
	public Boolean getIsPermisoDuplicarOrdenProdu() {
		return isPermisoDuplicarOrdenProdu;
	}

	public void setIsPermisoDuplicarOrdenProdu(Boolean isPermisoDuplicarOrdenProdu) {
		this.isPermisoDuplicarOrdenProdu = isPermisoDuplicarOrdenProdu;
	}
	
	public Boolean getIsPermisoOrdenOrdenProdu() {
		return isPermisoOrdenOrdenProdu;
	}

	public void setIsPermisoOrdenOrdenProdu(Boolean isPermisoOrdenOrdenProdu) {
		this.isPermisoOrdenOrdenProdu = isPermisoOrdenOrdenProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoOrdenProdu() {
		return isVisibilidadCeldaNuevoOrdenProdu;
	}

	public void setIsVisibilidadCeldaNuevoOrdenProdu(Boolean isVisibilidadCeldaNuevoOrdenProdu) {
		this.isVisibilidadCeldaNuevoOrdenProdu = isVisibilidadCeldaNuevoOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarOrdenProdu() {
		return isVisibilidadCeldaDuplicarOrdenProdu;
	}

	public void setIsVisibilidadCeldaDuplicarOrdenProdu(Boolean isVisibilidadCeldaDuplicarOrdenProdu) {
		this.isVisibilidadCeldaDuplicarOrdenProdu = isVisibilidadCeldaDuplicarOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarOrdenProdu() {
		return isVisibilidadCeldaCopiarOrdenProdu;
	}

	public void setIsVisibilidadCeldaCopiarOrdenProdu(Boolean isVisibilidadCeldaCopiarOrdenProdu) {
		this.isVisibilidadCeldaCopiarOrdenProdu = isVisibilidadCeldaCopiarOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormOrdenProdu() {
		return isVisibilidadCeldaVerFormOrdenProdu;
	}

	public void setIsVisibilidadCeldaVerFormOrdenProdu(Boolean isVisibilidadCeldaVerFormOrdenProdu) {
		this.isVisibilidadCeldaVerFormOrdenProdu = isVisibilidadCeldaVerFormOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenOrdenProdu() {
		return isVisibilidadCeldaOrdenOrdenProdu;
	}

	public void setIsVisibilidadCeldaOrdenOrdenProdu(Boolean isVisibilidadCeldaOrdenOrdenProdu) {
		this.isVisibilidadCeldaOrdenOrdenProdu = isVisibilidadCeldaOrdenOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesOrdenProdu() {
		return isVisibilidadCeldaNuevoRelacionesOrdenProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesOrdenProdu(Boolean isVisibilidadCeldaNuevoRelacionesOrdenProdu) {
		this.isVisibilidadCeldaNuevoRelacionesOrdenProdu = isVisibilidadCeldaNuevoRelacionesOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarOrdenProdu() {
		return isVisibilidadCeldaModificarOrdenProdu;
	}

	public void setIsVisibilidadCeldaModificarOrdenProdu(Boolean isVisibilidadCeldaModificarOrdenProdu) {
		this.isVisibilidadCeldaModificarOrdenProdu = isVisibilidadCeldaModificarOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarOrdenProdu() {
		return isVisibilidadCeldaActualizarOrdenProdu;
	}

	public void setIsVisibilidadCeldaActualizarOrdenProdu(Boolean isVisibilidadCeldaActualizarOrdenProdu) {
		this.isVisibilidadCeldaActualizarOrdenProdu = isVisibilidadCeldaActualizarOrdenProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarOrdenProdu() {
		return isVisibilidadCeldaEliminarOrdenProdu;
	}

	public void setIsVisibilidadCeldaEliminarOrdenProdu(Boolean isVisibilidadCeldaEliminarOrdenProdu) {
		this.isVisibilidadCeldaEliminarOrdenProdu = isVisibilidadCeldaEliminarOrdenProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarOrdenProdu() {
		return isVisibilidadCeldaCancelarOrdenProdu;
	}

	public void setIsVisibilidadCeldaCancelarOrdenProdu(Boolean isVisibilidadCeldaCancelarOrdenProdu) {
		this.isVisibilidadCeldaCancelarOrdenProdu = isVisibilidadCeldaCancelarOrdenProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarOrdenProdu() {
		return isVisibilidadCeldaGuardarOrdenProdu;
	}

	public void setIsVisibilidadCeldaGuardarOrdenProdu(Boolean isVisibilidadCeldaGuardarOrdenProdu) {
		this.isVisibilidadCeldaGuardarOrdenProdu = isVisibilidadCeldaGuardarOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosOrdenProdu() {
		return isVisibilidadCeldaGuardarCambiosOrdenProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosOrdenProdu(Boolean isVisibilidadCeldaGuardarCambiosOrdenProdu) {
		this.isVisibilidadCeldaGuardarCambiosOrdenProdu = isVisibilidadCeldaGuardarCambiosOrdenProdu;
	}
		
	public OrdenProduSessionBean getordenproduSessionBean() {
		return this.ordenproduSessionBean;
	}
	
	public void setordenproduSessionBean(OrdenProduSessionBean ordenproduSessionBean) {
		this.ordenproduSessionBean=ordenproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpleadoResponsable() {
		return this.isVisibilidadFK_IdEmpleadoResponsable;
	}

	public void setisVisibilidadFK_IdEmpleadoResponsable(Boolean isVisibilidadFK_IdEmpleadoResponsable) {
		this.isVisibilidadFK_IdEmpleadoResponsable=isVisibilidadFK_IdEmpleadoResponsable;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoOrdenProdu() {
		return this.isVisibilidadFK_IdEstadoOrdenProdu;
	}

	public void setisVisibilidadFK_IdEstadoOrdenProdu(Boolean isVisibilidadFK_IdEstadoOrdenProdu) {
		this.isVisibilidadFK_IdEstadoOrdenProdu=isVisibilidadFK_IdEstadoOrdenProdu;
	}

	public Boolean getisVisibilidadFK_IdFormato() {
		return this.isVisibilidadFK_IdFormato;
	}

	public void setisVisibilidadFK_IdFormato(Boolean isVisibilidadFK_IdFormato) {
		this.isVisibilidadFK_IdFormato=isVisibilidadFK_IdFormato;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoPrioridadEmpresaProdu() {
		return this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu;
	}

	public void setisVisibilidadFK_IdTipoPrioridadEmpresaProdu(Boolean isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {
		this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isVisibilidadFK_IdTipoPrioridadEmpresaProdu;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(OrdenProdu ordenprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(ordenprodu,null);
				this.setActualParaGuardarSucursalForeignKey(ordenprodu,null);
				this.setActualParaGuardarEjercicioForeignKey(ordenprodu,null);
				this.setActualParaGuardarPeriodoForeignKey(ordenprodu,null);
				this.setActualParaGuardarFormatoForeignKey(ordenprodu,null);
				this.setActualParaGuardarTipoPrioridadEmpresaProduForeignKey(ordenprodu,null);
				this.setActualParaGuardarEmpleadoResponsableForeignKey(ordenprodu,null);
				this.setActualParaGuardarClienteForeignKey(ordenprodu,null);
				this.setActualParaGuardarEstadoOrdenProduForeignKey(ordenprodu,null);
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
	
	public void bugActualizarReferenciaActual(OrdenProdu ordenprodu,OrdenProdu ordenproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalOrdenProdu(ordenprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ordenproduAux.setId(ordenprodu.getId());
		ordenproduAux.setVersionRow(ordenprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessOrdenProdu();
		
			int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = ordenproduValidator.getInvalidValues(this.ordenprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			ordenproduLogic.setDatosCliente(datosCliente);
			ordenproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				ordenproduAux=new  OrdenProdu();
				
				ordenproduAux.setIsNew(true);
				ordenproduAux.setIsChanged(true);
				
				ordenproduAux.setOrdenProduOriginal(this.ordenprodu);
				
				ordenproduAux.setId(this.ordenprodu.getId());	
				ordenproduAux.setVersionRow(this.ordenprodu.getVersionRow());	
				ordenproduAux.setid_empresa(this.ordenprodu.getid_empresa());	
				ordenproduAux.setid_sucursal(this.ordenprodu.getid_sucursal());	
				ordenproduAux.setid_ejercicio(this.ordenprodu.getid_ejercicio());	
				ordenproduAux.setid_periodo(this.ordenprodu.getid_periodo());	
				ordenproduAux.setid_formato(this.ordenprodu.getid_formato());	
				ordenproduAux.setid_tipo_prioridad_empresa_produ(this.ordenprodu.getid_tipo_prioridad_empresa_produ());	
				ordenproduAux.setid_empleado_responsable(this.ordenprodu.getid_empleado_responsable());	
				ordenproduAux.setsecuencial(this.ordenprodu.getsecuencial());	
				ordenproduAux.setid_cliente(this.ordenprodu.getid_cliente());	
				ordenproduAux.setdireccion_cliente(this.ordenprodu.getdireccion_cliente());	
				ordenproduAux.settelefono_cliente(this.ordenprodu.gettelefono_cliente());	
				ordenproduAux.setruc_cliente(this.ordenprodu.getruc_cliente());	
				ordenproduAux.setlote(this.ordenprodu.getlote());	
				ordenproduAux.setfecha_pedido(this.ordenprodu.getfecha_pedido());	
				ordenproduAux.setfecha_entrega(this.ordenprodu.getfecha_entrega());	
				ordenproduAux.setes_uso_interno(this.ordenprodu.getes_uso_interno());	
				ordenproduAux.setfecha(this.ordenprodu.getfecha());	
				ordenproduAux.setdescripcion(this.ordenprodu.getdescripcion());	
				ordenproduAux.setid_estado_orden_produ(this.ordenprodu.getid_estado_orden_produ());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ordenproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ordenproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(ordenproduAux,ordenproduLogic.getOrdenProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ordenproduAux,ordenprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.ordenproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ordenproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.saveOrdenProdus();//WithConnection
						//ordenproduLogic.getSetVersionRowOrdenProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ordenprodu,ordenproduAux);
					
					this.refrescarForeignKeysDescripcionesOrdenProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ordenproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus().addAll(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodus.addAll(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodusEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ordenproduLogic.saveOrdenProduRelaciones(ordenproduAux,this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus());//WithConnection
								//ordenproduLogic.getSetVersionRowOrdenProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.ordenprodu,ordenproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.setOrdenDetaProdus(new ArrayList<OrdenDetaProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodus= new ArrayList<OrdenDetaProdu>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();}
							ordenproduAux.setOrdenDetaProdus(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.ordenproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.ordenproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(ordenproduAux,ordenproduLogic.getOrdenProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(ordenproduAux,ordenprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.ordenprodu,ordenproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				ordenproduAux=new  OrdenProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.ordenproduSessionBean.getEsGuardarRelacionado() 
					|| (this.ordenproduSessionBean.getEsGuardarRelacionado() && this.ordenprodu.getId()>=0)) {
						
					ordenproduAux.setIsNew(false);
				}
				
				ordenproduAux.setIsDeleted(false);
			
				ordenproduAux.setId(this.ordenprodu.getId());	
				ordenproduAux.setVersionRow(this.ordenprodu.getVersionRow());	
				ordenproduAux.setid_empresa(this.ordenprodu.getid_empresa());	
				ordenproduAux.setid_sucursal(this.ordenprodu.getid_sucursal());	
				ordenproduAux.setid_ejercicio(this.ordenprodu.getid_ejercicio());	
				ordenproduAux.setid_periodo(this.ordenprodu.getid_periodo());	
				ordenproduAux.setid_formato(this.ordenprodu.getid_formato());	
				ordenproduAux.setid_tipo_prioridad_empresa_produ(this.ordenprodu.getid_tipo_prioridad_empresa_produ());	
				ordenproduAux.setid_empleado_responsable(this.ordenprodu.getid_empleado_responsable());	
				ordenproduAux.setsecuencial(this.ordenprodu.getsecuencial());	
				ordenproduAux.setid_cliente(this.ordenprodu.getid_cliente());	
				ordenproduAux.setdireccion_cliente(this.ordenprodu.getdireccion_cliente());	
				ordenproduAux.settelefono_cliente(this.ordenprodu.gettelefono_cliente());	
				ordenproduAux.setruc_cliente(this.ordenprodu.getruc_cliente());	
				ordenproduAux.setlote(this.ordenprodu.getlote());	
				ordenproduAux.setfecha_pedido(this.ordenprodu.getfecha_pedido());	
				ordenproduAux.setfecha_entrega(this.ordenprodu.getfecha_entrega());	
				ordenproduAux.setes_uso_interno(this.ordenprodu.getes_uso_interno());	
				ordenproduAux.setfecha(this.ordenprodu.getfecha());	
				ordenproduAux.setdescripcion(this.ordenprodu.getdescripcion());	
				ordenproduAux.setid_estado_orden_produ(this.ordenprodu.getid_estado_orden_produ());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ordenproduAux,ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ordenproduAux,ordenprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.ordenproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ordenproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.saveOrdenProdus();//WithConnection
						//ordenproduLogic.getSetVersionRowOrdenProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ordenprodu,ordenproduAux);
					
					this.refrescarForeignKeysDescripcionesOrdenProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ordenproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus().addAll(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodus.addAll(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodusEliminados);
						}
						//ARCHITECTURE
						
						if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ordenproduLogic.saveOrdenProduRelaciones(ordenproduAux,this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus());//WithConnection
								//ordenproduLogic.getSetVersionRowOrdenProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.ordenprodu,ordenproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.setOrdenDetaProdus(new ArrayList<OrdenDetaProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodus= new ArrayList<OrdenDetaProdu>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();}
							ordenproduAux.setOrdenDetaProdus(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.ordenproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.ordenproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(ordenproduAux,ordenproduLogic.getOrdenProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(ordenproduAux,ordenprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.ordenprodu,ordenproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				ordenproduAux=new  OrdenProdu();
				
				ordenproduAux.setIsNew(false);
				ordenproduAux.setIsChanged(false);
				
				ordenproduAux.setIsDeleted(true);
				
				ordenproduAux.setId(this.ordenprodu.getId());	
				ordenproduAux.setVersionRow(this.ordenprodu.getVersionRow());	
				ordenproduAux.setid_empresa(this.ordenprodu.getid_empresa());	
				ordenproduAux.setid_sucursal(this.ordenprodu.getid_sucursal());	
				ordenproduAux.setid_ejercicio(this.ordenprodu.getid_ejercicio());	
				ordenproduAux.setid_periodo(this.ordenprodu.getid_periodo());	
				ordenproduAux.setid_formato(this.ordenprodu.getid_formato());	
				ordenproduAux.setid_tipo_prioridad_empresa_produ(this.ordenprodu.getid_tipo_prioridad_empresa_produ());	
				ordenproduAux.setid_empleado_responsable(this.ordenprodu.getid_empleado_responsable());	
				ordenproduAux.setsecuencial(this.ordenprodu.getsecuencial());	
				ordenproduAux.setid_cliente(this.ordenprodu.getid_cliente());	
				ordenproduAux.setdireccion_cliente(this.ordenprodu.getdireccion_cliente());	
				ordenproduAux.settelefono_cliente(this.ordenprodu.gettelefono_cliente());	
				ordenproduAux.setruc_cliente(this.ordenprodu.getruc_cliente());	
				ordenproduAux.setlote(this.ordenprodu.getlote());	
				ordenproduAux.setfecha_pedido(this.ordenprodu.getfecha_pedido());	
				ordenproduAux.setfecha_entrega(this.ordenprodu.getfecha_entrega());	
				ordenproduAux.setes_uso_interno(this.ordenprodu.getes_uso_interno());	
				ordenproduAux.setfecha(this.ordenprodu.getfecha());	
				ordenproduAux.setdescripcion(this.ordenprodu.getdescripcion());	
				ordenproduAux.setid_estado_orden_produ(this.ordenprodu.getid_estado_orden_produ());	
				
				if(this.ordenproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.ordenproduAux.getId()>=0) {	
						this.ordenprodusEliminados.add(ordenproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(ordenproduAux,ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ordenproduAux,ordenprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.ordenproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ordenproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.saveOrdenProdus();//WithConnection
						//ordenproduLogic.getSetVersionRowOrdenProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.ordenproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus().addAll(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodus.addAll(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodusEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodugastoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumanoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumaquinaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jInternalFrameDetalleFormOrdenDetaProdu.productoordendetaprodumermaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								ordenproduLogic.saveOrdenProduRelaciones(ordenproduAux,this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus());//WithConnection
								//ordenproduLogic.getSetVersionRowOrdenProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.setOrdenDetaProdus(new ArrayList<OrdenDetaProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodus= new ArrayList<OrdenDetaProdu>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.quitarFilaTotales();}
							ordenproduAux.setOrdenDetaProdus(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.ordenproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.ordenproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(ordenproduAux,ordenproduLogic.getOrdenProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(ordenproduAux,ordenprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getOrdenProdus().addAll(this.ordenprodusEliminados);
					
					ordenproduLogic.saveOrdenProdus();//WithConnection
					//ordenproduLogic.getSetVersionRowOrdenProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesOrdenProdu();
				
				this.ordenprodusEliminados= new ArrayList<OrdenProdu>();		
			}
			
			if(this.ordenproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Orden Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.ordenprodu=ordenproduAux;
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
      		//this.finishProcessOrdenProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(OrdenProdu ordenproduLocal) throws Exception {
		
		if(this.ordenproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				ordenproduLocal.setOrdenDetaProdus(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus());
			
			} else {
			
				ordenproduLocal.setOrdenDetaProdus(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaprodus);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(OrdenProdu ordenproduLocal) throws Exception {	
		if(this.ordenproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ordenproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				ordenproduLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				ordenproduLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				ordenproduLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoBeanSwingJInternalFrameLocal.getformato(),true);
				formatoBeanSwingJInternalFrameLocal.actualizarLista(formatoBeanSwingJInternalFrameLocal.formato,this.formatosForeignKey);

				formatoBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoBeanSwingJInternalFrameLocal.formato);

				ordenproduLocal.setFormato(formatoBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey("Formulario");
				this.setActualFormatoForeignKey(formatoBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoPrioridadEmpresaProduDetalleFormJInternalFrame.class)) {
				TipoPrioridadEmpresaProduBeanSwingJInternalFrame tipoprioridadempresaproduBeanSwingJInternalFrameLocal=(TipoPrioridadEmpresaProduBeanSwingJInternalFrame) ((TipoPrioridadEmpresaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprioridadempresaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPrioridadEmpresaProdu(tipoprioridadempresaproduBeanSwingJInternalFrameLocal.gettipoprioridadempresaprodu(),true);
				tipoprioridadempresaproduBeanSwingJInternalFrameLocal.actualizarLista(tipoprioridadempresaproduBeanSwingJInternalFrameLocal.tipoprioridadempresaprodu,this.tipoprioridadempresaprodusForeignKey);

				tipoprioridadempresaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprioridadempresaproduBeanSwingJInternalFrameLocal.tipoprioridadempresaprodu);

				ordenproduLocal.setTipoPrioridadEmpresaProdu(tipoprioridadempresaproduBeanSwingJInternalFrameLocal.tipoprioridadempresaprodu);

				this.addItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu();
				this.cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey("Formulario");
				this.setActualTipoPrioridadEmpresaProduForeignKey(tipoprioridadempresaproduBeanSwingJInternalFrameLocal.tipoprioridadempresaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoresponsableBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoresponsableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoresponsableBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoresponsableBeanSwingJInternalFrameLocal.actualizarLista(empleadoresponsableBeanSwingJInternalFrameLocal.empleado,this.empleadoresponsablesForeignKey);

				empleadoresponsableBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoresponsableBeanSwingJInternalFrameLocal.empleado);

				ordenproduLocal.setEmpleadoResponsable(empleadoresponsableBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleadoResponsable();
				this.cargarCombosFrameEmpleadoResponsablesForeignKey("Formulario");
				this.setActualEmpleadoResponsableForeignKey(empleadoresponsableBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				ordenproduLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoOrdenProduDetalleFormJInternalFrame.class)) {
				EstadoOrdenProduBeanSwingJInternalFrame estadoordenproduBeanSwingJInternalFrameLocal=(EstadoOrdenProduBeanSwingJInternalFrame) ((EstadoOrdenProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadoordenproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoOrdenProdu(estadoordenproduBeanSwingJInternalFrameLocal.getestadoordenprodu(),true);
				estadoordenproduBeanSwingJInternalFrameLocal.actualizarLista(estadoordenproduBeanSwingJInternalFrameLocal.estadoordenprodu,this.estadoordenprodusForeignKey);

				estadoordenproduBeanSwingJInternalFrameLocal.actualizarRelaciones(estadoordenproduBeanSwingJInternalFrameLocal.estadoordenprodu);

				ordenproduLocal.setEstadoOrdenProdu(estadoordenproduBeanSwingJInternalFrameLocal.estadoordenprodu);

				this.addItemDefectoCombosForeignKeyEstadoOrdenProdu();
				this.cargarCombosFrameEstadoOrdenProdusForeignKey("Formulario");
				this.setActualEstadoOrdenProduForeignKey(estadoordenproduBeanSwingJInternalFrameLocal.estadoordenprodu.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarOrdenProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ordenproduValidator.getInvalidValues(this.ordenprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(OrdenProdu ordenprodu,List<OrdenProdu> ordenprodus) throws Exception {
		try	{		
			OrdenProduConstantesFunciones.actualizarLista(ordenprodu,ordenprodus,this.ordenproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(OrdenProdu ordenprodu,List<OrdenProdu> ordenprodus) throws Exception {
		try	{			
			OrdenProduConstantesFunciones.actualizarSelectedLista(ordenprodu,ordenprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<OrdenProdu> ordenprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ordenprodusLocal=this.ordenproduLogic.getOrdenProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ordenprodusLocal=this.ordenprodus;
			}
			//ARCHITECTURE
		
			for(OrdenProdu ordenproduLocal:ordenprodusLocal) {
				if(this.permiteMantenimiento(ordenproduLocal) && ordenproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+OrdenProduConstantesFunciones.getOrdenProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_empresaOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_sucursalOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_ejercicioOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_periodoOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.IDFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_formatoOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.IDTIPOPRIORIDADEMPRESAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_tipo_prioridad_empresa_produOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.IDEMPLEADORESPONSABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_empleado_responsableOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelsecuencialOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_clienteOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.DIRECCIONCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabeldireccion_clienteOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.TELEFONOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabeltelefono_clienteOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.RUCCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelruc_clienteOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.LOTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelloteOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.FECHAPEDIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelfecha_pedidoOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.FECHAENTREGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelfecha_entregaOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.ESUSOINTERNO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabeles_uso_internoOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelfechaOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabeldescripcionOrdenProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(OrdenProduConstantesFunciones.IDESTADOORDENPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_estado_orden_produOrdenProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_empresaOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_sucursalOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_ejercicioOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_periodoOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_formatoOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_tipo_prioridad_empresa_produOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_empleado_responsableOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelsecuencialOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_clienteOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabeldireccion_clienteOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabeltelefono_clienteOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelruc_clienteOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelloteOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelfecha_pedidoOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelfecha_entregaOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabeles_uso_internoOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelfechaOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabeldescripcionOrdenProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormOrdenProdu.jLabelid_estado_orden_produOrdenProdu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("OrdenDetaProdu")) {
			if(this.ordenprodu==null) {
				this.ordenprodu= new OrdenProdu();
			}

			if(this.ordenproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoOrdenProdu
				this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);

				this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.getordendetaprodu().setOrdenProdu(this.ordenprodu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoOrdenProdu--;	
		
		
		this.ordenproduAux=new OrdenProdu();
		
		this.ordenproduAux.setId(this.iIdNuevoOrdenProdu);
		this.ordenproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ordenproduLogic.getOrdenProdus().add(this.ordenproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ordenprodus.add(this.ordenproduAux);
		}
		//ARCHITECTURE
		
		this.ordenprodu=this.ordenproduAux;
		
		if(OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioOrdenProdu(this.ordenprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyOrdenProdu(this.ordenprodu);
		}
				
		//this.setDefaultControlesOrdenProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyOrdenProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyOrdenProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyOrdenProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualOrdenProdu(this.ordenproduBean,this.ordenprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(OrdenProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.ordenproduSessionBean.getConGuardarRelaciones()) {
			classes=OrdenProduConstantesFunciones.getClassesRelationshipsOfOrdenProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.ordenproduReturnGeneral=ordenproduLogic.procesarEventosOrdenProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ordenproduLogic.getOrdenProdus(),this.ordenprodu,this.ordenproduParameterGeneral,this.isEsNuevoOrdenProdu,classes);//this.ordenproduLogic.getOrdenProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanOrdenProdu(this.ordenproduReturnGeneral,this.ordenproduBean,false);
		
		if(this.ordenproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyOrdenProdu(this.ordenproduReturnGeneral.getOrdenProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioOrdenProdu(this.ordenproduReturnGeneral.getOrdenProdu());
		}
		
		if(this.ordenproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioOrdenProdu(this.ordenproduReturnGeneral.getOrdenProdu(),classes);//this.ordenproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyOrdenProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyOrdenProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			OrdenProduBeanSwingJInternalFrameAdditional.RecargarFormOrdenProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingOrdenProdu(false);
						
			if(ordenproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduSessionBean.getEsGuardarRelacionado() && OrdenDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOrdenDetaProduActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualOrdenProdu();
			}
			
			this.actualizarVisualTableDatosOrdenProdu();
			
			this.jTableDatosOrdenProdu.setRowSelectionInterval(this.getIndiceNuevoOrdenProdu(), this.getIndiceNuevoOrdenProdu());
			
			this.seleccionarFilaTablaOrdenProduActual();
						
			this.actualizarEstadoCeldasBotonesOrdenProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesOrdenProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormOrdenProdu.jTextFieldsecuencialOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarsecuencialOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextAreadireccion_clienteOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activardireccion_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextFieldtelefono_clienteOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activartelefono_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextFieldruc_clienteOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarruc_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextFieldloteOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarloteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_pedidoOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarfecha_pedidoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_entregaOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarfecha_entregaOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxes_uso_internoOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activares_uso_internoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfechaOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarfechaOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextAreadescripcionOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activardescripcionOrdenProdu);	
		//
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarid_empresaOrdenProdu);//
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarid_sucursalOrdenProdu);//
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarid_ejercicioOrdenProdu);//
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarid_periodoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarid_formatoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarid_tipo_prioridad_empresa_produOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarid_empleado_responsableOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarid_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.setEnabled(isHabilitar && this.ordenproduConstantesFunciones.activarid_estado_orden_produOrdenProdu);
	};
	
	public void setDefaultControlesOrdenProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoOrdenProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ordenproduSessionBean.setConGuardarRelaciones(true);			
			this.ordenproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormOrdenProdu.jTabbedPaneRelacionesOrdenProdu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.ordenproduSessionBean.setConGuardarRelaciones(false);			
			this.ordenproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormOrdenProdu.jTabbedPaneRelacionesOrdenProdu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoOrdenProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(OrdenProdu ordenproduAux:this.ordenproduLogic.getOrdenProdus()) {
				if(ordenproduAux.getId().equals(this.iIdNuevoOrdenProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(OrdenProdu ordenproduAux:this.ordenprodus) {
				if(ordenproduAux.getId().equals(this.iIdNuevoOrdenProdu)) {
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
	
	public int getIndiceActualOrdenProdu(OrdenProdu ordenprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(OrdenProdu ordenproduAux:this.ordenproduLogic.getOrdenProdus()) {
				if(ordenproduAux.getId().equals(ordenprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(OrdenProdu ordenproduAux:this.ordenprodus) {
				if(ordenproduAux.getId().equals(ordenprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalOrdenProdu(OrdenProdu ordenproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(OrdenProdu ordenproduAux:this.ordenproduLogic.getOrdenProdus()) {
				if(ordenproduAux.getOrdenProduOriginal().getId().equals(ordenproduOriginal.getId())) {
					existe=true;
					ordenproduOriginal.setId(ordenproduAux.getId());
					ordenproduOriginal.setVersionRow(ordenproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(OrdenProdu ordenproduAux:this.ordenprodus) {
				if(ordenproduAux.getOrdenProduOriginal().getId().equals(ordenproduOriginal.getId())) {
					existe=true;
					ordenproduOriginal.setId(ordenproduAux.getId());
					ordenproduOriginal.setVersionRow(ordenproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosOrdenProdu(Boolean esParaCancelar) throws Exception {
		ordenprodusAux=new ArrayList<OrdenProdu>();
		ordenproduAux=new OrdenProdu();
		
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(OrdenProdu ordenproduAux:this.ordenproduLogic.getOrdenProdus()) {
					if(ordenproduAux.getId()<0) {
						ordenprodusAux.add(ordenproduAux);
					}		
				}
				this.iIdNuevoOrdenProdu=0L;
				this.ordenproduLogic.getOrdenProdus().removeAll(ordenprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(OrdenProdu ordenproduAux:this.ordenprodus) {
					if(ordenproduAux.getId()<0) {
						ordenprodusAux.add(ordenproduAux);
					}		
				}
				this.iIdNuevoOrdenProdu=0L;
				this.ordenprodus.removeAll(ordenprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoOrdenProdu 
					&& this.ordenproduLogic.getOrdenProdus().size()>0
					) {
					ordenproduAux=this.ordenproduLogic.getOrdenProdus().get(this.ordenproduLogic.getOrdenProdus().size() - 1);
				
					if(ordenproduAux.getId()<0) {
						this.ordenproduLogic.getOrdenProdus().remove(ordenproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoOrdenProdu && this.ordenprodus.size()>0) {
					ordenproduAux=this.ordenprodus.get(this.ordenprodus.size() - 1);
				
					if(ordenproduAux.getId()<0) {
						this.ordenprodus.remove(ordenproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoOrdenProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ordenprodu.getId()<0) {
				this.ordenproduLogic.getOrdenProdus().remove(this.ordenprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ordenprodu.getId()<0) {
				this.ordenprodus.remove(this.ordenprodu);
			}
		}			
	}
	
	public void setEstadosInicialesOrdenProdu(List<OrdenProdu> ordenprodusAux) throws Exception {
		OrdenProduConstantesFunciones.setEstadosInicialesOrdenProdu(ordenprodusAux);
	}
	
	public void setEstadosInicialesOrdenProdu(OrdenProdu ordenproduAux) throws Exception {
		OrdenProduConstantesFunciones.setEstadosInicialesOrdenProdu(ordenproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarOrdenProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarOrdenProduActual()) {
				if(!this.isEsNuevoOrdenProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoOrdenProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarOrdenProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Orden Produccion ?", "MANTENIMIENTO DE Orden Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(OrdenProdu ordenprodu) throws Exception {
		OrdenProduConstantesFunciones.seleccionarAsignar(this.ordenprodu,ordenprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarOrdenProdu=this.isPermisoActualizarOriginalOrdenProdu;
			
			
			this.seleccionarAsignar(ordenprodu);
			
			

			idClienteActual=ordenprodu.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			OrdenProduConstantesFunciones.quitarEspaciosOrdenProdu(this.ordenprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesOrdenProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ordenproduSessionBean.setsFuncionBusquedaRapida(this.ordenproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoOrdenProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosOrdenProdu(esParaCancelar);				
				this.cancelarNuevoOrdenProdu(esParaCancelar);								
			}
			
			this.ordenprodu=new OrdenProdu();
			
			this.inicializarOrdenProdu();
			
			this.actualizarEstadoCeldasBotonesOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarOrdenProdu() throws Exception {
		try {
			OrdenProduConstantesFunciones.inicializarOrdenProdu(this.ordenprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ordenproduLogic.getOrdenProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteOrdenProdus(String sAccionBusqueda,List<OrdenProdu> ordenprodusParaReportes) throws Exception {
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
					sPathReporteFinal="OrdenProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="OrdenProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("OrdenProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="OrdenProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Orden Producciones");		
		parameters.put("busquedapor", OrdenProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(OrdenDetaProdu.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					OrdenProduLogic ordenproduLogicAuxiliar=new OrdenProduLogic();
					ordenproduLogicAuxiliar.setDatosCliente(ordenproduLogic.getDatosCliente());				
					ordenproduLogicAuxiliar.setOrdenProdus(ordenprodusParaReportes);
					
					ordenproduLogicAuxiliar.cargarRelacionesLoteForeignKeyOrdenProduWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					ordenprodusParaReportes=ordenproduLogicAuxiliar.getOrdenProdus();
					
					//ordenproduLogic.getNewConnexionToDeep();
					
					//for (OrdenProdu ordenprodu:ordenprodusParaReportes) {
					//	ordenproduLogic.deepLoad(ordenprodu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//ordenproduLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//ordenproduLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileOrdenDetaProdu = AuxiliarReportes.class.getResourceAsStream("OrdenDetaProduDetalleRelacionesDesign.jasper");
			parameters.put("subreport_ordendetaprodu", reportFileOrdenDetaProdu);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceOrdenProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			OrdenProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			OrdenProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceOrdenProdu=new JRBeanArrayDataSource(OrdenProduJInternalFrame.TraerOrdenProduBeans(ordenprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceOrdenProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+OrdenProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+OrdenProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(OrdenProduBean.TraerOrdenProduBeans(ordenprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,ordenprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,ordenprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoOrdenProduActionPerformed(null);
					//this.generarExcelReporteOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,ordenprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,ordenprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,ordenprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,ordenprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteOrdenProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<OrdenProdu> ordenprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ordenprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("OrdenProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderOrdenProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(OrdenProdu ordenprodu : ordenprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			OrdenProduConstantesFunciones.generarExcelReporteDataOrdenProdu("NORMAL",row,workbook,ordenprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderOrdenProdu(String sTipo,Row row,Workbook workbook) {
		
		OrdenProduConstantesFunciones.generarExcelReporteHeaderOrdenProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalOrdenProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<OrdenProdu> ordenprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ordenprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("OrdenProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(OrdenProdu ordenprodu : ordenprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(OrdenProduConstantesFunciones.getOrdenProduDescripcion(ordenprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_IDFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.gettipoprioridadempresaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getempleadoresponsable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getdireccion_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.gettelefono_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_RUCCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_RUCCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getruc_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_LOTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_LOTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getlote());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getfecha_pedido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_FECHAENTREGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_FECHAENTREGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getfecha_entrega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(ordenprodu.getes_uso_interno()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ordenprodu.getestadoordenprodu_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesOrdenProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<OrdenProdu> ordenprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<OrdenProdu> ordenprodusRespaldo=null;
		
		classes=OrdenProduConstantesFunciones.getClassesRelationshipsOfOrdenProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ordenproduLogic.setDatosCliente(this.datosCliente);
		this.ordenproduLogic.setDatosDeep(this.datosDeep);
		this.ordenproduLogic.setIsConDeep(true);
		
		ordenprodusRespaldo=this.ordenproduLogic.getOrdenProdus();
		
		this.ordenproduLogic.setOrdenProdus(ordenprodusParaReportes);	
		this.ordenproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ordenprodusParaReportes=this.ordenproduLogic.getOrdenProdus();
		this.ordenproduLogic.setOrdenProdus(ordenprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ordenprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("OrdenProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderOrdenProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(OrdenProdu ordenprodu : ordenprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderOrdenProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			OrdenProduConstantesFunciones.generarExcelReporteDataOrdenProdu("NORMAL",row,workbook,ordenprodu,cellStyleDataAux);
		
			
			


				//OrdenDetaProdu
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO))) {

				if(ordenprodu.getOrdenDetaProdus()!=null && ordenprodu.getOrdenDetaProdus().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					OrdenDetaProduConstantesFunciones.generarExcelReporteHeaderOrdenDetaProdu("RELACIONADO",row,workbook);
				}

				if(ordenprodu.getOrdenDetaProdus()!=null) {
					i2=0;
					for(OrdenDetaProdu ordendetaprodu : ordenprodu.getOrdenDetaProdus()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						OrdenDetaProduConstantesFunciones.generarExcelReporteDataOrdenDetaProdu("RELACIONADO",row,workbook,ordendetaprodu,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(OrdenProduConstantesFunciones.getOrdenProduDescripcion(ordenprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoOrdenProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessOrdenProdu() throws Exception {		
		this.startProcessOrdenProdu(true);
	}
	
	public void startProcessOrdenProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasOrdenProdu ,this.jPanelParametrosReportesOrdenProdu, this.jScrollPanelDatosOrdenProdu,this.jPanelPaginacionOrdenProdu, this.jScrollPanelDatosEdicionOrdenProdu, this.jPanelAccionesOrdenProdu,this.jPanelAccionesFormularioOrdenProdu,this.jmenuBarOrdenProdu,this.jmenuBarDetalleOrdenProdu,this.jTtoolBarOrdenProdu,this.jTtoolBarDetalleOrdenProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasOrdenProdu=this.jTabbedPaneBusquedasOrdenProdu; 
		
		final JPanel jPanelParametrosReportesOrdenProdu=this.jPanelParametrosReportesOrdenProdu;
		//final JScrollPane jScrollPanelDatosOrdenProdu=this.jScrollPanelDatosOrdenProdu;
		final JTable jTableDatosOrdenProdu=this.jTableDatosOrdenProdu;		
		final JPanel jPanelPaginacionOrdenProdu=this.jPanelPaginacionOrdenProdu;
		//final JScrollPane jScrollPanelDatosEdicionOrdenProdu=this.jScrollPanelDatosEdicionOrdenProdu;
		final JPanel jPanelAccionesOrdenProdu=this.jPanelAccionesOrdenProdu;
		
		JPanel jPanelCamposAuxiliarOrdenProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarOrdenProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			jPanelCamposAuxiliarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jPanelCamposOrdenProdu;
			jPanelAccionesFormularioAuxiliarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jPanelAccionesFormularioOrdenProdu;
		}
		
		final JPanel jPanelCamposOrdenProdu=jPanelCamposAuxiliarOrdenProdu;
		final JPanel jPanelAccionesFormularioOrdenProdu=jPanelAccionesFormularioAuxiliarOrdenProdu;
		
		
		final JMenuBar jmenuBarOrdenProdu=this.jmenuBarOrdenProdu;
		final JToolBar jTtoolBarOrdenProdu=this.jTtoolBarOrdenProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarOrdenProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarOrdenProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			jmenuBarDetalleAuxiliarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jmenuBarDetalleOrdenProdu;
			jTtoolBarDetalleAuxiliarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jTtoolBarDetalleOrdenProdu;
		}
		
		final JMenuBar jmenuBarDetalleOrdenProdu=jmenuBarDetalleAuxiliarOrdenProdu;
		final JToolBar jTtoolBarDetalleOrdenProdu=jTtoolBarDetalleAuxiliarOrdenProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasOrdenProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesOrdenProdu;
			processRunnable.jTableDatos=jTableDatosOrdenProdu;
			processRunnable.jPanelCampos=jPanelCamposOrdenProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionOrdenProdu;
			processRunnable.jPanelAcciones=jPanelAccionesOrdenProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioOrdenProdu;
			
			
			processRunnable.jmenuBar=jmenuBarOrdenProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleOrdenProdu;
			processRunnable.jTtoolBar=jTtoolBarOrdenProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleOrdenProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasOrdenProdu ,jPanelParametrosReportesOrdenProdu,jTableDatosOrdenProdu, /*jScrollPanelDatosOrdenProdu,*/jPanelCamposOrdenProdu,jPanelPaginacionOrdenProdu, /*jScrollPanelDatosEdicionOrdenProdu,*/ jPanelAccionesOrdenProdu,jPanelAccionesFormularioOrdenProdu,jmenuBarOrdenProdu,jmenuBarDetalleOrdenProdu,jTtoolBarOrdenProdu,jTtoolBarDetalleOrdenProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasOrdenProdu ,jPanelParametrosReportesOrdenProdu, jScrollPanelDatosOrdenProdu,jPanelPaginacionOrdenProdu, jScrollPanelDatosEdicionOrdenProdu, jPanelAccionesOrdenProdu,jPanelAccionesFormularioOrdenProdu,jmenuBarOrdenProdu,jmenuBarDetalleOrdenProdu,jTtoolBarOrdenProdu,jTtoolBarDetalleOrdenProdu);
						
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
	
	public void finishProcessOrdenProdu() {// throws Exception 
		this.finishProcessOrdenProdu(true);
	}
	
	public void finishProcessOrdenProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasOrdenProdu ,this.jPanelParametrosReportesOrdenProdu, this.jScrollPanelDatosOrdenProdu,this.jPanelPaginacionOrdenProdu, this.jScrollPanelDatosEdicionOrdenProdu, this.jPanelAccionesOrdenProdu,this.jPanelAccionesFormularioOrdenProdu,this.jmenuBarOrdenProdu,this.jmenuBarDetalleOrdenProdu,this.jTtoolBarOrdenProdu,this.jTtoolBarDetalleOrdenProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasOrdenProdu=this.jTabbedPaneBusquedasOrdenProdu; 
		
		final JPanel jPanelParametrosReportesOrdenProdu=this.jPanelParametrosReportesOrdenProdu;
		//final JScrollPane jScrollPanelDatosOrdenProdu=this.jScrollPanelDatosOrdenProdu;
		final JTable jTableDatosOrdenProdu=this.jTableDatosOrdenProdu;		
		final JPanel jPanelPaginacionOrdenProdu=this.jPanelPaginacionOrdenProdu;
		//final JScrollPane jScrollPanelDatosEdicionOrdenProdu=this.jScrollPanelDatosEdicionOrdenProdu;
		final JPanel jPanelAccionesOrdenProdu=this.jPanelAccionesOrdenProdu;
		
		JPanel jPanelCamposAuxiliarOrdenProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarOrdenProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			jPanelCamposAuxiliarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jPanelCamposOrdenProdu;
			jPanelAccionesFormularioAuxiliarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jPanelAccionesFormularioOrdenProdu;
		}
		
		final JPanel jPanelCamposOrdenProdu=jPanelCamposAuxiliarOrdenProdu;
		final JPanel jPanelAccionesFormularioOrdenProdu=jPanelAccionesFormularioAuxiliarOrdenProdu;
		
		
		final JMenuBar jmenuBarOrdenProdu=this.jmenuBarOrdenProdu;		
		final JToolBar jTtoolBarOrdenProdu=this.jTtoolBarOrdenProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarOrdenProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarOrdenProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			jmenuBarDetalleAuxiliarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jmenuBarDetalleOrdenProdu;
			jTtoolBarDetalleAuxiliarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jTtoolBarDetalleOrdenProdu;		
		}
		
		final JMenuBar jmenuBarDetalleOrdenProdu=jmenuBarDetalleAuxiliarOrdenProdu;
		final JToolBar jTtoolBarDetalleOrdenProdu=jTtoolBarDetalleAuxiliarOrdenProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasOrdenProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesOrdenProdu;
			processRunnable.jTableDatos=jTableDatosOrdenProdu;
			processRunnable.jPanelCampos=jPanelCamposOrdenProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionOrdenProdu;
			processRunnable.jPanelAcciones=jPanelAccionesOrdenProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioOrdenProdu;
			
			
			processRunnable.jmenuBar=jmenuBarOrdenProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleOrdenProdu;
			processRunnable.jTtoolBar=jTtoolBarOrdenProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleOrdenProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasOrdenProdu ,jPanelParametrosReportesOrdenProdu, jTableDatosOrdenProdu,/*jScrollPanelDatosOrdenProdu,*/jPanelCamposOrdenProdu,jPanelPaginacionOrdenProdu, /*jScrollPanelDatosEdicionOrdenProdu,*/ jPanelAccionesOrdenProdu,jPanelAccionesFormularioOrdenProdu,jmenuBarOrdenProdu,jmenuBarDetalleOrdenProdu,jTtoolBarOrdenProdu,jTtoolBarDetalleOrdenProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesOrdenProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarOrdenProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuOrdenProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarOrdenProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarOrdenProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleOrdenProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuOrdenProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarOrdenProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleOrdenProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ordenproduConstantesFunciones.getsFinalQueryOrdenProdu();
		String  finalQueryPaginacionTodos=this.ordenproduConstantesFunciones.getsFinalQueryOrdenProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=OrdenProduConstantesFunciones.getArrayColumnasGlobalesNoOrdenProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=OrdenProduConstantesFunciones.getArrayColumnasGlobalesOrdenProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,OrdenProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ordenprodusEliminados= new ArrayList<OrdenProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessOrdenProdu();
		
				///*OrdenProduSessionBean*/this.ordenproduSessionBean=new OrdenProduSessionBean();
			
			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
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
					this.iNumeroPaginacion=OrdenProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=OrdenProduConstantesFunciones.getClassesForeignKeysOfOrdenProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ordenprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ordenprodusAux= new ArrayList<OrdenProdu>();
			
				
			ordenproduLogic.setDatosCliente(this.datosCliente);
			ordenproduLogic.setDatosDeep(this.datosDeep);
			ordenproduLogic.setIsConDeep(true);
			
			
			ordenproduLogic.getOrdenProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					ordenproduLogic.getTodosOrdenProdus(finalQueryGlobal,pagination);
					
					//ordenproduLogic.getTodosOrdenProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(ordenproduLogic.getOrdenProdus()==null|| ordenproduLogic.getOrdenProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ordenprodusAux= new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenproduLogic.getOrdenProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodusAux= new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ordenproduLogic.getTodosOrdenProdus(finalQueryGlobal+"",this.pagination);												
							
							//ordenproduLogic.getTodosOrdenProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteOrdenProdus("Todos",ordenproduLogic.getOrdenProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());					
							ordenproduLogic.getOrdenProdus().addAll(ordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodus=new ArrayList<OrdenProdu>();
							ordenprodus.addAll(ordenprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idOrdenProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idOrdenProdu=this.idActual;
				
				} else if(this.idOrdenProduActual!=null && this.idOrdenProduActual!=0L) {
					idOrdenProdu=idOrdenProduActual;
				}
				
					
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndicePorId(idOrdenProdu);
				
				this.ordenprodus=new ArrayList<OrdenProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					ordenproduLogic.getEntity(idOrdenProdu);
					
					//ordenproduLogic.getEntityWithConnection(idOrdenProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
					ordenproduLogic.getOrdenProdus().add(ordenproduLogic.getOrdenProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodus=new ArrayList<OrdenProdu>();
					this.ordenprodus.add(ordenprodu);
				}
				
				if(ordenproduLogic.getOrdenProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ordenproduLogic.getOrdenProdusFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ordenproduLogic.getOrdenProdus()==null||ordenproduLogic.getOrdenProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ordenprodus==null|| ordenprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenprodusAux=new ArrayList<OrdenProdu>();
						ordenprodusAux.addAll(ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodusAux=new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ordenproduLogic.getOrdenProdusFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOrdenProdus("FK_IdCliente",ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOrdenProdus("FK_IdCliente",ordenprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
						ordenproduLogic.getOrdenProdus().addAll(ordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodus=new ArrayList<OrdenProdu>();
							ordenprodus.addAll(ordenprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ordenproduLogic.getOrdenProdusFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ordenproduLogic.getOrdenProdus()==null||ordenproduLogic.getOrdenProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ordenprodus==null|| ordenprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenprodusAux=new ArrayList<OrdenProdu>();
						ordenprodusAux.addAll(ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodusAux=new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ordenproduLogic.getOrdenProdusFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOrdenProdus("FK_IdEjercicio",ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOrdenProdus("FK_IdEjercicio",ordenprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
						ordenproduLogic.getOrdenProdus().addAll(ordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodus=new ArrayList<OrdenProdu>();
							ordenprodus.addAll(ordenprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleadoResponsable")) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEmpleadoResponsable(id_empleado_responsableFK_IdEmpleadoResponsable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ordenproduLogic.getOrdenProdusFK_IdEmpleadoResponsable(finalQueryGlobal,pagination,id_empleado_responsableFK_IdEmpleadoResponsable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEmpleadoResponsable(id_empleado_responsableFK_IdEmpleadoResponsable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEmpleadoResponsable(id_empleado_responsableFK_IdEmpleadoResponsable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ordenproduLogic.getOrdenProdus()==null||ordenproduLogic.getOrdenProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ordenprodus==null|| ordenprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenprodusAux=new ArrayList<OrdenProdu>();
						ordenprodusAux.addAll(ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodusAux=new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ordenproduLogic.getOrdenProdusFK_IdEmpleadoResponsable(finalQueryGlobal,pagination,id_empleado_responsableFK_IdEmpleadoResponsable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEmpleadoResponsable(id_empleado_responsableFK_IdEmpleadoResponsable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEmpleadoResponsable(id_empleado_responsableFK_IdEmpleadoResponsable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOrdenProdus("FK_IdEmpleadoResponsable",ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOrdenProdus("FK_IdEmpleadoResponsable",ordenprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
						ordenproduLogic.getOrdenProdus().addAll(ordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodus=new ArrayList<OrdenProdu>();
							ordenprodus.addAll(ordenprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ordenproduLogic.getOrdenProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ordenproduLogic.getOrdenProdus()==null||ordenproduLogic.getOrdenProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ordenprodus==null|| ordenprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenprodusAux=new ArrayList<OrdenProdu>();
						ordenprodusAux.addAll(ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodusAux=new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ordenproduLogic.getOrdenProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOrdenProdus("FK_IdEmpresa",ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOrdenProdus("FK_IdEmpresa",ordenprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
						ordenproduLogic.getOrdenProdus().addAll(ordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodus=new ArrayList<OrdenProdu>();
							ordenprodus.addAll(ordenprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoOrdenProdu")) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEstadoOrdenProdu(id_estado_orden_produFK_IdEstadoOrdenProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ordenproduLogic.getOrdenProdusFK_IdEstadoOrdenProdu(finalQueryGlobal,pagination,id_estado_orden_produFK_IdEstadoOrdenProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEstadoOrdenProdu(id_estado_orden_produFK_IdEstadoOrdenProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEstadoOrdenProdu(id_estado_orden_produFK_IdEstadoOrdenProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ordenproduLogic.getOrdenProdus()==null||ordenproduLogic.getOrdenProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ordenprodus==null|| ordenprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenprodusAux=new ArrayList<OrdenProdu>();
						ordenprodusAux.addAll(ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodusAux=new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ordenproduLogic.getOrdenProdusFK_IdEstadoOrdenProdu(finalQueryGlobal,pagination,id_estado_orden_produFK_IdEstadoOrdenProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEstadoOrdenProdu(id_estado_orden_produFK_IdEstadoOrdenProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdEstadoOrdenProdu(id_estado_orden_produFK_IdEstadoOrdenProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOrdenProdus("FK_IdEstadoOrdenProdu",ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOrdenProdus("FK_IdEstadoOrdenProdu",ordenprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
						ordenproduLogic.getOrdenProdus().addAll(ordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodus=new ArrayList<OrdenProdu>();
							ordenprodus.addAll(ordenprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormato")) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ordenproduLogic.getOrdenProdusFK_IdFormato(finalQueryGlobal,pagination,id_formatoFK_IdFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ordenproduLogic.getOrdenProdus()==null||ordenproduLogic.getOrdenProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ordenprodus==null|| ordenprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenprodusAux=new ArrayList<OrdenProdu>();
						ordenprodusAux.addAll(ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodusAux=new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ordenproduLogic.getOrdenProdusFK_IdFormato(finalQueryGlobal,pagination,id_formatoFK_IdFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOrdenProdus("FK_IdFormato",ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOrdenProdus("FK_IdFormato",ordenprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
						ordenproduLogic.getOrdenProdus().addAll(ordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodus=new ArrayList<OrdenProdu>();
							ordenprodus.addAll(ordenprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ordenproduLogic.getOrdenProdusFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ordenproduLogic.getOrdenProdus()==null||ordenproduLogic.getOrdenProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ordenprodus==null|| ordenprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenprodusAux=new ArrayList<OrdenProdu>();
						ordenprodusAux.addAll(ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodusAux=new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ordenproduLogic.getOrdenProdusFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOrdenProdus("FK_IdPeriodo",ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOrdenProdus("FK_IdPeriodo",ordenprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
						ordenproduLogic.getOrdenProdus().addAll(ordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodus=new ArrayList<OrdenProdu>();
							ordenprodus.addAll(ordenprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ordenproduLogic.getOrdenProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ordenproduLogic.getOrdenProdus()==null||ordenproduLogic.getOrdenProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ordenprodus==null|| ordenprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenprodusAux=new ArrayList<OrdenProdu>();
						ordenprodusAux.addAll(ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodusAux=new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ordenproduLogic.getOrdenProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOrdenProdus("FK_IdSucursal",ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOrdenProdus("FK_IdSucursal",ordenprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
						ordenproduLogic.getOrdenProdus().addAll(ordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodus=new ArrayList<OrdenProdu>();
							ordenprodus.addAll(ordenprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoPrioridadEmpresaProdu")) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdTipoPrioridadEmpresaProdu(id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ordenproduLogic.getOrdenProdusFK_IdTipoPrioridadEmpresaProdu(finalQueryGlobal,pagination,id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdTipoPrioridadEmpresaProdu(id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdTipoPrioridadEmpresaProdu(id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ordenproduLogic.getOrdenProdus()==null||ordenproduLogic.getOrdenProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ordenprodus==null|| ordenprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenprodusAux=new ArrayList<OrdenProdu>();
						ordenprodusAux.addAll(ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodusAux=new ArrayList<OrdenProdu>();
							ordenprodusAux.addAll(ordenprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ordenproduLogic.getOrdenProdusFK_IdTipoPrioridadEmpresaProdu(finalQueryGlobal,pagination,id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdTipoPrioridadEmpresaProdu(id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=OrdenProduConstantesFunciones.getDetalleIndiceFK_IdTipoPrioridadEmpresaProdu(id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteOrdenProdus("FK_IdTipoPrioridadEmpresaProdu",ordenproduLogic.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteOrdenProdus("FK_IdTipoPrioridadEmpresaProdu",ordenprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduLogic.setOrdenProdus(new ArrayList<OrdenProdu>());
						ordenproduLogic.getOrdenProdus().addAll(ordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenprodus=new ArrayList<OrdenProdu>();
							ordenprodus.addAll(ordenprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesOrdenProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessOrdenProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ordenproduLogic.getOrdenProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ordenprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ordenproduLogic.getOrdenProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ordenprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(OrdenProdu ordenprodu) {
		Boolean permite=true;
		
		if(this.ordenprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=OrdenProduConstantesFunciones.getOrderByListaOrdenProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=OrdenProduConstantesFunciones.getOrderByListaOrdenProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(OrdenProdu ordenprodu:ordenproduLogic.getOrdenProdus()) {
				if(ordenprodu.getsType().equals(Constantes2.S_TOTALES)) {
					ordenproduTotales=ordenprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(OrdenProdu ordenprodu:this.ordenprodus) {
				if(ordenprodu.getsType().equals(Constantes2.S_TOTALES)) {
					ordenproduTotales=ordenprodu;
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
			this.ordenproduAux=new OrdenProdu();
			this.ordenproduAux.setsType(Constantes2.S_TOTALES);
			this.ordenproduAux.setIsNew(false);
			this.ordenproduAux.setIsChanged(false);
			this.ordenproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				OrdenProduConstantesFunciones.TotalizarValoresFilaOrdenProdu(this.ordenproduLogic.getOrdenProdus(),this.ordenproduAux);
				
				this.ordenproduLogic.getOrdenProdus().add(this.ordenproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				OrdenProduConstantesFunciones.TotalizarValoresFilaOrdenProdu(this.ordenprodus,this.ordenproduAux);
				
				this.ordenprodus.add(this.ordenproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ordenproduTotales=new OrdenProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ordenproduLogic.getOrdenProdus().remove(ordenproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ordenprodus.remove(ordenproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ordenproduTotales=new OrdenProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(OrdenProdu ordenprodu:ordenproduLogic.getOrdenProdus()) {
				if(ordenprodu.getsType().equals(Constantes2.S_TOTALES)) {
					ordenproduTotales=ordenprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				OrdenProduConstantesFunciones.TotalizarValoresFilaOrdenProdu(this.ordenproduLogic.getOrdenProdus(),ordenproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(OrdenProdu ordenprodu:this.ordenprodus) {
				if(ordenprodu.getsType().equals(Constantes2.S_TOTALES)) {
					ordenproduTotales=ordenprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				OrdenProduConstantesFunciones.TotalizarValoresFilaOrdenProdu(this.ordenprodus,ordenproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getOrdenProdusFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOrdenProdusFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOrdenProdusFK_IdEmpleadoResponsable()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleadoResponsable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOrdenProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOrdenProdusFK_IdEstadoOrdenProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoOrdenProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOrdenProdusFK_IdFormato()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOrdenProdusFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOrdenProdusFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getOrdenProdusFK_IdTipoPrioridadEmpresaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPrioridadEmpresaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getOrdenProdusFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLogic.getOrdenProdusFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOrdenProdusFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLogic.getOrdenProdusFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOrdenProdusFK_IdEmpleadoResponsable(String sFinalQuery,Long id_empleado_responsable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLogic.getOrdenProdusFK_IdEmpleadoResponsable(sFinalQuery,this.pagination,id_empleado_responsable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOrdenProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLogic.getOrdenProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOrdenProdusFK_IdEstadoOrdenProdu(String sFinalQuery,Long id_estado_orden_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLogic.getOrdenProdusFK_IdEstadoOrdenProdu(sFinalQuery,this.pagination,id_estado_orden_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOrdenProdusFK_IdFormato(String sFinalQuery,Long id_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLogic.getOrdenProdusFK_IdFormato(sFinalQuery,this.pagination,id_formato);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOrdenProdusFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLogic.getOrdenProdusFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOrdenProdusFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLogic.getOrdenProdusFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getOrdenProdusFK_IdTipoPrioridadEmpresaProdu(String sFinalQuery,Long id_tipo_prioridad_empresa_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLogic.getOrdenProdusFK_IdTipoPrioridadEmpresaProdu(sFinalQuery,this.pagination,id_tipo_prioridad_empresa_produ);
				
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
	
	public void inicializarPermisosOrdenProdu() {
		this.isPermisoTodoOrdenProdu=false;
		this.isPermisoNuevoOrdenProdu=false;
		this.isPermisoActualizarOrdenProdu=false;
		this.isPermisoActualizarOriginalOrdenProdu=false;
		this.isPermisoEliminarOrdenProdu=false;
		this.isPermisoGuardarCambiosOrdenProdu=false;
		this.isPermisoConsultaOrdenProdu=false;
		this.isPermisoBusquedaOrdenProdu=false;
		this.isPermisoReporteOrdenProdu=false;		
		this.isPermisoOrdenOrdenProdu=false;		
		this.isPermisoPaginacionMedioOrdenProdu=false;		
		this.isPermisoPaginacionAltoOrdenProdu=false;
		this.isPermisoPaginacionTodoOrdenProdu=false;
		this.isPermisoCopiarOrdenProdu=false;		
		this.isPermisoVerFormOrdenProdu=false;		
		this.isPermisoDuplicarOrdenProdu=false;		
		this.isPermisoOrdenOrdenProdu=false;		
	}
	
	public void setPermisosUsuarioOrdenProdu(Boolean isPermiso) {
		this.isPermisoTodoOrdenProdu=isPermiso;
		this.isPermisoNuevoOrdenProdu=isPermiso;
		this.isPermisoActualizarOrdenProdu=isPermiso;
		this.isPermisoActualizarOriginalOrdenProdu=isPermiso;
		this.isPermisoEliminarOrdenProdu=isPermiso;
		this.isPermisoGuardarCambiosOrdenProdu=isPermiso;
		this.isPermisoConsultaOrdenProdu=isPermiso;
		this.isPermisoBusquedaOrdenProdu=isPermiso;
		this.isPermisoReporteOrdenProdu=isPermiso;
		this.isPermisoOrdenOrdenProdu=isPermiso;		
		this.isPermisoPaginacionMedioOrdenProdu=isPermiso;		
		this.isPermisoPaginacionAltoOrdenProdu=isPermiso;		
		this.isPermisoPaginacionTodoOrdenProdu=isPermiso;		
		this.isPermisoCopiarOrdenProdu=isPermiso;		
		this.isPermisoVerFormOrdenProdu=isPermiso;		
		this.isPermisoDuplicarOrdenProdu=isPermiso;
		this.isPermisoOrdenOrdenProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioOrdenProdu(Boolean isPermiso) {
		//this.isPermisoTodoOrdenProdu=isPermiso;
		this.isPermisoNuevoOrdenProdu=isPermiso;
		this.isPermisoActualizarOrdenProdu=isPermiso;
		this.isPermisoActualizarOriginalOrdenProdu=isPermiso;
		this.isPermisoEliminarOrdenProdu=isPermiso;
		this.isPermisoGuardarCambiosOrdenProdu=isPermiso;
		//this.isPermisoConsultaOrdenProdu=isPermiso;
		//this.isPermisoBusquedaOrdenProdu=isPermiso;
		//this.isPermisoReporteOrdenProdu=isPermiso;
		//this.isPermisoOrdenOrdenProdu=isPermiso;		
		//this.isPermisoPaginacionMedioOrdenProdu=isPermiso;		
		//this.isPermisoPaginacionAltoOrdenProdu=isPermiso;		
		//this.isPermisoPaginacionTodoOrdenProdu=isPermiso;		
		//this.isPermisoCopiarOrdenProdu=isPermiso;		
		//this.isPermisoDuplicarOrdenProdu=isPermiso;
		//this.isPermisoOrdenOrdenProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioOrdenProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(OrdenDetaProduConstantesFunciones.SNOMBREOPCION);
		
		if(OrdenProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosOrdenDetaProdu=false;
		this.isTienePermisosOrdenDetaProdu=this.verificarGetPermisosUsuarioOpcionOrdenProduClaseRelacionada(this.opcionsRelacionadas,OrdenDetaProduConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebOrdenProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioOrdenProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosOrdenDetaProdu=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioOrdenProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionOrdenProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioOrdenProduClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosOrdenDetaProdu && this.jInternalFrameDetalleFormOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOrdenProdu.jTabbedPaneRelacionesOrdenProdu.remove(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioOrdenProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(OrdenProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ordenproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, OrdenProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoOrdenProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOrdenProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalOrdenProdu=this.isPermisoActualizarOrdenProdu;
			this.isPermisoEliminarOrdenProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosOrdenProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaOrdenProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaOrdenProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoOrdenProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteOrdenProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenOrdenProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioOrdenProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoOrdenProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoOrdenProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarOrdenProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormOrdenProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarOrdenProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenOrdenProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ordenproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosOrdenProdu.setToolTipText(this.jTableDatosOrdenProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioOrdenProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioOrdenProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(OrdenProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(OrdenProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioOrdenProdu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosOrdenDetaProdu && this.ordenproduConstantesFunciones.mostrarOrdenDetaProduOrdenProdu && !OrdenProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Orden Detalle Produccion");
			reporte.setsDescripcion("Orden Detalle Produccion");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyOrdenProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.formatosForeignKey=new ArrayList();
				this.tipoprioridadempresaprodusForeignKey=new ArrayList();
				this.empleadoresponsablesForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.estadoordenprodusForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyOrdenProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(OrdenProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyOrdenProduListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoPrioridadEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoResponsableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoOrdenProduListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPrioridadEmpresaProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoprioridadempresaprodusForeignKey==null||this.tipoprioridadempresaprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoPrioridadEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoPrioridadEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrioridadEmpresaProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoPrioridadEmpresaProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoPrioridadEmpresaProdusForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoResponsableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadoresponsablesForeignKey==null||this.empleadoresponsablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadoResponsablesForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyEstadoOrdenProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadoordenprodusForeignKey==null||this.estadoordenprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoOrdenProduConstantesFunciones.getArrayColumnasGlobalesEstadoOrdenProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoOrdenProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoOrdenProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoOrdenProdusForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyOrdenProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			OrdenProduParameterReturnGeneral ordenproduReturnGeneral=new OrdenProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.ordenproduConstantesFunciones.cargarid_empresaOrdenProdu)
					 || (this.esRecargarFks && this.ordenproduConstantesFunciones.cargarid_empresaOrdenProdu)) {

					if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+ordenproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.ordenproduConstantesFunciones.cargarid_sucursalOrdenProdu)
					 || (this.esRecargarFks && this.ordenproduConstantesFunciones.cargarid_sucursalOrdenProdu)) {

					if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+ordenproduSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.ordenproduConstantesFunciones.cargarid_ejercicioOrdenProdu)
					 || (this.esRecargarFks && this.ordenproduConstantesFunciones.cargarid_ejercicioOrdenProdu)) {

					if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+ordenproduSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.ordenproduConstantesFunciones.cargarid_periodoOrdenProdu)
					 || (this.esRecargarFks && this.ordenproduConstantesFunciones.cargarid_periodoOrdenProdu)) {

					if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+ordenproduSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalFormato="";

				if(((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0) && this.ordenproduConstantesFunciones.cargarid_formatoOrdenProdu)
					 || (this.esRecargarFks && this.ordenproduConstantesFunciones.cargarid_formatoOrdenProdu)) {

					if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato, "");
						finalQueryGlobalFormato+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato=" WHERE " + ConstantesSql.ID + "="+ordenproduSessionBean.getlidFormatoActual();
					}
				} else {
					finalQueryGlobalFormato="NONE";
				}


				String finalQueryGlobalTipoPrioridadEmpresaProdu="";

				if(((this.tipoprioridadempresaprodusForeignKey==null||this.tipoprioridadempresaprodusForeignKey.size()<=0) && this.ordenproduConstantesFunciones.cargarid_tipo_prioridad_empresa_produOrdenProdu)
					 || (this.esRecargarFks && this.ordenproduConstantesFunciones.cargarid_tipo_prioridad_empresa_produOrdenProdu)) {

					if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoPrioridadEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoPrioridadEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoPrioridadEmpresaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrioridadEmpresaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoPrioridadEmpresaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoPrioridadEmpresaProdu, "");
						finalQueryGlobalTipoPrioridadEmpresaProdu+=TipoPrioridadEmpresaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoPrioridadEmpresaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoPrioridadEmpresaProdu=" WHERE " + ConstantesSql.ID + "="+ordenproduSessionBean.getlidTipoPrioridadEmpresaProduActual();
					}
				} else {
					finalQueryGlobalTipoPrioridadEmpresaProdu="NONE";
				}


				String finalQueryGlobalEmpleadoResponsable="";

				if(((this.empleadoresponsablesForeignKey==null||this.empleadoresponsablesForeignKey.size()<=0) && this.ordenproduConstantesFunciones.cargarid_empleado_responsableOrdenProdu)
					 || (this.esRecargarFks && this.ordenproduConstantesFunciones.cargarid_empleado_responsableOrdenProdu)) {

					if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoResponsable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleadoResponsable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleadoResponsable=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleadoResponsable, "");
						finalQueryGlobalEmpleadoResponsable+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadoResponsablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleadoResponsable=" WHERE " + ConstantesSql.ID + "="+ordenproduSessionBean.getlidEmpleadoResponsableActual();
					}
				} else {
					finalQueryGlobalEmpleadoResponsable="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.ordenproduConstantesFunciones.cargarid_clienteOrdenProdu)
					 || (this.esRecargarFks && this.ordenproduConstantesFunciones.cargarid_clienteOrdenProdu)) {

					if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+ordenproduSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalEstadoOrdenProdu="";

				if(((this.estadoordenprodusForeignKey==null||this.estadoordenprodusForeignKey.size()<=0) && this.ordenproduConstantesFunciones.cargarid_estado_orden_produOrdenProdu)
					 || (this.esRecargarFks && this.ordenproduConstantesFunciones.cargarid_estado_orden_produOrdenProdu)) {

					if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEstadoOrdenProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoOrdenProduConstantesFunciones.getArrayColumnasGlobalesEstadoOrdenProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoOrdenProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoOrdenProduConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoOrdenProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoOrdenProdu, "");
						finalQueryGlobalEstadoOrdenProdu+=EstadoOrdenProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoOrdenProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoOrdenProdu=" WHERE " + ConstantesSql.ID + "="+ordenproduSessionBean.getlidEstadoOrdenProduActual();
					}
				} else {
					finalQueryGlobalEstadoOrdenProdu="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				ordenproduReturnGeneral=ordenproduLogic.cargarCombosLoteForeignKeyOrdenProdu(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalFormato,finalQueryGlobalTipoPrioridadEmpresaProdu,finalQueryGlobalEmpleadoResponsable,finalQueryGlobalCliente,finalQueryGlobalEstadoOrdenProdu);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=ordenproduReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=ordenproduReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=ordenproduReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=ordenproduReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalFormato.equals("NONE")) {
				this.formatosForeignKey=ordenproduReturnGeneral.getformatosForeignKey();
			}

			if(!finalQueryGlobalTipoPrioridadEmpresaProdu.equals("NONE")) {
				this.tipoprioridadempresaprodusForeignKey=ordenproduReturnGeneral.gettipoprioridadempresaprodusForeignKey();
			}

			if(!finalQueryGlobalEmpleadoResponsable.equals("NONE")) {
				this.empleadoresponsablesForeignKey=ordenproduReturnGeneral.getempleadoresponsablesForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=ordenproduReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalEstadoOrdenProdu.equals("NONE")) {
				this.estadoordenprodusForeignKey=ordenproduReturnGeneral.getestadoordenprodusForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyOrdenProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyFormato();
			this.addItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu();
			this.addItemDefectoCombosForeignKeyEmpleadoResponsable();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyEstadoOrdenProdu();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormato()throws Exception {
		try {

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				Formato formato=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatosForeignKey,formato,true)) {

					this.formatosForeignKey.add(0,formato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu()throws Exception {
		try {

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu()) {
				TipoPrioridadEmpresaProdu tipoprioridadempresaprodu=new TipoPrioridadEmpresaProdu();
				TipoPrioridadEmpresaProduConstantesFunciones.setTipoPrioridadEmpresaProduDescripcion(tipoprioridadempresaprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprioridadempresaprodu.setId(null);

				if(!TipoPrioridadEmpresaProduConstantesFunciones.ExisteEnLista(this.tipoprioridadempresaprodusForeignKey,tipoprioridadempresaprodu,true)) {

					this.tipoprioridadempresaprodusForeignKey.add(0,tipoprioridadempresaprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleadoResponsable()throws Exception {
		try {

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoResponsable()) {
				Empleado empleadoresponsable=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleadoresponsable,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleadoresponsable.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadoresponsablesForeignKey,empleadoresponsable,true)) {

					this.empleadoresponsablesForeignKey.add(0,empleadoresponsable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyEstadoOrdenProdu()throws Exception {
		try {

			if(!this.ordenproduSessionBean.getisBusquedaDesdeForeignKeySesionEstadoOrdenProdu()) {
				EstadoOrdenProdu estadoordenprodu=new EstadoOrdenProdu();
				EstadoOrdenProduConstantesFunciones.setEstadoOrdenProduDescripcion(estadoordenprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadoordenprodu.setId(null);

				if(!EstadoOrdenProduConstantesFunciones.ExisteEnLista(this.estadoordenprodusForeignKey,estadoordenprodu,true)) {

					this.estadoordenprodusForeignKey.add(0,estadoordenprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyOrdenProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyOrdenProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyOrdenProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.ordenprodu.setfecha_pedido(this.parametroGeneralUsuario.getfecha_sistema());
				this.ordenprodu.setfecha_entrega(this.parametroGeneralUsuario.getfecha_sistema());
				this.ordenprodu.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyOrdenProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyOrdenProdu(OrdenProdu ordenprodu)throws Exception {	
		try {
			
			this.setActualFormatoForeignKey(ordenprodu.getid_formato(),false,"Formulario");
			this.setActualTipoPrioridadEmpresaProduForeignKey(ordenprodu.getid_tipo_prioridad_empresa_produ(),false,"Formulario");
			this.setActualEmpleadoResponsableForeignKey(ordenprodu.getid_empleado_responsable(),false,"Formulario");
			this.setActualClienteForeignKey(ordenprodu.getid_cliente(),false,"Formulario");
			this.setActualEstadoOrdenProduForeignKey(ordenprodu.getid_estado_orden_produ(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyOrdenProdu(OrdenProdu ordenprodu,String sTipoEvento)throws Exception {	
		try {
			
			

				if(ordenprodu.getCliente()!=null && !sTipoEvento.equals("id_clienteOrdenProdu")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(ordenprodu.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyOrdenProdu()throws Exception {	
		try {
			
			this.setActualFormatoForeignKey(this.ordenproduConstantesFunciones.getid_formato(),false,"Formulario");
			this.setActualTipoPrioridadEmpresaProduForeignKey(this.ordenproduConstantesFunciones.getid_tipo_prioridad_empresa_produ(),false,"Formulario");
			this.setActualEmpleadoResponsableForeignKey(this.ordenproduConstantesFunciones.getid_empleado_responsable(),false,"Formulario");
			this.setActualClienteForeignKey(this.ordenproduConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualEstadoOrdenProduForeignKey(this.ordenproduConstantesFunciones.getid_estado_orden_produ(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyOrdenProdu()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyOrdenProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyOrdenProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroOrdenProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyOrdenProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameFormatosForeignKey("Todos");
			this.cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey("Todos");
			this.cargarCombosFrameEmpleadoResponsablesForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameEstadoOrdenProdusForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyOrdenProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadoResponsablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoOrdenProdusForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyOrdenProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public OrdenProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public OrdenProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public OrdenProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ordenproduSessionBean=new OrdenProduSessionBean(); 
		this.ordenproduConstantesFunciones=new OrdenProduConstantesFunciones(); 
		this.ordenproduBean=new OrdenProdu();//(this.ordenproduConstantesFunciones); 		
		this.ordenproduReturnGeneral=new OrdenProduParameterReturnGeneral(); 
		
		this.ordenproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ordenproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public OrdenProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public OrdenProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public OrdenProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessOrdenProdu(true);
			
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
			
			this.ordenproduConstantesFunciones=new OrdenProduConstantesFunciones(); 
			this.ordenproduBean=new OrdenProdu();//this.ordenproduConstantesFunciones); 			
			this.ordenproduReturnGeneral=new OrdenProduParameterReturnGeneral(); 
		
			OrdenProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.ordenprodu=new OrdenProdu();
			this.ordenprodus = new ArrayList<OrdenProdu>();
			this.ordenprodusAux = new ArrayList<OrdenProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic=new OrdenProduLogic();
				this.ordenproduLogic.getNewConnexionToDeep("");
			}
			
			//this.ordenproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ordenproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormOrdenProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoOrdenProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoOrdenProdu);	
					}
					
					if(this.jInternalFrameImportacionOrdenProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionOrdenProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByOrdenProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByOrdenProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormOrdenProdu);
				this.jInternalFrameDetalleFormOrdenProdu.setVisible(false);
				this.jInternalFrameDetalleFormOrdenProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoOrdenProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoOrdenProdu);
					this.jInternalFrameReporteDinamicoOrdenProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoOrdenProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionOrdenProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionOrdenProdu);
					this.jInternalFrameImportacionOrdenProdu.setVisible(false);
					this.jInternalFrameImportacionOrdenProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByOrdenProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByOrdenProdu);
					this.jInternalFrameOrderByOrdenProdu.setVisible(false);
					this.jInternalFrameOrderByOrdenProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idOrdenProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=OrdenProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ordenproduReturnGeneral=new OrdenProduParameterReturnGeneral();
			
			this.ordenproduParameterGeneral=new OrdenProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ordenproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(OrdenProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ordenproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(OrdenDetaProduConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,OrdenProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ordenproduSessionBean.getEsGuardarRelacionado(),this.ordenproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,OrdenProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ordenproduSessionBean.getEsGuardarRelacionado(),this.ordenproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoOrdenProdu=false;
			this.isVisibilidadCeldaDuplicarOrdenProdu=true;
			this.isVisibilidadCeldaCopiarOrdenProdu=true;
			this.isVisibilidadCeldaVerFormOrdenProdu=true;
			this.isVisibilidadCeldaOrdenOrdenProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=false;
			this.isVisibilidadCeldaModificarOrdenProdu=false;
			this.isVisibilidadCeldaActualizarOrdenProdu=false;
			this.isVisibilidadCeldaEliminarOrdenProdu=false;
			this.isVisibilidadCeldaCancelarOrdenProdu=false;
			this.isVisibilidadCeldaGuardarOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpleadoResponsable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoOrdenProdu=true;
			this.isVisibilidadFK_IdFormato=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosOrdenProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioOrdenProdu(false);
			
			this.setPermisosUsuarioOrdenProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ordenproduSessionBean.getEsGuardarRelacionado() 
				|| (this.ordenproduSessionBean.getEsGuardarRelacionado() && this.ordenproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioOrdenProduClasesRelacionadas();
			}
			
			if(this.ordenproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioOrdenProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosOrdenProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualOrdenProdu();
			}
			
			if(!this.isPermisoBusquedaOrdenProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasOrdenProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioOrdenProdu,this.isPermisoPaginacionMedioOrdenProdu,this.isPermisoPaginacionTodoOrdenProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(OrdenProduConstantesFunciones.getTiposSeleccionarOrdenProdu());
				
				this.tiposColumnasSelect=OrdenProduConstantesFunciones.getTiposSeleccionarOrdenProdu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectOrdenProdu();				
				//this.tiposRelacionesSelect=OrdenProduConstantesFunciones.getTiposRelacionesOrdenProdu(true);
				
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
			//if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioOrdenProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioOrdenProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioOrdenProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesOrdenProdu() ;
			
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
			
			
			this.ordendetaproduLogic=new OrdenDetaProduLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.formatoLogic=new FormatoLogic();
			this.tipoprioridadempresaproduLogic=new TipoPrioridadEmpresaProduLogic();
			this.empleadoresponsableLogic=new EmpleadoLogic();
			this.clienteLogic=new ClienteLogic();
			this.estadoordenproduLogic=new EstadoOrdenProduLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ordenproduImplementable= (OrdenProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+OrdenProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ordenproduImplementableHome= (OrdenProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+OrdenProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ordenprodus= new ArrayList<OrdenProdu>();
			this.ordenprodusEliminados= new ArrayList<OrdenProdu>();
						
			this.isEsNuevoOrdenProdu=false;
			this.esParaAccionDesdeFormularioOrdenProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.formatosForeignKey=new ArrayList<Formato>() ;
			this.tipoprioridadempresaprodusForeignKey=new ArrayList<TipoPrioridadEmpresaProdu>() ;
			this.empleadoresponsablesForeignKey=new ArrayList<Empleado>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.estadoordenprodusForeignKey=new ArrayList<EstadoOrdenProdu>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyOrdenProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroOrdenProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			OrdenProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=OrdenProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingOrdenProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioOrdenProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioOrdenProdu();
			}
			
			OrdenProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasOrdenProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasOrdenProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasOrdenProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessOrdenProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga OrdenProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectOrdenProdu() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesOrdenProdu")) {
				iIndex=this.jInternalFrameDetalleFormOrdenProdu.jTabbedPaneRelacionesOrdenProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormOrdenProdu.jTabbedPaneRelacionesOrdenProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();	
				
				

				if(sTitle.equals("Orden Detalle Producciones")) {
					if(!OrdenDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessOrdenProdu();

						this.cargarParteTabPanelRelacionadaOrdenDetaProdu(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessOrdenProdu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaOrdenDetaProdu(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormOrdenProdu.cargarSessionConBeanSwingJInternalFrameOrdenDetaProdu(false,true,iIndex);
		this.jButtonOrdenDetaProduActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaOrdenDetaProdu();

		//this.jTabbedPaneRelacionesOrdenProdu.updateUI();
		//this.jTabbedPaneRelacionesOrdenProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesOrdenProdu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("OrdenDetaProdu")) {
				int row=this.jTableDatosOrdenProdu.getSelectedRow();
				jButtonOrdenDetaProduActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Orden Detalle Produccion")) {

					if(this.isTienePermisosOrdenDetaProdu && this.ordenproduConstantesFunciones.mostrarOrdenDetaProduOrdenProdu && !OrdenProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Orden Detalle Producciones"+"("+OrdenDetaProduConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Orden Detalle Producciones");

						if(ordenproduConstantesFunciones.resaltarOrdenDetaProduOrdenProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(ordenproduConstantesFunciones.resaltarOrdenDetaProduOrdenProdu);
						}

						jmenuItem.setEnabled(this.ordenproduConstantesFunciones.activarOrdenDetaProduOrdenProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"OrdenDetaProdu"));

						

						this.jInternalFrameDetalleFormOrdenProdu.jmenuDetalleOrdenProdu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyOrdenProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyOrdenProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyOrdenProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyOrdenProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyOrdenProdu();
		
		this.cargarCombosFrameForeignKeyOrdenProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyOrdenProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyOrdenProdu();
		}
	}
	
	

	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato(this.formatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPrioridadEmpresaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoPrioridadEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu();
				this.cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodusForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoResponsable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoResponsableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleadoResponsable();
				this.cargarCombosFrameEmpleadoResponsablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleadoResponsable(this.empleadoresponsablesForeignKey);

		} catch(Exception e) {
			throw e;
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

	public void cargarCombosForeignKeyEstadoOrdenProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoOrdenProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoOrdenProdu();
				this.cargarCombosFrameEstadoOrdenProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoOrdenProdu(this.estadoordenprodusForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoOrdenProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ordenproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
			
			if(jTableDatosOrdenProdu.getRowCount()>=1) {
				jTableDatosOrdenProdu.removeRowSelectionInterval(0, jTableDatosOrdenProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoOrdenProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoOrdenProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesOrdenProdu(true);			
			//this.ordenprodu=new OrdenProdu();
			//this.ordenprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesOrdenProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualOrdenProdu() ;
			
			if(OrdenProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleOrdenProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ordenprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);				
			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
			if(this.ordenproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar OrdenProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarOrdenProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosOrdenProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosOrdenProdu.getSelectedRows().length;			
			}
			
			ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoOrdenProdu--;			
				//OrdenProdu ordenproduAux= new OrdenProdu();			
				//ordenproduAux.setId(this.iIdNuevoOrdenProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//OrdenProdu ordenproduOrigen=new OrdenProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(OrdenProdu ordenproduOrigen : ordenprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ordenproduOrigen =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ordenproduOrigen =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaOrdenProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ordenprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosOrdenProdu(ordenproduOrigen,this.ordenprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ordenproduLogic.getOrdenProdus().add(this.ordenproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ordenprodus.add(this.ordenproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaOrdenProdu(false);
				
				this.jTableDatosOrdenProdu.setRowSelectionInterval(this.getIndiceNuevoOrdenProdu(), this.getIndiceNuevoOrdenProdu());
				
				int iLastRow =  this.jTableDatosOrdenProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosOrdenProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosOrdenProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaOrdenProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();									
		
			OrdenProdu ordenproduOrigen=new OrdenProdu();
			OrdenProdu ordenproduDestino=new OrdenProdu();
				
			ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosOrdenProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ordenprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosOrdenProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduOrigen =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ordenproduOrigen =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ordenproduDestino =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ordenproduDestino =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ordenproduOrigen =ordenprodusSeleccionados.get(0);
				ordenproduDestino =ordenprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosOrdenProdu(ordenproduOrigen,ordenproduDestino,true,false);
				
				ordenproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ordenproduDestino,ordenproduLogic.getOrdenProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ordenproduDestino,ordenprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaOrdenProdu(false);
				
				//this.jTableDatosOrdenProdu.setRowSelectionInterval(this.getIndiceNuevoOrdenProdu(), this.getIndiceNuevoOrdenProdu());
				
				int iLastRow =  this.jTableDatosOrdenProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosOrdenProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosOrdenProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaOrdenProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormOrdenProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesOrdenProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasOrdenProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesOrdenProdu.setVisible(!isVisible);
			this.jPanelPaginacionOrdenProdu.setVisible(!isVisible);
			this.jPanelAccionesOrdenProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameOrdenProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoOrdenProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionOrdenProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByOrdenProdu();
			
			this.abrirFrameOrderByOrdenProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByOrdenProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleOrdenProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormOrdenProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormOrdenProdu.isMaximum()) {
					this.jInternalFrameDetalleFormOrdenProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormOrdenProdu.setSize(this.jInternalFrameDetalleFormOrdenProdu.iWidthFormulario,this.jInternalFrameDetalleFormOrdenProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormOrdenProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormOrdenProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormOrdenProdu.isMaximum()) {
						this.jInternalFrameDetalleFormOrdenProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormOrdenProdu.jContentPaneDetalleOrdenProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormOrdenProdu.jTabbedPaneRelacionesOrdenProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormOrdenProdu.jContentPaneDetalleOrdenProdu.getWidth(),OrdenProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormOrdenProdu.jTabbedPaneRelacionesOrdenProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormOrdenProdu.jContentPaneDetalleOrdenProdu.getWidth(),OrdenProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormOrdenProdu.jTabbedPaneRelacionesOrdenProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormOrdenProdu.jContentPaneDetalleOrdenProdu.getWidth(),OrdenProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(OrdenDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaOrdenDetaProdu();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormOrdenProdu.setVisible(true);
	        this.jInternalFrameDetalleFormOrdenProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByOrdenProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByOrdenProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByOrdenProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOrdenProdu,false,this);
				} else {
					this.jInternalFrameOrderByOrdenProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByOrdenProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByOrdenProdu);
				this.jInternalFrameOrderByOrdenProdu.setVisible(false);
				this.jInternalFrameOrderByOrdenProdu.setSelected(false);
				
				this.jInternalFrameOrderByOrdenProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByOrdenProdu"));
				
				this.inicializarActualizarBindingTablaOrderByOrdenProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionOrdenProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionOrdenProdu==null) {
				
				this.jInternalFrameImportacionOrdenProdu=new ImportacionJInternalFrame(OrdenProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionOrdenProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionOrdenProdu);
				this.jInternalFrameImportacionOrdenProdu.setVisible(false);
				this.jInternalFrameImportacionOrdenProdu.setSelected(false);


				this.jInternalFrameImportacionOrdenProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionOrdenProdu"));
				this.jInternalFrameImportacionOrdenProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionOrdenProdu"));
				this.jInternalFrameImportacionOrdenProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionOrdenProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoOrdenProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoOrdenProdu==null) {
				this.jInternalFrameReporteDinamicoOrdenProdu=new ReporteDinamicoJInternalFrame(OrdenProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoOrdenProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoOrdenProdu);
				this.jInternalFrameReporteDinamicoOrdenProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoOrdenProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoOrdenProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoOrdenProdu"));
				this.jInternalFrameReporteDinamicoOrdenProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoOrdenProdu"));
				this.jInternalFrameReporteDinamicoOrdenProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoOrdenProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualOrdenProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaOrdenDetaProdu() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenDetaProdu.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormOrdenProdu.jContentPaneDetalleOrdenProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenDetaProdu.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenDetaProdu.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenDetaProdu.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleOrdenProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormOrdenProdu);
			
	       	this.jInternalFrameDetalleFormOrdenProdu.setVisible(false);
	        this.jInternalFrameDetalleFormOrdenProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormOrdenProdu.dispose();
			//this.jInternalFrameDetalleFormOrdenProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoOrdenProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoOrdenProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoOrdenProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionOrdenProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionOrdenProdu.setVisible(true);
	        this.jInternalFrameImportacionOrdenProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByOrdenProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByOrdenProdu.setVisible(true);
	        this.jInternalFrameOrderByOrdenProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByOrdenProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByOrdenProdu.setVisible(false);
	        this.jInternalFrameOrderByOrdenProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoOrdenProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoOrdenProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoOrdenProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionOrdenProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionOrdenProdu.setVisible(false);
	        this.jInternalFrameImportacionOrdenProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarOrdenProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarOrdenProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesOrdenProdu(true);
			//this.isEsNuevoOrdenProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesOrdenProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesOrdenProdu(false) ;
			
			if(ordenproduSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduSessionBean.getEsGuardarRelacionado() && OrdenDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonOrdenDetaProduActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(OrdenProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleOrdenProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualOrdenProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaOrdenProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarOrdenProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesOrdenProdu(true);
			//this.isEsNuevoOrdenProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ordenprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesOrdenProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesOrdenProdu(false) ;
			
			if(OrdenProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleOrdenProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualOrdenProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.ordenproduConstantesFunciones.cargarid_clienteOrdenProdu) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingOrdenProdu(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaFormato(List<Formato> formatosForeignKey)throws Exception{
		TableColumn tableColumnFormato=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDFORMATO));
		TableCellEditor tableCellEditorFormato =tableColumnFormato.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosOrdenProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoPrioridadEmpresaProdu(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusForeignKey)throws Exception{
		TableColumn tableColumnTipoPrioridadEmpresaProdu=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU));
		TableCellEditor tableCellEditorTipoPrioridadEmpresaProdu =tableColumnTipoPrioridadEmpresaProdu.getCellEditor();

		TipoPrioridadEmpresaProduTableCell tipoprioridadempresaproduTableCellFk=(TipoPrioridadEmpresaProduTableCell)tableCellEditorTipoPrioridadEmpresaProdu;

		if(tipoprioridadempresaproduTableCellFk!=null) {
			tipoprioridadempresaproduTableCellFk.settipoprioridadempresaprodusForeignKey(tipoprioridadempresaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosOrdenProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprioridadempresaproduTableCellFk.setRowActual(intSelectedRow);
			//tipoprioridadempresaproduTableCellFk.settipoprioridadempresaprodusForeignKeyActual(tipoprioridadempresaprodusForeignKey);
		//}


		if(tipoprioridadempresaproduTableCellFk!=null) {
			tipoprioridadempresaproduTableCellFk.RecargarTipoPrioridadEmpresaProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleadoResponsable(List<Empleado> empleadoresponsablesForeignKey)throws Exception{
		TableColumn tableColumnEmpleadoResponsable=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE));
		TableCellEditor tableCellEditorEmpleadoResponsable =tableColumnEmpleadoResponsable.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleadoResponsable;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadoresponsablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosOrdenProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadoresponsablesForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosOrdenProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoOrdenProdu(List<EstadoOrdenProdu> estadoordenprodusForeignKey)throws Exception{
		TableColumn tableColumnEstadoOrdenProdu=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU));
		TableCellEditor tableCellEditorEstadoOrdenProdu =tableColumnEstadoOrdenProdu.getCellEditor();

		EstadoOrdenProduTableCell estadoordenproduTableCellFk=(EstadoOrdenProduTableCell)tableCellEditorEstadoOrdenProdu;

		if(estadoordenproduTableCellFk!=null) {
			estadoordenproduTableCellFk.setestadoordenprodusForeignKey(estadoordenprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosOrdenProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadoordenproduTableCellFk.setRowActual(intSelectedRow);
			//estadoordenproduTableCellFk.setestadoordenprodusForeignKeyActual(estadoordenprodusForeignKey);
		//}


		if(estadoordenproduTableCellFk!=null) {
			estadoordenproduTableCellFk.RecargarEstadoOrdenProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesOrdenProdu(false);
			
			//if(!this.isEsNuevoOrdenProdu) {								
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				
			}
			
			if(this.permiteMantenimiento(this.ordenprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoOrdenProdu=true;
					this.inicializarActualizarBindingTablaOrdenProdu(false);
					this.isEsNuevoOrdenProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoOrdenProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoOrdenProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesOrdenProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualOrdenProdu(false);
				
				this.habilitarDeshabilitarControlesOrdenProdu(false);
			
												
				
				if(OrdenProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleOrdenProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoOrdenProduActionPerformed(evt,ordenproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualOrdenProdu(this.ordenprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosOrdenProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ordenproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ordenprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				this.ordenprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				this.ordenprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ordenprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((OrdenProduModel) this.jTableDatosOrdenProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoOrdenProdu=true;
				this.inicializarActualizarBindingTablaOrdenProdu(false);
				this.isEsNuevoOrdenProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesOrdenProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualOrdenProdu(false);
				
				this.habilitarDeshabilitarControlesOrdenProdu(false);
				
				
				
				if(OrdenProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleOrdenProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarOrdenProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosOrdenProdu.getRowCount()>=1) {
				jTableDatosOrdenProdu.removeRowSelectionInterval(0, jTableDatosOrdenProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesOrdenProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaOrdenProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesOrdenProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualOrdenProdu(false) ;
			
			this.isEsNuevoOrdenProdu=false;
			
			if(OrdenProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleOrdenProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingOrdenProdu(false);
				
				//SI ES MANUAL
				if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualOrdenProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoOrdenProdu--;			
			//OrdenProdu ordenproduAux= new OrdenProdu();			
			//ordenproduAux.setId(this.iIdNuevoOrdenProdu);
			
			if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaOrdenProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
			
			this.ordenprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ordenproduLogic.getOrdenProdus().add(this.ordenproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ordenprodus.add(this.ordenproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaOrdenProdu(false);
			
			this.jTableDatosOrdenProdu.setRowSelectionInterval(this.getIndiceNuevoOrdenProdu(), this.getIndiceNuevoOrdenProdu());
			
			int iLastRow =  this.jTableDatosOrdenProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosOrdenProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosOrdenProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaOrdenProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingOrdenProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingOrdenProdu(false);
			
			//SI ES MANUAL
			if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualOrdenProdu();
			}
			
			//this.abrirFrameTreeOrdenProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionOrdenProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Orden ProduccionES ?", "MANTENIMIENTO DE Orden Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionOrdenProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralOrdenProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.ordenproduReturnGeneral=ordenproduLogic.procesarImportacionOrdenProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.ordenproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarOrdenProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionOrdenProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionOrdenProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionOrdenProdu.setFileImportacion(this.jInternalFrameImportacionOrdenProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionOrdenProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionOrdenProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionOrdenProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionOrdenProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();		

		ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("OrdenProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"OrdenProduBaseDesign.jrxml";
			
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
			
			this.generarReporteOrdenProdus("Todos",ordenprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case OrdenProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_IDFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoPrioridadEmpresaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoPrioridadEmpresaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoPrioridadEmpresaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoPrioridadEmpresaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpleadoResponsable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpleadoResponsable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpleadoResponsable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpleadoResponsable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_RUCCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_LOTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_te_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_te_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_te_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_te_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaPedido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaPedido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaPedido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaPedido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_FECHAENTREGA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEntrega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEntrega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEntrega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEntrega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_UsoInterno_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_UsoInterno_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_UsoInterno_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_UsoInterno_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoOrdenProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoOrdenProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoOrdenProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoOrdenProdu_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoOrdenProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case OrdenProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoria="id_formato";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU:
					sNombreCampoCategoria="id_tipo_prioridad_empresa_produ";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE:
					sNombreCampoCategoria="id_empleado_responsable";
					break;

				case OrdenProduConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE:
					sNombreCampoCategoria="direccion_cliente";
					break;

				case OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE:
					sNombreCampoCategoria="telefono_cliente";
					break;

				case OrdenProduConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoria="ruc_cliente";
					break;

				case OrdenProduConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoria="lote";
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO:
					sNombreCampoCategoria="fecha_pedido";
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoria="fecha_entrega";
					break;

				case OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO:
					sNombreCampoCategoria="es_uso_interno";
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case OrdenProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU:
					sNombreCampoCategoria="id_estado_orden_produ";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case OrdenProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoriaValor="id_formato";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU:
					sNombreCampoCategoriaValor="id_tipo_prioridad_empresa_produ";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE:
					sNombreCampoCategoriaValor="id_empleado_responsable";
					break;

				case OrdenProduConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE:
					sNombreCampoCategoriaValor="direccion_cliente";
					break;

				case OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE:
					sNombreCampoCategoriaValor="telefono_cliente";
					break;

				case OrdenProduConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoriaValor="ruc_cliente";
					break;

				case OrdenProduConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoriaValor="lote";
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO:
					sNombreCampoCategoriaValor="fecha_pedido";
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoriaValor="fecha_entrega";
					break;

				case OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO:
					sNombreCampoCategoriaValor="es_uso_interno";
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case OrdenProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU:
					sNombreCampoCategoriaValor="id_estado_orden_produ";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case OrdenProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case OrdenProduConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case OrdenProduConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case OrdenProduConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case OrdenProduConstantesFunciones.LABEL_IDFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato");
					break;

				case OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Priorad Empresa Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_prioridad_empresa_produ");
					break;

				case OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado Responsable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado_responsable");
					break;

				case OrdenProduConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case OrdenProduConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_cliente");
					break;

				case OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_cliente");
					break;

				case OrdenProduConstantesFunciones.LABEL_RUCCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_cliente");
					break;

				case OrdenProduConstantesFunciones.LABEL_LOTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Lote",sNombreCampoCategoria,sNombreCampoCategoriaValor,"lote");
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Pedo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_pedido");
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHAENTREGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Entrega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_entrega");
					break;

				case OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Uso Interno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_uso_interno");
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case OrdenProduConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Orden Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_orden_produ");
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
	
	public void jButtonGenerarExcelReporteDinamicoOrdenProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();		
		
		ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ordenprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("OrdenProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case OrdenProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_IDFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDFORMATO);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.gettipoprioridadempresaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getempleadoresponsable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getdireccion_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.gettelefono_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_RUCCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_RUCCLIENTE);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getruc_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_LOTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_LOTE);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getlote());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getfecha_pedido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHAENTREGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_FECHAENTREGA);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getfecha_entrega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getes_uso_interno());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU);
					iRow++;

					for(OrdenProdu ordenprodu:ordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ordenprodu.getestadoordenprodu_descripcion());
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
			//	this.getFilaCabeceraExportarExcelOrdenProdu(row);				
			//	iRow++;
			//}				
			
			//for(OrdenProdu ordenproduAux:ordenprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelOrdenProdu(ordenproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.ordenproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingOrdenProdu(false);
			
			//SI ES MANUAL
			if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualOrdenProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingOrdenProdu(false);
			
			//SI ES MANUAL
			if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualOrdenProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingOrdenProdu(false);
			
			//SI ES MANUAL
			if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualOrdenProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaOrdenProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosOrdenProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosOrdenProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosOrdenProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosOrdenProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosOrdenProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosOrdenProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosOrdenProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingOrdenProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingOrdenProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingOrdenProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaOrdenProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesOrdenProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasOrdenProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesOrdenProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesOrdenProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!OrdenProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualOrdenProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaOrdenProdu();
		
		this.inicializarActualizarBindingBotonesManualOrdenProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualOrdenProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesOrdenProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualOrdenProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualOrdenProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosOrdenProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosOrdenProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteOrdenProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxPostAccionNuevoOrdenProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxPostAccionSinCerrarOrdenProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxPostAccionSinMensajeOrdenProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosOrdenProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosOrdenProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteOrdenProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
				this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxPostAccionNuevoOrdenProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxPostAccionSinCerrarOrdenProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxPostAccionSinMensajeOrdenProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionOrdenProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionOrdenProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesOrdenProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoOrdenProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesOrdenProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesOrdenProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarOrdenProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesOrdenProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoOrdenProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesOrdenProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralOrdenProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesOrdenProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualOrdenProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesOrdenProdu() throws Exception {
		try	{
			if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualOrdenProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleOrdenProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualOrdenProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesOrdenProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesOrdenProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesOrdenProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionOrdenProdu.addItem(reporte);
			}
			
			
			if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionOrdenProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionOrdenProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesOrdenProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesOrdenProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarOrdenProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarOrdenProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualOrdenProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualOrdenProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoOrdenProdu!=null) {
				this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoOrdenProdu!=null) {
				this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoOrdenProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoOrdenProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoOrdenProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoOrdenProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoOrdenProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoOrdenProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualOrdenProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteOrdenProdu.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteOrdenProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.getSelectedItem()!=null){this.id_empleado_responsableFK_IdEmpleadoResponsable=((Empleado)this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsableOrdenProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.getSelectedItem()!=null){this.id_estado_orden_produFK_IdEstadoOrdenProdu=((EstadoOrdenProdu)this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduOrdenProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_formatoFK_IdFormatoOrdenProdu.getSelectedItem()!=null){this.id_formatoFK_IdFormato=((Formato)this.jComboBoxid_formatoFK_IdFormatoOrdenProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.getSelectedItem()!=null){this.id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu=((TipoPrioridadEmpresaProdu)this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduOrdenProdu.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasOrdenProdu(Boolean esInicializar) throws Exception {				
		if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualOrdenProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaOrdenProdu() throws Exception {
		this.inicializarActualizarBindingTablaOrdenProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByOrdenProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosOrdenProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaOrdenProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ordenproduLogic.getOrdenProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ordenprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosOrdenProdu.setModel(new OrdenProduModel(this.ordenproduLogic.getOrdenProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosOrdenProdu.setModel(new OrdenProduModel(this.ordenprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByOrdenProdu!=null && this.jInternalFrameOrderByOrdenProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByOrdenProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+OrdenProduConstantesFunciones.SCLASSWEBTITULO,ordenproduConstantesFunciones.resaltarSeleccionarOrdenProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+OrdenProduConstantesFunciones.SCLASSWEBTITULO,ordenproduConstantesFunciones.resaltarSeleccionarOrdenProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_ID));

		if(this.ordenproduConstantesFunciones.mostraridOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ordenproduConstantesFunciones.resaltaridOrdenProdu,this.ordenproduConstantesFunciones.activaridOrdenProdu,this,true,"idOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ordenproduConstantesFunciones.resaltaridOrdenProdu,this.ordenproduConstantesFunciones.activaridOrdenProdu,this,true,"idOrdenProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.ordenproduConstantesFunciones.mostrarid_empresaOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.ordenproduConstantesFunciones.resaltarid_empresaOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_empresaOrdenProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.ordenproduConstantesFunciones.resaltarid_empresaOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_empresaOrdenProdu,false,"id_empresaOrdenProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.ordenproduConstantesFunciones.mostrarid_sucursalOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.ordenproduConstantesFunciones.resaltarid_sucursalOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_sucursalOrdenProdu));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.ordenproduConstantesFunciones.resaltarid_sucursalOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_sucursalOrdenProdu,false,"id_sucursalOrdenProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.ordenproduConstantesFunciones.mostrarid_ejercicioOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.ordenproduConstantesFunciones.resaltarid_ejercicioOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_ejercicioOrdenProdu));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.ordenproduConstantesFunciones.resaltarid_ejercicioOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_ejercicioOrdenProdu,false,"id_ejercicioOrdenProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDPERIODO));

		if(this.ordenproduConstantesFunciones.mostrarid_periodoOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.ordenproduConstantesFunciones.resaltarid_periodoOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_periodoOrdenProdu));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.ordenproduConstantesFunciones.resaltarid_periodoOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_periodoOrdenProdu,false,"id_periodoOrdenProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDFORMATO));

		if(this.ordenproduConstantesFunciones.mostrarid_formatoOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_IDFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatosForeignKey,this.ordenproduConstantesFunciones.resaltarid_formatoOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_formatoOrdenProdu));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatosForeignKey,this.ordenproduConstantesFunciones.resaltarid_formatoOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_formatoOrdenProdu,true,"id_formatoOrdenProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU));

		if(this.ordenproduConstantesFunciones.mostrarid_tipo_prioridad_empresa_produOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoPrioridadEmpresaProduTableCell(this.tipoprioridadempresaprodusForeignKey,this.ordenproduConstantesFunciones.resaltarid_tipo_prioridad_empresa_produOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_tipo_prioridad_empresa_produOrdenProdu));
			tableColumn.setCellEditor(new TipoPrioridadEmpresaProduTableCell(this.tipoprioridadempresaprodusForeignKey,this.ordenproduConstantesFunciones.resaltarid_tipo_prioridad_empresa_produOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_tipo_prioridad_empresa_produOrdenProdu,true,"id_tipo_prioridad_empresa_produOrdenProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE));

		if(this.ordenproduConstantesFunciones.mostrarid_empleado_responsableOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadoresponsablesForeignKey,this.ordenproduConstantesFunciones.resaltarid_empleado_responsableOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_empleado_responsableOrdenProdu));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadoresponsablesForeignKey,this.ordenproduConstantesFunciones.resaltarid_empleado_responsableOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_empleado_responsableOrdenProdu,true,"id_empleado_responsableOrdenProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_SECUENCIAL));

		if(this.ordenproduConstantesFunciones.mostrarsecuencialOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ordenproduConstantesFunciones.resaltarsecuencialOrdenProdu,this.ordenproduConstantesFunciones.activarsecuencialOrdenProdu,this,true,"secuencialOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ordenproduConstantesFunciones.resaltarsecuencialOrdenProdu,this.ordenproduConstantesFunciones.activarsecuencialOrdenProdu,this,true,"secuencialOrdenProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDCLIENTE));

		if(this.ordenproduConstantesFunciones.mostrarid_clienteOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.ordenproduConstantesFunciones.resaltarid_clienteOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_clienteOrdenProdu));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.ordenproduConstantesFunciones.resaltarid_clienteOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_clienteOrdenProdu,true,"id_clienteOrdenProdu","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE));

		if(this.ordenproduConstantesFunciones.mostrardireccion_clienteOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ordenproduConstantesFunciones.resaltardireccion_clienteOrdenProdu,this.ordenproduConstantesFunciones.activardireccion_clienteOrdenProdu,this,true,"direccion_clienteOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ordenproduConstantesFunciones.resaltardireccion_clienteOrdenProdu,this.ordenproduConstantesFunciones.activardireccion_clienteOrdenProdu,this,true,"direccion_clienteOrdenProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE));

		if(this.ordenproduConstantesFunciones.mostrartelefono_clienteOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ordenproduConstantesFunciones.resaltartelefono_clienteOrdenProdu,this.ordenproduConstantesFunciones.activartelefono_clienteOrdenProdu,this,true,"telefono_clienteOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ordenproduConstantesFunciones.resaltartelefono_clienteOrdenProdu,this.ordenproduConstantesFunciones.activartelefono_clienteOrdenProdu,this,true,"telefono_clienteOrdenProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_RUCCLIENTE));

		if(this.ordenproduConstantesFunciones.mostrarruc_clienteOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_RUCCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ordenproduConstantesFunciones.resaltarruc_clienteOrdenProdu,this.ordenproduConstantesFunciones.activarruc_clienteOrdenProdu,this,true,"ruc_clienteOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ordenproduConstantesFunciones.resaltarruc_clienteOrdenProdu,this.ordenproduConstantesFunciones.activarruc_clienteOrdenProdu,this,true,"ruc_clienteOrdenProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_LOTE));

		if(this.ordenproduConstantesFunciones.mostrarloteOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_LOTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ordenproduConstantesFunciones.resaltarloteOrdenProdu,this.ordenproduConstantesFunciones.activarloteOrdenProdu,this,true,"loteOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ordenproduConstantesFunciones.resaltarloteOrdenProdu,this.ordenproduConstantesFunciones.activarloteOrdenProdu,this,true,"loteOrdenProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO));

		if(this.ordenproduConstantesFunciones.mostrarfecha_pedidoOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ordenproduConstantesFunciones.resaltarfecha_pedidoOrdenProdu,this.ordenproduConstantesFunciones.activarfecha_pedidoOrdenProdu,this,true,"fecha_pedidoOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ordenproduConstantesFunciones.resaltarfecha_pedidoOrdenProdu,this.ordenproduConstantesFunciones.activarfecha_pedidoOrdenProdu,this,true,"fecha_pedidoOrdenProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_FECHAENTREGA));

		if(this.ordenproduConstantesFunciones.mostrarfecha_entregaOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_FECHAENTREGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ordenproduConstantesFunciones.resaltarfecha_entregaOrdenProdu,this.ordenproduConstantesFunciones.activarfecha_entregaOrdenProdu,this,true,"fecha_entregaOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ordenproduConstantesFunciones.resaltarfecha_entregaOrdenProdu,this.ordenproduConstantesFunciones.activarfecha_entregaOrdenProdu,this,true,"fecha_entregaOrdenProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO));

		if(this.ordenproduConstantesFunciones.mostrares_uso_internoOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.ordenproduConstantesFunciones.resaltares_uso_internoOrdenProdu,this.ordenproduConstantesFunciones.activares_uso_internoOrdenProdu));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.ordenproduConstantesFunciones.resaltares_uso_internoOrdenProdu,this.ordenproduConstantesFunciones.activares_uso_internoOrdenProdu,this,true,"es_uso_internoOrdenProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_FECHA));

		if(this.ordenproduConstantesFunciones.mostrarfechaOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.ordenproduConstantesFunciones.resaltarfechaOrdenProdu,this.ordenproduConstantesFunciones.activarfechaOrdenProdu,this,true,"fechaOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.ordenproduConstantesFunciones.resaltarfechaOrdenProdu,this.ordenproduConstantesFunciones.activarfechaOrdenProdu,this,true,"fechaOrdenProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.ordenproduConstantesFunciones.mostrardescripcionOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ordenproduConstantesFunciones.resaltardescripcionOrdenProdu,this.ordenproduConstantesFunciones.activardescripcionOrdenProdu,this,true,"descripcionOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ordenproduConstantesFunciones.resaltardescripcionOrdenProdu,this.ordenproduConstantesFunciones.activardescripcionOrdenProdu,this,true,"descripcionOrdenProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU));

		if(this.ordenproduConstantesFunciones.mostrarid_estado_orden_produOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoOrdenProduTableCell(this.estadoordenprodusForeignKey,this.ordenproduConstantesFunciones.resaltarid_estado_orden_produOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_estado_orden_produOrdenProdu));
			tableColumn.setCellEditor(new EstadoOrdenProduTableCell(this.estadoordenprodusForeignKey,this.ordenproduConstantesFunciones.resaltarid_estado_orden_produOrdenProdu,this,this.ordenproduConstantesFunciones.activarid_estado_orden_produOrdenProdu,true,"id_estado_orden_produOrdenProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new OrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosOrdenDetaProdu && this.ordenproduConstantesFunciones.mostrarOrdenDetaProduOrdenProdu && !OrdenProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Orden Detalle Producciones");
				tableColumn.setHeaderValue("Orden Detalle Producciones");
				tableColumn.setCellRenderer(new OrdenDetaProduTableCell(ordenproduConstantesFunciones.resaltarOrdenDetaProduOrdenProdu,this,this.ordenproduConstantesFunciones.activarOrdenDetaProduOrdenProdu));
				tableColumn.setCellEditor(new OrdenDetaProduTableCell(ordenproduConstantesFunciones.resaltarOrdenDetaProduOrdenProdu,this,this.ordenproduConstantesFunciones.activarOrdenDetaProduOrdenProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosOrdenProdu.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ordenproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ordenproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosOrdenProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ordenproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ordenproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosOrdenProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ordenproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ordenproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosOrdenProdu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.ordenproduSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosOrdenProdu.addColumn(tableColumn);
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
			
			this.jTableDatosOrdenProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.ordenproduSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosOrdenProdu.moveColumn(this.jTableDatosOrdenProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosOrdenProdu.moveColumn(this.jTableDatosOrdenProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.ordenproduSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosOrdenProdu.moveColumn(this.jTableDatosOrdenProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosOrdenProdu.moveColumn(this.jTableDatosOrdenProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosOrdenProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosOrdenProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosOrdenProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosOrdenProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosOrdenProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosOrdenProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosOrdenProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosOrdenProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=ordenproduLogic.getOrdenProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ordenprodus.size()-1;
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
		//this.jTableDatosOrdenProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosOrdenProdu();
			
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
				
				//this.isEsNuevoOrdenProdu=false;
					
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
				if(this.ordenproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormOrdenProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosOrdenProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosOrdenProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ordenprodu.getsType().equals("DUPLICADO")
				   || this.ordenprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoOrdenProdu=true;
				
				} else {
					this.isEsNuevoOrdenProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
					if(this.ordenprodu.getId()>=0 && !this.ordenprodu.getIsNew()) {						
						this.isEsNuevoOrdenProdu=false;
						
					} else {
						this.isEsNuevoOrdenProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoOrdenProdu(esRelaciones);						
				
				this.seleccionarOrdenProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ordenprodu.getId()<0) {
					this.isEsNuevoOrdenProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarOrdenProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarOrdenProdu(evt,rowIndex);
				}	
				
				if(this.ordenproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion OrdenProdu: " + this.dDif); 
					}
				}								
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarOrdenProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ordenprodu)) {
					if(this.ordenprodu.getId()>0) {
						this.ordenprodu.setIsDeleted(true);
						
						this.ordenprodusEliminados.add(this.ordenprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ordenproduLogic.getOrdenProdus().remove(this.ordenprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ordenprodus.remove(this.ordenprodu);				
					}
					
					
					((OrdenProduModel) this.jTableDatosOrdenProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaOrdenProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarOrdenProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoOrdenProdu) {
			
			if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosOrdenProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosOrdenProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioOrdenProdu(this.ordenprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.ordenproduConstantesFunciones.cargarid_empresaOrdenProdu || this.ordenproduConstantesFunciones.event_dependid_empresaOrdenProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.ordenprodu.getid_empresa());
									//this.inicializarActualizarBindingOrdenProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(ordenprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(ordenprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.ordenprodu.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.ordenproduConstantesFunciones.cargarid_sucursalOrdenProdu || this.ordenproduConstantesFunciones.event_dependid_sucursalOrdenProdu) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.ordenprodu.getid_sucursal());
									//this.inicializarActualizarBindingOrdenProdu(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(ordenprodu.getSucursal()!=null) {
							this.sucursalsForeignKey.add(ordenprodu.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.ordenprodu.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.ordenproduConstantesFunciones.cargarid_ejercicioOrdenProdu || this.ordenproduConstantesFunciones.event_dependid_ejercicioOrdenProdu) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.ordenprodu.getid_ejercicio());
									//this.inicializarActualizarBindingOrdenProdu(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(ordenprodu.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(ordenprodu.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.ordenprodu.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.ordenproduConstantesFunciones.cargarid_periodoOrdenProdu || this.ordenproduConstantesFunciones.event_dependid_periodoOrdenProdu) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.ordenprodu.getid_periodo());
									//this.inicializarActualizarBindingOrdenProdu(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(ordenprodu.getPeriodo()!=null) {
							this.periodosForeignKey.add(ordenprodu.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.ordenprodu.getid_periodo(),false,"Formulario");

					//Formato
					if(!this.ordenproduConstantesFunciones.cargarid_formatoOrdenProdu || this.ordenproduConstantesFunciones.event_dependid_formatoOrdenProdu) {
						//this.cargarCombosFormatosForeignKeyLista(" where id="+this.ordenprodu.getid_formato());
									//this.inicializarActualizarBindingOrdenProdu(false,false);
						this.formatosForeignKey=new ArrayList<Formato>();

						if(ordenprodu.getFormato()!=null) {
							this.formatosForeignKey.add(ordenprodu.getFormato());
						}

						this.addItemDefectoCombosForeignKeyFormato();
						this.cargarCombosFrameFormatosForeignKey("Todos");
					}
					this.setActualFormatoForeignKey(this.ordenprodu.getid_formato(),false,"Formulario");

					//TipoPrioridadEmpresaProdu
					if(!this.ordenproduConstantesFunciones.cargarid_tipo_prioridad_empresa_produOrdenProdu || this.ordenproduConstantesFunciones.event_dependid_tipo_prioridad_empresa_produOrdenProdu) {
						//this.cargarCombosTipoPrioridadEmpresaProdusForeignKeyLista(" where id="+this.ordenprodu.getid_tipo_prioridad_empresa_produ());
									//this.inicializarActualizarBindingOrdenProdu(false,false);
						this.tipoprioridadempresaprodusForeignKey=new ArrayList<TipoPrioridadEmpresaProdu>();

						if(ordenprodu.getTipoPrioridadEmpresaProdu()!=null) {
							this.tipoprioridadempresaprodusForeignKey.add(ordenprodu.getTipoPrioridadEmpresaProdu());
						}

						this.addItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu();
						this.cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey("Todos");
					}
					this.setActualTipoPrioridadEmpresaProduForeignKey(this.ordenprodu.getid_tipo_prioridad_empresa_produ(),false,"Formulario");

					//EmpleadoResponsable
					if(!this.ordenproduConstantesFunciones.cargarid_empleado_responsableOrdenProdu || this.ordenproduConstantesFunciones.event_dependid_empleado_responsableOrdenProdu) {
						//this.cargarCombosEmpleadoResponsablesForeignKeyLista(" where id="+this.ordenprodu.getid_empleado_responsable());
									//this.inicializarActualizarBindingOrdenProdu(false,false);
						this.empleadoresponsablesForeignKey=new ArrayList<Empleado>();

						if(ordenprodu.getEmpleadoResponsable()!=null) {
							this.empleadoresponsablesForeignKey.add(ordenprodu.getEmpleadoResponsable());
						}

						this.addItemDefectoCombosForeignKeyEmpleadoResponsable();
						this.cargarCombosFrameEmpleadoResponsablesForeignKey("Todos");
					}
					this.setActualEmpleadoResponsableForeignKey(this.ordenprodu.getid_empleado_responsable(),false,"Formulario");

					//Cliente
					if(!this.ordenproduConstantesFunciones.cargarid_clienteOrdenProdu || this.ordenproduConstantesFunciones.event_dependid_clienteOrdenProdu) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.ordenprodu.getid_cliente());
									//this.inicializarActualizarBindingOrdenProdu(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(ordenprodu.getCliente()!=null) {
							this.clientesForeignKey.add(ordenprodu.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.ordenprodu.getid_cliente(),false,"Formulario");

					//EstadoOrdenProdu
					if(!this.ordenproduConstantesFunciones.cargarid_estado_orden_produOrdenProdu || this.ordenproduConstantesFunciones.event_dependid_estado_orden_produOrdenProdu) {
						//this.cargarCombosEstadoOrdenProdusForeignKeyLista(" where id="+this.ordenprodu.getid_estado_orden_produ());
									//this.inicializarActualizarBindingOrdenProdu(false,false);
						this.estadoordenprodusForeignKey=new ArrayList<EstadoOrdenProdu>();

						if(ordenprodu.getEstadoOrdenProdu()!=null) {
							this.estadoordenprodusForeignKey.add(ordenprodu.getEstadoOrdenProdu());
						}

						this.addItemDefectoCombosForeignKeyEstadoOrdenProdu();
						this.cargarCombosFrameEstadoOrdenProdusForeignKey("Todos");
					}
					this.setActualEstadoOrdenProduForeignKey(this.ordenprodu.getid_estado_orden_produ(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesOrdenProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesOrdenProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualOrdenProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoOrdenProdu(OrdenProdu ordenprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoOrdenProdu(ordenprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoOrdenProdu(OrdenProdu ordenprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioOrdenProdu(ordenprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyOrdenProdu(ordenprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyOrdenProdu(ordenprodu);
	}
	
	public void setVariablesObjetoActualToFormularioOrdenProdu(OrdenProdu ordenprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.setText(ordenprodu.getId().toString());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldsecuencialOrdenProdu.setText(ordenprodu.getsecuencial());
			this.jInternalFrameDetalleFormOrdenProdu.jTextAreadireccion_clienteOrdenProdu.setText(ordenprodu.getdireccion_cliente());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldtelefono_clienteOrdenProdu.setText(ordenprodu.gettelefono_cliente());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldruc_clienteOrdenProdu.setText(ordenprodu.getruc_cliente());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldloteOrdenProdu.setText(ordenprodu.getlote());
			this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_pedidoOrdenProdu.setDate(ordenprodu.getfecha_pedido());
			this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_entregaOrdenProdu.setDate(ordenprodu.getfecha_entrega());
			this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxes_uso_internoOrdenProdu.setSelected(ordenprodu.getes_uso_interno());
			this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfechaOrdenProdu.setDate(ordenprodu.getfecha());
			this.jInternalFrameDetalleFormOrdenProdu.jTextAreadescripcionOrdenProdu.setText(ordenprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,OrdenProdu ordenproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ordenproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,OrdenProdu ordenproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ordenproduLocal=this.ordenprodu;
			} else {
				ordenproduLocal=this.ordenproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ordenproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoOrdenProdu(ordenproduLocal,true);
					
					if(ordenproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ordenproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ordenproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ordenproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoOrdenProdu(OrdenProdu ordenprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualOrdenProdu(ordenprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(ordenprodu);
	}
	
	public void setVariablesFormularioToObjetoActualOrdenProdu(OrdenProdu ordenprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualOrdenProdu(ordenprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualOrdenProdu(OrdenProdu ordenprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.getText()==null || this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.getText()=="" || this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.setText("0");
			}

			if(conColumnasBase) {ordenprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelIdOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ordenprodu.setsecuencial(this.jInternalFrameDetalleFormOrdenProdu.jTextFieldsecuencialOrdenProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelsecuencialOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ordenprodu.setdireccion_cliente(this.jInternalFrameDetalleFormOrdenProdu.jTextAreadireccion_clienteOrdenProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabeldireccion_clienteOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ordenprodu.settelefono_cliente(this.jInternalFrameDetalleFormOrdenProdu.jTextFieldtelefono_clienteOrdenProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabeltelefono_clienteOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ordenprodu.setruc_cliente(this.jInternalFrameDetalleFormOrdenProdu.jTextFieldruc_clienteOrdenProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_RUCCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelruc_clienteOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ordenprodu.setlote(this.jInternalFrameDetalleFormOrdenProdu.jTextFieldloteOrdenProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_LOTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelloteOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ordenprodu.setfecha_pedido(this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_pedidoOrdenProdu.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelfecha_pedidoOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ordenprodu.setfecha_entrega(this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_entregaOrdenProdu.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_FECHAENTREGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelfecha_entregaOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ordenprodu.setes_uso_interno(this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxes_uso_internoOrdenProdu.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabeles_uso_internoOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ordenprodu.setfecha(this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfechaOrdenProdu.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabelfechaOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ordenprodu.setdescripcion(this.jInternalFrameDetalleFormOrdenProdu.jTextAreadescripcionOrdenProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+OrdenProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormOrdenProdu.jLabeldescripcionOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualOrdenProdu(OrdenProdu ordenproduBean,OrdenProdu ordenprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && ordenproduBean.getid_formato()!=null && !ordenproduBean.getid_formato().equals(null))) {ordenprodu.setid_formato(ordenproduBean.getid_formato());}
			if(conDefault || (!conDefault && ordenproduBean.getid_tipo_prioridad_empresa_produ()!=null && !ordenproduBean.getid_tipo_prioridad_empresa_produ().equals(-1L))) {ordenprodu.setid_tipo_prioridad_empresa_produ(ordenproduBean.getid_tipo_prioridad_empresa_produ());}
			if(conDefault || (!conDefault && ordenproduBean.getid_empleado_responsable()!=null && !ordenproduBean.getid_empleado_responsable().equals(-1L))) {ordenprodu.setid_empleado_responsable(ordenproduBean.getid_empleado_responsable());}
			if(conDefault || (!conDefault && ordenproduBean.getid_cliente()!=null && !ordenproduBean.getid_cliente().equals(-1L))) {ordenprodu.setid_cliente(ordenproduBean.getid_cliente());}
			if(conDefault || (!conDefault && ordenproduBean.getid_estado_orden_produ()!=null && !ordenproduBean.getid_estado_orden_produ().equals(-1L))) {ordenprodu.setid_estado_orden_produ(ordenproduBean.getid_estado_orden_produ());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosOrdenProdu(OrdenProdu ordenproduOrigen,OrdenProdu ordenprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ordenproduOrigen.getId()!=null && !ordenproduOrigen.getId().equals(0L))) {ordenprodu.setId(ordenproduOrigen.getId());}}
			if(conDefault || (!conDefault && ordenproduOrigen.getid_formato()!=null && !ordenproduOrigen.getid_formato().equals(null))) {ordenprodu.setid_formato(ordenproduOrigen.getid_formato());}
			if(conDefault || (!conDefault && ordenproduOrigen.getid_tipo_prioridad_empresa_produ()!=null && !ordenproduOrigen.getid_tipo_prioridad_empresa_produ().equals(-1L))) {ordenprodu.setid_tipo_prioridad_empresa_produ(ordenproduOrigen.getid_tipo_prioridad_empresa_produ());}
			if(conDefault || (!conDefault && ordenproduOrigen.getid_empleado_responsable()!=null && !ordenproduOrigen.getid_empleado_responsable().equals(-1L))) {ordenprodu.setid_empleado_responsable(ordenproduOrigen.getid_empleado_responsable());}
			if(conDefault || (!conDefault && ordenproduOrigen.getsecuencial()!=null && !ordenproduOrigen.getsecuencial().equals(""))) {ordenprodu.setsecuencial(ordenproduOrigen.getsecuencial());}
			if(conDefault || (!conDefault && ordenproduOrigen.getid_cliente()!=null && !ordenproduOrigen.getid_cliente().equals(-1L))) {ordenprodu.setid_cliente(ordenproduOrigen.getid_cliente());}
			if(conDefault || (!conDefault && ordenproduOrigen.getdireccion_cliente()!=null && !ordenproduOrigen.getdireccion_cliente().equals(""))) {ordenprodu.setdireccion_cliente(ordenproduOrigen.getdireccion_cliente());}
			if(conDefault || (!conDefault && ordenproduOrigen.gettelefono_cliente()!=null && !ordenproduOrigen.gettelefono_cliente().equals(""))) {ordenprodu.settelefono_cliente(ordenproduOrigen.gettelefono_cliente());}
			if(conDefault || (!conDefault && ordenproduOrigen.getruc_cliente()!=null && !ordenproduOrigen.getruc_cliente().equals(""))) {ordenprodu.setruc_cliente(ordenproduOrigen.getruc_cliente());}
			if(conDefault || (!conDefault && ordenproduOrigen.getlote()!=null && !ordenproduOrigen.getlote().equals(""))) {ordenprodu.setlote(ordenproduOrigen.getlote());}
			if(conDefault || (!conDefault && ordenproduOrigen.getfecha_pedido()!=null && !ordenproduOrigen.getfecha_pedido().equals(new Date()))) {ordenprodu.setfecha_pedido(ordenproduOrigen.getfecha_pedido());}
			if(conDefault || (!conDefault && ordenproduOrigen.getfecha_entrega()!=null && !ordenproduOrigen.getfecha_entrega().equals(new Date()))) {ordenprodu.setfecha_entrega(ordenproduOrigen.getfecha_entrega());}
			if(conDefault || (!conDefault && ordenproduOrigen.getes_uso_interno()!=null && !ordenproduOrigen.getes_uso_interno().equals(false))) {ordenprodu.setes_uso_interno(ordenproduOrigen.getes_uso_interno());}
			if(conDefault || (!conDefault && ordenproduOrigen.getfecha()!=null && !ordenproduOrigen.getfecha().equals(new Date()))) {ordenprodu.setfecha(ordenproduOrigen.getfecha());}
			if(conDefault || (!conDefault && ordenproduOrigen.getdescripcion()!=null && !ordenproduOrigen.getdescripcion().equals(""))) {ordenprodu.setdescripcion(ordenproduOrigen.getdescripcion());}
			if(conDefault || (!conDefault && ordenproduOrigen.getid_estado_orden_produ()!=null && !ordenproduOrigen.getid_estado_orden_produ().equals(-1L))) {ordenprodu.setid_estado_orden_produ(ordenproduOrigen.getid_estado_orden_produ());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioOrdenProdu(OrdenProdu ordenprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.setText(ordenprodu.getId().toString());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldsecuencialOrdenProdu.setText(ordenprodu.getsecuencial());
			this.jInternalFrameDetalleFormOrdenProdu.jTextAreadireccion_clienteOrdenProdu.setText(ordenprodu.getdireccion_cliente());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldtelefono_clienteOrdenProdu.setText(ordenprodu.gettelefono_cliente());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldruc_clienteOrdenProdu.setText(ordenprodu.getruc_cliente());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldloteOrdenProdu.setText(ordenprodu.getlote());
			this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_pedidoOrdenProdu.setDate(ordenprodu.getfecha_pedido());
			this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_entregaOrdenProdu.setDate(ordenprodu.getfecha_entrega());
			this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxes_uso_internoOrdenProdu.setSelected(ordenprodu.getes_uso_interno());
			this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfechaOrdenProdu.setDate(ordenprodu.getfecha());
			this.jInternalFrameDetalleFormOrdenProdu.jTextAreadescripcionOrdenProdu.setText(ordenprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioOrdenProdu(OrdenProduBean ordenproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.setText(ordenproduBean.getId().toString());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldsecuencialOrdenProdu.setText(ordenproduBean.getsecuencial());
			this.jInternalFrameDetalleFormOrdenProdu.jTextAreadireccion_clienteOrdenProdu.setText(ordenproduBean.getdireccion_cliente());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldtelefono_clienteOrdenProdu.setText(ordenproduBean.gettelefono_cliente());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldruc_clienteOrdenProdu.setText(ordenproduBean.getruc_cliente());
			this.jInternalFrameDetalleFormOrdenProdu.jTextFieldloteOrdenProdu.setText(ordenproduBean.getlote());
			this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_pedidoOrdenProdu.setDate(ordenproduBean.getfecha_pedido());
			this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_entregaOrdenProdu.setDate(ordenproduBean.getfecha_entrega());
			this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxes_uso_internoOrdenProdu.setSelected(ordenproduBean.getes_uso_interno());
			this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfechaOrdenProdu.setDate(ordenproduBean.getfecha());
			this.jInternalFrameDetalleFormOrdenProdu.jTextAreadescripcionOrdenProdu.setText(ordenproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanOrdenProdu(OrdenProduParameterReturnGeneral ordenproduReturnGeneral,OrdenProduBean ordenproduBean,Boolean conDefault) throws Exception { 
		try {
			OrdenProdu ordenproduLocal=new OrdenProdu();
			
			ordenproduLocal=ordenproduReturnGeneral.getOrdenProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ordenproduLocal.getId()!=null && !ordenproduLocal.getId().equals(0L))) {ordenproduBean.setId(ordenproduLocal.getId());}}
			if(conDefault || (!conDefault && ordenproduLocal.getid_formato()!=null && !ordenproduLocal.getid_formato().equals(null))) {ordenproduBean.setid_formato(ordenproduLocal.getid_formato());}
			if(conDefault || (!conDefault && ordenproduLocal.getid_tipo_prioridad_empresa_produ()!=null && !ordenproduLocal.getid_tipo_prioridad_empresa_produ().equals(-1L))) {ordenproduBean.setid_tipo_prioridad_empresa_produ(ordenproduLocal.getid_tipo_prioridad_empresa_produ());}
			if(conDefault || (!conDefault && ordenproduLocal.getid_empleado_responsable()!=null && !ordenproduLocal.getid_empleado_responsable().equals(-1L))) {ordenproduBean.setid_empleado_responsable(ordenproduLocal.getid_empleado_responsable());}
			if(conDefault || (!conDefault && ordenproduLocal.getsecuencial()!=null && !ordenproduLocal.getsecuencial().equals(""))) {ordenproduBean.setsecuencial(ordenproduLocal.getsecuencial());}
			if(conDefault || (!conDefault && ordenproduLocal.getid_cliente()!=null && !ordenproduLocal.getid_cliente().equals(-1L))) {ordenproduBean.setid_cliente(ordenproduLocal.getid_cliente());}
			if(conDefault || (!conDefault && ordenproduLocal.getdireccion_cliente()!=null && !ordenproduLocal.getdireccion_cliente().equals(""))) {ordenproduBean.setdireccion_cliente(ordenproduLocal.getdireccion_cliente());}
			if(conDefault || (!conDefault && ordenproduLocal.gettelefono_cliente()!=null && !ordenproduLocal.gettelefono_cliente().equals(""))) {ordenproduBean.settelefono_cliente(ordenproduLocal.gettelefono_cliente());}
			if(conDefault || (!conDefault && ordenproduLocal.getruc_cliente()!=null && !ordenproduLocal.getruc_cliente().equals(""))) {ordenproduBean.setruc_cliente(ordenproduLocal.getruc_cliente());}
			if(conDefault || (!conDefault && ordenproduLocal.getlote()!=null && !ordenproduLocal.getlote().equals(""))) {ordenproduBean.setlote(ordenproduLocal.getlote());}
			if(conDefault || (!conDefault && ordenproduLocal.getfecha_pedido()!=null && !ordenproduLocal.getfecha_pedido().equals(new Date()))) {ordenproduBean.setfecha_pedido(ordenproduLocal.getfecha_pedido());}
			if(conDefault || (!conDefault && ordenproduLocal.getfecha_entrega()!=null && !ordenproduLocal.getfecha_entrega().equals(new Date()))) {ordenproduBean.setfecha_entrega(ordenproduLocal.getfecha_entrega());}
			if(conDefault || (!conDefault && ordenproduLocal.getes_uso_interno()!=null && !ordenproduLocal.getes_uso_interno().equals(false))) {ordenproduBean.setes_uso_interno(ordenproduLocal.getes_uso_interno());}
			if(conDefault || (!conDefault && ordenproduLocal.getfecha()!=null && !ordenproduLocal.getfecha().equals(new Date()))) {ordenproduBean.setfecha(ordenproduLocal.getfecha());}
			if(conDefault || (!conDefault && ordenproduLocal.getdescripcion()!=null && !ordenproduLocal.getdescripcion().equals(""))) {ordenproduBean.setdescripcion(ordenproduLocal.getdescripcion());}
			if(conDefault || (!conDefault && ordenproduLocal.getid_estado_orden_produ()!=null && !ordenproduLocal.getid_estado_orden_produ().equals(-1L))) {ordenproduBean.setid_estado_orden_produ(ordenproduLocal.getid_estado_orden_produ());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxOrdenProduGenerico(Long idOrdenProduSeleccionado,JComboBox jComboBoxOrdenProdu,List<OrdenProdu> ordenprodusLocal)throws Exception {
		try {
			OrdenProdu  ordenproduTemp=null;

			for(OrdenProdu ordenproduAux:ordenprodusLocal) {
				if(ordenproduAux.getId()!=null && ordenproduAux.getId().equals(idOrdenProduSeleccionado)) {
					ordenproduTemp=ordenproduAux;
					break;
				}
			}

			jComboBoxOrdenProdu.setSelectedItem(ordenproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxOrdenProduGenerico(JComboBox jComboBoxOrdenProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxOrdenProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxOrdenProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxOrdenProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxOrdenProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("OrdenDetaProdu")) {
			jButtonOrdenDetaProduActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ordenprodu=(OrdenProdu) ordenproduLogic.getOrdenProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ordenprodu =(OrdenProdu) ordenprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ordenprodu.getIsNew() && !ordenprodu.getIsChanged() && !ordenprodu.getIsDeleted()) {
				sDescripcion=ordenprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ordenprodu.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!ordenprodu.getIsNew() && !ordenprodu.getIsChanged() && !ordenprodu.getIsDeleted()) {
				sDescripcion=ordenprodu.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=ordenprodu.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!ordenprodu.getIsNew() && !ordenprodu.getIsChanged() && !ordenprodu.getIsDeleted()) {
				sDescripcion=ordenprodu.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=ordenprodu.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!ordenprodu.getIsNew() && !ordenprodu.getIsChanged() && !ordenprodu.getIsDeleted()) {
				sDescripcion=ordenprodu.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=ordenprodu.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Formato")) {
			//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
			if(!ordenprodu.getIsNew() && !ordenprodu.getIsChanged() && !ordenprodu.getIsDeleted()) {
				sDescripcion=ordenprodu.getformato_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=ordenprodu.getformato_descripcion();
			}
		}

		if(sTipo.equals("TipoPrioridadEmpresaProdu")) {
			//sDescripcion=this.getActualTipoPrioridadEmpresaProduForeignKeyDescripcion((Long)value);
			if(!ordenprodu.getIsNew() && !ordenprodu.getIsChanged() && !ordenprodu.getIsDeleted()) {
				sDescripcion=ordenprodu.gettipoprioridadempresaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPrioridadEmpresaProduForeignKeyDescripcion((Long)value);
				sDescripcion=ordenprodu.gettipoprioridadempresaprodu_descripcion();
			}
		}

		if(sTipo.equals("EmpleadoResponsable")) {
			//sDescripcion=this.getActualEmpleadoResponsableForeignKeyDescripcion((Long)value);
			if(!ordenprodu.getIsNew() && !ordenprodu.getIsChanged() && !ordenprodu.getIsDeleted()) {
				sDescripcion=ordenprodu.getempleadoresponsable_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoResponsableForeignKeyDescripcion((Long)value);
				sDescripcion=ordenprodu.getempleadoresponsable_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!ordenprodu.getIsNew() && !ordenprodu.getIsChanged() && !ordenprodu.getIsDeleted()) {
				sDescripcion=ordenprodu.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=ordenprodu.getcliente_descripcion();
			}
		}

		if(sTipo.equals("EstadoOrdenProdu")) {
			//sDescripcion=this.getActualEstadoOrdenProduForeignKeyDescripcion((Long)value);
			if(!ordenprodu.getIsNew() && !ordenprodu.getIsChanged() && !ordenprodu.getIsDeleted()) {
				sDescripcion=ordenprodu.getestadoordenprodu_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoOrdenProduForeignKeyDescripcion((Long)value);
				sDescripcion=ordenprodu.getestadoordenprodu_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		OrdenProdu ordenproduRow=new OrdenProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ordenproduRow=(OrdenProdu) ordenproduLogic.getOrdenProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ordenproduRow=(OrdenProdu) ordenprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonOrdenDetaProduActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,OrdenProdu ordenprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormOrdenProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu = (OrdenProdu)this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.ordenprodu = (OrdenProdu)this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(ordenprodu!=null) {
						this.ordenprodu = ordenprodu;
					} else {
						this.ordenprodu = new OrdenProdu();
					}
				}

				if(this.isTienePermisosOrdenDetaProdu && this.permiteMantenimiento(this.ordenprodu)) {
					OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFramePopup=new OrdenDetaProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						ordendetaproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFramePopup;
					} else {
						ordendetaproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame;
					}

					List<OrdenProdu> ordenprodus=new ArrayList<OrdenProdu>();
					ordenprodus.add(this.ordenprodu);
					if(!esRelacionado) {
						//ordendetaproduBeanSwingJInternalFrame.ordendetaproduSessionBean.setConGuardarRelaciones(false);
						//ordendetaproduBeanSwingJInternalFrame.ordendetaproduSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					ordendetaproduBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormOrdenProdu.cargarOrdenDetaProduBeanSwingJInternalFrame(ordenprodus,this.ordenprodu,ordendetaproduBeanSwingJInternalFrame,/*conInicializar,*/ordendetaproduBeanSwingJInternalFrame.ordendetaproduSessionBean.getConGuardarRelaciones(),ordendetaproduBeanSwingJInternalFrame.ordendetaproduSessionBean.getEsGuardarRelacionado());
					ordendetaproduBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						ordendetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenDetaProdu("no_relacionado");

						ordendetaproduBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(OrdenDetaProduConstantesFunciones.ITAMANIOFILATABLA + (OrdenDetaProduConstantesFunciones.ITAMANIOFILATABLA/2));

						ordendetaproduBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
						TitledBorder titledBorderOrdenDetaProdu=(TitledBorder)ordendetaproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenDetaProdu.getBorder();

						titledBorderOrdenDetaProdu.setTitle(titledBorderOrdenProdu.getTitle() + " -> Orden Detalle Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,ordendetaproduBeanSwingJInternalFrame);
						}

						ordendetaproduBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(ordendetaproduBeanSwingJInternalFrame);

						ordendetaproduBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.ordenproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Orden Detalle Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualOrdenProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoOrdenProdu && this.isPermisoNuevoOrdenProdu));			
			this.jButtonDuplicarOrdenProdu.setVisible((this.isVisibilidadCeldaDuplicarOrdenProdu && this.isPermisoDuplicarOrdenProdu));			
			this.jButtonCopiarOrdenProdu.setVisible((this.isVisibilidadCeldaCopiarOrdenProdu && this.isPermisoCopiarOrdenProdu));
			this.jButtonVerFormOrdenProdu.setVisible((this.isVisibilidadCeldaVerFormOrdenProdu && this.isPermisoVerFormOrdenProdu));
			
			this.jButtonAbrirOrderByOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenOrdenProdu && this.isPermisoOrdenOrdenProdu));			
			
			this.jButtonNuevoRelacionesOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesOrdenProdu && this.isPermisoNuevoOrdenProdu));			
			this.jButtonNuevoGuardarCambiosOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoOrdenProdu && this.isPermisoNuevoOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu));
			
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonModificarOrdenProdu.setVisible((this.isVisibilidadCeldaModificarOrdenProdu && this.isPermisoActualizarOrdenProdu));	
			this.jInternalFrameDetalleFormOrdenProdu.jButtonActualizarOrdenProdu.setVisible((this.isVisibilidadCeldaActualizarOrdenProdu && this.isPermisoActualizarOrdenProdu));	
			this.jInternalFrameDetalleFormOrdenProdu.jButtonEliminarOrdenProdu.setVisible((this.isVisibilidadCeldaEliminarOrdenProdu && this.isPermisoEliminarOrdenProdu));
			this.jInternalFrameDetalleFormOrdenProdu.jButtonCancelarOrdenProdu.setVisible(this.isVisibilidadCeldaCancelarOrdenProdu);							
			this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoOrdenProdu && this.isPermisoNuevoOrdenProdu));						
			this.jButtonDuplicarToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaDuplicarOrdenProdu && this.isPermisoDuplicarOrdenProdu));						
			this.jButtonCopiarToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaCopiarOrdenProdu && this.isPermisoCopiarOrdenProdu));			
			this.jButtonVerFormToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaVerFormOrdenProdu && this.isPermisoVerFormOrdenProdu));			
			this.jButtonAbrirOrderByToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenOrdenProdu && this.isPermisoOrdenOrdenProdu));
			this.jButtonNuevoRelacionesToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesOrdenProdu && this.isPermisoNuevoOrdenProdu));			
			this.jButtonNuevoGuardarCambiosToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoOrdenProdu && this.isPermisoNuevoOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu));			
			
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonModificarToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaModificarOrdenProdu && this.isPermisoActualizarOrdenProdu));	
			this.jInternalFrameDetalleFormOrdenProdu.jButtonActualizarToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaActualizarOrdenProdu  && this.isPermisoActualizarOrdenProdu));	
			this.jInternalFrameDetalleFormOrdenProdu.jButtonEliminarToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaEliminarOrdenProdu && this.isPermisoEliminarOrdenProdu));
			this.jInternalFrameDetalleFormOrdenProdu.jButtonCancelarToolBarOrdenProdu.setVisible(this.isVisibilidadCeldaCancelarOrdenProdu);				
			this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoOrdenProdu && this.isPermisoNuevoOrdenProdu));			
			this.jMenuItemDuplicarOrdenProdu.setVisible((this.isVisibilidadCeldaDuplicarOrdenProdu && this.isPermisoDuplicarOrdenProdu));			
			this.jMenuItemCopiarOrdenProdu.setVisible((this.isVisibilidadCeldaCopiarOrdenProdu && this.isPermisoCopiarOrdenProdu));			
			this.jMenuItemVerFormOrdenProdu.setVisible((this.isVisibilidadCeldaVerFormOrdenProdu && this.isPermisoVerFormOrdenProdu));			
			this.jMenuItemAbrirOrderByOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenOrdenProdu && this.isPermisoOrdenOrdenProdu));			
			//this.jMenuItemMostrarOcultarOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenOrdenProdu && this.isPermisoOrdenOrdenProdu));
			this.jMenuItemDetalleAbrirOrderByOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenOrdenProdu && this.isPermisoOrdenOrdenProdu));			
			//this.jMenuItemDetalleMostrarOcultarOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenOrdenProdu && this.isPermisoOrdenOrdenProdu));			
			this.jMenuItemNuevoRelacionesOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesOrdenProdu && this.isPermisoNuevoOrdenProdu));			
			this.jMenuItemNuevoGuardarCambiosOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoOrdenProdu && this.isPermisoNuevoOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu));									
			
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			this.jInternalFrameDetalleFormOrdenProdu.jMenuItemModificarOrdenProdu.setVisible((this.isVisibilidadCeldaModificarOrdenProdu && this.isPermisoActualizarOrdenProdu));	
			this.jInternalFrameDetalleFormOrdenProdu.jMenuItemActualizarOrdenProdu.setVisible((this.isVisibilidadCeldaActualizarOrdenProdu && this.isPermisoActualizarOrdenProdu));	
			this.jInternalFrameDetalleFormOrdenProdu.jMenuItemEliminarOrdenProdu.setVisible((this.isVisibilidadCeldaEliminarOrdenProdu && this.isPermisoEliminarOrdenProdu));
			this.jInternalFrameDetalleFormOrdenProdu.jMenuItemCancelarOrdenProdu.setVisible(this.isVisibilidadCeldaCancelarOrdenProdu);				
			}
			
			this.jMenuItemGuardarCambiosOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu));						
			this.jMenuItemGuardarCambiosTablaOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoOrdenProdu=this.jButtonNuevoOrdenProdu.isVisible();
			this.isVisibilidadCeldaDuplicarOrdenProdu=this.jButtonDuplicarOrdenProdu.isVisible();
			this.isVisibilidadCeldaCopiarOrdenProdu=this.jButtonCopiarOrdenProdu.isVisible();
			this.isVisibilidadCeldaVerFormOrdenProdu=this.jButtonVerFormOrdenProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenOrdenProdu=this.jButtonAbrirOrderByOrdenProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=this.jButtonNuevoRelacionesOrdenProdu.isVisible();
			this.isVisibilidadCeldaModificarOrdenProdu=this.jButtonModificarOrdenProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			this.isVisibilidadCeldaActualizarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jButtonActualizarOrdenProdu.isVisible();
			this.isVisibilidadCeldaEliminarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jButtonEliminarOrdenProdu.isVisible();
			this.isVisibilidadCeldaCancelarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jButtonCancelarOrdenProdu.isVisible();
			this.isVisibilidadCeldaGuardarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosOrdenProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=this.jButtonGuardarCambiosTablaOrdenProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoOrdenProdu=this.jButtonNuevoToolBarOrdenProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=this.jButtonNuevoRelacionesToolBarOrdenProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			this.isVisibilidadCeldaModificarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jButtonModificarToolBarOrdenProdu.isVisible();
			this.isVisibilidadCeldaActualizarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jButtonActualizarToolBarOrdenProdu.isVisible();
			this.isVisibilidadCeldaEliminarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jButtonEliminarToolBarOrdenProdu.isVisible();
			this.isVisibilidadCeldaCancelarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jButtonCancelarToolBarOrdenProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarOrdenProdu=this.jButtonGuardarCambiosToolBarOrdenProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=this.jButtonGuardarCambiosTablaToolBarOrdenProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoOrdenProdu=this.jMenuItemNuevoOrdenProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=this.jMenuItemNuevoRelacionesOrdenProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			this.isVisibilidadCeldaModificarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jMenuItemModificarOrdenProdu.isVisible();
			this.isVisibilidadCeldaActualizarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jMenuItemActualizarOrdenProdu.isVisible();
			this.isVisibilidadCeldaEliminarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jMenuItemEliminarOrdenProdu.isVisible();
			this.isVisibilidadCeldaCancelarOrdenProdu=this.jInternalFrameDetalleFormOrdenProdu.jMenuItemCancelarOrdenProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarOrdenProdu=this.jMenuItemGuardarCambiosOrdenProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=this.jMenuItemGuardarCambiosTablaOrdenProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesOrdenProdu(Boolean esInicializar) {
		if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ordenproduSessionBean.getConGuardarRelaciones()) {
				//if(this.ordenproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesOrdenProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualOrdenProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualOrdenProdu() {
		this.jButtonNuevoOrdenProdu.setVisible(this.isPermisoNuevoOrdenProdu);			
		this.jButtonDuplicarOrdenProdu.setVisible(this.isPermisoDuplicarOrdenProdu);			
		this.jButtonCopiarOrdenProdu.setVisible(this.isPermisoCopiarOrdenProdu);			
		this.jButtonVerFormOrdenProdu.setVisible(this.isPermisoVerFormOrdenProdu);			
		
		this.jButtonAbrirOrderByOrdenProdu.setVisible(this.isPermisoOrdenOrdenProdu);					
		
		this.jButtonNuevoRelacionesOrdenProdu.setVisible(this.isPermisoNuevoOrdenProdu);			
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonModificarOrdenProdu.setVisible(this.isPermisoActualizarOrdenProdu);	
			this.jInternalFrameDetalleFormOrdenProdu.jButtonActualizarOrdenProdu.setVisible(this.isPermisoActualizarOrdenProdu);	
			this.jInternalFrameDetalleFormOrdenProdu.jButtonEliminarOrdenProdu.setVisible(this.isPermisoEliminarOrdenProdu);
			this.jInternalFrameDetalleFormOrdenProdu.jButtonCancelarOrdenProdu.setVisible(this.isVisibilidadCeldaCancelarOrdenProdu);						
			this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosOrdenProdu.setVisible(this.isPermisoGuardarCambiosOrdenProdu);							
		}
		
		this.jButtonGuardarCambiosTablaOrdenProdu.setVisible(this.isPermisoActualizarOrdenProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleOrdenProdu() {
		this.jInternalFrameDetalleFormOrdenProdu.jButtonModificarOrdenProdu.setVisible(this.isPermisoActualizarOrdenProdu);	
		this.jInternalFrameDetalleFormOrdenProdu.jButtonActualizarOrdenProdu.setVisible(this.isPermisoActualizarOrdenProdu);	
		this.jInternalFrameDetalleFormOrdenProdu.jButtonEliminarOrdenProdu.setVisible(this.isPermisoEliminarOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jButtonCancelarOrdenProdu.setVisible(this.isVisibilidadCeldaCancelarOrdenProdu);							
		this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarOrdenProdu && this.isPermisoGuardarCambiosOrdenProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosOrdenProdu() {
		if(OrdenProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualOrdenProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesOrdenProdu() {
	}
	
	public void jTableDatosOrdenProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarOrdenProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ordenprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaOrdenProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebOrdenProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOrdenProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOrdenProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ordenproduLogic.getConnexion());

				if(this.ordenprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ordenprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderOrdenProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ordenprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalOrdenProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebOrdenProdu(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOrdenProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOrdenProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.ordenproduLogic.getConnexion());

				if(this.ordenprodu.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.ordenprodu.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderOrdenProdu.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.ordenprodu.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioOrdenProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebOrdenProdu(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOrdenProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOrdenProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.ordenproduLogic.getConnexion());

				if(this.ordenprodu.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.ordenprodu.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderOrdenProdu.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.ordenprodu.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoOrdenProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebOrdenProdu(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOrdenProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOrdenProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.ordenproduLogic.getConnexion());

				if(this.ordenprodu.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.ordenprodu.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderOrdenProdu.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.ordenprodu.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formatoOrdenProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato=true;

			idTienePermisoformato=this.tienePermisosUsuarioEnPaginaWebOrdenProdu(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOrdenProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOrdenProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.ordenproduLogic.getConnexion());

				if(this.ordenprodu.getid_formato()!=null) {
					this.formatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoBeanSwingJInternalFrame.setIdActual(this.ordenprodu.getid_formato());
					this.formatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
				TitledBorder titledBorderformato=(TitledBorder)this.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato.setTitle(titledBorderOrdenProdu.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formatoOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getid_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato = "+this.ordenprodu.getid_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_prioridad_empresa_produOrdenProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprioridadempresaprodu=true;

			idTienePermisotipoprioridadempresaprodu=this.tienePermisosUsuarioEnPaginaWebOrdenProdu(TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprioridadempresaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOrdenProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOrdenProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);

				this.tipoprioridadempresaproduBeanSwingJInternalFrame=new TipoPrioridadEmpresaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprioridadempresaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprioridadempresaproduBeanSwingJInternalFrame.getTipoPrioridadEmpresaProduLogic().setConnexion(this.ordenproduLogic.getConnexion());

				if(this.ordenprodu.getid_tipo_prioridad_empresa_produ()!=null) {
					this.tipoprioridadempresaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprioridadempresaproduBeanSwingJInternalFrame.setIdActual(this.ordenprodu.getid_tipo_prioridad_empresa_produ());
					this.tipoprioridadempresaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprioridadempresaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprioridadempresaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu();
				}

				JInternalFrameBase jinternalFrame =this.tipoprioridadempresaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
				TitledBorder titledBordertipoprioridadempresaprodu=(TitledBorder)this.tipoprioridadempresaproduBeanSwingJInternalFrame.jScrollPanelDatosTipoPrioridadEmpresaProdu.getBorder();

				titledBordertipoprioridadempresaprodu.setTitle(titledBorderOrdenProdu.getTitle() + " -> Tipo Prioridad Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_prioridad_empresa_produOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getid_tipo_prioridad_empresa_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_prioridad_empresa_produ = "+this.ordenprodu.getid_tipo_prioridad_empresa_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleado_responsableOrdenProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleadoresponsable=true;

			idTienePermisoempleadoresponsable=this.tienePermisosUsuarioEnPaginaWebOrdenProdu(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleadoresponsable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOrdenProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOrdenProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);

				this.empleadoresponsableBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoresponsableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoresponsableBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.ordenproduLogic.getConnexion());

				if(this.ordenprodu.getid_empleado_responsable()!=null) {
					this.empleadoresponsableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoresponsableBeanSwingJInternalFrame.setIdActual(this.ordenprodu.getid_empleado_responsable());
					this.empleadoresponsableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoresponsableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoresponsableBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoresponsableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
				TitledBorder titledBorderempleadoresponsable=(TitledBorder)this.empleadoresponsableBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadoresponsable.setTitle(titledBorderOrdenProdu.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleado_responsableOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getid_empleado_responsable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado_responsable = "+this.ordenprodu.getid_empleado_responsable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.ordenprodu.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteOrdenProduActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderOrdenProdu=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosOrdenProdu.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderOrdenProdu.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteOrdenProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebOrdenProdu(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOrdenProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOrdenProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.ordenproduLogic.getConnexion());

				if(this.ordenprodu.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.ordenprodu.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderOrdenProdu.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.ordenprodu.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_clienteOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getdireccion_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_cliente like '%"+this.ordenprodu.getdireccion_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_clienteOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.gettelefono_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_cliente like '%"+this.ordenprodu.gettelefono_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_clienteOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getruc_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_cliente like '%"+this.ordenprodu.getruc_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonloteOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getlote()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where lote like '%"+this.ordenprodu.getlote()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_pedidoOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getfecha_pedido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_pedido = '"+Funciones2.getStringPostgresDate(this.ordenprodu.getfecha_pedido())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_entregaOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getfecha_entrega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_entrega = '"+Funciones2.getStringPostgresDate(this.ordenprodu.getfecha_entrega())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_uso_internoOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getes_uso_interno()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_uso_interno = "+this.ordenprodu.getes_uso_interno().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.ordenprodu.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.ordenprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_orden_produOrdenProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadoordenprodu=true;

			idTienePermisoestadoordenprodu=this.tienePermisosUsuarioEnPaginaWebOrdenProdu(EstadoOrdenProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadoordenprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosOrdenProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosOrdenProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);

				this.estadoordenproduBeanSwingJInternalFrame=new EstadoOrdenProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadoordenproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadoordenproduBeanSwingJInternalFrame.getEstadoOrdenProduLogic().setConnexion(this.ordenproduLogic.getConnexion());

				if(this.ordenprodu.getid_estado_orden_produ()!=null) {
					this.estadoordenproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadoordenproduBeanSwingJInternalFrame.setIdActual(this.ordenprodu.getid_estado_orden_produ());
					this.estadoordenproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadoordenproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadoordenproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoOrdenProdu();
				}

				JInternalFrameBase jinternalFrame =this.estadoordenproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderOrdenProdu=(TitledBorder)this.jScrollPanelDatosOrdenProdu.getBorder();
				TitledBorder titledBorderestadoordenprodu=(TitledBorder)this.estadoordenproduBeanSwingJInternalFrame.jScrollPanelDatosEstadoOrdenProdu.getBorder();

				titledBorderestadoordenprodu.setTitle(titledBorderOrdenProdu.getTitle() + " -> Estado Orden Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_orden_produOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.getordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ordenprodu==null) {
						this.ordenprodu = new OrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);
				}

				if(this.ordenprodu.getid_estado_orden_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_orden_produ = "+this.ordenprodu.getid_estado_orden_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteOrdenProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOrdenProdu(false,false);

			this.getOrdenProdusFK_IdCliente();

			this.inicializarActualizarBindingOrdenProdu(false);

			//if(OrdenProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOrdenProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioOrdenProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOrdenProdu(false,false);

			this.getOrdenProdusFK_IdEjercicio();

			this.inicializarActualizarBindingOrdenProdu(false);

			//if(OrdenProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOrdenProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoResponsableOrdenProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOrdenProdu(false,false);

			this.getOrdenProdusFK_IdEmpleadoResponsable();

			this.inicializarActualizarBindingOrdenProdu(false);

			//if(OrdenProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOrdenProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaOrdenProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOrdenProdu(false,false);

			this.getOrdenProdusFK_IdEmpresa();

			this.inicializarActualizarBindingOrdenProdu(false);

			//if(OrdenProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOrdenProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoOrdenProduOrdenProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOrdenProdu(false,false);

			this.getOrdenProdusFK_IdEstadoOrdenProdu();

			this.inicializarActualizarBindingOrdenProdu(false);

			//if(OrdenProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOrdenProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoOrdenProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOrdenProdu(false,false);

			this.getOrdenProdusFK_IdFormato();

			this.inicializarActualizarBindingOrdenProdu(false);

			//if(OrdenProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOrdenProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoOrdenProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOrdenProdu(false,false);

			this.getOrdenProdusFK_IdPeriodo();

			this.inicializarActualizarBindingOrdenProdu(false);

			//if(OrdenProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOrdenProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalOrdenProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOrdenProdu(false,false);

			this.getOrdenProdusFK_IdSucursal();

			this.inicializarActualizarBindingOrdenProdu(false);

			//if(OrdenProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOrdenProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPrioridadEmpresaProduOrdenProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingOrdenProdu(false,false);

			this.getOrdenProdusFK_IdTipoPrioridadEmpresaProdu();

			this.inicializarActualizarBindingOrdenProdu(false);

			//if(OrdenProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingOrdenProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameOrdenProdu() {
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
		

		if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
			this.jInternalFrameDetalleFormOrdenProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormOrdenProdu.dispose();
			this.jInternalFrameDetalleFormOrdenProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoOrdenProdu!=null) {
			this.jInternalFrameReporteDinamicoOrdenProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoOrdenProdu.dispose();
			this.jInternalFrameReporteDinamicoOrdenProdu=null;
		}
		
		if(this.jInternalFrameImportacionOrdenProdu!=null) {
			this.jInternalFrameImportacionOrdenProdu.setVisible(false);	    			
			this.jInternalFrameImportacionOrdenProdu.dispose();
			this.jInternalFrameImportacionOrdenProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessOrdenProdu();
			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoOrdenProdu")) {
				jButtonNuevoOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarOrdenProdu")) {
				jButtonDuplicarOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarOrdenProdu")) {
				jButtonCopiarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormOrdenProdu")) {
				jButtonVerFormOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarOrdenProdu")) {
				jButtonNuevoOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarOrdenProdu")) {
				jButtonDuplicarOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoOrdenProdu")) {
				jButtonNuevoOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarOrdenProdu")) {
				jButtonDuplicarOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesOrdenProdu")) {
				jButtonNuevoOrdenProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarOrdenProdu")) {
				jButtonNuevoOrdenProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesOrdenProdu")) {
				jButtonNuevoOrdenProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarOrdenProdu")) {
				jButtonModificarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarOrdenProdu")) {
				jButtonModificarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarOrdenProdu")) {
				jButtonModificarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarOrdenProdu")) {
				jButtonActualizarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarOrdenProdu")) {
				jButtonActualizarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarOrdenProdu")) {
				jButtonActualizarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarOrdenProdu")) {
				jButtonEliminarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarOrdenProdu")) {
				jButtonEliminarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarOrdenProdu")) {
				jButtonEliminarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarOrdenProdu")) {
				jButtonCancelarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarOrdenProdu")) {
				jButtonCancelarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarOrdenProdu")) {
				jButtonCancelarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarOrdenProdu")) {
				jButtonCerrarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarOrdenProdu")) {
				jButtonCerrarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarOrdenProdu")) {
				jButtonCerrarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarOrdenProdu")) {
				jButtonMostrarOcultarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarOrdenProdu")) {
				jButtonCancelarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosOrdenProdu")) {
				jButtonGuardarCambiosOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarOrdenProdu")) {
				jButtonGuardarCambiosOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarOrdenProdu")) {
				jButtonCopiarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarOrdenProdu")) {
				jButtonVerFormOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosOrdenProdu")) {
				jButtonGuardarCambiosOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarOrdenProdu")) {
				jButtonCopiarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormOrdenProdu")) {
				jButtonVerFormOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaOrdenProdu")) {
				jButtonGuardarCambiosOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarOrdenProdu")) {
				jButtonGuardarCambiosOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaOrdenProdu")) {
				jButtonGuardarCambiosOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionOrdenProdu")) {
				jButtonRecargarInformacionOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarOrdenProdu")) {
				jButtonRecargarInformacionOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionOrdenProdu")) {
				jButtonRecargarInformacionOrdenProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresOrdenProdu")) {
				jButtonAnterioresOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarOrdenProdu")) {
				jButtonAnterioresOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreOrdenProdu")) {
				jButtonAnterioresOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesOrdenProdu")) {
				jButtonSiguientesOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarOrdenProdu")) {
				jButtonSiguientesOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesOrdenProdu")) {
				jButtonSiguientesOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByOrdenProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByOrdenProdu")) {
				jButtonAbrirOrderByOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarOrdenProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarOrdenProdu")) {
				jButtonMostrarOcultarOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosOrdenProdu")) {
				jButtonNuevoGuardarCambiosOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarOrdenProdu")) {
				jButtonNuevoGuardarCambiosOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosOrdenProdu")) {
				jButtonNuevoGuardarCambiosOrdenProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoOrdenProdu")) {
				jButtonCerrarReporteDinamicoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoOrdenProdu")) {
				jButtonGenerarReporteDinamicoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoOrdenProdu")) {
				
				jButtonGenerarExcelReporteDinamicoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionOrdenProdu")) {
				jButtonCerrarImportacionOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionOrdenProdu")) {
				
				jButtonGenerarImportacionOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionOrdenProdu")) {
				
				jButtonAbrirImportacionOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesOrdenProdu")) {
				jComboBoxTiposAccionesOrdenProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesOrdenProdu")) {
				jComboBoxTiposRelacionesOrdenProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioOrdenProdu")) {
				jComboBoxTiposAccionesOrdenProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarOrdenProdu")) {
				
				jComboBoxTiposSeleccionarOrdenProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralOrdenProdu")) {
				jTextFieldValorCampoGeneralOrdenProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByOrdenProdu")) {
				jButtonAbrirOrderByOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarOrdenProdu")) {
				jButtonAbrirOrderByOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByOrdenProdu")) {
				jButtonCerrarOrderByOrdenProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idOrdenProduBusqueda")) {
				this.jButtonidOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaOrdenProduUpdate")) {
				this.jButtonid_empresaOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaOrdenProduBusqueda")) {
				this.jButtonid_empresaOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalOrdenProduUpdate")) {
				this.jButtonid_sucursalOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalOrdenProduBusqueda")) {
				this.jButtonid_sucursalOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioOrdenProduUpdate")) {
				this.jButtonid_ejercicioOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioOrdenProduBusqueda")) {
				this.jButtonid_ejercicioOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoOrdenProduUpdate")) {
				this.jButtonid_periodoOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoOrdenProduBusqueda")) {
				this.jButtonid_periodoOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoOrdenProduUpdate")) {
				this.jButtonid_formatoOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoOrdenProduBusqueda")) {
				this.jButtonid_formatoOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_prioridad_empresa_produOrdenProduUpdate")) {
				this.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_prioridad_empresa_produOrdenProduBusqueda")) {
				this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_responsableOrdenProduUpdate")) {
				this.jButtonid_empleado_responsableOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_responsableOrdenProduBusqueda")) {
				this.jButtonid_empleado_responsableOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialOrdenProduBusqueda")) {
				this.jButtonsecuencialOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteOrdenProdu")) {
				this.jButtonid_clienteOrdenProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteOrdenProduUpdate")) {
				this.jButtonid_clienteOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteOrdenProduBusqueda")) {
				this.jButtonid_clienteOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_clienteOrdenProduBusqueda")) {
				this.jButtondireccion_clienteOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_clienteOrdenProduBusqueda")) {
				this.jButtontelefono_clienteOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clienteOrdenProduBusqueda")) {
				this.jButtonruc_clienteOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("loteOrdenProduBusqueda")) {
				this.jButtonloteOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pedidoOrdenProduBusqueda")) {
				this.jButtonfecha_pedidoOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaOrdenProduBusqueda")) {
				this.jButtonfecha_entregaOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_uso_internoOrdenProduBusqueda")) {
				this.jButtones_uso_internoOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaOrdenProduBusqueda")) {
				this.jButtonfechaOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionOrdenProduBusqueda")) {
				this.jButtondescripcionOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_orden_produOrdenProduUpdate")) {
				this.jButtonid_estado_orden_produOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_orden_produOrdenProduBusqueda")) {
				this.jButtonid_estado_orden_produOrdenProduBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteOrdenProdu")) {
				this.jButtonid_clienteOrdenProduActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteOrdenProdu")) {
				this.jButtonFK_IdClienteOrdenProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoResponsableOrdenProdu")) {
				this.jButtonFK_IdEmpleadoResponsableOrdenProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoOrdenProduOrdenProdu")) {
				this.jButtonFK_IdEstadoOrdenProduOrdenProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFormatoOrdenProdu")) {
				this.jButtonFK_IdFormatoOrdenProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoPrioridadEmpresaProduOrdenProdu")) {
				this.jButtonFK_IdTipoPrioridadEmpresaProduOrdenProduActionPerformed(evt);
			}
			
			;
			
			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessOrdenProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOrdenProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				


				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			OrdenProdu ordenproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				ordenproduLocal=this.ordenprodu;
			} else {
				ordenproduLocal=this.ordenproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
							
				
				


				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOrdenProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduAnterior =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ordenproduAnterior =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
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
			
			


			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOrdenProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
								
						
				


				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
								
				
				


				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOrdenProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduAnterior =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ordenproduAnterior =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOrdenProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduAnterior =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ordenproduAnterior =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOrdenProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
							
				
				


				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOrdenProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenproduAnterior =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ordenproduAnterior =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
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
			
			


			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOrdenProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
								
				
				


				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOrdenProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduAnterior =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ordenproduAnterior =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOrdenProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOrdenProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosOrdenProdu")) {
					jCheckBoxSeleccionarTodosOrdenProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosOrdenProdu")) {
					jCheckBoxSeleccionadosOrdenProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarOrdenProdu")) {
					
				}
				
				


				
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
												
				
				


				
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOrdenProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ordenproduAnterior =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ordenproduAnterior =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOrdenProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
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
			
			


			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaOrdenProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ordenprodu);
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
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
				
				


				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(OrdenProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",OrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaOrdenProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ordenproduAnterior =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ordenproduAnterior =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarOrdenProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosOrdenProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosOrdenProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ordenprodu =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ordenprodu =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ordenprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarOrdenProdu")) {
				
				}
				
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarOrdenProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosOrdenProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarOrdenProdu")) {
			
			}
			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessOrdenProdu();
			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
			if(sTipo.equals("NuevoOrdenProdu")) {
				jButtonNuevoOrdenProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarOrdenProdu")) {
				jButtonDuplicarOrdenProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarOrdenProdu")) {
				jButtonCopiarOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormOrdenProdu")) {
				jButtonVerFormOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesOrdenProdu")) {
				jButtonNuevoOrdenProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarOrdenProdu")) {
				jButtonModificarOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarOrdenProdu")) {
				jButtonActualizarOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarOrdenProdu")) {
				jButtonEliminarOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaOrdenProdu")) {
				jButtonGuardarCambiosOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarOrdenProdu")) {
				jButtonCancelarOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrdenProdu")) {
				jButtonCerrarOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosOrdenProdu")) {
				jButtonGuardarCambiosOrdenProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosOrdenProdu")) {
				jButtonNuevoGuardarCambiosOrdenProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByOrdenProdu")) {
				jButtonAbrirOrderByOrdenProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionOrdenProdu")) {
				jButtonRecargarInformacionOrdenProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresOrdenProdu")) {
				jButtonAnterioresOrdenProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesOrdenProdu")) {
				jButtonSiguientesOrdenProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idOrdenProduBusqueda")) {
				this.jButtonidOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaOrdenProduUpdate")) {
				this.jButtonid_empresaOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaOrdenProduBusqueda")) {
				this.jButtonid_empresaOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalOrdenProduUpdate")) {
				this.jButtonid_sucursalOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalOrdenProduBusqueda")) {
				this.jButtonid_sucursalOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioOrdenProduUpdate")) {
				this.jButtonid_ejercicioOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioOrdenProduBusqueda")) {
				this.jButtonid_ejercicioOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoOrdenProduUpdate")) {
				this.jButtonid_periodoOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoOrdenProduBusqueda")) {
				this.jButtonid_periodoOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoOrdenProduUpdate")) {
				this.jButtonid_formatoOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoOrdenProduBusqueda")) {
				this.jButtonid_formatoOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_prioridad_empresa_produOrdenProduUpdate")) {
				this.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_prioridad_empresa_produOrdenProduBusqueda")) {
				this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_responsableOrdenProduUpdate")) {
				this.jButtonid_empleado_responsableOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_responsableOrdenProduBusqueda")) {
				this.jButtonid_empleado_responsableOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialOrdenProduBusqueda")) {
				this.jButtonsecuencialOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteOrdenProdu")) {
				this.jButtonid_clienteOrdenProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteOrdenProduUpdate")) {
				this.jButtonid_clienteOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteOrdenProduBusqueda")) {
				this.jButtonid_clienteOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_clienteOrdenProduBusqueda")) {
				this.jButtondireccion_clienteOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_clienteOrdenProduBusqueda")) {
				this.jButtontelefono_clienteOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clienteOrdenProduBusqueda")) {
				this.jButtonruc_clienteOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("loteOrdenProduBusqueda")) {
				this.jButtonloteOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pedidoOrdenProduBusqueda")) {
				this.jButtonfecha_pedidoOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaOrdenProduBusqueda")) {
				this.jButtonfecha_entregaOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_uso_internoOrdenProduBusqueda")) {
				this.jButtones_uso_internoOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaOrdenProduBusqueda")) {
				this.jButtonfechaOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionOrdenProduBusqueda")) {
				this.jButtondescripcionOrdenProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_orden_produOrdenProduUpdate")) {
				this.jButtonid_estado_orden_produOrdenProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_orden_produOrdenProduBusqueda")) {
				this.jButtonid_estado_orden_produOrdenProduBusquedaActionPerformed(evt);
			}
			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessOrdenProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameOrdenProdu")) {
				closingInternalFrameOrdenProdu();
				
			} else if(sTipo.equals("jButtonCancelarOrdenProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormOrdenProdu = (JInternalFrameBase)evt.getSource();
	            	
	            OrdenProduBeanSwingJInternalFrame jInternalFrameParent=(OrdenProduBeanSwingJInternalFrame)jInternalFrameDetalleFormOrdenProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarOrdenProduActionPerformed(null);
			}
			
			OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ordenprodu,new Object(),this.ordenproduParameterGeneral,this.ordenproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormOrdenProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormOrdenProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormOrdenProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ordenprodu)) {
			if(!esControlTabla) {
				if(OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);			
				}
				
				if(this.ordenproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualOrdenProdu(this.ordenprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ordenproduReturnGeneral=ordenproduLogic.procesarEventosOrdenProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ordenproduLogic.getOrdenProdus(),this.ordenprodu,this.ordenproduParameterGeneral,this.isEsNuevoOrdenProdu,classes);//this.ordenproduLogic.getOrdenProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanOrdenProdu(this.ordenproduReturnGeneral,this.ordenproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ordenproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanOrdenProdu(classes,this.ordenproduReturnGeneral,this.ordenproduBean,false);
					}
						
					if(this.ordenproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyOrdenProdu(this.ordenproduReturnGeneral.getOrdenProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioOrdenProdu(this.ordenproduReturnGeneral.getOrdenProdu());	
					}
						
					if(this.ordenproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioOrdenProdu(this.ordenproduReturnGeneral.getOrdenProdu(),classes);//this.ordenproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioOrdenProdu(this.ordenprodu,classes);//this.ordenproduBean);									
				}
			
				if(OrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualOrdenProdu(this.ordenprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysOrdenProdu(this.ordenprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ordenproduAnterior!=null) {
						this.ordenprodu=this.ordenproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ordenproduReturnGeneral=ordenproduLogic.procesarEventosOrdenProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ordenproduLogic.getOrdenProdus(),this.ordenprodu,this.ordenproduParameterGeneral,this.isEsNuevoOrdenProdu,classes);//this.ordenproduLogic.getOrdenProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ordenproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ordenproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ordenproduReturnGeneral.getOrdenProdu(),ordenproduLogic.getOrdenProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ordenproduReturnGeneral.getOrdenProdu(),this.ordenprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosOrdenProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosOrdenProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosOrdenProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosOrdenProdu() throws Exception {
		
		OrdenProduModel ordenproduModel=(OrdenProduModel)this.jTableDatosOrdenProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ordenproduModel.ordenprodus=this.ordenproduLogic.getOrdenProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ordenproduModel.ordenprodus=this.ordenprodus;
		}
		
		
		((OrdenProduModel) this.jTableDatosOrdenProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaOrdenProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getordenproduAnterior(),this.ordenproduLogic.getOrdenProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getordenproduAnterior(),this.ordenprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosOrdenProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioOrdenProdu(OrdenProdu ordenprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(OrdenDetaProdu.class)) {
					this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.setOrdenDetaProdus(ordenprodu.getOrdenDetaProdus());
					this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenDetaProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
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
										
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ordenprodu,new Object(),generalEntityParameterGeneral,this.ordenproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ordenproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=OrdenProduConstantesFunciones.getClassesRelationshipsOfOrdenProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=OrdenProduConstantesFunciones.getClassesRelationshipsFromStringsOfOrdenProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormOrdenProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				OrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ordenprodu,new Object(),generalEntityParameterGeneral,this.ordenproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioOrdenProdu(OrdenProduBean ordenproduBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(OrdenDetaProdu.class)) {
					this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.setOrdenDetaProdus(ordenprodu.getOrdenDetaProdus());
					this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenDetaProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanOrdenProdu(ArrayList<Classe> classes,OrdenProduReturnGeneral ordenproduReturnGeneral,OrdenProduBean ordenproduBean,Boolean conDefault) throws Exception {
		
			this.ordenproduBean.setOrdenDetaProdus(ordenproduReturnGeneral.getOrdenProdu().getOrdenDetaProdus());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualOrdenProdu(OrdenProdu ordenprodu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(OrdenDetaProdu.class)) {
					ordenprodu.setOrdenDetaProdus(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduBeanSwingJInternalFrame.ordendetaproduLogic.getOrdenDetaProdus());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ordenprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormOrdenProdu = new OrdenProduDetalleFormJInternalFrame(jDesktopPane,this.ordenproduSessionBean.getConGuardarRelaciones(),this.ordenproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.setVisible(false);
		this.jInternalFrameDetalleFormOrdenProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormOrdenProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormOrdenProdu.ordenproduLogic=this.ordenproduLogic;
		
		this.cargarCombosFrameForeignKeyOrdenProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleOrdenProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleOrdenProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyOrdenProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyOrdenProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormOrdenProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarOrdenProdu"));
		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonModificarOrdenProdu.addActionListener(new ButtonActionListener(this,"ModificarOrdenProdu"));

		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonModificarToolBarOrdenProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarOrdenProdu"));
					
		this.jInternalFrameDetalleFormOrdenProdu.jMenuItemModificarOrdenProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarOrdenProdu"));		
		
		
		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonActualizarOrdenProdu.addActionListener (new ButtonActionListener(this,"ActualizarOrdenProdu"));
		
		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonActualizarToolBarOrdenProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarOrdenProdu"));
						
		this.jInternalFrameDetalleFormOrdenProdu.jMenuItemActualizarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarOrdenProdu"));		
		
		
		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonEliminarOrdenProdu.addActionListener (new ButtonActionListener(this,"EliminarOrdenProdu"));
		
		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonEliminarToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarOrdenProdu"));
								
		this.jInternalFrameDetalleFormOrdenProdu.jMenuItemEliminarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarOrdenProdu"));		
		
		
		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonCancelarOrdenProdu.addActionListener (new ButtonActionListener(this,"CancelarOrdenProdu"));
		
		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonCancelarToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarOrdenProdu"));
					
		this.jInternalFrameDetalleFormOrdenProdu.jMenuItemCancelarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarOrdenProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormOrdenProdu.jMenuItemDetalleCerrarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarOrdenProdu"));		
		
		
		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarOrdenProdu"));
		
		
		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarOrdenProdu"));
		
		
		
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioOrdenProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonidOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"idOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empresaOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empresaOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_sucursalOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_sucursalOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_ejercicioOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_ejercicioOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_periodoOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_periodoOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_periodoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_formatoOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_formatoOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_formatoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empleado_responsableOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_responsableOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empleado_responsableOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_responsableOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonsecuencialOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"secuencialOrdenProduBusqueda"));
		//jButtonid_clienteOrdenProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteOrdenProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProdu.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtondireccion_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"direccion_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtontelefono_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"telefono_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonruc_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonloteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"loteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonfecha_pedidoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pedidoOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonfecha_entregaOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtones_uso_internoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"es_uso_internoOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonfechaOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"fechaOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtondescripcionOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_estado_orden_produOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_estado_orden_produOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_estado_orden_produOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_orden_produOrdenProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormOrdenProdu.jTabbedPaneRelacionesOrdenProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesOrdenProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameOrdenProdu"));
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarOrdenProdu"));
		}
		
		this.jTableDatosOrdenProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarOrdenProdu"));
		
		this.jTableDatosOrdenProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarOrdenProdu"));
		
		this.jButtonNuevoOrdenProdu.addActionListener(new ButtonActionListener(this,"NuevoOrdenProdu"));
		
		this.jButtonDuplicarOrdenProdu.addActionListener(new ButtonActionListener(this,"DuplicarOrdenProdu"));
		
		this.jButtonCopiarOrdenProdu.addActionListener(new ButtonActionListener(this,"CopiarOrdenProdu"));
		
		this.jButtonVerFormOrdenProdu.addActionListener(new ButtonActionListener(this,"VerFormOrdenProdu"));
		
		
		this.jButtonNuevoToolBarOrdenProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarOrdenProdu"));
			
		this.jButtonDuplicarToolBarOrdenProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarOrdenProdu"));
			
		this.jMenuItemNuevoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoOrdenProdu"));
			
		this.jMenuItemDuplicarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarOrdenProdu"));		
		
		
		this.jButtonNuevoRelacionesOrdenProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesOrdenProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarOrdenProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarOrdenProdu"));
			
		this.jMenuItemNuevoRelacionesOrdenProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesOrdenProdu"));		
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonModificarOrdenProdu.addActionListener(new ButtonActionListener(this,"ModificarOrdenProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonModificarToolBarOrdenProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarOrdenProdu"));
			
			this.jInternalFrameDetalleFormOrdenProdu.jMenuItemModificarOrdenProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarOrdenProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormOrdenProdu.jButtonActualizarOrdenProdu.addActionListener (new ButtonActionListener(this,"ActualizarOrdenProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonActualizarToolBarOrdenProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarOrdenProdu"));
				
			this.jInternalFrameDetalleFormOrdenProdu.jMenuItemActualizarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarOrdenProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonEliminarOrdenProdu.addActionListener (new ButtonActionListener(this,"EliminarOrdenProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonEliminarToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarOrdenProdu"));
						
			this.jInternalFrameDetalleFormOrdenProdu.jMenuItemEliminarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarOrdenProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonCancelarOrdenProdu.addActionListener (new ButtonActionListener(this,"CancelarOrdenProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonCancelarToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarOrdenProdu"));
			
			this.jInternalFrameDetalleFormOrdenProdu.jMenuItemCancelarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarOrdenProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarOrdenProdu"));		
		
		
		this.jButtonCerrarOrdenProdu.addActionListener (new ButtonActionListener(this,"CerrarOrdenProdu"));
		
		
		this.jButtonCerrarToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarOrdenProdu"));
			
		this.jMenuItemCerrarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarOrdenProdu"));
			
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jMenuItemDetalleCerrarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarOrdenProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosOrdenProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarOrdenProdu"));
		}
		
		this.jButtonCopiarToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarOrdenProdu"));
			
		this.jButtonVerFormToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarOrdenProdu"));
		
		this.jMenuItemGuardarCambiosOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosOrdenProdu"));
			
		this.jMenuItemCopiarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarOrdenProdu"));		
		
		this.jMenuItemVerFormOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormOrdenProdu"));		
		
		
		this.jButtonGuardarCambiosTablaOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaOrdenProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarOrdenProdu"));
			
		this.jMenuItemGuardarCambiosTablaOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaOrdenProdu"));		
		
		
		
		this.jButtonRecargarInformacionOrdenProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionOrdenProdu"));
					
		this.jButtonRecargarInformacionToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarOrdenProdu"));
		
		this.jMenuItemRecargarInformacionOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionOrdenProdu"));		
		
		
		
		this.jButtonAnterioresOrdenProdu.addActionListener (new ButtonActionListener(this,"AnterioresOrdenProdu"));
		
		
		this.jButtonAnterioresToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarOrdenProdu"));
		
		this.jMenuItemAnterioresOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresOrdenProdu"));		
		
		
		this.jButtonSiguientesOrdenProdu.addActionListener (new ButtonActionListener(this,"SiguientesOrdenProdu"));
		
		
		this.jButtonSiguientesToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarOrdenProdu"));
			
		this.jMenuItemSiguientesOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesOrdenProdu"));
			
		this.jMenuItemAbrirOrderByOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByOrdenProdu"));
			
		this.jMenuItemMostrarOcultarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarOrdenProdu"));
			
		this.jMenuItemDetalleAbrirOrderByOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByOrdenProdu"));
			
		this.jMenuItemDetalleMostarOcultarOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarOrdenProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosOrdenProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosOrdenProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarOrdenProdu"));
			
		this.jMenuItemNuevoGuardarCambiosOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosOrdenProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosOrdenProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosOrdenProdu"));

		this.jCheckBoxSeleccionadosOrdenProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosOrdenProdu"));
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioOrdenProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesOrdenProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesOrdenProdu"));
			
		this.jComboBoxTiposAccionesOrdenProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesOrdenProdu"));
					
		this.jComboBoxTiposSeleccionarOrdenProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarOrdenProdu"));
			
		this.jTextFieldValorCampoGeneralOrdenProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralOrdenProdu"));		
		
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonidOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"idOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empresaOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empresaOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_sucursalOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_sucursalOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_ejercicioOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_ejercicioOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_periodoOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_periodoOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_periodoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_formatoOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_formatoOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_formatoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empleado_responsableOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_responsableOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empleado_responsableOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_responsableOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonsecuencialOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"secuencialOrdenProduBusqueda"));
		//jButtonid_clienteOrdenProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteOrdenProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProdu.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtondireccion_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"direccion_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtontelefono_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"telefono_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonruc_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonloteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"loteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonfecha_pedidoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pedidoOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonfecha_entregaOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtones_uso_internoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"es_uso_internoOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonfechaOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"fechaOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtondescripcionOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_estado_orden_produOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_estado_orden_produOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_estado_orden_produOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_orden_produOrdenProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteOrdenProdu.addActionListener(new ButtonActionListener(this,"FK_IdClienteOrdenProdu"));

			this.jButtonBuscarFK_IdClienteid_clienteOrdenProdu.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProdu"));

			this.jButtonFK_IdEmpleadoResponsableOrdenProdu.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoResponsableOrdenProdu"));

			this.jButtonFK_IdEstadoOrdenProduOrdenProdu.addActionListener(new ButtonActionListener(this,"FK_IdEstadoOrdenProduOrdenProdu"));

			this.jButtonFK_IdFormatoOrdenProdu.addActionListener(new ButtonActionListener(this,"FK_IdFormatoOrdenProdu"));

			this.jButtonFK_IdTipoPrioridadEmpresaProduOrdenProdu.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrioridadEmpresaProduOrdenProdu"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoOrdenProdu!=null) {
				this.jInternalFrameReporteDinamicoOrdenProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoOrdenProdu"));
				this.jInternalFrameReporteDinamicoOrdenProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoOrdenProdu"));
				this.jInternalFrameReporteDinamicoOrdenProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoOrdenProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoOrdenProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoOrdenProdu"));				
			//this.jButtonGenerarReporteDinamicoOrdenProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoOrdenProdu"));
			//this.jButtonGenerarExcelReporteDinamicoOrdenProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoOrdenProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionOrdenProdu!=null) {
				this.jInternalFrameImportacionOrdenProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionOrdenProdu"));
				this.jInternalFrameImportacionOrdenProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionOrdenProdu"));
				this.jInternalFrameImportacionOrdenProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionOrdenProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByOrdenProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByOrdenProdu"));
			
			this.jButtonAbrirOrderByToolBarOrdenProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarOrdenProdu"));			
			
			if(this.jInternalFrameOrderByOrdenProdu!=null) {
				this.jInternalFrameOrderByOrdenProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByOrdenProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormOrdenProdu.jTabbedPaneRelacionesOrdenProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesOrdenProdu"));
		
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
            		closingInternalFrameOrdenProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormOrdenProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormOrdenProdu = (JInternalFrameBase)event.getSource();
	            	
	            OrdenProduBeanSwingJInternalFrame jInternalFrameParent=(OrdenProduBeanSwingJInternalFrame)jInternalFrameDetalleFormOrdenProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarOrdenProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosOrdenProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosOrdenProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosOrdenProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosOrdenProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOrdenProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOrdenProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOrdenProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoOrdenProdu";
		inputMap = this.jButtonNuevoOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoOrdenProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOrdenProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOrdenProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoOrdenProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesOrdenProdu";
		inputMap = this.jButtonNuevoRelacionesOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoOrdenProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarOrdenProdu";
		inputMap = this.jButtonModificarOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarOrdenProdu";
		inputMap = this.jButtonActualizarOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarOrdenProdu";
		inputMap = this.jButtonEliminarOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarOrdenProdu";
		inputMap = this.jButtonCancelarOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarOrdenProdu";
		inputMap = this.jButtonCerrarOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosOrdenProdu";
		inputMap = this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormOrdenProdu.jButtonGuardarCambiosOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosOrdenProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosOrdenProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesOrdenProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesOrdenProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarOrdenProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarOrdenProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralOrdenProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralOrdenProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonidOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"idOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empresaOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empresaOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_sucursalOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_sucursalOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_ejercicioOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_ejercicioOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_periodoOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_periodoOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_periodoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_formatoOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_formatoOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_formatoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empleado_responsableOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_responsableOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_empleado_responsableOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_responsableOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonsecuencialOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"secuencialOrdenProduBusqueda"));
		//jButtonid_clienteOrdenProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteOrdenProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProdu.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtondireccion_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"direccion_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtontelefono_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"telefono_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonruc_clienteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clienteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonloteOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"loteOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonfecha_pedidoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pedidoOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonfecha_entregaOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtones_uso_internoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"es_uso_internoOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonfechaOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"fechaOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtondescripcionOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionOrdenProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_estado_orden_produOrdenProduUpdate.addActionListener(new ButtonActionListener(this,"id_estado_orden_produOrdenProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormOrdenProdu.jButtonid_estado_orden_produOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_orden_produOrdenProduBusqueda"));
		
		
		this.jButtonFK_IdClienteOrdenProdu.addActionListener(new ButtonActionListener(this,"FK_IdClienteOrdenProdu"));

		this.jButtonBuscarFK_IdClienteid_clienteOrdenProdu.addActionListener(new ButtonActionListener(this,"id_clienteOrdenProdu"));

		this.jButtonFK_IdEmpleadoResponsableOrdenProdu.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoResponsableOrdenProdu"));

		this.jButtonFK_IdEstadoOrdenProduOrdenProdu.addActionListener(new ButtonActionListener(this,"FK_IdEstadoOrdenProduOrdenProdu"));

		this.jButtonFK_IdFormatoOrdenProdu.addActionListener(new ButtonActionListener(this,"FK_IdFormatoOrdenProdu"));

		this.jButtonFK_IdTipoPrioridadEmpresaProduOrdenProdu.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrioridadEmpresaProduOrdenProdu"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarOrdenProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarOrdenProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosOrdenProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(OrdenProdu ordenproduAux:this.ordenproduLogic.getOrdenProdus()) {
					ordenproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(OrdenProdu ordenproduAux:ordenprodus) {
					ordenproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosOrdenProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingOrdenProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(OrdenProdu ordenproduAux:this.ordenproduLogic.getOrdenProdus()) {
						ordenproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(OrdenProdu ordenproduAux:ordenprodus) {
						ordenproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(OrdenProdu ordenproduAux:this.ordenproduLogic.getOrdenProdus()) {
					
						if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO)) {
							existe=true;
							ordenproduAux.setes_uso_interno(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(OrdenProdu ordenproduAux:ordenprodus) {
						
						if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO)) {
							existe=true;
							ordenproduAux.setes_uso_interno(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaOrdenProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosOrdenProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosOrdenProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosOrdenProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingOrdenProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosOrdenProdu.getSelectedRows();
			
			OrdenProdu ordenproduLocal=new OrdenProdu();
			
			//this.seleccionarTodosOrdenProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordenproduLocal =(OrdenProdu) this.ordenproduLogic.getOrdenProdus().toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ordenproduLocal =(OrdenProdu) this.ordenprodus.toArray()[this.jTableDatosOrdenProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ordenproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(OrdenProdu ordenproduAux:this.ordenproduLogic.getOrdenProdus()) {
						ordenproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(OrdenProdu ordenproduAux:ordenprodus) {
						ordenproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaOrdenProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosOrdenProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosOrdenProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosOrdenProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualOrdenProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarOrdenProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralOrdenProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingOrdenProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralOrdenProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(OrdenProdu ordenproduAux:this.ordenproduLogic.getOrdenProdus()) {
				
						if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							ordenproduAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE)) {
							existe=true;
							ordenproduAux.setdireccion_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE)) {
							existe=true;
							ordenproduAux.settelefono_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							ordenproduAux.setruc_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							ordenproduAux.setlote(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO)) {
							existe=true;
							ordenproduAux.setfecha_pedido(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							ordenproduAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							ordenproduAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							ordenproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(OrdenProdu ordenproduAux:ordenprodus) {
					
						if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							ordenproduAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE)) {
							existe=true;
							ordenproduAux.setdireccion_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE)) {
							existe=true;
							ordenproduAux.settelefono_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							ordenproduAux.setruc_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							ordenproduAux.setlote(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO)) {
							existe=true;
							ordenproduAux.setfecha_pedido(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							ordenproduAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							ordenproduAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							ordenproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaOrdenProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesOrdenProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingOrdenProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioOrdenProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesOrdenProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteOrdenProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessOrdenProdu(conSplash);
				
					this.generarReporteOrdenProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoOrdenProdusSeleccionados();
				//this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoOrdenProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoOrdenProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessOrdenProdu();
				
				this.exportarOrdenProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionOrdenProdus();
				//this.importarOrdenProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessOrdenProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelOrdenProdusSeleccionados();
				//this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Orden Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessOrdenProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoOrdenProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyOrdenProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(OrdenProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteOrdenProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessOrdenProdu(conSplash);
					
						//this.actualizarParametrosGeneralOrdenProdu();
						
						this.generarReporteProcesoAccionOrdenProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(OrdenProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Orden ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Orden Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessOrdenProdu();
				
						this.actualizarParametrosGeneralOrdenProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ordenproduReturnGeneral=ordenproduLogic.procesarAccionOrdenProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ordenproduLogic.getOrdenProdus(),this.ordenproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarOrdenProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralOrdenProdu();
					
					OrdenProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarOrdenProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesOrdenProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormOrdenProdu.jComboBoxTiposAccionesFormularioOrdenProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessOrdenProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesOrdenProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessOrdenProdu();
			
			if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();		
			OrdenProdu ordenprodu=new OrdenProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingOrdenProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesOrdenProdu.getSelectedItem();
			
			
			
			
			ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(ordenprodusSeleccionados.size()==1) {
				for(OrdenProdu ordenproduAux:ordenprodusSeleccionados) {
					ordenprodu=ordenproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Orden Detalle Produccion")) {
					jButtonOrdenDetaProduActionPerformed(null,rowIndex,true,false,ordenprodu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessOrdenProdu();
			
      		//this.finishProcessOrdenProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarOrdenProduReturnGeneral() throws Exception {
		if(this.ordenproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ordenproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ordenproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ordenproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ordenproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ordenproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingOrdenProdu(false);
		}
		
		if(this.ordenproduReturnGeneral.getConRetornoLista() || this.ordenproduReturnGeneral.getConRetornoObjeto()) {
			if(this.ordenproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ordenproduLogic.setOrdenProdus(this.ordenproduReturnGeneral.getOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.ordenproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ordenproduLogic.setOrdenProdu(this.ordenproduReturnGeneral.getOrdenProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingOrdenProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralOrdenProdu() throws Exception {
		
		
	}
	
	public ArrayList<OrdenProdu> getOrdenProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioOrdenProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(OrdenProdu ordenproduAux:ordenproduLogic.getOrdenProdus()) {
					if(ordenproduAux.getIsSelected()) {
						ordenprodusSeleccionados.add(ordenproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(OrdenProdu ordenproduAux:this.ordenprodus) {
					if(ordenproduAux.getIsSelected()) {
						ordenprodusSeleccionados.add(ordenproduAux);				
					}
				}
			}
			
			if(ordenprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ordenprodusSeleccionados.addAll(this.ordenproduLogic.getOrdenProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ordenprodusSeleccionados.addAll(this.ordenprodus);				
					}
				}
			}
		} else {
			ordenprodusSeleccionados.add(this.ordenprodu);
		}
		
		return ordenprodusSeleccionados;
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
	
	public void generarReporteOrdenProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalOrdenProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoOrdenProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoOrdenProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoOrdenProdusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesOrdenProdusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Orden Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesOrdenProdusSeleccionados() throws Exception {
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();		
		
		ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteOrdenProdus("Todos",ordenprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalOrdenProdusSeleccionados() throws Exception {
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();		
		
		ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteOrdenProdus("Todos",ordenprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionOrdenProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();
		
		ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteOrdenProdus("Todos",ordenprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoOrdenProdusSeleccionados() throws Exception {
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoOrdenProdu();
		
		
		ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoOrdenProdu();
		
		
		//this.generarReporteOrdenProdus("Todos",ordenprodusSeleccionados ,ordenproduImplementable,ordenproduImplementableHome);
	}
	
	public void mostrarImportacionOrdenProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionOrdenProdu();
		
		this.abrirFrameImportacionOrdenProdu();		
		
			
		//this.generarReporteOrdenProdus("Todos",ordenprodusSeleccionados ,ordenproduImplementable,ordenproduImplementableHome);
	}
	
	public void importarOrdenProdus() throws Exception {		
	
	}
	
	public void exportarOrdenProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelOrdenProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoOrdenProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlOrdenProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Orden Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoOrdenProdusSeleccionados() throws Exception {
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();		
		
		ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ordenprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarOrdenProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(OrdenProdu ordenproduAux:ordenprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarOrdenProdu(ordenproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ordenproduAux.setsDetalleGeneralEntityReporte(ordenproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarOrdenProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_IDFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_RUCCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_LOTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_FECHAENTREGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarOrdenProdu(OrdenProdu ordenprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ordenprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.gettipoprioridadempresaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getempleadoresponsable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getdireccion_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.gettelefono_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getruc_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getlote();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getfecha_pedido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getfecha_entrega().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getes_uso_interno().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ordenprodu.getestadoordenprodu_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelOrdenProdusSeleccionados() throws Exception {
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();		
		
		ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ordenprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("OrdenProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelOrdenProdu(row);				
				iRow++;
			}				
			
			for(OrdenProdu ordenproduAux:ordenprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelOrdenProdu(ordenproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlOrdenProdusSeleccionados() throws Exception {
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();		
		
		ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ordenprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ordenprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ordenprodu");
			//elementRoot.appendChild(element);
		
			for(OrdenProdu ordenproduAux:ordenprodusSeleccionados) {
				element = document.createElement("ordenprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlOrdenProdu(ordenproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelOrdenProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_RUCCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_LOTE);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_FECHAENTREGA);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelOrdenProdu(OrdenProdu ordenprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.gettipoprioridadempresaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getempleadoresponsable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getdireccion_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.gettelefono_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getruc_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getlote());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getfecha_pedido());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getfecha_entrega());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getes_uso_interno());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ordenprodu.getestadoordenprodu_descripcion());				
	}
	
	public void setFilaDatosExportarXmlOrdenProdu(OrdenProdu ordenprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(OrdenProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ordenprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(OrdenProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ordenprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(OrdenProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ordenprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(OrdenProduConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(ordenprodu.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(OrdenProduConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(ordenprodu.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(OrdenProduConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(ordenprodu.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementformato_descripcion = document.createElement(OrdenProduConstantesFunciones.IDFORMATO);
		elementformato_descripcion.appendChild(document.createTextNode(ordenprodu.getformato_descripcion()));
		element.appendChild(elementformato_descripcion);

		Element elementtipoprioridadempresaprodu_descripcion = document.createElement(OrdenProduConstantesFunciones.IDTIPOPRIORIDADEMPRESAPRODU);
		elementtipoprioridadempresaprodu_descripcion.appendChild(document.createTextNode(ordenprodu.gettipoprioridadempresaprodu_descripcion()));
		element.appendChild(elementtipoprioridadempresaprodu_descripcion);

		Element elementempleadoresponsable_descripcion = document.createElement(OrdenProduConstantesFunciones.IDEMPLEADORESPONSABLE);
		elementempleadoresponsable_descripcion.appendChild(document.createTextNode(ordenprodu.getempleadoresponsable_descripcion()));
		element.appendChild(elementempleadoresponsable_descripcion);

		Element elementsecuencial = document.createElement(OrdenProduConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(ordenprodu.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementcliente_descripcion = document.createElement(OrdenProduConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(ordenprodu.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementdireccion_cliente = document.createElement(OrdenProduConstantesFunciones.DIRECCIONCLIENTE);
		elementdireccion_cliente.appendChild(document.createTextNode(ordenprodu.getdireccion_cliente().trim()));
		element.appendChild(elementdireccion_cliente);

		Element elementtelefono_cliente = document.createElement(OrdenProduConstantesFunciones.TELEFONOCLIENTE);
		elementtelefono_cliente.appendChild(document.createTextNode(ordenprodu.gettelefono_cliente().trim()));
		element.appendChild(elementtelefono_cliente);

		Element elementruc_cliente = document.createElement(OrdenProduConstantesFunciones.RUCCLIENTE);
		elementruc_cliente.appendChild(document.createTextNode(ordenprodu.getruc_cliente().trim()));
		element.appendChild(elementruc_cliente);

		Element elementlote = document.createElement(OrdenProduConstantesFunciones.LOTE);
		elementlote.appendChild(document.createTextNode(ordenprodu.getlote().trim()));
		element.appendChild(elementlote);

		Element elementfecha_pedido = document.createElement(OrdenProduConstantesFunciones.FECHAPEDIDO);
		elementfecha_pedido.appendChild(document.createTextNode(ordenprodu.getfecha_pedido().toString().trim()));
		element.appendChild(elementfecha_pedido);

		Element elementfecha_entrega = document.createElement(OrdenProduConstantesFunciones.FECHAENTREGA);
		elementfecha_entrega.appendChild(document.createTextNode(ordenprodu.getfecha_entrega().toString().trim()));
		element.appendChild(elementfecha_entrega);

		Element elementes_uso_interno = document.createElement(OrdenProduConstantesFunciones.ESUSOINTERNO);
		elementes_uso_interno.appendChild(document.createTextNode(ordenprodu.getes_uso_interno().toString().trim()));
		element.appendChild(elementes_uso_interno);

		Element elementfecha = document.createElement(OrdenProduConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(ordenprodu.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementdescripcion = document.createElement(OrdenProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(ordenprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementestadoordenprodu_descripcion = document.createElement(OrdenProduConstantesFunciones.IDESTADOORDENPRODU);
		elementestadoordenprodu_descripcion.appendChild(document.createTextNode(ordenprodu.getestadoordenprodu_descripcion()));
		element.appendChild(elementestadoordenprodu_descripcion);
	}
	
	public void generarReporteGroupGenericoOrdenProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<OrdenProdu> ordenprodusSeleccionados=new ArrayList<OrdenProdu>();
		
		ordenprodusSeleccionados=this.getOrdenProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoOrdenProdu(ordenprodusSeleccionados);
		
		this.generarReporteOrdenProdus("Todos",ordenprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoOrdenProdu(ArrayList<OrdenProdu> ordenprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(OrdenProdu ordenproduAux:ordenprodusSeleccionados) {
				ordenproduAux.setsDetalleGeneralEntityReporte(ordenproduAux.toString());
			
				if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_IDFORMATO)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.gettipoprioridadempresaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getempleadoresponsable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getdireccion_cliente());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.gettelefono_cliente());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_RUCCLIENTE)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getruc_cliente());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_LOTE)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getlote());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ordenproduAux.getfecha_pedido()));
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_FECHAENTREGA)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ordenproduAux.getfecha_entrega()));
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(ordenproduAux.getes_uso_interno()));
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(ordenproduAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU)) {
					existe=true;
					ordenproduAux.setsDescripcionGeneralEntityReporte1(ordenproduAux.getestadoordenprodu_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,OrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesOrdenProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoOrdenProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=true;
				this.isVisibilidadCeldaGuardarCambiosOrdenProdu=true;
			}
			
			this.isVisibilidadCeldaModificarOrdenProdu=false;
			this.isVisibilidadCeldaActualizarOrdenProdu=false;
			this.isVisibilidadCeldaEliminarOrdenProdu=false;
			this.isVisibilidadCeldaCancelarOrdenProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOrdenProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarOrdenProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoOrdenProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=false;
			this.isVisibilidadCeldaModificarOrdenProdu=false;
			this.isVisibilidadCeldaActualizarOrdenProdu=true;
			this.isVisibilidadCeldaEliminarOrdenProdu=false;
			this.isVisibilidadCeldaCancelarOrdenProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOrdenProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarOrdenProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoOrdenProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=false;
			this.isVisibilidadCeldaModificarOrdenProdu=false;
			this.isVisibilidadCeldaActualizarOrdenProdu=true;
			this.isVisibilidadCeldaEliminarOrdenProdu=true;
			this.isVisibilidadCeldaCancelarOrdenProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOrdenProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarOrdenProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoOrdenProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=false;
			this.isVisibilidadCeldaModificarOrdenProdu=false;
			this.isVisibilidadCeldaActualizarOrdenProdu=true;
			this.isVisibilidadCeldaEliminarOrdenProdu=false;
			this.isVisibilidadCeldaCancelarOrdenProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOrdenProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarOrdenProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoOrdenProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=true;
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=true;
			this.isVisibilidadCeldaModificarOrdenProdu=false;
			this.isVisibilidadCeldaActualizarOrdenProdu=false;
			this.isVisibilidadCeldaEliminarOrdenProdu=false;
			this.isVisibilidadCeldaCancelarOrdenProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOrdenProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarOrdenProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoOrdenProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=false;
			this.isVisibilidadCeldaActualizarOrdenProdu=false;
			this.isVisibilidadCeldaEliminarOrdenProdu=false;
			this.isVisibilidadCeldaCancelarOrdenProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOrdenProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarOrdenProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoOrdenProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=false;
			this.isVisibilidadCeldaModificarOrdenProdu=true;
			this.isVisibilidadCeldaActualizarOrdenProdu=false;
			this.isVisibilidadCeldaEliminarOrdenProdu=false;
			this.isVisibilidadCeldaCancelarOrdenProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarOrdenProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarOrdenProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(OrdenProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoOrdenProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=true;
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=true;
		} else {
			this.actualizarEstadoPanelsOrdenProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarOrdenProdu=false;
			//this.isVisibilidadCeldaVerFormOrdenProdu=false;
			this.isVisibilidadCeldaDuplicarOrdenProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ordenproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosOrdenProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ordenproduSessionBean.getEsGuardarRelacionado()) {
			if(!ordenproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=false;												
			}
			
			this.jButtonCerrarOrdenProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesOrdenProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.ordenprodu)) {
			this.isVisibilidadCeldaActualizarOrdenProdu=false;
			this.isVisibilidadCeldaEliminarOrdenProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesOrdenProdu() {
		this.isVisibilidadCeldaNuevoOrdenProdu=false;
		this.isVisibilidadCeldaGuardarCambiosOrdenProdu=false;
	}
	
	public void actualizarEstadoPanelsOrdenProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionOrdenProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOrdenProdu!=null) {
				this.jTabbedPaneBusquedasOrdenProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosOrdenProdu!=null) {
				this.jScrollPanelDatosOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionOrdenProdu!=null) {
				this.jPanelPaginacionOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesOrdenProdu!=null) {
				this.jPanelParametrosReportesOrdenProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionOrdenProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOrdenProdu!=null) {
				this.jTabbedPaneBusquedasOrdenProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosOrdenProdu!=null) {
				this.jScrollPanelDatosOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionOrdenProdu!=null) {
				this.jPanelPaginacionOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesOrdenProdu!=null) {
				this.jPanelParametrosReportesOrdenProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionOrdenProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOrdenProdu!=null) {
				this.jTabbedPaneBusquedasOrdenProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosOrdenProdu!=null) {
				this.jScrollPanelDatosOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionOrdenProdu!=null) {
				this.jPanelPaginacionOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesOrdenProdu!=null) {
				this.jPanelParametrosReportesOrdenProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionOrdenProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOrdenProdu!=null) {
				this.jTabbedPaneBusquedasOrdenProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosOrdenProdu!=null) {
				this.jScrollPanelDatosOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionOrdenProdu!=null) {
				this.jPanelPaginacionOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesOrdenProdu!=null) {
				this.jPanelParametrosReportesOrdenProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionOrdenProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOrdenProdu!=null) {
				this.jTabbedPaneBusquedasOrdenProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosOrdenProdu!=null) {
				this.jScrollPanelDatosOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionOrdenProdu!=null) {
				this.jPanelPaginacionOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesOrdenProdu!=null) {
				this.jPanelParametrosReportesOrdenProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionOrdenProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOrdenProdu!=null) {
				this.jTabbedPaneBusquedasOrdenProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosOrdenProdu!=null) {
				this.jScrollPanelDatosOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionOrdenProdu!=null) {
				this.jPanelPaginacionOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesOrdenProdu!=null) {
				this.jPanelParametrosReportesOrdenProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionOrdenProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOrdenProdu!=null) {
				this.jTabbedPaneBusquedasOrdenProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosOrdenProdu!=null) {
				this.jScrollPanelDatosOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionOrdenProdu!=null) {
				this.jPanelPaginacionOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesOrdenProdu!=null) {
				this.jPanelParametrosReportesOrdenProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ordenproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasOrdenProdu!=null) {
					this.jTabbedPaneBusquedasOrdenProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesOrdenProdu!=null) {
				this.jPanelParametrosReportesOrdenProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasOrdenProdu!=null) {
				this.jTabbedPaneBusquedasOrdenProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesOrdenProdu!=null) {
				this.jPanelParametrosReportesOrdenProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdClienteOrdenProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEmpleadoResponsableOrdenProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEstadoOrdenProduOrdenProdu);}

			this.isVisibilidadFK_IdFormato=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdFormatoOrdenProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdClienteOrdenProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEmpleadoResponsableOrdenProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEstadoOrdenProduOrdenProdu);}

			this.isVisibilidadFK_IdFormato=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdFormatoOrdenProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCliente=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdClienteOrdenProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEmpleadoResponsableOrdenProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEstadoOrdenProduOrdenProdu);}

			this.isVisibilidadFK_IdFormato=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdFormatoOrdenProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCliente=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdClienteOrdenProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEmpleadoResponsableOrdenProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEstadoOrdenProduOrdenProdu);}

			this.isVisibilidadFK_IdFormato=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdFormatoOrdenProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato(Boolean isParaFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNegation=!isParaFormato;

			this.isVisibilidadFK_IdCliente=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdClienteOrdenProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEmpleadoResponsableOrdenProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEstadoOrdenProduOrdenProdu);}

			this.isVisibilidadFK_IdFormato=isParaFormato;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdFormatoOrdenProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoPrioridadEmpresaProdu(Boolean isParaTipoPrioridadEmpresaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPrioridadEmpresaProduNegation=!isParaTipoPrioridadEmpresaProdu;

			this.isVisibilidadFK_IdCliente=isParaTipoPrioridadEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdClienteOrdenProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaTipoPrioridadEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEmpleadoResponsableOrdenProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaTipoPrioridadEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEstadoOrdenProduOrdenProdu);}

			this.isVisibilidadFK_IdFormato=isParaTipoPrioridadEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdFormatoOrdenProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaTipoPrioridadEmpresaProdu;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleadoResponsable(Boolean isParaEmpleadoResponsable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoResponsableNegation=!isParaEmpleadoResponsable;

			this.isVisibilidadFK_IdCliente=isParaEmpleadoResponsableNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdClienteOrdenProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaEmpleadoResponsable;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEmpleadoResponsableOrdenProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaEmpleadoResponsableNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEstadoOrdenProduOrdenProdu);}

			this.isVisibilidadFK_IdFormato=isParaEmpleadoResponsableNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdFormatoOrdenProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaEmpleadoResponsableNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdClienteOrdenProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEmpleadoResponsableOrdenProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEstadoOrdenProduOrdenProdu);}

			this.isVisibilidadFK_IdFormato=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdFormatoOrdenProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoOrdenProdu(Boolean isParaEstadoOrdenProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoOrdenProduNegation=!isParaEstadoOrdenProdu;

			this.isVisibilidadFK_IdCliente=isParaEstadoOrdenProduNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdClienteOrdenProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaEstadoOrdenProduNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEmpleadoResponsableOrdenProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaEstadoOrdenProdu;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdEstadoOrdenProduOrdenProdu);}

			this.isVisibilidadFK_IdFormato=isParaEstadoOrdenProduNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdFormatoOrdenProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaEstadoOrdenProduNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasOrdenProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);}
		}
		
	}
	
	

	public String registrarSesionOrdenProduParaOrdenDetaProdues() throws Exception {
		Boolean isPaginaPopupOrdenDetaProdu=false;

		try {

			if(this.ordenproduSessionBean==null) {
				this.ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduSessionBean==null) {
				this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduSessionBean=new OrdenDetaProduSessionBean();
			}

			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduSessionBean.setsPathNavegacionActual(ordenproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+OrdenDetaProduConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupOrdenDetaProdu=this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeOrdenDetaProdu(true);
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeOrdenDetaProdu(OrdenProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduSessionBean.setisBusquedaDesdeForeignKeySesionOrdenProdu(true);
			this.jInternalFrameDetalleFormOrdenProdu.ordendetaproduSessionBean.setlidOrdenProduActual(this.idOrdenProduActual);

			ordenproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyOrdenProdu(true);
			ordenproduSessionBean.setlIdOrdenProduActualForeignKey(this.idOrdenProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionOrdenProduParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(ordenproduSessionBean==null) {
				ordenproduSessionBean=new OrdenProduSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(ordenproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.ordenproduFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(OrdenProduConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionOrdenProdu(true);
			//clienteSessionBean.setlidOrdenProduActual(this.idOrdenProduActual);

			ordenproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyOrdenProdu(true);
			ordenproduSessionBean.setlIdOrdenProduActualForeignKey(this.idOrdenProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//OrdenProduSessionBean ordenproduSessionBean=new OrdenProduSessionBean();
		
		if(this.ordenproduSessionBean==null) {
			this.ordenproduSessionBean=new OrdenProduSessionBean();
		}
		
		this.ordenproduSessionBean.setsUltimaBusquedaOrdenProdu(this.getsAccionBusqueda());
		this.ordenproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.ordenproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			ordenproduSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			ordenproduSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoResponsable")) {
			ordenproduSessionBean.setid_empleado_responsable(this.getid_empleado_responsableFK_IdEmpleadoResponsable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			ordenproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoOrdenProdu")) {
			ordenproduSessionBean.setid_estado_orden_produ(this.getid_estado_orden_produFK_IdEstadoOrdenProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormato")) {
			ordenproduSessionBean.setid_formato(this.getid_formatoFK_IdFormato());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			ordenproduSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			ordenproduSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoPrioridadEmpresaProdu")) {
			ordenproduSessionBean.setid_tipo_prioridad_empresa_produ(this.getid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//OrdenProduSessionBean ordenproduSessionBean=new OrdenProduSessionBean();
		
		if(this.ordenproduSessionBean==null) {
			this.ordenproduSessionBean=new OrdenProduSessionBean();
		}
		
		if(this.ordenproduSessionBean.getsUltimaBusquedaOrdenProdu()!=null&&!this.ordenproduSessionBean.getsUltimaBusquedaOrdenProdu().equals("")) {
			this.setsAccionBusqueda(ordenproduSessionBean.getsUltimaBusquedaOrdenProdu());
			this.setiNumeroPaginacion(ordenproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(ordenproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(ordenproduSessionBean.getid_cliente());
				ordenproduSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(ordenproduSessionBean.getid_ejercicio());
				ordenproduSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoResponsable")) {
				this.setid_empleado_responsableFK_IdEmpleadoResponsable(ordenproduSessionBean.getid_empleado_responsable());
				ordenproduSessionBean.setid_empleado_responsable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(ordenproduSessionBean.getid_empresa());
				ordenproduSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoOrdenProdu")) {
				this.setid_estado_orden_produFK_IdEstadoOrdenProdu(ordenproduSessionBean.getid_estado_orden_produ());
				ordenproduSessionBean.setid_estado_orden_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormato")) {
				this.setid_formatoFK_IdFormato(ordenproduSessionBean.getid_formato());
				ordenproduSessionBean.setid_formato(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(ordenproduSessionBean.getid_periodo());
				ordenproduSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(ordenproduSessionBean.getid_sucursal());
				ordenproduSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoPrioridadEmpresaProdu")) {
				this.setid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu(ordenproduSessionBean.getid_tipo_prioridad_empresa_produ());
				ordenproduSessionBean.setid_tipo_prioridad_empresa_produ(-1L);
			}
		}
		
		this.ordenproduSessionBean.setsUltimaBusquedaOrdenProdu("");
		this.ordenproduSessionBean.setiNumeroPaginacion(OrdenProduConstantesFunciones.INUMEROPAGINACION);
		this.ordenproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaOrdenProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioOrdenProdu() {
		this.updateBorderResaltarBusquedasFormularioOrdenProdu();
		this.updateVisibilidadBusquedasFormularioOrdenProdu();
		this.updateHabilitarBusquedasFormularioOrdenProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioOrdenProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasOrdenProdu.getComponents().length>0) {
	

		if(this.ordenproduConstantesFunciones.resaltarFK_IdClienteOrdenProdu!=null) {
			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdClienteOrdenProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
				jPanel.setBorder(this.ordenproduConstantesFunciones.resaltarFK_IdClienteOrdenProdu);
			}
		}

		if(this.ordenproduConstantesFunciones.resaltarFK_IdEmpleadoResponsableOrdenProdu!=null) {
			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableOrdenProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
				jPanel.setBorder(this.ordenproduConstantesFunciones.resaltarFK_IdEmpleadoResponsableOrdenProdu);
			}
		}

		if(this.ordenproduConstantesFunciones.resaltarFK_IdEstadoOrdenProduOrdenProdu!=null) {
			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdEstadoOrdenProduOrdenProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
				jPanel.setBorder(this.ordenproduConstantesFunciones.resaltarFK_IdEstadoOrdenProduOrdenProdu);
			}
		}

		if(this.ordenproduConstantesFunciones.resaltarFK_IdFormatoOrdenProdu!=null) {
			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdFormatoOrdenProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
				jPanel.setBorder(this.ordenproduConstantesFunciones.resaltarFK_IdFormatoOrdenProdu);
			}
		}

		if(this.ordenproduConstantesFunciones.resaltarFK_IdTipoPrioridadEmpresaProduOrdenProdu!=null) {
			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
				jPanel.setBorder(this.ordenproduConstantesFunciones.resaltarFK_IdTipoPrioridadEmpresaProduOrdenProdu);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioOrdenProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasOrdenProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdClienteOrdenProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ordenproduConstantesFunciones.mostrarFK_IdClienteOrdenProdu);
			if(!this.ordenproduConstantesFunciones.mostrarFK_IdClienteOrdenProdu && index>-1) {
				this.jTabbedPaneBusquedasOrdenProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableOrdenProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ordenproduConstantesFunciones.mostrarFK_IdEmpleadoResponsableOrdenProdu);
			if(!this.ordenproduConstantesFunciones.mostrarFK_IdEmpleadoResponsableOrdenProdu && index>-1) {
				this.jTabbedPaneBusquedasOrdenProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdEstadoOrdenProduOrdenProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ordenproduConstantesFunciones.mostrarFK_IdEstadoOrdenProduOrdenProdu);
			if(!this.ordenproduConstantesFunciones.mostrarFK_IdEstadoOrdenProduOrdenProdu && index>-1) {
				this.jTabbedPaneBusquedasOrdenProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdFormatoOrdenProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ordenproduConstantesFunciones.mostrarFK_IdFormatoOrdenProdu);
			if(!this.ordenproduConstantesFunciones.mostrarFK_IdFormatoOrdenProdu && index>-1) {
				this.jTabbedPaneBusquedasOrdenProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ordenproduConstantesFunciones.mostrarFK_IdTipoPrioridadEmpresaProduOrdenProdu);
			if(!this.ordenproduConstantesFunciones.mostrarFK_IdTipoPrioridadEmpresaProduOrdenProdu && index>-1) {
				this.jTabbedPaneBusquedasOrdenProdu.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioOrdenProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasOrdenProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdClienteOrdenProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ordenproduConstantesFunciones.activarFK_IdClienteOrdenProdu);
				this.jTabbedPaneBusquedasOrdenProdu.setEnabledAt(index,this.ordenproduConstantesFunciones.activarFK_IdClienteOrdenProdu);
			}

			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableOrdenProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ordenproduConstantesFunciones.activarFK_IdEmpleadoResponsableOrdenProdu);
				this.jTabbedPaneBusquedasOrdenProdu.setEnabledAt(index,this.ordenproduConstantesFunciones.activarFK_IdEmpleadoResponsableOrdenProdu);
			}

			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdEstadoOrdenProduOrdenProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ordenproduConstantesFunciones.activarFK_IdEstadoOrdenProduOrdenProdu);
				this.jTabbedPaneBusquedasOrdenProdu.setEnabledAt(index,this.ordenproduConstantesFunciones.activarFK_IdEstadoOrdenProduOrdenProdu);
			}

			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdFormatoOrdenProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ordenproduConstantesFunciones.activarFK_IdFormatoOrdenProdu);
				this.jTabbedPaneBusquedasOrdenProdu.setEnabledAt(index,this.ordenproduConstantesFunciones.activarFK_IdFormatoOrdenProdu);
			}

			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ordenproduConstantesFunciones.activarFK_IdTipoPrioridadEmpresaProduOrdenProdu);
				this.jTabbedPaneBusquedasOrdenProdu.setEnabledAt(index,this.ordenproduConstantesFunciones.activarFK_IdTipoPrioridadEmpresaProduOrdenProdu);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaOrdenProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdClienteOrdenProdu);

			this.jTabbedPaneBusquedasOrdenProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);

			this.ordenproduConstantesFunciones.setResaltarFK_IdClienteOrdenProdu(resaltar);

			jPanel.setBorder(this.ordenproduConstantesFunciones.resaltarFK_IdClienteOrdenProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleadoResponsable")) {
			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdEmpleadoResponsableOrdenProdu);

			this.jTabbedPaneBusquedasOrdenProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);

			this.ordenproduConstantesFunciones.setResaltarFK_IdEmpleadoResponsableOrdenProdu(resaltar);

			jPanel.setBorder(this.ordenproduConstantesFunciones.resaltarFK_IdEmpleadoResponsableOrdenProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoOrdenProdu")) {
			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdEstadoOrdenProduOrdenProdu);

			this.jTabbedPaneBusquedasOrdenProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);

			this.ordenproduConstantesFunciones.setResaltarFK_IdEstadoOrdenProduOrdenProdu(resaltar);

			jPanel.setBorder(this.ordenproduConstantesFunciones.resaltarFK_IdEstadoOrdenProduOrdenProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFormato")) {
			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdFormatoOrdenProdu);

			this.jTabbedPaneBusquedasOrdenProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);

			this.ordenproduConstantesFunciones.setResaltarFK_IdFormatoOrdenProdu(resaltar);

			jPanel.setBorder(this.ordenproduConstantesFunciones.resaltarFK_IdFormatoOrdenProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoPrioridadEmpresaProdu")) {
			index= this.jTabbedPaneBusquedasOrdenProdu.indexOfComponent(this.jPanelFK_IdTipoPrioridadEmpresaProduOrdenProdu);

			this.jTabbedPaneBusquedasOrdenProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasOrdenProdu.getComponent(index);

			this.ordenproduConstantesFunciones.setResaltarFK_IdTipoPrioridadEmpresaProduOrdenProdu(resaltar);

			jPanel.setBorder(this.ordenproduConstantesFunciones.resaltarFK_IdTipoPrioridadEmpresaProduOrdenProdu);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarOrdenProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioOrdenProdu() throws Exception {

		if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioOrdenProdu();
		this.updateVisibilidadResaltarControlesFormularioOrdenProdu();
		this.updateHabilitarResaltarControlesFormularioOrdenProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioOrdenProdu() throws Exception {
		if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ordenproduConstantesFunciones.resaltaridOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltaridOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarid_empresaOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarid_empresaOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarid_sucursalOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarid_sucursalOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarid_ejercicioOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarid_ejercicioOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarid_periodoOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarid_periodoOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarid_formatoOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarid_formatoOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarid_tipo_prioridad_empresa_produOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarid_tipo_prioridad_empresa_produOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarid_empleado_responsableOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarid_empleado_responsableOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarsecuencialOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jTextFieldsecuencialOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarsecuencialOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarid_clienteOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarid_clienteOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltardireccion_clienteOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jTextAreadireccion_clienteOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltardireccion_clienteOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltartelefono_clienteOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jTextFieldtelefono_clienteOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltartelefono_clienteOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarruc_clienteOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jTextFieldruc_clienteOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarruc_clienteOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarloteOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jTextFieldloteOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarloteOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarfecha_pedidoOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_pedidoOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarfecha_pedidoOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarfecha_entregaOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_entregaOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarfecha_entregaOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltares_uso_internoOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxes_uso_internoOrdenProdu.setBorderPainted(true);this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxes_uso_internoOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltares_uso_internoOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarfechaOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfechaOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarfechaOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltardescripcionOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jTextAreadescripcionOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltardescripcionOrdenProdu);}
		if(this.ordenproduConstantesFunciones.resaltarid_estado_orden_produOrdenProdu!=null && this.jInternalFrameDetalleFormOrdenProdu!=null) {this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.setBorder(this.ordenproduConstantesFunciones.resaltarid_estado_orden_produOrdenProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioOrdenProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
	
		//this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostraridOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelidOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostraridOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_empresaOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelid_empresaOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_empresaOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_sucursalOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelid_sucursalOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_sucursalOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_ejercicioOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelid_ejercicioOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_ejercicioOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_periodoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelid_periodoOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_periodoOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_formatoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelid_formatoOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_formatoOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_tipo_prioridad_empresa_produOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelid_tipo_prioridad_empresa_produOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_tipo_prioridad_empresa_produOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_empleado_responsableOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelid_empleado_responsableOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_empleado_responsableOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jTextFieldsecuencialOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarsecuencialOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelsecuencialOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarsecuencialOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelid_clienteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_clienteOrdenProdu);
			this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_clienteOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jTextAreadireccion_clienteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrardireccion_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPaneldireccion_clienteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrardireccion_clienteOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jTextFieldtelefono_clienteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrartelefono_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPaneltelefono_clienteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrartelefono_clienteOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jTextFieldruc_clienteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarruc_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelruc_clienteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarruc_clienteOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jTextFieldloteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarloteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelloteOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarloteOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_pedidoOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarfecha_pedidoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelfecha_pedidoOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarfecha_pedidoOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_entregaOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarfecha_entregaOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelfecha_entregaOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarfecha_entregaOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxes_uso_internoOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrares_uso_internoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPaneles_uso_internoOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrares_uso_internoOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfechaOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarfechaOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelfechaOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarfechaOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jTextAreadescripcionOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrardescripcionOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPaneldescripcionOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrardescripcionOrdenProdu);
		//this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_estado_orden_produOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jPanelid_estado_orden_produOrdenProdu.setVisible(this.ordenproduConstantesFunciones.mostrarid_estado_orden_produOrdenProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioOrdenProdu() throws Exception {
		if(this.jInternalFrameDetalleFormOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormOrdenProdu!=null) {
	
		this.jInternalFrameDetalleFormOrdenProdu.jLabelidOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activaridOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empresaOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarid_empresaOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_sucursalOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarid_sucursalOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_ejercicioOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarid_ejercicioOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_periodoOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarid_periodoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_formatoOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarid_formatoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarid_tipo_prioridad_empresa_produOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_empleado_responsableOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarid_empleado_responsableOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextFieldsecuencialOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarsecuencialOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_clienteOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarid_clienteOrdenProdu);
			this.jInternalFrameDetalleFormOrdenProdu.jButtonid_clienteOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarid_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextAreadireccion_clienteOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activardireccion_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextFieldtelefono_clienteOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activartelefono_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextFieldruc_clienteOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarruc_clienteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextFieldloteOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarloteOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_pedidoOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarfecha_pedidoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfecha_entregaOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarfecha_entregaOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jCheckBoxes_uso_internoOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activares_uso_internoOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jDateChooserfechaOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarfechaOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jTextAreadescripcionOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activardescripcionOrdenProdu);
		this.jInternalFrameDetalleFormOrdenProdu.jComboBoxid_estado_orden_produOrdenProdu.setEnabled(this.ordenproduConstantesFunciones.activarid_estado_orden_produOrdenProdu);
		}
	}
	
		
}