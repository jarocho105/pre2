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

import com.bydan.erp.contabilidad.util.TipoAutoPagoConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoAutoPagoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoAutoPagoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoAutoPagoBean;
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
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoAutoPagoBeanSwingJInternalFrame extends TipoAutoPagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoAutoPagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoAutoPago> tipoautopagoValidator = new ClassValidator<TipoAutoPago>(TipoAutoPago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoAutoPago tipoautopago;	
	public TipoAutoPago tipoautopagoAux;
	public TipoAutoPago tipoautopagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoAutoPago tipoautopagoTotales;
	public Long idTipoAutoPagoActual;
	public Long iIdNuevoTipoAutoPago=0L;
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
	
	public Boolean isPermisoTodoTipoAutoPago;
	public Boolean isPermisoNuevoTipoAutoPago;
	public Boolean isPermisoActualizarTipoAutoPago;
	public Boolean isPermisoActualizarOriginalTipoAutoPago;
	public Boolean isPermisoEliminarTipoAutoPago;
	public Boolean isPermisoGuardarCambiosTipoAutoPago;
	public Boolean isPermisoConsultaTipoAutoPago;
	public Boolean isPermisoBusquedaTipoAutoPago;
	public Boolean isPermisoReporteTipoAutoPago;
	public Boolean isPermisoPaginacionMedioTipoAutoPago;
	public Boolean isPermisoPaginacionAltoTipoAutoPago;
	public Boolean isPermisoPaginacionTodoTipoAutoPago;
	public Boolean isPermisoCopiarTipoAutoPago;
	public Boolean isPermisoVerFormTipoAutoPago;
	public Boolean isPermisoDuplicarTipoAutoPago;
	public Boolean isPermisoOrdenTipoAutoPago;
	
	
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
	
	public TipoAutoPagoParameterReturnGeneral tipoautopagoReturnGeneral;
	public TipoAutoPagoParameterReturnGeneral tipoautopagoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoAutoPago=false;
	public Boolean esParaAccionDesdeFormularioTipoAutoPago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoAutoPagoLogic tipoautopagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoAutoPago tipoautopagoBean;
	public TipoAutoPagoConstantesFunciones tipoautopagoConstantesFunciones;
	//public TipoAutoPagoParameterReturnGeneral tipoautopagoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoAutoPago> tipoautopagos;	
	//public List<TipoAutoPago> tipoautopagosEliminados;
	//public List<TipoAutoPago> tipoautopagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoAutoPago=false;
	public Boolean isVisibilidadCeldaDuplicarTipoAutoPago=true;
	public Boolean isVisibilidadCeldaCopiarTipoAutoPago=true;
	public Boolean isVisibilidadCeldaVerFormTipoAutoPago=true;
	public Boolean isVisibilidadCeldaOrdenTipoAutoPago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoAutoPago=false;
	public Boolean isVisibilidadCeldaModificarTipoAutoPago=false;
	public Boolean isVisibilidadCeldaActualizarTipoAutoPago=false;
	public Boolean isVisibilidadCeldaEliminarTipoAutoPago=false;
	public Boolean isVisibilidadCeldaCancelarTipoAutoPago=false;
	public Boolean isVisibilidadCeldaGuardarTipoAutoPago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoAutoPago=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoAutoPago() {
		return this.iIdNuevoTipoAutoPago;
	}

	public void setiIdNuevoTipoAutoPago(Long iIdNuevoTipoAutoPago) {
		this.iIdNuevoTipoAutoPago = iIdNuevoTipoAutoPago;
	}
	
	public Long getidTipoAutoPagoActual() {
		return this.idTipoAutoPagoActual;
	}

	public void setidTipoAutoPagoActual(Long idTipoAutoPagoActual) {
		this.idTipoAutoPagoActual = idTipoAutoPagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoAutoPago gettipoautopago() {
		return this.tipoautopago;
	}

	public void settipoautopago(TipoAutoPago tipoautopago) {
		this.tipoautopago = tipoautopago;
	}
	
	public TipoAutoPago gettipoautopagoAux() {
		return this.tipoautopagoAux;
	}

	public void settipoautopagoAux(TipoAutoPago tipoautopagoAux) {
		this.tipoautopagoAux = tipoautopagoAux;
	}				
	
	public TipoAutoPago gettipoautopagoAnterior() {
		return this.tipoautopagoAnterior;
	}

	public void settipoautopagoAnterior(TipoAutoPago tipoautopagoAnterior) {
		this.tipoautopagoAnterior = tipoautopagoAnterior;
	}	
	
	public TipoAutoPago gettipoautopagoTotales() {
		return this.tipoautopagoTotales;
	}

	public void settipoautopagoTotales(TipoAutoPago tipoautopagoTotales) {
		this.tipoautopagoTotales = tipoautopagoTotales;
	}	
	
	public TipoAutoPago gettipoautopagoBean() {
		return this.tipoautopagoBean;
	}

	public void settipoautopagoBean(TipoAutoPago tipoautopagoBean) {
		this.tipoautopagoBean = tipoautopagoBean;
	}	
	
	public TipoAutoPagoParameterReturnGeneral gettipoautopagoReturnGeneral() {
		return this.tipoautopagoReturnGeneral;
	}

	public void settipoautopagoReturnGeneral(TipoAutoPagoParameterReturnGeneral tipoautopagoReturnGeneral) {
		this.tipoautopagoReturnGeneral = tipoautopagoReturnGeneral;
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
	
	
	public TipoAutoPagoLogic getTipoAutoPagoLogic()	{		
		return tipoautopagoLogic;
	}

	public void setTipoAutoPagoLogic(TipoAutoPagoLogic tipoautopagoLogic) {
		this.tipoautopagoLogic = tipoautopagoLogic;
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
	
	public Boolean getIsEsNuevoTipoAutoPago() {
		return isEsNuevoTipoAutoPago;
	}

	public void setIsEsNuevoTipoAutoPago(Boolean isEsNuevoTipoAutoPago) {
		this.isEsNuevoTipoAutoPago = isEsNuevoTipoAutoPago;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoAutoPago() {
		return esParaAccionDesdeFormularioTipoAutoPago;
	}
	
	public void setEsParaAccionDesdeFormularioTipoAutoPago(Boolean esParaAccionDesdeFormularioTipoAutoPago) {
		this.esParaAccionDesdeFormularioTipoAutoPago = esParaAccionDesdeFormularioTipoAutoPago;
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

			if(this.tipoautopagoSessionBean==null) {
				this.tipoautopagoSessionBean=new TipoAutoPagoSessionBean();
			}

			if(!this.tipoautopagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoautopagoSessionBean.getlidEmpresaActual());
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

					if(this.tipoautopago!=null) {
						this.tipoautopago.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
						this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoAutoPago.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
						if(this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoAutoPagoGenerico)throws Exception
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
				jComboBoxid_empresaTipoAutoPagoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoAutoPagoGenerico!=null && jComboBoxid_empresaTipoAutoPagoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoAutoPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoAutoPago tipoautopago,JComboBox jComboBoxid_empresaTipoAutoPagoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoAutoPagoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoAutoPagoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoautopago.setid_empresa(empresaAux.getId());
				tipoautopago.setempresa_descripcion(TipoAutoPagoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoautopago.setEmpresa(empresaAux);			}
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

					if(!TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { 
							this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { 
					}

					if(!TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
							this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
							this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoAutoPago() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoAutoPagoConstantesFunciones.refrescarForeignKeysDescripcionesTipoAutoPago(this.tipoautopagoLogic.getTipoAutoPagos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoAutoPagoConstantesFunciones.refrescarForeignKeysDescripcionesTipoAutoPago(this.tipoautopagos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoautopagoLogic.setTipoAutoPagos(this.tipoautopagos);
			tipoautopagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoAutoPagoParameterReturnGeneral getTipoAutoPagoParameterGeneral() {
		return this.tipoautopagoParameterGeneral;
	}
	
	public void setTipoAutoPagoParameterGeneral(TipoAutoPagoParameterReturnGeneral tipoautopagoParameterGeneral) {
		this.tipoautopagoParameterGeneral = tipoautopagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoAutoPago() {
		return isPermisoTodoTipoAutoPago;
	}

	public void setIsPermisoTodoTipoAutoPago(Boolean isPermisoTodoTipoAutoPago) {
		this.isPermisoTodoTipoAutoPago = isPermisoTodoTipoAutoPago;
	}

	public Boolean getIsPermisoNuevoTipoAutoPago() {
		return isPermisoNuevoTipoAutoPago;
	}

	public void setIsPermisoNuevoTipoAutoPago(Boolean isPermisoNuevoTipoAutoPago) {
		this.isPermisoNuevoTipoAutoPago = isPermisoNuevoTipoAutoPago;
	}

	public Boolean getIsPermisoActualizarTipoAutoPago() {
		return isPermisoActualizarTipoAutoPago;
	}

	public void setIsPermisoActualizarTipoAutoPago(Boolean isPermisoActualizarTipoAutoPago) {
		this.isPermisoActualizarTipoAutoPago = isPermisoActualizarTipoAutoPago;
	}

	public Boolean getIsPermisoEliminarTipoAutoPago() {
		return isPermisoEliminarTipoAutoPago;
	}

	public void setIsPermisoEliminarTipoAutoPago(Boolean isPermisoEliminarTipoAutoPago) {
		this.isPermisoEliminarTipoAutoPago = isPermisoEliminarTipoAutoPago;
	}

	public Boolean getIsPermisoGuardarCambiosTipoAutoPago() {
		return isPermisoGuardarCambiosTipoAutoPago;
	}

	public void setIsPermisoGuardarCambiosTipoAutoPago(Boolean isPermisoGuardarCambiosTipoAutoPago) {
		this.isPermisoGuardarCambiosTipoAutoPago = isPermisoGuardarCambiosTipoAutoPago;
	}
	
	public Boolean getIsPermisoConsultaTipoAutoPago() {
		return isPermisoConsultaTipoAutoPago;
	}

	public void setIsPermisoConsultaTipoAutoPago(Boolean isPermisoConsultaTipoAutoPago) {
		this.isPermisoConsultaTipoAutoPago = isPermisoConsultaTipoAutoPago;
	}

	public Boolean getIsPermisoBusquedaTipoAutoPago() {
		return isPermisoBusquedaTipoAutoPago;
	}

	public void setIsPermisoBusquedaTipoAutoPago(Boolean isPermisoBusquedaTipoAutoPago) {
		this.isPermisoBusquedaTipoAutoPago = isPermisoBusquedaTipoAutoPago;
	}

	public Boolean getIsPermisoReporteTipoAutoPago() {
		return isPermisoReporteTipoAutoPago;
	}

	public void setIsPermisoReporteTipoAutoPago(Boolean isPermisoReporteTipoAutoPago) {
		this.isPermisoReporteTipoAutoPago = isPermisoReporteTipoAutoPago;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoAutoPago() {
		return isPermisoPaginacionMedioTipoAutoPago;
	}

	public void setIsPermisoPaginacionMedioTipoAutoPago(Boolean isPermisoPaginacionMedioTipoAutoPago) {
		this.isPermisoPaginacionMedioTipoAutoPago = isPermisoPaginacionMedioTipoAutoPago;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoAutoPago() {
		return isPermisoPaginacionTodoTipoAutoPago;
	}

	public void setIsPermisoPaginacionTodoTipoAutoPago(Boolean isPermisoPaginacionTodoTipoAutoPago) {
		this.isPermisoPaginacionTodoTipoAutoPago = isPermisoPaginacionTodoTipoAutoPago;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoAutoPago() {
		return isPermisoPaginacionAltoTipoAutoPago;
	}

	public void setIsPermisoPaginacionAltoTipoAutoPago(Boolean isPermisoPaginacionAltoTipoAutoPago) {
		this.isPermisoPaginacionAltoTipoAutoPago = isPermisoPaginacionAltoTipoAutoPago;
	}
	
	public Boolean getIsPermisoCopiarTipoAutoPago() {
		return isPermisoCopiarTipoAutoPago;
	}

	public void setIsPermisoCopiarTipoAutoPago(Boolean isPermisoCopiarTipoAutoPago) {
		this.isPermisoCopiarTipoAutoPago = isPermisoCopiarTipoAutoPago;
	}
	
	public Boolean getIsPermisoVerFormTipoAutoPago() {
		return isPermisoVerFormTipoAutoPago;
	}

	public void setIsPermisoVerFormTipoAutoPago(Boolean isPermisoVerFormTipoAutoPago) {
		this.isPermisoVerFormTipoAutoPago = isPermisoVerFormTipoAutoPago;
	}
	
	public Boolean getIsPermisoDuplicarTipoAutoPago() {
		return isPermisoDuplicarTipoAutoPago;
	}

	public void setIsPermisoDuplicarTipoAutoPago(Boolean isPermisoDuplicarTipoAutoPago) {
		this.isPermisoDuplicarTipoAutoPago = isPermisoDuplicarTipoAutoPago;
	}
	
	public Boolean getIsPermisoOrdenTipoAutoPago() {
		return isPermisoOrdenTipoAutoPago;
	}

	public void setIsPermisoOrdenTipoAutoPago(Boolean isPermisoOrdenTipoAutoPago) {
		this.isPermisoOrdenTipoAutoPago = isPermisoOrdenTipoAutoPago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoAutoPago() {
		return isVisibilidadCeldaNuevoTipoAutoPago;
	}

	public void setIsVisibilidadCeldaNuevoTipoAutoPago(Boolean isVisibilidadCeldaNuevoTipoAutoPago) {
		this.isVisibilidadCeldaNuevoTipoAutoPago = isVisibilidadCeldaNuevoTipoAutoPago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoAutoPago() {
		return isVisibilidadCeldaDuplicarTipoAutoPago;
	}

	public void setIsVisibilidadCeldaDuplicarTipoAutoPago(Boolean isVisibilidadCeldaDuplicarTipoAutoPago) {
		this.isVisibilidadCeldaDuplicarTipoAutoPago = isVisibilidadCeldaDuplicarTipoAutoPago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoAutoPago() {
		return isVisibilidadCeldaCopiarTipoAutoPago;
	}

	public void setIsVisibilidadCeldaCopiarTipoAutoPago(Boolean isVisibilidadCeldaCopiarTipoAutoPago) {
		this.isVisibilidadCeldaCopiarTipoAutoPago = isVisibilidadCeldaCopiarTipoAutoPago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoAutoPago() {
		return isVisibilidadCeldaVerFormTipoAutoPago;
	}

	public void setIsVisibilidadCeldaVerFormTipoAutoPago(Boolean isVisibilidadCeldaVerFormTipoAutoPago) {
		this.isVisibilidadCeldaVerFormTipoAutoPago = isVisibilidadCeldaVerFormTipoAutoPago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoAutoPago() {
		return isVisibilidadCeldaOrdenTipoAutoPago;
	}

	public void setIsVisibilidadCeldaOrdenTipoAutoPago(Boolean isVisibilidadCeldaOrdenTipoAutoPago) {
		this.isVisibilidadCeldaOrdenTipoAutoPago = isVisibilidadCeldaOrdenTipoAutoPago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoAutoPago() {
		return isVisibilidadCeldaNuevoRelacionesTipoAutoPago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoAutoPago(Boolean isVisibilidadCeldaNuevoRelacionesTipoAutoPago) {
		this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago = isVisibilidadCeldaNuevoRelacionesTipoAutoPago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoAutoPago() {
		return isVisibilidadCeldaModificarTipoAutoPago;
	}

	public void setIsVisibilidadCeldaModificarTipoAutoPago(Boolean isVisibilidadCeldaModificarTipoAutoPago) {
		this.isVisibilidadCeldaModificarTipoAutoPago = isVisibilidadCeldaModificarTipoAutoPago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoAutoPago() {
		return isVisibilidadCeldaActualizarTipoAutoPago;
	}

	public void setIsVisibilidadCeldaActualizarTipoAutoPago(Boolean isVisibilidadCeldaActualizarTipoAutoPago) {
		this.isVisibilidadCeldaActualizarTipoAutoPago = isVisibilidadCeldaActualizarTipoAutoPago;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoAutoPago() {
		return isVisibilidadCeldaEliminarTipoAutoPago;
	}

	public void setIsVisibilidadCeldaEliminarTipoAutoPago(Boolean isVisibilidadCeldaEliminarTipoAutoPago) {
		this.isVisibilidadCeldaEliminarTipoAutoPago = isVisibilidadCeldaEliminarTipoAutoPago;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoAutoPago() {
		return isVisibilidadCeldaCancelarTipoAutoPago;
	}

	public void setIsVisibilidadCeldaCancelarTipoAutoPago(Boolean isVisibilidadCeldaCancelarTipoAutoPago) {
		this.isVisibilidadCeldaCancelarTipoAutoPago = isVisibilidadCeldaCancelarTipoAutoPago;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoAutoPago() {
		return isVisibilidadCeldaGuardarTipoAutoPago;
	}

	public void setIsVisibilidadCeldaGuardarTipoAutoPago(Boolean isVisibilidadCeldaGuardarTipoAutoPago) {
		this.isVisibilidadCeldaGuardarTipoAutoPago = isVisibilidadCeldaGuardarTipoAutoPago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoAutoPago() {
		return isVisibilidadCeldaGuardarCambiosTipoAutoPago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoAutoPago(Boolean isVisibilidadCeldaGuardarCambiosTipoAutoPago) {
		this.isVisibilidadCeldaGuardarCambiosTipoAutoPago = isVisibilidadCeldaGuardarCambiosTipoAutoPago;
	}
		
	public TipoAutoPagoSessionBean gettipoautopagoSessionBean() {
		return this.tipoautopagoSessionBean;
	}
	
	public void settipoautopagoSessionBean(TipoAutoPagoSessionBean tipoautopagoSessionBean) {
		this.tipoautopagoSessionBean=tipoautopagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(TipoAutoPago tipoautopago)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoautopago,null);
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
	
	public void bugActualizarReferenciaActual(TipoAutoPago tipoautopago,TipoAutoPago tipoautopagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoAutoPago(tipoautopago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoautopagoAux.setId(tipoautopago.getId());
		tipoautopagoAux.setVersionRow(tipoautopago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoAutoPago();
		
			int intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoAutoPago(this.tipoautopago,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoautopagoValidator.getInvalidValues(this.tipoautopago);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoautopagoLogic.setDatosCliente(datosCliente);
			tipoautopagoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoautopagoAux=new  TipoAutoPago();
				
				tipoautopagoAux.setIsNew(true);
				tipoautopagoAux.setIsChanged(true);
				
				tipoautopagoAux.setTipoAutoPagoOriginal(this.tipoautopago);
				
				tipoautopagoAux.setId(this.tipoautopago.getId());	
				tipoautopagoAux.setVersionRow(this.tipoautopago.getVersionRow());	
				tipoautopagoAux.setid_empresa(this.tipoautopago.getid_empresa());	
				tipoautopagoAux.setcodigo(this.tipoautopago.getcodigo());	
				tipoautopagoAux.setnombre(this.tipoautopago.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoautopagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoautopagoAux,tipoautopagoLogic.getTipoAutoPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoautopagoAux,tipoautopagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoautopagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautopagoLogic.saveTipoAutoPagos();//WithConnection
						//tipoautopagoLogic.getSetVersionRowTipoAutoPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoautopago,tipoautopagoAux);
					
					this.refrescarForeignKeysDescripcionesTipoAutoPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoautopagoAux=new  TipoAutoPago();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoautopagoSessionBean.getEsGuardarRelacionado() && this.tipoautopago.getId()>=0)) {
						
					tipoautopagoAux.setIsNew(false);
				}
				
				tipoautopagoAux.setIsDeleted(false);
			
				tipoautopagoAux.setId(this.tipoautopago.getId());	
				tipoautopagoAux.setVersionRow(this.tipoautopago.getVersionRow());	
				tipoautopagoAux.setid_empresa(this.tipoautopago.getid_empresa());	
				tipoautopagoAux.setcodigo(this.tipoautopago.getcodigo());	
				tipoautopagoAux.setnombre(this.tipoautopago.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoautopagoAux,tipoautopagoLogic.getTipoAutoPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoautopagoAux,tipoautopagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoautopagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautopagoLogic.saveTipoAutoPagos();//WithConnection
						//tipoautopagoLogic.getSetVersionRowTipoAutoPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoautopago,tipoautopagoAux);
					
					this.refrescarForeignKeysDescripcionesTipoAutoPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoautopagoAux=new  TipoAutoPago();
				
				tipoautopagoAux.setIsNew(false);
				tipoautopagoAux.setIsChanged(false);
				
				tipoautopagoAux.setIsDeleted(true);
				
				tipoautopagoAux.setId(this.tipoautopago.getId());	
				tipoautopagoAux.setVersionRow(this.tipoautopago.getVersionRow());	
				tipoautopagoAux.setid_empresa(this.tipoautopago.getid_empresa());	
				tipoautopagoAux.setcodigo(this.tipoautopago.getcodigo());	
				tipoautopagoAux.setnombre(this.tipoautopago.getnombre());	
				
				if(this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoautopagoAux.getId()>=0) {	
						this.tipoautopagosEliminados.add(tipoautopagoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoautopagoAux,tipoautopagoLogic.getTipoAutoPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoautopagoAux,tipoautopagos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoautopagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautopagoLogic.saveTipoAutoPagos();//WithConnection
						//tipoautopagoLogic.getSetVersionRowTipoAutoPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoautopagoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoautopagoAux,tipoautopagoLogic.getTipoAutoPagos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoautopagoAux,tipoautopagos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.getTipoAutoPagos().addAll(this.tipoautopagosEliminados);
					
					tipoautopagoLogic.saveTipoAutoPagos();//WithConnection
					//tipoautopagoLogic.getSetVersionRowTipoAutoPagos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoAutoPago();
				
				this.tipoautopagosEliminados= new ArrayList<TipoAutoPago>();		
			}
			
			if(this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Auto Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Auto Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoautopago=tipoautopagoAux;
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
      		//this.finishProcessTipoAutoPago();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoAutoPago tipoautopagoLocal) throws Exception {
		
		if(this.tipoautopagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoAutoPago tipoautopagoLocal) throws Exception {	
		if(this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoautopagoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoAutoPagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoautopagoValidator.getInvalidValues(this.tipoautopago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoAutoPago tipoautopago,List<TipoAutoPago> tipoautopagos) throws Exception {
		try	{		
			TipoAutoPagoConstantesFunciones.actualizarLista(tipoautopago,tipoautopagos,this.tipoautopagoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoAutoPago tipoautopago,List<TipoAutoPago> tipoautopagos) throws Exception {
		try	{			
			TipoAutoPagoConstantesFunciones.actualizarSelectedLista(tipoautopago,tipoautopagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoAutoPago> tipoautopagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoautopagosLocal=this.tipoautopagoLogic.getTipoAutoPagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoautopagosLocal=this.tipoautopagos;
			}
			//ARCHITECTURE
		
			for(TipoAutoPago tipoautopagoLocal:tipoautopagosLocal) {
				if(this.permiteMantenimiento(tipoautopagoLocal) && tipoautopagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoAutoPagoConstantesFunciones.getTipoAutoPagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoAutoPagoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoPago.jLabelid_empresaTipoAutoPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAutoPagoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoPago.jLabelcodigoTipoAutoPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAutoPagoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoPago.jLabelnombreTipoAutoPago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAutoPago.jLabelid_empresaTipoAutoPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAutoPago.jLabelcodigoTipoAutoPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAutoPago.jLabelnombreTipoAutoPago,"");
		
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
		this.iIdNuevoTipoAutoPago--;	
		
		
		this.tipoautopagoAux=new TipoAutoPago();
		
		this.tipoautopagoAux.setId(this.iIdNuevoTipoAutoPago);
		this.tipoautopagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoautopagoLogic.getTipoAutoPagos().add(this.tipoautopagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoautopagos.add(this.tipoautopagoAux);
		}
		//ARCHITECTURE
		
		this.tipoautopago=this.tipoautopagoAux;
		
		if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoAutoPago(this.tipoautopago);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAutoPago(this.tipoautopago);
		}
				
		//this.setDefaultControlesTipoAutoPago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoAutoPago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoAutoPago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAutoPago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAutoPago(this.tipoautopagoBean,this.tipoautopago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoAutoPagoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoautopagoSessionBean.getConGuardarRelaciones()) {
			classes=TipoAutoPagoConstantesFunciones.getClassesRelationshipsOfTipoAutoPago(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoautopagoReturnGeneral=tipoautopagoLogic.procesarEventosTipoAutoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoautopagoLogic.getTipoAutoPagos(),this.tipoautopago,this.tipoautopagoParameterGeneral,this.isEsNuevoTipoAutoPago,classes);//this.tipoautopagoLogic.getTipoAutoPago()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoAutoPago(this.tipoautopagoReturnGeneral,this.tipoautopagoBean,false);
		
		if(this.tipoautopagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAutoPago(this.tipoautopagoReturnGeneral.getTipoAutoPago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoAutoPago(this.tipoautopagoReturnGeneral.getTipoAutoPago());
		}
		
		if(this.tipoautopagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoAutoPago(this.tipoautopagoReturnGeneral.getTipoAutoPago(),classes);//this.tipoautopagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoAutoPago(this.tipoautopago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoAutoPago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoAutoPago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoAutoPago(false);
						
			if(tipoautopagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAutoPago();
			}
			
			this.actualizarVisualTableDatosTipoAutoPago();
			
			this.jTableDatosTipoAutoPago.setRowSelectionInterval(this.getIndiceNuevoTipoAutoPago(), this.getIndiceNuevoTipoAutoPago());
			
			this.seleccionarFilaTablaTipoAutoPagoActual();
						
			this.actualizarEstadoCeldasBotonesTipoAutoPago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoAutoPago(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoAutoPago.jTextFieldcodigoTipoAutoPago.setEnabled(isHabilitar && this.tipoautopagoConstantesFunciones.activarcodigoTipoAutoPago);
		this.jInternalFrameDetalleFormTipoAutoPago.jTextAreanombreTipoAutoPago.setEnabled(isHabilitar && this.tipoautopagoConstantesFunciones.activarnombreTipoAutoPago);	
		//
		this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.setEnabled(isHabilitar && this.tipoautopagoConstantesFunciones.activarid_empresaTipoAutoPago);
	};
	
	public void setDefaultControlesTipoAutoPago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoAutoPago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoautopagoSessionBean.setConGuardarRelaciones(true);			
			this.tipoautopagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoAutoPago.jTabbedPaneRelacionesTipoAutoPago.setVisible(true);
			
					
		} else {
			//this.tipoautopagoSessionBean.setConGuardarRelaciones(false);			
			this.tipoautopagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoAutoPago.jTabbedPaneRelacionesTipoAutoPago.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoAutoPago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAutoPago tipoautopagoAux:this.tipoautopagoLogic.getTipoAutoPagos()) {
				if(tipoautopagoAux.getId().equals(this.iIdNuevoTipoAutoPago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAutoPago tipoautopagoAux:this.tipoautopagos) {
				if(tipoautopagoAux.getId().equals(this.iIdNuevoTipoAutoPago)) {
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
	
	public int getIndiceActualTipoAutoPago(TipoAutoPago tipoautopago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAutoPago tipoautopagoAux:this.tipoautopagoLogic.getTipoAutoPagos()) {
				if(tipoautopagoAux.getId().equals(tipoautopago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAutoPago tipoautopagoAux:this.tipoautopagos) {
				if(tipoautopagoAux.getId().equals(tipoautopago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoAutoPago(TipoAutoPago tipoautopagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAutoPago tipoautopagoAux:this.tipoautopagoLogic.getTipoAutoPagos()) {
				if(tipoautopagoAux.getTipoAutoPagoOriginal().getId().equals(tipoautopagoOriginal.getId())) {
					existe=true;
					tipoautopagoOriginal.setId(tipoautopagoAux.getId());
					tipoautopagoOriginal.setVersionRow(tipoautopagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAutoPago tipoautopagoAux:this.tipoautopagos) {
				if(tipoautopagoAux.getTipoAutoPagoOriginal().getId().equals(tipoautopagoOriginal.getId())) {
					existe=true;
					tipoautopagoOriginal.setId(tipoautopagoAux.getId());
					tipoautopagoOriginal.setVersionRow(tipoautopagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoAutoPago(Boolean esParaCancelar) throws Exception {
		tipoautopagosAux=new ArrayList<TipoAutoPago>();
		tipoautopagoAux=new TipoAutoPago();
		
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAutoPago tipoautopagoAux:this.tipoautopagoLogic.getTipoAutoPagos()) {
					if(tipoautopagoAux.getId()<0) {
						tipoautopagosAux.add(tipoautopagoAux);
					}		
				}
				this.iIdNuevoTipoAutoPago=0L;
				this.tipoautopagoLogic.getTipoAutoPagos().removeAll(tipoautopagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAutoPago tipoautopagoAux:this.tipoautopagos) {
					if(tipoautopagoAux.getId()<0) {
						tipoautopagosAux.add(tipoautopagoAux);
					}		
				}
				this.iIdNuevoTipoAutoPago=0L;
				this.tipoautopagos.removeAll(tipoautopagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoAutoPago 
					&& this.tipoautopagoLogic.getTipoAutoPagos().size()>0
					) {
					tipoautopagoAux=this.tipoautopagoLogic.getTipoAutoPagos().get(this.tipoautopagoLogic.getTipoAutoPagos().size() - 1);
				
					if(tipoautopagoAux.getId()<0) {
						this.tipoautopagoLogic.getTipoAutoPagos().remove(tipoautopagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoAutoPago && this.tipoautopagos.size()>0) {
					tipoautopagoAux=this.tipoautopagos.get(this.tipoautopagos.size() - 1);
				
					if(tipoautopagoAux.getId()<0) {
						this.tipoautopagos.remove(tipoautopagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoAutoPago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoautopago.getId()<0) {
				this.tipoautopagoLogic.getTipoAutoPagos().remove(this.tipoautopago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoautopago.getId()<0) {
				this.tipoautopagos.remove(this.tipoautopago);
			}
		}			
	}
	
	public void setEstadosInicialesTipoAutoPago(List<TipoAutoPago> tipoautopagosAux) throws Exception {
		TipoAutoPagoConstantesFunciones.setEstadosInicialesTipoAutoPago(tipoautopagosAux);
	}
	
	public void setEstadosInicialesTipoAutoPago(TipoAutoPago tipoautopagoAux) throws Exception {
		TipoAutoPagoConstantesFunciones.setEstadosInicialesTipoAutoPago(tipoautopagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoAutoPagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoAutoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoAutoPagoActual()) {
				if(!this.isEsNuevoTipoAutoPago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoAutoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoAutoPago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoAutoPagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Auto Pago ?", "MANTENIMIENTO DE Tipo Auto Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoAutoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoAutoPago tipoautopago) throws Exception {
		TipoAutoPagoConstantesFunciones.seleccionarAsignar(this.tipoautopago,tipoautopago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoAutoPago=this.isPermisoActualizarOriginalTipoAutoPago;
			
			
			this.seleccionarAsignar(tipoautopago);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoAutoPagoConstantesFunciones.quitarEspaciosTipoAutoPago(this.tipoautopago,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoAutoPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoautopagoSessionBean.setsFuncionBusquedaRapida(this.tipoautopagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoAutoPago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoAutoPago(esParaCancelar);				
				this.cancelarNuevoTipoAutoPago(esParaCancelar);								
			}
			
			this.tipoautopago=new TipoAutoPago();
			
			this.inicializarTipoAutoPago();
			
			this.actualizarEstadoCeldasBotonesTipoAutoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoAutoPago() throws Exception {
		try {
			TipoAutoPagoConstantesFunciones.inicializarTipoAutoPago(this.tipoautopago);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoautopagoLogic.getTipoAutoPagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoAutoPagos(String sAccionBusqueda,List<TipoAutoPago> tipoautopagosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoAutoPago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoAutoPagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoAutoPagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoAutoPago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Auto Pagos");		
		parameters.put("busquedapor", TipoAutoPagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoAutoPago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoAutoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoAutoPagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoAutoPago=new JRBeanArrayDataSource(TipoAutoPagoJInternalFrame.TraerTipoAutoPagoBeans(tipoautopagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoAutoPago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoAutoPagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoAutoPagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoAutoPagoBean.TraerTipoAutoPagoBeans(tipoautopagosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoAutoPagos(sAccionBusqueda,sTipoArchivoReporte,tipoautopagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoAutoPagos(sAccionBusqueda,sTipoArchivoReporte,tipoautopagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoAutoPagoActionPerformed(null);
					//this.generarExcelReporteTipoAutoPagos(sAccionBusqueda,sTipoArchivoReporte,tipoautopagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoAutoPagos(sAccionBusqueda,sTipoArchivoReporte,tipoautopagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoAutoPagos(sAccionBusqueda,sTipoArchivoReporte,tipoautopagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoAutoPagos(sAccionBusqueda,sTipoArchivoReporte,tipoautopagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoAutoPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAutoPago> tipoautopagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautopago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAutoPagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAutoPago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoAutoPago tipoautopago : tipoautopagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoAutoPagoConstantesFunciones.generarExcelReporteDataTipoAutoPago("NORMAL",row,workbook,tipoautopago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Auto Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoAutoPago(String sTipo,Row row,Workbook workbook) {
		
		TipoAutoPagoConstantesFunciones.generarExcelReporteHeaderTipoAutoPago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoAutoPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAutoPago> tipoautopagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautopago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAutoPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoAutoPago tipoautopago : tipoautopagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoAutoPagoConstantesFunciones.getTipoAutoPagoDescripcion(tipoautopago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoautopago.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAutoPagoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoautopago.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAutoPagoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoautopago.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Auto Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoAutoPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAutoPago> tipoautopagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoAutoPago> tipoautopagosRespaldo=null;
		
		classes=TipoAutoPagoConstantesFunciones.getClassesRelationshipsOfTipoAutoPago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoautopagoLogic.setDatosCliente(this.datosCliente);
		this.tipoautopagoLogic.setDatosDeep(this.datosDeep);
		this.tipoautopagoLogic.setIsConDeep(true);
		
		tipoautopagosRespaldo=this.tipoautopagoLogic.getTipoAutoPagos();
		
		this.tipoautopagoLogic.setTipoAutoPagos(tipoautopagosParaReportes);	
		this.tipoautopagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoautopagosParaReportes=this.tipoautopagoLogic.getTipoAutoPagos();
		this.tipoautopagoLogic.setTipoAutoPagos(tipoautopagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautopago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAutoPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAutoPago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoAutoPago tipoautopago : tipoautopagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoAutoPago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoAutoPagoConstantesFunciones.generarExcelReporteDataTipoAutoPago("NORMAL",row,workbook,tipoautopago,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoAutoPagoConstantesFunciones.getTipoAutoPagoDescripcion(tipoautopago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Auto Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAutoPago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoAutoPago() throws Exception {		
		this.startProcessTipoAutoPago(true);
	}
	
	public void startProcessTipoAutoPago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoAutoPago ,this.jPanelParametrosReportesTipoAutoPago, this.jScrollPanelDatosTipoAutoPago,this.jPanelPaginacionTipoAutoPago, this.jScrollPanelDatosEdicionTipoAutoPago, this.jPanelAccionesTipoAutoPago,this.jPanelAccionesFormularioTipoAutoPago,this.jmenuBarTipoAutoPago,this.jmenuBarDetalleTipoAutoPago,this.jTtoolBarTipoAutoPago,this.jTtoolBarDetalleTipoAutoPago);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAutoPago=this.jTabbedPaneBusquedasTipoAutoPago; 
		
		final JPanel jPanelParametrosReportesTipoAutoPago=this.jPanelParametrosReportesTipoAutoPago;
		//final JScrollPane jScrollPanelDatosTipoAutoPago=this.jScrollPanelDatosTipoAutoPago;
		final JTable jTableDatosTipoAutoPago=this.jTableDatosTipoAutoPago;		
		final JPanel jPanelPaginacionTipoAutoPago=this.jPanelPaginacionTipoAutoPago;
		//final JScrollPane jScrollPanelDatosEdicionTipoAutoPago=this.jScrollPanelDatosEdicionTipoAutoPago;
		final JPanel jPanelAccionesTipoAutoPago=this.jPanelAccionesTipoAutoPago;
		
		JPanel jPanelCamposAuxiliarTipoAutoPago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoAutoPago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			jPanelCamposAuxiliarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jPanelCamposTipoAutoPago;
			jPanelAccionesFormularioAuxiliarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jPanelAccionesFormularioTipoAutoPago;
		}
		
		final JPanel jPanelCamposTipoAutoPago=jPanelCamposAuxiliarTipoAutoPago;
		final JPanel jPanelAccionesFormularioTipoAutoPago=jPanelAccionesFormularioAuxiliarTipoAutoPago;
		
		
		final JMenuBar jmenuBarTipoAutoPago=this.jmenuBarTipoAutoPago;
		final JToolBar jTtoolBarTipoAutoPago=this.jTtoolBarTipoAutoPago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoAutoPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAutoPago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			jmenuBarDetalleAuxiliarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jmenuBarDetalleTipoAutoPago;
			jTtoolBarDetalleAuxiliarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jTtoolBarDetalleTipoAutoPago;
		}
		
		final JMenuBar jmenuBarDetalleTipoAutoPago=jmenuBarDetalleAuxiliarTipoAutoPago;
		final JToolBar jTtoolBarDetalleTipoAutoPago=jTtoolBarDetalleAuxiliarTipoAutoPago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAutoPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAutoPago;
			processRunnable.jTableDatos=jTableDatosTipoAutoPago;
			processRunnable.jPanelCampos=jPanelCamposTipoAutoPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAutoPago;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAutoPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAutoPago;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAutoPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAutoPago;
			processRunnable.jTtoolBar=jTtoolBarTipoAutoPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAutoPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAutoPago ,jPanelParametrosReportesTipoAutoPago,jTableDatosTipoAutoPago, /*jScrollPanelDatosTipoAutoPago,*/jPanelCamposTipoAutoPago,jPanelPaginacionTipoAutoPago, /*jScrollPanelDatosEdicionTipoAutoPago,*/ jPanelAccionesTipoAutoPago,jPanelAccionesFormularioTipoAutoPago,jmenuBarTipoAutoPago,jmenuBarDetalleTipoAutoPago,jTtoolBarTipoAutoPago,jTtoolBarDetalleTipoAutoPago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAutoPago ,jPanelParametrosReportesTipoAutoPago, jScrollPanelDatosTipoAutoPago,jPanelPaginacionTipoAutoPago, jScrollPanelDatosEdicionTipoAutoPago, jPanelAccionesTipoAutoPago,jPanelAccionesFormularioTipoAutoPago,jmenuBarTipoAutoPago,jmenuBarDetalleTipoAutoPago,jTtoolBarTipoAutoPago,jTtoolBarDetalleTipoAutoPago);
						
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
	
	public void finishProcessTipoAutoPago() {// throws Exception 
		this.finishProcessTipoAutoPago(true);
	}
	
	public void finishProcessTipoAutoPago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoAutoPago ,this.jPanelParametrosReportesTipoAutoPago, this.jScrollPanelDatosTipoAutoPago,this.jPanelPaginacionTipoAutoPago, this.jScrollPanelDatosEdicionTipoAutoPago, this.jPanelAccionesTipoAutoPago,this.jPanelAccionesFormularioTipoAutoPago,this.jmenuBarTipoAutoPago,this.jmenuBarDetalleTipoAutoPago,this.jTtoolBarTipoAutoPago,this.jTtoolBarDetalleTipoAutoPago);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAutoPago=this.jTabbedPaneBusquedasTipoAutoPago; 
		
		final JPanel jPanelParametrosReportesTipoAutoPago=this.jPanelParametrosReportesTipoAutoPago;
		//final JScrollPane jScrollPanelDatosTipoAutoPago=this.jScrollPanelDatosTipoAutoPago;
		final JTable jTableDatosTipoAutoPago=this.jTableDatosTipoAutoPago;		
		final JPanel jPanelPaginacionTipoAutoPago=this.jPanelPaginacionTipoAutoPago;
		//final JScrollPane jScrollPanelDatosEdicionTipoAutoPago=this.jScrollPanelDatosEdicionTipoAutoPago;
		final JPanel jPanelAccionesTipoAutoPago=this.jPanelAccionesTipoAutoPago;
		
		JPanel jPanelCamposAuxiliarTipoAutoPago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoAutoPago=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			jPanelCamposAuxiliarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jPanelCamposTipoAutoPago;
			jPanelAccionesFormularioAuxiliarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jPanelAccionesFormularioTipoAutoPago;
		}
		
		final JPanel jPanelCamposTipoAutoPago=jPanelCamposAuxiliarTipoAutoPago;
		final JPanel jPanelAccionesFormularioTipoAutoPago=jPanelAccionesFormularioAuxiliarTipoAutoPago;
		
		
		final JMenuBar jmenuBarTipoAutoPago=this.jmenuBarTipoAutoPago;		
		final JToolBar jTtoolBarTipoAutoPago=this.jTtoolBarTipoAutoPago;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoAutoPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAutoPago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			jmenuBarDetalleAuxiliarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jmenuBarDetalleTipoAutoPago;
			jTtoolBarDetalleAuxiliarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jTtoolBarDetalleTipoAutoPago;		
		}
		
		final JMenuBar jmenuBarDetalleTipoAutoPago=jmenuBarDetalleAuxiliarTipoAutoPago;
		final JToolBar jTtoolBarDetalleTipoAutoPago=jTtoolBarDetalleAuxiliarTipoAutoPago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAutoPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAutoPago;
			processRunnable.jTableDatos=jTableDatosTipoAutoPago;
			processRunnable.jPanelCampos=jPanelCamposTipoAutoPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAutoPago;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAutoPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAutoPago;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAutoPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAutoPago;
			processRunnable.jTtoolBar=jTtoolBarTipoAutoPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAutoPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoAutoPago ,jPanelParametrosReportesTipoAutoPago, jTableDatosTipoAutoPago,/*jScrollPanelDatosTipoAutoPago,*/jPanelCamposTipoAutoPago,jPanelPaginacionTipoAutoPago, /*jScrollPanelDatosEdicionTipoAutoPago,*/ jPanelAccionesTipoAutoPago,jPanelAccionesFormularioTipoAutoPago,jmenuBarTipoAutoPago,jmenuBarDetalleTipoAutoPago,jTtoolBarTipoAutoPago,jTtoolBarDetalleTipoAutoPago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoAutoPago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoAutoPago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoAutoPago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoAutoPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoAutoPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoAutoPago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoAutoPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoAutoPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoAutoPago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoautopagoConstantesFunciones.getsFinalQueryTipoAutoPago();
		String  finalQueryPaginacionTodos=this.tipoautopagoConstantesFunciones.getsFinalQueryTipoAutoPago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoAutoPagoConstantesFunciones.getArrayColumnasGlobalesNoTipoAutoPago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoAutoPagoConstantesFunciones.getArrayColumnasGlobalesTipoAutoPago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoAutoPagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoautopagosEliminados= new ArrayList<TipoAutoPago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoAutoPago();
		
				///*TipoAutoPagoSessionBean*/this.tipoautopagoSessionBean=new TipoAutoPagoSessionBean();
			
			if(this.tipoautopagoSessionBean==null) {
				this.tipoautopagoSessionBean=new TipoAutoPagoSessionBean();
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
					this.iNumeroPaginacion=TipoAutoPagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoAutoPagoConstantesFunciones.getClassesForeignKeysOfTipoAutoPago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoautopago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoautopagosAux= new ArrayList<TipoAutoPago>();
			
				
			tipoautopagoLogic.setDatosCliente(this.datosCliente);
			tipoautopagoLogic.setDatosDeep(this.datosDeep);
			tipoautopagoLogic.setIsConDeep(true);
			
			
			tipoautopagoLogic.getTipoAutoPagoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoautopagoLogic.getTodosTipoAutoPagos(finalQueryGlobal,pagination);
					
					//tipoautopagoLogic.getTodosTipoAutoPagosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoautopagoLogic.getTipoAutoPagos()==null|| tipoautopagoLogic.getTipoAutoPagos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoautopagosAux= new ArrayList<TipoAutoPago>();
							tipoautopagosAux.addAll(tipoautopagoLogic.getTipoAutoPagos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautopagosAux= new ArrayList<TipoAutoPago>();
							tipoautopagosAux.addAll(tipoautopagos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoautopagoLogic.getTodosTipoAutoPagos(finalQueryGlobal+"",this.pagination);												
							
							//tipoautopagoLogic.getTodosTipoAutoPagosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoAutoPagos("Todos",tipoautopagoLogic.getTipoAutoPagos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoautopagoLogic.setTipoAutoPagos(new ArrayList<TipoAutoPago>());					
							tipoautopagoLogic.getTipoAutoPagos().addAll(tipoautopagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautopagos=new ArrayList<TipoAutoPago>();
							tipoautopagos.addAll(tipoautopagosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoAutoPago=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoAutoPago=this.idActual;
				
				} else if(this.idTipoAutoPagoActual!=null && this.idTipoAutoPagoActual!=0L) {
					idTipoAutoPago=idTipoAutoPagoActual;
				}
				
					
				this.sDetalleReporte=TipoAutoPagoConstantesFunciones.getDetalleIndicePorId(idTipoAutoPago);
				
				this.tipoautopagos=new ArrayList<TipoAutoPago>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoautopagoLogic.getEntity(idTipoAutoPago);
					
					//tipoautopagoLogic.getEntityWithConnection(idTipoAutoPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoautopagoLogic.setTipoAutoPagos(new ArrayList<TipoAutoPago>());
					tipoautopagoLogic.getTipoAutoPagos().add(tipoautopagoLogic.getTipoAutoPago());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoautopagos=new ArrayList<TipoAutoPago>();
					this.tipoautopagos.add(tipoautopago);
				}
				
				if(tipoautopagoLogic.getTipoAutoPago()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoAutoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoautopagoLogic.getTipoAutoPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAutoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAutoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoautopagoLogic.getTipoAutoPagos()==null||tipoautopagoLogic.getTipoAutoPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoautopagos==null|| tipoautopagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautopagosAux=new ArrayList<TipoAutoPago>();
						tipoautopagosAux.addAll(tipoautopagoLogic.getTipoAutoPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautopagosAux=new ArrayList<TipoAutoPago>();
							tipoautopagosAux.addAll(tipoautopagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoautopagoLogic.getTipoAutoPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAutoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAutoPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoAutoPagos("FK_IdEmpresa",tipoautopagoLogic.getTipoAutoPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoAutoPagos("FK_IdEmpresa",tipoautopagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautopagoLogic.setTipoAutoPagos(new ArrayList<TipoAutoPago>());
						tipoautopagoLogic.getTipoAutoPagos().addAll(tipoautopagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautopagos=new ArrayList<TipoAutoPago>();
							tipoautopagos.addAll(tipoautopagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoAutoPago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoAutoPago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoautopagoLogic.getTipoAutoPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoautopagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoautopagoLogic.getTipoAutoPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoautopagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoAutoPago tipoautopago) {
		Boolean permite=true;
		
		if(this.tipoautopago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoAutoPagoConstantesFunciones.getOrderByListaTipoAutoPago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoAutoPagoConstantesFunciones.getOrderByListaTipoAutoPago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAutoPago tipoautopago:tipoautopagoLogic.getTipoAutoPagos()) {
				if(tipoautopago.getsType().equals(Constantes2.S_TOTALES)) {
					tipoautopagoTotales=tipoautopago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAutoPago tipoautopago:this.tipoautopagos) {
				if(tipoautopago.getsType().equals(Constantes2.S_TOTALES)) {
					tipoautopagoTotales=tipoautopago;
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
			this.tipoautopagoAux=new TipoAutoPago();
			this.tipoautopagoAux.setsType(Constantes2.S_TOTALES);
			this.tipoautopagoAux.setIsNew(false);
			this.tipoautopagoAux.setIsChanged(false);
			this.tipoautopagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoAutoPagoConstantesFunciones.TotalizarValoresFilaTipoAutoPago(this.tipoautopagoLogic.getTipoAutoPagos(),this.tipoautopagoAux);
				
				this.tipoautopagoLogic.getTipoAutoPagos().add(this.tipoautopagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoAutoPagoConstantesFunciones.TotalizarValoresFilaTipoAutoPago(this.tipoautopagos,this.tipoautopagoAux);
				
				this.tipoautopagos.add(this.tipoautopagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoautopagoTotales=new TipoAutoPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoautopagoLogic.getTipoAutoPagos().remove(tipoautopagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoautopagos.remove(tipoautopagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoautopagoTotales=new TipoAutoPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAutoPago tipoautopago:tipoautopagoLogic.getTipoAutoPagos()) {
				if(tipoautopago.getsType().equals(Constantes2.S_TOTALES)) {
					tipoautopagoTotales=tipoautopago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAutoPagoConstantesFunciones.TotalizarValoresFilaTipoAutoPago(this.tipoautopagoLogic.getTipoAutoPagos(),tipoautopagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAutoPago tipoautopago:this.tipoautopagos) {
				if(tipoautopago.getsType().equals(Constantes2.S_TOTALES)) {
					tipoautopagoTotales=tipoautopago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAutoPagoConstantesFunciones.TotalizarValoresFilaTipoAutoPago(this.tipoautopagos,tipoautopagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoAutoPagosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoAutoPagosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoautopagoLogic.getTipoAutoPagosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoAutoPago() {
		this.isPermisoTodoTipoAutoPago=false;
		this.isPermisoNuevoTipoAutoPago=false;
		this.isPermisoActualizarTipoAutoPago=false;
		this.isPermisoActualizarOriginalTipoAutoPago=false;
		this.isPermisoEliminarTipoAutoPago=false;
		this.isPermisoGuardarCambiosTipoAutoPago=false;
		this.isPermisoConsultaTipoAutoPago=false;
		this.isPermisoBusquedaTipoAutoPago=false;
		this.isPermisoReporteTipoAutoPago=false;		
		this.isPermisoOrdenTipoAutoPago=false;		
		this.isPermisoPaginacionMedioTipoAutoPago=false;		
		this.isPermisoPaginacionAltoTipoAutoPago=false;
		this.isPermisoPaginacionTodoTipoAutoPago=false;
		this.isPermisoCopiarTipoAutoPago=false;		
		this.isPermisoVerFormTipoAutoPago=false;		
		this.isPermisoDuplicarTipoAutoPago=false;		
		this.isPermisoOrdenTipoAutoPago=false;		
	}
	
	public void setPermisosUsuarioTipoAutoPago(Boolean isPermiso) {
		this.isPermisoTodoTipoAutoPago=isPermiso;
		this.isPermisoNuevoTipoAutoPago=isPermiso;
		this.isPermisoActualizarTipoAutoPago=isPermiso;
		this.isPermisoActualizarOriginalTipoAutoPago=isPermiso;
		this.isPermisoEliminarTipoAutoPago=isPermiso;
		this.isPermisoGuardarCambiosTipoAutoPago=isPermiso;
		this.isPermisoConsultaTipoAutoPago=isPermiso;
		this.isPermisoBusquedaTipoAutoPago=isPermiso;
		this.isPermisoReporteTipoAutoPago=isPermiso;
		this.isPermisoOrdenTipoAutoPago=isPermiso;		
		this.isPermisoPaginacionMedioTipoAutoPago=isPermiso;		
		this.isPermisoPaginacionAltoTipoAutoPago=isPermiso;		
		this.isPermisoPaginacionTodoTipoAutoPago=isPermiso;		
		this.isPermisoCopiarTipoAutoPago=isPermiso;		
		this.isPermisoVerFormTipoAutoPago=isPermiso;		
		this.isPermisoDuplicarTipoAutoPago=isPermiso;
		this.isPermisoOrdenTipoAutoPago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoAutoPago(Boolean isPermiso) {
		//this.isPermisoTodoTipoAutoPago=isPermiso;
		this.isPermisoNuevoTipoAutoPago=isPermiso;
		this.isPermisoActualizarTipoAutoPago=isPermiso;
		this.isPermisoActualizarOriginalTipoAutoPago=isPermiso;
		this.isPermisoEliminarTipoAutoPago=isPermiso;
		this.isPermisoGuardarCambiosTipoAutoPago=isPermiso;
		//this.isPermisoConsultaTipoAutoPago=isPermiso;
		//this.isPermisoBusquedaTipoAutoPago=isPermiso;
		//this.isPermisoReporteTipoAutoPago=isPermiso;
		//this.isPermisoOrdenTipoAutoPago=isPermiso;		
		//this.isPermisoPaginacionMedioTipoAutoPago=isPermiso;		
		//this.isPermisoPaginacionAltoTipoAutoPago=isPermiso;		
		//this.isPermisoPaginacionTodoTipoAutoPago=isPermiso;		
		//this.isPermisoCopiarTipoAutoPago=isPermiso;		
		//this.isPermisoDuplicarTipoAutoPago=isPermiso;
		//this.isPermisoOrdenTipoAutoPago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoAutoPagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoAutoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoAutoPago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoAutoPagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoAutoPagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoAutoPagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoAutoPagoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoAutoPago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoAutoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoAutoPagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoAutoPago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoAutoPago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoAutoPago=this.isPermisoActualizarTipoAutoPago;
			this.isPermisoEliminarTipoAutoPago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoAutoPago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoAutoPago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoAutoPago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoAutoPago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoAutoPago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAutoPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoAutoPago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoAutoPago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoAutoPago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoAutoPago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoAutoPago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoAutoPago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAutoPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoAutoPago.setToolTipText(this.jTableDatosTipoAutoPago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoAutoPago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoAutoPago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoAutoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoAutoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoAutoPago() throws Exception {
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
	public void inicializarCombosForeignKeyTipoAutoPagoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoAutoPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoAutoPagoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoAutoPagoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoAutoPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoAutoPagoParameterReturnGeneral tipoautopagoReturnGeneral=new TipoAutoPagoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoautopagoConstantesFunciones.cargarid_empresaTipoAutoPago)
					 || (this.esRecargarFks && this.tipoautopagoConstantesFunciones.cargarid_empresaTipoAutoPago)) {

					if(!this.tipoautopagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoautopagoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoautopagoReturnGeneral=tipoautopagoLogic.cargarCombosLoteForeignKeyTipoAutoPago(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoautopagoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoAutoPago()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoautopagoSessionBean==null) {
				this.tipoautopagoSessionBean=new TipoAutoPagoSessionBean();
			}

			if(!this.tipoautopagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoAutoPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoAutoPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoAutoPago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAutoPago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoAutoPago(TipoAutoPago tipoautopago)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoAutoPago(TipoAutoPago tipoautopago,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoAutoPago()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAutoPago()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoAutoPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoAutoPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoAutoPago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoAutoPago()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoAutoPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoAutoPago()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago!=null && this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoAutoPagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoAutoPagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoAutoPagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoautopagoSessionBean=new TipoAutoPagoSessionBean(); 
		this.tipoautopagoConstantesFunciones=new TipoAutoPagoConstantesFunciones(); 
		this.tipoautopagoBean=new TipoAutoPago();//(this.tipoautopagoConstantesFunciones); 		
		this.tipoautopagoReturnGeneral=new TipoAutoPagoParameterReturnGeneral(); 
		
		this.tipoautopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoautopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoAutoPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoAutoPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoAutoPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoAutoPago(true);
			
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
			
			this.tipoautopagoConstantesFunciones=new TipoAutoPagoConstantesFunciones(); 
			this.tipoautopagoBean=new TipoAutoPago();//this.tipoautopagoConstantesFunciones); 			
			this.tipoautopagoReturnGeneral=new TipoAutoPagoParameterReturnGeneral(); 
		
			TipoAutoPagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Auto Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoautopago=new TipoAutoPago();
			this.tipoautopagos = new ArrayList<TipoAutoPago>();
			this.tipoautopagosAux = new ArrayList<TipoAutoPago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic=new TipoAutoPagoLogic();
				this.tipoautopagoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoautopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoautopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoAutoPago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoAutoPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAutoPago);	
					}
					
					if(this.jInternalFrameImportacionTipoAutoPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAutoPago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoAutoPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoAutoPago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAutoPago);
				this.jInternalFrameDetalleFormTipoAutoPago.setVisible(false);
				this.jInternalFrameDetalleFormTipoAutoPago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoAutoPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAutoPago);
					this.jInternalFrameReporteDinamicoTipoAutoPago.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoAutoPago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoAutoPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoAutoPago);
					this.jInternalFrameImportacionTipoAutoPago.setVisible(false);
					this.jInternalFrameImportacionTipoAutoPago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoAutoPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoAutoPago);
					this.jInternalFrameOrderByTipoAutoPago.setVisible(false);
					this.jInternalFrameOrderByTipoAutoPago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoAutoPagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoAutoPagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoautopagoReturnGeneral=new TipoAutoPagoParameterReturnGeneral();
			
			this.tipoautopagoParameterGeneral=new TipoAutoPagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoautopagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoAutoPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAutoPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoautopagoSessionBean.getEsGuardarRelacionado(),this.tipoautopagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAutoPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoautopagoSessionBean.getEsGuardarRelacionado(),this.tipoautopagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoAutoPago=false;
			this.isVisibilidadCeldaDuplicarTipoAutoPago=true;
			this.isVisibilidadCeldaCopiarTipoAutoPago=true;
			this.isVisibilidadCeldaVerFormTipoAutoPago=true;
			this.isVisibilidadCeldaOrdenTipoAutoPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=false;
			this.isVisibilidadCeldaModificarTipoAutoPago=false;
			this.isVisibilidadCeldaActualizarTipoAutoPago=false;
			this.isVisibilidadCeldaEliminarTipoAutoPago=false;
			this.isVisibilidadCeldaCancelarTipoAutoPago=false;
			this.isVisibilidadCeldaGuardarTipoAutoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoAutoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoAutoPago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoAutoPago(false);
			
			this.setPermisosUsuarioTipoAutoPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoautopagoSessionBean.getEsGuardarRelacionado() && this.tipoautopagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoAutoPagoClasesRelacionadas();
			}
			
			if(this.tipoautopagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoAutoPagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoAutoPago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoAutoPago();
			}
			
			if(!this.isPermisoBusquedaTipoAutoPago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoAutoPago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoAutoPago,this.isPermisoPaginacionMedioTipoAutoPago,this.isPermisoPaginacionTodoTipoAutoPago);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoAutoPagoConstantesFunciones.getTiposSeleccionarTipoAutoPago());
				
				this.tiposColumnasSelect=TipoAutoPagoConstantesFunciones.getTiposSeleccionarTipoAutoPago(true);
				
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
			//if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoAutoPago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoAutoPago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoAutoPago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAutoPago() ;
			
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
				tipoautopagoImplementable= (TipoAutoPagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAutoPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoautopagoImplementableHome= (TipoAutoPagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAutoPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoautopagos= new ArrayList<TipoAutoPago>();
			this.tipoautopagosEliminados= new ArrayList<TipoAutoPago>();
						
			this.isEsNuevoTipoAutoPago=false;
			this.esParaAccionDesdeFormularioTipoAutoPago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoAutoPago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoAutoPago();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoAutoPagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoAutoPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoAutoPago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoAutoPago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoAutoPago();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoAutoPago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoAutoPago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoAutoPago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoAutoPago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoAutoPago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoAutoPago() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoAutoPago")) {
				iIndex=this.jInternalFrameDetalleFormTipoAutoPago.jTabbedPaneRelacionesTipoAutoPago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoAutoPago.jTabbedPaneRelacionesTipoAutoPago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoAutoPago();	
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
	
	public void cargarCombosForeignKeyTipoAutoPago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoAutoPago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoAutoPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoAutoPagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoAutoPago();
		
		this.cargarCombosFrameForeignKeyTipoAutoPago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoAutoPago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoAutoPago();
		}
	}
	
	
	
	public void jButtonNuevoTipoAutoPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoautopagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
			
			if(jTableDatosTipoAutoPago.getRowCount()>=1) {
				jTableDatosTipoAutoPago.removeRowSelectionInterval(0, jTableDatosTipoAutoPago.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoAutoPago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoAutoPago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoAutoPago(true);			
			//this.tipoautopago=new TipoAutoPago();
			//this.tipoautopago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAutoPago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAutoPago() ;
			
			if(TipoAutoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAutoPago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoautopago);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);				
			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
			if(this.tipoautopagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoAutoPago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoAutoPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoAutoPago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoAutoPago.getSelectedRows().length;			
			}
			
			tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoAutoPago--;			
				//TipoAutoPago tipoautopagoAux= new TipoAutoPago();			
				//tipoautopagoAux.setId(this.iIdNuevoTipoAutoPago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoAutoPago tipoautopagoOrigen=new TipoAutoPago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoAutoPago tipoautopagoOrigen : tipoautopagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoautopagoOrigen =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautopagoOrigen =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoAutoPago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoautopago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoAutoPago(tipoautopagoOrigen,this.tipoautopago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoautopagoLogic.getTipoAutoPagos().add(this.tipoautopagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoautopagos.add(this.tipoautopagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoAutoPago(false);
				
				this.jTableDatosTipoAutoPago.setRowSelectionInterval(this.getIndiceNuevoTipoAutoPago(), this.getIndiceNuevoTipoAutoPago());
				
				int iLastRow =  this.jTableDatosTipoAutoPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAutoPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAutoPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAutoPago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();									
		
			TipoAutoPago tipoautopagoOrigen=new TipoAutoPago();
			TipoAutoPago tipoautopagoDestino=new TipoAutoPago();
				
			tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoAutoPago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoautopagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoAutoPago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautopagoOrigen =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoautopagoOrigen =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautopagoDestino =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoautopagoDestino =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoautopagoOrigen =tipoautopagosSeleccionados.get(0);
				tipoautopagoDestino =tipoautopagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoAutoPago(tipoautopagoOrigen,tipoautopagoDestino,true,false);
				
				tipoautopagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoautopagoDestino,tipoautopagoLogic.getTipoAutoPagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoautopagoDestino,tipoautopagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoAutoPago(false);
				
				//this.jTableDatosTipoAutoPago.setRowSelectionInterval(this.getIndiceNuevoTipoAutoPago(), this.getIndiceNuevoTipoAutoPago());
				
				int iLastRow =  this.jTableDatosTipoAutoPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAutoPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAutoPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAutoPago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoAutoPago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoAutoPago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoAutoPago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoAutoPago.setVisible(!isVisible);
			this.jPanelPaginacionTipoAutoPago.setVisible(!isVisible);
			this.jPanelAccionesTipoAutoPago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoAutoPago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoAutoPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoAutoPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoAutoPago();
			
			this.abrirFrameOrderByTipoAutoPago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoAutoPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoAutoPago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAutoPago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoAutoPago.isMaximum()) {
					this.jInternalFrameDetalleFormTipoAutoPago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoAutoPago.setSize(this.jInternalFrameDetalleFormTipoAutoPago.iWidthFormulario,this.jInternalFrameDetalleFormTipoAutoPago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoAutoPago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoAutoPago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoAutoPago.isMaximum()) {
						this.jInternalFrameDetalleFormTipoAutoPago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoAutoPago.jContentPaneDetalleTipoAutoPago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoAutoPago.jTabbedPaneRelacionesTipoAutoPago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoAutoPago.jContentPaneDetalleTipoAutoPago.getWidth(),TipoAutoPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAutoPago.jTabbedPaneRelacionesTipoAutoPago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoAutoPago.jContentPaneDetalleTipoAutoPago.getWidth(),TipoAutoPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAutoPago.jTabbedPaneRelacionesTipoAutoPago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoAutoPago.jContentPaneDetalleTipoAutoPago.getWidth(),TipoAutoPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoAutoPago.setVisible(true);
	        this.jInternalFrameDetalleFormTipoAutoPago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoAutoPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoAutoPago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoAutoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAutoPago,false,this);
				} else {
					this.jInternalFrameOrderByTipoAutoPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAutoPago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoAutoPago);
				this.jInternalFrameOrderByTipoAutoPago.setVisible(false);
				this.jInternalFrameOrderByTipoAutoPago.setSelected(false);
				
				this.jInternalFrameOrderByTipoAutoPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAutoPago"));
				
				this.inicializarActualizarBindingTablaOrderByTipoAutoPago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoAutoPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoAutoPago==null) {
				
				this.jInternalFrameImportacionTipoAutoPago=new ImportacionJInternalFrame(TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAutoPago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoAutoPago);
				this.jInternalFrameImportacionTipoAutoPago.setVisible(false);
				this.jInternalFrameImportacionTipoAutoPago.setSelected(false);


				this.jInternalFrameImportacionTipoAutoPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAutoPago"));
				this.jInternalFrameImportacionTipoAutoPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAutoPago"));
				this.jInternalFrameImportacionTipoAutoPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAutoPago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoAutoPago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoAutoPago==null) {
				this.jInternalFrameReporteDinamicoTipoAutoPago=new ReporteDinamicoJInternalFrame(TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAutoPago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAutoPago);
				this.jInternalFrameReporteDinamicoTipoAutoPago.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoAutoPago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoAutoPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAutoPago"));
				this.jInternalFrameReporteDinamicoTipoAutoPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAutoPago"));
				this.jInternalFrameReporteDinamicoTipoAutoPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAutoPago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAutoPago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoAutoPago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAutoPago);
			
	       	this.jInternalFrameDetalleFormTipoAutoPago.setVisible(false);
	        this.jInternalFrameDetalleFormTipoAutoPago.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoAutoPago.dispose();
			//this.jInternalFrameDetalleFormTipoAutoPago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoAutoPago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoAutoPago.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoAutoPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoAutoPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoAutoPago.setVisible(true);
	        this.jInternalFrameImportacionTipoAutoPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoAutoPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoAutoPago.setVisible(true);
	        this.jInternalFrameOrderByTipoAutoPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoAutoPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoAutoPago.setVisible(false);
	        this.jInternalFrameOrderByTipoAutoPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoAutoPago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoAutoPago.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoAutoPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoAutoPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoAutoPago.setVisible(false);
	        this.jInternalFrameImportacionTipoAutoPago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoAutoPago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoAutoPago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoAutoPago(true);
			//this.isEsNuevoTipoAutoPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoAutoPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAutoPago(false) ;
			
			if(tipoautopagoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoAutoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAutoPago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAutoPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoAutoPagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoAutoPago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoAutoPago(true);
			//this.isEsNuevoTipoAutoPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoautopago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoAutoPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoAutoPago(false) ;
			
			if(TipoAutoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAutoPago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAutoPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoAutoPago(false);
			
			//if(!this.isEsNuevoTipoAutoPago) {								
				int intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoAutoPago(this.tipoautopago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
				
			}
			
			if(this.permiteMantenimiento(this.tipoautopago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoAutoPago=true;
					this.inicializarActualizarBindingTablaTipoAutoPago(false);
					this.isEsNuevoTipoAutoPago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoAutoPago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoAutoPago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAutoPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAutoPago(false);
				
				this.habilitarDeshabilitarControlesTipoAutoPago(false);
			
												
				
				if(TipoAutoPagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoAutoPago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoAutoPagoActionPerformed(evt,tipoautopagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoAutoPago(this.tipoautopago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoAutoPago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoautopagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoautopago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				this.tipoautopago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				this.tipoautopago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoautopago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoAutoPagoModel) this.jTableDatosTipoAutoPago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoAutoPago=true;
				this.inicializarActualizarBindingTablaTipoAutoPago(false);
				this.isEsNuevoTipoAutoPago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAutoPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAutoPago(false);
				
				this.habilitarDeshabilitarControlesTipoAutoPago(false);
				
				
				
				if(TipoAutoPagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoAutoPago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoAutoPago.getRowCount()>=1) {
				jTableDatosTipoAutoPago.removeRowSelectionInterval(0, jTableDatosTipoAutoPago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoAutoPago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoAutoPago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAutoPago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAutoPago(false) ;
			
			this.isEsNuevoTipoAutoPago=false;
			
			if(TipoAutoPagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoAutoPago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoAutoPago(false);
				
				//SI ES MANUAL
				if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoAutoPago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoAutoPago--;			
			//TipoAutoPago tipoautopagoAux= new TipoAutoPago();			
			//tipoautopagoAux.setId(this.iIdNuevoTipoAutoPago);
			
			if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoAutoPago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
			
			this.tipoautopago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoautopagoLogic.getTipoAutoPagos().add(this.tipoautopagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoautopagos.add(this.tipoautopagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoAutoPago(false);
			
			this.jTableDatosTipoAutoPago.setRowSelectionInterval(this.getIndiceNuevoTipoAutoPago(), this.getIndiceNuevoTipoAutoPago());
			
			int iLastRow =  this.jTableDatosTipoAutoPago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoAutoPago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoAutoPago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoAutoPago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoAutoPago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAutoPago(false);
			
			//SI ES MANUAL
			if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAutoPago();
			}
			
			//this.abrirFrameTreeTipoAutoPago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Auto PagoS ?", "MANTENIMIENTO DE Tipo Auto Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoAutoPago.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoAutoPago();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoautopagoReturnGeneral=tipoautopagoLogic.procesarImportacionTipoAutoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoautopagoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoAutoPagoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoAutoPago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoAutoPago.setFileImportacion(this.jInternalFrameImportacionTipoAutoPago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoAutoPago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoAutoPago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoAutoPago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoAutoPago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();		

		tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoAutoPagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoAutoPagoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoAutoPagos("Todos",tipoautopagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Auto Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAutoPagoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAutoPagoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoAutoPago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoAutoPagoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoAutoPagoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoAutoPagoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoAutoPagoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoAutoPagoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoAutoPagoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();		
		
		tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautopago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoAutoPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoAutoPago tipoautopago:tipoautopagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoautopago.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAutoPagoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoAutoPago tipoautopago:tipoautopagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoautopago.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAutoPagoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoAutoPago tipoautopago:tipoautopagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoautopago.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoAutoPago(row);				
			//	iRow++;
			//}				
			
			//for(TipoAutoPago tipoautopagoAux:tipoautopagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoAutoPago(tipoautopagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Auto Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoautopagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAutoPago(false);
			
			//SI ES MANUAL
			if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAutoPago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAutoPago(false);
			
			//SI ES MANUAL
			if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAutoPago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAutoPago(false);
			
			//SI ES MANUAL
			if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAutoPago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoAutoPago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoAutoPago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoAutoPago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoAutoPago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoAutoPago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoAutoPago.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoAutoPago.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoAutoPago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoAutoPago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoAutoPago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoAutoPago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoAutoPago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoAutoPago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoAutoPago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAutoPago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoAutoPago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoAutoPago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoAutoPago();
		
		this.inicializarActualizarBindingBotonesManualTipoAutoPago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAutoPago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAutoPago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAutoPago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAutoPago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoAutoPago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoAutoPago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoAutoPago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoAutoPago.jCheckBoxPostAccionNuevoTipoAutoPago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoAutoPago.jCheckBoxPostAccionSinCerrarTipoAutoPago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoAutoPago.jCheckBoxPostAccionSinMensajeTipoAutoPago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoAutoPago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoAutoPago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoAutoPago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
				this.jInternalFrameDetalleFormTipoAutoPago.jCheckBoxPostAccionNuevoTipoAutoPago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoAutoPago.jCheckBoxPostAccionSinCerrarTipoAutoPago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoAutoPago.jCheckBoxPostAccionSinMensajeTipoAutoPago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoAutoPago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoAutoPago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoAutoPago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoAutoPago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoAutoPago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoAutoPago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoAutoPago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoAutoPago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoAutoPago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoAutoPago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoAutoPago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoAutoPago(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAutoPago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoAutoPago() throws Exception {
		try	{
			if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAutoPago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAutoPago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAutoPago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoAutoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoAutoPago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoAutoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoAutoPago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoAutoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoAutoPago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoAutoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoAutoPago.addItem(reporte);
			}
			
			
			if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoAutoPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoAutoPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoAutoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoAutoPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoAutoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoAutoPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoAutoPago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoAutoPago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoAutoPago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAutoPago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAutoPago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAutoPago!=null) {
				this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAutoPago!=null) {
				this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAutoPago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoAutoPago!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAutoPago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoAutoPago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAutoPago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAutoPago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoAutoPago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoAutoPago(Boolean esInicializar) throws Exception {				
		if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAutoPago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoAutoPago() throws Exception {
		this.inicializarActualizarBindingTablaTipoAutoPago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoAutoPago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoAutoPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoAutoPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoAutoPagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoPagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoAutoPagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoAutoPagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoAutoPago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoautopagoLogic.getTipoAutoPagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoautopagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoAutoPago.setModel(new TipoAutoPagoModel(this.tipoautopagoLogic.getTipoAutoPagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoAutoPago.setModel(new TipoAutoPagoModel(this.tipoautopagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoAutoPago!=null && this.jInternalFrameOrderByTipoAutoPago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoAutoPago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoAutoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoPago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoAutoPagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO,tipoautopagoConstantesFunciones.resaltarSeleccionarTipoAutoPago,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoAutoPagoConstantesFunciones.SCLASSWEBTITULO,tipoautopagoConstantesFunciones.resaltarSeleccionarTipoAutoPago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoAutoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoPago,TipoAutoPagoConstantesFunciones.LABEL_ID));

		if(this.tipoautopagoConstantesFunciones.mostraridTipoAutoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAutoPagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoautopagoConstantesFunciones.resaltaridTipoAutoPago,this.tipoautopagoConstantesFunciones.activaridTipoAutoPago,this,true,"idTipoAutoPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoautopagoConstantesFunciones.resaltaridTipoAutoPago,this.tipoautopagoConstantesFunciones.activaridTipoAutoPago,this,true,"idTipoAutoPago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAutoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoPago,TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoautopagoConstantesFunciones.mostrarid_empresaTipoAutoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoautopagoConstantesFunciones.resaltarid_empresaTipoAutoPago,this,this.tipoautopagoConstantesFunciones.activarid_empresaTipoAutoPago));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoautopagoConstantesFunciones.resaltarid_empresaTipoAutoPago,this,this.tipoautopagoConstantesFunciones.activarid_empresaTipoAutoPago,false,"id_empresaTipoAutoPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAutoPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAutoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoPago,TipoAutoPagoConstantesFunciones.LABEL_CODIGO));

		if(this.tipoautopagoConstantesFunciones.mostrarcodigoTipoAutoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAutoPagoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoautopagoConstantesFunciones.resaltarcodigoTipoAutoPago,this.tipoautopagoConstantesFunciones.activarcodigoTipoAutoPago,this,true,"codigoTipoAutoPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoautopagoConstantesFunciones.resaltarcodigoTipoAutoPago,this.tipoautopagoConstantesFunciones.activarcodigoTipoAutoPago,this,true,"codigoTipoAutoPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAutoPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAutoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoPago,TipoAutoPagoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoautopagoConstantesFunciones.mostrarnombreTipoAutoPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAutoPagoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoautopagoConstantesFunciones.resaltarnombreTipoAutoPago,this.tipoautopagoConstantesFunciones.activarnombreTipoAutoPago,this,true,"nombreTipoAutoPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoautopagoConstantesFunciones.resaltarnombreTipoAutoPago,this.tipoautopagoConstantesFunciones.activarnombreTipoAutoPago,this,true,"nombreTipoAutoPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAutoPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoautopagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoautopagoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAutoPago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoautopagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoautopagoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAutoPago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoautopagoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoautopagoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoAutoPago.addColumn(tableColumn);
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
			
			this.jTableDatosTipoAutoPago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoAutoPago.moveColumn(this.jTableDatosTipoAutoPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoAutoPago.moveColumn(this.jTableDatosTipoAutoPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoAutoPago.moveColumn(this.jTableDatosTipoAutoPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoAutoPago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoAutoPago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoAutoPago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoAutoPago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoAutoPago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoAutoPago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoAutoPago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoAutoPago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoautopagoLogic.getTipoAutoPagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoautopagos.size()-1;
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
		//this.jTableDatosTipoAutoPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoAutoPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoAutoPago();
			
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
				
				//this.isEsNuevoTipoAutoPago=false;
					
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
				if(this.tipoautopagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoAutoPago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAutoPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAutoPago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoautopago.getsType().equals("DUPLICADO")
				   || this.tipoautopago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoAutoPago=true;
				
				} else {
					this.isEsNuevoTipoAutoPago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoautopago.getId()>=0 && !this.tipoautopago.getIsNew()) {						
						this.isEsNuevoTipoAutoPago=false;
						
					} else {
						this.isEsNuevoTipoAutoPago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoAutoPago(esRelaciones);						
				
				this.seleccionarTipoAutoPago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoautopago.getId()<0) {
					this.isEsNuevoTipoAutoPago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoAutoPago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoAutoPago(evt,rowIndex);
				}	
				
				if(this.tipoautopagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoAutoPago: " + this.dDif); 
					}
				}								
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoAutoPago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoautopago)) {
					if(this.tipoautopago.getId()>0) {
						this.tipoautopago.setIsDeleted(true);
						
						this.tipoautopagosEliminados.add(this.tipoautopago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoautopagoLogic.getTipoAutoPagos().remove(this.tipoautopago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoautopagos.remove(this.tipoautopago);				
					}
					
					
					((TipoAutoPagoModel) this.jTableDatosTipoAutoPago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAutoPago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoAutoPago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoAutoPago) {
			
			if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAutoPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAutoPago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoAutoPago(this.tipoautopago);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoautopagoConstantesFunciones.cargarid_empresaTipoAutoPago || this.tipoautopagoConstantesFunciones.event_dependid_empresaTipoAutoPago) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoautopago.getid_empresa());
									//this.inicializarActualizarBindingTipoAutoPago(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoautopago.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoautopago.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoautopago.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoAutoPago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoAutoPago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAutoPago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAutoPago(TipoAutoPago tipoautopago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoAutoPago(tipoautopago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAutoPago(TipoAutoPago tipoautopago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoAutoPago(tipoautopago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoAutoPago(tipoautopago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoAutoPago(tipoautopago);
	}
	
	public void setVariablesObjetoActualToFormularioTipoAutoPago(TipoAutoPago tipoautopago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.setText(tipoautopago.getId().toString());
			this.jInternalFrameDetalleFormTipoAutoPago.jTextFieldcodigoTipoAutoPago.setText(tipoautopago.getcodigo());
			this.jInternalFrameDetalleFormTipoAutoPago.jTextAreanombreTipoAutoPago.setText(tipoautopago.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoAutoPago tipoautopagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoautopagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoAutoPago tipoautopagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoautopagoLocal=this.tipoautopago;
			} else {
				tipoautopagoLocal=this.tipoautopagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoautopagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoAutoPago(tipoautopagoLocal,true);
					
					if(tipoautopagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoautopagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoautopagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoAutoPago(TipoAutoPago tipoautopago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAutoPago(tipoautopago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(tipoautopago);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAutoPago(TipoAutoPago tipoautopago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAutoPago(tipoautopago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAutoPago(TipoAutoPago tipoautopago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.getText()==null || this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.getText()=="" || this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.setText("0");
			}

			if(conColumnasBase) {tipoautopago.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAutoPagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoPago.jLabelIdTipoAutoPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoautopago.setcodigo(this.jInternalFrameDetalleFormTipoAutoPago.jTextFieldcodigoTipoAutoPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAutoPagoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoPago.jLabelcodigoTipoAutoPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoautopago.setnombre(this.jInternalFrameDetalleFormTipoAutoPago.jTextAreanombreTipoAutoPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAutoPagoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoPago.jLabelnombreTipoAutoPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAutoPago(TipoAutoPago tipoautopagoBean,TipoAutoPago tipoautopago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoAutoPago(TipoAutoPago tipoautopagoOrigen,TipoAutoPago tipoautopago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoautopagoOrigen.getId()!=null && !tipoautopagoOrigen.getId().equals(0L))) {tipoautopago.setId(tipoautopagoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoautopagoOrigen.getcodigo()!=null && !tipoautopagoOrigen.getcodigo().equals(""))) {tipoautopago.setcodigo(tipoautopagoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoautopagoOrigen.getnombre()!=null && !tipoautopagoOrigen.getnombre().equals(""))) {tipoautopago.setnombre(tipoautopagoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAutoPago(TipoAutoPago tipoautopago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.setText(tipoautopago.getId().toString());
			this.jInternalFrameDetalleFormTipoAutoPago.jTextFieldcodigoTipoAutoPago.setText(tipoautopago.getcodigo());
			this.jInternalFrameDetalleFormTipoAutoPago.jTextAreanombreTipoAutoPago.setText(tipoautopago.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAutoPago(TipoAutoPagoBean tipoautopagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.setText(tipoautopagoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoAutoPago.jTextFieldcodigoTipoAutoPago.setText(tipoautopagoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoAutoPago.jTextAreanombreTipoAutoPago.setText(tipoautopagoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoAutoPago(TipoAutoPagoParameterReturnGeneral tipoautopagoReturnGeneral,TipoAutoPagoBean tipoautopagoBean,Boolean conDefault) throws Exception { 
		try {
			TipoAutoPago tipoautopagoLocal=new TipoAutoPago();
			
			tipoautopagoLocal=tipoautopagoReturnGeneral.getTipoAutoPago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoautopagoLocal.getId()!=null && !tipoautopagoLocal.getId().equals(0L))) {tipoautopagoBean.setId(tipoautopagoLocal.getId());}}
			if(conDefault || (!conDefault && tipoautopagoLocal.getcodigo()!=null && !tipoautopagoLocal.getcodigo().equals(""))) {tipoautopagoBean.setcodigo(tipoautopagoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoautopagoLocal.getnombre()!=null && !tipoautopagoLocal.getnombre().equals(""))) {tipoautopagoBean.setnombre(tipoautopagoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoAutoPagoGenerico(Long idTipoAutoPagoSeleccionado,JComboBox jComboBoxTipoAutoPago,List<TipoAutoPago> tipoautopagosLocal)throws Exception {
		try {
			TipoAutoPago  tipoautopagoTemp=null;

			for(TipoAutoPago tipoautopagoAux:tipoautopagosLocal) {
				if(tipoautopagoAux.getId()!=null && tipoautopagoAux.getId().equals(idTipoAutoPagoSeleccionado)) {
					tipoautopagoTemp=tipoautopagoAux;
					break;
				}
			}

			jComboBoxTipoAutoPago.setSelectedItem(tipoautopagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoAutoPagoGenerico(JComboBox jComboBoxTipoAutoPago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoAutoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAutoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoAutoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAutoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAutoPago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoAutoPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAutoPago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoAutoPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoAutoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoAutoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoautopago=(TipoAutoPago) tipoautopagoLogic.getTipoAutoPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoautopago =(TipoAutoPago) tipoautopagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoautopago.getIsNew() && !tipoautopago.getIsChanged() && !tipoautopago.getIsDeleted()) {
				sDescripcion=tipoautopago.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoautopago.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoAutoPago tipoautopagoRow=new TipoAutoPago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoautopagoRow=(TipoAutoPago) tipoautopagoLogic.getTipoAutoPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoautopagoRow=(TipoAutoPago) tipoautopagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoAutoPago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoAutoPago.setVisible((this.isVisibilidadCeldaNuevoTipoAutoPago && this.isPermisoNuevoTipoAutoPago));			
			this.jButtonDuplicarTipoAutoPago.setVisible((this.isVisibilidadCeldaDuplicarTipoAutoPago && this.isPermisoDuplicarTipoAutoPago));			
			this.jButtonCopiarTipoAutoPago.setVisible((this.isVisibilidadCeldaCopiarTipoAutoPago && this.isPermisoCopiarTipoAutoPago));
			this.jButtonVerFormTipoAutoPago.setVisible((this.isVisibilidadCeldaVerFormTipoAutoPago && this.isPermisoVerFormTipoAutoPago));
			
			this.jButtonAbrirOrderByTipoAutoPago.setVisible((this.isVisibilidadCeldaOrdenTipoAutoPago && this.isPermisoOrdenTipoAutoPago));			
			
			this.jButtonNuevoRelacionesTipoAutoPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago && this.isPermisoNuevoTipoAutoPago));			
			this.jButtonNuevoGuardarCambiosTipoAutoPago.setVisible((this.isVisibilidadCeldaNuevoTipoAutoPago && this.isPermisoNuevoTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago));
			
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonModificarTipoAutoPago.setVisible((this.isVisibilidadCeldaModificarTipoAutoPago && this.isPermisoActualizarTipoAutoPago));	
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonActualizarTipoAutoPago.setVisible((this.isVisibilidadCeldaActualizarTipoAutoPago && this.isPermisoActualizarTipoAutoPago));	
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonEliminarTipoAutoPago.setVisible((this.isVisibilidadCeldaEliminarTipoAutoPago && this.isPermisoEliminarTipoAutoPago));
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonCancelarTipoAutoPago.setVisible(this.isVisibilidadCeldaCancelarTipoAutoPago);							
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosTipoAutoPago.setVisible((this.isVisibilidadCeldaGuardarTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoAutoPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaNuevoTipoAutoPago && this.isPermisoNuevoTipoAutoPago));						
			this.jButtonDuplicarToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaDuplicarTipoAutoPago && this.isPermisoDuplicarTipoAutoPago));						
			this.jButtonCopiarToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaCopiarTipoAutoPago && this.isPermisoCopiarTipoAutoPago));			
			this.jButtonVerFormToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaVerFormTipoAutoPago && this.isPermisoVerFormTipoAutoPago));			
			this.jButtonAbrirOrderByToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaOrdenTipoAutoPago && this.isPermisoOrdenTipoAutoPago));
			this.jButtonNuevoRelacionesToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago && this.isPermisoNuevoTipoAutoPago));			
			this.jButtonNuevoGuardarCambiosToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaNuevoTipoAutoPago && this.isPermisoNuevoTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago));			
			
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonModificarToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaModificarTipoAutoPago && this.isPermisoActualizarTipoAutoPago));	
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonActualizarToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaActualizarTipoAutoPago  && this.isPermisoActualizarTipoAutoPago));	
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonEliminarToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaEliminarTipoAutoPago && this.isPermisoEliminarTipoAutoPago));
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonCancelarToolBarTipoAutoPago.setVisible(this.isVisibilidadCeldaCancelarTipoAutoPago);				
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaGuardarTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoAutoPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoAutoPago.setVisible((this.isVisibilidadCeldaNuevoTipoAutoPago && this.isPermisoNuevoTipoAutoPago));			
			this.jMenuItemDuplicarTipoAutoPago.setVisible((this.isVisibilidadCeldaDuplicarTipoAutoPago && this.isPermisoDuplicarTipoAutoPago));			
			this.jMenuItemCopiarTipoAutoPago.setVisible((this.isVisibilidadCeldaCopiarTipoAutoPago && this.isPermisoCopiarTipoAutoPago));			
			this.jMenuItemVerFormTipoAutoPago.setVisible((this.isVisibilidadCeldaVerFormTipoAutoPago && this.isPermisoVerFormTipoAutoPago));			
			this.jMenuItemAbrirOrderByTipoAutoPago.setVisible((this.isVisibilidadCeldaOrdenTipoAutoPago && this.isPermisoOrdenTipoAutoPago));			
			//this.jMenuItemMostrarOcultarTipoAutoPago.setVisible((this.isVisibilidadCeldaOrdenTipoAutoPago && this.isPermisoOrdenTipoAutoPago));
			this.jMenuItemDetalleAbrirOrderByTipoAutoPago.setVisible((this.isVisibilidadCeldaOrdenTipoAutoPago && this.isPermisoOrdenTipoAutoPago));			
			//this.jMenuItemDetalleMostrarOcultarTipoAutoPago.setVisible((this.isVisibilidadCeldaOrdenTipoAutoPago && this.isPermisoOrdenTipoAutoPago));			
			this.jMenuItemNuevoRelacionesTipoAutoPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago && this.isPermisoNuevoTipoAutoPago));			
			this.jMenuItemNuevoGuardarCambiosTipoAutoPago.setVisible((this.isVisibilidadCeldaNuevoTipoAutoPago && this.isPermisoNuevoTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago));									
			
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemModificarTipoAutoPago.setVisible((this.isVisibilidadCeldaModificarTipoAutoPago && this.isPermisoActualizarTipoAutoPago));	
			this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemActualizarTipoAutoPago.setVisible((this.isVisibilidadCeldaActualizarTipoAutoPago && this.isPermisoActualizarTipoAutoPago));	
			this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemEliminarTipoAutoPago.setVisible((this.isVisibilidadCeldaEliminarTipoAutoPago && this.isPermisoEliminarTipoAutoPago));
			this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemCancelarTipoAutoPago.setVisible(this.isVisibilidadCeldaCancelarTipoAutoPago);				
			}
			
			this.jMenuItemGuardarCambiosTipoAutoPago.setVisible((this.isVisibilidadCeldaGuardarTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago));						
			this.jMenuItemGuardarCambiosTablaTipoAutoPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoAutoPago=this.jButtonNuevoTipoAutoPago.isVisible();
			this.isVisibilidadCeldaDuplicarTipoAutoPago=this.jButtonDuplicarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaCopiarTipoAutoPago=this.jButtonCopiarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaVerFormTipoAutoPago=this.jButtonVerFormTipoAutoPago.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoAutoPago=this.jButtonAbrirOrderByTipoAutoPago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=this.jButtonNuevoRelacionesTipoAutoPago.isVisible();
			this.isVisibilidadCeldaModificarTipoAutoPago=this.jButtonModificarTipoAutoPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			this.isVisibilidadCeldaActualizarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jButtonActualizarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jButtonEliminarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jButtonCancelarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaGuardarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosTipoAutoPago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=this.jButtonGuardarCambiosTablaTipoAutoPago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoAutoPago=this.jButtonNuevoToolBarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=this.jButtonNuevoRelacionesToolBarTipoAutoPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			this.isVisibilidadCeldaModificarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jButtonModificarToolBarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaActualizarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jButtonActualizarToolBarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jButtonEliminarToolBarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jButtonCancelarToolBarTipoAutoPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAutoPago=this.jButtonGuardarCambiosToolBarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=this.jButtonGuardarCambiosTablaToolBarTipoAutoPago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoAutoPago=this.jMenuItemNuevoTipoAutoPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=this.jMenuItemNuevoRelacionesTipoAutoPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			this.isVisibilidadCeldaModificarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemModificarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaActualizarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemActualizarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemEliminarTipoAutoPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoAutoPago=this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemCancelarTipoAutoPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAutoPago=this.jMenuItemGuardarCambiosTipoAutoPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=this.jMenuItemGuardarCambiosTablaTipoAutoPago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoAutoPago(Boolean esInicializar) {
		if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoautopagoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAutoPago();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoAutoPago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoAutoPago() {
		this.jButtonNuevoTipoAutoPago.setVisible(this.isPermisoNuevoTipoAutoPago);			
		this.jButtonDuplicarTipoAutoPago.setVisible(this.isPermisoDuplicarTipoAutoPago);			
		this.jButtonCopiarTipoAutoPago.setVisible(this.isPermisoCopiarTipoAutoPago);			
		this.jButtonVerFormTipoAutoPago.setVisible(this.isPermisoVerFormTipoAutoPago);			
		
		this.jButtonAbrirOrderByTipoAutoPago.setVisible(this.isPermisoOrdenTipoAutoPago);					
		
		this.jButtonNuevoRelacionesTipoAutoPago.setVisible(this.isPermisoNuevoTipoAutoPago);			
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonModificarTipoAutoPago.setVisible(this.isPermisoActualizarTipoAutoPago);	
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonActualizarTipoAutoPago.setVisible(this.isPermisoActualizarTipoAutoPago);	
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonEliminarTipoAutoPago.setVisible(this.isPermisoEliminarTipoAutoPago);
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonCancelarTipoAutoPago.setVisible(this.isVisibilidadCeldaCancelarTipoAutoPago);						
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosTipoAutoPago.setVisible(this.isPermisoGuardarCambiosTipoAutoPago);							
		}
		
		this.jButtonGuardarCambiosTablaTipoAutoPago.setVisible(this.isPermisoActualizarTipoAutoPago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAutoPago() {
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonModificarTipoAutoPago.setVisible(this.isPermisoActualizarTipoAutoPago);	
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonActualizarTipoAutoPago.setVisible(this.isPermisoActualizarTipoAutoPago);	
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonEliminarTipoAutoPago.setVisible(this.isPermisoEliminarTipoAutoPago);
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonCancelarTipoAutoPago.setVisible(this.isVisibilidadCeldaCancelarTipoAutoPago);							
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosTipoAutoPago.setVisible((this.isVisibilidadCeldaGuardarTipoAutoPago && this.isPermisoGuardarCambiosTipoAutoPago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoAutoPago() {
		if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoAutoPago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoAutoPago() {
	}
	
	public void jTableDatosTipoAutoPagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoAutoPago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoAutoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAutoPago(this.gettipoautopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoautopago==null) {
						this.tipoautopago = new TipoAutoPago();
					}

					this.setVariablesFormularioToObjetoActualTipoAutoPago(this.tipoautopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
				}

				if(this.tipoautopago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoautopago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAutoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoAutoPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoAutoPago(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoAutoPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoAutoPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoAutoPago(this.gettipoautopago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoautopagoLogic.getConnexion());

				if(this.tipoautopago.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoautopago.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoAutoPago=(TitledBorder)this.jScrollPanelDatosTipoAutoPago.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoAutoPago.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoAutoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAutoPago(this.gettipoautopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoautopago==null) {
						this.tipoautopago = new TipoAutoPago();
					}

					this.setVariablesFormularioToObjetoActualTipoAutoPago(this.tipoautopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
				}

				if(this.tipoautopago.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoautopago.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAutoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoAutoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAutoPago(this.gettipoautopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoautopago==null) {
						this.tipoautopago = new TipoAutoPago();
					}

					this.setVariablesFormularioToObjetoActualTipoAutoPago(this.tipoautopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
				}

				if(this.tipoautopago.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoautopago.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAutoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoAutoPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAutoPago(this.gettipoautopago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoautopago==null) {
						this.tipoautopago = new TipoAutoPago();
					}

					this.setVariablesFormularioToObjetoActualTipoAutoPago(this.tipoautopago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);
				}

				if(this.tipoautopago.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoautopago.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAutoPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoAutoPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoAutoPago(false,false);

			this.getTipoAutoPagosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoAutoPago(false);

			//if(TipoAutoPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoAutoPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautopagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoAutoPago() {
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
			this.jInternalFrameDetalleFormTipoAutoPago.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoAutoPago.dispose();
			this.jInternalFrameDetalleFormTipoAutoPago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoAutoPago!=null) {
			this.jInternalFrameReporteDinamicoTipoAutoPago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoAutoPago.dispose();
			this.jInternalFrameReporteDinamicoTipoAutoPago=null;
		}
		
		if(this.jInternalFrameImportacionTipoAutoPago!=null) {
			this.jInternalFrameImportacionTipoAutoPago.setVisible(false);	    			
			this.jInternalFrameImportacionTipoAutoPago.dispose();
			this.jInternalFrameImportacionTipoAutoPago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoAutoPago();
			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoAutoPago")) {
				jButtonNuevoTipoAutoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoAutoPago")) {
				jButtonDuplicarTipoAutoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoAutoPago")) {
				jButtonCopiarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoAutoPago")) {
				jButtonVerFormTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoAutoPago")) {
				jButtonNuevoTipoAutoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoAutoPago")) {
				jButtonDuplicarTipoAutoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoAutoPago")) {
				jButtonNuevoTipoAutoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoAutoPago")) {
				jButtonDuplicarTipoAutoPagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoAutoPago")) {
				jButtonNuevoTipoAutoPagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoAutoPago")) {
				jButtonNuevoTipoAutoPagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoAutoPago")) {
				jButtonNuevoTipoAutoPagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoAutoPago")) {
				jButtonModificarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoAutoPago")) {
				jButtonModificarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoAutoPago")) {
				jButtonModificarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoAutoPago")) {
				jButtonActualizarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoAutoPago")) {
				jButtonActualizarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoAutoPago")) {
				jButtonActualizarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoAutoPago")) {
				jButtonEliminarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoAutoPago")) {
				jButtonEliminarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoAutoPago")) {
				jButtonEliminarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoAutoPago")) {
				jButtonCancelarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoAutoPago")) {
				jButtonCancelarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoAutoPago")) {
				jButtonCancelarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoAutoPago")) {
				jButtonCerrarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoAutoPago")) {
				jButtonCerrarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoAutoPago")) {
				jButtonCerrarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoAutoPago")) {
				jButtonMostrarOcultarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoAutoPago")) {
				jButtonCancelarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoAutoPago")) {
				jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoAutoPago")) {
				jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoAutoPago")) {
				jButtonCopiarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoAutoPago")) {
				jButtonVerFormTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoAutoPago")) {
				jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoAutoPago")) {
				jButtonCopiarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoAutoPago")) {
				jButtonVerFormTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoAutoPago")) {
				jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoAutoPago")) {
				jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoAutoPago")) {
				jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoAutoPago")) {
				jButtonRecargarInformacionTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoAutoPago")) {
				jButtonRecargarInformacionTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoAutoPago")) {
				jButtonRecargarInformacionTipoAutoPagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoAutoPago")) {
				jButtonAnterioresTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoAutoPago")) {
				jButtonAnterioresTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoAutoPago")) {
				jButtonAnterioresTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoAutoPago")) {
				jButtonSiguientesTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoAutoPago")) {
				jButtonSiguientesTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoAutoPago")) {
				jButtonSiguientesTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoAutoPago") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoAutoPago")) {
				jButtonAbrirOrderByTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoAutoPago") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoAutoPago")) {
				jButtonMostrarOcultarTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAutoPago")) {
				jButtonNuevoGuardarCambiosTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoAutoPago")) {
				jButtonNuevoGuardarCambiosTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoAutoPago")) {
				jButtonNuevoGuardarCambiosTipoAutoPagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoAutoPago")) {
				jButtonCerrarReporteDinamicoTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoAutoPago")) {
				jButtonGenerarReporteDinamicoTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoAutoPago")) {
				
				jButtonGenerarExcelReporteDinamicoTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoAutoPago")) {
				jButtonCerrarImportacionTipoAutoPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoAutoPago")) {
				
				jButtonGenerarImportacionTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoAutoPago")) {
				
				jButtonAbrirImportacionTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoAutoPago")) {
				jComboBoxTiposAccionesTipoAutoPagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoAutoPago")) {
				jComboBoxTiposRelacionesTipoAutoPagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoAutoPago")) {
				jComboBoxTiposAccionesTipoAutoPagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoAutoPago")) {
				
				jComboBoxTiposSeleccionarTipoAutoPagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoAutoPago")) {
				jTextFieldValorCampoGeneralTipoAutoPagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoAutoPago")) {
				jButtonAbrirOrderByTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoAutoPago")) {
				jButtonAbrirOrderByTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoAutoPago")) {
				jButtonCerrarOrderByTipoAutoPagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAutoPagoBusqueda")) {
				this.jButtonidTipoAutoPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoAutoPagoUpdate")) {
				this.jButtonid_empresaTipoAutoPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoAutoPagoBusqueda")) {
				this.jButtonid_empresaTipoAutoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoAutoPagoBusqueda")) {
				this.jButtoncodigoTipoAutoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAutoPagoBusqueda")) {
				this.jButtonnombreTipoAutoPagoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoAutoPago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				


				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoAutoPago tipoautopagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoautopagoLocal=this.tipoautopago;
			} else {
				tipoautopagoLocal=this.tipoautopagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
							
				
				


				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
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
			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
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
			
			


			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
								
						
				


				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
								
				
				


				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
							
				
				


				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
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
			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
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
			
			


			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoPagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
								
				
				


				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoAutoPago")) {
					jCheckBoxSeleccionarTodosTipoAutoPagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoAutoPago")) {
					jCheckBoxSeleccionadosTipoAutoPagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoAutoPago")) {
					
				}
				
				


				
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
												
				
				


				
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoPagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
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
			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
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
			
			


			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautopago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautopago);
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
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
				
				


				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoPago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautopagoAnterior =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoAutoPago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoAutoPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoAutoPago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoautopago =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoautopago =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoautopago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoAutoPago")) {
				
				}
				
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoAutoPago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoAutoPago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoAutoPago")) {
			
			}
			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoAutoPago();
			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoAutoPago")) {
				jButtonNuevoTipoAutoPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoAutoPago")) {
				jButtonDuplicarTipoAutoPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoAutoPago")) {
				jButtonCopiarTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoAutoPago")) {
				jButtonVerFormTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoAutoPago")) {
				jButtonNuevoTipoAutoPagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoAutoPago")) {
				jButtonModificarTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoAutoPago")) {
				jButtonActualizarTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoAutoPago")) {
				jButtonEliminarTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoAutoPago")) {
				jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoAutoPago")) {
				jButtonCancelarTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoAutoPago")) {
				jButtonCerrarTipoAutoPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoAutoPago")) {
				jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAutoPago")) {
				jButtonNuevoGuardarCambiosTipoAutoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoAutoPago")) {
				jButtonAbrirOrderByTipoAutoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoAutoPago")) {
				jButtonRecargarInformacionTipoAutoPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoAutoPago")) {
				jButtonAnterioresTipoAutoPagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoAutoPago")) {
				jButtonSiguientesTipoAutoPagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAutoPagoBusqueda")) {
				this.jButtonidTipoAutoPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoAutoPagoUpdate")) {
				this.jButtonid_empresaTipoAutoPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoAutoPagoBusqueda")) {
				this.jButtonid_empresaTipoAutoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoAutoPagoBusqueda")) {
				this.jButtoncodigoTipoAutoPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAutoPagoBusqueda")) {
				this.jButtonnombreTipoAutoPagoBusquedaActionPerformed(evt);
			}
			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoAutoPago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoAutoPago")) {
				closingInternalFrameTipoAutoPago();
				
			} else if(sTipo.equals("jButtonCancelarTipoAutoPago")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoAutoPago = (JInternalFrameBase)evt.getSource();
	            	
	            TipoAutoPagoBeanSwingJInternalFrame jInternalFrameParent=(TipoAutoPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAutoPago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoAutoPagoActionPerformed(null);
			}
			
			TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoautopago,new Object(),this.tipoautopagoParameterGeneral,this.tipoautopagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoAutoPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoAutoPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoAutoPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoautopago)) {
			if(!esControlTabla) {
				if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoAutoPago(this.tipoautopago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);			
				}
				
				if(this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoAutoPago(this.tipoautopago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoautopagoReturnGeneral=tipoautopagoLogic.procesarEventosTipoAutoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoautopagoLogic.getTipoAutoPagos(),this.tipoautopago,this.tipoautopagoParameterGeneral,this.isEsNuevoTipoAutoPago,classes);//this.tipoautopagoLogic.getTipoAutoPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoAutoPago(this.tipoautopagoReturnGeneral,this.tipoautopagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoAutoPago(classes,this.tipoautopagoReturnGeneral,this.tipoautopagoBean,false);
					}
						
					if(this.tipoautopagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoAutoPago(this.tipoautopagoReturnGeneral.getTipoAutoPago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoAutoPago(this.tipoautopagoReturnGeneral.getTipoAutoPago());	
					}
						
					if(this.tipoautopagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoAutoPago(this.tipoautopagoReturnGeneral.getTipoAutoPago(),classes);//this.tipoautopagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoAutoPago(this.tipoautopago,classes);//this.tipoautopagoBean);									
				}
			
				if(TipoAutoPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoAutoPago(this.tipoautopago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoPago(this.tipoautopago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoautopagoAnterior!=null) {
						this.tipoautopago=this.tipoautopagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoautopagoReturnGeneral=tipoautopagoLogic.procesarEventosTipoAutoPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoautopagoLogic.getTipoAutoPagos(),this.tipoautopago,this.tipoautopagoParameterGeneral,this.isEsNuevoTipoAutoPago,classes);//this.tipoautopagoLogic.getTipoAutoPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoautopagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoautopagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoautopagoReturnGeneral.getTipoAutoPago(),tipoautopagoLogic.getTipoAutoPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoautopagoReturnGeneral.getTipoAutoPago(),this.tipoautopagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoAutoPago.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoAutoPago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoAutoPago();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoAutoPago() throws Exception {
		
		TipoAutoPagoModel tipoautopagoModel=(TipoAutoPagoModel)this.jTableDatosTipoAutoPago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoautopagoModel.tipoautopagos=this.tipoautopagoLogic.getTipoAutoPagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoautopagoModel.tipoautopagos=this.tipoautopagos;
		}
		
		
		((TipoAutoPagoModel) this.jTableDatosTipoAutoPago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoAutoPago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoautopagoAnterior(),this.tipoautopagoLogic.getTipoAutoPagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoautopagoAnterior(),this.tipoautopagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoAutoPago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoAutoPago(TipoAutoPago tipoautopago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
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
										
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoautopago,new Object(),generalEntityParameterGeneral,this.tipoautopagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoautopagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoAutoPagoConstantesFunciones.getClassesRelationshipsOfTipoAutoPago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoAutoPagoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoAutoPago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoAutoPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoAutoPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoautopago,new Object(),generalEntityParameterGeneral,this.tipoautopagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoAutoPago(TipoAutoPagoBean tipoautopagoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoAutoPago(ArrayList<Classe> classes,TipoAutoPagoReturnGeneral tipoautopagoReturnGeneral,TipoAutoPagoBean tipoautopagoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoAutoPago(TipoAutoPago tipoautopago,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoautopago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoAutoPago = new TipoAutoPagoDetalleFormJInternalFrame(jDesktopPane,this.tipoautopagoSessionBean.getConGuardarRelaciones(),this.tipoautopagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAutoPago);
		this.jInternalFrameDetalleFormTipoAutoPago.setVisible(false);
		this.jInternalFrameDetalleFormTipoAutoPago.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoAutoPago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoAutoPago.tipoautopagoLogic=this.tipoautopagoLogic;
		
		this.cargarCombosFrameForeignKeyTipoAutoPago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAutoPago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAutoPago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoAutoPago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoAutoPago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoAutoPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAutoPago"));
		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonModificarTipoAutoPago.addActionListener(new ButtonActionListener(this,"ModificarTipoAutoPago"));

		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonModificarToolBarTipoAutoPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAutoPago"));
					
		this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemModificarTipoAutoPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAutoPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonActualizarTipoAutoPago.addActionListener (new ButtonActionListener(this,"ActualizarTipoAutoPago"));
		
		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonActualizarToolBarTipoAutoPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAutoPago"));
						
		this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemActualizarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAutoPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonEliminarTipoAutoPago.addActionListener (new ButtonActionListener(this,"EliminarTipoAutoPago"));
		
		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonEliminarToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAutoPago"));
								
		this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemEliminarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAutoPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonCancelarTipoAutoPago.addActionListener (new ButtonActionListener(this,"CancelarTipoAutoPago"));
		
		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonCancelarToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAutoPago"));
					
		this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemCancelarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAutoPago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemDetalleCerrarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAutoPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAutoPago"));
		
		
		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAutoPago"));
		
		
		
		this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAutoPago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonidTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAutoPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonid_empresaTipoAutoPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAutoPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonid_empresaTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAutoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtoncodigoTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAutoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonnombreTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAutoPagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoAutoPago.jTabbedPaneRelacionesTipoAutoPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAutoPago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoAutoPago"));
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAutoPago"));
		}
		
		this.jTableDatosTipoAutoPago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoAutoPago"));
		
		this.jTableDatosTipoAutoPago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoAutoPago"));
		
		this.jButtonNuevoTipoAutoPago.addActionListener(new ButtonActionListener(this,"NuevoTipoAutoPago"));
		
		this.jButtonDuplicarTipoAutoPago.addActionListener(new ButtonActionListener(this,"DuplicarTipoAutoPago"));
		
		this.jButtonCopiarTipoAutoPago.addActionListener(new ButtonActionListener(this,"CopiarTipoAutoPago"));
		
		this.jButtonVerFormTipoAutoPago.addActionListener(new ButtonActionListener(this,"VerFormTipoAutoPago"));
		
		
		this.jButtonNuevoToolBarTipoAutoPago.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoAutoPago"));
			
		this.jButtonDuplicarToolBarTipoAutoPago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoAutoPago"));
			
		this.jMenuItemNuevoTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoAutoPago"));
			
		this.jMenuItemDuplicarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoAutoPago"));		
		
		
		this.jButtonNuevoRelacionesTipoAutoPago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoAutoPago"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoAutoPago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoAutoPago"));
			
		this.jMenuItemNuevoRelacionesTipoAutoPago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoAutoPago"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonModificarTipoAutoPago.addActionListener(new ButtonActionListener(this,"ModificarTipoAutoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonModificarToolBarTipoAutoPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAutoPago"));
			
			this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemModificarTipoAutoPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAutoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonActualizarTipoAutoPago.addActionListener (new ButtonActionListener(this,"ActualizarTipoAutoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonActualizarToolBarTipoAutoPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAutoPago"));
				
			this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemActualizarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAutoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonEliminarTipoAutoPago.addActionListener (new ButtonActionListener(this,"EliminarTipoAutoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonEliminarToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAutoPago"));
						
			this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemEliminarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAutoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonCancelarTipoAutoPago.addActionListener (new ButtonActionListener(this,"CancelarTipoAutoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonCancelarToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAutoPago"));
			
			this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemCancelarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAutoPago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoAutoPago"));		
		
		
		this.jButtonCerrarTipoAutoPago.addActionListener (new ButtonActionListener(this,"CerrarTipoAutoPago"));
		
		
		this.jButtonCerrarToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoAutoPago"));
			
		this.jMenuItemCerrarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoAutoPago"));
			
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jMenuItemDetalleCerrarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAutoPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosTipoAutoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoAutoPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAutoPago"));
		}
		
		this.jButtonCopiarToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoAutoPago"));
			
		this.jButtonVerFormToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoAutoPago"));
		
		this.jMenuItemGuardarCambiosTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoAutoPago"));
			
		this.jMenuItemCopiarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoAutoPago"));		
		
		this.jMenuItemVerFormTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoAutoPago"));		
		
		
		this.jButtonGuardarCambiosTablaTipoAutoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAutoPago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoAutoPago"));
			
		this.jMenuItemGuardarCambiosTablaTipoAutoPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAutoPago"));		
		
		
		
		this.jButtonRecargarInformacionTipoAutoPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoAutoPago"));
					
		this.jButtonRecargarInformacionToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoAutoPago"));
		
		this.jMenuItemRecargarInformacionTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoAutoPago"));		
		
		
		
		this.jButtonAnterioresTipoAutoPago.addActionListener (new ButtonActionListener(this,"AnterioresTipoAutoPago"));
		
		
		this.jButtonAnterioresToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoAutoPago"));
		
		this.jMenuItemAnterioresTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoAutoPago"));		
		
		
		this.jButtonSiguientesTipoAutoPago.addActionListener (new ButtonActionListener(this,"SiguientesTipoAutoPago"));
		
		
		this.jButtonSiguientesToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoAutoPago"));
			
		this.jMenuItemSiguientesTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoAutoPago"));
			
		this.jMenuItemAbrirOrderByTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoAutoPago"));
			
		this.jMenuItemMostrarOcultarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoAutoPago"));
			
		this.jMenuItemDetalleAbrirOrderByTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoAutoPago"));
			
		this.jMenuItemDetalleMostarOcultarTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoAutoPago"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoAutoPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoAutoPago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoAutoPago"));
			
		this.jMenuItemNuevoGuardarCambiosTipoAutoPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoAutoPago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoAutoPago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoAutoPago"));

		this.jCheckBoxSeleccionadosTipoAutoPago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoAutoPago"));
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAutoPago"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoAutoPago.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoAutoPago"));
			
		this.jComboBoxTiposAccionesTipoAutoPago.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoAutoPago"));
					
		this.jComboBoxTiposSeleccionarTipoAutoPago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoAutoPago"));
			
		this.jTextFieldValorCampoGeneralTipoAutoPago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoAutoPago"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonidTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAutoPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonid_empresaTipoAutoPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAutoPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonid_empresaTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAutoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtoncodigoTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAutoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonnombreTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAutoPagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoAutoPago!=null) {
				this.jInternalFrameReporteDinamicoTipoAutoPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAutoPago"));
				this.jInternalFrameReporteDinamicoTipoAutoPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAutoPago"));
				this.jInternalFrameReporteDinamicoTipoAutoPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAutoPago"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoAutoPago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAutoPago"));				
			//this.jButtonGenerarReporteDinamicoTipoAutoPago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAutoPago"));
			//this.jButtonGenerarExcelReporteDinamicoTipoAutoPago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAutoPago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoAutoPago!=null) {
				this.jInternalFrameImportacionTipoAutoPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAutoPago"));
				this.jInternalFrameImportacionTipoAutoPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAutoPago"));
				this.jInternalFrameImportacionTipoAutoPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAutoPago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoAutoPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoAutoPago"));
			
			this.jButtonAbrirOrderByToolBarTipoAutoPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoAutoPago"));			
			
			if(this.jInternalFrameOrderByTipoAutoPago!=null) {
				this.jInternalFrameOrderByTipoAutoPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAutoPago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoPago.jTabbedPaneRelacionesTipoAutoPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAutoPago"));
		
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
            		closingInternalFrameTipoAutoPago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoAutoPago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoAutoPago = (JInternalFrameBase)event.getSource();
	            	
	            TipoAutoPagoBeanSwingJInternalFrame jInternalFrameParent=(TipoAutoPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAutoPago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoAutoPagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoAutoPago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoAutoPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoAutoPago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoAutoPago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoAutoPago";
		inputMap = this.jButtonNuevoTipoAutoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoAutoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAutoPagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoAutoPago";
		inputMap = this.jButtonNuevoRelacionesTipoAutoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoAutoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAutoPagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoAutoPago";
		inputMap = this.jButtonModificarTipoAutoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoAutoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoAutoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoAutoPago";
		inputMap = this.jButtonActualizarTipoAutoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoAutoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoAutoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoAutoPago";
		inputMap = this.jButtonEliminarTipoAutoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoAutoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoAutoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoAutoPago";
		inputMap = this.jButtonCancelarTipoAutoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoAutoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoAutoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoAutoPago";
		inputMap = this.jButtonCerrarTipoAutoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoAutoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoAutoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoAutoPago";
		inputMap = this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosTipoAutoPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonGuardarCambiosTipoAutoPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoAutoPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoAutoPago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoAutoPagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoAutoPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoAutoPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoAutoPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoAutoPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoAutoPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoAutoPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonidTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAutoPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonid_empresaTipoAutoPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoAutoPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonid_empresaTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoAutoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtoncodigoTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAutoPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoPago.jButtonnombreTipoAutoPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAutoPagoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoAutoPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoAutoPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoAutoPagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoAutoPago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoAutoPago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoAutoPago tipoautopagoAux:this.tipoautopagoLogic.getTipoAutoPagos()) {
					tipoautopagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAutoPago tipoautopagoAux:tipoautopagos) {
					tipoautopagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoAutoPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAutoPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAutoPago tipoautopagoAux:this.tipoautopagoLogic.getTipoAutoPagos()) {
						tipoautopagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAutoPago tipoautopagoAux:tipoautopagos) {
						tipoautopagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoAutoPago tipoautopagoAux:this.tipoautopagoLogic.getTipoAutoPagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAutoPago tipoautopagoAux:tipoautopagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAutoPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAutoPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAutoPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoAutoPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAutoPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoAutoPago.getSelectedRows();
			
			TipoAutoPago tipoautopagoLocal=new TipoAutoPago();
			
			//this.seleccionarTodosTipoAutoPago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoautopagoLocal =(TipoAutoPago) this.tipoautopagoLogic.getTipoAutoPagos().toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoautopagoLocal =(TipoAutoPago) this.tipoautopagos.toArray()[this.jTableDatosTipoAutoPago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoautopagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAutoPago tipoautopagoAux:this.tipoautopagoLogic.getTipoAutoPagos()) {
						tipoautopagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAutoPago tipoautopagoAux:tipoautopagos) {
						tipoautopagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoAutoPago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAutoPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAutoPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoAutoPagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoAutoPagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoAutoPagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoAutoPago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoAutoPago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAutoPago tipoautopagoAux:this.tipoautopagoLogic.getTipoAutoPagos()) {
				
						if(sTipoSeleccionar.equals(TipoAutoPagoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoautopagoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAutoPagoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoautopagoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAutoPago tipoautopagoAux:tipoautopagos) {
					
						if(sTipoSeleccionar.equals(TipoAutoPagoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoautopagoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAutoPagoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoautopagoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAutoPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoAutoPagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoAutoPago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoAutoPago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoAutoPago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoAutoPago) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoAutoPago(conSplash);
				
					this.generarReporteTipoAutoPagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAutoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoAutoPagosSeleccionados();
				//this.jComboBoxTiposAccionesTipoAutoPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAutoPagosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoAutoPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAutoPagosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoAutoPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAutoPago();
				
				this.exportarTipoAutoPagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAutoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoAutoPagos();
				//this.importarTipoAutoPagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAutoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAutoPago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoAutoPagosSeleccionados();
				//this.jComboBoxTiposAccionesTipoAutoPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Auto Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoAutoPago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoAutoPago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoAutoPago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Auto Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAutoPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxTiposAccionesFormularioTipoAutoPago.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoAutoPago();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoAutoPago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoAutoPagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoAutoPago();
			
			if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();		
			TipoAutoPago tipoautopago=new TipoAutoPago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoAutoPago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoAutoPago.getSelectedItem();
			
			
			
			
			tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoautopagosSeleccionados.size()==1) {
				for(TipoAutoPago tipoautopagoAux:tipoautopagosSeleccionados) {
					tipoautopago=tipoautopagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoAutoPago();
			
      		//this.finishProcessTipoAutoPago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoAutoPagoReturnGeneral() throws Exception {
		if(this.tipoautopagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoautopagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoautopagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoautopagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoautopagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoautopagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoAutoPago(false);
		}
		
		if(this.tipoautopagoReturnGeneral.getConRetornoLista() || this.tipoautopagoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoautopagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoautopagoLogic.setTipoAutoPagos(this.tipoautopagoReturnGeneral.getTipoAutoPagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoautopagoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoautopagoLogic.setTipoAutoPago(this.tipoautopagoReturnGeneral.getTipoAutoPago());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoAutoPago(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoAutoPago() throws Exception {
		
		
	}
	
	public ArrayList<TipoAutoPago> getTipoAutoPagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoAutoPago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoAutoPago tipoautopagoAux:tipoautopagoLogic.getTipoAutoPagos()) {
					if(tipoautopagoAux.getIsSelected()) {
						tipoautopagosSeleccionados.add(tipoautopagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAutoPago tipoautopagoAux:this.tipoautopagos) {
					if(tipoautopagoAux.getIsSelected()) {
						tipoautopagosSeleccionados.add(tipoautopagoAux);				
					}
				}
			}
			
			if(tipoautopagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoautopagosSeleccionados.addAll(this.tipoautopagoLogic.getTipoAutoPagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoautopagosSeleccionados.addAll(this.tipoautopagos);				
					}
				}
			}
		} else {
			tipoautopagosSeleccionados.add(this.tipoautopago);
		}
		
		return tipoautopagosSeleccionados;
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
	
	public void generarReporteTipoAutoPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoAutoPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoAutoPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAutoPagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAutoPagosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Auto Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoAutoPagosSeleccionados() throws Exception {
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();		
		
		tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoAutoPagos("Todos",tipoautopagosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoAutoPagosSeleccionados() throws Exception {
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();		
		
		tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoAutoPagos("Todos",tipoautopagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoAutoPagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();
		
		tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoAutoPagos("Todos",tipoautopagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoAutoPagosSeleccionados() throws Exception {
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoAutoPago();
		
		
		tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoAutoPago();
		
		
		//this.generarReporteTipoAutoPagos("Todos",tipoautopagosSeleccionados ,tipoautopagoImplementable,tipoautopagoImplementableHome);
	}
	
	public void mostrarImportacionTipoAutoPagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoAutoPago();
		
		this.abrirFrameImportacionTipoAutoPago();		
		
			
		//this.generarReporteTipoAutoPagos("Todos",tipoautopagosSeleccionados ,tipoautopagoImplementable,tipoautopagoImplementableHome);
	}
	
	public void importarTipoAutoPagos() throws Exception {		
	
	}
	
	public void exportarTipoAutoPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoAutoPagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoAutoPagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoAutoPagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Auto Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoAutoPagosSeleccionados() throws Exception {
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();		
		
		tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautopago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoAutoPago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoAutoPago tipoautopagoAux:tipoautopagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoAutoPago(tipoautopagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoautopagoAux.setsDetalleGeneralEntityReporte(tipoautopagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Auto Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoAutoPago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoAutoPagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAutoPagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAutoPagoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAutoPagoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoAutoPago(TipoAutoPago tipoautopago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoautopago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoautopago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoautopago.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoautopago.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoautopago.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoAutoPagosSeleccionados() throws Exception {
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();		
		
		tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautopago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoAutoPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoAutoPago(row);				
				iRow++;
			}				
			
			for(TipoAutoPago tipoautopagoAux:tipoautopagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoAutoPago(tipoautopagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Auto Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoAutoPagosSeleccionados() throws Exception {
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();		
		
		tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautopago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoautopagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoautopago");
			//elementRoot.appendChild(element);
		
			for(TipoAutoPago tipoautopagoAux:tipoautopagosSeleccionados) {
				element = document.createElement("tipoautopago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoAutoPago(tipoautopagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Auto Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoAutoPago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAutoPagoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoAutoPago(TipoAutoPago tipoautopago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoautopago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoautopago.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoautopago.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoautopago.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoAutoPago(TipoAutoPago tipoautopago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoAutoPagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoautopago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoAutoPagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoautopago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoAutoPagoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoautopago.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoAutoPagoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoautopago.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoAutoPagoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoautopago.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoAutoPagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoAutoPago> tipoautopagosSeleccionados=new ArrayList<TipoAutoPago>();
		
		tipoautopagosSeleccionados=this.getTipoAutoPagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoAutoPago(tipoautopagosSeleccionados);
		
		this.generarReporteTipoAutoPagos("Todos",tipoautopagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoAutoPago(ArrayList<TipoAutoPago> tipoautopagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoAutoPago tipoautopagoAux:tipoautopagosSeleccionados) {
				tipoautopagoAux.setsDetalleGeneralEntityReporte(tipoautopagoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoAutoPagoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoautopagoAux.setsDescripcionGeneralEntityReporte1(tipoautopagoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoAutoPagoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoautopagoAux.setsDescripcionGeneralEntityReporte1(tipoautopagoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoAutoPagoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoautopagoAux.setsDescripcionGeneralEntityReporte1(tipoautopagoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoAutoPago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoAutoPago=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=true;
				this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=true;
			}
			
			this.isVisibilidadCeldaModificarTipoAutoPago=false;
			this.isVisibilidadCeldaActualizarTipoAutoPago=false;
			this.isVisibilidadCeldaEliminarTipoAutoPago=false;
			this.isVisibilidadCeldaCancelarTipoAutoPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoPago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoAutoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=false;
			this.isVisibilidadCeldaModificarTipoAutoPago=false;
			this.isVisibilidadCeldaActualizarTipoAutoPago=true;
			this.isVisibilidadCeldaEliminarTipoAutoPago=false;
			this.isVisibilidadCeldaCancelarTipoAutoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoPago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoAutoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=false;
			this.isVisibilidadCeldaModificarTipoAutoPago=false;
			this.isVisibilidadCeldaActualizarTipoAutoPago=true;
			this.isVisibilidadCeldaEliminarTipoAutoPago=true;
			this.isVisibilidadCeldaCancelarTipoAutoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoPago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoAutoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=false;
			this.isVisibilidadCeldaModificarTipoAutoPago=false;
			this.isVisibilidadCeldaActualizarTipoAutoPago=true;
			this.isVisibilidadCeldaEliminarTipoAutoPago=false;
			this.isVisibilidadCeldaCancelarTipoAutoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoPago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoAutoPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=true;
			this.isVisibilidadCeldaModificarTipoAutoPago=false;
			this.isVisibilidadCeldaActualizarTipoAutoPago=false;
			this.isVisibilidadCeldaEliminarTipoAutoPago=false;
			this.isVisibilidadCeldaCancelarTipoAutoPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoPago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoAutoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=false;
			this.isVisibilidadCeldaActualizarTipoAutoPago=false;
			this.isVisibilidadCeldaEliminarTipoAutoPago=false;
			this.isVisibilidadCeldaCancelarTipoAutoPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoPago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoAutoPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=false;
			this.isVisibilidadCeldaModificarTipoAutoPago=true;
			this.isVisibilidadCeldaActualizarTipoAutoPago=false;
			this.isVisibilidadCeldaEliminarTipoAutoPago=false;
			this.isVisibilidadCeldaCancelarTipoAutoPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoPago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoAutoPagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoAutoPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=true;
		} else {
			this.actualizarEstadoPanelsTipoAutoPago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoAutoPago=false;
			//this.isVisibilidadCeldaVerFormTipoAutoPago=false;
			this.isVisibilidadCeldaDuplicarTipoAutoPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoautopagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoAutoPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoautopagoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoautopagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=false;												
			}
			
			this.jButtonCerrarTipoAutoPago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoPago=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoautopago)) {
			this.isVisibilidadCeldaActualizarTipoAutoPago=false;
			this.isVisibilidadCeldaEliminarTipoAutoPago=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAutoPago() {
	}
	
	public void actualizarEstadoPanelsTipoAutoPago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoAutoPago!=null) {
				this.jScrollPanelDatosEdicionTipoAutoPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoPago!=null) {
				this.jTabbedPaneBusquedasTipoAutoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoPago!=null) {
				this.jScrollPanelDatosTipoAutoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAutoPago!=null) {
				this.jPanelPaginacionTipoAutoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAutoPago!=null) {
				this.jPanelParametrosReportesTipoAutoPago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoAutoPago!=null) {
				this.jScrollPanelDatosEdicionTipoAutoPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoPago!=null) {
				this.jTabbedPaneBusquedasTipoAutoPago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoAutoPago!=null) {
				this.jScrollPanelDatosTipoAutoPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAutoPago!=null) {
				this.jPanelPaginacionTipoAutoPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAutoPago!=null) {
				this.jPanelParametrosReportesTipoAutoPago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoAutoPago!=null) {
				this.jScrollPanelDatosEdicionTipoAutoPago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoPago!=null) {
				this.jTabbedPaneBusquedasTipoAutoPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoPago!=null) {
				this.jScrollPanelDatosTipoAutoPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAutoPago!=null) {
				this.jPanelPaginacionTipoAutoPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAutoPago!=null) {
				this.jPanelParametrosReportesTipoAutoPago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoAutoPago!=null) {
				this.jScrollPanelDatosEdicionTipoAutoPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoPago!=null) {
				this.jTabbedPaneBusquedasTipoAutoPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoPago!=null) {
				this.jScrollPanelDatosTipoAutoPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAutoPago!=null) {
				this.jPanelPaginacionTipoAutoPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAutoPago!=null) {
				this.jPanelParametrosReportesTipoAutoPago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoAutoPago!=null) {
				this.jScrollPanelDatosEdicionTipoAutoPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoPago!=null) {
				this.jTabbedPaneBusquedasTipoAutoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoPago!=null) {
				this.jScrollPanelDatosTipoAutoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAutoPago!=null) {
				this.jPanelPaginacionTipoAutoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAutoPago!=null) {
				this.jPanelParametrosReportesTipoAutoPago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoAutoPago!=null) {
				this.jScrollPanelDatosEdicionTipoAutoPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoPago!=null) {
				this.jTabbedPaneBusquedasTipoAutoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoPago!=null) {
				this.jScrollPanelDatosTipoAutoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAutoPago!=null) {
				this.jPanelPaginacionTipoAutoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAutoPago!=null) {
				this.jPanelParametrosReportesTipoAutoPago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoAutoPago!=null) {
				this.jScrollPanelDatosEdicionTipoAutoPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoPago!=null) {
				this.jTabbedPaneBusquedasTipoAutoPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoPago!=null) {
				this.jScrollPanelDatosTipoAutoPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAutoPago!=null) {
				this.jPanelPaginacionTipoAutoPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAutoPago!=null) {
				this.jPanelParametrosReportesTipoAutoPago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoAutoPago!=null) {
					this.jTabbedPaneBusquedasTipoAutoPago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoAutoPago!=null) {
				this.jPanelParametrosReportesTipoAutoPago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoautopagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoPago!=null) {
				this.jTabbedPaneBusquedasTipoAutoPago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoAutoPago!=null) {
				this.jPanelParametrosReportesTipoAutoPago.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoAutoPagoSessionBean tipoautopagoSessionBean=new TipoAutoPagoSessionBean();
		
		if(this.tipoautopagoSessionBean==null) {
			this.tipoautopagoSessionBean=new TipoAutoPagoSessionBean();
		}
		
		this.tipoautopagoSessionBean.setsUltimaBusquedaTipoAutoPago(this.getsAccionBusqueda());
		this.tipoautopagoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoautopagoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoautopagoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoAutoPagoSessionBean tipoautopagoSessionBean=new TipoAutoPagoSessionBean();
		
		if(this.tipoautopagoSessionBean==null) {
			this.tipoautopagoSessionBean=new TipoAutoPagoSessionBean();
		}
		
		if(this.tipoautopagoSessionBean.getsUltimaBusquedaTipoAutoPago()!=null&&!this.tipoautopagoSessionBean.getsUltimaBusquedaTipoAutoPago().equals("")) {
			this.setsAccionBusqueda(tipoautopagoSessionBean.getsUltimaBusquedaTipoAutoPago());
			this.setiNumeroPaginacion(tipoautopagoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoautopagoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoautopagoSessionBean.getid_empresa());
				tipoautopagoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoautopagoSessionBean.setsUltimaBusquedaTipoAutoPago("");
		this.tipoautopagoSessionBean.setiNumeroPaginacion(TipoAutoPagoConstantesFunciones.INUMEROPAGINACION);
		this.tipoautopagoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoAutoPago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoAutoPago() {
		this.updateBorderResaltarBusquedasFormularioTipoAutoPago();
		this.updateVisibilidadBusquedasFormularioTipoAutoPago();
		this.updateHabilitarBusquedasFormularioTipoAutoPago();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoAutoPago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoAutoPago.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoAutoPago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoAutoPago.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoAutoPago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoAutoPago.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoAutoPago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoAutoPago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoAutoPago() throws Exception {

		if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoAutoPago();
		this.updateVisibilidadResaltarControlesFormularioTipoAutoPago();
		this.updateHabilitarResaltarControlesFormularioTipoAutoPago();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoAutoPago() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoautopagoConstantesFunciones.resaltaridTipoAutoPago!=null && this.jInternalFrameDetalleFormTipoAutoPago!=null) {this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.setBorder(this.tipoautopagoConstantesFunciones.resaltaridTipoAutoPago);}
		if(this.tipoautopagoConstantesFunciones.resaltarid_empresaTipoAutoPago!=null && this.jInternalFrameDetalleFormTipoAutoPago!=null) {this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.setBorder(this.tipoautopagoConstantesFunciones.resaltarid_empresaTipoAutoPago);}
		if(this.tipoautopagoConstantesFunciones.resaltarcodigoTipoAutoPago!=null && this.jInternalFrameDetalleFormTipoAutoPago!=null) {this.jInternalFrameDetalleFormTipoAutoPago.jTextFieldcodigoTipoAutoPago.setBorder(this.tipoautopagoConstantesFunciones.resaltarcodigoTipoAutoPago);}
		if(this.tipoautopagoConstantesFunciones.resaltarnombreTipoAutoPago!=null && this.jInternalFrameDetalleFormTipoAutoPago!=null) {this.jInternalFrameDetalleFormTipoAutoPago.jTextAreanombreTipoAutoPago.setBorder(this.tipoautopagoConstantesFunciones.resaltarnombreTipoAutoPago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoAutoPago() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
	
		//this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.setVisible(this.tipoautopagoConstantesFunciones.mostraridTipoAutoPago);
		this.jInternalFrameDetalleFormTipoAutoPago.jPanelidTipoAutoPago.setVisible(this.tipoautopagoConstantesFunciones.mostraridTipoAutoPago);
		//this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.setVisible(this.tipoautopagoConstantesFunciones.mostrarid_empresaTipoAutoPago);
		this.jInternalFrameDetalleFormTipoAutoPago.jPanelid_empresaTipoAutoPago.setVisible(this.tipoautopagoConstantesFunciones.mostrarid_empresaTipoAutoPago);
		//this.jInternalFrameDetalleFormTipoAutoPago.jTextFieldcodigoTipoAutoPago.setVisible(this.tipoautopagoConstantesFunciones.mostrarcodigoTipoAutoPago);
		this.jInternalFrameDetalleFormTipoAutoPago.jPanelcodigoTipoAutoPago.setVisible(this.tipoautopagoConstantesFunciones.mostrarcodigoTipoAutoPago);
		//this.jInternalFrameDetalleFormTipoAutoPago.jTextAreanombreTipoAutoPago.setVisible(this.tipoautopagoConstantesFunciones.mostrarnombreTipoAutoPago);
		this.jInternalFrameDetalleFormTipoAutoPago.jPanelnombreTipoAutoPago.setVisible(this.tipoautopagoConstantesFunciones.mostrarnombreTipoAutoPago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoAutoPago() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAutoPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAutoPago!=null) {
	
		this.jInternalFrameDetalleFormTipoAutoPago.jLabelidTipoAutoPago.setEnabled(this.tipoautopagoConstantesFunciones.activaridTipoAutoPago);
		this.jInternalFrameDetalleFormTipoAutoPago.jComboBoxid_empresaTipoAutoPago.setEnabled(this.tipoautopagoConstantesFunciones.activarid_empresaTipoAutoPago);
		this.jInternalFrameDetalleFormTipoAutoPago.jTextFieldcodigoTipoAutoPago.setEnabled(this.tipoautopagoConstantesFunciones.activarcodigoTipoAutoPago);
		this.jInternalFrameDetalleFormTipoAutoPago.jTextAreanombreTipoAutoPago.setEnabled(this.tipoautopagoConstantesFunciones.activarnombreTipoAutoPago);
		}
	}
	
		
}