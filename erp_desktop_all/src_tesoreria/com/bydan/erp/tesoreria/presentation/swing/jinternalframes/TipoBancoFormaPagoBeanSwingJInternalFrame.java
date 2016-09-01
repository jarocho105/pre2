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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.TipoBancoFormaPagoConstantesFunciones;
import com.bydan.erp.tesoreria.util.TipoBancoFormaPagoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.TipoBancoFormaPagoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.TipoBancoFormaPagoBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class TipoBancoFormaPagoBeanSwingJInternalFrame extends TipoBancoFormaPagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoBancoFormaPagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoBancoFormaPago> tipobancoformapagoValidator = new ClassValidator<TipoBancoFormaPago>(TipoBancoFormaPago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoBancoFormaPago tipobancoformapago;	
	public TipoBancoFormaPago tipobancoformapagoAux;
	public TipoBancoFormaPago tipobancoformapagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoBancoFormaPago tipobancoformapagoTotales;
	public Long idTipoBancoFormaPagoActual;
	public Long iIdNuevoTipoBancoFormaPago=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosBancoFormaPago=false;

	public Boolean getIsTienePermisosBancoFormaPago() {
		return isTienePermisosBancoFormaPago;
	}

	public void setIsTienePermisosBancoFormaPago(Boolean isTienePermisosBancoFormaPago) {
		this.isTienePermisosBancoFormaPago= isTienePermisosBancoFormaPago;
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
	
	public Boolean isPermisoTodoTipoBancoFormaPago;
	public Boolean isPermisoNuevoTipoBancoFormaPago;
	public Boolean isPermisoActualizarTipoBancoFormaPago;
	public Boolean isPermisoActualizarOriginalTipoBancoFormaPago;
	public Boolean isPermisoEliminarTipoBancoFormaPago;
	public Boolean isPermisoGuardarCambiosTipoBancoFormaPago;
	public Boolean isPermisoConsultaTipoBancoFormaPago;
	public Boolean isPermisoBusquedaTipoBancoFormaPago;
	public Boolean isPermisoReporteTipoBancoFormaPago;
	public Boolean isPermisoPaginacionMedioTipoBancoFormaPago;
	public Boolean isPermisoPaginacionAltoTipoBancoFormaPago;
	public Boolean isPermisoPaginacionTodoTipoBancoFormaPago;
	public Boolean isPermisoCopiarTipoBancoFormaPago;
	public Boolean isPermisoVerFormTipoBancoFormaPago;
	public Boolean isPermisoDuplicarTipoBancoFormaPago;
	public Boolean isPermisoOrdenTipoBancoFormaPago;
	
	
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
	
	public TipoBancoFormaPagoParameterReturnGeneral tipobancoformapagoReturnGeneral;
	public TipoBancoFormaPagoParameterReturnGeneral tipobancoformapagoParameterGeneral;
	
	

	public BancoFormaPagoLogic bancoformapagoLogic=null;

	public BancoFormaPagoLogic getBancoFormaPagoLogic() {
		return bancoformapagoLogic;
	}

	public void setBancoFormaPagoLogic(BancoFormaPagoLogic bancoformapagoLogic) {
		this.bancoformapagoLogic = bancoformapagoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoBancoFormaPago=false;
	public Boolean esParaAccionDesdeFormularioTipoBancoFormaPago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoBancoFormaPagoSessionBeanAdditional tipobancoformapagoSessionBeanAdditional=null;
	
	public TipoBancoFormaPagoSessionBeanAdditional getTipoBancoFormaPagoSessionBeanAdditional() {
		return this.tipobancoformapagoSessionBeanAdditional;
	}
	
	public void setTipoBancoFormaPagoSessionBeanAdditional(TipoBancoFormaPagoSessionBeanAdditional tipobancoformapagoSessionBeanAdditional) {
		try {
			this.tipobancoformapagoSessionBeanAdditional=tipobancoformapagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoBancoFormaPagoBeanSwingJInternalFrameAdditional tipobancoformapagoBeanSwingJInternalFrameAdditional=null;
	//public class TipoBancoFormaPagoBeanSwingJInternalFrame
	
	public TipoBancoFormaPagoBeanSwingJInternalFrameAdditional getTipoBancoFormaPagoBeanSwingJInternalFrameAdditional() {
		return this.tipobancoformapagoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoBancoFormaPagoBeanSwingJInternalFrameAdditional(TipoBancoFormaPagoBeanSwingJInternalFrameAdditional tipobancoformapagoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipobancoformapagoBeanSwingJInternalFrameAdditional=tipobancoformapagoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoBancoFormaPagoLogic tipobancoformapagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoBancoFormaPago tipobancoformapagoBean;
	public TipoBancoFormaPagoConstantesFunciones tipobancoformapagoConstantesFunciones;
	//public TipoBancoFormaPagoParameterReturnGeneral tipobancoformapagoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoBancoFormaPago> tipobancoformapagos;	
	//public List<TipoBancoFormaPago> tipobancoformapagosEliminados;
	//public List<TipoBancoFormaPago> tipobancoformapagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoBancoFormaPago=false;
	public Boolean isVisibilidadCeldaDuplicarTipoBancoFormaPago=true;
	public Boolean isVisibilidadCeldaCopiarTipoBancoFormaPago=true;
	public Boolean isVisibilidadCeldaVerFormTipoBancoFormaPago=true;
	public Boolean isVisibilidadCeldaOrdenTipoBancoFormaPago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=false;
	public Boolean isVisibilidadCeldaModificarTipoBancoFormaPago=false;
	public Boolean isVisibilidadCeldaActualizarTipoBancoFormaPago=false;
	public Boolean isVisibilidadCeldaEliminarTipoBancoFormaPago=false;
	public Boolean isVisibilidadCeldaCancelarTipoBancoFormaPago=false;
	public Boolean isVisibilidadCeldaGuardarTipoBancoFormaPago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoBancoFormaPago() {
		return this.iIdNuevoTipoBancoFormaPago;
	}

	public void setiIdNuevoTipoBancoFormaPago(Long iIdNuevoTipoBancoFormaPago) {
		this.iIdNuevoTipoBancoFormaPago = iIdNuevoTipoBancoFormaPago;
	}
	
	public Long getidTipoBancoFormaPagoActual() {
		return this.idTipoBancoFormaPagoActual;
	}

	public void setidTipoBancoFormaPagoActual(Long idTipoBancoFormaPagoActual) {
		this.idTipoBancoFormaPagoActual = idTipoBancoFormaPagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoBancoFormaPago gettipobancoformapago() {
		return this.tipobancoformapago;
	}

	public void settipobancoformapago(TipoBancoFormaPago tipobancoformapago) {
		this.tipobancoformapago = tipobancoformapago;
	}
	
	public TipoBancoFormaPago gettipobancoformapagoAux() {
		return this.tipobancoformapagoAux;
	}

	public void settipobancoformapagoAux(TipoBancoFormaPago tipobancoformapagoAux) {
		this.tipobancoformapagoAux = tipobancoformapagoAux;
	}				
	
	public TipoBancoFormaPago gettipobancoformapagoAnterior() {
		return this.tipobancoformapagoAnterior;
	}

	public void settipobancoformapagoAnterior(TipoBancoFormaPago tipobancoformapagoAnterior) {
		this.tipobancoformapagoAnterior = tipobancoformapagoAnterior;
	}	
	
	public TipoBancoFormaPago gettipobancoformapagoTotales() {
		return this.tipobancoformapagoTotales;
	}

	public void settipobancoformapagoTotales(TipoBancoFormaPago tipobancoformapagoTotales) {
		this.tipobancoformapagoTotales = tipobancoformapagoTotales;
	}	
	
	public TipoBancoFormaPago gettipobancoformapagoBean() {
		return this.tipobancoformapagoBean;
	}

	public void settipobancoformapagoBean(TipoBancoFormaPago tipobancoformapagoBean) {
		this.tipobancoformapagoBean = tipobancoformapagoBean;
	}	
	
	public TipoBancoFormaPagoParameterReturnGeneral gettipobancoformapagoReturnGeneral() {
		return this.tipobancoformapagoReturnGeneral;
	}

	public void settipobancoformapagoReturnGeneral(TipoBancoFormaPagoParameterReturnGeneral tipobancoformapagoReturnGeneral) {
		this.tipobancoformapagoReturnGeneral = tipobancoformapagoReturnGeneral;
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
	
	
	public TipoBancoFormaPagoLogic getTipoBancoFormaPagoLogic()	{		
		return tipobancoformapagoLogic;
	}

	public void setTipoBancoFormaPagoLogic(TipoBancoFormaPagoLogic tipobancoformapagoLogic) {
		this.tipobancoformapagoLogic = tipobancoformapagoLogic;
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
	
	public Boolean getIsEsNuevoTipoBancoFormaPago() {
		return isEsNuevoTipoBancoFormaPago;
	}

	public void setIsEsNuevoTipoBancoFormaPago(Boolean isEsNuevoTipoBancoFormaPago) {
		this.isEsNuevoTipoBancoFormaPago = isEsNuevoTipoBancoFormaPago;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoBancoFormaPago() {
		return esParaAccionDesdeFormularioTipoBancoFormaPago;
	}
	
	public void setEsParaAccionDesdeFormularioTipoBancoFormaPago(Boolean esParaAccionDesdeFormularioTipoBancoFormaPago) {
		this.esParaAccionDesdeFormularioTipoBancoFormaPago = esParaAccionDesdeFormularioTipoBancoFormaPago;
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

			if(this.tipobancoformapagoSessionBean==null) {
				this.tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
			}

			if(!this.tipobancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipobancoformapagoSessionBean.getlidEmpresaActual());
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

					if(this.tipobancoformapago!=null) {
						this.tipobancoformapago.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
						this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoBancoFormaPago.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
						if(this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoBancoFormaPagoGenerico)throws Exception
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
				jComboBoxid_empresaTipoBancoFormaPagoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoBancoFormaPagoGenerico!=null && jComboBoxid_empresaTipoBancoFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoBancoFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoBancoFormaPago tipobancoformapago,JComboBox jComboBoxid_empresaTipoBancoFormaPagoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoBancoFormaPagoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoBancoFormaPagoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipobancoformapago.setid_empresa(empresaAux.getId());
				tipobancoformapago.setempresa_descripcion(TipoBancoFormaPagoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipobancoformapago.setEmpresa(empresaAux);			}
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

					if(!TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { 
							this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { 
					}

					if(!TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
							this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoBancoFormaPago() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoBancoFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesTipoBancoFormaPago(this.tipobancoformapagoLogic.getTipoBancoFormaPagos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoBancoFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesTipoBancoFormaPago(this.tipobancoformapagos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipobancoformapagoLogic.setTipoBancoFormaPagos(this.tipobancoformapagos);
			tipobancoformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoBancoFormaPagoParameterReturnGeneral getTipoBancoFormaPagoParameterGeneral() {
		return this.tipobancoformapagoParameterGeneral;
	}
	
	public void setTipoBancoFormaPagoParameterGeneral(TipoBancoFormaPagoParameterReturnGeneral tipobancoformapagoParameterGeneral) {
		this.tipobancoformapagoParameterGeneral = tipobancoformapagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoBancoFormaPago() {
		return isPermisoTodoTipoBancoFormaPago;
	}

	public void setIsPermisoTodoTipoBancoFormaPago(Boolean isPermisoTodoTipoBancoFormaPago) {
		this.isPermisoTodoTipoBancoFormaPago = isPermisoTodoTipoBancoFormaPago;
	}

	public Boolean getIsPermisoNuevoTipoBancoFormaPago() {
		return isPermisoNuevoTipoBancoFormaPago;
	}

	public void setIsPermisoNuevoTipoBancoFormaPago(Boolean isPermisoNuevoTipoBancoFormaPago) {
		this.isPermisoNuevoTipoBancoFormaPago = isPermisoNuevoTipoBancoFormaPago;
	}

	public Boolean getIsPermisoActualizarTipoBancoFormaPago() {
		return isPermisoActualizarTipoBancoFormaPago;
	}

	public void setIsPermisoActualizarTipoBancoFormaPago(Boolean isPermisoActualizarTipoBancoFormaPago) {
		this.isPermisoActualizarTipoBancoFormaPago = isPermisoActualizarTipoBancoFormaPago;
	}

	public Boolean getIsPermisoEliminarTipoBancoFormaPago() {
		return isPermisoEliminarTipoBancoFormaPago;
	}

	public void setIsPermisoEliminarTipoBancoFormaPago(Boolean isPermisoEliminarTipoBancoFormaPago) {
		this.isPermisoEliminarTipoBancoFormaPago = isPermisoEliminarTipoBancoFormaPago;
	}

	public Boolean getIsPermisoGuardarCambiosTipoBancoFormaPago() {
		return isPermisoGuardarCambiosTipoBancoFormaPago;
	}

	public void setIsPermisoGuardarCambiosTipoBancoFormaPago(Boolean isPermisoGuardarCambiosTipoBancoFormaPago) {
		this.isPermisoGuardarCambiosTipoBancoFormaPago = isPermisoGuardarCambiosTipoBancoFormaPago;
	}
	
	public Boolean getIsPermisoConsultaTipoBancoFormaPago() {
		return isPermisoConsultaTipoBancoFormaPago;
	}

	public void setIsPermisoConsultaTipoBancoFormaPago(Boolean isPermisoConsultaTipoBancoFormaPago) {
		this.isPermisoConsultaTipoBancoFormaPago = isPermisoConsultaTipoBancoFormaPago;
	}

	public Boolean getIsPermisoBusquedaTipoBancoFormaPago() {
		return isPermisoBusquedaTipoBancoFormaPago;
	}

	public void setIsPermisoBusquedaTipoBancoFormaPago(Boolean isPermisoBusquedaTipoBancoFormaPago) {
		this.isPermisoBusquedaTipoBancoFormaPago = isPermisoBusquedaTipoBancoFormaPago;
	}

	public Boolean getIsPermisoReporteTipoBancoFormaPago() {
		return isPermisoReporteTipoBancoFormaPago;
	}

	public void setIsPermisoReporteTipoBancoFormaPago(Boolean isPermisoReporteTipoBancoFormaPago) {
		this.isPermisoReporteTipoBancoFormaPago = isPermisoReporteTipoBancoFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoBancoFormaPago() {
		return isPermisoPaginacionMedioTipoBancoFormaPago;
	}

	public void setIsPermisoPaginacionMedioTipoBancoFormaPago(Boolean isPermisoPaginacionMedioTipoBancoFormaPago) {
		this.isPermisoPaginacionMedioTipoBancoFormaPago = isPermisoPaginacionMedioTipoBancoFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoBancoFormaPago() {
		return isPermisoPaginacionTodoTipoBancoFormaPago;
	}

	public void setIsPermisoPaginacionTodoTipoBancoFormaPago(Boolean isPermisoPaginacionTodoTipoBancoFormaPago) {
		this.isPermisoPaginacionTodoTipoBancoFormaPago = isPermisoPaginacionTodoTipoBancoFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoBancoFormaPago() {
		return isPermisoPaginacionAltoTipoBancoFormaPago;
	}

	public void setIsPermisoPaginacionAltoTipoBancoFormaPago(Boolean isPermisoPaginacionAltoTipoBancoFormaPago) {
		this.isPermisoPaginacionAltoTipoBancoFormaPago = isPermisoPaginacionAltoTipoBancoFormaPago;
	}
	
	public Boolean getIsPermisoCopiarTipoBancoFormaPago() {
		return isPermisoCopiarTipoBancoFormaPago;
	}

	public void setIsPermisoCopiarTipoBancoFormaPago(Boolean isPermisoCopiarTipoBancoFormaPago) {
		this.isPermisoCopiarTipoBancoFormaPago = isPermisoCopiarTipoBancoFormaPago;
	}
	
	public Boolean getIsPermisoVerFormTipoBancoFormaPago() {
		return isPermisoVerFormTipoBancoFormaPago;
	}

	public void setIsPermisoVerFormTipoBancoFormaPago(Boolean isPermisoVerFormTipoBancoFormaPago) {
		this.isPermisoVerFormTipoBancoFormaPago = isPermisoVerFormTipoBancoFormaPago;
	}
	
	public Boolean getIsPermisoDuplicarTipoBancoFormaPago() {
		return isPermisoDuplicarTipoBancoFormaPago;
	}

	public void setIsPermisoDuplicarTipoBancoFormaPago(Boolean isPermisoDuplicarTipoBancoFormaPago) {
		this.isPermisoDuplicarTipoBancoFormaPago = isPermisoDuplicarTipoBancoFormaPago;
	}
	
	public Boolean getIsPermisoOrdenTipoBancoFormaPago() {
		return isPermisoOrdenTipoBancoFormaPago;
	}

	public void setIsPermisoOrdenTipoBancoFormaPago(Boolean isPermisoOrdenTipoBancoFormaPago) {
		this.isPermisoOrdenTipoBancoFormaPago = isPermisoOrdenTipoBancoFormaPago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoBancoFormaPago() {
		return isVisibilidadCeldaNuevoTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoTipoBancoFormaPago(Boolean isVisibilidadCeldaNuevoTipoBancoFormaPago) {
		this.isVisibilidadCeldaNuevoTipoBancoFormaPago = isVisibilidadCeldaNuevoTipoBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoBancoFormaPago() {
		return isVisibilidadCeldaDuplicarTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaDuplicarTipoBancoFormaPago(Boolean isVisibilidadCeldaDuplicarTipoBancoFormaPago) {
		this.isVisibilidadCeldaDuplicarTipoBancoFormaPago = isVisibilidadCeldaDuplicarTipoBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoBancoFormaPago() {
		return isVisibilidadCeldaCopiarTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaCopiarTipoBancoFormaPago(Boolean isVisibilidadCeldaCopiarTipoBancoFormaPago) {
		this.isVisibilidadCeldaCopiarTipoBancoFormaPago = isVisibilidadCeldaCopiarTipoBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoBancoFormaPago() {
		return isVisibilidadCeldaVerFormTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaVerFormTipoBancoFormaPago(Boolean isVisibilidadCeldaVerFormTipoBancoFormaPago) {
		this.isVisibilidadCeldaVerFormTipoBancoFormaPago = isVisibilidadCeldaVerFormTipoBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoBancoFormaPago() {
		return isVisibilidadCeldaOrdenTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaOrdenTipoBancoFormaPago(Boolean isVisibilidadCeldaOrdenTipoBancoFormaPago) {
		this.isVisibilidadCeldaOrdenTipoBancoFormaPago = isVisibilidadCeldaOrdenTipoBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago() {
		return isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago(Boolean isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago) {
		this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago = isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoBancoFormaPago() {
		return isVisibilidadCeldaModificarTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaModificarTipoBancoFormaPago(Boolean isVisibilidadCeldaModificarTipoBancoFormaPago) {
		this.isVisibilidadCeldaModificarTipoBancoFormaPago = isVisibilidadCeldaModificarTipoBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoBancoFormaPago() {
		return isVisibilidadCeldaActualizarTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaActualizarTipoBancoFormaPago(Boolean isVisibilidadCeldaActualizarTipoBancoFormaPago) {
		this.isVisibilidadCeldaActualizarTipoBancoFormaPago = isVisibilidadCeldaActualizarTipoBancoFormaPago;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoBancoFormaPago() {
		return isVisibilidadCeldaEliminarTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaEliminarTipoBancoFormaPago(Boolean isVisibilidadCeldaEliminarTipoBancoFormaPago) {
		this.isVisibilidadCeldaEliminarTipoBancoFormaPago = isVisibilidadCeldaEliminarTipoBancoFormaPago;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoBancoFormaPago() {
		return isVisibilidadCeldaCancelarTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaCancelarTipoBancoFormaPago(Boolean isVisibilidadCeldaCancelarTipoBancoFormaPago) {
		this.isVisibilidadCeldaCancelarTipoBancoFormaPago = isVisibilidadCeldaCancelarTipoBancoFormaPago;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoBancoFormaPago() {
		return isVisibilidadCeldaGuardarTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarTipoBancoFormaPago(Boolean isVisibilidadCeldaGuardarTipoBancoFormaPago) {
		this.isVisibilidadCeldaGuardarTipoBancoFormaPago = isVisibilidadCeldaGuardarTipoBancoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoBancoFormaPago() {
		return isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoBancoFormaPago(Boolean isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago) {
		this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago = isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago;
	}
		
	public TipoBancoFormaPagoSessionBean gettipobancoformapagoSessionBean() {
		return this.tipobancoformapagoSessionBean;
	}
	
	public void settipobancoformapagoSessionBean(TipoBancoFormaPagoSessionBean tipobancoformapagoSessionBean) {
		this.tipobancoformapagoSessionBean=tipobancoformapagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipobancoformapago,null);
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
	
	public void bugActualizarReferenciaActual(TipoBancoFormaPago tipobancoformapago,TipoBancoFormaPago tipobancoformapagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoBancoFormaPago(tipobancoformapago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipobancoformapagoAux.setId(tipobancoformapago.getId());
		tipobancoformapagoAux.setVersionRow(tipobancoformapago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoBancoFormaPago();
		
			int intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipobancoformapagoValidator.getInvalidValues(this.tipobancoformapago);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipobancoformapagoLogic.setDatosCliente(datosCliente);
			tipobancoformapagoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipobancoformapagoAux=new  TipoBancoFormaPago();
				
				tipobancoformapagoAux.setIsNew(true);
				tipobancoformapagoAux.setIsChanged(true);
				
				tipobancoformapagoAux.setTipoBancoFormaPagoOriginal(this.tipobancoformapago);
				
				tipobancoformapagoAux.setId(this.tipobancoformapago.getId());	
				tipobancoformapagoAux.setVersionRow(this.tipobancoformapago.getVersionRow());	
				tipobancoformapagoAux.setid_empresa(this.tipobancoformapago.getid_empresa());	
				tipobancoformapagoAux.setcodigo(this.tipobancoformapago.getcodigo());	
				tipobancoformapagoAux.setnombre(this.tipobancoformapago.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipobancoformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipobancoformapagoAux,tipobancoformapagoLogic.getTipoBancoFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoformapagoAux,tipobancoformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoformapagoLogic.saveTipoBancoFormaPagos();//WithConnection
						//tipobancoformapagoLogic.getSetVersionRowTipoBancoFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipobancoformapago,tipobancoformapagoAux);
					
					this.refrescarForeignKeysDescripcionesTipoBancoFormaPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos().addAll(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagos.addAll(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobancoformapagoLogic.saveTipoBancoFormaPagoRelaciones(tipobancoformapagoAux,this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos());//WithConnection
								//tipobancoformapagoLogic.getSetVersionRowTipoBancoFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipobancoformapago,tipobancoformapagoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagos= new ArrayList<BancoFormaPago>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipobancoformapagoAux.setBancoFormaPagos(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipobancoformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipobancoformapagoAux,tipobancoformapagoLogic.getTipoBancoFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipobancoformapagoAux,tipobancoformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipobancoformapago,tipobancoformapagoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipobancoformapagoAux=new  TipoBancoFormaPago();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipobancoformapagoSessionBean.getEsGuardarRelacionado() && this.tipobancoformapago.getId()>=0)) {
						
					tipobancoformapagoAux.setIsNew(false);
				}
				
				tipobancoformapagoAux.setIsDeleted(false);
			
				tipobancoformapagoAux.setId(this.tipobancoformapago.getId());	
				tipobancoformapagoAux.setVersionRow(this.tipobancoformapago.getVersionRow());	
				tipobancoformapagoAux.setid_empresa(this.tipobancoformapago.getid_empresa());	
				tipobancoformapagoAux.setcodigo(this.tipobancoformapago.getcodigo());	
				tipobancoformapagoAux.setnombre(this.tipobancoformapago.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipobancoformapagoAux,tipobancoformapagoLogic.getTipoBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoformapagoAux,tipobancoformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoformapagoLogic.saveTipoBancoFormaPagos();//WithConnection
						//tipobancoformapagoLogic.getSetVersionRowTipoBancoFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipobancoformapago,tipobancoformapagoAux);
					
					this.refrescarForeignKeysDescripcionesTipoBancoFormaPago();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos().addAll(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagos.addAll(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobancoformapagoLogic.saveTipoBancoFormaPagoRelaciones(tipobancoformapagoAux,this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos());//WithConnection
								//tipobancoformapagoLogic.getSetVersionRowTipoBancoFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipobancoformapago,tipobancoformapagoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagos= new ArrayList<BancoFormaPago>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipobancoformapagoAux.setBancoFormaPagos(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipobancoformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipobancoformapagoAux,tipobancoformapagoLogic.getTipoBancoFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipobancoformapagoAux,tipobancoformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipobancoformapago,tipobancoformapagoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipobancoformapagoAux=new  TipoBancoFormaPago();
				
				tipobancoformapagoAux.setIsNew(false);
				tipobancoformapagoAux.setIsChanged(false);
				
				tipobancoformapagoAux.setIsDeleted(true);
				
				tipobancoformapagoAux.setId(this.tipobancoformapago.getId());	
				tipobancoformapagoAux.setVersionRow(this.tipobancoformapago.getVersionRow());	
				tipobancoformapagoAux.setid_empresa(this.tipobancoformapago.getid_empresa());	
				tipobancoformapagoAux.setcodigo(this.tipobancoformapago.getcodigo());	
				tipobancoformapagoAux.setnombre(this.tipobancoformapago.getnombre());	
				
				if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipobancoformapagoAux.getId()>=0) {	
						this.tipobancoformapagosEliminados.add(tipobancoformapagoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipobancoformapagoAux,tipobancoformapagoLogic.getTipoBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoformapagoAux,tipobancoformapagos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoformapagoLogic.saveTipoBancoFormaPagos();//WithConnection
						//tipobancoformapagoLogic.getSetVersionRowTipoBancoFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos().addAll(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagos.addAll(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipobancoformapagoLogic.saveTipoBancoFormaPagoRelaciones(tipobancoformapagoAux,this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos());//WithConnection
								//tipobancoformapagoLogic.getSetVersionRowTipoBancoFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.setBancoFormaPagos(new ArrayList<BancoFormaPago>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagos= new ArrayList<BancoFormaPago>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipobancoformapagoAux.setBancoFormaPagos(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipobancoformapagoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipobancoformapagoAux,tipobancoformapagoLogic.getTipoBancoFormaPagos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipobancoformapagoAux,tipobancoformapagos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.getTipoBancoFormaPagos().addAll(this.tipobancoformapagosEliminados);
					
					tipobancoformapagoLogic.saveTipoBancoFormaPagos();//WithConnection
					//tipobancoformapagoLogic.getSetVersionRowTipoBancoFormaPagos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoBancoFormaPago();
				
				this.tipobancoformapagosEliminados= new ArrayList<TipoBancoFormaPago>();		
			}
			
			if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Banco Forma Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipobancoformapago=tipobancoformapagoAux;
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
      		//this.finishProcessTipoBancoFormaPago();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoBancoFormaPago tipobancoformapagoLocal) throws Exception {
		
		if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipobancoformapagoLocal.setBancoFormaPagos(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos());
			
			} else {
			
				tipobancoformapagoLocal.setBancoFormaPagos(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoBancoFormaPago tipobancoformapagoLocal) throws Exception {	
		if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipobancoformapagoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoBancoFormaPagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipobancoformapagoValidator.getInvalidValues(this.tipobancoformapago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoBancoFormaPago tipobancoformapago,List<TipoBancoFormaPago> tipobancoformapagos) throws Exception {
		try	{		
			TipoBancoFormaPagoConstantesFunciones.actualizarLista(tipobancoformapago,tipobancoformapagos,this.tipobancoformapagoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoBancoFormaPago tipobancoformapago,List<TipoBancoFormaPago> tipobancoformapagos) throws Exception {
		try	{			
			TipoBancoFormaPagoConstantesFunciones.actualizarSelectedLista(tipobancoformapago,tipobancoformapagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoBancoFormaPago> tipobancoformapagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipobancoformapagosLocal=this.tipobancoformapagoLogic.getTipoBancoFormaPagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipobancoformapagosLocal=this.tipobancoformapagos;
			}
			//ARCHITECTURE
		
			for(TipoBancoFormaPago tipobancoformapagoLocal:tipobancoformapagosLocal) {
				if(this.permiteMantenimiento(tipobancoformapagoLocal) && tipobancoformapagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoBancoFormaPagoConstantesFunciones.getTipoBancoFormaPagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoBancoFormaPagoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelid_empresaTipoBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoBancoFormaPagoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelcodigoTipoBancoFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoBancoFormaPagoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelnombreTipoBancoFormaPago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelid_empresaTipoBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelcodigoTipoBancoFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelnombreTipoBancoFormaPago,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("BancoFormaPago")) {
			if(this.tipobancoformapago==null) {
				this.tipobancoformapago= new TipoBancoFormaPago();
			}

			if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoBancoFormaPago
				this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);

				this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.getbancoformapago().setTipoBancoFormaPago(this.tipobancoformapago);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoBancoFormaPago--;	
		
		
		this.tipobancoformapagoAux=new TipoBancoFormaPago();
		
		this.tipobancoformapagoAux.setId(this.iIdNuevoTipoBancoFormaPago);
		this.tipobancoformapagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipobancoformapagoLogic.getTipoBancoFormaPagos().add(this.tipobancoformapagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipobancoformapagos.add(this.tipobancoformapagoAux);
		}
		//ARCHITECTURE
		
		this.tipobancoformapago=this.tipobancoformapagoAux;
		
		if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoBancoFormaPago(this.tipobancoformapago);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoFormaPago(this.tipobancoformapago);
		}
				
		//this.setDefaultControlesTipoBancoFormaPago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoBancoFormaPago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoBancoFormaPago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBancoFormaPago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoBancoFormaPago(this.tipobancoformapagoBean,this.tipobancoformapago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
			classes=TipoBancoFormaPagoConstantesFunciones.getClassesRelationshipsOfTipoBancoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipobancoformapagoReturnGeneral=tipobancoformapagoLogic.procesarEventosTipoBancoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobancoformapagoLogic.getTipoBancoFormaPagos(),this.tipobancoformapago,this.tipobancoformapagoParameterGeneral,this.isEsNuevoTipoBancoFormaPago,classes);//this.tipobancoformapagoLogic.getTipoBancoFormaPago()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoBancoFormaPago(this.tipobancoformapagoReturnGeneral,this.tipobancoformapagoBean,false);
		
		if(this.tipobancoformapagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoFormaPago(this.tipobancoformapagoReturnGeneral.getTipoBancoFormaPago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoBancoFormaPago(this.tipobancoformapagoReturnGeneral.getTipoBancoFormaPago());
		}
		
		if(this.tipobancoformapagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoBancoFormaPago(this.tipobancoformapagoReturnGeneral.getTipoBancoFormaPago(),classes);//this.tipobancoformapagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoBancoFormaPago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoBancoFormaPago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.RecargarFormTipoBancoFormaPago(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoBancoFormaPago(false);
						
			if(tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.getEsGuardarRelacionado() && BancoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBancoFormaPagoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBancoFormaPago();
			}
			
			this.actualizarVisualTableDatosTipoBancoFormaPago();
			
			this.jTableDatosTipoBancoFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoBancoFormaPago(), this.getIndiceNuevoTipoBancoFormaPago());
			
			this.seleccionarFilaTablaTipoBancoFormaPagoActual();
						
			this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoBancoFormaPago(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextFieldcodigoTipoBancoFormaPago.setEnabled(isHabilitar && this.tipobancoformapagoConstantesFunciones.activarcodigoTipoBancoFormaPago);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextAreanombreTipoBancoFormaPago.setEnabled(isHabilitar && this.tipobancoformapagoConstantesFunciones.activarnombreTipoBancoFormaPago);	
		//
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.setEnabled(isHabilitar && this.tipobancoformapagoConstantesFunciones.activarid_empresaTipoBancoFormaPago);
	};
	
	public void setDefaultControlesTipoBancoFormaPago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoBancoFormaPago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipobancoformapagoSessionBean.setConGuardarRelaciones(true);			
			this.tipobancoformapagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jTabbedPaneRelacionesTipoBancoFormaPago.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipobancoformapagoSessionBean.setConGuardarRelaciones(false);			
			this.tipobancoformapagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jTabbedPaneRelacionesTipoBancoFormaPago.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoBancoFormaPago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
				if(tipobancoformapagoAux.getId().equals(this.iIdNuevoTipoBancoFormaPago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagos) {
				if(tipobancoformapagoAux.getId().equals(this.iIdNuevoTipoBancoFormaPago)) {
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
	
	public int getIndiceActualTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
				if(tipobancoformapagoAux.getId().equals(tipobancoformapago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagos) {
				if(tipobancoformapagoAux.getId().equals(tipobancoformapago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
				if(tipobancoformapagoAux.getTipoBancoFormaPagoOriginal().getId().equals(tipobancoformapagoOriginal.getId())) {
					existe=true;
					tipobancoformapagoOriginal.setId(tipobancoformapagoAux.getId());
					tipobancoformapagoOriginal.setVersionRow(tipobancoformapagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagos) {
				if(tipobancoformapagoAux.getTipoBancoFormaPagoOriginal().getId().equals(tipobancoformapagoOriginal.getId())) {
					existe=true;
					tipobancoformapagoOriginal.setId(tipobancoformapagoAux.getId());
					tipobancoformapagoOriginal.setVersionRow(tipobancoformapagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoBancoFormaPago(Boolean esParaCancelar) throws Exception {
		tipobancoformapagosAux=new ArrayList<TipoBancoFormaPago>();
		tipobancoformapagoAux=new TipoBancoFormaPago();
		
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
					if(tipobancoformapagoAux.getId()<0) {
						tipobancoformapagosAux.add(tipobancoformapagoAux);
					}		
				}
				this.iIdNuevoTipoBancoFormaPago=0L;
				this.tipobancoformapagoLogic.getTipoBancoFormaPagos().removeAll(tipobancoformapagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagos) {
					if(tipobancoformapagoAux.getId()<0) {
						tipobancoformapagosAux.add(tipobancoformapagoAux);
					}		
				}
				this.iIdNuevoTipoBancoFormaPago=0L;
				this.tipobancoformapagos.removeAll(tipobancoformapagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoBancoFormaPago 
					&& this.tipobancoformapagoLogic.getTipoBancoFormaPagos().size()>0
					) {
					tipobancoformapagoAux=this.tipobancoformapagoLogic.getTipoBancoFormaPagos().get(this.tipobancoformapagoLogic.getTipoBancoFormaPagos().size() - 1);
				
					if(tipobancoformapagoAux.getId()<0) {
						this.tipobancoformapagoLogic.getTipoBancoFormaPagos().remove(tipobancoformapagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoBancoFormaPago && this.tipobancoformapagos.size()>0) {
					tipobancoformapagoAux=this.tipobancoformapagos.get(this.tipobancoformapagos.size() - 1);
				
					if(tipobancoformapagoAux.getId()<0) {
						this.tipobancoformapagos.remove(tipobancoformapagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoBancoFormaPago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipobancoformapago.getId()<0) {
				this.tipobancoformapagoLogic.getTipoBancoFormaPagos().remove(this.tipobancoformapago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipobancoformapago.getId()<0) {
				this.tipobancoformapagos.remove(this.tipobancoformapago);
			}
		}			
	}
	
	public void setEstadosInicialesTipoBancoFormaPago(List<TipoBancoFormaPago> tipobancoformapagosAux) throws Exception {
		TipoBancoFormaPagoConstantesFunciones.setEstadosInicialesTipoBancoFormaPago(tipobancoformapagosAux);
	}
	
	public void setEstadosInicialesTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapagoAux) throws Exception {
		TipoBancoFormaPagoConstantesFunciones.setEstadosInicialesTipoBancoFormaPago(tipobancoformapagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoBancoFormaPagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoBancoFormaPagoActual()) {
				if(!this.isEsNuevoTipoBancoFormaPago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoBancoFormaPago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoBancoFormaPagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Banco Forma Pago ?", "MANTENIMIENTO DE Tipo Banco Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoBancoFormaPago tipobancoformapago) throws Exception {
		TipoBancoFormaPagoConstantesFunciones.seleccionarAsignar(this.tipobancoformapago,tipobancoformapago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoBancoFormaPago=this.isPermisoActualizarOriginalTipoBancoFormaPago;
			
			
			this.seleccionarAsignar(tipobancoformapago);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoBancoFormaPagoConstantesFunciones.quitarEspaciosTipoBancoFormaPago(this.tipobancoformapago,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipobancoformapagoSessionBean.setsFuncionBusquedaRapida(this.tipobancoformapagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoBancoFormaPago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoBancoFormaPago(esParaCancelar);				
				this.cancelarNuevoTipoBancoFormaPago(esParaCancelar);								
			}
			
			this.tipobancoformapago=new TipoBancoFormaPago();
			
			this.inicializarTipoBancoFormaPago();
			
			this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoBancoFormaPago() throws Exception {
		try {
			TipoBancoFormaPagoConstantesFunciones.inicializarTipoBancoFormaPago(this.tipobancoformapago);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipobancoformapagoLogic.getTipoBancoFormaPagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoBancoFormaPagos(String sAccionBusqueda,List<TipoBancoFormaPago> tipobancoformapagosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoBancoFormaPago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoBancoFormaPagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoBancoFormaPagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoBancoFormaPago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Banco Forma Pagos");		
		parameters.put("busquedapor", TipoBancoFormaPagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(BancoFormaPago.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoBancoFormaPagoLogic tipobancoformapagoLogicAuxiliar=new TipoBancoFormaPagoLogic();
					tipobancoformapagoLogicAuxiliar.setDatosCliente(tipobancoformapagoLogic.getDatosCliente());				
					tipobancoformapagoLogicAuxiliar.setTipoBancoFormaPagos(tipobancoformapagosParaReportes);
					
					tipobancoformapagoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoBancoFormaPagoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipobancoformapagosParaReportes=tipobancoformapagoLogicAuxiliar.getTipoBancoFormaPagos();
					
					//tipobancoformapagoLogic.getNewConnexionToDeep();
					
					//for (TipoBancoFormaPago tipobancoformapago:tipobancoformapagosParaReportes) {
					//	tipobancoformapagoLogic.deepLoad(tipobancoformapago, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipobancoformapagoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipobancoformapagoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileBancoFormaPago = AuxiliarReportes.class.getResourceAsStream("BancoFormaPagoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_bancoformapago", reportFileBancoFormaPago);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoBancoFormaPago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoBancoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoBancoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoBancoFormaPago=new JRBeanArrayDataSource(TipoBancoFormaPagoJInternalFrame.TraerTipoBancoFormaPagoBeans(tipobancoformapagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoBancoFormaPago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoBancoFormaPagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoBancoFormaPagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoBancoFormaPagoBean.TraerTipoBancoFormaPagoBeans(tipobancoformapagosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipobancoformapagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipobancoformapagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoBancoFormaPagoActionPerformed(null);
					//this.generarExcelReporteTipoBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipobancoformapagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipobancoformapagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipobancoformapagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoBancoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipobancoformapagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoBancoFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBancoFormaPago> tipobancoformapagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoformapago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancoFormaPagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoBancoFormaPago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoBancoFormaPago tipobancoformapago : tipobancoformapagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoBancoFormaPagoConstantesFunciones.generarExcelReporteDataTipoBancoFormaPago("NORMAL",row,workbook,tipobancoformapago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoBancoFormaPago(String sTipo,Row row,Workbook workbook) {
		
		TipoBancoFormaPagoConstantesFunciones.generarExcelReporteHeaderTipoBancoFormaPago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoBancoFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBancoFormaPago> tipobancoformapagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoformapago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancoFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoBancoFormaPago tipobancoformapago : tipobancoformapagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.getTipoBancoFormaPagoDescripcion(tipobancoformapago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobancoformapago.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobancoformapago.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipobancoformapago.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoBancoFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoBancoFormaPago> tipobancoformapagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoBancoFormaPago> tipobancoformapagosRespaldo=null;
		
		classes=TipoBancoFormaPagoConstantesFunciones.getClassesRelationshipsOfTipoBancoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipobancoformapagoLogic.setDatosCliente(this.datosCliente);
		this.tipobancoformapagoLogic.setDatosDeep(this.datosDeep);
		this.tipobancoformapagoLogic.setIsConDeep(true);
		
		tipobancoformapagosRespaldo=this.tipobancoformapagoLogic.getTipoBancoFormaPagos();
		
		this.tipobancoformapagoLogic.setTipoBancoFormaPagos(tipobancoformapagosParaReportes);	
		this.tipobancoformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipobancoformapagosParaReportes=this.tipobancoformapagoLogic.getTipoBancoFormaPagos();
		this.tipobancoformapagoLogic.setTipoBancoFormaPagos(tipobancoformapagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoformapago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoBancoFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoBancoFormaPago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoBancoFormaPago tipobancoformapago : tipobancoformapagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoBancoFormaPago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoBancoFormaPagoConstantesFunciones.generarExcelReporteDataTipoBancoFormaPago("NORMAL",row,workbook,tipobancoformapago,cellStyleDataAux);
		
			
			


				//BancoFormaPago
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipobancoformapago.getBancoFormaPagos()!=null && tipobancoformapago.getBancoFormaPagos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					BancoFormaPagoConstantesFunciones.generarExcelReporteHeaderBancoFormaPago("RELACIONADO",row,workbook);
				}

				if(tipobancoformapago.getBancoFormaPagos()!=null) {
					i2=0;
					for(BancoFormaPago bancoformapago : tipobancoformapago.getBancoFormaPagos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						BancoFormaPagoConstantesFunciones.generarExcelReporteDataBancoFormaPago("RELACIONADO",row,workbook,bancoformapago,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.getTipoBancoFormaPagoDescripcion(tipobancoformapago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoBancoFormaPago() throws Exception {		
		this.startProcessTipoBancoFormaPago(true);
	}
	
	public void startProcessTipoBancoFormaPago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoBancoFormaPago ,this.jPanelParametrosReportesTipoBancoFormaPago, this.jScrollPanelDatosTipoBancoFormaPago,this.jPanelPaginacionTipoBancoFormaPago, this.jScrollPanelDatosEdicionTipoBancoFormaPago, this.jPanelAccionesTipoBancoFormaPago,this.jPanelAccionesFormularioTipoBancoFormaPago,this.jmenuBarTipoBancoFormaPago,this.jmenuBarDetalleTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,this.jTtoolBarDetalleTipoBancoFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoBancoFormaPago=this.jTabbedPaneBusquedasTipoBancoFormaPago; 
		
		final JPanel jPanelParametrosReportesTipoBancoFormaPago=this.jPanelParametrosReportesTipoBancoFormaPago;
		//final JScrollPane jScrollPanelDatosTipoBancoFormaPago=this.jScrollPanelDatosTipoBancoFormaPago;
		final JTable jTableDatosTipoBancoFormaPago=this.jTableDatosTipoBancoFormaPago;		
		final JPanel jPanelPaginacionTipoBancoFormaPago=this.jPanelPaginacionTipoBancoFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionTipoBancoFormaPago=this.jScrollPanelDatosEdicionTipoBancoFormaPago;
		final JPanel jPanelAccionesTipoBancoFormaPago=this.jPanelAccionesTipoBancoFormaPago;
		
		JPanel jPanelCamposAuxiliarTipoBancoFormaPago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoBancoFormaPago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			jPanelCamposAuxiliarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jPanelCamposTipoBancoFormaPago;
			jPanelAccionesFormularioAuxiliarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jPanelAccionesFormularioTipoBancoFormaPago;
		}
		
		final JPanel jPanelCamposTipoBancoFormaPago=jPanelCamposAuxiliarTipoBancoFormaPago;
		final JPanel jPanelAccionesFormularioTipoBancoFormaPago=jPanelAccionesFormularioAuxiliarTipoBancoFormaPago;
		
		
		final JMenuBar jmenuBarTipoBancoFormaPago=this.jmenuBarTipoBancoFormaPago;
		final JToolBar jTtoolBarTipoBancoFormaPago=this.jTtoolBarTipoBancoFormaPago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoBancoFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoBancoFormaPago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			jmenuBarDetalleAuxiliarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jmenuBarDetalleTipoBancoFormaPago;
			jTtoolBarDetalleAuxiliarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jTtoolBarDetalleTipoBancoFormaPago;
		}
		
		final JMenuBar jmenuBarDetalleTipoBancoFormaPago=jmenuBarDetalleAuxiliarTipoBancoFormaPago;
		final JToolBar jTtoolBarDetalleTipoBancoFormaPago=jTtoolBarDetalleAuxiliarTipoBancoFormaPago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoBancoFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoBancoFormaPago;
			processRunnable.jTableDatos=jTableDatosTipoBancoFormaPago;
			processRunnable.jPanelCampos=jPanelCamposTipoBancoFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoBancoFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesTipoBancoFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoBancoFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarTipoBancoFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoBancoFormaPago;
			processRunnable.jTtoolBar=jTtoolBarTipoBancoFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoBancoFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoBancoFormaPago ,jPanelParametrosReportesTipoBancoFormaPago,jTableDatosTipoBancoFormaPago, /*jScrollPanelDatosTipoBancoFormaPago,*/jPanelCamposTipoBancoFormaPago,jPanelPaginacionTipoBancoFormaPago, /*jScrollPanelDatosEdicionTipoBancoFormaPago,*/ jPanelAccionesTipoBancoFormaPago,jPanelAccionesFormularioTipoBancoFormaPago,jmenuBarTipoBancoFormaPago,jmenuBarDetalleTipoBancoFormaPago,jTtoolBarTipoBancoFormaPago,jTtoolBarDetalleTipoBancoFormaPago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoBancoFormaPago ,jPanelParametrosReportesTipoBancoFormaPago, jScrollPanelDatosTipoBancoFormaPago,jPanelPaginacionTipoBancoFormaPago, jScrollPanelDatosEdicionTipoBancoFormaPago, jPanelAccionesTipoBancoFormaPago,jPanelAccionesFormularioTipoBancoFormaPago,jmenuBarTipoBancoFormaPago,jmenuBarDetalleTipoBancoFormaPago,jTtoolBarTipoBancoFormaPago,jTtoolBarDetalleTipoBancoFormaPago);
						
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
	
	public void finishProcessTipoBancoFormaPago() {// throws Exception 
		this.finishProcessTipoBancoFormaPago(true);
	}
	
	public void finishProcessTipoBancoFormaPago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoBancoFormaPago ,this.jPanelParametrosReportesTipoBancoFormaPago, this.jScrollPanelDatosTipoBancoFormaPago,this.jPanelPaginacionTipoBancoFormaPago, this.jScrollPanelDatosEdicionTipoBancoFormaPago, this.jPanelAccionesTipoBancoFormaPago,this.jPanelAccionesFormularioTipoBancoFormaPago,this.jmenuBarTipoBancoFormaPago,this.jmenuBarDetalleTipoBancoFormaPago,this.jTtoolBarTipoBancoFormaPago,this.jTtoolBarDetalleTipoBancoFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoBancoFormaPago=this.jTabbedPaneBusquedasTipoBancoFormaPago; 
		
		final JPanel jPanelParametrosReportesTipoBancoFormaPago=this.jPanelParametrosReportesTipoBancoFormaPago;
		//final JScrollPane jScrollPanelDatosTipoBancoFormaPago=this.jScrollPanelDatosTipoBancoFormaPago;
		final JTable jTableDatosTipoBancoFormaPago=this.jTableDatosTipoBancoFormaPago;		
		final JPanel jPanelPaginacionTipoBancoFormaPago=this.jPanelPaginacionTipoBancoFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionTipoBancoFormaPago=this.jScrollPanelDatosEdicionTipoBancoFormaPago;
		final JPanel jPanelAccionesTipoBancoFormaPago=this.jPanelAccionesTipoBancoFormaPago;
		
		JPanel jPanelCamposAuxiliarTipoBancoFormaPago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoBancoFormaPago=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			jPanelCamposAuxiliarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jPanelCamposTipoBancoFormaPago;
			jPanelAccionesFormularioAuxiliarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jPanelAccionesFormularioTipoBancoFormaPago;
		}
		
		final JPanel jPanelCamposTipoBancoFormaPago=jPanelCamposAuxiliarTipoBancoFormaPago;
		final JPanel jPanelAccionesFormularioTipoBancoFormaPago=jPanelAccionesFormularioAuxiliarTipoBancoFormaPago;
		
		
		final JMenuBar jmenuBarTipoBancoFormaPago=this.jmenuBarTipoBancoFormaPago;		
		final JToolBar jTtoolBarTipoBancoFormaPago=this.jTtoolBarTipoBancoFormaPago;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoBancoFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoBancoFormaPago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			jmenuBarDetalleAuxiliarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jmenuBarDetalleTipoBancoFormaPago;
			jTtoolBarDetalleAuxiliarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jTtoolBarDetalleTipoBancoFormaPago;		
		}
		
		final JMenuBar jmenuBarDetalleTipoBancoFormaPago=jmenuBarDetalleAuxiliarTipoBancoFormaPago;
		final JToolBar jTtoolBarDetalleTipoBancoFormaPago=jTtoolBarDetalleAuxiliarTipoBancoFormaPago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoBancoFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoBancoFormaPago;
			processRunnable.jTableDatos=jTableDatosTipoBancoFormaPago;
			processRunnable.jPanelCampos=jPanelCamposTipoBancoFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoBancoFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesTipoBancoFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoBancoFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarTipoBancoFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoBancoFormaPago;
			processRunnable.jTtoolBar=jTtoolBarTipoBancoFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoBancoFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoBancoFormaPago ,jPanelParametrosReportesTipoBancoFormaPago, jTableDatosTipoBancoFormaPago,/*jScrollPanelDatosTipoBancoFormaPago,*/jPanelCamposTipoBancoFormaPago,jPanelPaginacionTipoBancoFormaPago, /*jScrollPanelDatosEdicionTipoBancoFormaPago,*/ jPanelAccionesTipoBancoFormaPago,jPanelAccionesFormularioTipoBancoFormaPago,jmenuBarTipoBancoFormaPago,jmenuBarDetalleTipoBancoFormaPago,jTtoolBarTipoBancoFormaPago,jTtoolBarDetalleTipoBancoFormaPago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoBancoFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoBancoFormaPago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoBancoFormaPago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoBancoFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoBancoFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoBancoFormaPago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoBancoFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoBancoFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoBancoFormaPago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipobancoformapagoConstantesFunciones.getsFinalQueryTipoBancoFormaPago();
		String  finalQueryPaginacionTodos=this.tipobancoformapagoConstantesFunciones.getsFinalQueryTipoBancoFormaPago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoBancoFormaPagoConstantesFunciones.getArrayColumnasGlobalesNoTipoBancoFormaPago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoBancoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoBancoFormaPago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoBancoFormaPagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipobancoformapagosEliminados= new ArrayList<TipoBancoFormaPago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoBancoFormaPago();
		
				///*TipoBancoFormaPagoSessionBean*/this.tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
			
			if(this.tipobancoformapagoSessionBean==null) {
				this.tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
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
					this.iNumeroPaginacion=TipoBancoFormaPagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoBancoFormaPagoConstantesFunciones.getClassesForeignKeysOfTipoBancoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipobancoformapago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipobancoformapagosAux= new ArrayList<TipoBancoFormaPago>();
			
				
			tipobancoformapagoLogic.setDatosCliente(this.datosCliente);
			tipobancoformapagoLogic.setDatosDeep(this.datosDeep);
			tipobancoformapagoLogic.setIsConDeep(true);
			
			
			tipobancoformapagoLogic.getTipoBancoFormaPagoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipobancoformapagoLogic.getTodosTipoBancoFormaPagos(finalQueryGlobal,pagination);
					
					//tipobancoformapagoLogic.getTodosTipoBancoFormaPagosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipobancoformapagoLogic.getTipoBancoFormaPagos()==null|| tipobancoformapagoLogic.getTipoBancoFormaPagos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancoformapagosAux= new ArrayList<TipoBancoFormaPago>();
							tipobancoformapagosAux.addAll(tipobancoformapagoLogic.getTipoBancoFormaPagos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoformapagosAux= new ArrayList<TipoBancoFormaPago>();
							tipobancoformapagosAux.addAll(tipobancoformapagos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancoformapagoLogic.getTodosTipoBancoFormaPagos(finalQueryGlobal+"",this.pagination);												
							
							//tipobancoformapagoLogic.getTodosTipoBancoFormaPagosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoBancoFormaPagos("Todos",tipobancoformapagoLogic.getTipoBancoFormaPagos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipobancoformapagoLogic.setTipoBancoFormaPagos(new ArrayList<TipoBancoFormaPago>());					
							tipobancoformapagoLogic.getTipoBancoFormaPagos().addAll(tipobancoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoformapagos=new ArrayList<TipoBancoFormaPago>();
							tipobancoformapagos.addAll(tipobancoformapagosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoBancoFormaPago=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoBancoFormaPago=this.idActual;
				
				} else if(this.idTipoBancoFormaPagoActual!=null && this.idTipoBancoFormaPagoActual!=0L) {
					idTipoBancoFormaPago=idTipoBancoFormaPagoActual;
				}
				
					
				this.sDetalleReporte=TipoBancoFormaPagoConstantesFunciones.getDetalleIndicePorId(idTipoBancoFormaPago);
				
				this.tipobancoformapagos=new ArrayList<TipoBancoFormaPago>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipobancoformapagoLogic.getEntity(idTipoBancoFormaPago);
					
					//tipobancoformapagoLogic.getEntityWithConnection(idTipoBancoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoformapagoLogic.setTipoBancoFormaPagos(new ArrayList<TipoBancoFormaPago>());
					tipobancoformapagoLogic.getTipoBancoFormaPagos().add(tipobancoformapagoLogic.getTipoBancoFormaPago());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobancoformapagos=new ArrayList<TipoBancoFormaPago>();
					this.tipobancoformapagos.add(tipobancoformapago);
				}
				
				if(tipobancoformapagoLogic.getTipoBancoFormaPago()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoBancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipobancoformapagoLogic.getTipoBancoFormaPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipobancoformapagoLogic.getTipoBancoFormaPagos()==null||tipobancoformapagoLogic.getTipoBancoFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipobancoformapagos==null|| tipobancoformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoformapagosAux=new ArrayList<TipoBancoFormaPago>();
						tipobancoformapagosAux.addAll(tipobancoformapagoLogic.getTipoBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoformapagosAux=new ArrayList<TipoBancoFormaPago>();
							tipobancoformapagosAux.addAll(tipobancoformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipobancoformapagoLogic.getTipoBancoFormaPagosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoBancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoBancoFormaPagoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoBancoFormaPagos("FK_IdEmpresa",tipobancoformapagoLogic.getTipoBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoBancoFormaPagos("FK_IdEmpresa",tipobancoformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoformapagoLogic.setTipoBancoFormaPagos(new ArrayList<TipoBancoFormaPago>());
						tipobancoformapagoLogic.getTipoBancoFormaPagos().addAll(tipobancoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoformapagos=new ArrayList<TipoBancoFormaPago>();
							tipobancoformapagos.addAll(tipobancoformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoBancoFormaPago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoBancoFormaPago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipobancoformapagoLogic.getTipoBancoFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancoformapagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipobancoformapagoLogic.getTipoBancoFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipobancoformapagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoBancoFormaPago tipobancoformapago) {
		Boolean permite=true;
		
		if(this.tipobancoformapago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoBancoFormaPagoConstantesFunciones.getOrderByListaTipoBancoFormaPago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoBancoFormaPagoConstantesFunciones.getOrderByListaTipoBancoFormaPago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoFormaPago tipobancoformapago:tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
				if(tipobancoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoformapagoTotales=tipobancoformapago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoFormaPago tipobancoformapago:this.tipobancoformapagos) {
				if(tipobancoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoformapagoTotales=tipobancoformapago;
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
			this.tipobancoformapagoAux=new TipoBancoFormaPago();
			this.tipobancoformapagoAux.setsType(Constantes2.S_TOTALES);
			this.tipobancoformapagoAux.setIsNew(false);
			this.tipobancoformapagoAux.setIsChanged(false);
			this.tipobancoformapagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoBancoFormaPagoConstantesFunciones.TotalizarValoresFilaTipoBancoFormaPago(this.tipobancoformapagoLogic.getTipoBancoFormaPagos(),this.tipobancoformapagoAux);
				
				this.tipobancoformapagoLogic.getTipoBancoFormaPagos().add(this.tipobancoformapagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoBancoFormaPagoConstantesFunciones.TotalizarValoresFilaTipoBancoFormaPago(this.tipobancoformapagos,this.tipobancoformapagoAux);
				
				this.tipobancoformapagos.add(this.tipobancoformapagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipobancoformapagoTotales=new TipoBancoFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipobancoformapagoLogic.getTipoBancoFormaPagos().remove(tipobancoformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipobancoformapagos.remove(tipobancoformapagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipobancoformapagoTotales=new TipoBancoFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoBancoFormaPago tipobancoformapago:tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
				if(tipobancoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoformapagoTotales=tipobancoformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoBancoFormaPagoConstantesFunciones.TotalizarValoresFilaTipoBancoFormaPago(this.tipobancoformapagoLogic.getTipoBancoFormaPagos(),tipobancoformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoBancoFormaPago tipobancoformapago:this.tipobancoformapagos) {
				if(tipobancoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipobancoformapagoTotales=tipobancoformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoBancoFormaPagoConstantesFunciones.TotalizarValoresFilaTipoBancoFormaPago(this.tipobancoformapagos,tipobancoformapagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoBancoFormaPagosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoBancoFormaPagosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoformapagoLogic.getTipoBancoFormaPagosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoBancoFormaPago() {
		this.isPermisoTodoTipoBancoFormaPago=false;
		this.isPermisoNuevoTipoBancoFormaPago=false;
		this.isPermisoActualizarTipoBancoFormaPago=false;
		this.isPermisoActualizarOriginalTipoBancoFormaPago=false;
		this.isPermisoEliminarTipoBancoFormaPago=false;
		this.isPermisoGuardarCambiosTipoBancoFormaPago=false;
		this.isPermisoConsultaTipoBancoFormaPago=false;
		this.isPermisoBusquedaTipoBancoFormaPago=false;
		this.isPermisoReporteTipoBancoFormaPago=false;		
		this.isPermisoOrdenTipoBancoFormaPago=false;		
		this.isPermisoPaginacionMedioTipoBancoFormaPago=false;		
		this.isPermisoPaginacionAltoTipoBancoFormaPago=false;
		this.isPermisoPaginacionTodoTipoBancoFormaPago=false;
		this.isPermisoCopiarTipoBancoFormaPago=false;		
		this.isPermisoVerFormTipoBancoFormaPago=false;		
		this.isPermisoDuplicarTipoBancoFormaPago=false;		
		this.isPermisoOrdenTipoBancoFormaPago=false;		
	}
	
	public void setPermisosUsuarioTipoBancoFormaPago(Boolean isPermiso) {
		this.isPermisoTodoTipoBancoFormaPago=isPermiso;
		this.isPermisoNuevoTipoBancoFormaPago=isPermiso;
		this.isPermisoActualizarTipoBancoFormaPago=isPermiso;
		this.isPermisoActualizarOriginalTipoBancoFormaPago=isPermiso;
		this.isPermisoEliminarTipoBancoFormaPago=isPermiso;
		this.isPermisoGuardarCambiosTipoBancoFormaPago=isPermiso;
		this.isPermisoConsultaTipoBancoFormaPago=isPermiso;
		this.isPermisoBusquedaTipoBancoFormaPago=isPermiso;
		this.isPermisoReporteTipoBancoFormaPago=isPermiso;
		this.isPermisoOrdenTipoBancoFormaPago=isPermiso;		
		this.isPermisoPaginacionMedioTipoBancoFormaPago=isPermiso;		
		this.isPermisoPaginacionAltoTipoBancoFormaPago=isPermiso;		
		this.isPermisoPaginacionTodoTipoBancoFormaPago=isPermiso;		
		this.isPermisoCopiarTipoBancoFormaPago=isPermiso;		
		this.isPermisoVerFormTipoBancoFormaPago=isPermiso;		
		this.isPermisoDuplicarTipoBancoFormaPago=isPermiso;
		this.isPermisoOrdenTipoBancoFormaPago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoBancoFormaPago(Boolean isPermiso) {
		//this.isPermisoTodoTipoBancoFormaPago=isPermiso;
		this.isPermisoNuevoTipoBancoFormaPago=isPermiso;
		this.isPermisoActualizarTipoBancoFormaPago=isPermiso;
		this.isPermisoActualizarOriginalTipoBancoFormaPago=isPermiso;
		this.isPermisoEliminarTipoBancoFormaPago=isPermiso;
		this.isPermisoGuardarCambiosTipoBancoFormaPago=isPermiso;
		//this.isPermisoConsultaTipoBancoFormaPago=isPermiso;
		//this.isPermisoBusquedaTipoBancoFormaPago=isPermiso;
		//this.isPermisoReporteTipoBancoFormaPago=isPermiso;
		//this.isPermisoOrdenTipoBancoFormaPago=isPermiso;		
		//this.isPermisoPaginacionMedioTipoBancoFormaPago=isPermiso;		
		//this.isPermisoPaginacionAltoTipoBancoFormaPago=isPermiso;		
		//this.isPermisoPaginacionTodoTipoBancoFormaPago=isPermiso;		
		//this.isPermisoCopiarTipoBancoFormaPago=isPermiso;		
		//this.isPermisoDuplicarTipoBancoFormaPago=isPermiso;
		//this.isPermisoOrdenTipoBancoFormaPago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoBancoFormaPagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(BancoFormaPagoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoBancoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosBancoFormaPago=false;
		this.isTienePermisosBancoFormaPago=this.verificarGetPermisosUsuarioOpcionTipoBancoFormaPagoClaseRelacionada(this.opcionsRelacionadas,BancoFormaPagoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoBancoFormaPago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoBancoFormaPagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosBancoFormaPago=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoBancoFormaPagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoBancoFormaPagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoBancoFormaPagoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosBancoFormaPago && this.jInternalFrameDetalleFormTipoBancoFormaPago!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jTabbedPaneRelacionesTipoBancoFormaPago.remove(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoBancoFormaPago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoBancoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoBancoFormaPagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoBancoFormaPago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoBancoFormaPago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoBancoFormaPago=this.isPermisoActualizarTipoBancoFormaPago;
			this.isPermisoEliminarTipoBancoFormaPago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoBancoFormaPago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoBancoFormaPago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoBancoFormaPago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoBancoFormaPago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoBancoFormaPago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoBancoFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoBancoFormaPago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoBancoFormaPago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoBancoFormaPago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoBancoFormaPago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoBancoFormaPago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoBancoFormaPago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoBancoFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoBancoFormaPago.setToolTipText(this.jTableDatosTipoBancoFormaPago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoBancoFormaPago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoBancoFormaPago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoBancoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoBancoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoBancoFormaPago() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosBancoFormaPago && this.tipobancoformapagoConstantesFunciones.mostrarBancoFormaPagoTipoBancoFormaPago && !TipoBancoFormaPagoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Banco Forma Pago");
			reporte.setsDescripcion("Banco Forma Pago");
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
	public void inicializarCombosForeignKeyTipoBancoFormaPagoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoBancoFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoBancoFormaPagoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoBancoFormaPagoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoBancoFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoBancoFormaPagoParameterReturnGeneral tipobancoformapagoReturnGeneral=new TipoBancoFormaPagoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipobancoformapagoConstantesFunciones.cargarid_empresaTipoBancoFormaPago)
					 || (this.esRecargarFks && this.tipobancoformapagoConstantesFunciones.cargarid_empresaTipoBancoFormaPago)) {

					if(!this.tipobancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipobancoformapagoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipobancoformapagoReturnGeneral=tipobancoformapagoLogic.cargarCombosLoteForeignKeyTipoBancoFormaPago(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipobancoformapagoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoBancoFormaPago()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipobancoformapagoSessionBean==null) {
				this.tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
			}

			if(!this.tipobancoformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoBancoFormaPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoBancoFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoBancoFormaPago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBancoFormaPago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoBancoFormaPago()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoBancoFormaPago()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoBancoFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoBancoFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoBancoFormaPago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoBancoFormaPago()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoBancoFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoBancoFormaPago()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoBancoFormaPagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoBancoFormaPagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoBancoFormaPagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean(); 
		this.tipobancoformapagoConstantesFunciones=new TipoBancoFormaPagoConstantesFunciones(); 
		this.tipobancoformapagoBean=new TipoBancoFormaPago();//(this.tipobancoformapagoConstantesFunciones); 		
		this.tipobancoformapagoReturnGeneral=new TipoBancoFormaPagoParameterReturnGeneral(); 
		
		this.tipobancoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipobancoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoBancoFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoBancoFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoBancoFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoBancoFormaPago(true);
			
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
			
			this.tipobancoformapagoConstantesFunciones=new TipoBancoFormaPagoConstantesFunciones(); 
			this.tipobancoformapagoBean=new TipoBancoFormaPago();//this.tipobancoformapagoConstantesFunciones); 			
			this.tipobancoformapagoReturnGeneral=new TipoBancoFormaPagoParameterReturnGeneral(); 
		
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Banco Forma Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipobancoformapago=new TipoBancoFormaPago();
			this.tipobancoformapagos = new ArrayList<TipoBancoFormaPago>();
			this.tipobancoformapagosAux = new ArrayList<TipoBancoFormaPago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic=new TipoBancoFormaPagoLogic();
				this.tipobancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipobancoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipobancoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoBancoFormaPago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoBancoFormaPago);	
					}
					
					if(this.jInternalFrameImportacionTipoBancoFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoBancoFormaPago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoBancoFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoBancoFormaPago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoBancoFormaPago);
				this.jInternalFrameDetalleFormTipoBancoFormaPago.setVisible(false);
				this.jInternalFrameDetalleFormTipoBancoFormaPago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoBancoFormaPago);
					this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoBancoFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoBancoFormaPago);
					this.jInternalFrameImportacionTipoBancoFormaPago.setVisible(false);
					this.jInternalFrameImportacionTipoBancoFormaPago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoBancoFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoBancoFormaPago);
					this.jInternalFrameOrderByTipoBancoFormaPago.setVisible(false);
					this.jInternalFrameOrderByTipoBancoFormaPago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoBancoFormaPagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoBancoFormaPagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipobancoformapagoReturnGeneral=new TipoBancoFormaPagoParameterReturnGeneral();
			
			this.tipobancoformapagoParameterGeneral=new TipoBancoFormaPagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipobancoformapagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoBancoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(BancoFormaPagoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoBancoFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipobancoformapagoSessionBean.getEsGuardarRelacionado(),this.tipobancoformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoBancoFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipobancoformapagoSessionBean.getEsGuardarRelacionado(),this.tipobancoformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=false;
			this.isVisibilidadCeldaDuplicarTipoBancoFormaPago=true;
			this.isVisibilidadCeldaCopiarTipoBancoFormaPago=true;
			this.isVisibilidadCeldaVerFormTipoBancoFormaPago=true;
			this.isVisibilidadCeldaOrdenTipoBancoFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=false;
			this.isVisibilidadCeldaModificarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoBancoFormaPago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoBancoFormaPago(false);
			
			this.setPermisosUsuarioTipoBancoFormaPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipobancoformapagoSessionBean.getEsGuardarRelacionado() && this.tipobancoformapagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoBancoFormaPagoClasesRelacionadas();
			}
			
			if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoBancoFormaPagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoBancoFormaPago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoBancoFormaPago();
			}
			
			if(!this.isPermisoBusquedaTipoBancoFormaPago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoBancoFormaPago,this.isPermisoPaginacionMedioTipoBancoFormaPago,this.isPermisoPaginacionTodoTipoBancoFormaPago);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoBancoFormaPagoConstantesFunciones.getTiposSeleccionarTipoBancoFormaPago());
				
				this.tiposColumnasSelect=TipoBancoFormaPagoConstantesFunciones.getTiposSeleccionarTipoBancoFormaPago(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoBancoFormaPago();				
				//this.tiposRelacionesSelect=TipoBancoFormaPagoConstantesFunciones.getTiposRelacionesTipoBancoFormaPago(true);
				
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
			//if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoBancoFormaPago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoBancoFormaPago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoBancoFormaPago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoFormaPago() ;
			
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
			
			
			this.bancoformapagoLogic=new BancoFormaPagoLogic(); 
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
				tipobancoformapagoImplementable= (TipoBancoFormaPagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoBancoFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipobancoformapagoImplementableHome= (TipoBancoFormaPagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoBancoFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipobancoformapagos= new ArrayList<TipoBancoFormaPago>();
			this.tipobancoformapagosEliminados= new ArrayList<TipoBancoFormaPago>();
						
			this.isEsNuevoTipoBancoFormaPago=false;
			this.esParaAccionDesdeFormularioTipoBancoFormaPago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoBancoFormaPago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoBancoFormaPago();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoBancoFormaPagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoBancoFormaPago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoBancoFormaPago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoBancoFormaPago();
			}
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoBancoFormaPago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoBancoFormaPago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoBancoFormaPago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoBancoFormaPago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoBancoFormaPago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoBancoFormaPago() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoBancoFormaPago")) {
				iIndex=this.jInternalFrameDetalleFormTipoBancoFormaPago.jTabbedPaneRelacionesTipoBancoFormaPago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoBancoFormaPago.jTabbedPaneRelacionesTipoBancoFormaPago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();	
				
				

				if(sTitle.equals("Banco Forma Pagos")) {
					if(!BancoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoBancoFormaPago();

						this.cargarParteTabPanelRelacionadaBancoFormaPago(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoBancoFormaPago();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaBancoFormaPago(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoBancoFormaPago.cargarSessionConBeanSwingJInternalFrameBancoFormaPago(false,true,iIndex);
		this.jButtonBancoFormaPagoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaBancoFormaPago();

		//this.jTabbedPaneRelacionesTipoBancoFormaPago.updateUI();
		//this.jTabbedPaneRelacionesTipoBancoFormaPago.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoBancoFormaPago.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("BancoFormaPago")) {
				int row=this.jTableDatosTipoBancoFormaPago.getSelectedRow();
				jButtonBancoFormaPagoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Banco Forma Pago")) {

					if(this.isTienePermisosBancoFormaPago && this.tipobancoformapagoConstantesFunciones.mostrarBancoFormaPagoTipoBancoFormaPago && !TipoBancoFormaPagoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Banco Forma Pagos"+"("+BancoFormaPagoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Banco Forma Pagos");

						if(tipobancoformapagoConstantesFunciones.resaltarBancoFormaPagoTipoBancoFormaPago!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipobancoformapagoConstantesFunciones.resaltarBancoFormaPagoTipoBancoFormaPago);
						}

						jmenuItem.setEnabled(this.tipobancoformapagoConstantesFunciones.activarBancoFormaPagoTipoBancoFormaPago);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"BancoFormaPago"));

						

						this.jInternalFrameDetalleFormTipoBancoFormaPago.jmenuDetalleTipoBancoFormaPago.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoBancoFormaPago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoBancoFormaPago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoBancoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoBancoFormaPagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoBancoFormaPago();
		
		this.cargarCombosFrameForeignKeyTipoBancoFormaPago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoBancoFormaPago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoBancoFormaPago();
		}
	}
	
	
	
	public void jButtonNuevoTipoBancoFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
			
			if(jTableDatosTipoBancoFormaPago.getRowCount()>=1) {
				jTableDatosTipoBancoFormaPago.removeRowSelectionInterval(0, jTableDatosTipoBancoFormaPago.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoBancoFormaPago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoBancoFormaPago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoBancoFormaPago(true);			
			//this.tipobancoformapago=new TipoBancoFormaPago();
			//this.tipobancoformapago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBancoFormaPago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoFormaPago() ;
			
			if(TipoBancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBancoFormaPago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipobancoformapago);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);				
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
			if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoBancoFormaPago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoBancoFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoBancoFormaPago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoBancoFormaPago.getSelectedRows().length;			
			}
			
			tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoBancoFormaPago--;			
				//TipoBancoFormaPago tipobancoformapagoAux= new TipoBancoFormaPago();			
				//tipobancoformapagoAux.setId(this.iIdNuevoTipoBancoFormaPago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoBancoFormaPago tipobancoformapagoOrigen=new TipoBancoFormaPago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoBancoFormaPago tipobancoformapagoOrigen : tipobancoformapagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipobancoformapagoOrigen =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipobancoformapagoOrigen =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoBancoFormaPago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipobancoformapago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoBancoFormaPago(tipobancoformapagoOrigen,this.tipobancoformapago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipobancoformapagoLogic.getTipoBancoFormaPagos().add(this.tipobancoformapagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipobancoformapagos.add(this.tipobancoformapagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
				
				this.jTableDatosTipoBancoFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoBancoFormaPago(), this.getIndiceNuevoTipoBancoFormaPago());
				
				int iLastRow =  this.jTableDatosTipoBancoFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoBancoFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoBancoFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();									
		
			TipoBancoFormaPago tipobancoformapagoOrigen=new TipoBancoFormaPago();
			TipoBancoFormaPago tipobancoformapagoDestino=new TipoBancoFormaPago();
				
			tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoBancoFormaPago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipobancoformapagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoBancoFormaPago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoformapagoOrigen =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipobancoformapagoOrigen =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipobancoformapagoDestino =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipobancoformapagoDestino =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipobancoformapagoOrigen =tipobancoformapagosSeleccionados.get(0);
				tipobancoformapagoDestino =tipobancoformapagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoBancoFormaPago(tipobancoformapagoOrigen,tipobancoformapagoDestino,true,false);
				
				tipobancoformapagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipobancoformapagoDestino,tipobancoformapagoLogic.getTipoBancoFormaPagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipobancoformapagoDestino,tipobancoformapagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
				
				//this.jTableDatosTipoBancoFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoBancoFormaPago(), this.getIndiceNuevoTipoBancoFormaPago());
				
				int iLastRow =  this.jTableDatosTipoBancoFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoBancoFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoBancoFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoBancoFormaPago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoBancoFormaPago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoBancoFormaPago.setVisible(!isVisible);
			this.jPanelPaginacionTipoBancoFormaPago.setVisible(!isVisible);
			this.jPanelAccionesTipoBancoFormaPago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoBancoFormaPago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoBancoFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoBancoFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoBancoFormaPago();
			
			this.abrirFrameOrderByTipoBancoFormaPago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoBancoFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoBancoFormaPago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoBancoFormaPago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoBancoFormaPago.isMaximum()) {
					this.jInternalFrameDetalleFormTipoBancoFormaPago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoBancoFormaPago.setSize(this.jInternalFrameDetalleFormTipoBancoFormaPago.iWidthFormulario,this.jInternalFrameDetalleFormTipoBancoFormaPago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoBancoFormaPago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoBancoFormaPago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoBancoFormaPago.isMaximum()) {
						this.jInternalFrameDetalleFormTipoBancoFormaPago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoBancoFormaPago.jContentPaneDetalleTipoBancoFormaPago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoBancoFormaPago.jTabbedPaneRelacionesTipoBancoFormaPago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoBancoFormaPago.jContentPaneDetalleTipoBancoFormaPago.getWidth(),TipoBancoFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoBancoFormaPago.jTabbedPaneRelacionesTipoBancoFormaPago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoBancoFormaPago.jContentPaneDetalleTipoBancoFormaPago.getWidth(),TipoBancoFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoBancoFormaPago.jTabbedPaneRelacionesTipoBancoFormaPago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoBancoFormaPago.jContentPaneDetalleTipoBancoFormaPago.getWidth(),TipoBancoFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(BancoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaBancoFormaPago();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoBancoFormaPago.setVisible(true);
	        this.jInternalFrameDetalleFormTipoBancoFormaPago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoBancoFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoBancoFormaPago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoBancoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoFormaPago,false,this);
				} else {
					this.jInternalFrameOrderByTipoBancoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoBancoFormaPago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoBancoFormaPago);
				this.jInternalFrameOrderByTipoBancoFormaPago.setVisible(false);
				this.jInternalFrameOrderByTipoBancoFormaPago.setSelected(false);
				
				this.jInternalFrameOrderByTipoBancoFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoBancoFormaPago"));
				
				this.inicializarActualizarBindingTablaOrderByTipoBancoFormaPago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoBancoFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoBancoFormaPago==null) {
				
				this.jInternalFrameImportacionTipoBancoFormaPago=new ImportacionJInternalFrame(TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoBancoFormaPago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoBancoFormaPago);
				this.jInternalFrameImportacionTipoBancoFormaPago.setVisible(false);
				this.jInternalFrameImportacionTipoBancoFormaPago.setSelected(false);


				this.jInternalFrameImportacionTipoBancoFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoBancoFormaPago"));
				this.jInternalFrameImportacionTipoBancoFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoBancoFormaPago"));
				this.jInternalFrameImportacionTipoBancoFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoBancoFormaPago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoBancoFormaPago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago==null) {
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago=new ReporteDinamicoJInternalFrame(TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoBancoFormaPago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoBancoFormaPago);
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBancoFormaPago"));
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBancoFormaPago"));
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBancoFormaPago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBancoFormaPago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaBancoFormaPago() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.jScrollPanelDatosBancoFormaPago.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoBancoFormaPago.jContentPaneDetalleTipoBancoFormaPago.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.jScrollPanelDatosBancoFormaPago.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.jScrollPanelDatosBancoFormaPago.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.jScrollPanelDatosBancoFormaPago.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoBancoFormaPago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoBancoFormaPago);
			
	       	this.jInternalFrameDetalleFormTipoBancoFormaPago.setVisible(false);
	        this.jInternalFrameDetalleFormTipoBancoFormaPago.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoBancoFormaPago.dispose();
			//this.jInternalFrameDetalleFormTipoBancoFormaPago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoBancoFormaPago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoBancoFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoBancoFormaPago.setVisible(true);
	        this.jInternalFrameImportacionTipoBancoFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoBancoFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoBancoFormaPago.setVisible(true);
	        this.jInternalFrameOrderByTipoBancoFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoBancoFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoBancoFormaPago.setVisible(false);
	        this.jInternalFrameOrderByTipoBancoFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoBancoFormaPago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoBancoFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoBancoFormaPago.setVisible(false);
	        this.jInternalFrameImportacionTipoBancoFormaPago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoBancoFormaPago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoBancoFormaPago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoBancoFormaPago(true);
			//this.isEsNuevoTipoBancoFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBancoFormaPago(false) ;
			
			if(tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.getEsGuardarRelacionado() && BancoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonBancoFormaPagoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoBancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBancoFormaPago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoBancoFormaPagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoBancoFormaPago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoBancoFormaPago(true);
			//this.isEsNuevoTipoBancoFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipobancoformapago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoBancoFormaPago(false) ;
			
			if(TipoBancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoBancoFormaPago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoBancoFormaPago(false);
			
			//if(!this.isEsNuevoTipoBancoFormaPago) {								
				int intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
				
			}
			
			if(this.permiteMantenimiento(this.tipobancoformapago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoBancoFormaPago=true;
					this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
					this.isEsNuevoTipoBancoFormaPago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoBancoFormaPago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoBancoFormaPago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoBancoFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBancoFormaPago(false);
				
				this.habilitarDeshabilitarControlesTipoBancoFormaPago(false);
			
												
				
				if(TipoBancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoBancoFormaPago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,tipobancoformapagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoBancoFormaPago(this.tipobancoformapago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoBancoFormaPago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipobancoformapagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipobancoformapago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.tipobancoformapago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.tipobancoformapago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipobancoformapago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoBancoFormaPagoModel) this.jTableDatosTipoBancoFormaPago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoBancoFormaPago=true;
				this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
				this.isEsNuevoTipoBancoFormaPago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoBancoFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBancoFormaPago(false);
				
				this.habilitarDeshabilitarControlesTipoBancoFormaPago(false);
				
				
				
				if(TipoBancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoBancoFormaPago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoBancoFormaPago.getRowCount()>=1) {
				jTableDatosTipoBancoFormaPago.removeRowSelectionInterval(0, jTableDatosTipoBancoFormaPago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoBancoFormaPago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoBancoFormaPago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoBancoFormaPago(false) ;
			
			this.isEsNuevoTipoBancoFormaPago=false;
			
			if(TipoBancoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoBancoFormaPago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoBancoFormaPago(false);
				
				//SI ES MANUAL
				if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoBancoFormaPago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoBancoFormaPago--;			
			//TipoBancoFormaPago tipobancoformapagoAux= new TipoBancoFormaPago();			
			//tipobancoformapagoAux.setId(this.iIdNuevoTipoBancoFormaPago);
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoBancoFormaPago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
			
			this.tipobancoformapago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipobancoformapagoLogic.getTipoBancoFormaPagos().add(this.tipobancoformapagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipobancoformapagos.add(this.tipobancoformapagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
			
			this.jTableDatosTipoBancoFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoBancoFormaPago(), this.getIndiceNuevoTipoBancoFormaPago());
			
			int iLastRow =  this.jTableDatosTipoBancoFormaPago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoBancoFormaPago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoBancoFormaPago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoBancoFormaPago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoFormaPago(false);
			
			//SI ES MANUAL
			if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBancoFormaPago();
			}
			
			//this.abrirFrameTreeTipoBancoFormaPago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Banco Forma PagoS ?", "MANTENIMIENTO DE Tipo Banco Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoBancoFormaPago.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoBancoFormaPago();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipobancoformapagoReturnGeneral=tipobancoformapagoLogic.procesarImportacionTipoBancoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipobancoformapagoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoBancoFormaPagoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoBancoFormaPago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoBancoFormaPago.setFileImportacion(this.jInternalFrameImportacionTipoBancoFormaPago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoBancoFormaPago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoBancoFormaPago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoBancoFormaPago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoBancoFormaPago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();		

		tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoBancoFormaPagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoBancoFormaPagoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoBancoFormaPagos("Todos",tipobancoformapagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();		
		
		tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoformapago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoBancoFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoBancoFormaPago tipobancoformapago:tipobancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobancoformapago.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoBancoFormaPago tipobancoformapago:tipobancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobancoformapago.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoBancoFormaPago tipobancoformapago:tipobancoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipobancoformapago.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoBancoFormaPago(row);				
			//	iRow++;
			//}				
			
			//for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoBancoFormaPago(tipobancoformapagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipobancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoFormaPago(false);
			
			//SI ES MANUAL
			if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoBancoFormaPago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoFormaPago(false);
			
			//SI ES MANUAL
			if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoBancoFormaPago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoBancoFormaPago(false);
			
			//SI ES MANUAL
			if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoBancoFormaPago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoBancoFormaPago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoBancoFormaPago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoBancoFormaPago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoBancoFormaPago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoBancoFormaPago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoBancoFormaPago.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoBancoFormaPago.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoBancoFormaPago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoBancoFormaPago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoBancoFormaPago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoBancoFormaPago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoBancoFormaPago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoBancoFormaPago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoBancoFormaPago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoFormaPago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoBancoFormaPago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoBancoFormaPago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoBancoFormaPago();
		
		this.inicializarActualizarBindingBotonesManualTipoBancoFormaPago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoBancoFormaPago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoFormaPago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBancoFormaPago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBancoFormaPago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoBancoFormaPago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoBancoFormaPago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoBancoFormaPago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoBancoFormaPago.jCheckBoxPostAccionNuevoTipoBancoFormaPago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoBancoFormaPago.jCheckBoxPostAccionSinCerrarTipoBancoFormaPago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoBancoFormaPago.jCheckBoxPostAccionSinMensajeTipoBancoFormaPago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoBancoFormaPago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoBancoFormaPago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoBancoFormaPago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
				this.jInternalFrameDetalleFormTipoBancoFormaPago.jCheckBoxPostAccionNuevoTipoBancoFormaPago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoBancoFormaPago.jCheckBoxPostAccionSinCerrarTipoBancoFormaPago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoBancoFormaPago.jCheckBoxPostAccionSinMensajeTipoBancoFormaPago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoBancoFormaPago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoBancoFormaPago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoBancoFormaPago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoBancoFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoBancoFormaPago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoBancoFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoBancoFormaPago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoBancoFormaPago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoBancoFormaPago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoBancoFormaPago(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoBancoFormaPago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoBancoFormaPago() throws Exception {
		try	{
			if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoBancoFormaPago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoBancoFormaPago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoBancoFormaPago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoBancoFormaPago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoBancoFormaPago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoBancoFormaPago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoBancoFormaPago.addItem(reporte);
			}
			
			
			if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoBancoFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoBancoFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoBancoFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoBancoFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoBancoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoBancoFormaPago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoBancoFormaPago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBancoFormaPago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoBancoFormaPago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago!=null) {
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago!=null) {
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoBancoFormaPago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoBancoFormaPago(Boolean esInicializar) throws Exception {				
		if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoBancoFormaPago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoBancoFormaPago() throws Exception {
		this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoBancoFormaPago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoBancoFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoBancoFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoBancoFormaPagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoFormaPagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoBancoFormaPagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoBancoFormaPagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoBancoFormaPago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipobancoformapagoLogic.getTipoBancoFormaPagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipobancoformapagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoBancoFormaPago.setModel(new TipoBancoFormaPagoModel(this.tipobancoformapagoLogic.getTipoBancoFormaPagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoBancoFormaPago.setModel(new TipoBancoFormaPagoModel(this.tipobancoformapagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoBancoFormaPago!=null && this.jInternalFrameOrderByTipoBancoFormaPago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoBancoFormaPago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoFormaPago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoBancoFormaPagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,tipobancoformapagoConstantesFunciones.resaltarSeleccionarTipoBancoFormaPago,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoBancoFormaPagoConstantesFunciones.SCLASSWEBTITULO,tipobancoformapagoConstantesFunciones.resaltarSeleccionarTipoBancoFormaPago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoFormaPago,TipoBancoFormaPagoConstantesFunciones.LABEL_ID));

		if(this.tipobancoformapagoConstantesFunciones.mostraridTipoBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoFormaPagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipobancoformapagoConstantesFunciones.resaltaridTipoBancoFormaPago,this.tipobancoformapagoConstantesFunciones.activaridTipoBancoFormaPago,this,true,"idTipoBancoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancoformapagoConstantesFunciones.resaltaridTipoBancoFormaPago,this.tipobancoformapagoConstantesFunciones.activaridTipoBancoFormaPago,this,true,"idTipoBancoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoFormaPago,TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipobancoformapagoConstantesFunciones.mostrarid_empresaTipoBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipobancoformapagoConstantesFunciones.resaltarid_empresaTipoBancoFormaPago,this,this.tipobancoformapagoConstantesFunciones.activarid_empresaTipoBancoFormaPago));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipobancoformapagoConstantesFunciones.resaltarid_empresaTipoBancoFormaPago,this,this.tipobancoformapagoConstantesFunciones.activarid_empresaTipoBancoFormaPago,false,"id_empresaTipoBancoFormaPago","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoFormaPago,TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO));

		if(this.tipobancoformapagoConstantesFunciones.mostrarcodigoTipoBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipobancoformapagoConstantesFunciones.resaltarcodigoTipoBancoFormaPago,this.tipobancoformapagoConstantesFunciones.activarcodigoTipoBancoFormaPago,this,true,"codigoTipoBancoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancoformapagoConstantesFunciones.resaltarcodigoTipoBancoFormaPago,this.tipobancoformapagoConstantesFunciones.activarcodigoTipoBancoFormaPago,this,true,"codigoTipoBancoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoFormaPago,TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipobancoformapagoConstantesFunciones.mostrarnombreTipoBancoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipobancoformapagoConstantesFunciones.resaltarnombreTipoBancoFormaPago,this.tipobancoformapagoConstantesFunciones.activarnombreTipoBancoFormaPago,this,true,"nombreTipoBancoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipobancoformapagoConstantesFunciones.resaltarnombreTipoBancoFormaPago,this.tipobancoformapagoConstantesFunciones.activarnombreTipoBancoFormaPago,this,true,"nombreTipoBancoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoBancoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosBancoFormaPago && this.tipobancoformapagoConstantesFunciones.mostrarBancoFormaPagoTipoBancoFormaPago && !TipoBancoFormaPagoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Banco Forma Pagos");
				tableColumn.setHeaderValue("Banco Forma Pagos");
				tableColumn.setCellRenderer(new BancoFormaPagoTableCell(tipobancoformapagoConstantesFunciones.resaltarBancoFormaPagoTipoBancoFormaPago,this,this.tipobancoformapagoConstantesFunciones.activarBancoFormaPagoTipoBancoFormaPago));
				tableColumn.setCellEditor(new BancoFormaPagoTableCell(tipobancoformapagoConstantesFunciones.resaltarBancoFormaPagoTipoBancoFormaPago,this,this.tipobancoformapagoConstantesFunciones.activarBancoFormaPagoTipoBancoFormaPago));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoBancoFormaPago.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoBancoFormaPago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoBancoFormaPago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoBancoFormaPago.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoBancoFormaPago.addColumn(tableColumn);
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
			
			this.jTableDatosTipoBancoFormaPago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoBancoFormaPago.moveColumn(this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoBancoFormaPago.moveColumn(this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoBancoFormaPago.moveColumn(this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoBancoFormaPago.moveColumn(this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoBancoFormaPago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoBancoFormaPago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoBancoFormaPago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoBancoFormaPago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoBancoFormaPago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoBancoFormaPago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipobancoformapagoLogic.getTipoBancoFormaPagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipobancoformapagos.size()-1;
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
		//this.jTableDatosTipoBancoFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoBancoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoBancoFormaPago();
			
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
				
				//this.isEsNuevoTipoBancoFormaPago=false;
					
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
				if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoBancoFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoBancoFormaPago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipobancoformapago.getsType().equals("DUPLICADO")
				   || this.tipobancoformapago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoBancoFormaPago=true;
				
				} else {
					this.isEsNuevoTipoBancoFormaPago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipobancoformapago.getId()>=0 && !this.tipobancoformapago.getIsNew()) {						
						this.isEsNuevoTipoBancoFormaPago=false;
						
					} else {
						this.isEsNuevoTipoBancoFormaPago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoBancoFormaPago(esRelaciones);						
				
				this.seleccionarTipoBancoFormaPago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipobancoformapago.getId()<0) {
					this.isEsNuevoTipoBancoFormaPago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoBancoFormaPago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoBancoFormaPago(evt,rowIndex);
				}	
				
				if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoBancoFormaPago: " + this.dDif); 
					}
				}								
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoBancoFormaPago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipobancoformapago)) {
					if(this.tipobancoformapago.getId()>0) {
						this.tipobancoformapago.setIsDeleted(true);
						
						this.tipobancoformapagosEliminados.add(this.tipobancoformapago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipobancoformapagoLogic.getTipoBancoFormaPagos().remove(this.tipobancoformapago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipobancoformapagos.remove(this.tipobancoformapago);				
					}
					
					
					((TipoBancoFormaPagoModel) this.jTableDatosTipoBancoFormaPago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoBancoFormaPago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoBancoFormaPago) {
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoBancoFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoBancoFormaPago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoBancoFormaPago(this.tipobancoformapago);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipobancoformapagoConstantesFunciones.cargarid_empresaTipoBancoFormaPago || this.tipobancoformapagoConstantesFunciones.event_dependid_empresaTipoBancoFormaPago) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipobancoformapago.getid_empresa());
									//this.inicializarActualizarBindingTipoBancoFormaPago(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipobancoformapago.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipobancoformapago.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipobancoformapago.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoBancoFormaPago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoBancoFormaPago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoBancoFormaPago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoBancoFormaPago(tipobancoformapago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoBancoFormaPago(tipobancoformapago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoBancoFormaPago(tipobancoformapago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoFormaPago(tipobancoformapago);
	}
	
	public void setVariablesObjetoActualToFormularioTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.setText(tipobancoformapago.getId().toString());
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextFieldcodigoTipoBancoFormaPago.setText(tipobancoformapago.getcodigo());
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextAreanombreTipoBancoFormaPago.setText(tipobancoformapago.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoBancoFormaPago tipobancoformapagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipobancoformapagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoBancoFormaPago tipobancoformapagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipobancoformapagoLocal=this.tipobancoformapago;
			} else {
				tipobancoformapagoLocal=this.tipobancoformapagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipobancoformapagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoBancoFormaPago(tipobancoformapagoLocal,true);
					
					if(tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipobancoformapagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipobancoformapagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(tipobancoformapago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(tipobancoformapago);
	}
	
	public void setVariablesFormularioToObjetoActualTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(tipobancoformapago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.getText()==null || this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.getText()=="" || this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.setText("0");
			}

			if(conColumnasBase) {tipobancoformapago.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoFormaPagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelIdTipoBancoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobancoformapago.setcodigo(this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextFieldcodigoTipoBancoFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelcodigoTipoBancoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipobancoformapago.setnombre(this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextAreanombreTipoBancoFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelnombreTipoBancoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapagoBean,TipoBancoFormaPago tipobancoformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapagoOrigen,TipoBancoFormaPago tipobancoformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipobancoformapagoOrigen.getId()!=null && !tipobancoformapagoOrigen.getId().equals(0L))) {tipobancoformapago.setId(tipobancoformapagoOrigen.getId());}}
			if(conDefault || (!conDefault && tipobancoformapagoOrigen.getcodigo()!=null && !tipobancoformapagoOrigen.getcodigo().equals(""))) {tipobancoformapago.setcodigo(tipobancoformapagoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipobancoformapagoOrigen.getnombre()!=null && !tipobancoformapagoOrigen.getnombre().equals(""))) {tipobancoformapago.setnombre(tipobancoformapagoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.setText(tipobancoformapago.getId().toString());
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextFieldcodigoTipoBancoFormaPago.setText(tipobancoformapago.getcodigo());
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextAreanombreTipoBancoFormaPago.setText(tipobancoformapago.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoBancoFormaPago(TipoBancoFormaPagoBean tipobancoformapagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.setText(tipobancoformapagoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextFieldcodigoTipoBancoFormaPago.setText(tipobancoformapagoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextAreanombreTipoBancoFormaPago.setText(tipobancoformapagoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoBancoFormaPago(TipoBancoFormaPagoParameterReturnGeneral tipobancoformapagoReturnGeneral,TipoBancoFormaPagoBean tipobancoformapagoBean,Boolean conDefault) throws Exception { 
		try {
			TipoBancoFormaPago tipobancoformapagoLocal=new TipoBancoFormaPago();
			
			tipobancoformapagoLocal=tipobancoformapagoReturnGeneral.getTipoBancoFormaPago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipobancoformapagoLocal.getId()!=null && !tipobancoformapagoLocal.getId().equals(0L))) {tipobancoformapagoBean.setId(tipobancoformapagoLocal.getId());}}
			if(conDefault || (!conDefault && tipobancoformapagoLocal.getcodigo()!=null && !tipobancoformapagoLocal.getcodigo().equals(""))) {tipobancoformapagoBean.setcodigo(tipobancoformapagoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipobancoformapagoLocal.getnombre()!=null && !tipobancoformapagoLocal.getnombre().equals(""))) {tipobancoformapagoBean.setnombre(tipobancoformapagoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoBancoFormaPagoGenerico(Long idTipoBancoFormaPagoSeleccionado,JComboBox jComboBoxTipoBancoFormaPago,List<TipoBancoFormaPago> tipobancoformapagosLocal)throws Exception {
		try {
			TipoBancoFormaPago  tipobancoformapagoTemp=null;

			for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagosLocal) {
				if(tipobancoformapagoAux.getId()!=null && tipobancoformapagoAux.getId().equals(idTipoBancoFormaPagoSeleccionado)) {
					tipobancoformapagoTemp=tipobancoformapagoAux;
					break;
				}
			}

			jComboBoxTipoBancoFormaPago.setSelectedItem(tipobancoformapagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoBancoFormaPagoGenerico(JComboBox jComboBoxTipoBancoFormaPago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoBancoFormaPago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoBancoFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoBancoFormaPago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoBancoFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoBancoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoBancoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("BancoFormaPago")) {
			jButtonBancoFormaPagoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancoformapago=(TipoBancoFormaPago) tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipobancoformapago =(TipoBancoFormaPago) tipobancoformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipobancoformapago.getIsNew() && !tipobancoformapago.getIsChanged() && !tipobancoformapago.getIsDeleted()) {
				sDescripcion=tipobancoformapago.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipobancoformapago.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoBancoFormaPago tipobancoformapagoRow=new TipoBancoFormaPago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancoformapagoRow=(TipoBancoFormaPago) tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipobancoformapagoRow=(TipoBancoFormaPago) tipobancoformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonBancoFormaPagoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoBancoFormaPago tipobancoformapago) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoformapago = (TipoBancoFormaPago)this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipobancoformapago = (TipoBancoFormaPago)this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipobancoformapago!=null) {
						this.tipobancoformapago = tipobancoformapago;
					} else {
						this.tipobancoformapago = new TipoBancoFormaPago();
					}
				}

				if(this.isTienePermisosBancoFormaPago && this.permiteMantenimiento(this.tipobancoformapago)) {
					BancoFormaPagoBeanSwingJInternalFrame bancoformapagoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFramePopup=new BancoFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						bancoformapagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFramePopup;
					} else {
						bancoformapagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame;
					}

					List<TipoBancoFormaPago> tipobancoformapagos=new ArrayList<TipoBancoFormaPago>();
					tipobancoformapagos.add(this.tipobancoformapago);
					if(!esRelacionado) {
						//bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.setConGuardarRelaciones(false);
						//bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					bancoformapagoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoBancoFormaPago.cargarBancoFormaPagoBeanSwingJInternalFrame(tipobancoformapagos,this.tipobancoformapago,bancoformapagoBeanSwingJInternalFrame,/*conInicializar,*/bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.getConGuardarRelaciones(),bancoformapagoBeanSwingJInternalFrame.bancoformapagoSessionBean.getEsGuardarRelacionado());
					bancoformapagoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						bancoformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsBancoFormaPago("no_relacionado");

						bancoformapagoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(BancoFormaPagoConstantesFunciones.ITAMANIOFILATABLA + (BancoFormaPagoConstantesFunciones.ITAMANIOFILATABLA/2));

						bancoformapagoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoBancoFormaPago=(TitledBorder)this.jScrollPanelDatosTipoBancoFormaPago.getBorder();
						TitledBorder titledBorderBancoFormaPago=(TitledBorder)bancoformapagoBeanSwingJInternalFrame.jScrollPanelDatosBancoFormaPago.getBorder();

						titledBorderBancoFormaPago.setTitle(titledBorderTipoBancoFormaPago.getTitle() + " -> Banco Forma Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,bancoformapagoBeanSwingJInternalFrame);
						}

						bancoformapagoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(bancoformapagoBeanSwingJInternalFrame);

						bancoformapagoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Banco Forma Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoBancoFormaPago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoBancoFormaPago && this.isPermisoNuevoTipoBancoFormaPago));			
			this.jButtonDuplicarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaDuplicarTipoBancoFormaPago && this.isPermisoDuplicarTipoBancoFormaPago));			
			this.jButtonCopiarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaCopiarTipoBancoFormaPago && this.isPermisoCopiarTipoBancoFormaPago));
			this.jButtonVerFormTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaVerFormTipoBancoFormaPago && this.isPermisoVerFormTipoBancoFormaPago));
			
			this.jButtonAbrirOrderByTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoBancoFormaPago && this.isPermisoOrdenTipoBancoFormaPago));			
			
			this.jButtonNuevoRelacionesTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago && this.isPermisoNuevoTipoBancoFormaPago));			
			this.jButtonNuevoGuardarCambiosTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoBancoFormaPago && this.isPermisoNuevoTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago));
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonModificarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaModificarTipoBancoFormaPago && this.isPermisoActualizarTipoBancoFormaPago));	
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonActualizarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaActualizarTipoBancoFormaPago && this.isPermisoActualizarTipoBancoFormaPago));	
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonEliminarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaEliminarTipoBancoFormaPago && this.isPermisoEliminarTipoBancoFormaPago));
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonCancelarTipoBancoFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoBancoFormaPago);							
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoBancoFormaPago && this.isPermisoNuevoTipoBancoFormaPago));						
			this.jButtonDuplicarToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaDuplicarTipoBancoFormaPago && this.isPermisoDuplicarTipoBancoFormaPago));						
			this.jButtonCopiarToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaCopiarTipoBancoFormaPago && this.isPermisoCopiarTipoBancoFormaPago));			
			this.jButtonVerFormToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaVerFormTipoBancoFormaPago && this.isPermisoVerFormTipoBancoFormaPago));			
			this.jButtonAbrirOrderByToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoBancoFormaPago && this.isPermisoOrdenTipoBancoFormaPago));
			this.jButtonNuevoRelacionesToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago && this.isPermisoNuevoTipoBancoFormaPago));			
			this.jButtonNuevoGuardarCambiosToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoBancoFormaPago && this.isPermisoNuevoTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago));			
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonModificarToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaModificarTipoBancoFormaPago && this.isPermisoActualizarTipoBancoFormaPago));	
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonActualizarToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaActualizarTipoBancoFormaPago  && this.isPermisoActualizarTipoBancoFormaPago));	
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonEliminarToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaEliminarTipoBancoFormaPago && this.isPermisoEliminarTipoBancoFormaPago));
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonCancelarToolBarTipoBancoFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoBancoFormaPago);				
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoBancoFormaPago && this.isPermisoNuevoTipoBancoFormaPago));			
			this.jMenuItemDuplicarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaDuplicarTipoBancoFormaPago && this.isPermisoDuplicarTipoBancoFormaPago));			
			this.jMenuItemCopiarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaCopiarTipoBancoFormaPago && this.isPermisoCopiarTipoBancoFormaPago));			
			this.jMenuItemVerFormTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaVerFormTipoBancoFormaPago && this.isPermisoVerFormTipoBancoFormaPago));			
			this.jMenuItemAbrirOrderByTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoBancoFormaPago && this.isPermisoOrdenTipoBancoFormaPago));			
			//this.jMenuItemMostrarOcultarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoBancoFormaPago && this.isPermisoOrdenTipoBancoFormaPago));
			this.jMenuItemDetalleAbrirOrderByTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoBancoFormaPago && this.isPermisoOrdenTipoBancoFormaPago));			
			//this.jMenuItemDetalleMostrarOcultarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoBancoFormaPago && this.isPermisoOrdenTipoBancoFormaPago));			
			this.jMenuItemNuevoRelacionesTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago && this.isPermisoNuevoTipoBancoFormaPago));			
			this.jMenuItemNuevoGuardarCambiosTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoBancoFormaPago && this.isPermisoNuevoTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago));									
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemModificarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaModificarTipoBancoFormaPago && this.isPermisoActualizarTipoBancoFormaPago));	
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemActualizarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaActualizarTipoBancoFormaPago && this.isPermisoActualizarTipoBancoFormaPago));	
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemEliminarTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaEliminarTipoBancoFormaPago && this.isPermisoEliminarTipoBancoFormaPago));
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemCancelarTipoBancoFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoBancoFormaPago);				
			}
			
			this.jMenuItemGuardarCambiosTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago));						
			this.jMenuItemGuardarCambiosTablaTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=this.jButtonNuevoTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaDuplicarTipoBancoFormaPago=this.jButtonDuplicarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaCopiarTipoBancoFormaPago=this.jButtonCopiarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaVerFormTipoBancoFormaPago=this.jButtonVerFormTipoBancoFormaPago.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoBancoFormaPago=this.jButtonAbrirOrderByTipoBancoFormaPago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=this.jButtonNuevoRelacionesTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaModificarTipoBancoFormaPago=this.jButtonModificarTipoBancoFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonActualizarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonEliminarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonCancelarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosTipoBancoFormaPago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=this.jButtonGuardarCambiosTablaTipoBancoFormaPago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=this.jButtonNuevoToolBarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=this.jButtonNuevoRelacionesToolBarTipoBancoFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			this.isVisibilidadCeldaModificarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonModificarToolBarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonActualizarToolBarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonEliminarToolBarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonCancelarToolBarTipoBancoFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoBancoFormaPago=this.jButtonGuardarCambiosToolBarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=this.jButtonGuardarCambiosTablaToolBarTipoBancoFormaPago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=this.jMenuItemNuevoTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=this.jMenuItemNuevoRelacionesTipoBancoFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			this.isVisibilidadCeldaModificarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemModificarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemActualizarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemEliminarTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemCancelarTipoBancoFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoBancoFormaPago=this.jMenuItemGuardarCambiosTipoBancoFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=this.jMenuItemGuardarCambiosTablaTipoBancoFormaPago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoBancoFormaPago(Boolean esInicializar) {
		if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoBancoFormaPago();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoBancoFormaPago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoBancoFormaPago() {
		this.jButtonNuevoTipoBancoFormaPago.setVisible(this.isPermisoNuevoTipoBancoFormaPago);			
		this.jButtonDuplicarTipoBancoFormaPago.setVisible(this.isPermisoDuplicarTipoBancoFormaPago);			
		this.jButtonCopiarTipoBancoFormaPago.setVisible(this.isPermisoCopiarTipoBancoFormaPago);			
		this.jButtonVerFormTipoBancoFormaPago.setVisible(this.isPermisoVerFormTipoBancoFormaPago);			
		
		this.jButtonAbrirOrderByTipoBancoFormaPago.setVisible(this.isPermisoOrdenTipoBancoFormaPago);					
		
		this.jButtonNuevoRelacionesTipoBancoFormaPago.setVisible(this.isPermisoNuevoTipoBancoFormaPago);			
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonModificarTipoBancoFormaPago.setVisible(this.isPermisoActualizarTipoBancoFormaPago);	
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonActualizarTipoBancoFormaPago.setVisible(this.isPermisoActualizarTipoBancoFormaPago);	
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonEliminarTipoBancoFormaPago.setVisible(this.isPermisoEliminarTipoBancoFormaPago);
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonCancelarTipoBancoFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoBancoFormaPago);						
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosTipoBancoFormaPago.setVisible(this.isPermisoGuardarCambiosTipoBancoFormaPago);							
		}
		
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago.setVisible(this.isPermisoActualizarTipoBancoFormaPago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoBancoFormaPago() {
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonModificarTipoBancoFormaPago.setVisible(this.isPermisoActualizarTipoBancoFormaPago);	
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonActualizarTipoBancoFormaPago.setVisible(this.isPermisoActualizarTipoBancoFormaPago);	
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonEliminarTipoBancoFormaPago.setVisible(this.isPermisoEliminarTipoBancoFormaPago);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonCancelarTipoBancoFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoBancoFormaPago);							
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosTipoBancoFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoBancoFormaPago && this.isPermisoGuardarCambiosTipoBancoFormaPago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoBancoFormaPago() {
		if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoBancoFormaPago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoBancoFormaPago() {
	}
	
	public void jTableDatosTipoBancoFormaPagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoBancoFormaPago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.gettipobancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancoformapago==null) {
						this.tipobancoformapago = new TipoBancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
				}

				if(this.tipobancoformapago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipobancoformapago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoBancoFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoBancoFormaPago(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoBancoFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoBancoFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.gettipobancoformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipobancoformapagoLogic.getConnexion());

				if(this.tipobancoformapago.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipobancoformapago.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoBancoFormaPago=(TitledBorder)this.jScrollPanelDatosTipoBancoFormaPago.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoBancoFormaPago.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.gettipobancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancoformapago==null) {
						this.tipobancoformapago = new TipoBancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
				}

				if(this.tipobancoformapago.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipobancoformapago.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.gettipobancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancoformapago==null) {
						this.tipobancoformapago = new TipoBancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
				}

				if(this.tipobancoformapago.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipobancoformapago.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoBancoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.gettipobancoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipobancoformapago==null) {
						this.tipobancoformapago = new TipoBancoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);
				}

				if(this.tipobancoformapago.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipobancoformapago.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoBancoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoBancoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoBancoFormaPago(false,false);

			this.getTipoBancoFormaPagosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoBancoFormaPago(false);

			//if(TipoBancoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoBancoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipobancoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoBancoFormaPago() {
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
		

		if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoBancoFormaPago.dispose();
			this.jInternalFrameDetalleFormTipoBancoFormaPago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago!=null) {
			this.jInternalFrameReporteDinamicoTipoBancoFormaPago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoBancoFormaPago.dispose();
			this.jInternalFrameReporteDinamicoTipoBancoFormaPago=null;
		}
		
		if(this.jInternalFrameImportacionTipoBancoFormaPago!=null) {
			this.jInternalFrameImportacionTipoBancoFormaPago.setVisible(false);	    			
			this.jInternalFrameImportacionTipoBancoFormaPago.dispose();
			this.jInternalFrameImportacionTipoBancoFormaPago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoBancoFormaPago();
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoBancoFormaPago")) {
				jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoBancoFormaPago")) {
				jButtonDuplicarTipoBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoBancoFormaPago")) {
				jButtonCopiarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoBancoFormaPago")) {
				jButtonVerFormTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoBancoFormaPago")) {
				jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoBancoFormaPago")) {
				jButtonDuplicarTipoBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoBancoFormaPago")) {
				jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoBancoFormaPago")) {
				jButtonDuplicarTipoBancoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoBancoFormaPago")) {
				jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoBancoFormaPago")) {
				jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoBancoFormaPago")) {
				jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoBancoFormaPago")) {
				jButtonModificarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoBancoFormaPago")) {
				jButtonModificarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoBancoFormaPago")) {
				jButtonModificarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoBancoFormaPago")) {
				jButtonActualizarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoBancoFormaPago")) {
				jButtonActualizarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoBancoFormaPago")) {
				jButtonActualizarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoBancoFormaPago")) {
				jButtonEliminarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoBancoFormaPago")) {
				jButtonEliminarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoBancoFormaPago")) {
				jButtonEliminarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoBancoFormaPago")) {
				jButtonCancelarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoBancoFormaPago")) {
				jButtonCancelarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoBancoFormaPago")) {
				jButtonCancelarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoBancoFormaPago")) {
				jButtonCerrarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoBancoFormaPago")) {
				jButtonCerrarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoBancoFormaPago")) {
				jButtonCerrarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoBancoFormaPago")) {
				jButtonMostrarOcultarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoBancoFormaPago")) {
				jButtonCancelarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoBancoFormaPago")) {
				jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoBancoFormaPago")) {
				jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoBancoFormaPago")) {
				jButtonCopiarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoBancoFormaPago")) {
				jButtonVerFormTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoBancoFormaPago")) {
				jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoBancoFormaPago")) {
				jButtonCopiarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoBancoFormaPago")) {
				jButtonVerFormTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoBancoFormaPago")) {
				jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoBancoFormaPago")) {
				jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoBancoFormaPago")) {
				jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoBancoFormaPago")) {
				jButtonRecargarInformacionTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoBancoFormaPago")) {
				jButtonRecargarInformacionTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoBancoFormaPago")) {
				jButtonRecargarInformacionTipoBancoFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoBancoFormaPago")) {
				jButtonAnterioresTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoBancoFormaPago")) {
				jButtonAnterioresTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoBancoFormaPago")) {
				jButtonAnterioresTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoBancoFormaPago")) {
				jButtonSiguientesTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoBancoFormaPago")) {
				jButtonSiguientesTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoBancoFormaPago")) {
				jButtonSiguientesTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoBancoFormaPago") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoBancoFormaPago")) {
				jButtonAbrirOrderByTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoBancoFormaPago") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoBancoFormaPago")) {
				jButtonMostrarOcultarTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoBancoFormaPago")) {
				jButtonNuevoGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoBancoFormaPago")) {
				jButtonNuevoGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoBancoFormaPago")) {
				jButtonNuevoGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoBancoFormaPago")) {
				jButtonCerrarReporteDinamicoTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoBancoFormaPago")) {
				jButtonGenerarReporteDinamicoTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoBancoFormaPago")) {
				
				jButtonGenerarExcelReporteDinamicoTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoBancoFormaPago")) {
				jButtonCerrarImportacionTipoBancoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoBancoFormaPago")) {
				
				jButtonGenerarImportacionTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoBancoFormaPago")) {
				
				jButtonAbrirImportacionTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoBancoFormaPago")) {
				jComboBoxTiposAccionesTipoBancoFormaPagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoBancoFormaPago")) {
				jComboBoxTiposRelacionesTipoBancoFormaPagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoBancoFormaPago")) {
				jComboBoxTiposAccionesTipoBancoFormaPagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoBancoFormaPago")) {
				
				jComboBoxTiposSeleccionarTipoBancoFormaPagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoBancoFormaPago")) {
				jTextFieldValorCampoGeneralTipoBancoFormaPagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoBancoFormaPago")) {
				jButtonAbrirOrderByTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoBancoFormaPago")) {
				jButtonAbrirOrderByTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoBancoFormaPago")) {
				jButtonCerrarOrderByTipoBancoFormaPagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoBancoFormaPagoBusqueda")) {
				this.jButtonidTipoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoBancoFormaPagoUpdate")) {
				this.jButtonid_empresaTipoBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoBancoFormaPagoBusqueda")) {
				this.jButtonid_empresaTipoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoBancoFormaPagoBusqueda")) {
				this.jButtoncodigoTipoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoBancoFormaPagoBusqueda")) {
				this.jButtonnombreTipoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoBancoFormaPago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				


				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoBancoFormaPago tipobancoformapagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipobancoformapagoLocal=this.tipobancoformapago;
			} else {
				tipobancoformapagoLocal=this.tipobancoformapagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
							
				
				


				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
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
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
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
			
			


			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
								
						
				


				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
								
				
				


				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
							
				
				


				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
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
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
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
			
			


			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoFormaPagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
								
				
				


				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoBancoFormaPago")) {
					jCheckBoxSeleccionarTodosTipoBancoFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoBancoFormaPago")) {
					jCheckBoxSeleccionadosTipoBancoFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoBancoFormaPago")) {
					
				}
				
				


				
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
												
				
				


				
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoFormaPagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
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
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
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
			
			


			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoBancoFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipobancoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipobancoformapago);
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
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
				
				


				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoBancoFormaPago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoBancoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoBancoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipobancoformapagoAnterior =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoBancoFormaPago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoBancoFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoBancoFormaPago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipobancoformapago =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipobancoformapago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoBancoFormaPago")) {
				
				}
				
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoBancoFormaPago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoBancoFormaPago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoBancoFormaPago")) {
			
			}
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoBancoFormaPago();
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoBancoFormaPago")) {
				jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoBancoFormaPago")) {
				jButtonDuplicarTipoBancoFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoBancoFormaPago")) {
				jButtonCopiarTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoBancoFormaPago")) {
				jButtonVerFormTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoBancoFormaPago")) {
				jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoBancoFormaPago")) {
				jButtonModificarTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoBancoFormaPago")) {
				jButtonActualizarTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoBancoFormaPago")) {
				jButtonEliminarTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoBancoFormaPago")) {
				jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoBancoFormaPago")) {
				jButtonCancelarTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoBancoFormaPago")) {
				jButtonCerrarTipoBancoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoBancoFormaPago")) {
				jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoBancoFormaPago")) {
				jButtonNuevoGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoBancoFormaPago")) {
				jButtonAbrirOrderByTipoBancoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoBancoFormaPago")) {
				jButtonRecargarInformacionTipoBancoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoBancoFormaPago")) {
				jButtonAnterioresTipoBancoFormaPagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoBancoFormaPago")) {
				jButtonSiguientesTipoBancoFormaPagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoBancoFormaPagoBusqueda")) {
				this.jButtonidTipoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoBancoFormaPagoUpdate")) {
				this.jButtonid_empresaTipoBancoFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoBancoFormaPagoBusqueda")) {
				this.jButtonid_empresaTipoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoBancoFormaPagoBusqueda")) {
				this.jButtoncodigoTipoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoBancoFormaPagoBusqueda")) {
				this.jButtonnombreTipoBancoFormaPagoBusquedaActionPerformed(evt);
			}
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoBancoFormaPago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoBancoFormaPago")) {
				closingInternalFrameTipoBancoFormaPago();
				
			} else if(sTipo.equals("jButtonCancelarTipoBancoFormaPago")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoBancoFormaPago = (JInternalFrameBase)evt.getSource();
	            	
	            TipoBancoFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(TipoBancoFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoBancoFormaPago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoBancoFormaPagoActionPerformed(null);
			}
			
			TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipobancoformapago,new Object(),this.tipobancoformapagoParameterGeneral,this.tipobancoformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoBancoFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoBancoFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoBancoFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipobancoformapago)) {
			if(!esControlTabla) {
				if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);			
				}
				
				if(this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipobancoformapagoReturnGeneral=tipobancoformapagoLogic.procesarEventosTipoBancoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancoformapagoLogic.getTipoBancoFormaPagos(),this.tipobancoformapago,this.tipobancoformapagoParameterGeneral,this.isEsNuevoTipoBancoFormaPago,classes);//this.tipobancoformapagoLogic.getTipoBancoFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoBancoFormaPago(this.tipobancoformapagoReturnGeneral,this.tipobancoformapagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoBancoFormaPago(classes,this.tipobancoformapagoReturnGeneral,this.tipobancoformapagoBean,false);
					}
						
					if(this.tipobancoformapagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoBancoFormaPago(this.tipobancoformapagoReturnGeneral.getTipoBancoFormaPago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoBancoFormaPago(this.tipobancoformapagoReturnGeneral.getTipoBancoFormaPago());	
					}
						
					if(this.tipobancoformapagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoBancoFormaPago(this.tipobancoformapagoReturnGeneral.getTipoBancoFormaPago(),classes);//this.tipobancoformapagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoBancoFormaPago(this.tipobancoformapago,classes);//this.tipobancoformapagoBean);									
				}
			
				if(TipoBancoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoBancoFormaPago(this.tipobancoformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoBancoFormaPago(this.tipobancoformapago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipobancoformapagoAnterior!=null) {
						this.tipobancoformapago=this.tipobancoformapagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipobancoformapagoReturnGeneral=tipobancoformapagoLogic.procesarEventosTipoBancoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancoformapagoLogic.getTipoBancoFormaPagos(),this.tipobancoformapago,this.tipobancoformapagoParameterGeneral,this.isEsNuevoTipoBancoFormaPago,classes);//this.tipobancoformapagoLogic.getTipoBancoFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipobancoformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipobancoformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipobancoformapagoReturnGeneral.getTipoBancoFormaPago(),tipobancoformapagoLogic.getTipoBancoFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipobancoformapagoReturnGeneral.getTipoBancoFormaPago(),this.tipobancoformapagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoBancoFormaPago.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoBancoFormaPago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoBancoFormaPago();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoBancoFormaPago() throws Exception {
		
		TipoBancoFormaPagoModel tipobancoformapagoModel=(TipoBancoFormaPagoModel)this.jTableDatosTipoBancoFormaPago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipobancoformapagoModel.tipobancoformapagos=this.tipobancoformapagoLogic.getTipoBancoFormaPagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipobancoformapagoModel.tipobancoformapagos=this.tipobancoformapagos;
		}
		
		
		((TipoBancoFormaPagoModel) this.jTableDatosTipoBancoFormaPago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoBancoFormaPago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipobancoformapagoAnterior(),this.tipobancoformapagoLogic.getTipoBancoFormaPagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipobancoformapagoAnterior(),this.tipobancoformapagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoBancoFormaPago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(BancoFormaPago.class)) {
					this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.setBancoFormaPagos(tipobancoformapago.getBancoFormaPagos());
					this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBancoFormaPago(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
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
										
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancoformapago,new Object(),generalEntityParameterGeneral,this.tipobancoformapagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoBancoFormaPagoConstantesFunciones.getClassesRelationshipsOfTipoBancoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoBancoFormaPagoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoBancoFormaPago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoBancoFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipobancoformapago,new Object(),generalEntityParameterGeneral,this.tipobancoformapagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoBancoFormaPago(TipoBancoFormaPagoBean tipobancoformapagoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(BancoFormaPago.class)) {
					this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.setBancoFormaPagos(tipobancoformapago.getBancoFormaPagos());
					this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaBancoFormaPago(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoBancoFormaPago(ArrayList<Classe> classes,TipoBancoFormaPagoReturnGeneral tipobancoformapagoReturnGeneral,TipoBancoFormaPagoBean tipobancoformapagoBean,Boolean conDefault) throws Exception {
		
			this.tipobancoformapagoBean.setBancoFormaPagos(tipobancoformapagoReturnGeneral.getTipoBancoFormaPago().getBancoFormaPagos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(BancoFormaPago.class)) {
					tipobancoformapago.setBancoFormaPagos(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoBeanSwingJInternalFrame.bancoformapagoLogic.getBancoFormaPagos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipobancoformapago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago = new TipoBancoFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.tipobancoformapagoSessionBean.getConGuardarRelaciones(),this.tipobancoformapagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoBancoFormaPago);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.setVisible(false);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.tipobancoformapagoLogic=this.tipobancoformapagoLogic;
		
		this.cargarCombosFrameForeignKeyTipoBancoFormaPago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoBancoFormaPago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoBancoFormaPago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoBancoFormaPago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoBancoFormaPago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoBancoFormaPago"));
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonModificarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarTipoBancoFormaPago"));

		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonModificarToolBarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoBancoFormaPago"));
					
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemModificarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoBancoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonActualizarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarTipoBancoFormaPago"));
		
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonActualizarToolBarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoBancoFormaPago"));
						
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemActualizarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoBancoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonEliminarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarTipoBancoFormaPago"));
		
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonEliminarToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoBancoFormaPago"));
								
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemEliminarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoBancoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonCancelarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarTipoBancoFormaPago"));
		
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonCancelarToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoBancoFormaPago"));
					
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemCancelarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoBancoFormaPago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemDetalleCerrarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoBancoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBancoFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBancoFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoBancoFormaPago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonidTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonid_empresaTipoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonid_empresaTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtoncodigoTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonnombreTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoFormaPagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jTabbedPaneRelacionesTipoBancoFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoBancoFormaPago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoBancoFormaPago"));
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoBancoFormaPago"));
		}
		
		this.jTableDatosTipoBancoFormaPago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoBancoFormaPago"));
		
		this.jTableDatosTipoBancoFormaPago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoBancoFormaPago"));
		
		this.jButtonNuevoTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"NuevoTipoBancoFormaPago"));
		
		this.jButtonDuplicarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarTipoBancoFormaPago"));
		
		this.jButtonCopiarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"CopiarTipoBancoFormaPago"));
		
		this.jButtonVerFormTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"VerFormTipoBancoFormaPago"));
		
		
		this.jButtonNuevoToolBarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoBancoFormaPago"));
			
		this.jButtonDuplicarToolBarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoBancoFormaPago"));
			
		this.jMenuItemNuevoTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoBancoFormaPago"));
			
		this.jMenuItemDuplicarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoBancoFormaPago"));		
		
		
		this.jButtonNuevoRelacionesTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoBancoFormaPago"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoBancoFormaPago"));
			
		this.jMenuItemNuevoRelacionesTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoBancoFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonModificarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarTipoBancoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonModificarToolBarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoBancoFormaPago"));
			
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemModificarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoBancoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonActualizarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarTipoBancoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonActualizarToolBarTipoBancoFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoBancoFormaPago"));
				
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemActualizarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoBancoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonEliminarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarTipoBancoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonEliminarToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoBancoFormaPago"));
						
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemEliminarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoBancoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonCancelarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarTipoBancoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonCancelarToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoBancoFormaPago"));
			
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemCancelarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoBancoFormaPago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoBancoFormaPago"));		
		
		
		this.jButtonCerrarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"CerrarTipoBancoFormaPago"));
		
		
		this.jButtonCerrarToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoBancoFormaPago"));
			
		this.jMenuItemCerrarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoBancoFormaPago"));
			
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jMenuItemDetalleCerrarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoBancoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoBancoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoBancoFormaPago"));
		}
		
		this.jButtonCopiarToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoBancoFormaPago"));
			
		this.jButtonVerFormToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoBancoFormaPago"));
		
		this.jMenuItemGuardarCambiosTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoBancoFormaPago"));
			
		this.jMenuItemCopiarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoBancoFormaPago"));		
		
		this.jMenuItemVerFormTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoBancoFormaPago"));		
		
		
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoBancoFormaPago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoBancoFormaPago"));
			
		this.jMenuItemGuardarCambiosTablaTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoBancoFormaPago"));		
		
		
		
		this.jButtonRecargarInformacionTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoBancoFormaPago"));
					
		this.jButtonRecargarInformacionToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoBancoFormaPago"));
		
		this.jMenuItemRecargarInformacionTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoBancoFormaPago"));		
		
		
		
		this.jButtonAnterioresTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresTipoBancoFormaPago"));
		
		
		this.jButtonAnterioresToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoBancoFormaPago"));
		
		this.jMenuItemAnterioresTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoBancoFormaPago"));		
		
		
		this.jButtonSiguientesTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesTipoBancoFormaPago"));
		
		
		this.jButtonSiguientesToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoBancoFormaPago"));
			
		this.jMenuItemSiguientesTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoBancoFormaPago"));
			
		this.jMenuItemAbrirOrderByTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoBancoFormaPago"));
			
		this.jMenuItemMostrarOcultarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoBancoFormaPago"));
			
		this.jMenuItemDetalleAbrirOrderByTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoBancoFormaPago"));
			
		this.jMenuItemDetalleMostarOcultarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoBancoFormaPago"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoBancoFormaPago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoBancoFormaPago"));
			
		this.jMenuItemNuevoGuardarCambiosTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoBancoFormaPago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoBancoFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoBancoFormaPago"));

		this.jCheckBoxSeleccionadosTipoBancoFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoBancoFormaPago"));
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoBancoFormaPago"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoBancoFormaPago"));
			
		this.jComboBoxTiposAccionesTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoBancoFormaPago"));
					
		this.jComboBoxTiposSeleccionarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoBancoFormaPago"));
			
		this.jTextFieldValorCampoGeneralTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoBancoFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonidTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonid_empresaTipoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonid_empresaTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtoncodigoTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonnombreTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoFormaPagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoBancoFormaPago!=null) {
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBancoFormaPago"));
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBancoFormaPago"));
				this.jInternalFrameReporteDinamicoTipoBancoFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBancoFormaPago"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoBancoFormaPago"));				
			//this.jButtonGenerarReporteDinamicoTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoBancoFormaPago"));
			//this.jButtonGenerarExcelReporteDinamicoTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoBancoFormaPago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoBancoFormaPago!=null) {
				this.jInternalFrameImportacionTipoBancoFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoBancoFormaPago"));
				this.jInternalFrameImportacionTipoBancoFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoBancoFormaPago"));
				this.jInternalFrameImportacionTipoBancoFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoBancoFormaPago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoBancoFormaPago"));
			
			this.jButtonAbrirOrderByToolBarTipoBancoFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoBancoFormaPago"));			
			
			if(this.jInternalFrameOrderByTipoBancoFormaPago!=null) {
				this.jInternalFrameOrderByTipoBancoFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoBancoFormaPago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoBancoFormaPago.jTabbedPaneRelacionesTipoBancoFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoBancoFormaPago"));
		
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
            		closingInternalFrameTipoBancoFormaPago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoBancoFormaPago = (JInternalFrameBase)event.getSource();
	            	
	            TipoBancoFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(TipoBancoFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoBancoFormaPago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoBancoFormaPagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoBancoFormaPago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoBancoFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoBancoFormaPago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoBancoFormaPago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoBancoFormaPago";
		inputMap = this.jButtonNuevoTipoBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoBancoFormaPago";
		inputMap = this.jButtonNuevoRelacionesTipoBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoBancoFormaPagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoBancoFormaPago";
		inputMap = this.jButtonModificarTipoBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoBancoFormaPago";
		inputMap = this.jButtonActualizarTipoBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoBancoFormaPago";
		inputMap = this.jButtonEliminarTipoBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoBancoFormaPago";
		inputMap = this.jButtonCancelarTipoBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoBancoFormaPago";
		inputMap = this.jButtonCerrarTipoBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoBancoFormaPago";
		inputMap = this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosTipoBancoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonGuardarCambiosTipoBancoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoBancoFormaPago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoBancoFormaPagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoBancoFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoBancoFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoBancoFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoBancoFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoBancoFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoBancoFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonidTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoBancoFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonid_empresaTipoBancoFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonid_empresaTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtoncodigoTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoBancoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jButtonnombreTipoBancoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoBancoFormaPagoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoBancoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoBancoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoBancoFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoBancoFormaPago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoBancoFormaPago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
					tipobancoformapagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagos) {
					tipobancoformapagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoBancoFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoBancoFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
						tipobancoformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagos) {
						tipobancoformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoBancoFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoBancoFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoBancoFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoBancoFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoBancoFormaPago.getSelectedRows();
			
			TipoBancoFormaPago tipobancoformapagoLocal=new TipoBancoFormaPago();
			
			//this.seleccionarTodosTipoBancoFormaPago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipobancoformapagoLocal =(TipoBancoFormaPago) this.tipobancoformapagoLogic.getTipoBancoFormaPagos().toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipobancoformapagoLocal =(TipoBancoFormaPago) this.tipobancoformapagos.toArray()[this.jTableDatosTipoBancoFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipobancoformapagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
						tipobancoformapagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagos) {
						tipobancoformapagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoBancoFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoBancoFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoBancoFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoBancoFormaPagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoBancoFormaPagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoBancoFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoBancoFormaPago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoBancoFormaPago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
				
						if(sTipoSeleccionar.equals(TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipobancoformapagoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipobancoformapagoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagos) {
					
						if(sTipoSeleccionar.equals(TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipobancoformapagoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipobancoformapagoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoBancoFormaPagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoBancoFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoBancoFormaPago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoBancoFormaPago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoBancoFormaPago) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoBancoFormaPago(conSplash);
				
					this.generarReporteTipoBancoFormaPagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoBancoFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoBancoFormaPagosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoBancoFormaPagosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoBancoFormaPago();
				
				this.exportarTipoBancoFormaPagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoBancoFormaPagos();
				//this.importarTipoBancoFormaPagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoBancoFormaPago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoBancoFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Banco Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoBancoFormaPago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoBancoFormaPago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoBancoFormaPago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoBancoFormaPagoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoBancoFormaPago) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoBancoFormaPago(conSplash);
					
						//this.actualizarParametrosGeneralTipoBancoFormaPago();
						
						this.generarReporteProcesoAccionTipoBancoFormaPagosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Banco Forma PagoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Banco Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoBancoFormaPago();
				
						this.actualizarParametrosGeneralTipoBancoFormaPago();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipobancoformapagoReturnGeneral=tipobancoformapagoLogic.procesarAccionTipoBancoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipobancoformapagoLogic.getTipoBancoFormaPagos(),this.tipobancoformapagoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoBancoFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoBancoFormaPago();
					
					TipoBancoFormaPagoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoBancoFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoBancoFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxTiposAccionesFormularioTipoBancoFormaPago.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoBancoFormaPago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoBancoFormaPagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoBancoFormaPago();
			
			if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();		
			TipoBancoFormaPago tipobancoformapago=new TipoBancoFormaPago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoBancoFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoBancoFormaPago.getSelectedItem();
			
			
			
			
			tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipobancoformapagosSeleccionados.size()==1) {
				for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagosSeleccionados) {
					tipobancoformapago=tipobancoformapagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Banco Forma Pago")) {
					jButtonBancoFormaPagoActionPerformed(null,rowIndex,true,false,tipobancoformapago);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoBancoFormaPago();
			
      		//this.finishProcessTipoBancoFormaPago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoBancoFormaPagoReturnGeneral() throws Exception {
		if(this.tipobancoformapagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipobancoformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipobancoformapagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipobancoformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipobancoformapagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipobancoformapagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoBancoFormaPago(false);
		}
		
		if(this.tipobancoformapagoReturnGeneral.getConRetornoLista() || this.tipobancoformapagoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipobancoformapagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipobancoformapagoLogic.setTipoBancoFormaPagos(this.tipobancoformapagoReturnGeneral.getTipoBancoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipobancoformapagoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipobancoformapagoLogic.setTipoBancoFormaPago(this.tipobancoformapagoReturnGeneral.getTipoBancoFormaPago());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoBancoFormaPago(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoBancoFormaPago() throws Exception {
		
		
	}
	
	public ArrayList<TipoBancoFormaPago> getTipoBancoFormaPagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoBancoFormaPago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagoLogic.getTipoBancoFormaPagos()) {
					if(tipobancoformapagoAux.getIsSelected()) {
						tipobancoformapagosSeleccionados.add(tipobancoformapagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoBancoFormaPago tipobancoformapagoAux:this.tipobancoformapagos) {
					if(tipobancoformapagoAux.getIsSelected()) {
						tipobancoformapagosSeleccionados.add(tipobancoformapagoAux);				
					}
				}
			}
			
			if(tipobancoformapagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipobancoformapagosSeleccionados.addAll(this.tipobancoformapagoLogic.getTipoBancoFormaPagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipobancoformapagosSeleccionados.addAll(this.tipobancoformapagos);				
					}
				}
			}
		} else {
			tipobancoformapagosSeleccionados.add(this.tipobancoformapago);
		}
		
		return tipobancoformapagosSeleccionados;
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
	
	public void generarReporteTipoBancoFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoBancoFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoBancoFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoBancoFormaPagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoBancoFormaPagosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoBancoFormaPagosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Banco Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();		
		
		tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoBancoFormaPagos("Todos",tipobancoformapagosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();		
		
		tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoBancoFormaPagos("Todos",tipobancoformapagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoBancoFormaPagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();
		
		tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoBancoFormaPagos("Todos",tipobancoformapagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoBancoFormaPago();
		
		
		tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoBancoFormaPago();
		
		
		//this.generarReporteTipoBancoFormaPagos("Todos",tipobancoformapagosSeleccionados ,tipobancoformapagoImplementable,tipobancoformapagoImplementableHome);
	}
	
	public void mostrarImportacionTipoBancoFormaPagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoBancoFormaPago();
		
		this.abrirFrameImportacionTipoBancoFormaPago();		
		
			
		//this.generarReporteTipoBancoFormaPagos("Todos",tipobancoformapagosSeleccionados ,tipobancoformapagoImplementable,tipobancoformapagoImplementableHome);
	}
	
	public void importarTipoBancoFormaPagos() throws Exception {		
	
	}
	
	public void exportarTipoBancoFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoBancoFormaPagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoBancoFormaPagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoBancoFormaPagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Banco Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();		
		
		tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoformapago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoBancoFormaPago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoBancoFormaPago(tipobancoformapagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipobancoformapagoAux.setsDetalleGeneralEntityReporte(tipobancoformapagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoBancoFormaPago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoBancoFormaPagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoFormaPagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipobancoformapago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancoformapago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancoformapago.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancoformapago.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipobancoformapago.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();		
		
		tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoformapago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoBancoFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoBancoFormaPago(row);				
				iRow++;
			}				
			
			for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoBancoFormaPago(tipobancoformapagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoBancoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();		
		
		tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipobancoformapago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipobancoformapagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipobancoformapago");
			//elementRoot.appendChild(element);
		
			for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagosSeleccionados) {
				element = document.createElement("tipobancoformapago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoBancoFormaPago(tipobancoformapagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Banco Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoBancoFormaPago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancoformapago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancoformapago.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancoformapago.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipobancoformapago.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoBancoFormaPago(TipoBancoFormaPago tipobancoformapago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoBancoFormaPagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipobancoformapago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoBancoFormaPagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipobancoformapago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoBancoFormaPagoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipobancoformapago.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoBancoFormaPagoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipobancoformapago.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoBancoFormaPagoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipobancoformapago.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoBancoFormaPagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados=new ArrayList<TipoBancoFormaPago>();
		
		tipobancoformapagosSeleccionados=this.getTipoBancoFormaPagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoBancoFormaPago(tipobancoformapagosSeleccionados);
		
		this.generarReporteTipoBancoFormaPagos("Todos",tipobancoformapagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoBancoFormaPago(ArrayList<TipoBancoFormaPago> tipobancoformapagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoBancoFormaPago tipobancoformapagoAux:tipobancoformapagosSeleccionados) {
				tipobancoformapagoAux.setsDetalleGeneralEntityReporte(tipobancoformapagoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoBancoFormaPagoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipobancoformapagoAux.setsDescripcionGeneralEntityReporte1(tipobancoformapagoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoBancoFormaPagoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipobancoformapagoAux.setsDescripcionGeneralEntityReporte1(tipobancoformapagoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoBancoFormaPagoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipobancoformapagoAux.setsDescripcionGeneralEntityReporte1(tipobancoformapagoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoBancoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoBancoFormaPago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoBancoFormaPago=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=true;
				this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=true;
			}
			
			this.isVisibilidadCeldaModificarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=false;
			this.isVisibilidadCeldaModificarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=true;
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=false;
			this.isVisibilidadCeldaModificarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=true;
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=true;
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=false;
			this.isVisibilidadCeldaModificarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=true;
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=true;
			this.isVisibilidadCeldaModificarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=false;
			this.isVisibilidadCeldaModificarTipoBancoFormaPago=true;
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoBancoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoBancoFormaPago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoBancoFormaPagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=true;
		} else {
			this.actualizarEstadoPanelsTipoBancoFormaPago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoBancoFormaPago=false;
			//this.isVisibilidadCeldaVerFormTipoBancoFormaPago=false;
			this.isVisibilidadCeldaDuplicarTipoBancoFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipobancoformapagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoBancoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!tipobancoformapagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=false;												
			}
			
			this.jButtonCerrarTipoBancoFormaPago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoBancoFormaPago=false;
		}
		
		if(!this.permiteMantenimiento(this.tipobancoformapago)) {
			this.isVisibilidadCeldaActualizarTipoBancoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoBancoFormaPago=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoBancoFormaPago() {
		this.isVisibilidadCeldaNuevoTipoBancoFormaPago=false;
		this.isVisibilidadCeldaGuardarCambiosTipoBancoFormaPago=false;
	}
	
	public void actualizarEstadoPanelsTipoBancoFormaPago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoBancoFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosTipoBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoFormaPago!=null) {
				this.jPanelPaginacionTipoBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoFormaPago!=null) {
				this.jPanelParametrosReportesTipoBancoFormaPago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoBancoFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosTipoBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBancoFormaPago!=null) {
				this.jPanelPaginacionTipoBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBancoFormaPago!=null) {
				this.jPanelParametrosReportesTipoBancoFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoBancoFormaPago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosTipoBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBancoFormaPago!=null) {
				this.jPanelPaginacionTipoBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBancoFormaPago!=null) {
				this.jPanelParametrosReportesTipoBancoFormaPago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoBancoFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosTipoBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoBancoFormaPago!=null) {
				this.jPanelPaginacionTipoBancoFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoBancoFormaPago!=null) {
				this.jPanelParametrosReportesTipoBancoFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoBancoFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosTipoBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoFormaPago!=null) {
				this.jPanelPaginacionTipoBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoFormaPago!=null) {
				this.jPanelParametrosReportesTipoBancoFormaPago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoBancoFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosTipoBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoFormaPago!=null) {
				this.jPanelPaginacionTipoBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoFormaPago!=null) {
				this.jPanelParametrosReportesTipoBancoFormaPago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoBancoFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoBancoFormaPago!=null) {
				this.jScrollPanelDatosTipoBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoBancoFormaPago!=null) {
				this.jPanelPaginacionTipoBancoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoBancoFormaPago!=null) {
				this.jPanelParametrosReportesTipoBancoFormaPago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoBancoFormaPago!=null) {
					this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoBancoFormaPago!=null) {
				this.jPanelParametrosReportesTipoBancoFormaPago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipobancoformapagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoBancoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoBancoFormaPago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoBancoFormaPago!=null) {
				this.jPanelParametrosReportesTipoBancoFormaPago.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoBancoFormaPagoParaBancoFormaPagos() throws Exception {
		Boolean isPaginaPopupBancoFormaPago=false;

		try {

			if(this.tipobancoformapagoSessionBean==null) {
				this.tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoSessionBean=new BancoFormaPagoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoSessionBean.setsPathNavegacionActual(tipobancoformapagoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+BancoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupBancoFormaPago=this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeBancoFormaPago(true);
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeBancoFormaPago(TipoBancoFormaPagoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoSessionBean.setisBusquedaDesdeForeignKeySesionTipoBancoFormaPago(true);
			this.jInternalFrameDetalleFormTipoBancoFormaPago.bancoformapagoSessionBean.setlidTipoBancoFormaPagoActual(this.idTipoBancoFormaPagoActual);

			tipobancoformapagoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoBancoFormaPago(true);
			tipobancoformapagoSessionBean.setlIdTipoBancoFormaPagoActualForeignKey(this.idTipoBancoFormaPagoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoBancoFormaPagoSessionBean tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
		
		if(this.tipobancoformapagoSessionBean==null) {
			this.tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
		}
		
		this.tipobancoformapagoSessionBean.setsUltimaBusquedaTipoBancoFormaPago(this.getsAccionBusqueda());
		this.tipobancoformapagoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipobancoformapagoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipobancoformapagoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoBancoFormaPagoSessionBean tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
		
		if(this.tipobancoformapagoSessionBean==null) {
			this.tipobancoformapagoSessionBean=new TipoBancoFormaPagoSessionBean();
		}
		
		if(this.tipobancoformapagoSessionBean.getsUltimaBusquedaTipoBancoFormaPago()!=null&&!this.tipobancoformapagoSessionBean.getsUltimaBusquedaTipoBancoFormaPago().equals("")) {
			this.setsAccionBusqueda(tipobancoformapagoSessionBean.getsUltimaBusquedaTipoBancoFormaPago());
			this.setiNumeroPaginacion(tipobancoformapagoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipobancoformapagoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipobancoformapagoSessionBean.getid_empresa());
				tipobancoformapagoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipobancoformapagoSessionBean.setsUltimaBusquedaTipoBancoFormaPago("");
		this.tipobancoformapagoSessionBean.setiNumeroPaginacion(TipoBancoFormaPagoConstantesFunciones.INUMEROPAGINACION);
		this.tipobancoformapagoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoBancoFormaPago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoBancoFormaPago() {
		this.updateBorderResaltarBusquedasFormularioTipoBancoFormaPago();
		this.updateVisibilidadBusquedasFormularioTipoBancoFormaPago();
		this.updateHabilitarBusquedasFormularioTipoBancoFormaPago();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoBancoFormaPago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoBancoFormaPago.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoBancoFormaPago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoBancoFormaPago.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoBancoFormaPago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoBancoFormaPago.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoBancoFormaPago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoBancoFormaPago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoBancoFormaPago() throws Exception {

		if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoBancoFormaPago();
		this.updateVisibilidadResaltarControlesFormularioTipoBancoFormaPago();
		this.updateHabilitarResaltarControlesFormularioTipoBancoFormaPago();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoBancoFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipobancoformapagoConstantesFunciones.resaltaridTipoBancoFormaPago!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.setBorder(this.tipobancoformapagoConstantesFunciones.resaltaridTipoBancoFormaPago);}
		if(this.tipobancoformapagoConstantesFunciones.resaltarid_empresaTipoBancoFormaPago!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.setBorder(this.tipobancoformapagoConstantesFunciones.resaltarid_empresaTipoBancoFormaPago);}
		if(this.tipobancoformapagoConstantesFunciones.resaltarcodigoTipoBancoFormaPago!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextFieldcodigoTipoBancoFormaPago.setBorder(this.tipobancoformapagoConstantesFunciones.resaltarcodigoTipoBancoFormaPago);}
		if(this.tipobancoformapagoConstantesFunciones.resaltarnombreTipoBancoFormaPago!=null && this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextAreanombreTipoBancoFormaPago.setBorder(this.tipobancoformapagoConstantesFunciones.resaltarnombreTipoBancoFormaPago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoBancoFormaPago() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
	
		//this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.setVisible(this.tipobancoformapagoConstantesFunciones.mostraridTipoBancoFormaPago);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jPanelidTipoBancoFormaPago.setVisible(this.tipobancoformapagoConstantesFunciones.mostraridTipoBancoFormaPago);
		//this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.setVisible(this.tipobancoformapagoConstantesFunciones.mostrarid_empresaTipoBancoFormaPago);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jPanelid_empresaTipoBancoFormaPago.setVisible(this.tipobancoformapagoConstantesFunciones.mostrarid_empresaTipoBancoFormaPago);
		//this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextFieldcodigoTipoBancoFormaPago.setVisible(this.tipobancoformapagoConstantesFunciones.mostrarcodigoTipoBancoFormaPago);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jPanelcodigoTipoBancoFormaPago.setVisible(this.tipobancoformapagoConstantesFunciones.mostrarcodigoTipoBancoFormaPago);
		//this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextAreanombreTipoBancoFormaPago.setVisible(this.tipobancoformapagoConstantesFunciones.mostrarnombreTipoBancoFormaPago);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jPanelnombreTipoBancoFormaPago.setVisible(this.tipobancoformapagoConstantesFunciones.mostrarnombreTipoBancoFormaPago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoBancoFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoBancoFormaPago!=null) {
	
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jLabelidTipoBancoFormaPago.setEnabled(this.tipobancoformapagoConstantesFunciones.activaridTipoBancoFormaPago);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jComboBoxid_empresaTipoBancoFormaPago.setEnabled(this.tipobancoformapagoConstantesFunciones.activarid_empresaTipoBancoFormaPago);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextFieldcodigoTipoBancoFormaPago.setEnabled(this.tipobancoformapagoConstantesFunciones.activarcodigoTipoBancoFormaPago);
		this.jInternalFrameDetalleFormTipoBancoFormaPago.jTextAreanombreTipoBancoFormaPago.setEnabled(this.tipobancoformapagoConstantesFunciones.activarnombreTipoBancoFormaPago);
		}
	}
	
		
}