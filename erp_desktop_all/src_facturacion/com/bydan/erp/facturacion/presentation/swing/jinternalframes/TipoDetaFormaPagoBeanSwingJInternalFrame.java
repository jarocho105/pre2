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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TipoDetaFormaPagoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoDetaFormaPagoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoDetaFormaPagoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoDetaFormaPagoBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoDetaFormaPagoBeanSwingJInternalFrame extends TipoDetaFormaPagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDetaFormaPagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDetaFormaPago> tipodetaformapagoValidator = new ClassValidator<TipoDetaFormaPago>(TipoDetaFormaPago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDetaFormaPago tipodetaformapago;	
	public TipoDetaFormaPago tipodetaformapagoAux;
	public TipoDetaFormaPago tipodetaformapagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDetaFormaPago tipodetaformapagoTotales;
	public Long idTipoDetaFormaPagoActual;
	public Long iIdNuevoTipoDetaFormaPago=0L;
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
	
	public Boolean isPermisoTodoTipoDetaFormaPago;
	public Boolean isPermisoNuevoTipoDetaFormaPago;
	public Boolean isPermisoActualizarTipoDetaFormaPago;
	public Boolean isPermisoActualizarOriginalTipoDetaFormaPago;
	public Boolean isPermisoEliminarTipoDetaFormaPago;
	public Boolean isPermisoGuardarCambiosTipoDetaFormaPago;
	public Boolean isPermisoConsultaTipoDetaFormaPago;
	public Boolean isPermisoBusquedaTipoDetaFormaPago;
	public Boolean isPermisoReporteTipoDetaFormaPago;
	public Boolean isPermisoPaginacionMedioTipoDetaFormaPago;
	public Boolean isPermisoPaginacionAltoTipoDetaFormaPago;
	public Boolean isPermisoPaginacionTodoTipoDetaFormaPago;
	public Boolean isPermisoCopiarTipoDetaFormaPago;
	public Boolean isPermisoVerFormTipoDetaFormaPago;
	public Boolean isPermisoDuplicarTipoDetaFormaPago;
	public Boolean isPermisoOrdenTipoDetaFormaPago;
	
	
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
	
	public TipoDetaFormaPagoParameterReturnGeneral tipodetaformapagoReturnGeneral;
	public TipoDetaFormaPagoParameterReturnGeneral tipodetaformapagoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDetaFormaPago=false;
	public Boolean esParaAccionDesdeFormularioTipoDetaFormaPago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoDetaFormaPagoSessionBeanAdditional tipodetaformapagoSessionBeanAdditional=null;
	
	public TipoDetaFormaPagoSessionBeanAdditional getTipoDetaFormaPagoSessionBeanAdditional() {
		return this.tipodetaformapagoSessionBeanAdditional;
	}
	
	public void setTipoDetaFormaPagoSessionBeanAdditional(TipoDetaFormaPagoSessionBeanAdditional tipodetaformapagoSessionBeanAdditional) {
		try {
			this.tipodetaformapagoSessionBeanAdditional=tipodetaformapagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoDetaFormaPagoBeanSwingJInternalFrameAdditional tipodetaformapagoBeanSwingJInternalFrameAdditional=null;
	//public class TipoDetaFormaPagoBeanSwingJInternalFrame
	
	public TipoDetaFormaPagoBeanSwingJInternalFrameAdditional getTipoDetaFormaPagoBeanSwingJInternalFrameAdditional() {
		return this.tipodetaformapagoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoDetaFormaPagoBeanSwingJInternalFrameAdditional(TipoDetaFormaPagoBeanSwingJInternalFrameAdditional tipodetaformapagoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipodetaformapagoBeanSwingJInternalFrameAdditional=tipodetaformapagoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDetaFormaPagoLogic tipodetaformapagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDetaFormaPago tipodetaformapagoBean;
	public TipoDetaFormaPagoConstantesFunciones tipodetaformapagoConstantesFunciones;
	//public TipoDetaFormaPagoParameterReturnGeneral tipodetaformapagoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDetaFormaPago> tipodetaformapagos;	
	//public List<TipoDetaFormaPago> tipodetaformapagosEliminados;
	//public List<TipoDetaFormaPago> tipodetaformapagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDetaFormaPago=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDetaFormaPago=true;
	public Boolean isVisibilidadCeldaCopiarTipoDetaFormaPago=true;
	public Boolean isVisibilidadCeldaVerFormTipoDetaFormaPago=true;
	public Boolean isVisibilidadCeldaOrdenTipoDetaFormaPago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=false;
	public Boolean isVisibilidadCeldaModificarTipoDetaFormaPago=false;
	public Boolean isVisibilidadCeldaActualizarTipoDetaFormaPago=false;
	public Boolean isVisibilidadCeldaEliminarTipoDetaFormaPago=false;
	public Boolean isVisibilidadCeldaCancelarTipoDetaFormaPago=false;
	public Boolean isVisibilidadCeldaGuardarTipoDetaFormaPago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoDetaFormaPago() {
		return this.iIdNuevoTipoDetaFormaPago;
	}

	public void setiIdNuevoTipoDetaFormaPago(Long iIdNuevoTipoDetaFormaPago) {
		this.iIdNuevoTipoDetaFormaPago = iIdNuevoTipoDetaFormaPago;
	}
	
	public Long getidTipoDetaFormaPagoActual() {
		return this.idTipoDetaFormaPagoActual;
	}

	public void setidTipoDetaFormaPagoActual(Long idTipoDetaFormaPagoActual) {
		this.idTipoDetaFormaPagoActual = idTipoDetaFormaPagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDetaFormaPago gettipodetaformapago() {
		return this.tipodetaformapago;
	}

	public void settipodetaformapago(TipoDetaFormaPago tipodetaformapago) {
		this.tipodetaformapago = tipodetaformapago;
	}
	
	public TipoDetaFormaPago gettipodetaformapagoAux() {
		return this.tipodetaformapagoAux;
	}

	public void settipodetaformapagoAux(TipoDetaFormaPago tipodetaformapagoAux) {
		this.tipodetaformapagoAux = tipodetaformapagoAux;
	}				
	
	public TipoDetaFormaPago gettipodetaformapagoAnterior() {
		return this.tipodetaformapagoAnterior;
	}

	public void settipodetaformapagoAnterior(TipoDetaFormaPago tipodetaformapagoAnterior) {
		this.tipodetaformapagoAnterior = tipodetaformapagoAnterior;
	}	
	
	public TipoDetaFormaPago gettipodetaformapagoTotales() {
		return this.tipodetaformapagoTotales;
	}

	public void settipodetaformapagoTotales(TipoDetaFormaPago tipodetaformapagoTotales) {
		this.tipodetaformapagoTotales = tipodetaformapagoTotales;
	}	
	
	public TipoDetaFormaPago gettipodetaformapagoBean() {
		return this.tipodetaformapagoBean;
	}

	public void settipodetaformapagoBean(TipoDetaFormaPago tipodetaformapagoBean) {
		this.tipodetaformapagoBean = tipodetaformapagoBean;
	}	
	
	public TipoDetaFormaPagoParameterReturnGeneral gettipodetaformapagoReturnGeneral() {
		return this.tipodetaformapagoReturnGeneral;
	}

	public void settipodetaformapagoReturnGeneral(TipoDetaFormaPagoParameterReturnGeneral tipodetaformapagoReturnGeneral) {
		this.tipodetaformapagoReturnGeneral = tipodetaformapagoReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
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
	
	
	public TipoDetaFormaPagoLogic getTipoDetaFormaPagoLogic()	{		
		return tipodetaformapagoLogic;
	}

	public void setTipoDetaFormaPagoLogic(TipoDetaFormaPagoLogic tipodetaformapagoLogic) {
		this.tipodetaformapagoLogic = tipodetaformapagoLogic;
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
	
	public Boolean getIsEsNuevoTipoDetaFormaPago() {
		return isEsNuevoTipoDetaFormaPago;
	}

	public void setIsEsNuevoTipoDetaFormaPago(Boolean isEsNuevoTipoDetaFormaPago) {
		this.isEsNuevoTipoDetaFormaPago = isEsNuevoTipoDetaFormaPago;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDetaFormaPago() {
		return esParaAccionDesdeFormularioTipoDetaFormaPago;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDetaFormaPago(Boolean esParaAccionDesdeFormularioTipoDetaFormaPago) {
		this.esParaAccionDesdeFormularioTipoDetaFormaPago = esParaAccionDesdeFormularioTipoDetaFormaPago;
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

			if(this.tipodetaformapagoSessionBean==null) {
				this.tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean();
			}

			if(!this.tipodetaformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipodetaformapagoSessionBean.getlidEmpresaActual());
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

					if(this.tipodetaformapago!=null) {
						this.tipodetaformapago.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
						this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoDetaFormaPago.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
						if(this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoDetaFormaPagoGenerico)throws Exception
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
				jComboBoxid_empresaTipoDetaFormaPagoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoDetaFormaPagoGenerico!=null && jComboBoxid_empresaTipoDetaFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoDetaFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoDetaFormaPago tipodetaformapago,JComboBox jComboBoxid_empresaTipoDetaFormaPagoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoDetaFormaPagoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoDetaFormaPagoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipodetaformapago.setid_empresa(empresaAux.getId());
				tipodetaformapago.setempresa_descripcion(TipoDetaFormaPagoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipodetaformapago.setEmpresa(empresaAux);			}
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

					if(!TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { 
							this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { 
					}

					if(!TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
							this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
							this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoDetaFormaPago() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDetaFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesTipoDetaFormaPago(this.tipodetaformapagoLogic.getTipoDetaFormaPagos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDetaFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesTipoDetaFormaPago(this.tipodetaformapagos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodetaformapagoLogic.setTipoDetaFormaPagos(this.tipodetaformapagos);
			tipodetaformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDetaFormaPagoParameterReturnGeneral getTipoDetaFormaPagoParameterGeneral() {
		return this.tipodetaformapagoParameterGeneral;
	}
	
	public void setTipoDetaFormaPagoParameterGeneral(TipoDetaFormaPagoParameterReturnGeneral tipodetaformapagoParameterGeneral) {
		this.tipodetaformapagoParameterGeneral = tipodetaformapagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDetaFormaPago() {
		return isPermisoTodoTipoDetaFormaPago;
	}

	public void setIsPermisoTodoTipoDetaFormaPago(Boolean isPermisoTodoTipoDetaFormaPago) {
		this.isPermisoTodoTipoDetaFormaPago = isPermisoTodoTipoDetaFormaPago;
	}

	public Boolean getIsPermisoNuevoTipoDetaFormaPago() {
		return isPermisoNuevoTipoDetaFormaPago;
	}

	public void setIsPermisoNuevoTipoDetaFormaPago(Boolean isPermisoNuevoTipoDetaFormaPago) {
		this.isPermisoNuevoTipoDetaFormaPago = isPermisoNuevoTipoDetaFormaPago;
	}

	public Boolean getIsPermisoActualizarTipoDetaFormaPago() {
		return isPermisoActualizarTipoDetaFormaPago;
	}

	public void setIsPermisoActualizarTipoDetaFormaPago(Boolean isPermisoActualizarTipoDetaFormaPago) {
		this.isPermisoActualizarTipoDetaFormaPago = isPermisoActualizarTipoDetaFormaPago;
	}

	public Boolean getIsPermisoEliminarTipoDetaFormaPago() {
		return isPermisoEliminarTipoDetaFormaPago;
	}

	public void setIsPermisoEliminarTipoDetaFormaPago(Boolean isPermisoEliminarTipoDetaFormaPago) {
		this.isPermisoEliminarTipoDetaFormaPago = isPermisoEliminarTipoDetaFormaPago;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDetaFormaPago() {
		return isPermisoGuardarCambiosTipoDetaFormaPago;
	}

	public void setIsPermisoGuardarCambiosTipoDetaFormaPago(Boolean isPermisoGuardarCambiosTipoDetaFormaPago) {
		this.isPermisoGuardarCambiosTipoDetaFormaPago = isPermisoGuardarCambiosTipoDetaFormaPago;
	}
	
	public Boolean getIsPermisoConsultaTipoDetaFormaPago() {
		return isPermisoConsultaTipoDetaFormaPago;
	}

	public void setIsPermisoConsultaTipoDetaFormaPago(Boolean isPermisoConsultaTipoDetaFormaPago) {
		this.isPermisoConsultaTipoDetaFormaPago = isPermisoConsultaTipoDetaFormaPago;
	}

	public Boolean getIsPermisoBusquedaTipoDetaFormaPago() {
		return isPermisoBusquedaTipoDetaFormaPago;
	}

	public void setIsPermisoBusquedaTipoDetaFormaPago(Boolean isPermisoBusquedaTipoDetaFormaPago) {
		this.isPermisoBusquedaTipoDetaFormaPago = isPermisoBusquedaTipoDetaFormaPago;
	}

	public Boolean getIsPermisoReporteTipoDetaFormaPago() {
		return isPermisoReporteTipoDetaFormaPago;
	}

	public void setIsPermisoReporteTipoDetaFormaPago(Boolean isPermisoReporteTipoDetaFormaPago) {
		this.isPermisoReporteTipoDetaFormaPago = isPermisoReporteTipoDetaFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDetaFormaPago() {
		return isPermisoPaginacionMedioTipoDetaFormaPago;
	}

	public void setIsPermisoPaginacionMedioTipoDetaFormaPago(Boolean isPermisoPaginacionMedioTipoDetaFormaPago) {
		this.isPermisoPaginacionMedioTipoDetaFormaPago = isPermisoPaginacionMedioTipoDetaFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDetaFormaPago() {
		return isPermisoPaginacionTodoTipoDetaFormaPago;
	}

	public void setIsPermisoPaginacionTodoTipoDetaFormaPago(Boolean isPermisoPaginacionTodoTipoDetaFormaPago) {
		this.isPermisoPaginacionTodoTipoDetaFormaPago = isPermisoPaginacionTodoTipoDetaFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDetaFormaPago() {
		return isPermisoPaginacionAltoTipoDetaFormaPago;
	}

	public void setIsPermisoPaginacionAltoTipoDetaFormaPago(Boolean isPermisoPaginacionAltoTipoDetaFormaPago) {
		this.isPermisoPaginacionAltoTipoDetaFormaPago = isPermisoPaginacionAltoTipoDetaFormaPago;
	}
	
	public Boolean getIsPermisoCopiarTipoDetaFormaPago() {
		return isPermisoCopiarTipoDetaFormaPago;
	}

	public void setIsPermisoCopiarTipoDetaFormaPago(Boolean isPermisoCopiarTipoDetaFormaPago) {
		this.isPermisoCopiarTipoDetaFormaPago = isPermisoCopiarTipoDetaFormaPago;
	}
	
	public Boolean getIsPermisoVerFormTipoDetaFormaPago() {
		return isPermisoVerFormTipoDetaFormaPago;
	}

	public void setIsPermisoVerFormTipoDetaFormaPago(Boolean isPermisoVerFormTipoDetaFormaPago) {
		this.isPermisoVerFormTipoDetaFormaPago = isPermisoVerFormTipoDetaFormaPago;
	}
	
	public Boolean getIsPermisoDuplicarTipoDetaFormaPago() {
		return isPermisoDuplicarTipoDetaFormaPago;
	}

	public void setIsPermisoDuplicarTipoDetaFormaPago(Boolean isPermisoDuplicarTipoDetaFormaPago) {
		this.isPermisoDuplicarTipoDetaFormaPago = isPermisoDuplicarTipoDetaFormaPago;
	}
	
	public Boolean getIsPermisoOrdenTipoDetaFormaPago() {
		return isPermisoOrdenTipoDetaFormaPago;
	}

	public void setIsPermisoOrdenTipoDetaFormaPago(Boolean isPermisoOrdenTipoDetaFormaPago) {
		this.isPermisoOrdenTipoDetaFormaPago = isPermisoOrdenTipoDetaFormaPago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDetaFormaPago() {
		return isVisibilidadCeldaNuevoTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoTipoDetaFormaPago(Boolean isVisibilidadCeldaNuevoTipoDetaFormaPago) {
		this.isVisibilidadCeldaNuevoTipoDetaFormaPago = isVisibilidadCeldaNuevoTipoDetaFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDetaFormaPago() {
		return isVisibilidadCeldaDuplicarTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDetaFormaPago(Boolean isVisibilidadCeldaDuplicarTipoDetaFormaPago) {
		this.isVisibilidadCeldaDuplicarTipoDetaFormaPago = isVisibilidadCeldaDuplicarTipoDetaFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDetaFormaPago() {
		return isVisibilidadCeldaCopiarTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaCopiarTipoDetaFormaPago(Boolean isVisibilidadCeldaCopiarTipoDetaFormaPago) {
		this.isVisibilidadCeldaCopiarTipoDetaFormaPago = isVisibilidadCeldaCopiarTipoDetaFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDetaFormaPago() {
		return isVisibilidadCeldaVerFormTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaVerFormTipoDetaFormaPago(Boolean isVisibilidadCeldaVerFormTipoDetaFormaPago) {
		this.isVisibilidadCeldaVerFormTipoDetaFormaPago = isVisibilidadCeldaVerFormTipoDetaFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDetaFormaPago() {
		return isVisibilidadCeldaOrdenTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaOrdenTipoDetaFormaPago(Boolean isVisibilidadCeldaOrdenTipoDetaFormaPago) {
		this.isVisibilidadCeldaOrdenTipoDetaFormaPago = isVisibilidadCeldaOrdenTipoDetaFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago() {
		return isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago(Boolean isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago = isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDetaFormaPago() {
		return isVisibilidadCeldaModificarTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaModificarTipoDetaFormaPago(Boolean isVisibilidadCeldaModificarTipoDetaFormaPago) {
		this.isVisibilidadCeldaModificarTipoDetaFormaPago = isVisibilidadCeldaModificarTipoDetaFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDetaFormaPago() {
		return isVisibilidadCeldaActualizarTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaActualizarTipoDetaFormaPago(Boolean isVisibilidadCeldaActualizarTipoDetaFormaPago) {
		this.isVisibilidadCeldaActualizarTipoDetaFormaPago = isVisibilidadCeldaActualizarTipoDetaFormaPago;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDetaFormaPago() {
		return isVisibilidadCeldaEliminarTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaEliminarTipoDetaFormaPago(Boolean isVisibilidadCeldaEliminarTipoDetaFormaPago) {
		this.isVisibilidadCeldaEliminarTipoDetaFormaPago = isVisibilidadCeldaEliminarTipoDetaFormaPago;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDetaFormaPago() {
		return isVisibilidadCeldaCancelarTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaCancelarTipoDetaFormaPago(Boolean isVisibilidadCeldaCancelarTipoDetaFormaPago) {
		this.isVisibilidadCeldaCancelarTipoDetaFormaPago = isVisibilidadCeldaCancelarTipoDetaFormaPago;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDetaFormaPago() {
		return isVisibilidadCeldaGuardarTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarTipoDetaFormaPago(Boolean isVisibilidadCeldaGuardarTipoDetaFormaPago) {
		this.isVisibilidadCeldaGuardarTipoDetaFormaPago = isVisibilidadCeldaGuardarTipoDetaFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDetaFormaPago() {
		return isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDetaFormaPago(Boolean isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago) {
		this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago = isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago;
	}
		
	public TipoDetaFormaPagoSessionBean gettipodetaformapagoSessionBean() {
		return this.tipodetaformapagoSessionBean;
	}
	
	public void settipodetaformapagoSessionBean(TipoDetaFormaPagoSessionBean tipodetaformapagoSessionBean) {
		this.tipodetaformapagoSessionBean=tipodetaformapagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipodetaformapago,null);
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
	
	public void bugActualizarReferenciaActual(TipoDetaFormaPago tipodetaformapago,TipoDetaFormaPago tipodetaformapagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDetaFormaPago(tipodetaformapago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodetaformapagoAux.setId(tipodetaformapago.getId());
		tipodetaformapagoAux.setVersionRow(tipodetaformapago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDetaFormaPago();
		
			int intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.tipodetaformapago,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodetaformapagoValidator.getInvalidValues(this.tipodetaformapago);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodetaformapagoLogic.setDatosCliente(datosCliente);
			tipodetaformapagoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodetaformapagoAux=new  TipoDetaFormaPago();
				
				tipodetaformapagoAux.setIsNew(true);
				tipodetaformapagoAux.setIsChanged(true);
				
				tipodetaformapagoAux.setTipoDetaFormaPagoOriginal(this.tipodetaformapago);
				
				tipodetaformapagoAux.setId(this.tipodetaformapago.getId());	
				tipodetaformapagoAux.setVersionRow(this.tipodetaformapago.getVersionRow());	
				tipodetaformapagoAux.setid_empresa(this.tipodetaformapago.getid_empresa());	
				tipodetaformapagoAux.setcodigo(this.tipodetaformapago.getcodigo());	
				tipodetaformapagoAux.setnombre(this.tipodetaformapago.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodetaformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodetaformapagoAux,tipodetaformapagoLogic.getTipoDetaFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetaformapagoAux,tipodetaformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagoLogic.saveTipoDetaFormaPagos();//WithConnection
						//tipodetaformapagoLogic.getSetVersionRowTipoDetaFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodetaformapago,tipodetaformapagoAux);
					
					this.refrescarForeignKeysDescripcionesTipoDetaFormaPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodetaformapagoLogic.saveTipoDetaFormaPagoRelaciones(tipodetaformapagoAux);//WithConnection
								//tipodetaformapagoLogic.getSetVersionRowTipoDetaFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipodetaformapago,tipodetaformapagoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipodetaformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipodetaformapagoAux,tipodetaformapagoLogic.getTipoDetaFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipodetaformapagoAux,tipodetaformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipodetaformapago,tipodetaformapagoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodetaformapagoAux=new  TipoDetaFormaPago();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodetaformapagoSessionBean.getEsGuardarRelacionado() && this.tipodetaformapago.getId()>=0)) {
						
					tipodetaformapagoAux.setIsNew(false);
				}
				
				tipodetaformapagoAux.setIsDeleted(false);
			
				tipodetaformapagoAux.setId(this.tipodetaformapago.getId());	
				tipodetaformapagoAux.setVersionRow(this.tipodetaformapago.getVersionRow());	
				tipodetaformapagoAux.setid_empresa(this.tipodetaformapago.getid_empresa());	
				tipodetaformapagoAux.setcodigo(this.tipodetaformapago.getcodigo());	
				tipodetaformapagoAux.setnombre(this.tipodetaformapago.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodetaformapagoAux,tipodetaformapagoLogic.getTipoDetaFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetaformapagoAux,tipodetaformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagoLogic.saveTipoDetaFormaPagos();//WithConnection
						//tipodetaformapagoLogic.getSetVersionRowTipoDetaFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodetaformapago,tipodetaformapagoAux);
					
					this.refrescarForeignKeysDescripcionesTipoDetaFormaPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodetaformapagoLogic.saveTipoDetaFormaPagoRelaciones(tipodetaformapagoAux);//WithConnection
								//tipodetaformapagoLogic.getSetVersionRowTipoDetaFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipodetaformapago,tipodetaformapagoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipodetaformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipodetaformapagoAux,tipodetaformapagoLogic.getTipoDetaFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipodetaformapagoAux,tipodetaformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipodetaformapago,tipodetaformapagoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodetaformapagoAux=new  TipoDetaFormaPago();
				
				tipodetaformapagoAux.setIsNew(false);
				tipodetaformapagoAux.setIsChanged(false);
				
				tipodetaformapagoAux.setIsDeleted(true);
				
				tipodetaformapagoAux.setId(this.tipodetaformapago.getId());	
				tipodetaformapagoAux.setVersionRow(this.tipodetaformapago.getVersionRow());	
				tipodetaformapagoAux.setid_empresa(this.tipodetaformapago.getid_empresa());	
				tipodetaformapagoAux.setcodigo(this.tipodetaformapago.getcodigo());	
				tipodetaformapagoAux.setnombre(this.tipodetaformapago.getnombre());	
				
				if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodetaformapagoAux.getId()>=0) {	
						this.tipodetaformapagosEliminados.add(tipodetaformapagoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodetaformapagoAux,tipodetaformapagoLogic.getTipoDetaFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetaformapagoAux,tipodetaformapagos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagoLogic.saveTipoDetaFormaPagos();//WithConnection
						//tipodetaformapagoLogic.getSetVersionRowTipoDetaFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodetaformapagoLogic.saveTipoDetaFormaPagoRelaciones(tipodetaformapagoAux);//WithConnection
								//tipodetaformapagoLogic.getSetVersionRowTipoDetaFormaPagos();//WithConnection
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
							if(this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipodetaformapagoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipodetaformapagoAux,tipodetaformapagoLogic.getTipoDetaFormaPagos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipodetaformapagoAux,tipodetaformapagos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.getTipoDetaFormaPagos().addAll(this.tipodetaformapagosEliminados);
					
					tipodetaformapagoLogic.saveTipoDetaFormaPagos();//WithConnection
					//tipodetaformapagoLogic.getSetVersionRowTipoDetaFormaPagos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDetaFormaPago();
				
				this.tipodetaformapagosEliminados= new ArrayList<TipoDetaFormaPago>();		
			}
			
			if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Detalle Forma Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Detalle Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodetaformapago=tipodetaformapagoAux;
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
      		//this.finishProcessTipoDetaFormaPago();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDetaFormaPago tipodetaformapagoLocal) throws Exception {
		
		if(this.tipodetaformapagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDetaFormaPago tipodetaformapagoLocal) throws Exception {	
		if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipodetaformapagoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDetaFormaPagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodetaformapagoValidator.getInvalidValues(this.tipodetaformapago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDetaFormaPago tipodetaformapago,List<TipoDetaFormaPago> tipodetaformapagos) throws Exception {
		try	{		
			TipoDetaFormaPagoConstantesFunciones.actualizarLista(tipodetaformapago,tipodetaformapagos,this.tipodetaformapagoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDetaFormaPago tipodetaformapago,List<TipoDetaFormaPago> tipodetaformapagos) throws Exception {
		try	{			
			TipoDetaFormaPagoConstantesFunciones.actualizarSelectedLista(tipodetaformapago,tipodetaformapagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDetaFormaPago> tipodetaformapagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodetaformapagosLocal=this.tipodetaformapagoLogic.getTipoDetaFormaPagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodetaformapagosLocal=this.tipodetaformapagos;
			}
			//ARCHITECTURE
		
			for(TipoDetaFormaPago tipodetaformapagoLocal:tipodetaformapagosLocal) {
				if(this.permiteMantenimiento(tipodetaformapagoLocal) && tipodetaformapagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDetaFormaPagoConstantesFunciones.getTipoDetaFormaPagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDetaFormaPagoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelid_empresaTipoDetaFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDetaFormaPagoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelcodigoTipoDetaFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDetaFormaPagoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelnombreTipoDetaFormaPago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelid_empresaTipoDetaFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelcodigoTipoDetaFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelnombreTipoDetaFormaPago,"");
		
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
		this.iIdNuevoTipoDetaFormaPago--;	
		
		
		this.tipodetaformapagoAux=new TipoDetaFormaPago();
		
		this.tipodetaformapagoAux.setId(this.iIdNuevoTipoDetaFormaPago);
		this.tipodetaformapagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodetaformapagoLogic.getTipoDetaFormaPagos().add(this.tipodetaformapagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodetaformapagos.add(this.tipodetaformapagoAux);
		}
		//ARCHITECTURE
		
		this.tipodetaformapago=this.tipodetaformapagoAux;
		
		if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDetaFormaPago(this.tipodetaformapago);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDetaFormaPago(this.tipodetaformapago);
		}
				
		//this.setDefaultControlesTipoDetaFormaPago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDetaFormaPago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDetaFormaPago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetaFormaPago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDetaFormaPago(this.tipodetaformapagoBean,this.tipodetaformapago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
			classes=TipoDetaFormaPagoConstantesFunciones.getClassesRelationshipsOfTipoDetaFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodetaformapagoReturnGeneral=tipodetaformapagoLogic.procesarEventosTipoDetaFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetaformapagoLogic.getTipoDetaFormaPagos(),this.tipodetaformapago,this.tipodetaformapagoParameterGeneral,this.isEsNuevoTipoDetaFormaPago,classes);//this.tipodetaformapagoLogic.getTipoDetaFormaPago()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDetaFormaPago(this.tipodetaformapagoReturnGeneral,this.tipodetaformapagoBean,false);
		
		if(this.tipodetaformapagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDetaFormaPago(this.tipodetaformapagoReturnGeneral.getTipoDetaFormaPago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDetaFormaPago(this.tipodetaformapagoReturnGeneral.getTipoDetaFormaPago());
		}
		
		if(this.tipodetaformapagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDetaFormaPago(this.tipodetaformapagoReturnGeneral.getTipoDetaFormaPago(),classes);//this.tipodetaformapagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.tipodetaformapago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDetaFormaPago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDetaFormaPago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.RecargarFormTipoDetaFormaPago(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDetaFormaPago(false);
						
			if(tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetaFormaPago();
			}
			
			this.actualizarVisualTableDatosTipoDetaFormaPago();
			
			this.jTableDatosTipoDetaFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoDetaFormaPago(), this.getIndiceNuevoTipoDetaFormaPago());
			
			this.seleccionarFilaTablaTipoDetaFormaPagoActual();
						
			this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDetaFormaPago(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextFieldcodigoTipoDetaFormaPago.setEnabled(isHabilitar && this.tipodetaformapagoConstantesFunciones.activarcodigoTipoDetaFormaPago);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextAreanombreTipoDetaFormaPago.setEnabled(isHabilitar && this.tipodetaformapagoConstantesFunciones.activarnombreTipoDetaFormaPago);	
		//
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.setEnabled(isHabilitar && this.tipodetaformapagoConstantesFunciones.activarid_empresaTipoDetaFormaPago);
	};
	
	public void setDefaultControlesTipoDetaFormaPago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDetaFormaPago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodetaformapagoSessionBean.setConGuardarRelaciones(true);			
			this.tipodetaformapagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jTabbedPaneRelacionesTipoDetaFormaPago.setVisible(true);
			
					
		} else {
			//this.tipodetaformapagoSessionBean.setConGuardarRelaciones(false);			
			this.tipodetaformapagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jTabbedPaneRelacionesTipoDetaFormaPago.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoDetaFormaPago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
				if(tipodetaformapagoAux.getId().equals(this.iIdNuevoTipoDetaFormaPago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagos) {
				if(tipodetaformapagoAux.getId().equals(this.iIdNuevoTipoDetaFormaPago)) {
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
	
	public int getIndiceActualTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
				if(tipodetaformapagoAux.getId().equals(tipodetaformapago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagos) {
				if(tipodetaformapagoAux.getId().equals(tipodetaformapago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
				if(tipodetaformapagoAux.getTipoDetaFormaPagoOriginal().getId().equals(tipodetaformapagoOriginal.getId())) {
					existe=true;
					tipodetaformapagoOriginal.setId(tipodetaformapagoAux.getId());
					tipodetaformapagoOriginal.setVersionRow(tipodetaformapagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagos) {
				if(tipodetaformapagoAux.getTipoDetaFormaPagoOriginal().getId().equals(tipodetaformapagoOriginal.getId())) {
					existe=true;
					tipodetaformapagoOriginal.setId(tipodetaformapagoAux.getId());
					tipodetaformapagoOriginal.setVersionRow(tipodetaformapagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDetaFormaPago(Boolean esParaCancelar) throws Exception {
		tipodetaformapagosAux=new ArrayList<TipoDetaFormaPago>();
		tipodetaformapagoAux=new TipoDetaFormaPago();
		
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
					if(tipodetaformapagoAux.getId()<0) {
						tipodetaformapagosAux.add(tipodetaformapagoAux);
					}		
				}
				this.iIdNuevoTipoDetaFormaPago=0L;
				this.tipodetaformapagoLogic.getTipoDetaFormaPagos().removeAll(tipodetaformapagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagos) {
					if(tipodetaformapagoAux.getId()<0) {
						tipodetaformapagosAux.add(tipodetaformapagoAux);
					}		
				}
				this.iIdNuevoTipoDetaFormaPago=0L;
				this.tipodetaformapagos.removeAll(tipodetaformapagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDetaFormaPago 
					&& this.tipodetaformapagoLogic.getTipoDetaFormaPagos().size()>0
					) {
					tipodetaformapagoAux=this.tipodetaformapagoLogic.getTipoDetaFormaPagos().get(this.tipodetaformapagoLogic.getTipoDetaFormaPagos().size() - 1);
				
					if(tipodetaformapagoAux.getId()<0) {
						this.tipodetaformapagoLogic.getTipoDetaFormaPagos().remove(tipodetaformapagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDetaFormaPago && this.tipodetaformapagos.size()>0) {
					tipodetaformapagoAux=this.tipodetaformapagos.get(this.tipodetaformapagos.size() - 1);
				
					if(tipodetaformapagoAux.getId()<0) {
						this.tipodetaformapagos.remove(tipodetaformapagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDetaFormaPago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodetaformapago.getId()<0) {
				this.tipodetaformapagoLogic.getTipoDetaFormaPagos().remove(this.tipodetaformapago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodetaformapago.getId()<0) {
				this.tipodetaformapagos.remove(this.tipodetaformapago);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDetaFormaPago(List<TipoDetaFormaPago> tipodetaformapagosAux) throws Exception {
		TipoDetaFormaPagoConstantesFunciones.setEstadosInicialesTipoDetaFormaPago(tipodetaformapagosAux);
	}
	
	public void setEstadosInicialesTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapagoAux) throws Exception {
		TipoDetaFormaPagoConstantesFunciones.setEstadosInicialesTipoDetaFormaPago(tipodetaformapagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDetaFormaPagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDetaFormaPagoActual()) {
				if(!this.isEsNuevoTipoDetaFormaPago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDetaFormaPago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDetaFormaPagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Detalle Forma Pago ?", "MANTENIMIENTO DE Tipo Detalle Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDetaFormaPago tipodetaformapago) throws Exception {
		TipoDetaFormaPagoConstantesFunciones.seleccionarAsignar(this.tipodetaformapago,tipodetaformapago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDetaFormaPago=this.isPermisoActualizarOriginalTipoDetaFormaPago;
			
			
			this.seleccionarAsignar(tipodetaformapago);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDetaFormaPagoConstantesFunciones.quitarEspaciosTipoDetaFormaPago(this.tipodetaformapago,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodetaformapagoSessionBean.setsFuncionBusquedaRapida(this.tipodetaformapagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDetaFormaPago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDetaFormaPago(esParaCancelar);				
				this.cancelarNuevoTipoDetaFormaPago(esParaCancelar);								
			}
			
			this.tipodetaformapago=new TipoDetaFormaPago();
			
			this.inicializarTipoDetaFormaPago();
			
			this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDetaFormaPago() throws Exception {
		try {
			TipoDetaFormaPagoConstantesFunciones.inicializarTipoDetaFormaPago(this.tipodetaformapago);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodetaformapagoLogic.getTipoDetaFormaPagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDetaFormaPagos(String sAccionBusqueda,List<TipoDetaFormaPago> tipodetaformapagosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDetaFormaPago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDetaFormaPagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDetaFormaPagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDetaFormaPago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Detalle Forma Pagos");		
		parameters.put("busquedapor", TipoDetaFormaPagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDetaFormaPago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDetaFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDetaFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDetaFormaPago=new JRBeanArrayDataSource(TipoDetaFormaPagoJInternalFrame.TraerTipoDetaFormaPagoBeans(tipodetaformapagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDetaFormaPago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDetaFormaPagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDetaFormaPagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDetaFormaPagoBean.TraerTipoDetaFormaPagoBeans(tipodetaformapagosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDetaFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipodetaformapagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDetaFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipodetaformapagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDetaFormaPagoActionPerformed(null);
					//this.generarExcelReporteTipoDetaFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipodetaformapagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDetaFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipodetaformapagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDetaFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipodetaformapagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDetaFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipodetaformapagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDetaFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetaFormaPago> tipodetaformapagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetaformapago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetaFormaPagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDetaFormaPago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDetaFormaPago tipodetaformapago : tipodetaformapagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDetaFormaPagoConstantesFunciones.generarExcelReporteDataTipoDetaFormaPago("NORMAL",row,workbook,tipodetaformapago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDetaFormaPago(String sTipo,Row row,Workbook workbook) {
		
		TipoDetaFormaPagoConstantesFunciones.generarExcelReporteHeaderTipoDetaFormaPago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDetaFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetaFormaPago> tipodetaformapagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetaformapago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetaFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDetaFormaPago tipodetaformapago : tipodetaformapagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.getTipoDetaFormaPagoDescripcion(tipodetaformapago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetaformapago.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetaformapago.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodetaformapago.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDetaFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDetaFormaPago> tipodetaformapagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDetaFormaPago> tipodetaformapagosRespaldo=null;
		
		classes=TipoDetaFormaPagoConstantesFunciones.getClassesRelationshipsOfTipoDetaFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodetaformapagoLogic.setDatosCliente(this.datosCliente);
		this.tipodetaformapagoLogic.setDatosDeep(this.datosDeep);
		this.tipodetaformapagoLogic.setIsConDeep(true);
		
		tipodetaformapagosRespaldo=this.tipodetaformapagoLogic.getTipoDetaFormaPagos();
		
		this.tipodetaformapagoLogic.setTipoDetaFormaPagos(tipodetaformapagosParaReportes);	
		this.tipodetaformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodetaformapagosParaReportes=this.tipodetaformapagoLogic.getTipoDetaFormaPagos();
		this.tipodetaformapagoLogic.setTipoDetaFormaPagos(tipodetaformapagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetaformapago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDetaFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDetaFormaPago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDetaFormaPago tipodetaformapago : tipodetaformapagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDetaFormaPago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDetaFormaPagoConstantesFunciones.generarExcelReporteDataTipoDetaFormaPago("NORMAL",row,workbook,tipodetaformapago,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.getTipoDetaFormaPagoDescripcion(tipodetaformapago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDetaFormaPago() throws Exception {		
		this.startProcessTipoDetaFormaPago(true);
	}
	
	public void startProcessTipoDetaFormaPago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDetaFormaPago ,this.jPanelParametrosReportesTipoDetaFormaPago, this.jScrollPanelDatosTipoDetaFormaPago,this.jPanelPaginacionTipoDetaFormaPago, this.jScrollPanelDatosEdicionTipoDetaFormaPago, this.jPanelAccionesTipoDetaFormaPago,this.jPanelAccionesFormularioTipoDetaFormaPago,this.jmenuBarTipoDetaFormaPago,this.jmenuBarDetalleTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,this.jTtoolBarDetalleTipoDetaFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDetaFormaPago=this.jTabbedPaneBusquedasTipoDetaFormaPago; 
		
		final JPanel jPanelParametrosReportesTipoDetaFormaPago=this.jPanelParametrosReportesTipoDetaFormaPago;
		//final JScrollPane jScrollPanelDatosTipoDetaFormaPago=this.jScrollPanelDatosTipoDetaFormaPago;
		final JTable jTableDatosTipoDetaFormaPago=this.jTableDatosTipoDetaFormaPago;		
		final JPanel jPanelPaginacionTipoDetaFormaPago=this.jPanelPaginacionTipoDetaFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionTipoDetaFormaPago=this.jScrollPanelDatosEdicionTipoDetaFormaPago;
		final JPanel jPanelAccionesTipoDetaFormaPago=this.jPanelAccionesTipoDetaFormaPago;
		
		JPanel jPanelCamposAuxiliarTipoDetaFormaPago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDetaFormaPago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			jPanelCamposAuxiliarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jPanelCamposTipoDetaFormaPago;
			jPanelAccionesFormularioAuxiliarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jPanelAccionesFormularioTipoDetaFormaPago;
		}
		
		final JPanel jPanelCamposTipoDetaFormaPago=jPanelCamposAuxiliarTipoDetaFormaPago;
		final JPanel jPanelAccionesFormularioTipoDetaFormaPago=jPanelAccionesFormularioAuxiliarTipoDetaFormaPago;
		
		
		final JMenuBar jmenuBarTipoDetaFormaPago=this.jmenuBarTipoDetaFormaPago;
		final JToolBar jTtoolBarTipoDetaFormaPago=this.jTtoolBarTipoDetaFormaPago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDetaFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDetaFormaPago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			jmenuBarDetalleAuxiliarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jmenuBarDetalleTipoDetaFormaPago;
			jTtoolBarDetalleAuxiliarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jTtoolBarDetalleTipoDetaFormaPago;
		}
		
		final JMenuBar jmenuBarDetalleTipoDetaFormaPago=jmenuBarDetalleAuxiliarTipoDetaFormaPago;
		final JToolBar jTtoolBarDetalleTipoDetaFormaPago=jTtoolBarDetalleAuxiliarTipoDetaFormaPago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDetaFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDetaFormaPago;
			processRunnable.jTableDatos=jTableDatosTipoDetaFormaPago;
			processRunnable.jPanelCampos=jPanelCamposTipoDetaFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDetaFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDetaFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDetaFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDetaFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDetaFormaPago;
			processRunnable.jTtoolBar=jTtoolBarTipoDetaFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDetaFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDetaFormaPago ,jPanelParametrosReportesTipoDetaFormaPago,jTableDatosTipoDetaFormaPago, /*jScrollPanelDatosTipoDetaFormaPago,*/jPanelCamposTipoDetaFormaPago,jPanelPaginacionTipoDetaFormaPago, /*jScrollPanelDatosEdicionTipoDetaFormaPago,*/ jPanelAccionesTipoDetaFormaPago,jPanelAccionesFormularioTipoDetaFormaPago,jmenuBarTipoDetaFormaPago,jmenuBarDetalleTipoDetaFormaPago,jTtoolBarTipoDetaFormaPago,jTtoolBarDetalleTipoDetaFormaPago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDetaFormaPago ,jPanelParametrosReportesTipoDetaFormaPago, jScrollPanelDatosTipoDetaFormaPago,jPanelPaginacionTipoDetaFormaPago, jScrollPanelDatosEdicionTipoDetaFormaPago, jPanelAccionesTipoDetaFormaPago,jPanelAccionesFormularioTipoDetaFormaPago,jmenuBarTipoDetaFormaPago,jmenuBarDetalleTipoDetaFormaPago,jTtoolBarTipoDetaFormaPago,jTtoolBarDetalleTipoDetaFormaPago);
						
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
	
	public void finishProcessTipoDetaFormaPago() {// throws Exception 
		this.finishProcessTipoDetaFormaPago(true);
	}
	
	public void finishProcessTipoDetaFormaPago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDetaFormaPago ,this.jPanelParametrosReportesTipoDetaFormaPago, this.jScrollPanelDatosTipoDetaFormaPago,this.jPanelPaginacionTipoDetaFormaPago, this.jScrollPanelDatosEdicionTipoDetaFormaPago, this.jPanelAccionesTipoDetaFormaPago,this.jPanelAccionesFormularioTipoDetaFormaPago,this.jmenuBarTipoDetaFormaPago,this.jmenuBarDetalleTipoDetaFormaPago,this.jTtoolBarTipoDetaFormaPago,this.jTtoolBarDetalleTipoDetaFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDetaFormaPago=this.jTabbedPaneBusquedasTipoDetaFormaPago; 
		
		final JPanel jPanelParametrosReportesTipoDetaFormaPago=this.jPanelParametrosReportesTipoDetaFormaPago;
		//final JScrollPane jScrollPanelDatosTipoDetaFormaPago=this.jScrollPanelDatosTipoDetaFormaPago;
		final JTable jTableDatosTipoDetaFormaPago=this.jTableDatosTipoDetaFormaPago;		
		final JPanel jPanelPaginacionTipoDetaFormaPago=this.jPanelPaginacionTipoDetaFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionTipoDetaFormaPago=this.jScrollPanelDatosEdicionTipoDetaFormaPago;
		final JPanel jPanelAccionesTipoDetaFormaPago=this.jPanelAccionesTipoDetaFormaPago;
		
		JPanel jPanelCamposAuxiliarTipoDetaFormaPago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDetaFormaPago=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			jPanelCamposAuxiliarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jPanelCamposTipoDetaFormaPago;
			jPanelAccionesFormularioAuxiliarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jPanelAccionesFormularioTipoDetaFormaPago;
		}
		
		final JPanel jPanelCamposTipoDetaFormaPago=jPanelCamposAuxiliarTipoDetaFormaPago;
		final JPanel jPanelAccionesFormularioTipoDetaFormaPago=jPanelAccionesFormularioAuxiliarTipoDetaFormaPago;
		
		
		final JMenuBar jmenuBarTipoDetaFormaPago=this.jmenuBarTipoDetaFormaPago;		
		final JToolBar jTtoolBarTipoDetaFormaPago=this.jTtoolBarTipoDetaFormaPago;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDetaFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDetaFormaPago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			jmenuBarDetalleAuxiliarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jmenuBarDetalleTipoDetaFormaPago;
			jTtoolBarDetalleAuxiliarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jTtoolBarDetalleTipoDetaFormaPago;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDetaFormaPago=jmenuBarDetalleAuxiliarTipoDetaFormaPago;
		final JToolBar jTtoolBarDetalleTipoDetaFormaPago=jTtoolBarDetalleAuxiliarTipoDetaFormaPago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDetaFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDetaFormaPago;
			processRunnable.jTableDatos=jTableDatosTipoDetaFormaPago;
			processRunnable.jPanelCampos=jPanelCamposTipoDetaFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDetaFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDetaFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDetaFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDetaFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDetaFormaPago;
			processRunnable.jTtoolBar=jTtoolBarTipoDetaFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDetaFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDetaFormaPago ,jPanelParametrosReportesTipoDetaFormaPago, jTableDatosTipoDetaFormaPago,/*jScrollPanelDatosTipoDetaFormaPago,*/jPanelCamposTipoDetaFormaPago,jPanelPaginacionTipoDetaFormaPago, /*jScrollPanelDatosEdicionTipoDetaFormaPago,*/ jPanelAccionesTipoDetaFormaPago,jPanelAccionesFormularioTipoDetaFormaPago,jmenuBarTipoDetaFormaPago,jmenuBarDetalleTipoDetaFormaPago,jTtoolBarTipoDetaFormaPago,jTtoolBarDetalleTipoDetaFormaPago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDetaFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDetaFormaPago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDetaFormaPago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDetaFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDetaFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDetaFormaPago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDetaFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDetaFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDetaFormaPago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodetaformapagoConstantesFunciones.getsFinalQueryTipoDetaFormaPago();
		String  finalQueryPaginacionTodos=this.tipodetaformapagoConstantesFunciones.getsFinalQueryTipoDetaFormaPago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDetaFormaPagoConstantesFunciones.getArrayColumnasGlobalesNoTipoDetaFormaPago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDetaFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoDetaFormaPago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDetaFormaPagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodetaformapagosEliminados= new ArrayList<TipoDetaFormaPago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDetaFormaPago();
		
				///*TipoDetaFormaPagoSessionBean*/this.tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean();
			
			if(this.tipodetaformapagoSessionBean==null) {
				this.tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean();
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
					this.iNumeroPaginacion=TipoDetaFormaPagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDetaFormaPagoConstantesFunciones.getClassesForeignKeysOfTipoDetaFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodetaformapago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodetaformapagosAux= new ArrayList<TipoDetaFormaPago>();
			
				
			tipodetaformapagoLogic.setDatosCliente(this.datosCliente);
			tipodetaformapagoLogic.setDatosDeep(this.datosDeep);
			tipodetaformapagoLogic.setIsConDeep(true);
			
			
			tipodetaformapagoLogic.getTipoDetaFormaPagoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodetaformapagoLogic.getTodosTipoDetaFormaPagos(finalQueryGlobal,pagination);
					
					//tipodetaformapagoLogic.getTodosTipoDetaFormaPagosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodetaformapagoLogic.getTipoDetaFormaPagos()==null|| tipodetaformapagoLogic.getTipoDetaFormaPagos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetaformapagosAux= new ArrayList<TipoDetaFormaPago>();
							tipodetaformapagosAux.addAll(tipodetaformapagoLogic.getTipoDetaFormaPagos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetaformapagosAux= new ArrayList<TipoDetaFormaPago>();
							tipodetaformapagosAux.addAll(tipodetaformapagos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetaformapagoLogic.getTodosTipoDetaFormaPagos(finalQueryGlobal+"",this.pagination);												
							
							//tipodetaformapagoLogic.getTodosTipoDetaFormaPagosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDetaFormaPagos("Todos",tipodetaformapagoLogic.getTipoDetaFormaPagos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodetaformapagoLogic.setTipoDetaFormaPagos(new ArrayList<TipoDetaFormaPago>());					
							tipodetaformapagoLogic.getTipoDetaFormaPagos().addAll(tipodetaformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetaformapagos=new ArrayList<TipoDetaFormaPago>();
							tipodetaformapagos.addAll(tipodetaformapagosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDetaFormaPago=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDetaFormaPago=this.idActual;
				
				} else if(this.idTipoDetaFormaPagoActual!=null && this.idTipoDetaFormaPagoActual!=0L) {
					idTipoDetaFormaPago=idTipoDetaFormaPagoActual;
				}
				
					
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndicePorId(idTipoDetaFormaPago);
				
				this.tipodetaformapagos=new ArrayList<TipoDetaFormaPago>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodetaformapagoLogic.getEntity(idTipoDetaFormaPago);
					
					//tipodetaformapagoLogic.getEntityWithConnection(idTipoDetaFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetaformapagoLogic.setTipoDetaFormaPagos(new ArrayList<TipoDetaFormaPago>());
					tipodetaformapagoLogic.getTipoDetaFormaPagos().add(tipodetaformapagoLogic.getTipoDetaFormaPago());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetaformapagos=new ArrayList<TipoDetaFormaPago>();
					this.tipodetaformapagos.add(tipodetaformapago);
				}
				
				if(tipodetaformapagoLogic.getTipoDetaFormaPago()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodetaformapagoLogic.getTipoDetaFormaPagosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodetaformapagoLogic.getTipoDetaFormaPagos()==null||tipodetaformapagoLogic.getTipoDetaFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodetaformapagos==null|| tipodetaformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagosAux=new ArrayList<TipoDetaFormaPago>();
						tipodetaformapagosAux.addAll(tipodetaformapagoLogic.getTipoDetaFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetaformapagosAux=new ArrayList<TipoDetaFormaPago>();
							tipodetaformapagosAux.addAll(tipodetaformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodetaformapagoLogic.getTipoDetaFormaPagosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDetaFormaPagos("BusquedaPorCodigo",tipodetaformapagoLogic.getTipoDetaFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDetaFormaPagos("BusquedaPorCodigo",tipodetaformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagoLogic.setTipoDetaFormaPagos(new ArrayList<TipoDetaFormaPago>());
						tipodetaformapagoLogic.getTipoDetaFormaPagos().addAll(tipodetaformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetaformapagos=new ArrayList<TipoDetaFormaPago>();
							tipodetaformapagos.addAll(tipodetaformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodetaformapagoLogic.getTipoDetaFormaPagosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodetaformapagoLogic.getTipoDetaFormaPagos()==null||tipodetaformapagoLogic.getTipoDetaFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodetaformapagos==null|| tipodetaformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagosAux=new ArrayList<TipoDetaFormaPago>();
						tipodetaformapagosAux.addAll(tipodetaformapagoLogic.getTipoDetaFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetaformapagosAux=new ArrayList<TipoDetaFormaPago>();
							tipodetaformapagosAux.addAll(tipodetaformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodetaformapagoLogic.getTipoDetaFormaPagosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDetaFormaPagos("BusquedaPorNombre",tipodetaformapagoLogic.getTipoDetaFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDetaFormaPagos("BusquedaPorNombre",tipodetaformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagoLogic.setTipoDetaFormaPagos(new ArrayList<TipoDetaFormaPago>());
						tipodetaformapagoLogic.getTipoDetaFormaPagos().addAll(tipodetaformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetaformapagos=new ArrayList<TipoDetaFormaPago>();
							tipodetaformapagos.addAll(tipodetaformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodetaformapagoLogic.getTipoDetaFormaPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodetaformapagoLogic.getTipoDetaFormaPagos()==null||tipodetaformapagoLogic.getTipoDetaFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodetaformapagos==null|| tipodetaformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagosAux=new ArrayList<TipoDetaFormaPago>();
						tipodetaformapagosAux.addAll(tipodetaformapagoLogic.getTipoDetaFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetaformapagosAux=new ArrayList<TipoDetaFormaPago>();
							tipodetaformapagosAux.addAll(tipodetaformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodetaformapagoLogic.getTipoDetaFormaPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDetaFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDetaFormaPagos("FK_IdEmpresa",tipodetaformapagoLogic.getTipoDetaFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDetaFormaPagos("FK_IdEmpresa",tipodetaformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagoLogic.setTipoDetaFormaPagos(new ArrayList<TipoDetaFormaPago>());
						tipodetaformapagoLogic.getTipoDetaFormaPagos().addAll(tipodetaformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetaformapagos=new ArrayList<TipoDetaFormaPago>();
							tipodetaformapagos.addAll(tipodetaformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDetaFormaPago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDetaFormaPago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodetaformapagoLogic.getTipoDetaFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetaformapagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodetaformapagoLogic.getTipoDetaFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodetaformapagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDetaFormaPago tipodetaformapago) {
		Boolean permite=true;
		
		if(this.tipodetaformapago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDetaFormaPagoConstantesFunciones.getOrderByListaTipoDetaFormaPago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDetaFormaPagoConstantesFunciones.getOrderByListaTipoDetaFormaPago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetaFormaPago tipodetaformapago:tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
				if(tipodetaformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetaformapagoTotales=tipodetaformapago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetaFormaPago tipodetaformapago:this.tipodetaformapagos) {
				if(tipodetaformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetaformapagoTotales=tipodetaformapago;
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
			this.tipodetaformapagoAux=new TipoDetaFormaPago();
			this.tipodetaformapagoAux.setsType(Constantes2.S_TOTALES);
			this.tipodetaformapagoAux.setIsNew(false);
			this.tipodetaformapagoAux.setIsChanged(false);
			this.tipodetaformapagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDetaFormaPagoConstantesFunciones.TotalizarValoresFilaTipoDetaFormaPago(this.tipodetaformapagoLogic.getTipoDetaFormaPagos(),this.tipodetaformapagoAux);
				
				this.tipodetaformapagoLogic.getTipoDetaFormaPagos().add(this.tipodetaformapagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDetaFormaPagoConstantesFunciones.TotalizarValoresFilaTipoDetaFormaPago(this.tipodetaformapagos,this.tipodetaformapagoAux);
				
				this.tipodetaformapagos.add(this.tipodetaformapagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodetaformapagoTotales=new TipoDetaFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodetaformapagoLogic.getTipoDetaFormaPagos().remove(tipodetaformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodetaformapagos.remove(tipodetaformapagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodetaformapagoTotales=new TipoDetaFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDetaFormaPago tipodetaformapago:tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
				if(tipodetaformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetaformapagoTotales=tipodetaformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDetaFormaPagoConstantesFunciones.TotalizarValoresFilaTipoDetaFormaPago(this.tipodetaformapagoLogic.getTipoDetaFormaPagos(),tipodetaformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDetaFormaPago tipodetaformapago:this.tipodetaformapagos) {
				if(tipodetaformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipodetaformapagoTotales=tipodetaformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDetaFormaPagoConstantesFunciones.TotalizarValoresFilaTipoDetaFormaPago(this.tipodetaformapagos,tipodetaformapagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDetaFormaPagosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDetaFormaPagosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDetaFormaPagosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDetaFormaPagosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetaformapagoLogic.getTipoDetaFormaPagosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDetaFormaPagosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetaformapagoLogic.getTipoDetaFormaPagosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDetaFormaPagosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetaformapagoLogic.getTipoDetaFormaPagosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoDetaFormaPago() {
		this.isPermisoTodoTipoDetaFormaPago=false;
		this.isPermisoNuevoTipoDetaFormaPago=false;
		this.isPermisoActualizarTipoDetaFormaPago=false;
		this.isPermisoActualizarOriginalTipoDetaFormaPago=false;
		this.isPermisoEliminarTipoDetaFormaPago=false;
		this.isPermisoGuardarCambiosTipoDetaFormaPago=false;
		this.isPermisoConsultaTipoDetaFormaPago=false;
		this.isPermisoBusquedaTipoDetaFormaPago=false;
		this.isPermisoReporteTipoDetaFormaPago=false;		
		this.isPermisoOrdenTipoDetaFormaPago=false;		
		this.isPermisoPaginacionMedioTipoDetaFormaPago=false;		
		this.isPermisoPaginacionAltoTipoDetaFormaPago=false;
		this.isPermisoPaginacionTodoTipoDetaFormaPago=false;
		this.isPermisoCopiarTipoDetaFormaPago=false;		
		this.isPermisoVerFormTipoDetaFormaPago=false;		
		this.isPermisoDuplicarTipoDetaFormaPago=false;		
		this.isPermisoOrdenTipoDetaFormaPago=false;		
	}
	
	public void setPermisosUsuarioTipoDetaFormaPago(Boolean isPermiso) {
		this.isPermisoTodoTipoDetaFormaPago=isPermiso;
		this.isPermisoNuevoTipoDetaFormaPago=isPermiso;
		this.isPermisoActualizarTipoDetaFormaPago=isPermiso;
		this.isPermisoActualizarOriginalTipoDetaFormaPago=isPermiso;
		this.isPermisoEliminarTipoDetaFormaPago=isPermiso;
		this.isPermisoGuardarCambiosTipoDetaFormaPago=isPermiso;
		this.isPermisoConsultaTipoDetaFormaPago=isPermiso;
		this.isPermisoBusquedaTipoDetaFormaPago=isPermiso;
		this.isPermisoReporteTipoDetaFormaPago=isPermiso;
		this.isPermisoOrdenTipoDetaFormaPago=isPermiso;		
		this.isPermisoPaginacionMedioTipoDetaFormaPago=isPermiso;		
		this.isPermisoPaginacionAltoTipoDetaFormaPago=isPermiso;		
		this.isPermisoPaginacionTodoTipoDetaFormaPago=isPermiso;		
		this.isPermisoCopiarTipoDetaFormaPago=isPermiso;		
		this.isPermisoVerFormTipoDetaFormaPago=isPermiso;		
		this.isPermisoDuplicarTipoDetaFormaPago=isPermiso;
		this.isPermisoOrdenTipoDetaFormaPago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDetaFormaPago(Boolean isPermiso) {
		//this.isPermisoTodoTipoDetaFormaPago=isPermiso;
		this.isPermisoNuevoTipoDetaFormaPago=isPermiso;
		this.isPermisoActualizarTipoDetaFormaPago=isPermiso;
		this.isPermisoActualizarOriginalTipoDetaFormaPago=isPermiso;
		this.isPermisoEliminarTipoDetaFormaPago=isPermiso;
		this.isPermisoGuardarCambiosTipoDetaFormaPago=isPermiso;
		//this.isPermisoConsultaTipoDetaFormaPago=isPermiso;
		//this.isPermisoBusquedaTipoDetaFormaPago=isPermiso;
		//this.isPermisoReporteTipoDetaFormaPago=isPermiso;
		//this.isPermisoOrdenTipoDetaFormaPago=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDetaFormaPago=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDetaFormaPago=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDetaFormaPago=isPermiso;		
		//this.isPermisoCopiarTipoDetaFormaPago=isPermiso;		
		//this.isPermisoDuplicarTipoDetaFormaPago=isPermiso;
		//this.isPermisoOrdenTipoDetaFormaPago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDetaFormaPagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoDetaFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDetaFormaPago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDetaFormaPagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDetaFormaPagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDetaFormaPagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDetaFormaPagoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoDetaFormaPago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDetaFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDetaFormaPagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDetaFormaPago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDetaFormaPago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDetaFormaPago=this.isPermisoActualizarTipoDetaFormaPago;
			this.isPermisoEliminarTipoDetaFormaPago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDetaFormaPago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDetaFormaPago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDetaFormaPago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDetaFormaPago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDetaFormaPago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDetaFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDetaFormaPago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDetaFormaPago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDetaFormaPago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDetaFormaPago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDetaFormaPago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDetaFormaPago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDetaFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDetaFormaPago.setToolTipText(this.jTableDatosTipoDetaFormaPago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDetaFormaPago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDetaFormaPago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDetaFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDetaFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDetaFormaPago() throws Exception {
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
	public void inicializarCombosForeignKeyTipoDetaFormaPagoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDetaFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDetaFormaPagoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDetaFormaPagoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoDetaFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDetaFormaPagoParameterReturnGeneral tipodetaformapagoReturnGeneral=new TipoDetaFormaPagoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipodetaformapagoConstantesFunciones.cargarid_empresaTipoDetaFormaPago)
					 || (this.esRecargarFks && this.tipodetaformapagoConstantesFunciones.cargarid_empresaTipoDetaFormaPago)) {

					if(!this.tipodetaformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipodetaformapagoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodetaformapagoReturnGeneral=tipodetaformapagoLogic.cargarCombosLoteForeignKeyTipoDetaFormaPago(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipodetaformapagoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDetaFormaPago()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipodetaformapagoSessionBean==null) {
				this.tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean();
			}

			if(!this.tipodetaformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoDetaFormaPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDetaFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDetaFormaPago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetaFormaPago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDetaFormaPago()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDetaFormaPago()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDetaFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDetaFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDetaFormaPago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDetaFormaPago()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDetaFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDetaFormaPago()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago!=null && this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoDetaFormaPagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDetaFormaPagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDetaFormaPagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean(); 
		this.tipodetaformapagoConstantesFunciones=new TipoDetaFormaPagoConstantesFunciones(); 
		this.tipodetaformapagoBean=new TipoDetaFormaPago();//(this.tipodetaformapagoConstantesFunciones); 		
		this.tipodetaformapagoReturnGeneral=new TipoDetaFormaPagoParameterReturnGeneral(); 
		
		this.tipodetaformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetaformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDetaFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDetaFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDetaFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDetaFormaPago(true);
			
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
			
			this.tipodetaformapagoConstantesFunciones=new TipoDetaFormaPagoConstantesFunciones(); 
			this.tipodetaformapagoBean=new TipoDetaFormaPago();//this.tipodetaformapagoConstantesFunciones); 			
			this.tipodetaformapagoReturnGeneral=new TipoDetaFormaPagoParameterReturnGeneral(); 
		
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Detalle Forma Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodetaformapago=new TipoDetaFormaPago();
			this.tipodetaformapagos = new ArrayList<TipoDetaFormaPago>();
			this.tipodetaformapagosAux = new ArrayList<TipoDetaFormaPago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic=new TipoDetaFormaPagoLogic();
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodetaformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodetaformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDetaFormaPago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDetaFormaPago);	
					}
					
					if(this.jInternalFrameImportacionTipoDetaFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDetaFormaPago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDetaFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDetaFormaPago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDetaFormaPago);
				this.jInternalFrameDetalleFormTipoDetaFormaPago.setVisible(false);
				this.jInternalFrameDetalleFormTipoDetaFormaPago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDetaFormaPago);
					this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDetaFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDetaFormaPago);
					this.jInternalFrameImportacionTipoDetaFormaPago.setVisible(false);
					this.jInternalFrameImportacionTipoDetaFormaPago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDetaFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDetaFormaPago);
					this.jInternalFrameOrderByTipoDetaFormaPago.setVisible(false);
					this.jInternalFrameOrderByTipoDetaFormaPago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDetaFormaPagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDetaFormaPagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodetaformapagoReturnGeneral=new TipoDetaFormaPagoParameterReturnGeneral();
			
			this.tipodetaformapagoParameterGeneral=new TipoDetaFormaPagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodetaformapagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDetaFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDetaFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodetaformapagoSessionBean.getEsGuardarRelacionado(),this.tipodetaformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDetaFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodetaformapagoSessionBean.getEsGuardarRelacionado(),this.tipodetaformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=false;
			this.isVisibilidadCeldaDuplicarTipoDetaFormaPago=true;
			this.isVisibilidadCeldaCopiarTipoDetaFormaPago=true;
			this.isVisibilidadCeldaVerFormTipoDetaFormaPago=true;
			this.isVisibilidadCeldaOrdenTipoDetaFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=false;
			this.isVisibilidadCeldaModificarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDetaFormaPago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDetaFormaPago(false);
			
			this.setPermisosUsuarioTipoDetaFormaPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodetaformapagoSessionBean.getEsGuardarRelacionado() && this.tipodetaformapagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDetaFormaPagoClasesRelacionadas();
			}
			
			if(this.tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDetaFormaPagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDetaFormaPago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDetaFormaPago();
			}
			
			if(!this.isPermisoBusquedaTipoDetaFormaPago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDetaFormaPago,this.isPermisoPaginacionMedioTipoDetaFormaPago,this.isPermisoPaginacionTodoTipoDetaFormaPago);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDetaFormaPagoConstantesFunciones.getTiposSeleccionarTipoDetaFormaPago());
				
				this.tiposColumnasSelect=TipoDetaFormaPagoConstantesFunciones.getTiposSeleccionarTipoDetaFormaPago(true);
				
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
			//if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDetaFormaPago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoDetaFormaPago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoDetaFormaPago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetaFormaPago() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipodetaformapagoImplementable= (TipoDetaFormaPagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDetaFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodetaformapagoImplementableHome= (TipoDetaFormaPagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDetaFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodetaformapagos= new ArrayList<TipoDetaFormaPago>();
			this.tipodetaformapagosEliminados= new ArrayList<TipoDetaFormaPago>();
						
			this.isEsNuevoTipoDetaFormaPago=false;
			this.esParaAccionDesdeFormularioTipoDetaFormaPago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDetaFormaPago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDetaFormaPago();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDetaFormaPagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDetaFormaPago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDetaFormaPago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDetaFormaPago();
			}
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDetaFormaPago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDetaFormaPago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDetaFormaPago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDetaFormaPago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDetaFormaPago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDetaFormaPago() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDetaFormaPago")) {
				iIndex=this.jInternalFrameDetalleFormTipoDetaFormaPago.jTabbedPaneRelacionesTipoDetaFormaPago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDetaFormaPago.jTabbedPaneRelacionesTipoDetaFormaPago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDetaFormaPago();	
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
	
	public void cargarCombosForeignKeyTipoDetaFormaPago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDetaFormaPago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDetaFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDetaFormaPagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDetaFormaPago();
		
		this.cargarCombosFrameForeignKeyTipoDetaFormaPago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDetaFormaPago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDetaFormaPago();
		}
	}
	
	
	
	public void jButtonNuevoTipoDetaFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
			
			if(jTableDatosTipoDetaFormaPago.getRowCount()>=1) {
				jTableDatosTipoDetaFormaPago.removeRowSelectionInterval(0, jTableDatosTipoDetaFormaPago.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDetaFormaPago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDetaFormaPago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDetaFormaPago(true);			
			//this.tipodetaformapago=new TipoDetaFormaPago();
			//this.tipodetaformapago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetaFormaPago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetaFormaPago() ;
			
			if(TipoDetaFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetaFormaPago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodetaformapago);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);				
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
			if(this.tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDetaFormaPago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDetaFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDetaFormaPago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDetaFormaPago.getSelectedRows().length;			
			}
			
			tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDetaFormaPago--;			
				//TipoDetaFormaPago tipodetaformapagoAux= new TipoDetaFormaPago();			
				//tipodetaformapagoAux.setId(this.iIdNuevoTipoDetaFormaPago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDetaFormaPago tipodetaformapagoOrigen=new TipoDetaFormaPago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDetaFormaPago tipodetaformapagoOrigen : tipodetaformapagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodetaformapagoOrigen =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodetaformapagoOrigen =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDetaFormaPago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodetaformapago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDetaFormaPago(tipodetaformapagoOrigen,this.tipodetaformapago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodetaformapagoLogic.getTipoDetaFormaPagos().add(this.tipodetaformapagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodetaformapagos.add(this.tipodetaformapagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
				
				this.jTableDatosTipoDetaFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoDetaFormaPago(), this.getIndiceNuevoTipoDetaFormaPago());
				
				int iLastRow =  this.jTableDatosTipoDetaFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDetaFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDetaFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();									
		
			TipoDetaFormaPago tipodetaformapagoOrigen=new TipoDetaFormaPago();
			TipoDetaFormaPago tipodetaformapagoDestino=new TipoDetaFormaPago();
				
			tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDetaFormaPago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodetaformapagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDetaFormaPago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagoOrigen =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodetaformapagoOrigen =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodetaformapagoDestino =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodetaformapagoDestino =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodetaformapagoOrigen =tipodetaformapagosSeleccionados.get(0);
				tipodetaformapagoDestino =tipodetaformapagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDetaFormaPago(tipodetaformapagoOrigen,tipodetaformapagoDestino,true,false);
				
				tipodetaformapagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodetaformapagoDestino,tipodetaformapagoLogic.getTipoDetaFormaPagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodetaformapagoDestino,tipodetaformapagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
				
				//this.jTableDatosTipoDetaFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoDetaFormaPago(), this.getIndiceNuevoTipoDetaFormaPago());
				
				int iLastRow =  this.jTableDatosTipoDetaFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDetaFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDetaFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDetaFormaPago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDetaFormaPago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDetaFormaPago.setVisible(!isVisible);
			this.jPanelPaginacionTipoDetaFormaPago.setVisible(!isVisible);
			this.jPanelAccionesTipoDetaFormaPago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDetaFormaPago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDetaFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDetaFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDetaFormaPago();
			
			this.abrirFrameOrderByTipoDetaFormaPago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDetaFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDetaFormaPago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDetaFormaPago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDetaFormaPago.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDetaFormaPago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDetaFormaPago.setSize(this.jInternalFrameDetalleFormTipoDetaFormaPago.iWidthFormulario,this.jInternalFrameDetalleFormTipoDetaFormaPago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDetaFormaPago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDetaFormaPago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDetaFormaPago.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDetaFormaPago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDetaFormaPago.jContentPaneDetalleTipoDetaFormaPago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDetaFormaPago.jTabbedPaneRelacionesTipoDetaFormaPago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDetaFormaPago.jContentPaneDetalleTipoDetaFormaPago.getWidth(),TipoDetaFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDetaFormaPago.jTabbedPaneRelacionesTipoDetaFormaPago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDetaFormaPago.jContentPaneDetalleTipoDetaFormaPago.getWidth(),TipoDetaFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDetaFormaPago.jTabbedPaneRelacionesTipoDetaFormaPago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDetaFormaPago.jContentPaneDetalleTipoDetaFormaPago.getWidth(),TipoDetaFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDetaFormaPago.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDetaFormaPago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDetaFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDetaFormaPago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDetaFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetaFormaPago,false,this);
				} else {
					this.jInternalFrameOrderByTipoDetaFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDetaFormaPago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDetaFormaPago);
				this.jInternalFrameOrderByTipoDetaFormaPago.setVisible(false);
				this.jInternalFrameOrderByTipoDetaFormaPago.setSelected(false);
				
				this.jInternalFrameOrderByTipoDetaFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDetaFormaPago"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDetaFormaPago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDetaFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDetaFormaPago==null) {
				
				this.jInternalFrameImportacionTipoDetaFormaPago=new ImportacionJInternalFrame(TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDetaFormaPago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDetaFormaPago);
				this.jInternalFrameImportacionTipoDetaFormaPago.setVisible(false);
				this.jInternalFrameImportacionTipoDetaFormaPago.setSelected(false);


				this.jInternalFrameImportacionTipoDetaFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDetaFormaPago"));
				this.jInternalFrameImportacionTipoDetaFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDetaFormaPago"));
				this.jInternalFrameImportacionTipoDetaFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDetaFormaPago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDetaFormaPago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago==null) {
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago=new ReporteDinamicoJInternalFrame(TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDetaFormaPago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDetaFormaPago);
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetaFormaPago"));
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetaFormaPago"));
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetaFormaPago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetaFormaPago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoDetaFormaPago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDetaFormaPago);
			
	       	this.jInternalFrameDetalleFormTipoDetaFormaPago.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDetaFormaPago.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDetaFormaPago.dispose();
			//this.jInternalFrameDetalleFormTipoDetaFormaPago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDetaFormaPago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDetaFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDetaFormaPago.setVisible(true);
	        this.jInternalFrameImportacionTipoDetaFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDetaFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDetaFormaPago.setVisible(true);
	        this.jInternalFrameOrderByTipoDetaFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDetaFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDetaFormaPago.setVisible(false);
	        this.jInternalFrameOrderByTipoDetaFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDetaFormaPago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDetaFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDetaFormaPago.setVisible(false);
	        this.jInternalFrameImportacionTipoDetaFormaPago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDetaFormaPago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDetaFormaPago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDetaFormaPago(true);
			//this.isEsNuevoTipoDetaFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetaFormaPago(false) ;
			
			if(tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoDetaFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetaFormaPago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetaFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDetaFormaPagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDetaFormaPago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDetaFormaPago(true);
			//this.isEsNuevoTipoDetaFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodetaformapago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDetaFormaPago(false) ;
			
			if(TipoDetaFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDetaFormaPago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetaFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDetaFormaPago(false);
			
			//if(!this.isEsNuevoTipoDetaFormaPago) {								
				int intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.tipodetaformapago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
				
			}
			
			if(this.permiteMantenimiento(this.tipodetaformapago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDetaFormaPago=true;
					this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
					this.isEsNuevoTipoDetaFormaPago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDetaFormaPago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDetaFormaPago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDetaFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetaFormaPago(false);
				
				this.habilitarDeshabilitarControlesTipoDetaFormaPago(false);
			
												
				
				if(TipoDetaFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDetaFormaPago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,tipodetaformapagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDetaFormaPago(this.tipodetaformapago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDetaFormaPago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodetaformapagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodetaformapago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.tipodetaformapago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.tipodetaformapago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodetaformapago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDetaFormaPagoModel) this.jTableDatosTipoDetaFormaPago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDetaFormaPago=true;
				this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
				this.isEsNuevoTipoDetaFormaPago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDetaFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetaFormaPago(false);
				
				this.habilitarDeshabilitarControlesTipoDetaFormaPago(false);
				
				
				
				if(TipoDetaFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDetaFormaPago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDetaFormaPago.getRowCount()>=1) {
				jTableDatosTipoDetaFormaPago.removeRowSelectionInterval(0, jTableDatosTipoDetaFormaPago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDetaFormaPago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDetaFormaPago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDetaFormaPago(false) ;
			
			this.isEsNuevoTipoDetaFormaPago=false;
			
			if(TipoDetaFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDetaFormaPago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDetaFormaPago(false);
				
				//SI ES MANUAL
				if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDetaFormaPago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDetaFormaPago--;			
			//TipoDetaFormaPago tipodetaformapagoAux= new TipoDetaFormaPago();			
			//tipodetaformapagoAux.setId(this.iIdNuevoTipoDetaFormaPago);
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDetaFormaPago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
			
			this.tipodetaformapago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodetaformapagoLogic.getTipoDetaFormaPagos().add(this.tipodetaformapagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodetaformapagos.add(this.tipodetaformapagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
			
			this.jTableDatosTipoDetaFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoDetaFormaPago(), this.getIndiceNuevoTipoDetaFormaPago());
			
			int iLastRow =  this.jTableDatosTipoDetaFormaPago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDetaFormaPago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDetaFormaPago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDetaFormaPago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetaFormaPago(false);
			
			//SI ES MANUAL
			if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetaFormaPago();
			}
			
			//this.abrirFrameTreeTipoDetaFormaPago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Detalle Forma PagoS ?", "MANTENIMIENTO DE Tipo Detalle Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDetaFormaPago.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDetaFormaPago();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodetaformapagoReturnGeneral=tipodetaformapagoLogic.procesarImportacionTipoDetaFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodetaformapagoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDetaFormaPagoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDetaFormaPago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDetaFormaPago.setFileImportacion(this.jInternalFrameImportacionTipoDetaFormaPago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDetaFormaPago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDetaFormaPago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDetaFormaPago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDetaFormaPago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();		

		tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDetaFormaPagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDetaFormaPagoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDetaFormaPagos("Todos",tipodetaformapagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();		
		
		tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetaformapago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDetaFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoDetaFormaPago tipodetaformapago:tipodetaformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetaformapago.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDetaFormaPago tipodetaformapago:tipodetaformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetaformapago.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDetaFormaPago tipodetaformapago:tipodetaformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodetaformapago.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDetaFormaPago(row);				
			//	iRow++;
			//}				
			
			//for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDetaFormaPago(tipodetaformapagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Forma Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetaFormaPago(false);
			
			//SI ES MANUAL
			if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDetaFormaPago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetaFormaPago(false);
			
			//SI ES MANUAL
			if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDetaFormaPago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDetaFormaPago(false);
			
			//SI ES MANUAL
			if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDetaFormaPago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDetaFormaPago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDetaFormaPago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDetaFormaPago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDetaFormaPago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDetaFormaPago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDetaFormaPago.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDetaFormaPago.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDetaFormaPago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDetaFormaPago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDetaFormaPago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDetaFormaPago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDetaFormaPago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDetaFormaPago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDetaFormaPago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetaFormaPago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDetaFormaPago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDetaFormaPago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDetaFormaPago();
		
		this.inicializarActualizarBindingBotonesManualTipoDetaFormaPago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDetaFormaPago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetaFormaPago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetaFormaPago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetaFormaPago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDetaFormaPago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDetaFormaPago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDetaFormaPago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDetaFormaPago.jCheckBoxPostAccionNuevoTipoDetaFormaPago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDetaFormaPago.jCheckBoxPostAccionSinCerrarTipoDetaFormaPago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDetaFormaPago.jCheckBoxPostAccionSinMensajeTipoDetaFormaPago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDetaFormaPago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDetaFormaPago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDetaFormaPago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
				this.jInternalFrameDetalleFormTipoDetaFormaPago.jCheckBoxPostAccionNuevoTipoDetaFormaPago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDetaFormaPago.jCheckBoxPostAccionSinCerrarTipoDetaFormaPago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDetaFormaPago.jCheckBoxPostAccionSinMensajeTipoDetaFormaPago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDetaFormaPago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDetaFormaPago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDetaFormaPago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDetaFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDetaFormaPago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDetaFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDetaFormaPago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDetaFormaPago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDetaFormaPago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDetaFormaPago(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDetaFormaPago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDetaFormaPago() throws Exception {
		try	{
			if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDetaFormaPago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDetaFormaPago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDetaFormaPago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDetaFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDetaFormaPago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDetaFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDetaFormaPago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDetaFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDetaFormaPago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDetaFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDetaFormaPago.addItem(reporte);
			}
			
			
			if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDetaFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDetaFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDetaFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDetaFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDetaFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDetaFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDetaFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDetaFormaPago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDetaFormaPago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetaFormaPago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDetaFormaPago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago!=null) {
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago!=null) {
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDetaFormaPago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoDetaFormaPago.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoDetaFormaPago.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDetaFormaPago(Boolean esInicializar) throws Exception {				
		if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDetaFormaPago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDetaFormaPago() throws Exception {
		this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDetaFormaPago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDetaFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDetaFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDetaFormaPagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaFormaPagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDetaFormaPagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDetaFormaPagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDetaFormaPago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodetaformapagoLogic.getTipoDetaFormaPagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodetaformapagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDetaFormaPago.setModel(new TipoDetaFormaPagoModel(this.tipodetaformapagoLogic.getTipoDetaFormaPagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDetaFormaPago.setModel(new TipoDetaFormaPagoModel(this.tipodetaformapagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDetaFormaPago!=null && this.jInternalFrameOrderByTipoDetaFormaPago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDetaFormaPago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaFormaPago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDetaFormaPagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO,tipodetaformapagoConstantesFunciones.resaltarSeleccionarTipoDetaFormaPago,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDetaFormaPagoConstantesFunciones.SCLASSWEBTITULO,tipodetaformapagoConstantesFunciones.resaltarSeleccionarTipoDetaFormaPago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaFormaPago,TipoDetaFormaPagoConstantesFunciones.LABEL_ID));

		if(this.tipodetaformapagoConstantesFunciones.mostraridTipoDetaFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetaFormaPagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodetaformapagoConstantesFunciones.resaltaridTipoDetaFormaPago,this.tipodetaformapagoConstantesFunciones.activaridTipoDetaFormaPago,this,true,"idTipoDetaFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetaformapagoConstantesFunciones.resaltaridTipoDetaFormaPago,this.tipodetaformapagoConstantesFunciones.activaridTipoDetaFormaPago,this,true,"idTipoDetaFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaFormaPago,TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipodetaformapagoConstantesFunciones.mostrarid_empresaTipoDetaFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipodetaformapagoConstantesFunciones.resaltarid_empresaTipoDetaFormaPago,this,this.tipodetaformapagoConstantesFunciones.activarid_empresaTipoDetaFormaPago));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipodetaformapagoConstantesFunciones.resaltarid_empresaTipoDetaFormaPago,this,this.tipodetaformapagoConstantesFunciones.activarid_empresaTipoDetaFormaPago,false,"id_empresaTipoDetaFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDetaFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaFormaPago,TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO));

		if(this.tipodetaformapagoConstantesFunciones.mostrarcodigoTipoDetaFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodetaformapagoConstantesFunciones.resaltarcodigoTipoDetaFormaPago,this.tipodetaformapagoConstantesFunciones.activarcodigoTipoDetaFormaPago,this,true,"codigoTipoDetaFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetaformapagoConstantesFunciones.resaltarcodigoTipoDetaFormaPago,this.tipodetaformapagoConstantesFunciones.activarcodigoTipoDetaFormaPago,this,true,"codigoTipoDetaFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDetaFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaFormaPago,TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodetaformapagoConstantesFunciones.mostrarnombreTipoDetaFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodetaformapagoConstantesFunciones.resaltarnombreTipoDetaFormaPago,this.tipodetaformapagoConstantesFunciones.activarnombreTipoDetaFormaPago,this,true,"nombreTipoDetaFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodetaformapagoConstantesFunciones.resaltarnombreTipoDetaFormaPago,this.tipodetaformapagoConstantesFunciones.activarnombreTipoDetaFormaPago,this,true,"nombreTipoDetaFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDetaFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDetaFormaPago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDetaFormaPago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDetaFormaPago.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDetaFormaPago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDetaFormaPago.moveColumn(this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDetaFormaPago.moveColumn(this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDetaFormaPago.moveColumn(this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDetaFormaPago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDetaFormaPago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDetaFormaPago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDetaFormaPago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDetaFormaPago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDetaFormaPago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodetaformapagoLogic.getTipoDetaFormaPagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodetaformapagos.size()-1;
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
		//this.jTableDatosTipoDetaFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDetaFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDetaFormaPago();
			
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
				
				//this.isEsNuevoTipoDetaFormaPago=false;
					
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
				if(this.tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDetaFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDetaFormaPago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodetaformapago.getsType().equals("DUPLICADO")
				   || this.tipodetaformapago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDetaFormaPago=true;
				
				} else {
					this.isEsNuevoTipoDetaFormaPago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodetaformapago.getId()>=0 && !this.tipodetaformapago.getIsNew()) {						
						this.isEsNuevoTipoDetaFormaPago=false;
						
					} else {
						this.isEsNuevoTipoDetaFormaPago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDetaFormaPago(esRelaciones);						
				
				this.seleccionarTipoDetaFormaPago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodetaformapago.getId()<0) {
					this.isEsNuevoTipoDetaFormaPago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDetaFormaPago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDetaFormaPago(evt,rowIndex);
				}	
				
				if(this.tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDetaFormaPago: " + this.dDif); 
					}
				}								
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDetaFormaPago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodetaformapago)) {
					if(this.tipodetaformapago.getId()>0) {
						this.tipodetaformapago.setIsDeleted(true);
						
						this.tipodetaformapagosEliminados.add(this.tipodetaformapago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodetaformapagoLogic.getTipoDetaFormaPagos().remove(this.tipodetaformapago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodetaformapagos.remove(this.tipodetaformapago);				
					}
					
					
					((TipoDetaFormaPagoModel) this.jTableDatosTipoDetaFormaPago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDetaFormaPago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDetaFormaPago) {
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDetaFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDetaFormaPago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDetaFormaPago(this.tipodetaformapago);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipodetaformapagoConstantesFunciones.cargarid_empresaTipoDetaFormaPago || this.tipodetaformapagoConstantesFunciones.event_dependid_empresaTipoDetaFormaPago) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipodetaformapago.getid_empresa());
									//this.inicializarActualizarBindingTipoDetaFormaPago(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipodetaformapago.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipodetaformapago.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipodetaformapago.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDetaFormaPago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDetaFormaPago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDetaFormaPago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDetaFormaPago(tipodetaformapago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDetaFormaPago(tipodetaformapago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDetaFormaPago(tipodetaformapago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDetaFormaPago(tipodetaformapago);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.setText(tipodetaformapago.getId().toString());
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextFieldcodigoTipoDetaFormaPago.setText(tipodetaformapago.getcodigo());
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextAreanombreTipoDetaFormaPago.setText(tipodetaformapago.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDetaFormaPago tipodetaformapagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodetaformapagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDetaFormaPago tipodetaformapagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodetaformapagoLocal=this.tipodetaformapago;
			} else {
				tipodetaformapagoLocal=this.tipodetaformapagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodetaformapagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDetaFormaPago(tipodetaformapagoLocal,true);
					
					if(tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodetaformapagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodetaformapagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(tipodetaformapago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(tipodetaformapago);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(tipodetaformapago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.getText()==null || this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.getText()=="" || this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.setText("0");
			}

			if(conColumnasBase) {tipodetaformapago.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetaFormaPagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelIdTipoDetaFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodetaformapago.setcodigo(this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextFieldcodigoTipoDetaFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelcodigoTipoDetaFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodetaformapago.setnombre(this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextAreanombreTipoDetaFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelnombreTipoDetaFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapagoBean,TipoDetaFormaPago tipodetaformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapagoOrigen,TipoDetaFormaPago tipodetaformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodetaformapagoOrigen.getId()!=null && !tipodetaformapagoOrigen.getId().equals(0L))) {tipodetaformapago.setId(tipodetaformapagoOrigen.getId());}}
			if(conDefault || (!conDefault && tipodetaformapagoOrigen.getcodigo()!=null && !tipodetaformapagoOrigen.getcodigo().equals(""))) {tipodetaformapago.setcodigo(tipodetaformapagoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodetaformapagoOrigen.getnombre()!=null && !tipodetaformapagoOrigen.getnombre().equals(""))) {tipodetaformapago.setnombre(tipodetaformapagoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.setText(tipodetaformapago.getId().toString());
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextFieldcodigoTipoDetaFormaPago.setText(tipodetaformapago.getcodigo());
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextAreanombreTipoDetaFormaPago.setText(tipodetaformapago.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDetaFormaPago(TipoDetaFormaPagoBean tipodetaformapagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.setText(tipodetaformapagoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextFieldcodigoTipoDetaFormaPago.setText(tipodetaformapagoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextAreanombreTipoDetaFormaPago.setText(tipodetaformapagoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDetaFormaPago(TipoDetaFormaPagoParameterReturnGeneral tipodetaformapagoReturnGeneral,TipoDetaFormaPagoBean tipodetaformapagoBean,Boolean conDefault) throws Exception { 
		try {
			TipoDetaFormaPago tipodetaformapagoLocal=new TipoDetaFormaPago();
			
			tipodetaformapagoLocal=tipodetaformapagoReturnGeneral.getTipoDetaFormaPago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodetaformapagoLocal.getId()!=null && !tipodetaformapagoLocal.getId().equals(0L))) {tipodetaformapagoBean.setId(tipodetaformapagoLocal.getId());}}
			if(conDefault || (!conDefault && tipodetaformapagoLocal.getcodigo()!=null && !tipodetaformapagoLocal.getcodigo().equals(""))) {tipodetaformapagoBean.setcodigo(tipodetaformapagoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodetaformapagoLocal.getnombre()!=null && !tipodetaformapagoLocal.getnombre().equals(""))) {tipodetaformapagoBean.setnombre(tipodetaformapagoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDetaFormaPagoGenerico(Long idTipoDetaFormaPagoSeleccionado,JComboBox jComboBoxTipoDetaFormaPago,List<TipoDetaFormaPago> tipodetaformapagosLocal)throws Exception {
		try {
			TipoDetaFormaPago  tipodetaformapagoTemp=null;

			for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagosLocal) {
				if(tipodetaformapagoAux.getId()!=null && tipodetaformapagoAux.getId().equals(idTipoDetaFormaPagoSeleccionado)) {
					tipodetaformapagoTemp=tipodetaformapagoAux;
					break;
				}
			}

			jComboBoxTipoDetaFormaPago.setSelectedItem(tipodetaformapagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDetaFormaPagoGenerico(JComboBox jComboBoxTipoDetaFormaPago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDetaFormaPago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDetaFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDetaFormaPago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDetaFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDetaFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDetaFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetaformapago=(TipoDetaFormaPago) tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodetaformapago =(TipoDetaFormaPago) tipodetaformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipodetaformapago.getIsNew() && !tipodetaformapago.getIsChanged() && !tipodetaformapago.getIsDeleted()) {
				sDescripcion=tipodetaformapago.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipodetaformapago.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDetaFormaPago tipodetaformapagoRow=new TipoDetaFormaPago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetaformapagoRow=(TipoDetaFormaPago) tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodetaformapagoRow=(TipoDetaFormaPago) tipodetaformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDetaFormaPago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoDetaFormaPago && this.isPermisoNuevoTipoDetaFormaPago));			
			this.jButtonDuplicarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaDuplicarTipoDetaFormaPago && this.isPermisoDuplicarTipoDetaFormaPago));			
			this.jButtonCopiarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaCopiarTipoDetaFormaPago && this.isPermisoCopiarTipoDetaFormaPago));
			this.jButtonVerFormTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaVerFormTipoDetaFormaPago && this.isPermisoVerFormTipoDetaFormaPago));
			
			this.jButtonAbrirOrderByTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoDetaFormaPago && this.isPermisoOrdenTipoDetaFormaPago));			
			
			this.jButtonNuevoRelacionesTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago && this.isPermisoNuevoTipoDetaFormaPago));			
			this.jButtonNuevoGuardarCambiosTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoDetaFormaPago && this.isPermisoNuevoTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago));
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonModificarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaModificarTipoDetaFormaPago && this.isPermisoActualizarTipoDetaFormaPago));	
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonActualizarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaActualizarTipoDetaFormaPago && this.isPermisoActualizarTipoDetaFormaPago));	
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonEliminarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaEliminarTipoDetaFormaPago && this.isPermisoEliminarTipoDetaFormaPago));
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonCancelarTipoDetaFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoDetaFormaPago);							
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoDetaFormaPago && this.isPermisoNuevoTipoDetaFormaPago));						
			this.jButtonDuplicarToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaDuplicarTipoDetaFormaPago && this.isPermisoDuplicarTipoDetaFormaPago));						
			this.jButtonCopiarToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaCopiarTipoDetaFormaPago && this.isPermisoCopiarTipoDetaFormaPago));			
			this.jButtonVerFormToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaVerFormTipoDetaFormaPago && this.isPermisoVerFormTipoDetaFormaPago));			
			this.jButtonAbrirOrderByToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoDetaFormaPago && this.isPermisoOrdenTipoDetaFormaPago));
			this.jButtonNuevoRelacionesToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago && this.isPermisoNuevoTipoDetaFormaPago));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoDetaFormaPago && this.isPermisoNuevoTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago));			
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonModificarToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaModificarTipoDetaFormaPago && this.isPermisoActualizarTipoDetaFormaPago));	
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonActualizarToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaActualizarTipoDetaFormaPago  && this.isPermisoActualizarTipoDetaFormaPago));	
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonEliminarToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaEliminarTipoDetaFormaPago && this.isPermisoEliminarTipoDetaFormaPago));
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonCancelarToolBarTipoDetaFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoDetaFormaPago);				
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoDetaFormaPago && this.isPermisoNuevoTipoDetaFormaPago));			
			this.jMenuItemDuplicarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaDuplicarTipoDetaFormaPago && this.isPermisoDuplicarTipoDetaFormaPago));			
			this.jMenuItemCopiarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaCopiarTipoDetaFormaPago && this.isPermisoCopiarTipoDetaFormaPago));			
			this.jMenuItemVerFormTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaVerFormTipoDetaFormaPago && this.isPermisoVerFormTipoDetaFormaPago));			
			this.jMenuItemAbrirOrderByTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoDetaFormaPago && this.isPermisoOrdenTipoDetaFormaPago));			
			//this.jMenuItemMostrarOcultarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoDetaFormaPago && this.isPermisoOrdenTipoDetaFormaPago));
			this.jMenuItemDetalleAbrirOrderByTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoDetaFormaPago && this.isPermisoOrdenTipoDetaFormaPago));			
			//this.jMenuItemDetalleMostrarOcultarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoDetaFormaPago && this.isPermisoOrdenTipoDetaFormaPago));			
			this.jMenuItemNuevoRelacionesTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago && this.isPermisoNuevoTipoDetaFormaPago));			
			this.jMenuItemNuevoGuardarCambiosTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoDetaFormaPago && this.isPermisoNuevoTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago));									
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemModificarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaModificarTipoDetaFormaPago && this.isPermisoActualizarTipoDetaFormaPago));	
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemActualizarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaActualizarTipoDetaFormaPago && this.isPermisoActualizarTipoDetaFormaPago));	
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemEliminarTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaEliminarTipoDetaFormaPago && this.isPermisoEliminarTipoDetaFormaPago));
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemCancelarTipoDetaFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoDetaFormaPago);				
			}
			
			this.jMenuItemGuardarCambiosTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago));						
			this.jMenuItemGuardarCambiosTablaTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=this.jButtonNuevoTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDetaFormaPago=this.jButtonDuplicarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaCopiarTipoDetaFormaPago=this.jButtonCopiarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaVerFormTipoDetaFormaPago=this.jButtonVerFormTipoDetaFormaPago.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDetaFormaPago=this.jButtonAbrirOrderByTipoDetaFormaPago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=this.jButtonNuevoRelacionesTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaModificarTipoDetaFormaPago=this.jButtonModificarTipoDetaFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonActualizarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonEliminarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonCancelarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosTipoDetaFormaPago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=this.jButtonGuardarCambiosTablaTipoDetaFormaPago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=this.jButtonNuevoToolBarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=this.jButtonNuevoRelacionesToolBarTipoDetaFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			this.isVisibilidadCeldaModificarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonModificarToolBarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonActualizarToolBarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonEliminarToolBarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonCancelarToolBarTipoDetaFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDetaFormaPago=this.jButtonGuardarCambiosToolBarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=this.jButtonGuardarCambiosTablaToolBarTipoDetaFormaPago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=this.jMenuItemNuevoTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=this.jMenuItemNuevoRelacionesTipoDetaFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			this.isVisibilidadCeldaModificarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemModificarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemActualizarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemEliminarTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemCancelarTipoDetaFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDetaFormaPago=this.jMenuItemGuardarCambiosTipoDetaFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=this.jMenuItemGuardarCambiosTablaTipoDetaFormaPago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDetaFormaPago(Boolean esInicializar) {
		if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDetaFormaPago();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDetaFormaPago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDetaFormaPago() {
		this.jButtonNuevoTipoDetaFormaPago.setVisible(this.isPermisoNuevoTipoDetaFormaPago);			
		this.jButtonDuplicarTipoDetaFormaPago.setVisible(this.isPermisoDuplicarTipoDetaFormaPago);			
		this.jButtonCopiarTipoDetaFormaPago.setVisible(this.isPermisoCopiarTipoDetaFormaPago);			
		this.jButtonVerFormTipoDetaFormaPago.setVisible(this.isPermisoVerFormTipoDetaFormaPago);			
		
		this.jButtonAbrirOrderByTipoDetaFormaPago.setVisible(this.isPermisoOrdenTipoDetaFormaPago);					
		
		this.jButtonNuevoRelacionesTipoDetaFormaPago.setVisible(this.isPermisoNuevoTipoDetaFormaPago);			
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonModificarTipoDetaFormaPago.setVisible(this.isPermisoActualizarTipoDetaFormaPago);	
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonActualizarTipoDetaFormaPago.setVisible(this.isPermisoActualizarTipoDetaFormaPago);	
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonEliminarTipoDetaFormaPago.setVisible(this.isPermisoEliminarTipoDetaFormaPago);
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonCancelarTipoDetaFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoDetaFormaPago);						
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosTipoDetaFormaPago.setVisible(this.isPermisoGuardarCambiosTipoDetaFormaPago);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago.setVisible(this.isPermisoActualizarTipoDetaFormaPago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDetaFormaPago() {
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonModificarTipoDetaFormaPago.setVisible(this.isPermisoActualizarTipoDetaFormaPago);	
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonActualizarTipoDetaFormaPago.setVisible(this.isPermisoActualizarTipoDetaFormaPago);	
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonEliminarTipoDetaFormaPago.setVisible(this.isPermisoEliminarTipoDetaFormaPago);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonCancelarTipoDetaFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoDetaFormaPago);							
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosTipoDetaFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoDetaFormaPago && this.isPermisoGuardarCambiosTipoDetaFormaPago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDetaFormaPago() {
		if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDetaFormaPago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDetaFormaPago() {
	}
	
	public void jTableDatosTipoDetaFormaPagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDetaFormaPago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDetaFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.gettipodetaformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetaformapago==null) {
						this.tipodetaformapago = new TipoDetaFormaPago();
					}

					this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.tipodetaformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
				}

				if(this.tipodetaformapago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodetaformapago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetaFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoDetaFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoDetaFormaPago(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDetaFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDetaFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.gettipodetaformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipodetaformapagoLogic.getConnexion());

				if(this.tipodetaformapago.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipodetaformapago.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDetaFormaPago=(TitledBorder)this.jScrollPanelDatosTipoDetaFormaPago.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoDetaFormaPago.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoDetaFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.gettipodetaformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetaformapago==null) {
						this.tipodetaformapago = new TipoDetaFormaPago();
					}

					this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.tipodetaformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
				}

				if(this.tipodetaformapago.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipodetaformapago.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetaFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDetaFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.gettipodetaformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetaformapago==null) {
						this.tipodetaformapago = new TipoDetaFormaPago();
					}

					this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.tipodetaformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
				}

				if(this.tipodetaformapago.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodetaformapago.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetaFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDetaFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.gettipodetaformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodetaformapago==null) {
						this.tipodetaformapago = new TipoDetaFormaPago();
					}

					this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.tipodetaformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);
				}

				if(this.tipodetaformapago.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodetaformapago.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDetaFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDetaFormaPago(false,false);

			this.getTipoDetaFormaPagosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoDetaFormaPago(false);

			//if(TipoDetaFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDetaFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDetaFormaPago(false,false);

			this.getTipoDetaFormaPagosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoDetaFormaPago(false);

			//if(TipoDetaFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDetaFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoDetaFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDetaFormaPago(false,false);

			this.getTipoDetaFormaPagosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoDetaFormaPago(false);

			//if(TipoDetaFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDetaFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodetaformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDetaFormaPago() {
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDetaFormaPago.dispose();
			this.jInternalFrameDetalleFormTipoDetaFormaPago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago!=null) {
			this.jInternalFrameReporteDinamicoTipoDetaFormaPago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDetaFormaPago.dispose();
			this.jInternalFrameReporteDinamicoTipoDetaFormaPago=null;
		}
		
		if(this.jInternalFrameImportacionTipoDetaFormaPago!=null) {
			this.jInternalFrameImportacionTipoDetaFormaPago.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDetaFormaPago.dispose();
			this.jInternalFrameImportacionTipoDetaFormaPago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDetaFormaPago();
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDetaFormaPago")) {
				jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDetaFormaPago")) {
				jButtonDuplicarTipoDetaFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDetaFormaPago")) {
				jButtonCopiarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDetaFormaPago")) {
				jButtonVerFormTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDetaFormaPago")) {
				jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDetaFormaPago")) {
				jButtonDuplicarTipoDetaFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDetaFormaPago")) {
				jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDetaFormaPago")) {
				jButtonDuplicarTipoDetaFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDetaFormaPago")) {
				jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDetaFormaPago")) {
				jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDetaFormaPago")) {
				jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDetaFormaPago")) {
				jButtonModificarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDetaFormaPago")) {
				jButtonModificarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDetaFormaPago")) {
				jButtonModificarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDetaFormaPago")) {
				jButtonActualizarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDetaFormaPago")) {
				jButtonActualizarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDetaFormaPago")) {
				jButtonActualizarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDetaFormaPago")) {
				jButtonEliminarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDetaFormaPago")) {
				jButtonEliminarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDetaFormaPago")) {
				jButtonEliminarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDetaFormaPago")) {
				jButtonCancelarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDetaFormaPago")) {
				jButtonCancelarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDetaFormaPago")) {
				jButtonCancelarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDetaFormaPago")) {
				jButtonCerrarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDetaFormaPago")) {
				jButtonCerrarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDetaFormaPago")) {
				jButtonCerrarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDetaFormaPago")) {
				jButtonMostrarOcultarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDetaFormaPago")) {
				jButtonCancelarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDetaFormaPago")) {
				jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDetaFormaPago")) {
				jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDetaFormaPago")) {
				jButtonCopiarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDetaFormaPago")) {
				jButtonVerFormTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDetaFormaPago")) {
				jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDetaFormaPago")) {
				jButtonCopiarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDetaFormaPago")) {
				jButtonVerFormTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDetaFormaPago")) {
				jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDetaFormaPago")) {
				jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDetaFormaPago")) {
				jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDetaFormaPago")) {
				jButtonRecargarInformacionTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDetaFormaPago")) {
				jButtonRecargarInformacionTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDetaFormaPago")) {
				jButtonRecargarInformacionTipoDetaFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDetaFormaPago")) {
				jButtonAnterioresTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDetaFormaPago")) {
				jButtonAnterioresTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDetaFormaPago")) {
				jButtonAnterioresTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDetaFormaPago")) {
				jButtonSiguientesTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDetaFormaPago")) {
				jButtonSiguientesTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDetaFormaPago")) {
				jButtonSiguientesTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDetaFormaPago") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDetaFormaPago")) {
				jButtonAbrirOrderByTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDetaFormaPago") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDetaFormaPago")) {
				jButtonMostrarOcultarTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDetaFormaPago")) {
				jButtonNuevoGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDetaFormaPago")) {
				jButtonNuevoGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDetaFormaPago")) {
				jButtonNuevoGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDetaFormaPago")) {
				jButtonCerrarReporteDinamicoTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDetaFormaPago")) {
				jButtonGenerarReporteDinamicoTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDetaFormaPago")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDetaFormaPago")) {
				jButtonCerrarImportacionTipoDetaFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDetaFormaPago")) {
				
				jButtonGenerarImportacionTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDetaFormaPago")) {
				
				jButtonAbrirImportacionTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDetaFormaPago")) {
				jComboBoxTiposAccionesTipoDetaFormaPagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDetaFormaPago")) {
				jComboBoxTiposRelacionesTipoDetaFormaPagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDetaFormaPago")) {
				jComboBoxTiposAccionesTipoDetaFormaPagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDetaFormaPago")) {
				
				jComboBoxTiposSeleccionarTipoDetaFormaPagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDetaFormaPago")) {
				jTextFieldValorCampoGeneralTipoDetaFormaPagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDetaFormaPago")) {
				jButtonAbrirOrderByTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDetaFormaPago")) {
				jButtonAbrirOrderByTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDetaFormaPago")) {
				jButtonCerrarOrderByTipoDetaFormaPagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDetaFormaPagoBusqueda")) {
				this.jButtonidTipoDetaFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDetaFormaPagoUpdate")) {
				this.jButtonid_empresaTipoDetaFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDetaFormaPagoBusqueda")) {
				this.jButtonid_empresaTipoDetaFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDetaFormaPagoBusqueda")) {
				this.jButtoncodigoTipoDetaFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDetaFormaPagoBusqueda")) {
				this.jButtonnombreTipoDetaFormaPagoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoDetaFormaPago")) {
				this.jButtonBusquedaPorCodigoTipoDetaFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoDetaFormaPago")) {
				this.jButtonBusquedaPorNombreTipoDetaFormaPagoActionPerformed(evt);
			}
			
			;
			
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDetaFormaPago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				


				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDetaFormaPago tipodetaformapagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodetaformapagoLocal=this.tipodetaformapago;
			} else {
				tipodetaformapagoLocal=this.tipodetaformapagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
							
				
				


				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
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
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
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
			
			


			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
								
						
				


				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
								
				
				


				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
							
				
				


				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
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
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
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
			
			


			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaFormaPagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
								
				
				


				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDetaFormaPago")) {
					jCheckBoxSeleccionarTodosTipoDetaFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDetaFormaPago")) {
					jCheckBoxSeleccionadosTipoDetaFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDetaFormaPago")) {
					
				}
				
				


				
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
												
				
				


				
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaFormaPagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
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
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
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
			
			


			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDetaFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodetaformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodetaformapago);
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
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
				
				


				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDetaFormaPago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDetaFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDetaFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodetaformapagoAnterior =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDetaFormaPago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDetaFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDetaFormaPago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodetaformapago =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodetaformapago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDetaFormaPago")) {
				
				}
				
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDetaFormaPago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDetaFormaPago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDetaFormaPago")) {
			
			}
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDetaFormaPago();
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDetaFormaPago")) {
				jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDetaFormaPago")) {
				jButtonDuplicarTipoDetaFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDetaFormaPago")) {
				jButtonCopiarTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDetaFormaPago")) {
				jButtonVerFormTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDetaFormaPago")) {
				jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDetaFormaPago")) {
				jButtonModificarTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDetaFormaPago")) {
				jButtonActualizarTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDetaFormaPago")) {
				jButtonEliminarTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDetaFormaPago")) {
				jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDetaFormaPago")) {
				jButtonCancelarTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDetaFormaPago")) {
				jButtonCerrarTipoDetaFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDetaFormaPago")) {
				jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDetaFormaPago")) {
				jButtonNuevoGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDetaFormaPago")) {
				jButtonAbrirOrderByTipoDetaFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDetaFormaPago")) {
				jButtonRecargarInformacionTipoDetaFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDetaFormaPago")) {
				jButtonAnterioresTipoDetaFormaPagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDetaFormaPago")) {
				jButtonSiguientesTipoDetaFormaPagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDetaFormaPagoBusqueda")) {
				this.jButtonidTipoDetaFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDetaFormaPagoUpdate")) {
				this.jButtonid_empresaTipoDetaFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDetaFormaPagoBusqueda")) {
				this.jButtonid_empresaTipoDetaFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDetaFormaPagoBusqueda")) {
				this.jButtoncodigoTipoDetaFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDetaFormaPagoBusqueda")) {
				this.jButtonnombreTipoDetaFormaPagoBusquedaActionPerformed(evt);
			}
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDetaFormaPago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDetaFormaPago")) {
				closingInternalFrameTipoDetaFormaPago();
				
			} else if(sTipo.equals("jButtonCancelarTipoDetaFormaPago")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDetaFormaPago = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDetaFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(TipoDetaFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDetaFormaPago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDetaFormaPagoActionPerformed(null);
			}
			
			TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodetaformapago,new Object(),this.tipodetaformapagoParameterGeneral,this.tipodetaformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDetaFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDetaFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDetaFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodetaformapago)) {
			if(!esControlTabla) {
				if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.tipodetaformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);			
				}
				
				if(this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDetaFormaPago(this.tipodetaformapago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodetaformapagoReturnGeneral=tipodetaformapagoLogic.procesarEventosTipoDetaFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetaformapagoLogic.getTipoDetaFormaPagos(),this.tipodetaformapago,this.tipodetaformapagoParameterGeneral,this.isEsNuevoTipoDetaFormaPago,classes);//this.tipodetaformapagoLogic.getTipoDetaFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDetaFormaPago(this.tipodetaformapagoReturnGeneral,this.tipodetaformapagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDetaFormaPago(classes,this.tipodetaformapagoReturnGeneral,this.tipodetaformapagoBean,false);
					}
						
					if(this.tipodetaformapagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDetaFormaPago(this.tipodetaformapagoReturnGeneral.getTipoDetaFormaPago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDetaFormaPago(this.tipodetaformapagoReturnGeneral.getTipoDetaFormaPago());	
					}
						
					if(this.tipodetaformapagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDetaFormaPago(this.tipodetaformapagoReturnGeneral.getTipoDetaFormaPago(),classes);//this.tipodetaformapagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDetaFormaPago(this.tipodetaformapago,classes);//this.tipodetaformapagoBean);									
				}
			
				if(TipoDetaFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDetaFormaPago(this.tipodetaformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDetaFormaPago(this.tipodetaformapago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodetaformapagoAnterior!=null) {
						this.tipodetaformapago=this.tipodetaformapagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodetaformapagoReturnGeneral=tipodetaformapagoLogic.procesarEventosTipoDetaFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetaformapagoLogic.getTipoDetaFormaPagos(),this.tipodetaformapago,this.tipodetaformapagoParameterGeneral,this.isEsNuevoTipoDetaFormaPago,classes);//this.tipodetaformapagoLogic.getTipoDetaFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodetaformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodetaformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodetaformapagoReturnGeneral.getTipoDetaFormaPago(),tipodetaformapagoLogic.getTipoDetaFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodetaformapagoReturnGeneral.getTipoDetaFormaPago(),this.tipodetaformapagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDetaFormaPago.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDetaFormaPago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDetaFormaPago();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDetaFormaPago() throws Exception {
		
		TipoDetaFormaPagoModel tipodetaformapagoModel=(TipoDetaFormaPagoModel)this.jTableDatosTipoDetaFormaPago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodetaformapagoModel.tipodetaformapagos=this.tipodetaformapagoLogic.getTipoDetaFormaPagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodetaformapagoModel.tipodetaformapagos=this.tipodetaformapagos;
		}
		
		
		((TipoDetaFormaPagoModel) this.jTableDatosTipoDetaFormaPago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDetaFormaPago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodetaformapagoAnterior(),this.tipodetaformapagoLogic.getTipoDetaFormaPagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodetaformapagoAnterior(),this.tipodetaformapagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDetaFormaPago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
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
										
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetaformapago,new Object(),generalEntityParameterGeneral,this.tipodetaformapagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDetaFormaPagoConstantesFunciones.getClassesRelationshipsOfTipoDetaFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDetaFormaPagoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDetaFormaPago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDetaFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodetaformapago,new Object(),generalEntityParameterGeneral,this.tipodetaformapagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDetaFormaPago(TipoDetaFormaPagoBean tipodetaformapagoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDetaFormaPago(ArrayList<Classe> classes,TipoDetaFormaPagoReturnGeneral tipodetaformapagoReturnGeneral,TipoDetaFormaPagoBean tipodetaformapagoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipodetaformapago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago = new TipoDetaFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.tipodetaformapagoSessionBean.getConGuardarRelaciones(),this.tipodetaformapagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDetaFormaPago);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.setVisible(false);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.tipodetaformapagoLogic=this.tipodetaformapagoLogic;
		
		this.cargarCombosFrameForeignKeyTipoDetaFormaPago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDetaFormaPago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDetaFormaPago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDetaFormaPago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDetaFormaPago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDetaFormaPago"));
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonModificarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"ModificarTipoDetaFormaPago"));

		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonModificarToolBarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDetaFormaPago"));
					
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemModificarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDetaFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonActualizarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarTipoDetaFormaPago"));
		
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonActualizarToolBarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDetaFormaPago"));
						
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemActualizarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDetaFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonEliminarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"EliminarTipoDetaFormaPago"));
		
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonEliminarToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDetaFormaPago"));
								
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemEliminarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDetaFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonCancelarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"CancelarTipoDetaFormaPago"));
		
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonCancelarToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDetaFormaPago"));
					
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemCancelarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDetaFormaPago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemDetalleCerrarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDetaFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetaFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetaFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDetaFormaPago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonidTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetaFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonid_empresaTipoDetaFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonid_empresaTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtoncodigoTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetaFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonnombreTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetaFormaPagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jTabbedPaneRelacionesTipoDetaFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDetaFormaPago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDetaFormaPago"));
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDetaFormaPago"));
		}
		
		this.jTableDatosTipoDetaFormaPago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDetaFormaPago"));
		
		this.jTableDatosTipoDetaFormaPago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDetaFormaPago"));
		
		this.jButtonNuevoTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"NuevoTipoDetaFormaPago"));
		
		this.jButtonDuplicarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarTipoDetaFormaPago"));
		
		this.jButtonCopiarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"CopiarTipoDetaFormaPago"));
		
		this.jButtonVerFormTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"VerFormTipoDetaFormaPago"));
		
		
		this.jButtonNuevoToolBarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDetaFormaPago"));
			
		this.jButtonDuplicarToolBarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDetaFormaPago"));
			
		this.jMenuItemNuevoTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDetaFormaPago"));
			
		this.jMenuItemDuplicarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDetaFormaPago"));		
		
		
		this.jButtonNuevoRelacionesTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDetaFormaPago"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDetaFormaPago"));
			
		this.jMenuItemNuevoRelacionesTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDetaFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonModificarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"ModificarTipoDetaFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonModificarToolBarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDetaFormaPago"));
			
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemModificarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDetaFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonActualizarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarTipoDetaFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonActualizarToolBarTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDetaFormaPago"));
				
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemActualizarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDetaFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonEliminarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"EliminarTipoDetaFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonEliminarToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDetaFormaPago"));
						
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemEliminarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDetaFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonCancelarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"CancelarTipoDetaFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonCancelarToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDetaFormaPago"));
			
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemCancelarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDetaFormaPago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDetaFormaPago"));		
		
		
		this.jButtonCerrarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"CerrarTipoDetaFormaPago"));
		
		
		this.jButtonCerrarToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDetaFormaPago"));
			
		this.jMenuItemCerrarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDetaFormaPago"));
			
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jMenuItemDetalleCerrarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDetaFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDetaFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDetaFormaPago"));
		}
		
		this.jButtonCopiarToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDetaFormaPago"));
			
		this.jButtonVerFormToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDetaFormaPago"));
		
		this.jMenuItemGuardarCambiosTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDetaFormaPago"));
			
		this.jMenuItemCopiarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDetaFormaPago"));		
		
		this.jMenuItemVerFormTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDetaFormaPago"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDetaFormaPago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDetaFormaPago"));
			
		this.jMenuItemGuardarCambiosTablaTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDetaFormaPago"));		
		
		
		
		this.jButtonRecargarInformacionTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDetaFormaPago"));
					
		this.jButtonRecargarInformacionToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDetaFormaPago"));
		
		this.jMenuItemRecargarInformacionTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDetaFormaPago"));		
		
		
		
		this.jButtonAnterioresTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresTipoDetaFormaPago"));
		
		
		this.jButtonAnterioresToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDetaFormaPago"));
		
		this.jMenuItemAnterioresTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDetaFormaPago"));		
		
		
		this.jButtonSiguientesTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesTipoDetaFormaPago"));
		
		
		this.jButtonSiguientesToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDetaFormaPago"));
			
		this.jMenuItemSiguientesTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDetaFormaPago"));
			
		this.jMenuItemAbrirOrderByTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDetaFormaPago"));
			
		this.jMenuItemMostrarOcultarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDetaFormaPago"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDetaFormaPago"));
			
		this.jMenuItemDetalleMostarOcultarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDetaFormaPago"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDetaFormaPago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDetaFormaPago"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDetaFormaPago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDetaFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDetaFormaPago"));

		this.jCheckBoxSeleccionadosTipoDetaFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDetaFormaPago"));
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDetaFormaPago"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDetaFormaPago"));
			
		this.jComboBoxTiposAccionesTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDetaFormaPago"));
					
		this.jComboBoxTiposSeleccionarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDetaFormaPago"));
			
		this.jTextFieldValorCampoGeneralTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDetaFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonidTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetaFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonid_empresaTipoDetaFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonid_empresaTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtoncodigoTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetaFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonnombreTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetaFormaPagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDetaFormaPago"));

			this.jButtonBusquedaPorNombreTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDetaFormaPago"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDetaFormaPago!=null) {
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetaFormaPago"));
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetaFormaPago"));
				this.jInternalFrameReporteDinamicoTipoDetaFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetaFormaPago"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDetaFormaPago"));				
			//this.jButtonGenerarReporteDinamicoTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDetaFormaPago"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDetaFormaPago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDetaFormaPago!=null) {
				this.jInternalFrameImportacionTipoDetaFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDetaFormaPago"));
				this.jInternalFrameImportacionTipoDetaFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDetaFormaPago"));
				this.jInternalFrameImportacionTipoDetaFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDetaFormaPago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDetaFormaPago"));
			
			this.jButtonAbrirOrderByToolBarTipoDetaFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDetaFormaPago"));			
			
			if(this.jInternalFrameOrderByTipoDetaFormaPago!=null) {
				this.jInternalFrameOrderByTipoDetaFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDetaFormaPago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDetaFormaPago.jTabbedPaneRelacionesTipoDetaFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDetaFormaPago"));
		
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
            		closingInternalFrameTipoDetaFormaPago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDetaFormaPago = (JInternalFrameBase)event.getSource();
	            	
	            TipoDetaFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(TipoDetaFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDetaFormaPago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDetaFormaPagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDetaFormaPago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDetaFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDetaFormaPago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDetaFormaPago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDetaFormaPago";
		inputMap = this.jButtonNuevoTipoDetaFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDetaFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDetaFormaPago";
		inputMap = this.jButtonNuevoRelacionesTipoDetaFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDetaFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDetaFormaPagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDetaFormaPago";
		inputMap = this.jButtonModificarTipoDetaFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDetaFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDetaFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDetaFormaPago";
		inputMap = this.jButtonActualizarTipoDetaFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDetaFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDetaFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDetaFormaPago";
		inputMap = this.jButtonEliminarTipoDetaFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDetaFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDetaFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDetaFormaPago";
		inputMap = this.jButtonCancelarTipoDetaFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDetaFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDetaFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDetaFormaPago";
		inputMap = this.jButtonCerrarTipoDetaFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDetaFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDetaFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDetaFormaPago";
		inputMap = this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosTipoDetaFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonGuardarCambiosTipoDetaFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDetaFormaPago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDetaFormaPagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDetaFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDetaFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDetaFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDetaFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDetaFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDetaFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonidTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDetaFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonid_empresaTipoDetaFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonid_empresaTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDetaFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtoncodigoTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDetaFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jButtonnombreTipoDetaFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDetaFormaPagoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDetaFormaPago"));

		this.jButtonBusquedaPorNombreTipoDetaFormaPago.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDetaFormaPago"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDetaFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDetaFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDetaFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDetaFormaPago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDetaFormaPago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
					tipodetaformapagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagos) {
					tipodetaformapagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDetaFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDetaFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
						tipodetaformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagos) {
						tipodetaformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDetaFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDetaFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDetaFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDetaFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDetaFormaPago.getSelectedRows();
			
			TipoDetaFormaPago tipodetaformapagoLocal=new TipoDetaFormaPago();
			
			//this.seleccionarTodosTipoDetaFormaPago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodetaformapagoLocal =(TipoDetaFormaPago) this.tipodetaformapagoLogic.getTipoDetaFormaPagos().toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodetaformapagoLocal =(TipoDetaFormaPago) this.tipodetaformapagos.toArray()[this.jTableDatosTipoDetaFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodetaformapagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
						tipodetaformapagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagos) {
						tipodetaformapagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDetaFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDetaFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDetaFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDetaFormaPagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDetaFormaPagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDetaFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDetaFormaPago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDetaFormaPago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
				
						if(sTipoSeleccionar.equals(TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodetaformapagoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodetaformapagoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagos) {
					
						if(sTipoSeleccionar.equals(TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodetaformapagoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodetaformapagoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDetaFormaPagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDetaFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDetaFormaPago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDetaFormaPago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDetaFormaPago) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDetaFormaPago(conSplash);
				
					this.generarReporteTipoDetaFormaPagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDetaFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDetaFormaPagosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDetaFormaPagosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDetaFormaPago();
				
				this.exportarTipoDetaFormaPagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDetaFormaPagos();
				//this.importarTipoDetaFormaPagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDetaFormaPago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDetaFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Detalle Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDetaFormaPago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDetaFormaPago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDetaFormaPago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Detalle Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoDetaFormaPagoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoDetaFormaPago) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoDetaFormaPago(conSplash);
					
						//this.actualizarParametrosGeneralTipoDetaFormaPago();
						
						this.generarReporteProcesoAccionTipoDetaFormaPagosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Detalle Forma PagoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Detalle Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoDetaFormaPago();
				
						this.actualizarParametrosGeneralTipoDetaFormaPago();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipodetaformapagoReturnGeneral=tipodetaformapagoLogic.procesarAccionTipoDetaFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipodetaformapagoLogic.getTipoDetaFormaPagos(),this.tipodetaformapagoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoDetaFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDetaFormaPago();
					
					TipoDetaFormaPagoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoDetaFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDetaFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxTiposAccionesFormularioTipoDetaFormaPago.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDetaFormaPago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDetaFormaPagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDetaFormaPago();
			
			if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();		
			TipoDetaFormaPago tipodetaformapago=new TipoDetaFormaPago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDetaFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDetaFormaPago.getSelectedItem();
			
			
			
			
			tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodetaformapagosSeleccionados.size()==1) {
				for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagosSeleccionados) {
					tipodetaformapago=tipodetaformapagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDetaFormaPago();
			
      		//this.finishProcessTipoDetaFormaPago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDetaFormaPagoReturnGeneral() throws Exception {
		if(this.tipodetaformapagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodetaformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodetaformapagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodetaformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodetaformapagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodetaformapagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDetaFormaPago(false);
		}
		
		if(this.tipodetaformapagoReturnGeneral.getConRetornoLista() || this.tipodetaformapagoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodetaformapagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodetaformapagoLogic.setTipoDetaFormaPagos(this.tipodetaformapagoReturnGeneral.getTipoDetaFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodetaformapagoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodetaformapagoLogic.setTipoDetaFormaPago(this.tipodetaformapagoReturnGeneral.getTipoDetaFormaPago());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDetaFormaPago(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDetaFormaPago() throws Exception {
		
		
	}
	
	public ArrayList<TipoDetaFormaPago> getTipoDetaFormaPagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDetaFormaPago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagoLogic.getTipoDetaFormaPagos()) {
					if(tipodetaformapagoAux.getIsSelected()) {
						tipodetaformapagosSeleccionados.add(tipodetaformapagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDetaFormaPago tipodetaformapagoAux:this.tipodetaformapagos) {
					if(tipodetaformapagoAux.getIsSelected()) {
						tipodetaformapagosSeleccionados.add(tipodetaformapagoAux);				
					}
				}
			}
			
			if(tipodetaformapagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodetaformapagosSeleccionados.addAll(this.tipodetaformapagoLogic.getTipoDetaFormaPagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodetaformapagosSeleccionados.addAll(this.tipodetaformapagos);				
					}
				}
			}
		} else {
			tipodetaformapagosSeleccionados.add(this.tipodetaformapago);
		}
		
		return tipodetaformapagosSeleccionados;
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
	
	public void generarReporteTipoDetaFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDetaFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDetaFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDetaFormaPagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDetaFormaPagosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Detalle Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDetaFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();		
		
		tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDetaFormaPagos("Todos",tipodetaformapagosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDetaFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();		
		
		tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDetaFormaPagos("Todos",tipodetaformapagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDetaFormaPagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();
		
		tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDetaFormaPagos("Todos",tipodetaformapagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDetaFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDetaFormaPago();
		
		
		tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDetaFormaPago();
		
		
		//this.generarReporteTipoDetaFormaPagos("Todos",tipodetaformapagosSeleccionados ,tipodetaformapagoImplementable,tipodetaformapagoImplementableHome);
	}
	
	public void mostrarImportacionTipoDetaFormaPagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDetaFormaPago();
		
		this.abrirFrameImportacionTipoDetaFormaPago();		
		
			
		//this.generarReporteTipoDetaFormaPagos("Todos",tipodetaformapagosSeleccionados ,tipodetaformapagoImplementable,tipodetaformapagoImplementableHome);
	}
	
	public void importarTipoDetaFormaPagos() throws Exception {		
	
	}
	
	public void exportarTipoDetaFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDetaFormaPagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDetaFormaPagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDetaFormaPagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Detalle Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDetaFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();		
		
		tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetaformapago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDetaFormaPago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDetaFormaPago(tipodetaformapagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodetaformapagoAux.setsDetalleGeneralEntityReporte(tipodetaformapagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDetaFormaPago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDetaFormaPagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetaFormaPagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodetaformapago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetaformapago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetaformapago.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetaformapago.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodetaformapago.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDetaFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();		
		
		tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetaformapago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDetaFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDetaFormaPago(row);				
				iRow++;
			}				
			
			for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDetaFormaPago(tipodetaformapagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDetaFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();		
		
		tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodetaformapago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodetaformapagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodetaformapago");
			//elementRoot.appendChild(element);
		
			for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagosSeleccionados) {
				element = document.createElement("tipodetaformapago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDetaFormaPago(tipodetaformapagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Detalle Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDetaFormaPago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetaformapago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetaformapago.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetaformapago.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodetaformapago.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDetaFormaPago(TipoDetaFormaPago tipodetaformapago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDetaFormaPagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodetaformapago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDetaFormaPagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodetaformapago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoDetaFormaPagoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipodetaformapago.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoDetaFormaPagoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodetaformapago.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDetaFormaPagoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodetaformapago.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDetaFormaPagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados=new ArrayList<TipoDetaFormaPago>();
		
		tipodetaformapagosSeleccionados=this.getTipoDetaFormaPagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDetaFormaPago(tipodetaformapagosSeleccionados);
		
		this.generarReporteTipoDetaFormaPagos("Todos",tipodetaformapagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDetaFormaPago(ArrayList<TipoDetaFormaPago> tipodetaformapagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDetaFormaPago tipodetaformapagoAux:tipodetaformapagosSeleccionados) {
				tipodetaformapagoAux.setsDetalleGeneralEntityReporte(tipodetaformapagoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDetaFormaPagoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipodetaformapagoAux.setsDescripcionGeneralEntityReporte1(tipodetaformapagoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDetaFormaPagoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodetaformapagoAux.setsDescripcionGeneralEntityReporte1(tipodetaformapagoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDetaFormaPagoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodetaformapagoAux.setsDescripcionGeneralEntityReporte1(tipodetaformapagoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDetaFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDetaFormaPago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDetaFormaPago=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=false;
			this.isVisibilidadCeldaModificarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=true;
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=false;
			this.isVisibilidadCeldaModificarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=true;
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=true;
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=false;
			this.isVisibilidadCeldaModificarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=true;
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=true;
			this.isVisibilidadCeldaModificarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=false;
			this.isVisibilidadCeldaModificarTipoDetaFormaPago=true;
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoDetaFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDetaFormaPago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDetaFormaPagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=true;
		} else {
			this.actualizarEstadoPanelsTipoDetaFormaPago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDetaFormaPago=false;
			//this.isVisibilidadCeldaVerFormTipoDetaFormaPago=false;
			this.isVisibilidadCeldaDuplicarTipoDetaFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodetaformapagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDetaFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDetaFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!tipodetaformapagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=false;												
			}
			
			this.jButtonCerrarTipoDetaFormaPago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDetaFormaPago=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodetaformapago)) {
			this.isVisibilidadCeldaActualizarTipoDetaFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoDetaFormaPago=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDetaFormaPago() {
	}
	
	public void actualizarEstadoPanelsTipoDetaFormaPago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoDetaFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosTipoDetaFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetaFormaPago!=null) {
				this.jPanelPaginacionTipoDetaFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetaFormaPago!=null) {
				this.jPanelParametrosReportesTipoDetaFormaPago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoDetaFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosTipoDetaFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetaFormaPago!=null) {
				this.jPanelPaginacionTipoDetaFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetaFormaPago!=null) {
				this.jPanelParametrosReportesTipoDetaFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoDetaFormaPago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosTipoDetaFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetaFormaPago!=null) {
				this.jPanelPaginacionTipoDetaFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetaFormaPago!=null) {
				this.jPanelParametrosReportesTipoDetaFormaPago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoDetaFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosTipoDetaFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDetaFormaPago!=null) {
				this.jPanelPaginacionTipoDetaFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDetaFormaPago!=null) {
				this.jPanelParametrosReportesTipoDetaFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoDetaFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosTipoDetaFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetaFormaPago!=null) {
				this.jPanelPaginacionTipoDetaFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetaFormaPago!=null) {
				this.jPanelParametrosReportesTipoDetaFormaPago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoDetaFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosTipoDetaFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetaFormaPago!=null) {
				this.jPanelPaginacionTipoDetaFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetaFormaPago!=null) {
				this.jPanelParametrosReportesTipoDetaFormaPago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoDetaFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDetaFormaPago!=null) {
				this.jScrollPanelDatosTipoDetaFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDetaFormaPago!=null) {
				this.jPanelPaginacionTipoDetaFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDetaFormaPago!=null) {
				this.jPanelParametrosReportesTipoDetaFormaPago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDetaFormaPago!=null) {
					this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDetaFormaPago!=null) {
				this.jPanelParametrosReportesTipoDetaFormaPago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodetaformapagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDetaFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDetaFormaPago!=null) {
				this.jPanelParametrosReportesTipoDetaFormaPago.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoDetaFormaPago.remove(jPanelBusquedaPorCodigoTipoDetaFormaPago);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoDetaFormaPago.remove(jPanelBusquedaPorNombreTipoDetaFormaPago);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDetaFormaPagoSessionBean tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean();
		
		if(this.tipodetaformapagoSessionBean==null) {
			this.tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean();
		}
		
		this.tipodetaformapagoSessionBean.setsUltimaBusquedaTipoDetaFormaPago(this.getsAccionBusqueda());
		this.tipodetaformapagoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodetaformapagoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipodetaformapagoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipodetaformapagoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipodetaformapagoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDetaFormaPagoSessionBean tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean();
		
		if(this.tipodetaformapagoSessionBean==null) {
			this.tipodetaformapagoSessionBean=new TipoDetaFormaPagoSessionBean();
		}
		
		if(this.tipodetaformapagoSessionBean.getsUltimaBusquedaTipoDetaFormaPago()!=null&&!this.tipodetaformapagoSessionBean.getsUltimaBusquedaTipoDetaFormaPago().equals("")) {
			this.setsAccionBusqueda(tipodetaformapagoSessionBean.getsUltimaBusquedaTipoDetaFormaPago());
			this.setiNumeroPaginacion(tipodetaformapagoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodetaformapagoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipodetaformapagoSessionBean.getcodigo());
				tipodetaformapagoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipodetaformapagoSessionBean.getnombre());
				tipodetaformapagoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipodetaformapagoSessionBean.getid_empresa());
				tipodetaformapagoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipodetaformapagoSessionBean.setsUltimaBusquedaTipoDetaFormaPago("");
		this.tipodetaformapagoSessionBean.setiNumeroPaginacion(TipoDetaFormaPagoConstantesFunciones.INUMEROPAGINACION);
		this.tipodetaformapagoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDetaFormaPago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDetaFormaPago() {
		this.updateBorderResaltarBusquedasFormularioTipoDetaFormaPago();
		this.updateVisibilidadBusquedasFormularioTipoDetaFormaPago();
		this.updateHabilitarBusquedasFormularioTipoDetaFormaPago();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDetaFormaPago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponents().length>0) {
	

		if(this.tipodetaformapagoConstantesFunciones.resaltarBusquedaPorCodigoTipoDetaFormaPago!=null) {
			index= this.jTabbedPaneBusquedasTipoDetaFormaPago.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetaFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponent(index);
				jPanel.setBorder(this.tipodetaformapagoConstantesFunciones.resaltarBusquedaPorCodigoTipoDetaFormaPago);
			}
		}

		if(this.tipodetaformapagoConstantesFunciones.resaltarBusquedaPorNombreTipoDetaFormaPago!=null) {
			index= this.jTabbedPaneBusquedasTipoDetaFormaPago.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetaFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponent(index);
				jPanel.setBorder(this.tipodetaformapagoConstantesFunciones.resaltarBusquedaPorNombreTipoDetaFormaPago);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDetaFormaPago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDetaFormaPago.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetaFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodetaformapagoConstantesFunciones.mostrarBusquedaPorCodigoTipoDetaFormaPago);
			if(!this.tipodetaformapagoConstantesFunciones.mostrarBusquedaPorCodigoTipoDetaFormaPago && index>-1) {
				this.jTabbedPaneBusquedasTipoDetaFormaPago.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDetaFormaPago.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetaFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodetaformapagoConstantesFunciones.mostrarBusquedaPorNombreTipoDetaFormaPago);
			if(!this.tipodetaformapagoConstantesFunciones.mostrarBusquedaPorNombreTipoDetaFormaPago && index>-1) {
				this.jTabbedPaneBusquedasTipoDetaFormaPago.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDetaFormaPago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDetaFormaPago.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetaFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodetaformapagoConstantesFunciones.activarBusquedaPorCodigoTipoDetaFormaPago);
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setEnabledAt(index,this.tipodetaformapagoConstantesFunciones.activarBusquedaPorCodigoTipoDetaFormaPago);
			}

			index= this.jTabbedPaneBusquedasTipoDetaFormaPago.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetaFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodetaformapagoConstantesFunciones.activarBusquedaPorNombreTipoDetaFormaPago);
				this.jTabbedPaneBusquedasTipoDetaFormaPago.setEnabledAt(index,this.tipodetaformapagoConstantesFunciones.activarBusquedaPorNombreTipoDetaFormaPago);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDetaFormaPago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoDetaFormaPago.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDetaFormaPago);

			this.jTabbedPaneBusquedasTipoDetaFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponent(index);

			this.tipodetaformapagoConstantesFunciones.setResaltarBusquedaPorCodigoTipoDetaFormaPago(resaltar);

			jPanel.setBorder(this.tipodetaformapagoConstantesFunciones.resaltarBusquedaPorCodigoTipoDetaFormaPago);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoDetaFormaPago.indexOfComponent(this.jPanelBusquedaPorNombreTipoDetaFormaPago);

			this.jTabbedPaneBusquedasTipoDetaFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDetaFormaPago.getComponent(index);

			this.tipodetaformapagoConstantesFunciones.setResaltarBusquedaPorNombreTipoDetaFormaPago(resaltar);

			jPanel.setBorder(this.tipodetaformapagoConstantesFunciones.resaltarBusquedaPorNombreTipoDetaFormaPago);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoDetaFormaPago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDetaFormaPago() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDetaFormaPago();
		this.updateVisibilidadResaltarControlesFormularioTipoDetaFormaPago();
		this.updateHabilitarResaltarControlesFormularioTipoDetaFormaPago();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDetaFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodetaformapagoConstantesFunciones.resaltaridTipoDetaFormaPago!=null && this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.setBorder(this.tipodetaformapagoConstantesFunciones.resaltaridTipoDetaFormaPago);}
		if(this.tipodetaformapagoConstantesFunciones.resaltarid_empresaTipoDetaFormaPago!=null && this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.setBorder(this.tipodetaformapagoConstantesFunciones.resaltarid_empresaTipoDetaFormaPago);}
		if(this.tipodetaformapagoConstantesFunciones.resaltarcodigoTipoDetaFormaPago!=null && this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextFieldcodigoTipoDetaFormaPago.setBorder(this.tipodetaformapagoConstantesFunciones.resaltarcodigoTipoDetaFormaPago);}
		if(this.tipodetaformapagoConstantesFunciones.resaltarnombreTipoDetaFormaPago!=null && this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextAreanombreTipoDetaFormaPago.setBorder(this.tipodetaformapagoConstantesFunciones.resaltarnombreTipoDetaFormaPago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDetaFormaPago() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
	
		//this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.setVisible(this.tipodetaformapagoConstantesFunciones.mostraridTipoDetaFormaPago);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jPanelidTipoDetaFormaPago.setVisible(this.tipodetaformapagoConstantesFunciones.mostraridTipoDetaFormaPago);
		//this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.setVisible(this.tipodetaformapagoConstantesFunciones.mostrarid_empresaTipoDetaFormaPago);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jPanelid_empresaTipoDetaFormaPago.setVisible(this.tipodetaformapagoConstantesFunciones.mostrarid_empresaTipoDetaFormaPago);
		//this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextFieldcodigoTipoDetaFormaPago.setVisible(this.tipodetaformapagoConstantesFunciones.mostrarcodigoTipoDetaFormaPago);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jPanelcodigoTipoDetaFormaPago.setVisible(this.tipodetaformapagoConstantesFunciones.mostrarcodigoTipoDetaFormaPago);
		//this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextAreanombreTipoDetaFormaPago.setVisible(this.tipodetaformapagoConstantesFunciones.mostrarnombreTipoDetaFormaPago);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jPanelnombreTipoDetaFormaPago.setVisible(this.tipodetaformapagoConstantesFunciones.mostrarnombreTipoDetaFormaPago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDetaFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDetaFormaPago!=null) {
	
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jLabelidTipoDetaFormaPago.setEnabled(this.tipodetaformapagoConstantesFunciones.activaridTipoDetaFormaPago);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jComboBoxid_empresaTipoDetaFormaPago.setEnabled(this.tipodetaformapagoConstantesFunciones.activarid_empresaTipoDetaFormaPago);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextFieldcodigoTipoDetaFormaPago.setEnabled(this.tipodetaformapagoConstantesFunciones.activarcodigoTipoDetaFormaPago);
		this.jInternalFrameDetalleFormTipoDetaFormaPago.jTextAreanombreTipoDetaFormaPago.setEnabled(this.tipodetaformapagoConstantesFunciones.activarnombreTipoDetaFormaPago);
		}
	}
	
		
}