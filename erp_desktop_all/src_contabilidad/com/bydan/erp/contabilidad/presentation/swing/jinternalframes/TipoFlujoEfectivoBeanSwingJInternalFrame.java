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

import com.bydan.erp.contabilidad.util.TipoFlujoEfectivoConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoFlujoEfectivoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoFlujoEfectivoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoFlujoEfectivoBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class TipoFlujoEfectivoBeanSwingJInternalFrame extends TipoFlujoEfectivoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoFlujoEfectivoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoFlujoEfectivo> tipoflujoefectivoValidator = new ClassValidator<TipoFlujoEfectivo>(TipoFlujoEfectivo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoFlujoEfectivo tipoflujoefectivo;	
	public TipoFlujoEfectivo tipoflujoefectivoAux;
	public TipoFlujoEfectivo tipoflujoefectivoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoFlujoEfectivo tipoflujoefectivoTotales;
	public Long idTipoFlujoEfectivoActual;
	public Long iIdNuevoTipoFlujoEfectivo=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCuentaContable=false;

	public Boolean getIsTienePermisosCuentaContable() {
		return isTienePermisosCuentaContable;
	}

	public void setIsTienePermisosCuentaContable(Boolean isTienePermisosCuentaContable) {
		this.isTienePermisosCuentaContable= isTienePermisosCuentaContable;
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
	
	public Boolean isPermisoTodoTipoFlujoEfectivo;
	public Boolean isPermisoNuevoTipoFlujoEfectivo;
	public Boolean isPermisoActualizarTipoFlujoEfectivo;
	public Boolean isPermisoActualizarOriginalTipoFlujoEfectivo;
	public Boolean isPermisoEliminarTipoFlujoEfectivo;
	public Boolean isPermisoGuardarCambiosTipoFlujoEfectivo;
	public Boolean isPermisoConsultaTipoFlujoEfectivo;
	public Boolean isPermisoBusquedaTipoFlujoEfectivo;
	public Boolean isPermisoReporteTipoFlujoEfectivo;
	public Boolean isPermisoPaginacionMedioTipoFlujoEfectivo;
	public Boolean isPermisoPaginacionAltoTipoFlujoEfectivo;
	public Boolean isPermisoPaginacionTodoTipoFlujoEfectivo;
	public Boolean isPermisoCopiarTipoFlujoEfectivo;
	public Boolean isPermisoVerFormTipoFlujoEfectivo;
	public Boolean isPermisoDuplicarTipoFlujoEfectivo;
	public Boolean isPermisoOrdenTipoFlujoEfectivo;
	
	
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
	
	public TipoFlujoEfectivoParameterReturnGeneral tipoflujoefectivoReturnGeneral;
	public TipoFlujoEfectivoParameterReturnGeneral tipoflujoefectivoParameterGeneral;
	
	

	public CuentaContableLogic cuentacontableLogic=null;

	public CuentaContableLogic getCuentaContableLogic() {
		return cuentacontableLogic;
	}

	public void setCuentaContableLogic(CuentaContableLogic cuentacontableLogic) {
		this.cuentacontableLogic = cuentacontableLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoFlujoEfectivo=false;
	public Boolean esParaAccionDesdeFormularioTipoFlujoEfectivo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoFlujoEfectivoSessionBeanAdditional tipoflujoefectivoSessionBeanAdditional=null;
	
	public TipoFlujoEfectivoSessionBeanAdditional getTipoFlujoEfectivoSessionBeanAdditional() {
		return this.tipoflujoefectivoSessionBeanAdditional;
	}
	
	public void setTipoFlujoEfectivoSessionBeanAdditional(TipoFlujoEfectivoSessionBeanAdditional tipoflujoefectivoSessionBeanAdditional) {
		try {
			this.tipoflujoefectivoSessionBeanAdditional=tipoflujoefectivoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoFlujoEfectivoBeanSwingJInternalFrameAdditional tipoflujoefectivoBeanSwingJInternalFrameAdditional=null;
	//public class TipoFlujoEfectivoBeanSwingJInternalFrame
	
	public TipoFlujoEfectivoBeanSwingJInternalFrameAdditional getTipoFlujoEfectivoBeanSwingJInternalFrameAdditional() {
		return this.tipoflujoefectivoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoFlujoEfectivoBeanSwingJInternalFrameAdditional(TipoFlujoEfectivoBeanSwingJInternalFrameAdditional tipoflujoefectivoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoflujoefectivoBeanSwingJInternalFrameAdditional=tipoflujoefectivoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoFlujoEfectivoLogic tipoflujoefectivoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoFlujoEfectivo tipoflujoefectivoBean;
	public TipoFlujoEfectivoConstantesFunciones tipoflujoefectivoConstantesFunciones;
	//public TipoFlujoEfectivoParameterReturnGeneral tipoflujoefectivoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoFlujoEfectivo> tipoflujoefectivos;	
	//public List<TipoFlujoEfectivo> tipoflujoefectivosEliminados;
	//public List<TipoFlujoEfectivo> tipoflujoefectivosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoFlujoEfectivo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoFlujoEfectivo=true;
	public Boolean isVisibilidadCeldaCopiarTipoFlujoEfectivo=true;
	public Boolean isVisibilidadCeldaVerFormTipoFlujoEfectivo=true;
	public Boolean isVisibilidadCeldaOrdenTipoFlujoEfectivo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=false;
	public Boolean isVisibilidadCeldaModificarTipoFlujoEfectivo=false;
	public Boolean isVisibilidadCeldaActualizarTipoFlujoEfectivo=false;
	public Boolean isVisibilidadCeldaEliminarTipoFlujoEfectivo=false;
	public Boolean isVisibilidadCeldaCancelarTipoFlujoEfectivo=false;
	public Boolean isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoFlujoEfectivo() {
		return this.iIdNuevoTipoFlujoEfectivo;
	}

	public void setiIdNuevoTipoFlujoEfectivo(Long iIdNuevoTipoFlujoEfectivo) {
		this.iIdNuevoTipoFlujoEfectivo = iIdNuevoTipoFlujoEfectivo;
	}
	
	public Long getidTipoFlujoEfectivoActual() {
		return this.idTipoFlujoEfectivoActual;
	}

	public void setidTipoFlujoEfectivoActual(Long idTipoFlujoEfectivoActual) {
		this.idTipoFlujoEfectivoActual = idTipoFlujoEfectivoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoFlujoEfectivo gettipoflujoefectivo() {
		return this.tipoflujoefectivo;
	}

	public void settipoflujoefectivo(TipoFlujoEfectivo tipoflujoefectivo) {
		this.tipoflujoefectivo = tipoflujoefectivo;
	}
	
	public TipoFlujoEfectivo gettipoflujoefectivoAux() {
		return this.tipoflujoefectivoAux;
	}

	public void settipoflujoefectivoAux(TipoFlujoEfectivo tipoflujoefectivoAux) {
		this.tipoflujoefectivoAux = tipoflujoefectivoAux;
	}				
	
	public TipoFlujoEfectivo gettipoflujoefectivoAnterior() {
		return this.tipoflujoefectivoAnterior;
	}

	public void settipoflujoefectivoAnterior(TipoFlujoEfectivo tipoflujoefectivoAnterior) {
		this.tipoflujoefectivoAnterior = tipoflujoefectivoAnterior;
	}	
	
	public TipoFlujoEfectivo gettipoflujoefectivoTotales() {
		return this.tipoflujoefectivoTotales;
	}

	public void settipoflujoefectivoTotales(TipoFlujoEfectivo tipoflujoefectivoTotales) {
		this.tipoflujoefectivoTotales = tipoflujoefectivoTotales;
	}	
	
	public TipoFlujoEfectivo gettipoflujoefectivoBean() {
		return this.tipoflujoefectivoBean;
	}

	public void settipoflujoefectivoBean(TipoFlujoEfectivo tipoflujoefectivoBean) {
		this.tipoflujoefectivoBean = tipoflujoefectivoBean;
	}	
	
	public TipoFlujoEfectivoParameterReturnGeneral gettipoflujoefectivoReturnGeneral() {
		return this.tipoflujoefectivoReturnGeneral;
	}

	public void settipoflujoefectivoReturnGeneral(TipoFlujoEfectivoParameterReturnGeneral tipoflujoefectivoReturnGeneral) {
		this.tipoflujoefectivoReturnGeneral = tipoflujoefectivoReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
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
	
	
	public TipoFlujoEfectivoLogic getTipoFlujoEfectivoLogic()	{		
		return tipoflujoefectivoLogic;
	}

	public void setTipoFlujoEfectivoLogic(TipoFlujoEfectivoLogic tipoflujoefectivoLogic) {
		this.tipoflujoefectivoLogic = tipoflujoefectivoLogic;
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
	
	public Boolean getIsEsNuevoTipoFlujoEfectivo() {
		return isEsNuevoTipoFlujoEfectivo;
	}

	public void setIsEsNuevoTipoFlujoEfectivo(Boolean isEsNuevoTipoFlujoEfectivo) {
		this.isEsNuevoTipoFlujoEfectivo = isEsNuevoTipoFlujoEfectivo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoFlujoEfectivo() {
		return esParaAccionDesdeFormularioTipoFlujoEfectivo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoFlujoEfectivo(Boolean esParaAccionDesdeFormularioTipoFlujoEfectivo) {
		this.esParaAccionDesdeFormularioTipoFlujoEfectivo = esParaAccionDesdeFormularioTipoFlujoEfectivo;
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

			if(this.tipoflujoefectivoSessionBean==null) {
				this.tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
			}

			if(!this.tipoflujoefectivoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoflujoefectivoSessionBean.getlidEmpresaActual());
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

					if(this.tipoflujoefectivo!=null) {
						this.tipoflujoefectivo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
						this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoFlujoEfectivo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
						if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoFlujoEfectivoGenerico)throws Exception
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
				jComboBoxid_empresaTipoFlujoEfectivoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoFlujoEfectivoGenerico!=null && jComboBoxid_empresaTipoFlujoEfectivoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoFlujoEfectivoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoFlujoEfectivo tipoflujoefectivo,JComboBox jComboBoxid_empresaTipoFlujoEfectivoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoFlujoEfectivoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoFlujoEfectivoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoflujoefectivo.setid_empresa(empresaAux.getId());
				tipoflujoefectivo.setempresa_descripcion(TipoFlujoEfectivoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoflujoefectivo.setEmpresa(empresaAux);			}
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

					if(!TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { 
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { 
					}

					if(!TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoFlujoEfectivo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoFlujoEfectivoConstantesFunciones.refrescarForeignKeysDescripcionesTipoFlujoEfectivo(this.tipoflujoefectivoLogic.getTipoFlujoEfectivos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoFlujoEfectivoConstantesFunciones.refrescarForeignKeysDescripcionesTipoFlujoEfectivo(this.tipoflujoefectivos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoflujoefectivoLogic.setTipoFlujoEfectivos(this.tipoflujoefectivos);
			tipoflujoefectivoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoFlujoEfectivoParameterReturnGeneral getTipoFlujoEfectivoParameterGeneral() {
		return this.tipoflujoefectivoParameterGeneral;
	}
	
	public void setTipoFlujoEfectivoParameterGeneral(TipoFlujoEfectivoParameterReturnGeneral tipoflujoefectivoParameterGeneral) {
		this.tipoflujoefectivoParameterGeneral = tipoflujoefectivoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoFlujoEfectivo() {
		return isPermisoTodoTipoFlujoEfectivo;
	}

	public void setIsPermisoTodoTipoFlujoEfectivo(Boolean isPermisoTodoTipoFlujoEfectivo) {
		this.isPermisoTodoTipoFlujoEfectivo = isPermisoTodoTipoFlujoEfectivo;
	}

	public Boolean getIsPermisoNuevoTipoFlujoEfectivo() {
		return isPermisoNuevoTipoFlujoEfectivo;
	}

	public void setIsPermisoNuevoTipoFlujoEfectivo(Boolean isPermisoNuevoTipoFlujoEfectivo) {
		this.isPermisoNuevoTipoFlujoEfectivo = isPermisoNuevoTipoFlujoEfectivo;
	}

	public Boolean getIsPermisoActualizarTipoFlujoEfectivo() {
		return isPermisoActualizarTipoFlujoEfectivo;
	}

	public void setIsPermisoActualizarTipoFlujoEfectivo(Boolean isPermisoActualizarTipoFlujoEfectivo) {
		this.isPermisoActualizarTipoFlujoEfectivo = isPermisoActualizarTipoFlujoEfectivo;
	}

	public Boolean getIsPermisoEliminarTipoFlujoEfectivo() {
		return isPermisoEliminarTipoFlujoEfectivo;
	}

	public void setIsPermisoEliminarTipoFlujoEfectivo(Boolean isPermisoEliminarTipoFlujoEfectivo) {
		this.isPermisoEliminarTipoFlujoEfectivo = isPermisoEliminarTipoFlujoEfectivo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoFlujoEfectivo() {
		return isPermisoGuardarCambiosTipoFlujoEfectivo;
	}

	public void setIsPermisoGuardarCambiosTipoFlujoEfectivo(Boolean isPermisoGuardarCambiosTipoFlujoEfectivo) {
		this.isPermisoGuardarCambiosTipoFlujoEfectivo = isPermisoGuardarCambiosTipoFlujoEfectivo;
	}
	
	public Boolean getIsPermisoConsultaTipoFlujoEfectivo() {
		return isPermisoConsultaTipoFlujoEfectivo;
	}

	public void setIsPermisoConsultaTipoFlujoEfectivo(Boolean isPermisoConsultaTipoFlujoEfectivo) {
		this.isPermisoConsultaTipoFlujoEfectivo = isPermisoConsultaTipoFlujoEfectivo;
	}

	public Boolean getIsPermisoBusquedaTipoFlujoEfectivo() {
		return isPermisoBusquedaTipoFlujoEfectivo;
	}

	public void setIsPermisoBusquedaTipoFlujoEfectivo(Boolean isPermisoBusquedaTipoFlujoEfectivo) {
		this.isPermisoBusquedaTipoFlujoEfectivo = isPermisoBusquedaTipoFlujoEfectivo;
	}

	public Boolean getIsPermisoReporteTipoFlujoEfectivo() {
		return isPermisoReporteTipoFlujoEfectivo;
	}

	public void setIsPermisoReporteTipoFlujoEfectivo(Boolean isPermisoReporteTipoFlujoEfectivo) {
		this.isPermisoReporteTipoFlujoEfectivo = isPermisoReporteTipoFlujoEfectivo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoFlujoEfectivo() {
		return isPermisoPaginacionMedioTipoFlujoEfectivo;
	}

	public void setIsPermisoPaginacionMedioTipoFlujoEfectivo(Boolean isPermisoPaginacionMedioTipoFlujoEfectivo) {
		this.isPermisoPaginacionMedioTipoFlujoEfectivo = isPermisoPaginacionMedioTipoFlujoEfectivo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoFlujoEfectivo() {
		return isPermisoPaginacionTodoTipoFlujoEfectivo;
	}

	public void setIsPermisoPaginacionTodoTipoFlujoEfectivo(Boolean isPermisoPaginacionTodoTipoFlujoEfectivo) {
		this.isPermisoPaginacionTodoTipoFlujoEfectivo = isPermisoPaginacionTodoTipoFlujoEfectivo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoFlujoEfectivo() {
		return isPermisoPaginacionAltoTipoFlujoEfectivo;
	}

	public void setIsPermisoPaginacionAltoTipoFlujoEfectivo(Boolean isPermisoPaginacionAltoTipoFlujoEfectivo) {
		this.isPermisoPaginacionAltoTipoFlujoEfectivo = isPermisoPaginacionAltoTipoFlujoEfectivo;
	}
	
	public Boolean getIsPermisoCopiarTipoFlujoEfectivo() {
		return isPermisoCopiarTipoFlujoEfectivo;
	}

	public void setIsPermisoCopiarTipoFlujoEfectivo(Boolean isPermisoCopiarTipoFlujoEfectivo) {
		this.isPermisoCopiarTipoFlujoEfectivo = isPermisoCopiarTipoFlujoEfectivo;
	}
	
	public Boolean getIsPermisoVerFormTipoFlujoEfectivo() {
		return isPermisoVerFormTipoFlujoEfectivo;
	}

	public void setIsPermisoVerFormTipoFlujoEfectivo(Boolean isPermisoVerFormTipoFlujoEfectivo) {
		this.isPermisoVerFormTipoFlujoEfectivo = isPermisoVerFormTipoFlujoEfectivo;
	}
	
	public Boolean getIsPermisoDuplicarTipoFlujoEfectivo() {
		return isPermisoDuplicarTipoFlujoEfectivo;
	}

	public void setIsPermisoDuplicarTipoFlujoEfectivo(Boolean isPermisoDuplicarTipoFlujoEfectivo) {
		this.isPermisoDuplicarTipoFlujoEfectivo = isPermisoDuplicarTipoFlujoEfectivo;
	}
	
	public Boolean getIsPermisoOrdenTipoFlujoEfectivo() {
		return isPermisoOrdenTipoFlujoEfectivo;
	}

	public void setIsPermisoOrdenTipoFlujoEfectivo(Boolean isPermisoOrdenTipoFlujoEfectivo) {
		this.isPermisoOrdenTipoFlujoEfectivo = isPermisoOrdenTipoFlujoEfectivo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoFlujoEfectivo() {
		return isVisibilidadCeldaNuevoTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaNuevoTipoFlujoEfectivo(Boolean isVisibilidadCeldaNuevoTipoFlujoEfectivo) {
		this.isVisibilidadCeldaNuevoTipoFlujoEfectivo = isVisibilidadCeldaNuevoTipoFlujoEfectivo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoFlujoEfectivo() {
		return isVisibilidadCeldaDuplicarTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoFlujoEfectivo(Boolean isVisibilidadCeldaDuplicarTipoFlujoEfectivo) {
		this.isVisibilidadCeldaDuplicarTipoFlujoEfectivo = isVisibilidadCeldaDuplicarTipoFlujoEfectivo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoFlujoEfectivo() {
		return isVisibilidadCeldaCopiarTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaCopiarTipoFlujoEfectivo(Boolean isVisibilidadCeldaCopiarTipoFlujoEfectivo) {
		this.isVisibilidadCeldaCopiarTipoFlujoEfectivo = isVisibilidadCeldaCopiarTipoFlujoEfectivo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoFlujoEfectivo() {
		return isVisibilidadCeldaVerFormTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaVerFormTipoFlujoEfectivo(Boolean isVisibilidadCeldaVerFormTipoFlujoEfectivo) {
		this.isVisibilidadCeldaVerFormTipoFlujoEfectivo = isVisibilidadCeldaVerFormTipoFlujoEfectivo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoFlujoEfectivo() {
		return isVisibilidadCeldaOrdenTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaOrdenTipoFlujoEfectivo(Boolean isVisibilidadCeldaOrdenTipoFlujoEfectivo) {
		this.isVisibilidadCeldaOrdenTipoFlujoEfectivo = isVisibilidadCeldaOrdenTipoFlujoEfectivo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo() {
		return isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo(Boolean isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo = isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoFlujoEfectivo() {
		return isVisibilidadCeldaModificarTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaModificarTipoFlujoEfectivo(Boolean isVisibilidadCeldaModificarTipoFlujoEfectivo) {
		this.isVisibilidadCeldaModificarTipoFlujoEfectivo = isVisibilidadCeldaModificarTipoFlujoEfectivo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoFlujoEfectivo() {
		return isVisibilidadCeldaActualizarTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaActualizarTipoFlujoEfectivo(Boolean isVisibilidadCeldaActualizarTipoFlujoEfectivo) {
		this.isVisibilidadCeldaActualizarTipoFlujoEfectivo = isVisibilidadCeldaActualizarTipoFlujoEfectivo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoFlujoEfectivo() {
		return isVisibilidadCeldaEliminarTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaEliminarTipoFlujoEfectivo(Boolean isVisibilidadCeldaEliminarTipoFlujoEfectivo) {
		this.isVisibilidadCeldaEliminarTipoFlujoEfectivo = isVisibilidadCeldaEliminarTipoFlujoEfectivo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoFlujoEfectivo() {
		return isVisibilidadCeldaCancelarTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaCancelarTipoFlujoEfectivo(Boolean isVisibilidadCeldaCancelarTipoFlujoEfectivo) {
		this.isVisibilidadCeldaCancelarTipoFlujoEfectivo = isVisibilidadCeldaCancelarTipoFlujoEfectivo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoFlujoEfectivo() {
		return isVisibilidadCeldaGuardarTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaGuardarTipoFlujoEfectivo(Boolean isVisibilidadCeldaGuardarTipoFlujoEfectivo) {
		this.isVisibilidadCeldaGuardarTipoFlujoEfectivo = isVisibilidadCeldaGuardarTipoFlujoEfectivo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo() {
		return isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo(Boolean isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo) {
		this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo = isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo;
	}
		
	public TipoFlujoEfectivoSessionBean gettipoflujoefectivoSessionBean() {
		return this.tipoflujoefectivoSessionBean;
	}
	
	public void settipoflujoefectivoSessionBean(TipoFlujoEfectivoSessionBean tipoflujoefectivoSessionBean) {
		this.tipoflujoefectivoSessionBean=tipoflujoefectivoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoflujoefectivo,null);
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
	
	public void bugActualizarReferenciaActual(TipoFlujoEfectivo tipoflujoefectivo,TipoFlujoEfectivo tipoflujoefectivoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoFlujoEfectivo(tipoflujoefectivo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoflujoefectivoAux.setId(tipoflujoefectivo.getId());
		tipoflujoefectivoAux.setVersionRow(tipoflujoefectivo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoFlujoEfectivo();
		
			int intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoflujoefectivoValidator.getInvalidValues(this.tipoflujoefectivo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoflujoefectivoLogic.setDatosCliente(datosCliente);
			tipoflujoefectivoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoflujoefectivoAux=new  TipoFlujoEfectivo();
				
				tipoflujoefectivoAux.setIsNew(true);
				tipoflujoefectivoAux.setIsChanged(true);
				
				tipoflujoefectivoAux.setTipoFlujoEfectivoOriginal(this.tipoflujoefectivo);
				
				tipoflujoefectivoAux.setId(this.tipoflujoefectivo.getId());	
				tipoflujoefectivoAux.setVersionRow(this.tipoflujoefectivo.getVersionRow());	
				tipoflujoefectivoAux.setid_empresa(this.tipoflujoefectivo.getid_empresa());	
				tipoflujoefectivoAux.setnombre(this.tipoflujoefectivo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoflujoefectivoAux,tipoflujoefectivoLogic.getTipoFlujoEfectivos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoflujoefectivoAux,tipoflujoefectivos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoflujoefectivoLogic.saveTipoFlujoEfectivos();//WithConnection
						//tipoflujoefectivoLogic.getSetVersionRowTipoFlujoEfectivos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoflujoefectivo,tipoflujoefectivoAux);
					
					this.refrescarForeignKeysDescripcionesTipoFlujoEfectivo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables().addAll(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontables.addAll(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoflujoefectivoLogic.saveTipoFlujoEfectivoRelaciones(tipoflujoefectivoAux,this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());//WithConnection
								//tipoflujoefectivoLogic.getSetVersionRowTipoFlujoEfectivos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoflujoefectivo,tipoflujoefectivoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.setCuentaContables(new ArrayList<CuentaContable>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontables= new ArrayList<CuentaContable>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoflujoefectivoAux.setCuentaContables(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoflujoefectivoAux,tipoflujoefectivoLogic.getTipoFlujoEfectivos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoflujoefectivoAux,tipoflujoefectivos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoflujoefectivo,tipoflujoefectivoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoflujoefectivoAux=new  TipoFlujoEfectivo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado() && this.tipoflujoefectivo.getId()>=0)) {
						
					tipoflujoefectivoAux.setIsNew(false);
				}
				
				tipoflujoefectivoAux.setIsDeleted(false);
			
				tipoflujoefectivoAux.setId(this.tipoflujoefectivo.getId());	
				tipoflujoefectivoAux.setVersionRow(this.tipoflujoefectivo.getVersionRow());	
				tipoflujoefectivoAux.setid_empresa(this.tipoflujoefectivo.getid_empresa());	
				tipoflujoefectivoAux.setnombre(this.tipoflujoefectivo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoflujoefectivoAux,tipoflujoefectivoLogic.getTipoFlujoEfectivos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoflujoefectivoAux,tipoflujoefectivos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoflujoefectivoLogic.saveTipoFlujoEfectivos();//WithConnection
						//tipoflujoefectivoLogic.getSetVersionRowTipoFlujoEfectivos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoflujoefectivo,tipoflujoefectivoAux);
					
					this.refrescarForeignKeysDescripcionesTipoFlujoEfectivo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables().addAll(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontables.addAll(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoflujoefectivoLogic.saveTipoFlujoEfectivoRelaciones(tipoflujoefectivoAux,this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());//WithConnection
								//tipoflujoefectivoLogic.getSetVersionRowTipoFlujoEfectivos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoflujoefectivo,tipoflujoefectivoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.setCuentaContables(new ArrayList<CuentaContable>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontables= new ArrayList<CuentaContable>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoflujoefectivoAux.setCuentaContables(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoflujoefectivoAux,tipoflujoefectivoLogic.getTipoFlujoEfectivos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoflujoefectivoAux,tipoflujoefectivos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoflujoefectivo,tipoflujoefectivoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoflujoefectivoAux=new  TipoFlujoEfectivo();
				
				tipoflujoefectivoAux.setIsNew(false);
				tipoflujoefectivoAux.setIsChanged(false);
				
				tipoflujoefectivoAux.setIsDeleted(true);
				
				tipoflujoefectivoAux.setId(this.tipoflujoefectivo.getId());	
				tipoflujoefectivoAux.setVersionRow(this.tipoflujoefectivo.getVersionRow());	
				tipoflujoefectivoAux.setid_empresa(this.tipoflujoefectivo.getid_empresa());	
				tipoflujoefectivoAux.setnombre(this.tipoflujoefectivo.getnombre());	
				
				if(this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoflujoefectivoAux.getId()>=0) {	
						this.tipoflujoefectivosEliminados.add(tipoflujoefectivoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoflujoefectivoAux,tipoflujoefectivoLogic.getTipoFlujoEfectivos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoflujoefectivoAux,tipoflujoefectivos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoflujoefectivoLogic.saveTipoFlujoEfectivos();//WithConnection
						//tipoflujoefectivoLogic.getSetVersionRowTipoFlujoEfectivos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables().addAll(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontables.addAll(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoflujoefectivoLogic.saveTipoFlujoEfectivoRelaciones(tipoflujoefectivoAux,this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());//WithConnection
								//tipoflujoefectivoLogic.getSetVersionRowTipoFlujoEfectivos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.setCuentaContables(new ArrayList<CuentaContable>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontables= new ArrayList<CuentaContable>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoflujoefectivoAux.setCuentaContables(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoflujoefectivoAux,tipoflujoefectivoLogic.getTipoFlujoEfectivos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoflujoefectivoAux,tipoflujoefectivos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().addAll(this.tipoflujoefectivosEliminados);
					
					tipoflujoefectivoLogic.saveTipoFlujoEfectivos();//WithConnection
					//tipoflujoefectivoLogic.getSetVersionRowTipoFlujoEfectivos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoFlujoEfectivo();
				
				this.tipoflujoefectivosEliminados= new ArrayList<TipoFlujoEfectivo>();		
			}
			
			if(this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Flujo Efectivo  GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Flujo Efectivo ",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoflujoefectivo=tipoflujoefectivoAux;
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
      		//this.finishProcessTipoFlujoEfectivo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoFlujoEfectivo tipoflujoefectivoLocal) throws Exception {
		
		if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoflujoefectivoLocal.setCuentaContables(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());
			
			} else {
			
				tipoflujoefectivoLocal.setCuentaContables(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontables);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoFlujoEfectivo tipoflujoefectivoLocal) throws Exception {	
		if(this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoflujoefectivoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoFlujoEfectivoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoflujoefectivoValidator.getInvalidValues(this.tipoflujoefectivo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoFlujoEfectivo tipoflujoefectivo,List<TipoFlujoEfectivo> tipoflujoefectivos) throws Exception {
		try	{		
			TipoFlujoEfectivoConstantesFunciones.actualizarLista(tipoflujoefectivo,tipoflujoefectivos,this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoFlujoEfectivo tipoflujoefectivo,List<TipoFlujoEfectivo> tipoflujoefectivos) throws Exception {
		try	{			
			TipoFlujoEfectivoConstantesFunciones.actualizarSelectedLista(tipoflujoefectivo,tipoflujoefectivos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoFlujoEfectivo> tipoflujoefectivosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoflujoefectivosLocal=this.tipoflujoefectivoLogic.getTipoFlujoEfectivos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoflujoefectivosLocal=this.tipoflujoefectivos;
			}
			//ARCHITECTURE
		
			for(TipoFlujoEfectivo tipoflujoefectivoLocal:tipoflujoefectivosLocal) {
				if(this.permiteMantenimiento(tipoflujoefectivoLocal) && tipoflujoefectivoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoFlujoEfectivoConstantesFunciones.getTipoFlujoEfectivoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoFlujoEfectivoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelid_empresaTipoFlujoEfectivo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoFlujoEfectivoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelnombreTipoFlujoEfectivo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelid_empresaTipoFlujoEfectivo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelnombreTipoFlujoEfectivo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CuentaContable")) {
			if(this.tipoflujoefectivo==null) {
				this.tipoflujoefectivo= new TipoFlujoEfectivo();
			}

			if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoFlujoEfectivo
				this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);

				this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.getcuentacontable().setTipoFlujoEfectivo(this.tipoflujoefectivo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoFlujoEfectivo--;	
		
		
		this.tipoflujoefectivoAux=new TipoFlujoEfectivo();
		
		this.tipoflujoefectivoAux.setId(this.iIdNuevoTipoFlujoEfectivo);
		this.tipoflujoefectivoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().add(this.tipoflujoefectivoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoflujoefectivos.add(this.tipoflujoefectivoAux);
		}
		//ARCHITECTURE
		
		this.tipoflujoefectivo=this.tipoflujoefectivoAux;
		
		if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoFlujoEfectivo(this.tipoflujoefectivo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFlujoEfectivo(this.tipoflujoefectivo);
		}
				
		//this.setDefaultControlesTipoFlujoEfectivo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoFlujoEfectivo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoFlujoEfectivo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFlujoEfectivo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivoBean,this.tipoflujoefectivo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
			classes=TipoFlujoEfectivoConstantesFunciones.getClassesRelationshipsOfTipoFlujoEfectivo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoflujoefectivoReturnGeneral=tipoflujoefectivoLogic.procesarEventosTipoFlujoEfectivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoflujoefectivoLogic.getTipoFlujoEfectivos(),this.tipoflujoefectivo,this.tipoflujoefectivoParameterGeneral,this.isEsNuevoTipoFlujoEfectivo,classes);//this.tipoflujoefectivoLogic.getTipoFlujoEfectivo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoFlujoEfectivo(this.tipoflujoefectivoReturnGeneral,this.tipoflujoefectivoBean,false);
		
		if(this.tipoflujoefectivoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFlujoEfectivo(this.tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoFlujoEfectivo(this.tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo());
		}
		
		if(this.tipoflujoefectivoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoFlujoEfectivo(this.tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo(),classes);//this.tipoflujoefectivoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoFlujoEfectivo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoFlujoEfectivo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.RecargarFormTipoFlujoEfectivo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoFlujoEfectivo(false);
						
			if(tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.getEsGuardarRelacionado() && CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContableActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFlujoEfectivo();
			}
			
			this.actualizarVisualTableDatosTipoFlujoEfectivo();
			
			this.jTableDatosTipoFlujoEfectivo.setRowSelectionInterval(this.getIndiceNuevoTipoFlujoEfectivo(), this.getIndiceNuevoTipoFlujoEfectivo());
			
			this.seleccionarFilaTablaTipoFlujoEfectivoActual();
						
			this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoFlujoEfectivo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTextAreanombreTipoFlujoEfectivo.setEnabled(isHabilitar && this.tipoflujoefectivoConstantesFunciones.activarnombreTipoFlujoEfectivo);	
		//
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.setEnabled(isHabilitar && this.tipoflujoefectivoConstantesFunciones.activarid_empresaTipoFlujoEfectivo);
	};
	
	public void setDefaultControlesTipoFlujoEfectivo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoFlujoEfectivo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoflujoefectivoSessionBean.setConGuardarRelaciones(true);			
			this.tipoflujoefectivoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTabbedPaneRelacionesTipoFlujoEfectivo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoflujoefectivoSessionBean.setConGuardarRelaciones(false);			
			this.tipoflujoefectivoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTabbedPaneRelacionesTipoFlujoEfectivo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoFlujoEfectivo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
				if(tipoflujoefectivoAux.getId().equals(this.iIdNuevoTipoFlujoEfectivo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivos) {
				if(tipoflujoefectivoAux.getId().equals(this.iIdNuevoTipoFlujoEfectivo)) {
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
	
	public int getIndiceActualTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
				if(tipoflujoefectivoAux.getId().equals(tipoflujoefectivo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivos) {
				if(tipoflujoefectivoAux.getId().equals(tipoflujoefectivo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
				if(tipoflujoefectivoAux.getTipoFlujoEfectivoOriginal().getId().equals(tipoflujoefectivoOriginal.getId())) {
					existe=true;
					tipoflujoefectivoOriginal.setId(tipoflujoefectivoAux.getId());
					tipoflujoefectivoOriginal.setVersionRow(tipoflujoefectivoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivos) {
				if(tipoflujoefectivoAux.getTipoFlujoEfectivoOriginal().getId().equals(tipoflujoefectivoOriginal.getId())) {
					existe=true;
					tipoflujoefectivoOriginal.setId(tipoflujoefectivoAux.getId());
					tipoflujoefectivoOriginal.setVersionRow(tipoflujoefectivoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoFlujoEfectivo(Boolean esParaCancelar) throws Exception {
		tipoflujoefectivosAux=new ArrayList<TipoFlujoEfectivo>();
		tipoflujoefectivoAux=new TipoFlujoEfectivo();
		
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
					if(tipoflujoefectivoAux.getId()<0) {
						tipoflujoefectivosAux.add(tipoflujoefectivoAux);
					}		
				}
				this.iIdNuevoTipoFlujoEfectivo=0L;
				this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().removeAll(tipoflujoefectivosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivos) {
					if(tipoflujoefectivoAux.getId()<0) {
						tipoflujoefectivosAux.add(tipoflujoefectivoAux);
					}		
				}
				this.iIdNuevoTipoFlujoEfectivo=0L;
				this.tipoflujoefectivos.removeAll(tipoflujoefectivosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoFlujoEfectivo 
					&& this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().size()>0
					) {
					tipoflujoefectivoAux=this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().get(this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().size() - 1);
				
					if(tipoflujoefectivoAux.getId()<0) {
						this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().remove(tipoflujoefectivoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoFlujoEfectivo && this.tipoflujoefectivos.size()>0) {
					tipoflujoefectivoAux=this.tipoflujoefectivos.get(this.tipoflujoefectivos.size() - 1);
				
					if(tipoflujoefectivoAux.getId()<0) {
						this.tipoflujoefectivos.remove(tipoflujoefectivoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoFlujoEfectivo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoflujoefectivo.getId()<0) {
				this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().remove(this.tipoflujoefectivo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoflujoefectivo.getId()<0) {
				this.tipoflujoefectivos.remove(this.tipoflujoefectivo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoFlujoEfectivo(List<TipoFlujoEfectivo> tipoflujoefectivosAux) throws Exception {
		TipoFlujoEfectivoConstantesFunciones.setEstadosInicialesTipoFlujoEfectivo(tipoflujoefectivosAux);
	}
	
	public void setEstadosInicialesTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivoAux) throws Exception {
		TipoFlujoEfectivoConstantesFunciones.setEstadosInicialesTipoFlujoEfectivo(tipoflujoefectivoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoFlujoEfectivoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoFlujoEfectivoActual()) {
				if(!this.isEsNuevoTipoFlujoEfectivo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoFlujoEfectivo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoFlujoEfectivoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Flujo Efectivo  ?", "MANTENIMIENTO DE Tipo Flujo Efectivo ", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoFlujoEfectivo tipoflujoefectivo) throws Exception {
		TipoFlujoEfectivoConstantesFunciones.seleccionarAsignar(this.tipoflujoefectivo,tipoflujoefectivo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoFlujoEfectivo=this.isPermisoActualizarOriginalTipoFlujoEfectivo;
			
			
			this.seleccionarAsignar(tipoflujoefectivo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFlujoEfectivoConstantesFunciones.quitarEspaciosTipoFlujoEfectivo(this.tipoflujoefectivo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoflujoefectivoSessionBean.setsFuncionBusquedaRapida(this.tipoflujoefectivoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoFlujoEfectivo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoFlujoEfectivo(esParaCancelar);				
				this.cancelarNuevoTipoFlujoEfectivo(esParaCancelar);								
			}
			
			this.tipoflujoefectivo=new TipoFlujoEfectivo();
			
			this.inicializarTipoFlujoEfectivo();
			
			this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoFlujoEfectivo() throws Exception {
		try {
			TipoFlujoEfectivoConstantesFunciones.inicializarTipoFlujoEfectivo(this.tipoflujoefectivo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoFlujoEfectivos(String sAccionBusqueda,List<TipoFlujoEfectivo> tipoflujoefectivosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoFlujoEfectivo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoFlujoEfectivoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoFlujoEfectivoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoFlujoEfectivo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Flujo Efectivo s");		
		parameters.put("busquedapor", TipoFlujoEfectivoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CuentaContable.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoFlujoEfectivoLogic tipoflujoefectivoLogicAuxiliar=new TipoFlujoEfectivoLogic();
					tipoflujoefectivoLogicAuxiliar.setDatosCliente(tipoflujoefectivoLogic.getDatosCliente());				
					tipoflujoefectivoLogicAuxiliar.setTipoFlujoEfectivos(tipoflujoefectivosParaReportes);
					
					tipoflujoefectivoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoFlujoEfectivoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoflujoefectivosParaReportes=tipoflujoefectivoLogicAuxiliar.getTipoFlujoEfectivos();
					
					//tipoflujoefectivoLogic.getNewConnexionToDeep();
					
					//for (TipoFlujoEfectivo tipoflujoefectivo:tipoflujoefectivosParaReportes) {
					//	tipoflujoefectivoLogic.deepLoad(tipoflujoefectivo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoflujoefectivoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoflujoefectivoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCuentaContable = AuxiliarReportes.class.getResourceAsStream("CuentaContableDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuentacontable", reportFileCuentaContable);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoFlujoEfectivo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoFlujoEfectivoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoFlujoEfectivoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoFlujoEfectivo=new JRBeanArrayDataSource(TipoFlujoEfectivoJInternalFrame.TraerTipoFlujoEfectivoBeans(tipoflujoefectivosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoFlujoEfectivo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoFlujoEfectivoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoFlujoEfectivoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoFlujoEfectivoBean.TraerTipoFlujoEfectivoBeans(tipoflujoefectivosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoFlujoEfectivos(sAccionBusqueda,sTipoArchivoReporte,tipoflujoefectivosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoFlujoEfectivos(sAccionBusqueda,sTipoArchivoReporte,tipoflujoefectivosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivoActionPerformed(null);
					//this.generarExcelReporteTipoFlujoEfectivos(sAccionBusqueda,sTipoArchivoReporte,tipoflujoefectivosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoFlujoEfectivos(sAccionBusqueda,sTipoArchivoReporte,tipoflujoefectivosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoFlujoEfectivos(sAccionBusqueda,sTipoArchivoReporte,tipoflujoefectivosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoFlujoEfectivos(sAccionBusqueda,sTipoArchivoReporte,tipoflujoefectivosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoFlujoEfectivos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFlujoEfectivo> tipoflujoefectivosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoflujoefectivo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFlujoEfectivos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFlujoEfectivo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoFlujoEfectivo tipoflujoefectivo : tipoflujoefectivosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoFlujoEfectivoConstantesFunciones.generarExcelReporteDataTipoFlujoEfectivo("NORMAL",row,workbook,tipoflujoefectivo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Flujo Efectivo ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoFlujoEfectivo(String sTipo,Row row,Workbook workbook) {
		
		TipoFlujoEfectivoConstantesFunciones.generarExcelReporteHeaderTipoFlujoEfectivo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoFlujoEfectivos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFlujoEfectivo> tipoflujoefectivosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoflujoefectivo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFlujoEfectivos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoFlujoEfectivo tipoflujoefectivo : tipoflujoefectivosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoFlujoEfectivoConstantesFunciones.getTipoFlujoEfectivoDescripcion(tipoflujoefectivo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoflujoefectivo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoflujoefectivo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Flujo Efectivo ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoFlujoEfectivos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFlujoEfectivo> tipoflujoefectivosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoFlujoEfectivo> tipoflujoefectivosRespaldo=null;
		
		classes=TipoFlujoEfectivoConstantesFunciones.getClassesRelationshipsOfTipoFlujoEfectivo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoflujoefectivoLogic.setDatosCliente(this.datosCliente);
		this.tipoflujoefectivoLogic.setDatosDeep(this.datosDeep);
		this.tipoflujoefectivoLogic.setIsConDeep(true);
		
		tipoflujoefectivosRespaldo=this.tipoflujoefectivoLogic.getTipoFlujoEfectivos();
		
		this.tipoflujoefectivoLogic.setTipoFlujoEfectivos(tipoflujoefectivosParaReportes);	
		this.tipoflujoefectivoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoflujoefectivosParaReportes=this.tipoflujoefectivoLogic.getTipoFlujoEfectivos();
		this.tipoflujoefectivoLogic.setTipoFlujoEfectivos(tipoflujoefectivosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoflujoefectivo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFlujoEfectivos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFlujoEfectivo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoFlujoEfectivo tipoflujoefectivo : tipoflujoefectivosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoFlujoEfectivo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoFlujoEfectivoConstantesFunciones.generarExcelReporteDataTipoFlujoEfectivo("NORMAL",row,workbook,tipoflujoefectivo,cellStyleDataAux);
		
			
			


				//CuentaContable
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuentaContableConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoflujoefectivo.getCuentaContables()!=null && tipoflujoefectivo.getCuentaContables().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuentaContableConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuentaContableConstantesFunciones.generarExcelReporteHeaderCuentaContable("RELACIONADO",row,workbook);
				}

				if(tipoflujoefectivo.getCuentaContables()!=null) {
					i2=0;
					for(CuentaContable cuentacontable : tipoflujoefectivo.getCuentaContables()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuentaContableConstantesFunciones.generarExcelReporteDataCuentaContable("RELACIONADO",row,workbook,cuentacontable,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoFlujoEfectivoConstantesFunciones.getTipoFlujoEfectivoDescripcion(tipoflujoefectivo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Flujo Efectivo ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoFlujoEfectivo() throws Exception {		
		this.startProcessTipoFlujoEfectivo(true);
	}
	
	public void startProcessTipoFlujoEfectivo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoFlujoEfectivo ,this.jPanelParametrosReportesTipoFlujoEfectivo, this.jScrollPanelDatosTipoFlujoEfectivo,this.jPanelPaginacionTipoFlujoEfectivo, this.jScrollPanelDatosEdicionTipoFlujoEfectivo, this.jPanelAccionesTipoFlujoEfectivo,this.jPanelAccionesFormularioTipoFlujoEfectivo,this.jmenuBarTipoFlujoEfectivo,this.jmenuBarDetalleTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,this.jTtoolBarDetalleTipoFlujoEfectivo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFlujoEfectivo=this.jTabbedPaneBusquedasTipoFlujoEfectivo; 
		
		final JPanel jPanelParametrosReportesTipoFlujoEfectivo=this.jPanelParametrosReportesTipoFlujoEfectivo;
		//final JScrollPane jScrollPanelDatosTipoFlujoEfectivo=this.jScrollPanelDatosTipoFlujoEfectivo;
		final JTable jTableDatosTipoFlujoEfectivo=this.jTableDatosTipoFlujoEfectivo;		
		final JPanel jPanelPaginacionTipoFlujoEfectivo=this.jPanelPaginacionTipoFlujoEfectivo;
		//final JScrollPane jScrollPanelDatosEdicionTipoFlujoEfectivo=this.jScrollPanelDatosEdicionTipoFlujoEfectivo;
		final JPanel jPanelAccionesTipoFlujoEfectivo=this.jPanelAccionesTipoFlujoEfectivo;
		
		JPanel jPanelCamposAuxiliarTipoFlujoEfectivo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoFlujoEfectivo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			jPanelCamposAuxiliarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jPanelCamposTipoFlujoEfectivo;
			jPanelAccionesFormularioAuxiliarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jPanelAccionesFormularioTipoFlujoEfectivo;
		}
		
		final JPanel jPanelCamposTipoFlujoEfectivo=jPanelCamposAuxiliarTipoFlujoEfectivo;
		final JPanel jPanelAccionesFormularioTipoFlujoEfectivo=jPanelAccionesFormularioAuxiliarTipoFlujoEfectivo;
		
		
		final JMenuBar jmenuBarTipoFlujoEfectivo=this.jmenuBarTipoFlujoEfectivo;
		final JToolBar jTtoolBarTipoFlujoEfectivo=this.jTtoolBarTipoFlujoEfectivo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoFlujoEfectivo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFlujoEfectivo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			jmenuBarDetalleAuxiliarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jmenuBarDetalleTipoFlujoEfectivo;
			jTtoolBarDetalleAuxiliarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTtoolBarDetalleTipoFlujoEfectivo;
		}
		
		final JMenuBar jmenuBarDetalleTipoFlujoEfectivo=jmenuBarDetalleAuxiliarTipoFlujoEfectivo;
		final JToolBar jTtoolBarDetalleTipoFlujoEfectivo=jTtoolBarDetalleAuxiliarTipoFlujoEfectivo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFlujoEfectivo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFlujoEfectivo;
			processRunnable.jTableDatos=jTableDatosTipoFlujoEfectivo;
			processRunnable.jPanelCampos=jPanelCamposTipoFlujoEfectivo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFlujoEfectivo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFlujoEfectivo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFlujoEfectivo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFlujoEfectivo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFlujoEfectivo;
			processRunnable.jTtoolBar=jTtoolBarTipoFlujoEfectivo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFlujoEfectivo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFlujoEfectivo ,jPanelParametrosReportesTipoFlujoEfectivo,jTableDatosTipoFlujoEfectivo, /*jScrollPanelDatosTipoFlujoEfectivo,*/jPanelCamposTipoFlujoEfectivo,jPanelPaginacionTipoFlujoEfectivo, /*jScrollPanelDatosEdicionTipoFlujoEfectivo,*/ jPanelAccionesTipoFlujoEfectivo,jPanelAccionesFormularioTipoFlujoEfectivo,jmenuBarTipoFlujoEfectivo,jmenuBarDetalleTipoFlujoEfectivo,jTtoolBarTipoFlujoEfectivo,jTtoolBarDetalleTipoFlujoEfectivo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFlujoEfectivo ,jPanelParametrosReportesTipoFlujoEfectivo, jScrollPanelDatosTipoFlujoEfectivo,jPanelPaginacionTipoFlujoEfectivo, jScrollPanelDatosEdicionTipoFlujoEfectivo, jPanelAccionesTipoFlujoEfectivo,jPanelAccionesFormularioTipoFlujoEfectivo,jmenuBarTipoFlujoEfectivo,jmenuBarDetalleTipoFlujoEfectivo,jTtoolBarTipoFlujoEfectivo,jTtoolBarDetalleTipoFlujoEfectivo);
						
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
	
	public void finishProcessTipoFlujoEfectivo() {// throws Exception 
		this.finishProcessTipoFlujoEfectivo(true);
	}
	
	public void finishProcessTipoFlujoEfectivo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoFlujoEfectivo ,this.jPanelParametrosReportesTipoFlujoEfectivo, this.jScrollPanelDatosTipoFlujoEfectivo,this.jPanelPaginacionTipoFlujoEfectivo, this.jScrollPanelDatosEdicionTipoFlujoEfectivo, this.jPanelAccionesTipoFlujoEfectivo,this.jPanelAccionesFormularioTipoFlujoEfectivo,this.jmenuBarTipoFlujoEfectivo,this.jmenuBarDetalleTipoFlujoEfectivo,this.jTtoolBarTipoFlujoEfectivo,this.jTtoolBarDetalleTipoFlujoEfectivo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFlujoEfectivo=this.jTabbedPaneBusquedasTipoFlujoEfectivo; 
		
		final JPanel jPanelParametrosReportesTipoFlujoEfectivo=this.jPanelParametrosReportesTipoFlujoEfectivo;
		//final JScrollPane jScrollPanelDatosTipoFlujoEfectivo=this.jScrollPanelDatosTipoFlujoEfectivo;
		final JTable jTableDatosTipoFlujoEfectivo=this.jTableDatosTipoFlujoEfectivo;		
		final JPanel jPanelPaginacionTipoFlujoEfectivo=this.jPanelPaginacionTipoFlujoEfectivo;
		//final JScrollPane jScrollPanelDatosEdicionTipoFlujoEfectivo=this.jScrollPanelDatosEdicionTipoFlujoEfectivo;
		final JPanel jPanelAccionesTipoFlujoEfectivo=this.jPanelAccionesTipoFlujoEfectivo;
		
		JPanel jPanelCamposAuxiliarTipoFlujoEfectivo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoFlujoEfectivo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			jPanelCamposAuxiliarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jPanelCamposTipoFlujoEfectivo;
			jPanelAccionesFormularioAuxiliarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jPanelAccionesFormularioTipoFlujoEfectivo;
		}
		
		final JPanel jPanelCamposTipoFlujoEfectivo=jPanelCamposAuxiliarTipoFlujoEfectivo;
		final JPanel jPanelAccionesFormularioTipoFlujoEfectivo=jPanelAccionesFormularioAuxiliarTipoFlujoEfectivo;
		
		
		final JMenuBar jmenuBarTipoFlujoEfectivo=this.jmenuBarTipoFlujoEfectivo;		
		final JToolBar jTtoolBarTipoFlujoEfectivo=this.jTtoolBarTipoFlujoEfectivo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoFlujoEfectivo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFlujoEfectivo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			jmenuBarDetalleAuxiliarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jmenuBarDetalleTipoFlujoEfectivo;
			jTtoolBarDetalleAuxiliarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTtoolBarDetalleTipoFlujoEfectivo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoFlujoEfectivo=jmenuBarDetalleAuxiliarTipoFlujoEfectivo;
		final JToolBar jTtoolBarDetalleTipoFlujoEfectivo=jTtoolBarDetalleAuxiliarTipoFlujoEfectivo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFlujoEfectivo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFlujoEfectivo;
			processRunnable.jTableDatos=jTableDatosTipoFlujoEfectivo;
			processRunnable.jPanelCampos=jPanelCamposTipoFlujoEfectivo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFlujoEfectivo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFlujoEfectivo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFlujoEfectivo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFlujoEfectivo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFlujoEfectivo;
			processRunnable.jTtoolBar=jTtoolBarTipoFlujoEfectivo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFlujoEfectivo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoFlujoEfectivo ,jPanelParametrosReportesTipoFlujoEfectivo, jTableDatosTipoFlujoEfectivo,/*jScrollPanelDatosTipoFlujoEfectivo,*/jPanelCamposTipoFlujoEfectivo,jPanelPaginacionTipoFlujoEfectivo, /*jScrollPanelDatosEdicionTipoFlujoEfectivo,*/ jPanelAccionesTipoFlujoEfectivo,jPanelAccionesFormularioTipoFlujoEfectivo,jmenuBarTipoFlujoEfectivo,jmenuBarDetalleTipoFlujoEfectivo,jTtoolBarTipoFlujoEfectivo,jTtoolBarDetalleTipoFlujoEfectivo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoFlujoEfectivo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoFlujoEfectivo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoFlujoEfectivo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoFlujoEfectivo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoFlujoEfectivo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoFlujoEfectivo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoFlujoEfectivo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoFlujoEfectivo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoFlujoEfectivo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoflujoefectivoConstantesFunciones.getsFinalQueryTipoFlujoEfectivo();
		String  finalQueryPaginacionTodos=this.tipoflujoefectivoConstantesFunciones.getsFinalQueryTipoFlujoEfectivo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoFlujoEfectivoConstantesFunciones.getArrayColumnasGlobalesNoTipoFlujoEfectivo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoFlujoEfectivoConstantesFunciones.getArrayColumnasGlobalesTipoFlujoEfectivo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoFlujoEfectivoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoflujoefectivosEliminados= new ArrayList<TipoFlujoEfectivo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoFlujoEfectivo();
		
				///*TipoFlujoEfectivoSessionBean*/this.tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
			
			if(this.tipoflujoefectivoSessionBean==null) {
				this.tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
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
					this.iNumeroPaginacion=TipoFlujoEfectivoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoFlujoEfectivoConstantesFunciones.getClassesForeignKeysOfTipoFlujoEfectivo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoflujoefectivo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoflujoefectivosAux= new ArrayList<TipoFlujoEfectivo>();
			
				
			tipoflujoefectivoLogic.setDatosCliente(this.datosCliente);
			tipoflujoefectivoLogic.setDatosDeep(this.datosDeep);
			tipoflujoefectivoLogic.setIsConDeep(true);
			
			
			tipoflujoefectivoLogic.getTipoFlujoEfectivoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoflujoefectivoLogic.getTodosTipoFlujoEfectivos(finalQueryGlobal,pagination);
					
					//tipoflujoefectivoLogic.getTodosTipoFlujoEfectivosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoflujoefectivoLogic.getTipoFlujoEfectivos()==null|| tipoflujoefectivoLogic.getTipoFlujoEfectivos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoflujoefectivosAux= new ArrayList<TipoFlujoEfectivo>();
							tipoflujoefectivosAux.addAll(tipoflujoefectivoLogic.getTipoFlujoEfectivos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoflujoefectivosAux= new ArrayList<TipoFlujoEfectivo>();
							tipoflujoefectivosAux.addAll(tipoflujoefectivos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoflujoefectivoLogic.getTodosTipoFlujoEfectivos(finalQueryGlobal+"",this.pagination);												
							
							//tipoflujoefectivoLogic.getTodosTipoFlujoEfectivosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoFlujoEfectivos("Todos",tipoflujoefectivoLogic.getTipoFlujoEfectivos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoflujoefectivoLogic.setTipoFlujoEfectivos(new ArrayList<TipoFlujoEfectivo>());					
							tipoflujoefectivoLogic.getTipoFlujoEfectivos().addAll(tipoflujoefectivosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoflujoefectivos=new ArrayList<TipoFlujoEfectivo>();
							tipoflujoefectivos.addAll(tipoflujoefectivosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoFlujoEfectivo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoFlujoEfectivo=this.idActual;
				
				} else if(this.idTipoFlujoEfectivoActual!=null && this.idTipoFlujoEfectivoActual!=0L) {
					idTipoFlujoEfectivo=idTipoFlujoEfectivoActual;
				}
				
					
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndicePorId(idTipoFlujoEfectivo);
				
				this.tipoflujoefectivos=new ArrayList<TipoFlujoEfectivo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoflujoefectivoLogic.getEntity(idTipoFlujoEfectivo);
					
					//tipoflujoefectivoLogic.getEntityWithConnection(idTipoFlujoEfectivo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoflujoefectivoLogic.setTipoFlujoEfectivos(new ArrayList<TipoFlujoEfectivo>());
					tipoflujoefectivoLogic.getTipoFlujoEfectivos().add(tipoflujoefectivoLogic.getTipoFlujoEfectivo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoflujoefectivos=new ArrayList<TipoFlujoEfectivo>();
					this.tipoflujoefectivos.add(tipoflujoefectivo);
				}
				
				if(tipoflujoefectivoLogic.getTipoFlujoEfectivo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoflujoefectivoLogic.getTipoFlujoEfectivosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoflujoefectivoLogic.getTipoFlujoEfectivos()==null||tipoflujoefectivoLogic.getTipoFlujoEfectivos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoflujoefectivos==null|| tipoflujoefectivos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoflujoefectivosAux=new ArrayList<TipoFlujoEfectivo>();
						tipoflujoefectivosAux.addAll(tipoflujoefectivoLogic.getTipoFlujoEfectivos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoflujoefectivosAux=new ArrayList<TipoFlujoEfectivo>();
							tipoflujoefectivosAux.addAll(tipoflujoefectivos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoflujoefectivoLogic.getTipoFlujoEfectivosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoFlujoEfectivos("BusquedaPorNombre",tipoflujoefectivoLogic.getTipoFlujoEfectivos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoFlujoEfectivos("BusquedaPorNombre",tipoflujoefectivos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoflujoefectivoLogic.setTipoFlujoEfectivos(new ArrayList<TipoFlujoEfectivo>());
						tipoflujoefectivoLogic.getTipoFlujoEfectivos().addAll(tipoflujoefectivosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoflujoefectivos=new ArrayList<TipoFlujoEfectivo>();
							tipoflujoefectivos.addAll(tipoflujoefectivosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoflujoefectivoLogic.getTipoFlujoEfectivosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoflujoefectivoLogic.getTipoFlujoEfectivos()==null||tipoflujoefectivoLogic.getTipoFlujoEfectivos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoflujoefectivos==null|| tipoflujoefectivos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoflujoefectivosAux=new ArrayList<TipoFlujoEfectivo>();
						tipoflujoefectivosAux.addAll(tipoflujoefectivoLogic.getTipoFlujoEfectivos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoflujoefectivosAux=new ArrayList<TipoFlujoEfectivo>();
							tipoflujoefectivosAux.addAll(tipoflujoefectivos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoflujoefectivoLogic.getTipoFlujoEfectivosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFlujoEfectivoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoFlujoEfectivos("FK_IdEmpresa",tipoflujoefectivoLogic.getTipoFlujoEfectivos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoFlujoEfectivos("FK_IdEmpresa",tipoflujoefectivos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoflujoefectivoLogic.setTipoFlujoEfectivos(new ArrayList<TipoFlujoEfectivo>());
						tipoflujoefectivoLogic.getTipoFlujoEfectivos().addAll(tipoflujoefectivosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoflujoefectivos=new ArrayList<TipoFlujoEfectivo>();
							tipoflujoefectivos.addAll(tipoflujoefectivosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoFlujoEfectivo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoFlujoEfectivo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoflujoefectivoLogic.getTipoFlujoEfectivos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoflujoefectivos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoflujoefectivoLogic.getTipoFlujoEfectivos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoflujoefectivos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoFlujoEfectivo tipoflujoefectivo) {
		Boolean permite=true;
		
		if(this.tipoflujoefectivo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoFlujoEfectivoConstantesFunciones.getOrderByListaTipoFlujoEfectivo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoFlujoEfectivoConstantesFunciones.getOrderByListaTipoFlujoEfectivo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFlujoEfectivo tipoflujoefectivo:tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
				if(tipoflujoefectivo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoflujoefectivoTotales=tipoflujoefectivo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFlujoEfectivo tipoflujoefectivo:this.tipoflujoefectivos) {
				if(tipoflujoefectivo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoflujoefectivoTotales=tipoflujoefectivo;
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
			this.tipoflujoefectivoAux=new TipoFlujoEfectivo();
			this.tipoflujoefectivoAux.setsType(Constantes2.S_TOTALES);
			this.tipoflujoefectivoAux.setIsNew(false);
			this.tipoflujoefectivoAux.setIsChanged(false);
			this.tipoflujoefectivoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoFlujoEfectivoConstantesFunciones.TotalizarValoresFilaTipoFlujoEfectivo(this.tipoflujoefectivoLogic.getTipoFlujoEfectivos(),this.tipoflujoefectivoAux);
				
				this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().add(this.tipoflujoefectivoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoFlujoEfectivoConstantesFunciones.TotalizarValoresFilaTipoFlujoEfectivo(this.tipoflujoefectivos,this.tipoflujoefectivoAux);
				
				this.tipoflujoefectivos.add(this.tipoflujoefectivoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoflujoefectivoTotales=new TipoFlujoEfectivo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().remove(tipoflujoefectivoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoflujoefectivos.remove(tipoflujoefectivoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoflujoefectivoTotales=new TipoFlujoEfectivo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFlujoEfectivo tipoflujoefectivo:tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
				if(tipoflujoefectivo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoflujoefectivoTotales=tipoflujoefectivo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFlujoEfectivoConstantesFunciones.TotalizarValoresFilaTipoFlujoEfectivo(this.tipoflujoefectivoLogic.getTipoFlujoEfectivos(),tipoflujoefectivoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFlujoEfectivo tipoflujoefectivo:this.tipoflujoefectivos) {
				if(tipoflujoefectivo.getsType().equals(Constantes2.S_TOTALES)) {
					tipoflujoefectivoTotales=tipoflujoefectivo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFlujoEfectivoConstantesFunciones.TotalizarValoresFilaTipoFlujoEfectivo(this.tipoflujoefectivos,tipoflujoefectivoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoFlujoEfectivosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoFlujoEfectivosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoFlujoEfectivoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoFlujoEfectivosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoflujoefectivoLogic.getTipoFlujoEfectivosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoFlujoEfectivosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoflujoefectivoLogic.getTipoFlujoEfectivosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoFlujoEfectivoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoflujoefectivoLogic.getTipoFlujoEfectivoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoFlujoEfectivo() {
		this.isPermisoTodoTipoFlujoEfectivo=false;
		this.isPermisoNuevoTipoFlujoEfectivo=false;
		this.isPermisoActualizarTipoFlujoEfectivo=false;
		this.isPermisoActualizarOriginalTipoFlujoEfectivo=false;
		this.isPermisoEliminarTipoFlujoEfectivo=false;
		this.isPermisoGuardarCambiosTipoFlujoEfectivo=false;
		this.isPermisoConsultaTipoFlujoEfectivo=false;
		this.isPermisoBusquedaTipoFlujoEfectivo=false;
		this.isPermisoReporteTipoFlujoEfectivo=false;		
		this.isPermisoOrdenTipoFlujoEfectivo=false;		
		this.isPermisoPaginacionMedioTipoFlujoEfectivo=false;		
		this.isPermisoPaginacionAltoTipoFlujoEfectivo=false;
		this.isPermisoPaginacionTodoTipoFlujoEfectivo=false;
		this.isPermisoCopiarTipoFlujoEfectivo=false;		
		this.isPermisoVerFormTipoFlujoEfectivo=false;		
		this.isPermisoDuplicarTipoFlujoEfectivo=false;		
		this.isPermisoOrdenTipoFlujoEfectivo=false;		
	}
	
	public void setPermisosUsuarioTipoFlujoEfectivo(Boolean isPermiso) {
		this.isPermisoTodoTipoFlujoEfectivo=isPermiso;
		this.isPermisoNuevoTipoFlujoEfectivo=isPermiso;
		this.isPermisoActualizarTipoFlujoEfectivo=isPermiso;
		this.isPermisoActualizarOriginalTipoFlujoEfectivo=isPermiso;
		this.isPermisoEliminarTipoFlujoEfectivo=isPermiso;
		this.isPermisoGuardarCambiosTipoFlujoEfectivo=isPermiso;
		this.isPermisoConsultaTipoFlujoEfectivo=isPermiso;
		this.isPermisoBusquedaTipoFlujoEfectivo=isPermiso;
		this.isPermisoReporteTipoFlujoEfectivo=isPermiso;
		this.isPermisoOrdenTipoFlujoEfectivo=isPermiso;		
		this.isPermisoPaginacionMedioTipoFlujoEfectivo=isPermiso;		
		this.isPermisoPaginacionAltoTipoFlujoEfectivo=isPermiso;		
		this.isPermisoPaginacionTodoTipoFlujoEfectivo=isPermiso;		
		this.isPermisoCopiarTipoFlujoEfectivo=isPermiso;		
		this.isPermisoVerFormTipoFlujoEfectivo=isPermiso;		
		this.isPermisoDuplicarTipoFlujoEfectivo=isPermiso;
		this.isPermisoOrdenTipoFlujoEfectivo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoFlujoEfectivo(Boolean isPermiso) {
		//this.isPermisoTodoTipoFlujoEfectivo=isPermiso;
		this.isPermisoNuevoTipoFlujoEfectivo=isPermiso;
		this.isPermisoActualizarTipoFlujoEfectivo=isPermiso;
		this.isPermisoActualizarOriginalTipoFlujoEfectivo=isPermiso;
		this.isPermisoEliminarTipoFlujoEfectivo=isPermiso;
		this.isPermisoGuardarCambiosTipoFlujoEfectivo=isPermiso;
		//this.isPermisoConsultaTipoFlujoEfectivo=isPermiso;
		//this.isPermisoBusquedaTipoFlujoEfectivo=isPermiso;
		//this.isPermisoReporteTipoFlujoEfectivo=isPermiso;
		//this.isPermisoOrdenTipoFlujoEfectivo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoFlujoEfectivo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoFlujoEfectivo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoFlujoEfectivo=isPermiso;		
		//this.isPermisoCopiarTipoFlujoEfectivo=isPermiso;		
		//this.isPermisoDuplicarTipoFlujoEfectivo=isPermiso;
		//this.isPermisoOrdenTipoFlujoEfectivo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoFlujoEfectivoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CuentaContableConstantesFunciones.SNOMBREOPCION);
		
		if(TipoFlujoEfectivoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCuentaContable=false;
		this.isTienePermisosCuentaContable=this.verificarGetPermisosUsuarioOpcionTipoFlujoEfectivoClaseRelacionada(this.opcionsRelacionadas,CuentaContableConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoFlujoEfectivo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoFlujoEfectivoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCuentaContable=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoFlujoEfectivoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoFlujoEfectivoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoFlujoEfectivoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCuentaContable && this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTabbedPaneRelacionesTipoFlujoEfectivo.remove(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoFlujoEfectivo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoFlujoEfectivoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoFlujoEfectivoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoFlujoEfectivo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoFlujoEfectivo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoFlujoEfectivo=this.isPermisoActualizarTipoFlujoEfectivo;
			this.isPermisoEliminarTipoFlujoEfectivo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoFlujoEfectivo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoFlujoEfectivo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoFlujoEfectivo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoFlujoEfectivo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoFlujoEfectivo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFlujoEfectivo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoFlujoEfectivo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoFlujoEfectivo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoFlujoEfectivo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoFlujoEfectivo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoFlujoEfectivo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoFlujoEfectivo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFlujoEfectivo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoFlujoEfectivo.setToolTipText(this.jTableDatosTipoFlujoEfectivo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoFlujoEfectivo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoFlujoEfectivo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoFlujoEfectivoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoFlujoEfectivoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoFlujoEfectivo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCuentaContable && this.tipoflujoefectivoConstantesFunciones.mostrarCuentaContableTipoFlujoEfectivo && !TipoFlujoEfectivoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuenta Contable");
			reporte.setsDescripcion("Cuenta Contable");
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
	public void inicializarCombosForeignKeyTipoFlujoEfectivoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoFlujoEfectivoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoFlujoEfectivoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoFlujoEfectivoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoFlujoEfectivoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoFlujoEfectivoParameterReturnGeneral tipoflujoefectivoReturnGeneral=new TipoFlujoEfectivoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoflujoefectivoConstantesFunciones.cargarid_empresaTipoFlujoEfectivo)
					 || (this.esRecargarFks && this.tipoflujoefectivoConstantesFunciones.cargarid_empresaTipoFlujoEfectivo)) {

					if(!this.tipoflujoefectivoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoflujoefectivoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoflujoefectivoReturnGeneral=tipoflujoefectivoLogic.cargarCombosLoteForeignKeyTipoFlujoEfectivo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoflujoefectivoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoFlujoEfectivo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoflujoefectivoSessionBean==null) {
				this.tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
			}

			if(!this.tipoflujoefectivoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoFlujoEfectivo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoFlujoEfectivo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoFlujoEfectivo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFlujoEfectivo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoFlujoEfectivo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFlujoEfectivo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoFlujoEfectivo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoFlujoEfectivo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoFlujoEfectivo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoFlujoEfectivo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoFlujoEfectivo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoFlujoEfectivo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoFlujoEfectivoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoFlujoEfectivoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoFlujoEfectivoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean(); 
		this.tipoflujoefectivoConstantesFunciones=new TipoFlujoEfectivoConstantesFunciones(); 
		this.tipoflujoefectivoBean=new TipoFlujoEfectivo();//(this.tipoflujoefectivoConstantesFunciones); 		
		this.tipoflujoefectivoReturnGeneral=new TipoFlujoEfectivoParameterReturnGeneral(); 
		
		this.tipoflujoefectivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoflujoefectivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoFlujoEfectivoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoFlujoEfectivoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoFlujoEfectivoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoFlujoEfectivo(true);
			
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
			
			this.tipoflujoefectivoConstantesFunciones=new TipoFlujoEfectivoConstantesFunciones(); 
			this.tipoflujoefectivoBean=new TipoFlujoEfectivo();//this.tipoflujoefectivoConstantesFunciones); 			
			this.tipoflujoefectivoReturnGeneral=new TipoFlujoEfectivoParameterReturnGeneral(); 
		
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Flujo Efectivo  Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoflujoefectivo=new TipoFlujoEfectivo();
			this.tipoflujoefectivos = new ArrayList<TipoFlujoEfectivo>();
			this.tipoflujoefectivosAux = new ArrayList<TipoFlujoEfectivo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic=new TipoFlujoEfectivoLogic();
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoflujoefectivoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoflujoefectivoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoFlujoEfectivo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFlujoEfectivo);	
					}
					
					if(this.jInternalFrameImportacionTipoFlujoEfectivo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFlujoEfectivo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoFlujoEfectivo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoFlujoEfectivo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFlujoEfectivo);
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.setVisible(false);
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo);
					this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoFlujoEfectivo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoFlujoEfectivo);
					this.jInternalFrameImportacionTipoFlujoEfectivo.setVisible(false);
					this.jInternalFrameImportacionTipoFlujoEfectivo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoFlujoEfectivo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoFlujoEfectivo);
					this.jInternalFrameOrderByTipoFlujoEfectivo.setVisible(false);
					this.jInternalFrameOrderByTipoFlujoEfectivo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoFlujoEfectivoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoFlujoEfectivoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoflujoefectivoReturnGeneral=new TipoFlujoEfectivoParameterReturnGeneral();
			
			this.tipoflujoefectivoParameterGeneral=new TipoFlujoEfectivoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoflujoefectivoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoFlujoEfectivoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CuentaContableConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFlujoEfectivoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado(),this.tipoflujoefectivoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFlujoEfectivoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado(),this.tipoflujoefectivoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaDuplicarTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaCopiarTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaVerFormTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaOrdenTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaModificarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoFlujoEfectivo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoFlujoEfectivo(false);
			
			this.setPermisosUsuarioTipoFlujoEfectivo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado() && this.tipoflujoefectivoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoFlujoEfectivoClasesRelacionadas();
			}
			
			if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoFlujoEfectivoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoFlujoEfectivo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoFlujoEfectivo();
			}
			
			if(!this.isPermisoBusquedaTipoFlujoEfectivo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoFlujoEfectivo,this.isPermisoPaginacionMedioTipoFlujoEfectivo,this.isPermisoPaginacionTodoTipoFlujoEfectivo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoFlujoEfectivoConstantesFunciones.getTiposSeleccionarTipoFlujoEfectivo());
				
				this.tiposColumnasSelect=TipoFlujoEfectivoConstantesFunciones.getTiposSeleccionarTipoFlujoEfectivo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoFlujoEfectivo();				
				//this.tiposRelacionesSelect=TipoFlujoEfectivoConstantesFunciones.getTiposRelacionesTipoFlujoEfectivo(true);
				
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
			//if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoFlujoEfectivo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoFlujoEfectivo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoFlujoEfectivo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFlujoEfectivo() ;
			
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
			
			
			this.cuentacontableLogic=new CuentaContableLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoflujoefectivoImplementable= (TipoFlujoEfectivoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFlujoEfectivoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoflujoefectivoImplementableHome= (TipoFlujoEfectivoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFlujoEfectivoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoflujoefectivos= new ArrayList<TipoFlujoEfectivo>();
			this.tipoflujoefectivosEliminados= new ArrayList<TipoFlujoEfectivo>();
						
			this.isEsNuevoTipoFlujoEfectivo=false;
			this.esParaAccionDesdeFormularioTipoFlujoEfectivo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoFlujoEfectivo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoFlujoEfectivo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoFlujoEfectivoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoFlujoEfectivo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoFlujoEfectivo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoFlujoEfectivo();
			}
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoFlujoEfectivo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoFlujoEfectivo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoFlujoEfectivo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoFlujoEfectivo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoFlujoEfectivo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoFlujoEfectivo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoFlujoEfectivo")) {
				iIndex=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTabbedPaneRelacionesTipoFlujoEfectivo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTabbedPaneRelacionesTipoFlujoEfectivo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();	
				
				

				if(sTitle.equals("Cuenta Contables")) {
					if(!CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoFlujoEfectivo();

						this.cargarParteTabPanelRelacionadaCuentaContable(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoFlujoEfectivo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCuentaContable(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.cargarSessionConBeanSwingJInternalFrameCuentaContable(false,true,iIndex);
		this.jButtonCuentaContableActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuentaContable();

		//this.jTabbedPaneRelacionesTipoFlujoEfectivo.updateUI();
		//this.jTabbedPaneRelacionesTipoFlujoEfectivo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoFlujoEfectivo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CuentaContable")) {
				int row=this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
				jButtonCuentaContableActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cuenta Contable")) {

					if(this.isTienePermisosCuentaContable && this.tipoflujoefectivoConstantesFunciones.mostrarCuentaContableTipoFlujoEfectivo && !TipoFlujoEfectivoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuenta Contables"+"("+CuentaContableConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuenta Contables");

						if(tipoflujoefectivoConstantesFunciones.resaltarCuentaContableTipoFlujoEfectivo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoflujoefectivoConstantesFunciones.resaltarCuentaContableTipoFlujoEfectivo);
						}

						jmenuItem.setEnabled(this.tipoflujoefectivoConstantesFunciones.activarCuentaContableTipoFlujoEfectivo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CuentaContable"));

						

						this.jInternalFrameDetalleFormTipoFlujoEfectivo.jmenuDetalleTipoFlujoEfectivo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoFlujoEfectivo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoFlujoEfectivo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoFlujoEfectivo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoFlujoEfectivoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoFlujoEfectivo();
		
		this.cargarCombosFrameForeignKeyTipoFlujoEfectivo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoFlujoEfectivo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoFlujoEfectivo();
		}
	}
	
	
	
	public void jButtonNuevoTipoFlujoEfectivoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
			
			if(jTableDatosTipoFlujoEfectivo.getRowCount()>=1) {
				jTableDatosTipoFlujoEfectivo.removeRowSelectionInterval(0, jTableDatosTipoFlujoEfectivo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoFlujoEfectivo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoFlujoEfectivo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoFlujoEfectivo(true);			
			//this.tipoflujoefectivo=new TipoFlujoEfectivo();
			//this.tipoflujoefectivo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFlujoEfectivo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFlujoEfectivo() ;
			
			if(TipoFlujoEfectivoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFlujoEfectivo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoflujoefectivo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);				
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
			if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoFlujoEfectivo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoFlujoEfectivoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoFlujoEfectivo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoFlujoEfectivo.getSelectedRows().length;			
			}
			
			tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoFlujoEfectivo--;			
				//TipoFlujoEfectivo tipoflujoefectivoAux= new TipoFlujoEfectivo();			
				//tipoflujoefectivoAux.setId(this.iIdNuevoTipoFlujoEfectivo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoFlujoEfectivo tipoflujoefectivoOrigen=new TipoFlujoEfectivo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoFlujoEfectivo tipoflujoefectivoOrigen : tipoflujoefectivosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoflujoefectivoOrigen =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoflujoefectivoOrigen =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoFlujoEfectivo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoflujoefectivo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoFlujoEfectivo(tipoflujoefectivoOrigen,this.tipoflujoefectivo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().add(this.tipoflujoefectivoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoflujoefectivos.add(this.tipoflujoefectivoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
				
				this.jTableDatosTipoFlujoEfectivo.setRowSelectionInterval(this.getIndiceNuevoTipoFlujoEfectivo(), this.getIndiceNuevoTipoFlujoEfectivo());
				
				int iLastRow =  this.jTableDatosTipoFlujoEfectivo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFlujoEfectivo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFlujoEfectivo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();									
		
			TipoFlujoEfectivo tipoflujoefectivoOrigen=new TipoFlujoEfectivo();
			TipoFlujoEfectivo tipoflujoefectivoDestino=new TipoFlujoEfectivo();
				
			tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoFlujoEfectivo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoflujoefectivosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoFlujoEfectivo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoflujoefectivoOrigen =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoflujoefectivoOrigen =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoflujoefectivoDestino =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoflujoefectivoDestino =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoflujoefectivoOrigen =tipoflujoefectivosSeleccionados.get(0);
				tipoflujoefectivoDestino =tipoflujoefectivosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoFlujoEfectivo(tipoflujoefectivoOrigen,tipoflujoefectivoDestino,true,false);
				
				tipoflujoefectivoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoflujoefectivoDestino,tipoflujoefectivoLogic.getTipoFlujoEfectivos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoflujoefectivoDestino,tipoflujoefectivos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
				
				//this.jTableDatosTipoFlujoEfectivo.setRowSelectionInterval(this.getIndiceNuevoTipoFlujoEfectivo(), this.getIndiceNuevoTipoFlujoEfectivo());
				
				int iLastRow =  this.jTableDatosTipoFlujoEfectivo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFlujoEfectivo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFlujoEfectivo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoFlujoEfectivo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoFlujoEfectivo.setVisible(!isVisible);
			this.jPanelPaginacionTipoFlujoEfectivo.setVisible(!isVisible);
			this.jPanelAccionesTipoFlujoEfectivo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoFlujoEfectivo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoFlujoEfectivo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoFlujoEfectivo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoFlujoEfectivo();
			
			this.abrirFrameOrderByTipoFlujoEfectivo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoFlujoEfectivo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoFlujoEfectivo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFlujoEfectivo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoFlujoEfectivo.setSize(this.jInternalFrameDetalleFormTipoFlujoEfectivo.iWidthFormulario,this.jInternalFrameDetalleFormTipoFlujoEfectivo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoFlujoEfectivo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoFlujoEfectivo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoFlujoEfectivo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoFlujoEfectivo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.jContentPaneDetalleTipoFlujoEfectivo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTabbedPaneRelacionesTipoFlujoEfectivo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoFlujoEfectivo.jContentPaneDetalleTipoFlujoEfectivo.getWidth(),TipoFlujoEfectivoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTabbedPaneRelacionesTipoFlujoEfectivo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoFlujoEfectivo.jContentPaneDetalleTipoFlujoEfectivo.getWidth(),TipoFlujoEfectivoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTabbedPaneRelacionesTipoFlujoEfectivo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoFlujoEfectivo.jContentPaneDetalleTipoFlujoEfectivo.getWidth(),TipoFlujoEfectivoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuentaContable();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoFlujoEfectivo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoFlujoEfectivo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoFlujoEfectivo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoFlujoEfectivo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoFlujoEfectivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFlujoEfectivo,false,this);
				} else {
					this.jInternalFrameOrderByTipoFlujoEfectivo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFlujoEfectivo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoFlujoEfectivo);
				this.jInternalFrameOrderByTipoFlujoEfectivo.setVisible(false);
				this.jInternalFrameOrderByTipoFlujoEfectivo.setSelected(false);
				
				this.jInternalFrameOrderByTipoFlujoEfectivo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFlujoEfectivo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoFlujoEfectivo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoFlujoEfectivo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoFlujoEfectivo==null) {
				
				this.jInternalFrameImportacionTipoFlujoEfectivo=new ImportacionJInternalFrame(TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFlujoEfectivo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoFlujoEfectivo);
				this.jInternalFrameImportacionTipoFlujoEfectivo.setVisible(false);
				this.jInternalFrameImportacionTipoFlujoEfectivo.setSelected(false);


				this.jInternalFrameImportacionTipoFlujoEfectivo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFlujoEfectivo"));
				this.jInternalFrameImportacionTipoFlujoEfectivo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFlujoEfectivo"));
				this.jInternalFrameImportacionTipoFlujoEfectivo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFlujoEfectivo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoFlujoEfectivo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo==null) {
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo=new ReporteDinamicoJInternalFrame(TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFlujoEfectivo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo);
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFlujoEfectivo"));
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFlujoEfectivo"));
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFlujoEfectivo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFlujoEfectivo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCuentaContable() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoFlujoEfectivo.jContentPaneDetalleTipoFlujoEfectivo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoFlujoEfectivo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFlujoEfectivo);
			
	       	this.jInternalFrameDetalleFormTipoFlujoEfectivo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoFlujoEfectivo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoFlujoEfectivo.dispose();
			//this.jInternalFrameDetalleFormTipoFlujoEfectivo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoFlujoEfectivo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoFlujoEfectivo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoFlujoEfectivo.setVisible(true);
	        this.jInternalFrameImportacionTipoFlujoEfectivo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoFlujoEfectivo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoFlujoEfectivo.setVisible(true);
	        this.jInternalFrameOrderByTipoFlujoEfectivo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoFlujoEfectivo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoFlujoEfectivo.setVisible(false);
	        this.jInternalFrameOrderByTipoFlujoEfectivo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoFlujoEfectivo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoFlujoEfectivo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoFlujoEfectivo.setVisible(false);
	        this.jInternalFrameImportacionTipoFlujoEfectivo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoFlujoEfectivo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoFlujoEfectivo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoFlujoEfectivo(true);
			//this.isEsNuevoTipoFlujoEfectivo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFlujoEfectivo(false) ;
			
			if(tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.getEsGuardarRelacionado() && CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContableActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoFlujoEfectivoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFlujoEfectivo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFlujoEfectivo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoFlujoEfectivoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoFlujoEfectivo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoFlujoEfectivo(true);
			//this.isEsNuevoTipoFlujoEfectivo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoflujoefectivo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoFlujoEfectivo(false) ;
			
			if(TipoFlujoEfectivoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFlujoEfectivo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFlujoEfectivo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoFlujoEfectivo(false);
			
			//if(!this.isEsNuevoTipoFlujoEfectivo) {								
				int intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
				
			}
			
			if(this.permiteMantenimiento(this.tipoflujoefectivo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoFlujoEfectivo=true;
					this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
					this.isEsNuevoTipoFlujoEfectivo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoFlujoEfectivo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoFlujoEfectivo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFlujoEfectivo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFlujoEfectivo(false);
				
				this.habilitarDeshabilitarControlesTipoFlujoEfectivo(false);
			
												
				
				if(TipoFlujoEfectivoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoFlujoEfectivo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,tipoflujoefectivoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoFlujoEfectivo(this.tipoflujoefectivo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoFlujoEfectivo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoflujoefectivoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoflujoefectivo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				this.tipoflujoefectivo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				this.tipoflujoefectivo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoflujoefectivo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoFlujoEfectivoModel) this.jTableDatosTipoFlujoEfectivo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoFlujoEfectivo=true;
				this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
				this.isEsNuevoTipoFlujoEfectivo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFlujoEfectivo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFlujoEfectivo(false);
				
				this.habilitarDeshabilitarControlesTipoFlujoEfectivo(false);
				
				
				
				if(TipoFlujoEfectivoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoFlujoEfectivo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoFlujoEfectivo.getRowCount()>=1) {
				jTableDatosTipoFlujoEfectivo.removeRowSelectionInterval(0, jTableDatosTipoFlujoEfectivo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoFlujoEfectivo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFlujoEfectivo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFlujoEfectivo(false) ;
			
			this.isEsNuevoTipoFlujoEfectivo=false;
			
			if(TipoFlujoEfectivoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoFlujoEfectivo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoFlujoEfectivo(false);
				
				//SI ES MANUAL
				if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoFlujoEfectivo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoFlujoEfectivo--;			
			//TipoFlujoEfectivo tipoflujoefectivoAux= new TipoFlujoEfectivo();			
			//tipoflujoefectivoAux.setId(this.iIdNuevoTipoFlujoEfectivo);
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoFlujoEfectivo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
			
			this.tipoflujoefectivo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().add(this.tipoflujoefectivoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoflujoefectivos.add(this.tipoflujoefectivoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
			
			this.jTableDatosTipoFlujoEfectivo.setRowSelectionInterval(this.getIndiceNuevoTipoFlujoEfectivo(), this.getIndiceNuevoTipoFlujoEfectivo());
			
			int iLastRow =  this.jTableDatosTipoFlujoEfectivo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoFlujoEfectivo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoFlujoEfectivo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFlujoEfectivo(false);
			
			//SI ES MANUAL
			if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFlujoEfectivo();
			}
			
			//this.abrirFrameTreeTipoFlujoEfectivo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Flujo Efectivo S ?", "MANTENIMIENTO DE Tipo Flujo Efectivo ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoFlujoEfectivo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoFlujoEfectivo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoflujoefectivoReturnGeneral=tipoflujoefectivoLogic.procesarImportacionTipoFlujoEfectivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoflujoefectivoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoFlujoEfectivoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoFlujoEfectivo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoFlujoEfectivo.setFileImportacion(this.jInternalFrameImportacionTipoFlujoEfectivo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoFlujoEfectivo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoFlujoEfectivo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoFlujoEfectivo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoFlujoEfectivo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();		

		tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoFlujoEfectivoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoFlujoEfectivoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoFlujoEfectivos("Todos",tipoflujoefectivosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Flujo Efectivo ",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();		
		
		tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoflujoefectivo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoFlujoEfectivos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoFlujoEfectivo tipoflujoefectivo:tipoflujoefectivosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoflujoefectivo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoFlujoEfectivo tipoflujoefectivo:tipoflujoefectivosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoflujoefectivo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoFlujoEfectivo(row);				
			//	iRow++;
			//}				
			
			//for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoFlujoEfectivo(tipoflujoefectivoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Flujo Efectivo ",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFlujoEfectivo(false);
			
			//SI ES MANUAL
			if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFlujoEfectivo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFlujoEfectivo(false);
			
			//SI ES MANUAL
			if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFlujoEfectivo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFlujoEfectivo(false);
			
			//SI ES MANUAL
			if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFlujoEfectivo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoFlujoEfectivo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoFlujoEfectivo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoFlujoEfectivo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoFlujoEfectivo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoFlujoEfectivo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoFlujoEfectivo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoFlujoEfectivo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoFlujoEfectivo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoFlujoEfectivo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoFlujoEfectivo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoFlujoEfectivo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoFlujoEfectivo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoFlujoEfectivo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoFlujoEfectivo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFlujoEfectivo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoFlujoEfectivo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoFlujoEfectivo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoFlujoEfectivo();
		
		this.inicializarActualizarBindingBotonesManualTipoFlujoEfectivo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFlujoEfectivo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFlujoEfectivo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFlujoEfectivo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFlujoEfectivo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoFlujoEfectivo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoFlujoEfectivo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jCheckBoxPostAccionNuevoTipoFlujoEfectivo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jCheckBoxPostAccionSinCerrarTipoFlujoEfectivo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jCheckBoxPostAccionSinMensajeTipoFlujoEfectivo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoFlujoEfectivo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoFlujoEfectivo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.jCheckBoxPostAccionNuevoTipoFlujoEfectivo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.jCheckBoxPostAccionSinCerrarTipoFlujoEfectivo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.jCheckBoxPostAccionSinMensajeTipoFlujoEfectivo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoFlujoEfectivo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoFlujoEfectivo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoFlujoEfectivo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoFlujoEfectivo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoFlujoEfectivo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoFlujoEfectivo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoFlujoEfectivo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFlujoEfectivo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoFlujoEfectivo() throws Exception {
		try	{
			if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFlujoEfectivo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFlujoEfectivo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFlujoEfectivo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoFlujoEfectivo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoFlujoEfectivo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoFlujoEfectivo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoFlujoEfectivo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoFlujoEfectivo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoFlujoEfectivo.addItem(reporte);
			}
			
			
			if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoFlujoEfectivo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoFlujoEfectivo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoFlujoEfectivo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoFlujoEfectivo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoFlujoEfectivo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoFlujoEfectivo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFlujoEfectivo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFlujoEfectivo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo!=null) {
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo!=null) {
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoFlujoEfectivo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoFlujoEfectivo.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoFlujoEfectivo(Boolean esInicializar) throws Exception {				
		if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFlujoEfectivo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoFlujoEfectivo() throws Exception {
		this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoFlujoEfectivo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoFlujoEfectivoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoFlujoEfectivoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoFlujoEfectivoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFlujoEfectivoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoFlujoEfectivoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoFlujoEfectivoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoFlujoEfectivo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoflujoefectivoLogic.getTipoFlujoEfectivos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoflujoefectivos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoFlujoEfectivo.setModel(new TipoFlujoEfectivoModel(this.tipoflujoefectivoLogic.getTipoFlujoEfectivos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoFlujoEfectivo.setModel(new TipoFlujoEfectivoModel(this.tipoflujoefectivos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoFlujoEfectivo!=null && this.jInternalFrameOrderByTipoFlujoEfectivo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoFlujoEfectivo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFlujoEfectivo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoFlujoEfectivoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO,tipoflujoefectivoConstantesFunciones.resaltarSeleccionarTipoFlujoEfectivo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoFlujoEfectivoConstantesFunciones.SCLASSWEBTITULO,tipoflujoefectivoConstantesFunciones.resaltarSeleccionarTipoFlujoEfectivo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFlujoEfectivo,TipoFlujoEfectivoConstantesFunciones.LABEL_ID));

		if(this.tipoflujoefectivoConstantesFunciones.mostraridTipoFlujoEfectivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFlujoEfectivoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoflujoefectivoConstantesFunciones.resaltaridTipoFlujoEfectivo,this.tipoflujoefectivoConstantesFunciones.activaridTipoFlujoEfectivo,this,true,"idTipoFlujoEfectivo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoflujoefectivoConstantesFunciones.resaltaridTipoFlujoEfectivo,this.tipoflujoefectivoConstantesFunciones.activaridTipoFlujoEfectivo,this,true,"idTipoFlujoEfectivo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFlujoEfectivo,TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoflujoefectivoConstantesFunciones.mostrarid_empresaTipoFlujoEfectivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoflujoefectivoConstantesFunciones.resaltarid_empresaTipoFlujoEfectivo,this,this.tipoflujoefectivoConstantesFunciones.activarid_empresaTipoFlujoEfectivo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoflujoefectivoConstantesFunciones.resaltarid_empresaTipoFlujoEfectivo,this,this.tipoflujoefectivoConstantesFunciones.activarid_empresaTipoFlujoEfectivo,false,"id_empresaTipoFlujoEfectivo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFlujoEfectivoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFlujoEfectivo,TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoflujoefectivoConstantesFunciones.mostrarnombreTipoFlujoEfectivo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoflujoefectivoConstantesFunciones.resaltarnombreTipoFlujoEfectivo,this.tipoflujoefectivoConstantesFunciones.activarnombreTipoFlujoEfectivo,this,true,"nombreTipoFlujoEfectivo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoflujoefectivoConstantesFunciones.resaltarnombreTipoFlujoEfectivo,this.tipoflujoefectivoConstantesFunciones.activarnombreTipoFlujoEfectivo,this,true,"nombreTipoFlujoEfectivo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoFlujoEfectivoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCuentaContable && this.tipoflujoefectivoConstantesFunciones.mostrarCuentaContableTipoFlujoEfectivo && !TipoFlujoEfectivoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuenta Contables");
				tableColumn.setHeaderValue("Cuenta Contables");
				tableColumn.setCellRenderer(new CuentaContableTableCell(tipoflujoefectivoConstantesFunciones.resaltarCuentaContableTipoFlujoEfectivo,this,this.tipoflujoefectivoConstantesFunciones.activarCuentaContableTipoFlujoEfectivo));
				tableColumn.setCellEditor(new CuentaContableTableCell(tipoflujoefectivoConstantesFunciones.resaltarCuentaContableTipoFlujoEfectivo,this,this.tipoflujoefectivoConstantesFunciones.activarCuentaContableTipoFlujoEfectivo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoFlujoEfectivo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFlujoEfectivo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFlujoEfectivo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoFlujoEfectivo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoFlujoEfectivo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoFlujoEfectivo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoFlujoEfectivo.moveColumn(this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoFlujoEfectivo.moveColumn(this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoFlujoEfectivo.moveColumn(this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoFlujoEfectivo.moveColumn(this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoFlujoEfectivo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoFlujoEfectivo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoFlujoEfectivo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoFlujoEfectivo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoFlujoEfectivo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoFlujoEfectivo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoflujoefectivoLogic.getTipoFlujoEfectivos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoflujoefectivos.size()-1;
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
		//this.jTableDatosTipoFlujoEfectivo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoFlujoEfectivo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoFlujoEfectivo();
			
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
				
				//this.isEsNuevoTipoFlujoEfectivo=false;
					
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
				if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFlujoEfectivo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFlujoEfectivo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoflujoefectivo.getsType().equals("DUPLICADO")
				   || this.tipoflujoefectivo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoFlujoEfectivo=true;
				
				} else {
					this.isEsNuevoTipoFlujoEfectivo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoflujoefectivo.getId()>=0 && !this.tipoflujoefectivo.getIsNew()) {						
						this.isEsNuevoTipoFlujoEfectivo=false;
						
					} else {
						this.isEsNuevoTipoFlujoEfectivo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoFlujoEfectivo(esRelaciones);						
				
				this.seleccionarTipoFlujoEfectivo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoflujoefectivo.getId()<0) {
					this.isEsNuevoTipoFlujoEfectivo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoFlujoEfectivo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoFlujoEfectivo(evt,rowIndex);
				}	
				
				if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoFlujoEfectivo: " + this.dDif); 
					}
				}								
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoFlujoEfectivo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoflujoefectivo)) {
					if(this.tipoflujoefectivo.getId()>0) {
						this.tipoflujoefectivo.setIsDeleted(true);
						
						this.tipoflujoefectivosEliminados.add(this.tipoflujoefectivo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().remove(this.tipoflujoefectivo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoflujoefectivos.remove(this.tipoflujoefectivo);				
					}
					
					
					((TipoFlujoEfectivoModel) this.jTableDatosTipoFlujoEfectivo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoFlujoEfectivo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoFlujoEfectivo) {
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFlujoEfectivo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFlujoEfectivo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoFlujoEfectivo(this.tipoflujoefectivo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoflujoefectivoConstantesFunciones.cargarid_empresaTipoFlujoEfectivo || this.tipoflujoefectivoConstantesFunciones.event_dependid_empresaTipoFlujoEfectivo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoflujoefectivo.getid_empresa());
									//this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoflujoefectivo.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoflujoefectivo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoflujoefectivo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoFlujoEfectivo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoFlujoEfectivo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFlujoEfectivo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoFlujoEfectivo(tipoflujoefectivo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoFlujoEfectivo(tipoflujoefectivo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoFlujoEfectivo(tipoflujoefectivo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoFlujoEfectivo(tipoflujoefectivo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.setText(tipoflujoefectivo.getId().toString());
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTextAreanombreTipoFlujoEfectivo.setText(tipoflujoefectivo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoFlujoEfectivo tipoflujoefectivoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoflujoefectivoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoFlujoEfectivo tipoflujoefectivoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoflujoefectivoLocal=this.tipoflujoefectivo;
			} else {
				tipoflujoefectivoLocal=this.tipoflujoefectivoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoflujoefectivoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoFlujoEfectivo(tipoflujoefectivoLocal,true);
					
					if(tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoflujoefectivoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoflujoefectivoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(tipoflujoefectivo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(tipoflujoefectivo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(tipoflujoefectivo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.getText()==null || this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.getText()=="" || this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.setText("0");
			}

			if(conColumnasBase) {tipoflujoefectivo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFlujoEfectivoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelIdTipoFlujoEfectivo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoflujoefectivo.setnombre(this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTextAreanombreTipoFlujoEfectivo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelnombreTipoFlujoEfectivo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivoBean,TipoFlujoEfectivo tipoflujoefectivo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivoOrigen,TipoFlujoEfectivo tipoflujoefectivo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoflujoefectivoOrigen.getId()!=null && !tipoflujoefectivoOrigen.getId().equals(0L))) {tipoflujoefectivo.setId(tipoflujoefectivoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoflujoefectivoOrigen.getnombre()!=null && !tipoflujoefectivoOrigen.getnombre().equals(""))) {tipoflujoefectivo.setnombre(tipoflujoefectivoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.setText(tipoflujoefectivo.getId().toString());
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTextAreanombreTipoFlujoEfectivo.setText(tipoflujoefectivo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFlujoEfectivo(TipoFlujoEfectivoBean tipoflujoefectivoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.setText(tipoflujoefectivoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTextAreanombreTipoFlujoEfectivo.setText(tipoflujoefectivoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoFlujoEfectivo(TipoFlujoEfectivoParameterReturnGeneral tipoflujoefectivoReturnGeneral,TipoFlujoEfectivoBean tipoflujoefectivoBean,Boolean conDefault) throws Exception { 
		try {
			TipoFlujoEfectivo tipoflujoefectivoLocal=new TipoFlujoEfectivo();
			
			tipoflujoefectivoLocal=tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoflujoefectivoLocal.getId()!=null && !tipoflujoefectivoLocal.getId().equals(0L))) {tipoflujoefectivoBean.setId(tipoflujoefectivoLocal.getId());}}
			if(conDefault || (!conDefault && tipoflujoefectivoLocal.getnombre()!=null && !tipoflujoefectivoLocal.getnombre().equals(""))) {tipoflujoefectivoBean.setnombre(tipoflujoefectivoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoFlujoEfectivoGenerico(Long idTipoFlujoEfectivoSeleccionado,JComboBox jComboBoxTipoFlujoEfectivo,List<TipoFlujoEfectivo> tipoflujoefectivosLocal)throws Exception {
		try {
			TipoFlujoEfectivo  tipoflujoefectivoTemp=null;

			for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivosLocal) {
				if(tipoflujoefectivoAux.getId()!=null && tipoflujoefectivoAux.getId().equals(idTipoFlujoEfectivoSeleccionado)) {
					tipoflujoefectivoTemp=tipoflujoefectivoAux;
					break;
				}
			}

			jComboBoxTipoFlujoEfectivo.setSelectedItem(tipoflujoefectivoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoFlujoEfectivoGenerico(JComboBox jComboBoxTipoFlujoEfectivo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoFlujoEfectivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFlujoEfectivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoFlujoEfectivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFlujoEfectivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFlujoEfectivo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoFlujoEfectivo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFlujoEfectivo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoFlujoEfectivo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoFlujoEfectivo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoFlujoEfectivo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("CuentaContable")) {
			jButtonCuentaContableActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoflujoefectivo=(TipoFlujoEfectivo) tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoflujoefectivo =(TipoFlujoEfectivo) tipoflujoefectivos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoflujoefectivo.getIsNew() && !tipoflujoefectivo.getIsChanged() && !tipoflujoefectivo.getIsDeleted()) {
				sDescripcion=tipoflujoefectivo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoflujoefectivo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoFlujoEfectivo tipoflujoefectivoRow=new TipoFlujoEfectivo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoflujoefectivoRow=(TipoFlujoEfectivo) tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoflujoefectivoRow=(TipoFlujoEfectivo) tipoflujoefectivos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCuentaContableActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoFlujoEfectivo tipoflujoefectivo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoflujoefectivo = (TipoFlujoEfectivo)this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoflujoefectivo = (TipoFlujoEfectivo)this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoflujoefectivo!=null) {
						this.tipoflujoefectivo = tipoflujoefectivo;
					} else {
						this.tipoflujoefectivo = new TipoFlujoEfectivo();
					}
				}

				if(this.isTienePermisosCuentaContable && this.permiteMantenimiento(this.tipoflujoefectivo)) {
					CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFramePopup=new CuentaContableBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuentacontableBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFramePopup;
					} else {
						cuentacontableBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame;
					}

					List<TipoFlujoEfectivo> tipoflujoefectivos=new ArrayList<TipoFlujoEfectivo>();
					tipoflujoefectivos.add(this.tipoflujoefectivo);
					if(!esRelacionado) {
						//cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setConGuardarRelaciones(false);
						//cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuentacontableBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.cargarCuentaContableBeanSwingJInternalFrame(tipoflujoefectivos,this.tipoflujoefectivo,cuentacontableBeanSwingJInternalFrame,/*conInicializar,*/cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.getConGuardarRelaciones(),cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.getEsGuardarRelacionado());
					cuentacontableBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContable("no_relacionado");

						cuentacontableBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuentaContableConstantesFunciones.ITAMANIOFILATABLA + (CuentaContableConstantesFunciones.ITAMANIOFILATABLA/2));

						cuentacontableBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoFlujoEfectivo=(TitledBorder)this.jScrollPanelDatosTipoFlujoEfectivo.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderTipoFlujoEfectivo.getTitle() + " -> Cuenta Contable");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}

						cuentacontableBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

						cuentacontableBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuenta Contable",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoFlujoEfectivo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaNuevoTipoFlujoEfectivo && this.isPermisoNuevoTipoFlujoEfectivo));			
			this.jButtonDuplicarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaDuplicarTipoFlujoEfectivo && this.isPermisoDuplicarTipoFlujoEfectivo));			
			this.jButtonCopiarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaCopiarTipoFlujoEfectivo && this.isPermisoCopiarTipoFlujoEfectivo));
			this.jButtonVerFormTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaVerFormTipoFlujoEfectivo && this.isPermisoVerFormTipoFlujoEfectivo));
			
			this.jButtonAbrirOrderByTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaOrdenTipoFlujoEfectivo && this.isPermisoOrdenTipoFlujoEfectivo));			
			
			this.jButtonNuevoRelacionesTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo && this.isPermisoNuevoTipoFlujoEfectivo));			
			this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaNuevoTipoFlujoEfectivo && this.isPermisoNuevoTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo));
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonModificarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaModificarTipoFlujoEfectivo && this.isPermisoActualizarTipoFlujoEfectivo));	
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonActualizarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaActualizarTipoFlujoEfectivo && this.isPermisoActualizarTipoFlujoEfectivo));	
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonEliminarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaEliminarTipoFlujoEfectivo && this.isPermisoEliminarTipoFlujoEfectivo));
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonCancelarTipoFlujoEfectivo.setVisible(this.isVisibilidadCeldaCancelarTipoFlujoEfectivo);							
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaGuardarTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaNuevoTipoFlujoEfectivo && this.isPermisoNuevoTipoFlujoEfectivo));						
			this.jButtonDuplicarToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaDuplicarTipoFlujoEfectivo && this.isPermisoDuplicarTipoFlujoEfectivo));						
			this.jButtonCopiarToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaCopiarTipoFlujoEfectivo && this.isPermisoCopiarTipoFlujoEfectivo));			
			this.jButtonVerFormToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaVerFormTipoFlujoEfectivo && this.isPermisoVerFormTipoFlujoEfectivo));			
			this.jButtonAbrirOrderByToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaOrdenTipoFlujoEfectivo && this.isPermisoOrdenTipoFlujoEfectivo));
			this.jButtonNuevoRelacionesToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo && this.isPermisoNuevoTipoFlujoEfectivo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaNuevoTipoFlujoEfectivo && this.isPermisoNuevoTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo));			
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonModificarToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaModificarTipoFlujoEfectivo && this.isPermisoActualizarTipoFlujoEfectivo));	
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonActualizarToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaActualizarTipoFlujoEfectivo  && this.isPermisoActualizarTipoFlujoEfectivo));	
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonEliminarToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaEliminarTipoFlujoEfectivo && this.isPermisoEliminarTipoFlujoEfectivo));
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonCancelarToolBarTipoFlujoEfectivo.setVisible(this.isVisibilidadCeldaCancelarTipoFlujoEfectivo);				
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaGuardarTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaNuevoTipoFlujoEfectivo && this.isPermisoNuevoTipoFlujoEfectivo));			
			this.jMenuItemDuplicarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaDuplicarTipoFlujoEfectivo && this.isPermisoDuplicarTipoFlujoEfectivo));			
			this.jMenuItemCopiarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaCopiarTipoFlujoEfectivo && this.isPermisoCopiarTipoFlujoEfectivo));			
			this.jMenuItemVerFormTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaVerFormTipoFlujoEfectivo && this.isPermisoVerFormTipoFlujoEfectivo));			
			this.jMenuItemAbrirOrderByTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaOrdenTipoFlujoEfectivo && this.isPermisoOrdenTipoFlujoEfectivo));			
			//this.jMenuItemMostrarOcultarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaOrdenTipoFlujoEfectivo && this.isPermisoOrdenTipoFlujoEfectivo));
			this.jMenuItemDetalleAbrirOrderByTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaOrdenTipoFlujoEfectivo && this.isPermisoOrdenTipoFlujoEfectivo));			
			//this.jMenuItemDetalleMostrarOcultarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaOrdenTipoFlujoEfectivo && this.isPermisoOrdenTipoFlujoEfectivo));			
			this.jMenuItemNuevoRelacionesTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo && this.isPermisoNuevoTipoFlujoEfectivo));			
			this.jMenuItemNuevoGuardarCambiosTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaNuevoTipoFlujoEfectivo && this.isPermisoNuevoTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo));									
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemModificarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaModificarTipoFlujoEfectivo && this.isPermisoActualizarTipoFlujoEfectivo));	
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemActualizarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaActualizarTipoFlujoEfectivo && this.isPermisoActualizarTipoFlujoEfectivo));	
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemEliminarTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaEliminarTipoFlujoEfectivo && this.isPermisoEliminarTipoFlujoEfectivo));
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemCancelarTipoFlujoEfectivo.setVisible(this.isVisibilidadCeldaCancelarTipoFlujoEfectivo);				
			}
			
			this.jMenuItemGuardarCambiosTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaGuardarTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo));						
			this.jMenuItemGuardarCambiosTablaTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=this.jButtonNuevoTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoFlujoEfectivo=this.jButtonDuplicarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaCopiarTipoFlujoEfectivo=this.jButtonCopiarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaVerFormTipoFlujoEfectivo=this.jButtonVerFormTipoFlujoEfectivo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoFlujoEfectivo=this.jButtonAbrirOrderByTipoFlujoEfectivo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=this.jButtonNuevoRelacionesTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaModificarTipoFlujoEfectivo=this.jButtonModificarTipoFlujoEfectivo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonActualizarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonEliminarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonCancelarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosTipoFlujoEfectivo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=this.jButtonNuevoToolBarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=this.jButtonNuevoRelacionesToolBarTipoFlujoEfectivo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			this.isVisibilidadCeldaModificarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonModificarToolBarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonActualizarToolBarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonEliminarToolBarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonCancelarToolBarTipoFlujoEfectivo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=this.jButtonGuardarCambiosToolBarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=this.jButtonGuardarCambiosTablaToolBarTipoFlujoEfectivo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=this.jMenuItemNuevoTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=this.jMenuItemNuevoRelacionesTipoFlujoEfectivo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			this.isVisibilidadCeldaModificarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemModificarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemActualizarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemEliminarTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemCancelarTipoFlujoEfectivo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=this.jMenuItemGuardarCambiosTipoFlujoEfectivo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=this.jMenuItemGuardarCambiosTablaTipoFlujoEfectivo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoFlujoEfectivo(Boolean esInicializar) {
		if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFlujoEfectivo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoFlujoEfectivo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoFlujoEfectivo() {
		this.jButtonNuevoTipoFlujoEfectivo.setVisible(this.isPermisoNuevoTipoFlujoEfectivo);			
		this.jButtonDuplicarTipoFlujoEfectivo.setVisible(this.isPermisoDuplicarTipoFlujoEfectivo);			
		this.jButtonCopiarTipoFlujoEfectivo.setVisible(this.isPermisoCopiarTipoFlujoEfectivo);			
		this.jButtonVerFormTipoFlujoEfectivo.setVisible(this.isPermisoVerFormTipoFlujoEfectivo);			
		
		this.jButtonAbrirOrderByTipoFlujoEfectivo.setVisible(this.isPermisoOrdenTipoFlujoEfectivo);					
		
		this.jButtonNuevoRelacionesTipoFlujoEfectivo.setVisible(this.isPermisoNuevoTipoFlujoEfectivo);			
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonModificarTipoFlujoEfectivo.setVisible(this.isPermisoActualizarTipoFlujoEfectivo);	
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonActualizarTipoFlujoEfectivo.setVisible(this.isPermisoActualizarTipoFlujoEfectivo);	
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonEliminarTipoFlujoEfectivo.setVisible(this.isPermisoEliminarTipoFlujoEfectivo);
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonCancelarTipoFlujoEfectivo.setVisible(this.isVisibilidadCeldaCancelarTipoFlujoEfectivo);						
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosTipoFlujoEfectivo.setVisible(this.isPermisoGuardarCambiosTipoFlujoEfectivo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.setVisible(this.isPermisoActualizarTipoFlujoEfectivo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFlujoEfectivo() {
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonModificarTipoFlujoEfectivo.setVisible(this.isPermisoActualizarTipoFlujoEfectivo);	
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonActualizarTipoFlujoEfectivo.setVisible(this.isPermisoActualizarTipoFlujoEfectivo);	
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonEliminarTipoFlujoEfectivo.setVisible(this.isPermisoEliminarTipoFlujoEfectivo);
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonCancelarTipoFlujoEfectivo.setVisible(this.isVisibilidadCeldaCancelarTipoFlujoEfectivo);							
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosTipoFlujoEfectivo.setVisible((this.isVisibilidadCeldaGuardarTipoFlujoEfectivo && this.isPermisoGuardarCambiosTipoFlujoEfectivo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoFlujoEfectivo() {
		if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoFlujoEfectivo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoFlujoEfectivo() {
	}
	
	public void jTableDatosTipoFlujoEfectivoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoFlujoEfectivo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoFlujoEfectivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.gettipoflujoefectivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoflujoefectivo==null) {
						this.tipoflujoefectivo = new TipoFlujoEfectivo();
					}

					this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
				}

				if(this.tipoflujoefectivo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoflujoefectivo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFlujoEfectivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoFlujoEfectivoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoFlujoEfectivo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoFlujoEfectivo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoFlujoEfectivo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.gettipoflujoefectivo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoflujoefectivoLogic.getConnexion());

				if(this.tipoflujoefectivo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoflujoefectivo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoFlujoEfectivo=(TitledBorder)this.jScrollPanelDatosTipoFlujoEfectivo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoFlujoEfectivo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoFlujoEfectivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.gettipoflujoefectivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoflujoefectivo==null) {
						this.tipoflujoefectivo = new TipoFlujoEfectivo();
					}

					this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
				}

				if(this.tipoflujoefectivo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoflujoefectivo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFlujoEfectivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoFlujoEfectivoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.gettipoflujoefectivo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoflujoefectivo==null) {
						this.tipoflujoefectivo = new TipoFlujoEfectivo();
					}

					this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);
				}

				if(this.tipoflujoefectivo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoflujoefectivo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFlujoEfectivo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);

			this.getTipoFlujoEfectivosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoFlujoEfectivo(false);

			//if(TipoFlujoEfectivoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoFlujoEfectivoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);

			this.getTipoFlujoEfectivosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoFlujoEfectivo(false);

			//if(TipoFlujoEfectivoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoflujoefectivoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoFlujoEfectivo() {
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.dispose();
			this.jInternalFrameDetalleFormTipoFlujoEfectivo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo!=null) {
			this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.dispose();
			this.jInternalFrameReporteDinamicoTipoFlujoEfectivo=null;
		}
		
		if(this.jInternalFrameImportacionTipoFlujoEfectivo!=null) {
			this.jInternalFrameImportacionTipoFlujoEfectivo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoFlujoEfectivo.dispose();
			this.jInternalFrameImportacionTipoFlujoEfectivo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoFlujoEfectivo();
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoFlujoEfectivo")) {
				jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoFlujoEfectivo")) {
				jButtonDuplicarTipoFlujoEfectivoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoFlujoEfectivo")) {
				jButtonCopiarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoFlujoEfectivo")) {
				jButtonVerFormTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoFlujoEfectivo")) {
				jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoFlujoEfectivo")) {
				jButtonDuplicarTipoFlujoEfectivoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoFlujoEfectivo")) {
				jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoFlujoEfectivo")) {
				jButtonDuplicarTipoFlujoEfectivoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoFlujoEfectivo")) {
				jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoFlujoEfectivo")) {
				jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoFlujoEfectivo")) {
				jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoFlujoEfectivo")) {
				jButtonModificarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoFlujoEfectivo")) {
				jButtonModificarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoFlujoEfectivo")) {
				jButtonModificarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoFlujoEfectivo")) {
				jButtonActualizarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoFlujoEfectivo")) {
				jButtonActualizarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoFlujoEfectivo")) {
				jButtonActualizarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoFlujoEfectivo")) {
				jButtonEliminarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoFlujoEfectivo")) {
				jButtonEliminarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoFlujoEfectivo")) {
				jButtonEliminarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoFlujoEfectivo")) {
				jButtonCancelarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoFlujoEfectivo")) {
				jButtonCancelarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoFlujoEfectivo")) {
				jButtonCancelarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoFlujoEfectivo")) {
				jButtonCerrarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoFlujoEfectivo")) {
				jButtonCerrarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoFlujoEfectivo")) {
				jButtonCerrarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoFlujoEfectivo")) {
				jButtonMostrarOcultarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoFlujoEfectivo")) {
				jButtonCancelarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoFlujoEfectivo")) {
				jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoFlujoEfectivo")) {
				jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoFlujoEfectivo")) {
				jButtonCopiarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoFlujoEfectivo")) {
				jButtonVerFormTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoFlujoEfectivo")) {
				jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoFlujoEfectivo")) {
				jButtonCopiarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoFlujoEfectivo")) {
				jButtonVerFormTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoFlujoEfectivo")) {
				jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoFlujoEfectivo")) {
				jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoFlujoEfectivo")) {
				jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoFlujoEfectivo")) {
				jButtonRecargarInformacionTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoFlujoEfectivo")) {
				jButtonRecargarInformacionTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoFlujoEfectivo")) {
				jButtonRecargarInformacionTipoFlujoEfectivoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoFlujoEfectivo")) {
				jButtonAnterioresTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoFlujoEfectivo")) {
				jButtonAnterioresTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoFlujoEfectivo")) {
				jButtonAnterioresTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoFlujoEfectivo")) {
				jButtonSiguientesTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoFlujoEfectivo")) {
				jButtonSiguientesTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoFlujoEfectivo")) {
				jButtonSiguientesTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoFlujoEfectivo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoFlujoEfectivo")) {
				jButtonAbrirOrderByTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoFlujoEfectivo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoFlujoEfectivo")) {
				jButtonMostrarOcultarTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFlujoEfectivo")) {
				jButtonNuevoGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoFlujoEfectivo")) {
				jButtonNuevoGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoFlujoEfectivo")) {
				jButtonNuevoGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoFlujoEfectivo")) {
				jButtonCerrarReporteDinamicoTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoFlujoEfectivo")) {
				jButtonGenerarReporteDinamicoTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoFlujoEfectivo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoFlujoEfectivo")) {
				jButtonCerrarImportacionTipoFlujoEfectivoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoFlujoEfectivo")) {
				
				jButtonGenerarImportacionTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoFlujoEfectivo")) {
				
				jButtonAbrirImportacionTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoFlujoEfectivo")) {
				jComboBoxTiposAccionesTipoFlujoEfectivoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoFlujoEfectivo")) {
				jComboBoxTiposRelacionesTipoFlujoEfectivoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoFlujoEfectivo")) {
				jComboBoxTiposAccionesTipoFlujoEfectivoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoFlujoEfectivo")) {
				
				jComboBoxTiposSeleccionarTipoFlujoEfectivoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoFlujoEfectivo")) {
				jTextFieldValorCampoGeneralTipoFlujoEfectivoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoFlujoEfectivo")) {
				jButtonAbrirOrderByTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoFlujoEfectivo")) {
				jButtonAbrirOrderByTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoFlujoEfectivo")) {
				jButtonCerrarOrderByTipoFlujoEfectivoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFlujoEfectivoBusqueda")) {
				this.jButtonidTipoFlujoEfectivoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoFlujoEfectivoUpdate")) {
				this.jButtonid_empresaTipoFlujoEfectivoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoFlujoEfectivoBusqueda")) {
				this.jButtonid_empresaTipoFlujoEfectivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFlujoEfectivoBusqueda")) {
				this.jButtonnombreTipoFlujoEfectivoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoFlujoEfectivo")) {
				this.jButtonBusquedaPorNombreTipoFlujoEfectivoActionPerformed(evt);
			}
			
			;
			
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoFlujoEfectivo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFlujoEfectivoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				


				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoFlujoEfectivo tipoflujoefectivoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoflujoefectivoLocal=this.tipoflujoefectivo;
			} else {
				tipoflujoefectivoLocal=this.tipoflujoefectivoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
							
				
				


				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFlujoEfectivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
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
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
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
			
			


			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFlujoEfectivoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
								
						
				


				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
								
				
				


				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFlujoEfectivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFlujoEfectivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFlujoEfectivoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
							
				
				


				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFlujoEfectivoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
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
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
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
			
			


			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFlujoEfectivoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
								
				
				


				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFlujoEfectivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFlujoEfectivoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFlujoEfectivoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoFlujoEfectivo")) {
					jCheckBoxSeleccionarTodosTipoFlujoEfectivoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoFlujoEfectivo")) {
					jCheckBoxSeleccionadosTipoFlujoEfectivoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoFlujoEfectivo")) {
					
				}
				
				


				
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
												
				
				


				
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFlujoEfectivoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFlujoEfectivoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
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
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
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
			
			


			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFlujoEfectivoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoflujoefectivo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoflujoefectivo);
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
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
				
				


				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFlujoEfectivo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFlujoEfectivo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFlujoEfectivoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoflujoefectivoAnterior =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoFlujoEfectivo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoFlujoEfectivoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoFlujoEfectivo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoflujoefectivo =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoflujoefectivo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoFlujoEfectivo")) {
				
				}
				
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoFlujoEfectivo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoFlujoEfectivo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoFlujoEfectivo")) {
			
			}
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoFlujoEfectivo();
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoFlujoEfectivo")) {
				jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoFlujoEfectivo")) {
				jButtonDuplicarTipoFlujoEfectivoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoFlujoEfectivo")) {
				jButtonCopiarTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoFlujoEfectivo")) {
				jButtonVerFormTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoFlujoEfectivo")) {
				jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoFlujoEfectivo")) {
				jButtonModificarTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoFlujoEfectivo")) {
				jButtonActualizarTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoFlujoEfectivo")) {
				jButtonEliminarTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoFlujoEfectivo")) {
				jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoFlujoEfectivo")) {
				jButtonCancelarTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoFlujoEfectivo")) {
				jButtonCerrarTipoFlujoEfectivoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoFlujoEfectivo")) {
				jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFlujoEfectivo")) {
				jButtonNuevoGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoFlujoEfectivo")) {
				jButtonAbrirOrderByTipoFlujoEfectivoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoFlujoEfectivo")) {
				jButtonRecargarInformacionTipoFlujoEfectivoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoFlujoEfectivo")) {
				jButtonAnterioresTipoFlujoEfectivoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoFlujoEfectivo")) {
				jButtonSiguientesTipoFlujoEfectivoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFlujoEfectivoBusqueda")) {
				this.jButtonidTipoFlujoEfectivoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoFlujoEfectivoUpdate")) {
				this.jButtonid_empresaTipoFlujoEfectivoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoFlujoEfectivoBusqueda")) {
				this.jButtonid_empresaTipoFlujoEfectivoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFlujoEfectivoBusqueda")) {
				this.jButtonnombreTipoFlujoEfectivoBusquedaActionPerformed(evt);
			}
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoFlujoEfectivo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoFlujoEfectivo")) {
				closingInternalFrameTipoFlujoEfectivo();
				
			} else if(sTipo.equals("jButtonCancelarTipoFlujoEfectivo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoFlujoEfectivo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoFlujoEfectivoBeanSwingJInternalFrame jInternalFrameParent=(TipoFlujoEfectivoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFlujoEfectivo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoFlujoEfectivoActionPerformed(null);
			}
			
			TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoflujoefectivo,new Object(),this.tipoflujoefectivoParameterGeneral,this.tipoflujoefectivoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoFlujoEfectivo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoFlujoEfectivo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoFlujoEfectivo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoflujoefectivo)) {
			if(!esControlTabla) {
				if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);			
				}
				
				if(this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoflujoefectivoReturnGeneral=tipoflujoefectivoLogic.procesarEventosTipoFlujoEfectivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoflujoefectivoLogic.getTipoFlujoEfectivos(),this.tipoflujoefectivo,this.tipoflujoefectivoParameterGeneral,this.isEsNuevoTipoFlujoEfectivo,classes);//this.tipoflujoefectivoLogic.getTipoFlujoEfectivo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoFlujoEfectivo(this.tipoflujoefectivoReturnGeneral,this.tipoflujoefectivoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoFlujoEfectivo(classes,this.tipoflujoefectivoReturnGeneral,this.tipoflujoefectivoBean,false);
					}
						
					if(this.tipoflujoefectivoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoFlujoEfectivo(this.tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoFlujoEfectivo(this.tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo());	
					}
						
					if(this.tipoflujoefectivoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoFlujoEfectivo(this.tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo(),classes);//this.tipoflujoefectivoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoFlujoEfectivo(this.tipoflujoefectivo,classes);//this.tipoflujoefectivoBean);									
				}
			
				if(TipoFlujoEfectivoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoFlujoEfectivo(this.tipoflujoefectivo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFlujoEfectivo(this.tipoflujoefectivo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoflujoefectivoAnterior!=null) {
						this.tipoflujoefectivo=this.tipoflujoefectivoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoflujoefectivoReturnGeneral=tipoflujoefectivoLogic.procesarEventosTipoFlujoEfectivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoflujoefectivoLogic.getTipoFlujoEfectivos(),this.tipoflujoefectivo,this.tipoflujoefectivoParameterGeneral,this.isEsNuevoTipoFlujoEfectivo,classes);//this.tipoflujoefectivoLogic.getTipoFlujoEfectivo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoflujoefectivoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo(),tipoflujoefectivoLogic.getTipoFlujoEfectivos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo(),this.tipoflujoefectivos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoFlujoEfectivo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoFlujoEfectivo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoFlujoEfectivo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoFlujoEfectivo() throws Exception {
		
		TipoFlujoEfectivoModel tipoflujoefectivoModel=(TipoFlujoEfectivoModel)this.jTableDatosTipoFlujoEfectivo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoflujoefectivoModel.tipoflujoefectivos=this.tipoflujoefectivoLogic.getTipoFlujoEfectivos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoflujoefectivoModel.tipoflujoefectivos=this.tipoflujoefectivos;
		}
		
		
		((TipoFlujoEfectivoModel) this.jTableDatosTipoFlujoEfectivo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoFlujoEfectivo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoflujoefectivoAnterior(),this.tipoflujoefectivoLogic.getTipoFlujoEfectivos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoflujoefectivoAnterior(),this.tipoflujoefectivos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoFlujoEfectivo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContable.class)) {
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.setCuentaContables(tipoflujoefectivo.getCuentaContables());
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
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
										
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoflujoefectivo,new Object(),generalEntityParameterGeneral,this.tipoflujoefectivoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoFlujoEfectivoConstantesFunciones.getClassesRelationshipsOfTipoFlujoEfectivo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoFlujoEfectivoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoFlujoEfectivo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoFlujoEfectivo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoflujoefectivo,new Object(),generalEntityParameterGeneral,this.tipoflujoefectivoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoFlujoEfectivo(TipoFlujoEfectivoBean tipoflujoefectivoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContable.class)) {
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.setCuentaContables(tipoflujoefectivo.getCuentaContables());
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoFlujoEfectivo(ArrayList<Classe> classes,TipoFlujoEfectivoReturnGeneral tipoflujoefectivoReturnGeneral,TipoFlujoEfectivoBean tipoflujoefectivoBean,Boolean conDefault) throws Exception {
		
			this.tipoflujoefectivoBean.setCuentaContables(tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo().getCuentaContables());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContable.class)) {
					tipoflujoefectivo.setCuentaContables(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoflujoefectivo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo = new TipoFlujoEfectivoDetalleFormJInternalFrame(jDesktopPane,this.tipoflujoefectivoSessionBean.getConGuardarRelaciones(),this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFlujoEfectivo);
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.setVisible(false);
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.tipoflujoefectivoLogic=this.tipoflujoefectivoLogic;
		
		this.cargarCombosFrameForeignKeyTipoFlujoEfectivo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFlujoEfectivo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFlujoEfectivo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoFlujoEfectivo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoFlujoEfectivo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFlujoEfectivo"));
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonModificarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"ModificarTipoFlujoEfectivo"));

		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonModificarToolBarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFlujoEfectivo"));
					
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemModificarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFlujoEfectivo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonActualizarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"ActualizarTipoFlujoEfectivo"));
		
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonActualizarToolBarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFlujoEfectivo"));
						
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemActualizarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFlujoEfectivo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonEliminarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"EliminarTipoFlujoEfectivo"));
		
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonEliminarToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFlujoEfectivo"));
								
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemEliminarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFlujoEfectivo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonCancelarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"CancelarTipoFlujoEfectivo"));
		
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonCancelarToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFlujoEfectivo"));
					
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemCancelarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFlujoEfectivo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemDetalleCerrarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFlujoEfectivo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFlujoEfectivo"));
		
		
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFlujoEfectivo"));
		
		
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFlujoEfectivo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonidTipoFlujoEfectivoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFlujoEfectivoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonid_empresaTipoFlujoEfectivoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoFlujoEfectivoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonid_empresaTipoFlujoEfectivoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoFlujoEfectivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonnombreTipoFlujoEfectivoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFlujoEfectivoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTabbedPaneRelacionesTipoFlujoEfectivo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFlujoEfectivo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoFlujoEfectivo"));
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFlujoEfectivo"));
		}
		
		this.jTableDatosTipoFlujoEfectivo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoFlujoEfectivo"));
		
		this.jTableDatosTipoFlujoEfectivo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoFlujoEfectivo"));
		
		this.jButtonNuevoTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"NuevoTipoFlujoEfectivo"));
		
		this.jButtonDuplicarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"DuplicarTipoFlujoEfectivo"));
		
		this.jButtonCopiarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"CopiarTipoFlujoEfectivo"));
		
		this.jButtonVerFormTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"VerFormTipoFlujoEfectivo"));
		
		
		this.jButtonNuevoToolBarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoFlujoEfectivo"));
			
		this.jButtonDuplicarToolBarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoFlujoEfectivo"));
			
		this.jMenuItemNuevoTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoFlujoEfectivo"));
			
		this.jMenuItemDuplicarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoFlujoEfectivo"));		
		
		
		this.jButtonNuevoRelacionesTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoFlujoEfectivo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoFlujoEfectivo"));
			
		this.jMenuItemNuevoRelacionesTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoFlujoEfectivo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonModificarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"ModificarTipoFlujoEfectivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonModificarToolBarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFlujoEfectivo"));
			
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemModificarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFlujoEfectivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonActualizarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"ActualizarTipoFlujoEfectivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonActualizarToolBarTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFlujoEfectivo"));
				
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemActualizarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFlujoEfectivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonEliminarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"EliminarTipoFlujoEfectivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonEliminarToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFlujoEfectivo"));
						
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemEliminarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFlujoEfectivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonCancelarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"CancelarTipoFlujoEfectivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonCancelarToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFlujoEfectivo"));
			
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemCancelarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFlujoEfectivo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoFlujoEfectivo"));		
		
		
		this.jButtonCerrarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"CerrarTipoFlujoEfectivo"));
		
		
		this.jButtonCerrarToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoFlujoEfectivo"));
			
		this.jMenuItemCerrarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoFlujoEfectivo"));
			
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jMenuItemDetalleCerrarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFlujoEfectivo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoFlujoEfectivo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFlujoEfectivo"));
		}
		
		this.jButtonCopiarToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoFlujoEfectivo"));
			
		this.jButtonVerFormToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoFlujoEfectivo"));
		
		this.jMenuItemGuardarCambiosTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoFlujoEfectivo"));
			
		this.jMenuItemCopiarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoFlujoEfectivo"));		
		
		this.jMenuItemVerFormTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoFlujoEfectivo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFlujoEfectivo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoFlujoEfectivo"));
			
		this.jMenuItemGuardarCambiosTablaTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFlujoEfectivo"));		
		
		
		
		this.jButtonRecargarInformacionTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoFlujoEfectivo"));
					
		this.jButtonRecargarInformacionToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoFlujoEfectivo"));
		
		this.jMenuItemRecargarInformacionTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoFlujoEfectivo"));		
		
		
		
		this.jButtonAnterioresTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"AnterioresTipoFlujoEfectivo"));
		
		
		this.jButtonAnterioresToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoFlujoEfectivo"));
		
		this.jMenuItemAnterioresTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoFlujoEfectivo"));		
		
		
		this.jButtonSiguientesTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"SiguientesTipoFlujoEfectivo"));
		
		
		this.jButtonSiguientesToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoFlujoEfectivo"));
			
		this.jMenuItemSiguientesTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoFlujoEfectivo"));
			
		this.jMenuItemAbrirOrderByTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoFlujoEfectivo"));
			
		this.jMenuItemMostrarOcultarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoFlujoEfectivo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoFlujoEfectivo"));
			
		this.jMenuItemDetalleMostarOcultarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoFlujoEfectivo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoFlujoEfectivo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoFlujoEfectivo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoFlujoEfectivo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoFlujoEfectivo"));

		this.jCheckBoxSeleccionadosTipoFlujoEfectivo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoFlujoEfectivo"));
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFlujoEfectivo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoFlujoEfectivo"));
			
		this.jComboBoxTiposAccionesTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoFlujoEfectivo"));
					
		this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoFlujoEfectivo"));
			
		this.jTextFieldValorCampoGeneralTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoFlujoEfectivo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonidTipoFlujoEfectivoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFlujoEfectivoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonid_empresaTipoFlujoEfectivoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoFlujoEfectivoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonid_empresaTipoFlujoEfectivoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoFlujoEfectivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonnombreTipoFlujoEfectivoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFlujoEfectivoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoFlujoEfectivo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoFlujoEfectivo!=null) {
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFlujoEfectivo"));
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFlujoEfectivo"));
				this.jInternalFrameReporteDinamicoTipoFlujoEfectivo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFlujoEfectivo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFlujoEfectivo"));				
			//this.jButtonGenerarReporteDinamicoTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFlujoEfectivo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFlujoEfectivo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoFlujoEfectivo!=null) {
				this.jInternalFrameImportacionTipoFlujoEfectivo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFlujoEfectivo"));
				this.jInternalFrameImportacionTipoFlujoEfectivo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFlujoEfectivo"));
				this.jInternalFrameImportacionTipoFlujoEfectivo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFlujoEfectivo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoFlujoEfectivo"));
			
			this.jButtonAbrirOrderByToolBarTipoFlujoEfectivo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoFlujoEfectivo"));			
			
			if(this.jInternalFrameOrderByTipoFlujoEfectivo!=null) {
				this.jInternalFrameOrderByTipoFlujoEfectivo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFlujoEfectivo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTabbedPaneRelacionesTipoFlujoEfectivo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFlujoEfectivo"));
		
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
            		closingInternalFrameTipoFlujoEfectivo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoFlujoEfectivo = (JInternalFrameBase)event.getSource();
	            	
	            TipoFlujoEfectivoBeanSwingJInternalFrame jInternalFrameParent=(TipoFlujoEfectivoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFlujoEfectivo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoFlujoEfectivoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoFlujoEfectivo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoFlujoEfectivoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoFlujoEfectivo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoFlujoEfectivo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoFlujoEfectivo";
		inputMap = this.jButtonNuevoTipoFlujoEfectivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoFlujoEfectivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoFlujoEfectivo";
		inputMap = this.jButtonNuevoRelacionesTipoFlujoEfectivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoFlujoEfectivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFlujoEfectivoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoFlujoEfectivo";
		inputMap = this.jButtonModificarTipoFlujoEfectivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoFlujoEfectivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoFlujoEfectivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoFlujoEfectivo";
		inputMap = this.jButtonActualizarTipoFlujoEfectivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoFlujoEfectivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoFlujoEfectivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoFlujoEfectivo";
		inputMap = this.jButtonEliminarTipoFlujoEfectivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoFlujoEfectivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoFlujoEfectivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoFlujoEfectivo";
		inputMap = this.jButtonCancelarTipoFlujoEfectivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoFlujoEfectivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoFlujoEfectivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoFlujoEfectivo";
		inputMap = this.jButtonCerrarTipoFlujoEfectivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoFlujoEfectivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoFlujoEfectivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoFlujoEfectivo";
		inputMap = this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosTipoFlujoEfectivo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonGuardarCambiosTipoFlujoEfectivo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoFlujoEfectivo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoFlujoEfectivoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoFlujoEfectivo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoFlujoEfectivoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoFlujoEfectivoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoFlujoEfectivo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoFlujoEfectivoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonidTipoFlujoEfectivoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFlujoEfectivoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonid_empresaTipoFlujoEfectivoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoFlujoEfectivoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonid_empresaTipoFlujoEfectivoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoFlujoEfectivoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jButtonnombreTipoFlujoEfectivoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFlujoEfectivoBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoFlujoEfectivo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoFlujoEfectivo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoFlujoEfectivo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoFlujoEfectivoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoFlujoEfectivoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoFlujoEfectivo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoFlujoEfectivo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
					tipoflujoefectivoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivos) {
					tipoflujoefectivoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoFlujoEfectivoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
						tipoflujoefectivoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivos) {
						tipoflujoefectivoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFlujoEfectivo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFlujoEfectivo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFlujoEfectivo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoFlujoEfectivoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoFlujoEfectivo.getSelectedRows();
			
			TipoFlujoEfectivo tipoflujoefectivoLocal=new TipoFlujoEfectivo();
			
			//this.seleccionarTodosTipoFlujoEfectivo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoflujoefectivoLocal =(TipoFlujoEfectivo) this.tipoflujoefectivoLogic.getTipoFlujoEfectivos().toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoflujoefectivoLocal =(TipoFlujoEfectivo) this.tipoflujoefectivos.toArray()[this.jTableDatosTipoFlujoEfectivo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoflujoefectivoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
						tipoflujoefectivoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivos) {
						tipoflujoefectivoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFlujoEfectivo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFlujoEfectivo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFlujoEfectivo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoFlujoEfectivoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoFlujoEfectivoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoFlujoEfectivoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoFlujoEfectivo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
				
						if(sTipoSeleccionar.equals(TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoflujoefectivoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivos) {
					
						if(sTipoSeleccionar.equals(TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoflujoefectivoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoFlujoEfectivoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoFlujoEfectivo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoFlujoEfectivo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoFlujoEfectivo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoFlujoEfectivo(conSplash);
				
					this.generarReporteTipoFlujoEfectivosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoFlujoEfectivosSeleccionados();
				//this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFlujoEfectivosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFlujoEfectivosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFlujoEfectivo();
				
				this.exportarTipoFlujoEfectivosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoFlujoEfectivos();
				//this.importarTipoFlujoEfectivos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFlujoEfectivo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoFlujoEfectivosSeleccionados();
				//this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Flujo Efectivo ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoFlujoEfectivo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoFlujoEfectivo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoFlujoEfectivo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Flujo Efectivo ",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoFlujoEfectivoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoFlujoEfectivo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoFlujoEfectivo(conSplash);
					
						//this.actualizarParametrosGeneralTipoFlujoEfectivo();
						
						this.generarReporteProcesoAccionTipoFlujoEfectivosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Flujo Efectivo S SELECCIONADOS?", "MANTENIMIENTO DE Tipo Flujo Efectivo ", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoFlujoEfectivo();
				
						this.actualizarParametrosGeneralTipoFlujoEfectivo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoflujoefectivoReturnGeneral=tipoflujoefectivoLogic.procesarAccionTipoFlujoEfectivosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoflujoefectivoLogic.getTipoFlujoEfectivos(),this.tipoflujoefectivoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoFlujoEfectivoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoFlujoEfectivo();
					
					TipoFlujoEfectivoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoFlujoEfectivoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoFlujoEfectivo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxTiposAccionesFormularioTipoFlujoEfectivo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoFlujoEfectivo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoFlujoEfectivoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoFlujoEfectivo();
			
			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();		
			TipoFlujoEfectivo tipoflujoefectivo=new TipoFlujoEfectivo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoFlujoEfectivo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoFlujoEfectivo.getSelectedItem();
			
			
			
			
			tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoflujoefectivosSeleccionados.size()==1) {
				for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivosSeleccionados) {
					tipoflujoefectivo=tipoflujoefectivoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cuenta Contable")) {
					jButtonCuentaContableActionPerformed(null,rowIndex,true,false,tipoflujoefectivo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoFlujoEfectivo();
			
      		//this.finishProcessTipoFlujoEfectivo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoFlujoEfectivoReturnGeneral() throws Exception {
		if(this.tipoflujoefectivoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoflujoefectivoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoflujoefectivoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoflujoefectivoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoflujoefectivoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoflujoefectivoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoFlujoEfectivo(false);
		}
		
		if(this.tipoflujoefectivoReturnGeneral.getConRetornoLista() || this.tipoflujoefectivoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoflujoefectivoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoflujoefectivoLogic.setTipoFlujoEfectivos(this.tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoflujoefectivoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoflujoefectivoLogic.setTipoFlujoEfectivo(this.tipoflujoefectivoReturnGeneral.getTipoFlujoEfectivo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoFlujoEfectivo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoFlujoEfectivo() throws Exception {
		
		
	}
	
	public ArrayList<TipoFlujoEfectivo> getTipoFlujoEfectivosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoFlujoEfectivo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivoLogic.getTipoFlujoEfectivos()) {
					if(tipoflujoefectivoAux.getIsSelected()) {
						tipoflujoefectivosSeleccionados.add(tipoflujoefectivoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFlujoEfectivo tipoflujoefectivoAux:this.tipoflujoefectivos) {
					if(tipoflujoefectivoAux.getIsSelected()) {
						tipoflujoefectivosSeleccionados.add(tipoflujoefectivoAux);				
					}
				}
			}
			
			if(tipoflujoefectivosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoflujoefectivosSeleccionados.addAll(this.tipoflujoefectivoLogic.getTipoFlujoEfectivos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoflujoefectivosSeleccionados.addAll(this.tipoflujoefectivos);				
					}
				}
			}
		} else {
			tipoflujoefectivosSeleccionados.add(this.tipoflujoefectivo);
		}
		
		return tipoflujoefectivosSeleccionados;
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
	
	public void generarReporteTipoFlujoEfectivosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoFlujoEfectivosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoFlujoEfectivosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFlujoEfectivosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFlujoEfectivosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoFlujoEfectivosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Flujo Efectivo ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoFlujoEfectivosSeleccionados() throws Exception {
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();		
		
		tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoFlujoEfectivos("Todos",tipoflujoefectivosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoFlujoEfectivosSeleccionados() throws Exception {
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();		
		
		tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoFlujoEfectivos("Todos",tipoflujoefectivosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoFlujoEfectivosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();
		
		tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoFlujoEfectivos("Todos",tipoflujoefectivosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoFlujoEfectivosSeleccionados() throws Exception {
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoFlujoEfectivo();
		
		
		tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoFlujoEfectivo();
		
		
		//this.generarReporteTipoFlujoEfectivos("Todos",tipoflujoefectivosSeleccionados ,tipoflujoefectivoImplementable,tipoflujoefectivoImplementableHome);
	}
	
	public void mostrarImportacionTipoFlujoEfectivos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoFlujoEfectivo();
		
		this.abrirFrameImportacionTipoFlujoEfectivo();		
		
			
		//this.generarReporteTipoFlujoEfectivos("Todos",tipoflujoefectivosSeleccionados ,tipoflujoefectivoImplementable,tipoflujoefectivoImplementableHome);
	}
	
	public void importarTipoFlujoEfectivos() throws Exception {		
	
	}
	
	public void exportarTipoFlujoEfectivosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoFlujoEfectivosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoFlujoEfectivosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoFlujoEfectivosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Flujo Efectivo ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoFlujoEfectivosSeleccionados() throws Exception {
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();		
		
		tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoflujoefectivo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoFlujoEfectivo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoFlujoEfectivo(tipoflujoefectivoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoflujoefectivoAux.setsDetalleGeneralEntityReporte(tipoflujoefectivoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Flujo Efectivo ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoFlujoEfectivo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoFlujoEfectivoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFlujoEfectivoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoflujoefectivo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoflujoefectivo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoflujoefectivo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoflujoefectivo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoFlujoEfectivosSeleccionados() throws Exception {
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();		
		
		tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoflujoefectivo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoFlujoEfectivos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoFlujoEfectivo(row);				
				iRow++;
			}				
			
			for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoFlujoEfectivo(tipoflujoefectivoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Flujo Efectivo ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoFlujoEfectivosSeleccionados() throws Exception {
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();		
		
		tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoflujoefectivo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoflujoefectivos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoflujoefectivo");
			//elementRoot.appendChild(element);
		
			for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivosSeleccionados) {
				element = document.createElement("tipoflujoefectivo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoFlujoEfectivo(tipoflujoefectivoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Flujo Efectivo ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoFlujoEfectivo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFlujoEfectivoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFlujoEfectivoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoflujoefectivo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoflujoefectivo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoflujoefectivo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoFlujoEfectivo(TipoFlujoEfectivo tipoflujoefectivo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoFlujoEfectivoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoflujoefectivo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoFlujoEfectivoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoflujoefectivo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoFlujoEfectivoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoflujoefectivo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoFlujoEfectivoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoflujoefectivo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoFlujoEfectivosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados=new ArrayList<TipoFlujoEfectivo>();
		
		tipoflujoefectivosSeleccionados=this.getTipoFlujoEfectivosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoFlujoEfectivo(tipoflujoefectivosSeleccionados);
		
		this.generarReporteTipoFlujoEfectivos("Todos",tipoflujoefectivosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoFlujoEfectivo(ArrayList<TipoFlujoEfectivo> tipoflujoefectivosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoFlujoEfectivo tipoflujoefectivoAux:tipoflujoefectivosSeleccionados) {
				tipoflujoefectivoAux.setsDetalleGeneralEntityReporte(tipoflujoefectivoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoFlujoEfectivoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoflujoefectivoAux.setsDescripcionGeneralEntityReporte1(tipoflujoefectivoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoFlujoEfectivoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoflujoefectivoAux.setsDescripcionGeneralEntityReporte1(tipoflujoefectivoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFlujoEfectivoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoFlujoEfectivo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaModificarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaModificarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaModificarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaModificarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaModificarTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaCancelarTipoFlujoEfectivo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFlujoEfectivo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoFlujoEfectivoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=true;
		} else {
			this.actualizarEstadoPanelsTipoFlujoEfectivo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoFlujoEfectivo=false;
			//this.isVisibilidadCeldaVerFormTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaDuplicarTipoFlujoEfectivo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoflujoefectivoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=false;												
			}
			
			this.jButtonCerrarTipoFlujoEfectivo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFlujoEfectivo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoflujoefectivo)) {
			this.isVisibilidadCeldaActualizarTipoFlujoEfectivo=false;
			this.isVisibilidadCeldaEliminarTipoFlujoEfectivo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFlujoEfectivo() {
		this.isVisibilidadCeldaNuevoTipoFlujoEfectivo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoFlujoEfectivo=false;
	}
	
	public void actualizarEstadoPanelsTipoFlujoEfectivo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFlujoEfectivo!=null) {
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosTipoFlujoEfectivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFlujoEfectivo!=null) {
				this.jPanelPaginacionTipoFlujoEfectivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFlujoEfectivo!=null) {
				this.jPanelParametrosReportesTipoFlujoEfectivo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFlujoEfectivo!=null) {
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosTipoFlujoEfectivo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFlujoEfectivo!=null) {
				this.jPanelPaginacionTipoFlujoEfectivo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFlujoEfectivo!=null) {
				this.jPanelParametrosReportesTipoFlujoEfectivo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFlujoEfectivo!=null) {
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosTipoFlujoEfectivo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFlujoEfectivo!=null) {
				this.jPanelPaginacionTipoFlujoEfectivo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFlujoEfectivo!=null) {
				this.jPanelParametrosReportesTipoFlujoEfectivo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFlujoEfectivo!=null) {
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosTipoFlujoEfectivo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFlujoEfectivo!=null) {
				this.jPanelPaginacionTipoFlujoEfectivo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFlujoEfectivo!=null) {
				this.jPanelParametrosReportesTipoFlujoEfectivo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFlujoEfectivo!=null) {
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosTipoFlujoEfectivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFlujoEfectivo!=null) {
				this.jPanelPaginacionTipoFlujoEfectivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFlujoEfectivo!=null) {
				this.jPanelParametrosReportesTipoFlujoEfectivo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFlujoEfectivo!=null) {
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosTipoFlujoEfectivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFlujoEfectivo!=null) {
				this.jPanelPaginacionTipoFlujoEfectivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFlujoEfectivo!=null) {
				this.jPanelParametrosReportesTipoFlujoEfectivo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosEdicionTipoFlujoEfectivo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFlujoEfectivo!=null) {
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFlujoEfectivo!=null) {
				this.jScrollPanelDatosTipoFlujoEfectivo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFlujoEfectivo!=null) {
				this.jPanelPaginacionTipoFlujoEfectivo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFlujoEfectivo!=null) {
				this.jPanelParametrosReportesTipoFlujoEfectivo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoFlujoEfectivo!=null) {
					this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoFlujoEfectivo!=null) {
				this.jPanelParametrosReportesTipoFlujoEfectivo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoflujoefectivoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFlujoEfectivo!=null) {
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoFlujoEfectivo!=null) {
				this.jPanelParametrosReportesTipoFlujoEfectivo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoFlujoEfectivo.remove(jPanelBusquedaPorNombreTipoFlujoEfectivo);}
		}
		
	}
	
	

	public String registrarSesionTipoFlujoEfectivoParaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(this.tipoflujoefectivoSessionBean==null) {
				this.tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableSessionBean==null) {
				this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableSessionBean.setsPathNavegacionActual(tipoflujoefectivoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuentaContable=this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(TipoFlujoEfectivoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionTipoFlujoEfectivo(true);
			this.jInternalFrameDetalleFormTipoFlujoEfectivo.cuentacontableSessionBean.setlidTipoFlujoEfectivoActual(this.idTipoFlujoEfectivoActual);

			tipoflujoefectivoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoFlujoEfectivo(true);
			tipoflujoefectivoSessionBean.setlIdTipoFlujoEfectivoActualForeignKey(this.idTipoFlujoEfectivoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoFlujoEfectivoSessionBean tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
		
		if(this.tipoflujoefectivoSessionBean==null) {
			this.tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
		}
		
		this.tipoflujoefectivoSessionBean.setsUltimaBusquedaTipoFlujoEfectivo(this.getsAccionBusqueda());
		this.tipoflujoefectivoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoflujoefectivoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoflujoefectivoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoflujoefectivoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoFlujoEfectivoSessionBean tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
		
		if(this.tipoflujoefectivoSessionBean==null) {
			this.tipoflujoefectivoSessionBean=new TipoFlujoEfectivoSessionBean();
		}
		
		if(this.tipoflujoefectivoSessionBean.getsUltimaBusquedaTipoFlujoEfectivo()!=null&&!this.tipoflujoefectivoSessionBean.getsUltimaBusquedaTipoFlujoEfectivo().equals("")) {
			this.setsAccionBusqueda(tipoflujoefectivoSessionBean.getsUltimaBusquedaTipoFlujoEfectivo());
			this.setiNumeroPaginacion(tipoflujoefectivoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoflujoefectivoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoflujoefectivoSessionBean.getnombre());
				tipoflujoefectivoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoflujoefectivoSessionBean.getid_empresa());
				tipoflujoefectivoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoflujoefectivoSessionBean.setsUltimaBusquedaTipoFlujoEfectivo("");
		this.tipoflujoefectivoSessionBean.setiNumeroPaginacion(TipoFlujoEfectivoConstantesFunciones.INUMEROPAGINACION);
		this.tipoflujoefectivoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoFlujoEfectivo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoFlujoEfectivo() {
		this.updateBorderResaltarBusquedasFormularioTipoFlujoEfectivo();
		this.updateVisibilidadBusquedasFormularioTipoFlujoEfectivo();
		this.updateHabilitarBusquedasFormularioTipoFlujoEfectivo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoFlujoEfectivo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoFlujoEfectivo.getComponents().length>0) {
	

		if(this.tipoflujoefectivoConstantesFunciones.resaltarBusquedaPorNombreTipoFlujoEfectivo!=null) {
			index= this.jTabbedPaneBusquedasTipoFlujoEfectivo.indexOfComponent(this.jPanelBusquedaPorNombreTipoFlujoEfectivo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFlujoEfectivo.getComponent(index);
				jPanel.setBorder(this.tipoflujoefectivoConstantesFunciones.resaltarBusquedaPorNombreTipoFlujoEfectivo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoFlujoEfectivo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoFlujoEfectivo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoFlujoEfectivo.indexOfComponent(this.jPanelBusquedaPorNombreTipoFlujoEfectivo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFlujoEfectivo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoflujoefectivoConstantesFunciones.mostrarBusquedaPorNombreTipoFlujoEfectivo);
			if(!this.tipoflujoefectivoConstantesFunciones.mostrarBusquedaPorNombreTipoFlujoEfectivo && index>-1) {
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoFlujoEfectivo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoFlujoEfectivo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoFlujoEfectivo.indexOfComponent(this.jPanelBusquedaPorNombreTipoFlujoEfectivo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFlujoEfectivo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoflujoefectivoConstantesFunciones.activarBusquedaPorNombreTipoFlujoEfectivo);
				this.jTabbedPaneBusquedasTipoFlujoEfectivo.setEnabledAt(index,this.tipoflujoefectivoConstantesFunciones.activarBusquedaPorNombreTipoFlujoEfectivo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoFlujoEfectivo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoFlujoEfectivo.indexOfComponent(this.jPanelBusquedaPorNombreTipoFlujoEfectivo);

			this.jTabbedPaneBusquedasTipoFlujoEfectivo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFlujoEfectivo.getComponent(index);

			this.tipoflujoefectivoConstantesFunciones.setResaltarBusquedaPorNombreTipoFlujoEfectivo(resaltar);

			jPanel.setBorder(this.tipoflujoefectivoConstantesFunciones.resaltarBusquedaPorNombreTipoFlujoEfectivo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoFlujoEfectivo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoFlujoEfectivo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoFlujoEfectivo();
		this.updateVisibilidadResaltarControlesFormularioTipoFlujoEfectivo();
		this.updateHabilitarResaltarControlesFormularioTipoFlujoEfectivo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoFlujoEfectivo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoflujoefectivoConstantesFunciones.resaltaridTipoFlujoEfectivo!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.setBorder(this.tipoflujoefectivoConstantesFunciones.resaltaridTipoFlujoEfectivo);}
		if(this.tipoflujoefectivoConstantesFunciones.resaltarid_empresaTipoFlujoEfectivo!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.setBorder(this.tipoflujoefectivoConstantesFunciones.resaltarid_empresaTipoFlujoEfectivo);}
		if(this.tipoflujoefectivoConstantesFunciones.resaltarnombreTipoFlujoEfectivo!=null && this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTextAreanombreTipoFlujoEfectivo.setBorder(this.tipoflujoefectivoConstantesFunciones.resaltarnombreTipoFlujoEfectivo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoFlujoEfectivo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
	
		//this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.setVisible(this.tipoflujoefectivoConstantesFunciones.mostraridTipoFlujoEfectivo);
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jPanelidTipoFlujoEfectivo.setVisible(this.tipoflujoefectivoConstantesFunciones.mostraridTipoFlujoEfectivo);
		//this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.setVisible(this.tipoflujoefectivoConstantesFunciones.mostrarid_empresaTipoFlujoEfectivo);
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jPanelid_empresaTipoFlujoEfectivo.setVisible(this.tipoflujoefectivoConstantesFunciones.mostrarid_empresaTipoFlujoEfectivo);
		//this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTextAreanombreTipoFlujoEfectivo.setVisible(this.tipoflujoefectivoConstantesFunciones.mostrarnombreTipoFlujoEfectivo);
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jPanelnombreTipoFlujoEfectivo.setVisible(this.tipoflujoefectivoConstantesFunciones.mostrarnombreTipoFlujoEfectivo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoFlujoEfectivo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFlujoEfectivo!=null) {
	
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jLabelidTipoFlujoEfectivo.setEnabled(this.tipoflujoefectivoConstantesFunciones.activaridTipoFlujoEfectivo);
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jComboBoxid_empresaTipoFlujoEfectivo.setEnabled(this.tipoflujoefectivoConstantesFunciones.activarid_empresaTipoFlujoEfectivo);
		this.jInternalFrameDetalleFormTipoFlujoEfectivo.jTextAreanombreTipoFlujoEfectivo.setEnabled(this.tipoflujoefectivoConstantesFunciones.activarnombreTipoFlujoEfectivo);
		}
	}
	
		
}