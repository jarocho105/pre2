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

import com.bydan.erp.contabilidad.util.TipoPlantillaFacturaConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoPlantillaFacturaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoPlantillaFacturaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoPlantillaFacturaBean;
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
public class TipoPlantillaFacturaBeanSwingJInternalFrame extends TipoPlantillaFacturaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoPlantillaFacturaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoPlantillaFactura> tipoplantillafacturaValidator = new ClassValidator<TipoPlantillaFactura>(TipoPlantillaFactura.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoPlantillaFactura tipoplantillafactura;	
	public TipoPlantillaFactura tipoplantillafacturaAux;
	public TipoPlantillaFactura tipoplantillafacturaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoPlantillaFactura tipoplantillafacturaTotales;
	public Long idTipoPlantillaFacturaActual;
	public Long iIdNuevoTipoPlantillaFactura=0L;
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
	
	public Boolean isPermisoTodoTipoPlantillaFactura;
	public Boolean isPermisoNuevoTipoPlantillaFactura;
	public Boolean isPermisoActualizarTipoPlantillaFactura;
	public Boolean isPermisoActualizarOriginalTipoPlantillaFactura;
	public Boolean isPermisoEliminarTipoPlantillaFactura;
	public Boolean isPermisoGuardarCambiosTipoPlantillaFactura;
	public Boolean isPermisoConsultaTipoPlantillaFactura;
	public Boolean isPermisoBusquedaTipoPlantillaFactura;
	public Boolean isPermisoReporteTipoPlantillaFactura;
	public Boolean isPermisoPaginacionMedioTipoPlantillaFactura;
	public Boolean isPermisoPaginacionAltoTipoPlantillaFactura;
	public Boolean isPermisoPaginacionTodoTipoPlantillaFactura;
	public Boolean isPermisoCopiarTipoPlantillaFactura;
	public Boolean isPermisoVerFormTipoPlantillaFactura;
	public Boolean isPermisoDuplicarTipoPlantillaFactura;
	public Boolean isPermisoOrdenTipoPlantillaFactura;
	
	
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
	
	public TipoPlantillaFacturaParameterReturnGeneral tipoplantillafacturaReturnGeneral;
	public TipoPlantillaFacturaParameterReturnGeneral tipoplantillafacturaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoPlantillaFactura=false;
	public Boolean esParaAccionDesdeFormularioTipoPlantillaFactura=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoPlantillaFacturaLogic tipoplantillafacturaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoPlantillaFactura tipoplantillafacturaBean;
	public TipoPlantillaFacturaConstantesFunciones tipoplantillafacturaConstantesFunciones;
	//public TipoPlantillaFacturaParameterReturnGeneral tipoplantillafacturaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoPlantillaFactura> tipoplantillafacturas;	
	//public List<TipoPlantillaFactura> tipoplantillafacturasEliminados;
	//public List<TipoPlantillaFactura> tipoplantillafacturasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoPlantillaFactura=false;
	public Boolean isVisibilidadCeldaDuplicarTipoPlantillaFactura=true;
	public Boolean isVisibilidadCeldaCopiarTipoPlantillaFactura=true;
	public Boolean isVisibilidadCeldaVerFormTipoPlantillaFactura=true;
	public Boolean isVisibilidadCeldaOrdenTipoPlantillaFactura=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=false;
	public Boolean isVisibilidadCeldaModificarTipoPlantillaFactura=false;
	public Boolean isVisibilidadCeldaActualizarTipoPlantillaFactura=false;
	public Boolean isVisibilidadCeldaEliminarTipoPlantillaFactura=false;
	public Boolean isVisibilidadCeldaCancelarTipoPlantillaFactura=false;
	public Boolean isVisibilidadCeldaGuardarTipoPlantillaFactura=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoPlantillaFactura() {
		return this.iIdNuevoTipoPlantillaFactura;
	}

	public void setiIdNuevoTipoPlantillaFactura(Long iIdNuevoTipoPlantillaFactura) {
		this.iIdNuevoTipoPlantillaFactura = iIdNuevoTipoPlantillaFactura;
	}
	
	public Long getidTipoPlantillaFacturaActual() {
		return this.idTipoPlantillaFacturaActual;
	}

	public void setidTipoPlantillaFacturaActual(Long idTipoPlantillaFacturaActual) {
		this.idTipoPlantillaFacturaActual = idTipoPlantillaFacturaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoPlantillaFactura gettipoplantillafactura() {
		return this.tipoplantillafactura;
	}

	public void settipoplantillafactura(TipoPlantillaFactura tipoplantillafactura) {
		this.tipoplantillafactura = tipoplantillafactura;
	}
	
	public TipoPlantillaFactura gettipoplantillafacturaAux() {
		return this.tipoplantillafacturaAux;
	}

	public void settipoplantillafacturaAux(TipoPlantillaFactura tipoplantillafacturaAux) {
		this.tipoplantillafacturaAux = tipoplantillafacturaAux;
	}				
	
	public TipoPlantillaFactura gettipoplantillafacturaAnterior() {
		return this.tipoplantillafacturaAnterior;
	}

	public void settipoplantillafacturaAnterior(TipoPlantillaFactura tipoplantillafacturaAnterior) {
		this.tipoplantillafacturaAnterior = tipoplantillafacturaAnterior;
	}	
	
	public TipoPlantillaFactura gettipoplantillafacturaTotales() {
		return this.tipoplantillafacturaTotales;
	}

	public void settipoplantillafacturaTotales(TipoPlantillaFactura tipoplantillafacturaTotales) {
		this.tipoplantillafacturaTotales = tipoplantillafacturaTotales;
	}	
	
	public TipoPlantillaFactura gettipoplantillafacturaBean() {
		return this.tipoplantillafacturaBean;
	}

	public void settipoplantillafacturaBean(TipoPlantillaFactura tipoplantillafacturaBean) {
		this.tipoplantillafacturaBean = tipoplantillafacturaBean;
	}	
	
	public TipoPlantillaFacturaParameterReturnGeneral gettipoplantillafacturaReturnGeneral() {
		return this.tipoplantillafacturaReturnGeneral;
	}

	public void settipoplantillafacturaReturnGeneral(TipoPlantillaFacturaParameterReturnGeneral tipoplantillafacturaReturnGeneral) {
		this.tipoplantillafacturaReturnGeneral = tipoplantillafacturaReturnGeneral;
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
	
	
	public TipoPlantillaFacturaLogic getTipoPlantillaFacturaLogic()	{		
		return tipoplantillafacturaLogic;
	}

	public void setTipoPlantillaFacturaLogic(TipoPlantillaFacturaLogic tipoplantillafacturaLogic) {
		this.tipoplantillafacturaLogic = tipoplantillafacturaLogic;
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
	
	public Boolean getIsEsNuevoTipoPlantillaFactura() {
		return isEsNuevoTipoPlantillaFactura;
	}

	public void setIsEsNuevoTipoPlantillaFactura(Boolean isEsNuevoTipoPlantillaFactura) {
		this.isEsNuevoTipoPlantillaFactura = isEsNuevoTipoPlantillaFactura;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoPlantillaFactura() {
		return esParaAccionDesdeFormularioTipoPlantillaFactura;
	}
	
	public void setEsParaAccionDesdeFormularioTipoPlantillaFactura(Boolean esParaAccionDesdeFormularioTipoPlantillaFactura) {
		this.esParaAccionDesdeFormularioTipoPlantillaFactura = esParaAccionDesdeFormularioTipoPlantillaFactura;
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

			if(this.tipoplantillafacturaSessionBean==null) {
				this.tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean();
			}

			if(!this.tipoplantillafacturaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoplantillafacturaSessionBean.getlidEmpresaActual());
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

					if(this.tipoplantillafactura!=null) {
						this.tipoplantillafactura.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
						this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoPlantillaFactura.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
						if(this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoPlantillaFacturaGenerico)throws Exception
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
				jComboBoxid_empresaTipoPlantillaFacturaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoPlantillaFacturaGenerico!=null && jComboBoxid_empresaTipoPlantillaFacturaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoPlantillaFacturaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoPlantillaFactura tipoplantillafactura,JComboBox jComboBoxid_empresaTipoPlantillaFacturaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoPlantillaFacturaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoPlantillaFacturaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoplantillafactura.setid_empresa(empresaAux.getId());
				tipoplantillafactura.setempresa_descripcion(TipoPlantillaFacturaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoplantillafactura.setEmpresa(empresaAux);			}
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

					if(!TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { 
							this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { 
					}

					if(!TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
							this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
							this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoPlantillaFactura() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoPlantillaFacturaConstantesFunciones.refrescarForeignKeysDescripcionesTipoPlantillaFactura(this.tipoplantillafacturaLogic.getTipoPlantillaFacturas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoPlantillaFacturaConstantesFunciones.refrescarForeignKeysDescripcionesTipoPlantillaFactura(this.tipoplantillafacturas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoplantillafacturaLogic.setTipoPlantillaFacturas(this.tipoplantillafacturas);
			tipoplantillafacturaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoPlantillaFacturaParameterReturnGeneral getTipoPlantillaFacturaParameterGeneral() {
		return this.tipoplantillafacturaParameterGeneral;
	}
	
	public void setTipoPlantillaFacturaParameterGeneral(TipoPlantillaFacturaParameterReturnGeneral tipoplantillafacturaParameterGeneral) {
		this.tipoplantillafacturaParameterGeneral = tipoplantillafacturaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoPlantillaFactura() {
		return isPermisoTodoTipoPlantillaFactura;
	}

	public void setIsPermisoTodoTipoPlantillaFactura(Boolean isPermisoTodoTipoPlantillaFactura) {
		this.isPermisoTodoTipoPlantillaFactura = isPermisoTodoTipoPlantillaFactura;
	}

	public Boolean getIsPermisoNuevoTipoPlantillaFactura() {
		return isPermisoNuevoTipoPlantillaFactura;
	}

	public void setIsPermisoNuevoTipoPlantillaFactura(Boolean isPermisoNuevoTipoPlantillaFactura) {
		this.isPermisoNuevoTipoPlantillaFactura = isPermisoNuevoTipoPlantillaFactura;
	}

	public Boolean getIsPermisoActualizarTipoPlantillaFactura() {
		return isPermisoActualizarTipoPlantillaFactura;
	}

	public void setIsPermisoActualizarTipoPlantillaFactura(Boolean isPermisoActualizarTipoPlantillaFactura) {
		this.isPermisoActualizarTipoPlantillaFactura = isPermisoActualizarTipoPlantillaFactura;
	}

	public Boolean getIsPermisoEliminarTipoPlantillaFactura() {
		return isPermisoEliminarTipoPlantillaFactura;
	}

	public void setIsPermisoEliminarTipoPlantillaFactura(Boolean isPermisoEliminarTipoPlantillaFactura) {
		this.isPermisoEliminarTipoPlantillaFactura = isPermisoEliminarTipoPlantillaFactura;
	}

	public Boolean getIsPermisoGuardarCambiosTipoPlantillaFactura() {
		return isPermisoGuardarCambiosTipoPlantillaFactura;
	}

	public void setIsPermisoGuardarCambiosTipoPlantillaFactura(Boolean isPermisoGuardarCambiosTipoPlantillaFactura) {
		this.isPermisoGuardarCambiosTipoPlantillaFactura = isPermisoGuardarCambiosTipoPlantillaFactura;
	}
	
	public Boolean getIsPermisoConsultaTipoPlantillaFactura() {
		return isPermisoConsultaTipoPlantillaFactura;
	}

	public void setIsPermisoConsultaTipoPlantillaFactura(Boolean isPermisoConsultaTipoPlantillaFactura) {
		this.isPermisoConsultaTipoPlantillaFactura = isPermisoConsultaTipoPlantillaFactura;
	}

	public Boolean getIsPermisoBusquedaTipoPlantillaFactura() {
		return isPermisoBusquedaTipoPlantillaFactura;
	}

	public void setIsPermisoBusquedaTipoPlantillaFactura(Boolean isPermisoBusquedaTipoPlantillaFactura) {
		this.isPermisoBusquedaTipoPlantillaFactura = isPermisoBusquedaTipoPlantillaFactura;
	}

	public Boolean getIsPermisoReporteTipoPlantillaFactura() {
		return isPermisoReporteTipoPlantillaFactura;
	}

	public void setIsPermisoReporteTipoPlantillaFactura(Boolean isPermisoReporteTipoPlantillaFactura) {
		this.isPermisoReporteTipoPlantillaFactura = isPermisoReporteTipoPlantillaFactura;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoPlantillaFactura() {
		return isPermisoPaginacionMedioTipoPlantillaFactura;
	}

	public void setIsPermisoPaginacionMedioTipoPlantillaFactura(Boolean isPermisoPaginacionMedioTipoPlantillaFactura) {
		this.isPermisoPaginacionMedioTipoPlantillaFactura = isPermisoPaginacionMedioTipoPlantillaFactura;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoPlantillaFactura() {
		return isPermisoPaginacionTodoTipoPlantillaFactura;
	}

	public void setIsPermisoPaginacionTodoTipoPlantillaFactura(Boolean isPermisoPaginacionTodoTipoPlantillaFactura) {
		this.isPermisoPaginacionTodoTipoPlantillaFactura = isPermisoPaginacionTodoTipoPlantillaFactura;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoPlantillaFactura() {
		return isPermisoPaginacionAltoTipoPlantillaFactura;
	}

	public void setIsPermisoPaginacionAltoTipoPlantillaFactura(Boolean isPermisoPaginacionAltoTipoPlantillaFactura) {
		this.isPermisoPaginacionAltoTipoPlantillaFactura = isPermisoPaginacionAltoTipoPlantillaFactura;
	}
	
	public Boolean getIsPermisoCopiarTipoPlantillaFactura() {
		return isPermisoCopiarTipoPlantillaFactura;
	}

	public void setIsPermisoCopiarTipoPlantillaFactura(Boolean isPermisoCopiarTipoPlantillaFactura) {
		this.isPermisoCopiarTipoPlantillaFactura = isPermisoCopiarTipoPlantillaFactura;
	}
	
	public Boolean getIsPermisoVerFormTipoPlantillaFactura() {
		return isPermisoVerFormTipoPlantillaFactura;
	}

	public void setIsPermisoVerFormTipoPlantillaFactura(Boolean isPermisoVerFormTipoPlantillaFactura) {
		this.isPermisoVerFormTipoPlantillaFactura = isPermisoVerFormTipoPlantillaFactura;
	}
	
	public Boolean getIsPermisoDuplicarTipoPlantillaFactura() {
		return isPermisoDuplicarTipoPlantillaFactura;
	}

	public void setIsPermisoDuplicarTipoPlantillaFactura(Boolean isPermisoDuplicarTipoPlantillaFactura) {
		this.isPermisoDuplicarTipoPlantillaFactura = isPermisoDuplicarTipoPlantillaFactura;
	}
	
	public Boolean getIsPermisoOrdenTipoPlantillaFactura() {
		return isPermisoOrdenTipoPlantillaFactura;
	}

	public void setIsPermisoOrdenTipoPlantillaFactura(Boolean isPermisoOrdenTipoPlantillaFactura) {
		this.isPermisoOrdenTipoPlantillaFactura = isPermisoOrdenTipoPlantillaFactura;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoPlantillaFactura() {
		return isVisibilidadCeldaNuevoTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaNuevoTipoPlantillaFactura(Boolean isVisibilidadCeldaNuevoTipoPlantillaFactura) {
		this.isVisibilidadCeldaNuevoTipoPlantillaFactura = isVisibilidadCeldaNuevoTipoPlantillaFactura;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoPlantillaFactura() {
		return isVisibilidadCeldaDuplicarTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaDuplicarTipoPlantillaFactura(Boolean isVisibilidadCeldaDuplicarTipoPlantillaFactura) {
		this.isVisibilidadCeldaDuplicarTipoPlantillaFactura = isVisibilidadCeldaDuplicarTipoPlantillaFactura;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoPlantillaFactura() {
		return isVisibilidadCeldaCopiarTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaCopiarTipoPlantillaFactura(Boolean isVisibilidadCeldaCopiarTipoPlantillaFactura) {
		this.isVisibilidadCeldaCopiarTipoPlantillaFactura = isVisibilidadCeldaCopiarTipoPlantillaFactura;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoPlantillaFactura() {
		return isVisibilidadCeldaVerFormTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaVerFormTipoPlantillaFactura(Boolean isVisibilidadCeldaVerFormTipoPlantillaFactura) {
		this.isVisibilidadCeldaVerFormTipoPlantillaFactura = isVisibilidadCeldaVerFormTipoPlantillaFactura;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoPlantillaFactura() {
		return isVisibilidadCeldaOrdenTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaOrdenTipoPlantillaFactura(Boolean isVisibilidadCeldaOrdenTipoPlantillaFactura) {
		this.isVisibilidadCeldaOrdenTipoPlantillaFactura = isVisibilidadCeldaOrdenTipoPlantillaFactura;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura() {
		return isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura(Boolean isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura) {
		this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura = isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoPlantillaFactura() {
		return isVisibilidadCeldaModificarTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaModificarTipoPlantillaFactura(Boolean isVisibilidadCeldaModificarTipoPlantillaFactura) {
		this.isVisibilidadCeldaModificarTipoPlantillaFactura = isVisibilidadCeldaModificarTipoPlantillaFactura;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoPlantillaFactura() {
		return isVisibilidadCeldaActualizarTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaActualizarTipoPlantillaFactura(Boolean isVisibilidadCeldaActualizarTipoPlantillaFactura) {
		this.isVisibilidadCeldaActualizarTipoPlantillaFactura = isVisibilidadCeldaActualizarTipoPlantillaFactura;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoPlantillaFactura() {
		return isVisibilidadCeldaEliminarTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaEliminarTipoPlantillaFactura(Boolean isVisibilidadCeldaEliminarTipoPlantillaFactura) {
		this.isVisibilidadCeldaEliminarTipoPlantillaFactura = isVisibilidadCeldaEliminarTipoPlantillaFactura;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoPlantillaFactura() {
		return isVisibilidadCeldaCancelarTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaCancelarTipoPlantillaFactura(Boolean isVisibilidadCeldaCancelarTipoPlantillaFactura) {
		this.isVisibilidadCeldaCancelarTipoPlantillaFactura = isVisibilidadCeldaCancelarTipoPlantillaFactura;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoPlantillaFactura() {
		return isVisibilidadCeldaGuardarTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaGuardarTipoPlantillaFactura(Boolean isVisibilidadCeldaGuardarTipoPlantillaFactura) {
		this.isVisibilidadCeldaGuardarTipoPlantillaFactura = isVisibilidadCeldaGuardarTipoPlantillaFactura;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoPlantillaFactura() {
		return isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoPlantillaFactura(Boolean isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura) {
		this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura = isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura;
	}
		
	public TipoPlantillaFacturaSessionBean gettipoplantillafacturaSessionBean() {
		return this.tipoplantillafacturaSessionBean;
	}
	
	public void settipoplantillafacturaSessionBean(TipoPlantillaFacturaSessionBean tipoplantillafacturaSessionBean) {
		this.tipoplantillafacturaSessionBean=tipoplantillafacturaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoplantillafactura,null);
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
	
	public void bugActualizarReferenciaActual(TipoPlantillaFactura tipoplantillafactura,TipoPlantillaFactura tipoplantillafacturaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoPlantillaFactura(tipoplantillafactura);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoplantillafacturaAux.setId(tipoplantillafactura.getId());
		tipoplantillafacturaAux.setVersionRow(tipoplantillafactura.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoPlantillaFactura();
		
			int intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.tipoplantillafactura,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoplantillafacturaValidator.getInvalidValues(this.tipoplantillafactura);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoplantillafacturaLogic.setDatosCliente(datosCliente);
			tipoplantillafacturaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoplantillafacturaAux=new  TipoPlantillaFactura();
				
				tipoplantillafacturaAux.setIsNew(true);
				tipoplantillafacturaAux.setIsChanged(true);
				
				tipoplantillafacturaAux.setTipoPlantillaFacturaOriginal(this.tipoplantillafactura);
				
				tipoplantillafacturaAux.setId(this.tipoplantillafactura.getId());	
				tipoplantillafacturaAux.setVersionRow(this.tipoplantillafactura.getVersionRow());	
				tipoplantillafacturaAux.setid_empresa(this.tipoplantillafactura.getid_empresa());	
				tipoplantillafacturaAux.setcodigo(this.tipoplantillafactura.getcodigo());	
				tipoplantillafacturaAux.setnombre(this.tipoplantillafactura.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoplantillafacturaAux,tipoplantillafacturaLogic.getTipoPlantillaFacturas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoplantillafacturaAux,tipoplantillafacturas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoplantillafacturaLogic.saveTipoPlantillaFacturas();//WithConnection
						//tipoplantillafacturaLogic.getSetVersionRowTipoPlantillaFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoplantillafactura,tipoplantillafacturaAux);
					
					this.refrescarForeignKeysDescripcionesTipoPlantillaFactura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoplantillafacturaAux=new  TipoPlantillaFactura();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado() && this.tipoplantillafactura.getId()>=0)) {
						
					tipoplantillafacturaAux.setIsNew(false);
				}
				
				tipoplantillafacturaAux.setIsDeleted(false);
			
				tipoplantillafacturaAux.setId(this.tipoplantillafactura.getId());	
				tipoplantillafacturaAux.setVersionRow(this.tipoplantillafactura.getVersionRow());	
				tipoplantillafacturaAux.setid_empresa(this.tipoplantillafactura.getid_empresa());	
				tipoplantillafacturaAux.setcodigo(this.tipoplantillafactura.getcodigo());	
				tipoplantillafacturaAux.setnombre(this.tipoplantillafactura.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoplantillafacturaAux,tipoplantillafacturaLogic.getTipoPlantillaFacturas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoplantillafacturaAux,tipoplantillafacturas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoplantillafacturaLogic.saveTipoPlantillaFacturas();//WithConnection
						//tipoplantillafacturaLogic.getSetVersionRowTipoPlantillaFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoplantillafactura,tipoplantillafacturaAux);
					
					this.refrescarForeignKeysDescripcionesTipoPlantillaFactura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoplantillafacturaAux=new  TipoPlantillaFactura();
				
				tipoplantillafacturaAux.setIsNew(false);
				tipoplantillafacturaAux.setIsChanged(false);
				
				tipoplantillafacturaAux.setIsDeleted(true);
				
				tipoplantillafacturaAux.setId(this.tipoplantillafactura.getId());	
				tipoplantillafacturaAux.setVersionRow(this.tipoplantillafactura.getVersionRow());	
				tipoplantillafacturaAux.setid_empresa(this.tipoplantillafactura.getid_empresa());	
				tipoplantillafacturaAux.setcodigo(this.tipoplantillafactura.getcodigo());	
				tipoplantillafacturaAux.setnombre(this.tipoplantillafactura.getnombre());	
				
				if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoplantillafacturaAux.getId()>=0) {	
						this.tipoplantillafacturasEliminados.add(tipoplantillafacturaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoplantillafacturaAux,tipoplantillafacturaLogic.getTipoPlantillaFacturas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoplantillafacturaAux,tipoplantillafacturas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoplantillafacturaLogic.saveTipoPlantillaFacturas();//WithConnection
						//tipoplantillafacturaLogic.getSetVersionRowTipoPlantillaFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoplantillafacturaAux,tipoplantillafacturaLogic.getTipoPlantillaFacturas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoplantillafacturaAux,tipoplantillafacturas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().addAll(this.tipoplantillafacturasEliminados);
					
					tipoplantillafacturaLogic.saveTipoPlantillaFacturas();//WithConnection
					//tipoplantillafacturaLogic.getSetVersionRowTipoPlantillaFacturas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoPlantillaFactura();
				
				this.tipoplantillafacturasEliminados= new ArrayList<TipoPlantillaFactura>();		
			}
			
			if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Plantilla Factura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Plantilla Factura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoplantillafactura=tipoplantillafacturaAux;
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
      		//this.finishProcessTipoPlantillaFactura();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoPlantillaFactura tipoplantillafacturaLocal) throws Exception {
		
		if(this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoPlantillaFactura tipoplantillafacturaLocal) throws Exception {	
		if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoplantillafacturaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoPlantillaFacturaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoplantillafacturaValidator.getInvalidValues(this.tipoplantillafactura);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoPlantillaFactura tipoplantillafactura,List<TipoPlantillaFactura> tipoplantillafacturas) throws Exception {
		try	{		
			TipoPlantillaFacturaConstantesFunciones.actualizarLista(tipoplantillafactura,tipoplantillafacturas,this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoPlantillaFactura tipoplantillafactura,List<TipoPlantillaFactura> tipoplantillafacturas) throws Exception {
		try	{			
			TipoPlantillaFacturaConstantesFunciones.actualizarSelectedLista(tipoplantillafactura,tipoplantillafacturas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoPlantillaFactura> tipoplantillafacturasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoplantillafacturasLocal=this.tipoplantillafacturaLogic.getTipoPlantillaFacturas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoplantillafacturasLocal=this.tipoplantillafacturas;
			}
			//ARCHITECTURE
		
			for(TipoPlantillaFactura tipoplantillafacturaLocal:tipoplantillafacturasLocal) {
				if(this.permiteMantenimiento(tipoplantillafacturaLocal) && tipoplantillafacturaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoPlantillaFacturaConstantesFunciones.getTipoPlantillaFacturaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoPlantillaFacturaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelid_empresaTipoPlantillaFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPlantillaFacturaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelcodigoTipoPlantillaFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPlantillaFacturaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelnombreTipoPlantillaFactura,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelid_empresaTipoPlantillaFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelcodigoTipoPlantillaFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelnombreTipoPlantillaFactura,"");
		
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
		this.iIdNuevoTipoPlantillaFactura--;	
		
		
		this.tipoplantillafacturaAux=new TipoPlantillaFactura();
		
		this.tipoplantillafacturaAux.setId(this.iIdNuevoTipoPlantillaFactura);
		this.tipoplantillafacturaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().add(this.tipoplantillafacturaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoplantillafacturas.add(this.tipoplantillafacturaAux);
		}
		//ARCHITECTURE
		
		this.tipoplantillafactura=this.tipoplantillafacturaAux;
		
		if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoPlantillaFactura(this.tipoplantillafactura);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPlantillaFactura(this.tipoplantillafactura);
		}
				
		//this.setDefaultControlesTipoPlantillaFactura();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoPlantillaFactura();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoPlantillaFactura();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPlantillaFactura();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPlantillaFactura(this.tipoplantillafacturaBean,this.tipoplantillafactura,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
			classes=TipoPlantillaFacturaConstantesFunciones.getClassesRelationshipsOfTipoPlantillaFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoplantillafacturaReturnGeneral=tipoplantillafacturaLogic.procesarEventosTipoPlantillaFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoplantillafacturaLogic.getTipoPlantillaFacturas(),this.tipoplantillafactura,this.tipoplantillafacturaParameterGeneral,this.isEsNuevoTipoPlantillaFactura,classes);//this.tipoplantillafacturaLogic.getTipoPlantillaFactura()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoPlantillaFactura(this.tipoplantillafacturaReturnGeneral,this.tipoplantillafacturaBean,false);
		
		if(this.tipoplantillafacturaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPlantillaFactura(this.tipoplantillafacturaReturnGeneral.getTipoPlantillaFactura());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoPlantillaFactura(this.tipoplantillafacturaReturnGeneral.getTipoPlantillaFactura());
		}
		
		if(this.tipoplantillafacturaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoPlantillaFactura(this.tipoplantillafacturaReturnGeneral.getTipoPlantillaFactura(),classes);//this.tipoplantillafacturaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.tipoplantillafactura,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoPlantillaFactura();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoPlantillaFactura();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoPlantillaFactura(false);
						
			if(tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPlantillaFactura();
			}
			
			this.actualizarVisualTableDatosTipoPlantillaFactura();
			
			this.jTableDatosTipoPlantillaFactura.setRowSelectionInterval(this.getIndiceNuevoTipoPlantillaFactura(), this.getIndiceNuevoTipoPlantillaFactura());
			
			this.seleccionarFilaTablaTipoPlantillaFacturaActual();
						
			this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoPlantillaFactura(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextFieldcodigoTipoPlantillaFactura.setEnabled(isHabilitar && this.tipoplantillafacturaConstantesFunciones.activarcodigoTipoPlantillaFactura);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextAreanombreTipoPlantillaFactura.setEnabled(isHabilitar && this.tipoplantillafacturaConstantesFunciones.activarnombreTipoPlantillaFactura);	
		//
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.setEnabled(isHabilitar && this.tipoplantillafacturaConstantesFunciones.activarid_empresaTipoPlantillaFactura);
	};
	
	public void setDefaultControlesTipoPlantillaFactura() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoPlantillaFactura(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoplantillafacturaSessionBean.setConGuardarRelaciones(true);			
			this.tipoplantillafacturaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jTabbedPaneRelacionesTipoPlantillaFactura.setVisible(true);
			
					
		} else {
			//this.tipoplantillafacturaSessionBean.setConGuardarRelaciones(false);			
			this.tipoplantillafacturaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jTabbedPaneRelacionesTipoPlantillaFactura.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoPlantillaFactura() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
				if(tipoplantillafacturaAux.getId().equals(this.iIdNuevoTipoPlantillaFactura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturas) {
				if(tipoplantillafacturaAux.getId().equals(this.iIdNuevoTipoPlantillaFactura)) {
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
	
	public int getIndiceActualTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
				if(tipoplantillafacturaAux.getId().equals(tipoplantillafactura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturas) {
				if(tipoplantillafacturaAux.getId().equals(tipoplantillafactura.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafacturaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
				if(tipoplantillafacturaAux.getTipoPlantillaFacturaOriginal().getId().equals(tipoplantillafacturaOriginal.getId())) {
					existe=true;
					tipoplantillafacturaOriginal.setId(tipoplantillafacturaAux.getId());
					tipoplantillafacturaOriginal.setVersionRow(tipoplantillafacturaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturas) {
				if(tipoplantillafacturaAux.getTipoPlantillaFacturaOriginal().getId().equals(tipoplantillafacturaOriginal.getId())) {
					existe=true;
					tipoplantillafacturaOriginal.setId(tipoplantillafacturaAux.getId());
					tipoplantillafacturaOriginal.setVersionRow(tipoplantillafacturaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoPlantillaFactura(Boolean esParaCancelar) throws Exception {
		tipoplantillafacturasAux=new ArrayList<TipoPlantillaFactura>();
		tipoplantillafacturaAux=new TipoPlantillaFactura();
		
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
					if(tipoplantillafacturaAux.getId()<0) {
						tipoplantillafacturasAux.add(tipoplantillafacturaAux);
					}		
				}
				this.iIdNuevoTipoPlantillaFactura=0L;
				this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().removeAll(tipoplantillafacturasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturas) {
					if(tipoplantillafacturaAux.getId()<0) {
						tipoplantillafacturasAux.add(tipoplantillafacturaAux);
					}		
				}
				this.iIdNuevoTipoPlantillaFactura=0L;
				this.tipoplantillafacturas.removeAll(tipoplantillafacturasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoPlantillaFactura 
					&& this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().size()>0
					) {
					tipoplantillafacturaAux=this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().get(this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().size() - 1);
				
					if(tipoplantillafacturaAux.getId()<0) {
						this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().remove(tipoplantillafacturaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoPlantillaFactura && this.tipoplantillafacturas.size()>0) {
					tipoplantillafacturaAux=this.tipoplantillafacturas.get(this.tipoplantillafacturas.size() - 1);
				
					if(tipoplantillafacturaAux.getId()<0) {
						this.tipoplantillafacturas.remove(tipoplantillafacturaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoPlantillaFactura(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoplantillafactura.getId()<0) {
				this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().remove(this.tipoplantillafactura);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoplantillafactura.getId()<0) {
				this.tipoplantillafacturas.remove(this.tipoplantillafactura);
			}
		}			
	}
	
	public void setEstadosInicialesTipoPlantillaFactura(List<TipoPlantillaFactura> tipoplantillafacturasAux) throws Exception {
		TipoPlantillaFacturaConstantesFunciones.setEstadosInicialesTipoPlantillaFactura(tipoplantillafacturasAux);
	}
	
	public void setEstadosInicialesTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafacturaAux) throws Exception {
		TipoPlantillaFacturaConstantesFunciones.setEstadosInicialesTipoPlantillaFactura(tipoplantillafacturaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoPlantillaFacturaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoPlantillaFacturaActual()) {
				if(!this.isEsNuevoTipoPlantillaFactura) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoPlantillaFactura=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoPlantillaFacturaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Plantilla Factura ?", "MANTENIMIENTO DE Tipo Plantilla Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoPlantillaFactura tipoplantillafactura) throws Exception {
		TipoPlantillaFacturaConstantesFunciones.seleccionarAsignar(this.tipoplantillafactura,tipoplantillafactura);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoPlantillaFactura=this.isPermisoActualizarOriginalTipoPlantillaFactura;
			
			
			this.seleccionarAsignar(tipoplantillafactura);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPlantillaFacturaConstantesFunciones.quitarEspaciosTipoPlantillaFactura(this.tipoplantillafactura,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoplantillafacturaSessionBean.setsFuncionBusquedaRapida(this.tipoplantillafacturaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoPlantillaFactura) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoPlantillaFactura(esParaCancelar);				
				this.cancelarNuevoTipoPlantillaFactura(esParaCancelar);								
			}
			
			this.tipoplantillafactura=new TipoPlantillaFactura();
			
			this.inicializarTipoPlantillaFactura();
			
			this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoPlantillaFactura() throws Exception {
		try {
			TipoPlantillaFacturaConstantesFunciones.inicializarTipoPlantillaFactura(this.tipoplantillafactura);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoPlantillaFacturas(String sAccionBusqueda,List<TipoPlantillaFactura> tipoplantillafacturasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoPlantillaFactura"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoPlantillaFacturaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoPlantillaFacturaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoPlantillaFactura"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Plantilla Facturas");		
		parameters.put("busquedapor", TipoPlantillaFacturaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoPlantillaFactura=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoPlantillaFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoPlantillaFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoPlantillaFactura=new JRBeanArrayDataSource(TipoPlantillaFacturaJInternalFrame.TraerTipoPlantillaFacturaBeans(tipoplantillafacturasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoPlantillaFactura);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoPlantillaFacturaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoPlantillaFacturaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoPlantillaFacturaBean.TraerTipoPlantillaFacturaBeans(tipoplantillafacturasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoPlantillaFacturas(sAccionBusqueda,sTipoArchivoReporte,tipoplantillafacturasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoPlantillaFacturas(sAccionBusqueda,sTipoArchivoReporte,tipoplantillafacturasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoPlantillaFacturaActionPerformed(null);
					//this.generarExcelReporteTipoPlantillaFacturas(sAccionBusqueda,sTipoArchivoReporte,tipoplantillafacturasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoPlantillaFacturas(sAccionBusqueda,sTipoArchivoReporte,tipoplantillafacturasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoPlantillaFacturas(sAccionBusqueda,sTipoArchivoReporte,tipoplantillafacturasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoPlantillaFacturas(sAccionBusqueda,sTipoArchivoReporte,tipoplantillafacturasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoPlantillaFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPlantillaFactura> tipoplantillafacturasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoplantillafactura";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPlantillaFacturas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPlantillaFactura("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoPlantillaFactura tipoplantillafactura : tipoplantillafacturasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoPlantillaFacturaConstantesFunciones.generarExcelReporteDataTipoPlantillaFactura("NORMAL",row,workbook,tipoplantillafactura,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plantilla Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoPlantillaFactura(String sTipo,Row row,Workbook workbook) {
		
		TipoPlantillaFacturaConstantesFunciones.generarExcelReporteHeaderTipoPlantillaFactura(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoPlantillaFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPlantillaFactura> tipoplantillafacturasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoplantillafactura_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPlantillaFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoPlantillaFactura tipoplantillafactura : tipoplantillafacturasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.getTipoPlantillaFacturaDescripcion(tipoplantillafactura));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoplantillafactura.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoplantillafactura.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoplantillafactura.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plantilla Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoPlantillaFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPlantillaFactura> tipoplantillafacturasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoPlantillaFactura> tipoplantillafacturasRespaldo=null;
		
		classes=TipoPlantillaFacturaConstantesFunciones.getClassesRelationshipsOfTipoPlantillaFactura(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoplantillafacturaLogic.setDatosCliente(this.datosCliente);
		this.tipoplantillafacturaLogic.setDatosDeep(this.datosDeep);
		this.tipoplantillafacturaLogic.setIsConDeep(true);
		
		tipoplantillafacturasRespaldo=this.tipoplantillafacturaLogic.getTipoPlantillaFacturas();
		
		this.tipoplantillafacturaLogic.setTipoPlantillaFacturas(tipoplantillafacturasParaReportes);	
		this.tipoplantillafacturaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoplantillafacturasParaReportes=this.tipoplantillafacturaLogic.getTipoPlantillaFacturas();
		this.tipoplantillafacturaLogic.setTipoPlantillaFacturas(tipoplantillafacturasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoplantillafactura_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPlantillaFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPlantillaFactura("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoPlantillaFactura tipoplantillafactura : tipoplantillafacturasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoPlantillaFactura("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoPlantillaFacturaConstantesFunciones.generarExcelReporteDataTipoPlantillaFactura("NORMAL",row,workbook,tipoplantillafactura,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.getTipoPlantillaFacturaDescripcion(tipoplantillafactura));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plantilla Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoPlantillaFactura() throws Exception {		
		this.startProcessTipoPlantillaFactura(true);
	}
	
	public void startProcessTipoPlantillaFactura(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoPlantillaFactura ,this.jPanelParametrosReportesTipoPlantillaFactura, this.jScrollPanelDatosTipoPlantillaFactura,this.jPanelPaginacionTipoPlantillaFactura, this.jScrollPanelDatosEdicionTipoPlantillaFactura, this.jPanelAccionesTipoPlantillaFactura,this.jPanelAccionesFormularioTipoPlantillaFactura,this.jmenuBarTipoPlantillaFactura,this.jmenuBarDetalleTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,this.jTtoolBarDetalleTipoPlantillaFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPlantillaFactura=this.jTabbedPaneBusquedasTipoPlantillaFactura; 
		
		final JPanel jPanelParametrosReportesTipoPlantillaFactura=this.jPanelParametrosReportesTipoPlantillaFactura;
		//final JScrollPane jScrollPanelDatosTipoPlantillaFactura=this.jScrollPanelDatosTipoPlantillaFactura;
		final JTable jTableDatosTipoPlantillaFactura=this.jTableDatosTipoPlantillaFactura;		
		final JPanel jPanelPaginacionTipoPlantillaFactura=this.jPanelPaginacionTipoPlantillaFactura;
		//final JScrollPane jScrollPanelDatosEdicionTipoPlantillaFactura=this.jScrollPanelDatosEdicionTipoPlantillaFactura;
		final JPanel jPanelAccionesTipoPlantillaFactura=this.jPanelAccionesTipoPlantillaFactura;
		
		JPanel jPanelCamposAuxiliarTipoPlantillaFactura=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoPlantillaFactura=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			jPanelCamposAuxiliarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jPanelCamposTipoPlantillaFactura;
			jPanelAccionesFormularioAuxiliarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jPanelAccionesFormularioTipoPlantillaFactura;
		}
		
		final JPanel jPanelCamposTipoPlantillaFactura=jPanelCamposAuxiliarTipoPlantillaFactura;
		final JPanel jPanelAccionesFormularioTipoPlantillaFactura=jPanelAccionesFormularioAuxiliarTipoPlantillaFactura;
		
		
		final JMenuBar jmenuBarTipoPlantillaFactura=this.jmenuBarTipoPlantillaFactura;
		final JToolBar jTtoolBarTipoPlantillaFactura=this.jTtoolBarTipoPlantillaFactura;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoPlantillaFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPlantillaFactura=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			jmenuBarDetalleAuxiliarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jmenuBarDetalleTipoPlantillaFactura;
			jTtoolBarDetalleAuxiliarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jTtoolBarDetalleTipoPlantillaFactura;
		}
		
		final JMenuBar jmenuBarDetalleTipoPlantillaFactura=jmenuBarDetalleAuxiliarTipoPlantillaFactura;
		final JToolBar jTtoolBarDetalleTipoPlantillaFactura=jTtoolBarDetalleAuxiliarTipoPlantillaFactura;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPlantillaFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPlantillaFactura;
			processRunnable.jTableDatos=jTableDatosTipoPlantillaFactura;
			processRunnable.jPanelCampos=jPanelCamposTipoPlantillaFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPlantillaFactura;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPlantillaFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPlantillaFactura;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPlantillaFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPlantillaFactura;
			processRunnable.jTtoolBar=jTtoolBarTipoPlantillaFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPlantillaFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPlantillaFactura ,jPanelParametrosReportesTipoPlantillaFactura,jTableDatosTipoPlantillaFactura, /*jScrollPanelDatosTipoPlantillaFactura,*/jPanelCamposTipoPlantillaFactura,jPanelPaginacionTipoPlantillaFactura, /*jScrollPanelDatosEdicionTipoPlantillaFactura,*/ jPanelAccionesTipoPlantillaFactura,jPanelAccionesFormularioTipoPlantillaFactura,jmenuBarTipoPlantillaFactura,jmenuBarDetalleTipoPlantillaFactura,jTtoolBarTipoPlantillaFactura,jTtoolBarDetalleTipoPlantillaFactura);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPlantillaFactura ,jPanelParametrosReportesTipoPlantillaFactura, jScrollPanelDatosTipoPlantillaFactura,jPanelPaginacionTipoPlantillaFactura, jScrollPanelDatosEdicionTipoPlantillaFactura, jPanelAccionesTipoPlantillaFactura,jPanelAccionesFormularioTipoPlantillaFactura,jmenuBarTipoPlantillaFactura,jmenuBarDetalleTipoPlantillaFactura,jTtoolBarTipoPlantillaFactura,jTtoolBarDetalleTipoPlantillaFactura);
						
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
	
	public void finishProcessTipoPlantillaFactura() {// throws Exception 
		this.finishProcessTipoPlantillaFactura(true);
	}
	
	public void finishProcessTipoPlantillaFactura(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoPlantillaFactura ,this.jPanelParametrosReportesTipoPlantillaFactura, this.jScrollPanelDatosTipoPlantillaFactura,this.jPanelPaginacionTipoPlantillaFactura, this.jScrollPanelDatosEdicionTipoPlantillaFactura, this.jPanelAccionesTipoPlantillaFactura,this.jPanelAccionesFormularioTipoPlantillaFactura,this.jmenuBarTipoPlantillaFactura,this.jmenuBarDetalleTipoPlantillaFactura,this.jTtoolBarTipoPlantillaFactura,this.jTtoolBarDetalleTipoPlantillaFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPlantillaFactura=this.jTabbedPaneBusquedasTipoPlantillaFactura; 
		
		final JPanel jPanelParametrosReportesTipoPlantillaFactura=this.jPanelParametrosReportesTipoPlantillaFactura;
		//final JScrollPane jScrollPanelDatosTipoPlantillaFactura=this.jScrollPanelDatosTipoPlantillaFactura;
		final JTable jTableDatosTipoPlantillaFactura=this.jTableDatosTipoPlantillaFactura;		
		final JPanel jPanelPaginacionTipoPlantillaFactura=this.jPanelPaginacionTipoPlantillaFactura;
		//final JScrollPane jScrollPanelDatosEdicionTipoPlantillaFactura=this.jScrollPanelDatosEdicionTipoPlantillaFactura;
		final JPanel jPanelAccionesTipoPlantillaFactura=this.jPanelAccionesTipoPlantillaFactura;
		
		JPanel jPanelCamposAuxiliarTipoPlantillaFactura=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoPlantillaFactura=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			jPanelCamposAuxiliarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jPanelCamposTipoPlantillaFactura;
			jPanelAccionesFormularioAuxiliarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jPanelAccionesFormularioTipoPlantillaFactura;
		}
		
		final JPanel jPanelCamposTipoPlantillaFactura=jPanelCamposAuxiliarTipoPlantillaFactura;
		final JPanel jPanelAccionesFormularioTipoPlantillaFactura=jPanelAccionesFormularioAuxiliarTipoPlantillaFactura;
		
		
		final JMenuBar jmenuBarTipoPlantillaFactura=this.jmenuBarTipoPlantillaFactura;		
		final JToolBar jTtoolBarTipoPlantillaFactura=this.jTtoolBarTipoPlantillaFactura;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoPlantillaFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPlantillaFactura=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			jmenuBarDetalleAuxiliarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jmenuBarDetalleTipoPlantillaFactura;
			jTtoolBarDetalleAuxiliarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jTtoolBarDetalleTipoPlantillaFactura;		
		}
		
		final JMenuBar jmenuBarDetalleTipoPlantillaFactura=jmenuBarDetalleAuxiliarTipoPlantillaFactura;
		final JToolBar jTtoolBarDetalleTipoPlantillaFactura=jTtoolBarDetalleAuxiliarTipoPlantillaFactura;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPlantillaFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPlantillaFactura;
			processRunnable.jTableDatos=jTableDatosTipoPlantillaFactura;
			processRunnable.jPanelCampos=jPanelCamposTipoPlantillaFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPlantillaFactura;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPlantillaFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPlantillaFactura;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPlantillaFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPlantillaFactura;
			processRunnable.jTtoolBar=jTtoolBarTipoPlantillaFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPlantillaFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoPlantillaFactura ,jPanelParametrosReportesTipoPlantillaFactura, jTableDatosTipoPlantillaFactura,/*jScrollPanelDatosTipoPlantillaFactura,*/jPanelCamposTipoPlantillaFactura,jPanelPaginacionTipoPlantillaFactura, /*jScrollPanelDatosEdicionTipoPlantillaFactura,*/ jPanelAccionesTipoPlantillaFactura,jPanelAccionesFormularioTipoPlantillaFactura,jmenuBarTipoPlantillaFactura,jmenuBarDetalleTipoPlantillaFactura,jTtoolBarTipoPlantillaFactura,jTtoolBarDetalleTipoPlantillaFactura));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoPlantillaFactura(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoPlantillaFactura(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoPlantillaFactura(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoPlantillaFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoPlantillaFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoPlantillaFactura,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoPlantillaFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoPlantillaFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoPlantillaFactura,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoplantillafacturaConstantesFunciones.getsFinalQueryTipoPlantillaFactura();
		String  finalQueryPaginacionTodos=this.tipoplantillafacturaConstantesFunciones.getsFinalQueryTipoPlantillaFactura();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoPlantillaFacturaConstantesFunciones.getArrayColumnasGlobalesNoTipoPlantillaFactura(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoPlantillaFacturaConstantesFunciones.getArrayColumnasGlobalesTipoPlantillaFactura(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoPlantillaFacturaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoplantillafacturasEliminados= new ArrayList<TipoPlantillaFactura>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoPlantillaFactura();
		
				///*TipoPlantillaFacturaSessionBean*/this.tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean();
			
			if(this.tipoplantillafacturaSessionBean==null) {
				this.tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean();
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
					this.iNumeroPaginacion=TipoPlantillaFacturaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoPlantillaFacturaConstantesFunciones.getClassesForeignKeysOfTipoPlantillaFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoplantillafactura."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoplantillafacturasAux= new ArrayList<TipoPlantillaFactura>();
			
				
			tipoplantillafacturaLogic.setDatosCliente(this.datosCliente);
			tipoplantillafacturaLogic.setDatosDeep(this.datosDeep);
			tipoplantillafacturaLogic.setIsConDeep(true);
			
			
			tipoplantillafacturaLogic.getTipoPlantillaFacturaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoplantillafacturaLogic.getTodosTipoPlantillaFacturas(finalQueryGlobal,pagination);
					
					//tipoplantillafacturaLogic.getTodosTipoPlantillaFacturasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoplantillafacturaLogic.getTipoPlantillaFacturas()==null|| tipoplantillafacturaLogic.getTipoPlantillaFacturas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoplantillafacturasAux= new ArrayList<TipoPlantillaFactura>();
							tipoplantillafacturasAux.addAll(tipoplantillafacturaLogic.getTipoPlantillaFacturas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoplantillafacturasAux= new ArrayList<TipoPlantillaFactura>();
							tipoplantillafacturasAux.addAll(tipoplantillafacturas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoplantillafacturaLogic.getTodosTipoPlantillaFacturas(finalQueryGlobal+"",this.pagination);												
							
							//tipoplantillafacturaLogic.getTodosTipoPlantillaFacturasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoPlantillaFacturas("Todos",tipoplantillafacturaLogic.getTipoPlantillaFacturas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoplantillafacturaLogic.setTipoPlantillaFacturas(new ArrayList<TipoPlantillaFactura>());					
							tipoplantillafacturaLogic.getTipoPlantillaFacturas().addAll(tipoplantillafacturasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoplantillafacturas=new ArrayList<TipoPlantillaFactura>();
							tipoplantillafacturas.addAll(tipoplantillafacturasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoPlantillaFactura=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoPlantillaFactura=this.idActual;
				
				} else if(this.idTipoPlantillaFacturaActual!=null && this.idTipoPlantillaFacturaActual!=0L) {
					idTipoPlantillaFactura=idTipoPlantillaFacturaActual;
				}
				
					
				this.sDetalleReporte=TipoPlantillaFacturaConstantesFunciones.getDetalleIndicePorId(idTipoPlantillaFactura);
				
				this.tipoplantillafacturas=new ArrayList<TipoPlantillaFactura>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoplantillafacturaLogic.getEntity(idTipoPlantillaFactura);
					
					//tipoplantillafacturaLogic.getEntityWithConnection(idTipoPlantillaFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoplantillafacturaLogic.setTipoPlantillaFacturas(new ArrayList<TipoPlantillaFactura>());
					tipoplantillafacturaLogic.getTipoPlantillaFacturas().add(tipoplantillafacturaLogic.getTipoPlantillaFactura());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoplantillafacturas=new ArrayList<TipoPlantillaFactura>();
					this.tipoplantillafacturas.add(tipoplantillafactura);
				}
				
				if(tipoplantillafacturaLogic.getTipoPlantillaFactura()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoPlantillaFacturaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoplantillafacturaLogic.getTipoPlantillaFacturasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPlantillaFacturaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPlantillaFacturaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoplantillafacturaLogic.getTipoPlantillaFacturas()==null||tipoplantillafacturaLogic.getTipoPlantillaFacturas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoplantillafacturas==null|| tipoplantillafacturas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoplantillafacturasAux=new ArrayList<TipoPlantillaFactura>();
						tipoplantillafacturasAux.addAll(tipoplantillafacturaLogic.getTipoPlantillaFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoplantillafacturasAux=new ArrayList<TipoPlantillaFactura>();
							tipoplantillafacturasAux.addAll(tipoplantillafacturas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoplantillafacturaLogic.getTipoPlantillaFacturasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPlantillaFacturaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPlantillaFacturaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoPlantillaFacturas("FK_IdEmpresa",tipoplantillafacturaLogic.getTipoPlantillaFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoPlantillaFacturas("FK_IdEmpresa",tipoplantillafacturas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoplantillafacturaLogic.setTipoPlantillaFacturas(new ArrayList<TipoPlantillaFactura>());
						tipoplantillafacturaLogic.getTipoPlantillaFacturas().addAll(tipoplantillafacturasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoplantillafacturas=new ArrayList<TipoPlantillaFactura>();
							tipoplantillafacturas.addAll(tipoplantillafacturasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoPlantillaFactura();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoPlantillaFactura();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoplantillafacturaLogic.getTipoPlantillaFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoplantillafacturas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoplantillafacturaLogic.getTipoPlantillaFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoplantillafacturas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoPlantillaFactura tipoplantillafactura) {
		Boolean permite=true;
		
		if(this.tipoplantillafactura.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoPlantillaFacturaConstantesFunciones.getOrderByListaTipoPlantillaFactura();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoPlantillaFacturaConstantesFunciones.getOrderByListaTipoPlantillaFactura();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPlantillaFactura tipoplantillafactura:tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
				if(tipoplantillafactura.getsType().equals(Constantes2.S_TOTALES)) {
					tipoplantillafacturaTotales=tipoplantillafactura;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPlantillaFactura tipoplantillafactura:this.tipoplantillafacturas) {
				if(tipoplantillafactura.getsType().equals(Constantes2.S_TOTALES)) {
					tipoplantillafacturaTotales=tipoplantillafactura;
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
			this.tipoplantillafacturaAux=new TipoPlantillaFactura();
			this.tipoplantillafacturaAux.setsType(Constantes2.S_TOTALES);
			this.tipoplantillafacturaAux.setIsNew(false);
			this.tipoplantillafacturaAux.setIsChanged(false);
			this.tipoplantillafacturaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoPlantillaFacturaConstantesFunciones.TotalizarValoresFilaTipoPlantillaFactura(this.tipoplantillafacturaLogic.getTipoPlantillaFacturas(),this.tipoplantillafacturaAux);
				
				this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().add(this.tipoplantillafacturaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoPlantillaFacturaConstantesFunciones.TotalizarValoresFilaTipoPlantillaFactura(this.tipoplantillafacturas,this.tipoplantillafacturaAux);
				
				this.tipoplantillafacturas.add(this.tipoplantillafacturaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoplantillafacturaTotales=new TipoPlantillaFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().remove(tipoplantillafacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoplantillafacturas.remove(tipoplantillafacturaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoplantillafacturaTotales=new TipoPlantillaFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPlantillaFactura tipoplantillafactura:tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
				if(tipoplantillafactura.getsType().equals(Constantes2.S_TOTALES)) {
					tipoplantillafacturaTotales=tipoplantillafactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPlantillaFacturaConstantesFunciones.TotalizarValoresFilaTipoPlantillaFactura(this.tipoplantillafacturaLogic.getTipoPlantillaFacturas(),tipoplantillafacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPlantillaFactura tipoplantillafactura:this.tipoplantillafacturas) {
				if(tipoplantillafactura.getsType().equals(Constantes2.S_TOTALES)) {
					tipoplantillafacturaTotales=tipoplantillafactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPlantillaFacturaConstantesFunciones.TotalizarValoresFilaTipoPlantillaFactura(this.tipoplantillafacturas,tipoplantillafacturaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoPlantillaFacturasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoPlantillaFacturasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoplantillafacturaLogic.getTipoPlantillaFacturasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoPlantillaFactura() {
		this.isPermisoTodoTipoPlantillaFactura=false;
		this.isPermisoNuevoTipoPlantillaFactura=false;
		this.isPermisoActualizarTipoPlantillaFactura=false;
		this.isPermisoActualizarOriginalTipoPlantillaFactura=false;
		this.isPermisoEliminarTipoPlantillaFactura=false;
		this.isPermisoGuardarCambiosTipoPlantillaFactura=false;
		this.isPermisoConsultaTipoPlantillaFactura=false;
		this.isPermisoBusquedaTipoPlantillaFactura=false;
		this.isPermisoReporteTipoPlantillaFactura=false;		
		this.isPermisoOrdenTipoPlantillaFactura=false;		
		this.isPermisoPaginacionMedioTipoPlantillaFactura=false;		
		this.isPermisoPaginacionAltoTipoPlantillaFactura=false;
		this.isPermisoPaginacionTodoTipoPlantillaFactura=false;
		this.isPermisoCopiarTipoPlantillaFactura=false;		
		this.isPermisoVerFormTipoPlantillaFactura=false;		
		this.isPermisoDuplicarTipoPlantillaFactura=false;		
		this.isPermisoOrdenTipoPlantillaFactura=false;		
	}
	
	public void setPermisosUsuarioTipoPlantillaFactura(Boolean isPermiso) {
		this.isPermisoTodoTipoPlantillaFactura=isPermiso;
		this.isPermisoNuevoTipoPlantillaFactura=isPermiso;
		this.isPermisoActualizarTipoPlantillaFactura=isPermiso;
		this.isPermisoActualizarOriginalTipoPlantillaFactura=isPermiso;
		this.isPermisoEliminarTipoPlantillaFactura=isPermiso;
		this.isPermisoGuardarCambiosTipoPlantillaFactura=isPermiso;
		this.isPermisoConsultaTipoPlantillaFactura=isPermiso;
		this.isPermisoBusquedaTipoPlantillaFactura=isPermiso;
		this.isPermisoReporteTipoPlantillaFactura=isPermiso;
		this.isPermisoOrdenTipoPlantillaFactura=isPermiso;		
		this.isPermisoPaginacionMedioTipoPlantillaFactura=isPermiso;		
		this.isPermisoPaginacionAltoTipoPlantillaFactura=isPermiso;		
		this.isPermisoPaginacionTodoTipoPlantillaFactura=isPermiso;		
		this.isPermisoCopiarTipoPlantillaFactura=isPermiso;		
		this.isPermisoVerFormTipoPlantillaFactura=isPermiso;		
		this.isPermisoDuplicarTipoPlantillaFactura=isPermiso;
		this.isPermisoOrdenTipoPlantillaFactura=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoPlantillaFactura(Boolean isPermiso) {
		//this.isPermisoTodoTipoPlantillaFactura=isPermiso;
		this.isPermisoNuevoTipoPlantillaFactura=isPermiso;
		this.isPermisoActualizarTipoPlantillaFactura=isPermiso;
		this.isPermisoActualizarOriginalTipoPlantillaFactura=isPermiso;
		this.isPermisoEliminarTipoPlantillaFactura=isPermiso;
		this.isPermisoGuardarCambiosTipoPlantillaFactura=isPermiso;
		//this.isPermisoConsultaTipoPlantillaFactura=isPermiso;
		//this.isPermisoBusquedaTipoPlantillaFactura=isPermiso;
		//this.isPermisoReporteTipoPlantillaFactura=isPermiso;
		//this.isPermisoOrdenTipoPlantillaFactura=isPermiso;		
		//this.isPermisoPaginacionMedioTipoPlantillaFactura=isPermiso;		
		//this.isPermisoPaginacionAltoTipoPlantillaFactura=isPermiso;		
		//this.isPermisoPaginacionTodoTipoPlantillaFactura=isPermiso;		
		//this.isPermisoCopiarTipoPlantillaFactura=isPermiso;		
		//this.isPermisoDuplicarTipoPlantillaFactura=isPermiso;
		//this.isPermisoOrdenTipoPlantillaFactura=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoPlantillaFacturaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoPlantillaFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoPlantillaFactura(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoPlantillaFacturaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoPlantillaFacturaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoPlantillaFacturaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoPlantillaFacturaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoPlantillaFactura() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoPlantillaFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoPlantillaFacturaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoPlantillaFactura=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoPlantillaFactura=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoPlantillaFactura=this.isPermisoActualizarTipoPlantillaFactura;
			this.isPermisoEliminarTipoPlantillaFactura=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoPlantillaFactura=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoPlantillaFactura=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoPlantillaFactura=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoPlantillaFactura=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoPlantillaFactura=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPlantillaFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoPlantillaFactura=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoPlantillaFactura=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoPlantillaFactura=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoPlantillaFactura=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoPlantillaFactura=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoPlantillaFactura=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPlantillaFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoPlantillaFactura.setToolTipText(this.jTableDatosTipoPlantillaFactura.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoPlantillaFactura(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoPlantillaFactura(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoPlantillaFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoPlantillaFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoPlantillaFactura() throws Exception {
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
	public void inicializarCombosForeignKeyTipoPlantillaFacturaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoPlantillaFacturaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoPlantillaFacturaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoPlantillaFacturaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoPlantillaFacturaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoPlantillaFacturaParameterReturnGeneral tipoplantillafacturaReturnGeneral=new TipoPlantillaFacturaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoplantillafacturaConstantesFunciones.cargarid_empresaTipoPlantillaFactura)
					 || (this.esRecargarFks && this.tipoplantillafacturaConstantesFunciones.cargarid_empresaTipoPlantillaFactura)) {

					if(!this.tipoplantillafacturaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoplantillafacturaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoplantillafacturaReturnGeneral=tipoplantillafacturaLogic.cargarCombosLoteForeignKeyTipoPlantillaFactura(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoplantillafacturaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoPlantillaFactura()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoplantillafacturaSessionBean==null) {
				this.tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean();
			}

			if(!this.tipoplantillafacturaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoPlantillaFactura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoPlantillaFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoPlantillaFactura()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPlantillaFactura();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoPlantillaFactura()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPlantillaFactura()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoPlantillaFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoPlantillaFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoPlantillaFactura()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoPlantillaFactura()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoPlantillaFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoPlantillaFactura()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura!=null && this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoPlantillaFacturaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoPlantillaFacturaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoPlantillaFacturaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean(); 
		this.tipoplantillafacturaConstantesFunciones=new TipoPlantillaFacturaConstantesFunciones(); 
		this.tipoplantillafacturaBean=new TipoPlantillaFactura();//(this.tipoplantillafacturaConstantesFunciones); 		
		this.tipoplantillafacturaReturnGeneral=new TipoPlantillaFacturaParameterReturnGeneral(); 
		
		this.tipoplantillafacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoplantillafacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoPlantillaFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoPlantillaFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoPlantillaFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoPlantillaFactura(true);
			
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
			
			this.tipoplantillafacturaConstantesFunciones=new TipoPlantillaFacturaConstantesFunciones(); 
			this.tipoplantillafacturaBean=new TipoPlantillaFactura();//this.tipoplantillafacturaConstantesFunciones); 			
			this.tipoplantillafacturaReturnGeneral=new TipoPlantillaFacturaParameterReturnGeneral(); 
		
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Plantilla Factura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoplantillafactura=new TipoPlantillaFactura();
			this.tipoplantillafacturas = new ArrayList<TipoPlantillaFactura>();
			this.tipoplantillafacturasAux = new ArrayList<TipoPlantillaFactura>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic=new TipoPlantillaFacturaLogic();
				this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoplantillafacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoplantillafacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoPlantillaFactura);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPlantillaFactura);	
					}
					
					if(this.jInternalFrameImportacionTipoPlantillaFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPlantillaFactura);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoPlantillaFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoPlantillaFactura);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPlantillaFactura);
				this.jInternalFrameDetalleFormTipoPlantillaFactura.setVisible(false);
				this.jInternalFrameDetalleFormTipoPlantillaFactura.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPlantillaFactura);
					this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoPlantillaFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoPlantillaFactura);
					this.jInternalFrameImportacionTipoPlantillaFactura.setVisible(false);
					this.jInternalFrameImportacionTipoPlantillaFactura.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoPlantillaFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoPlantillaFactura);
					this.jInternalFrameOrderByTipoPlantillaFactura.setVisible(false);
					this.jInternalFrameOrderByTipoPlantillaFactura.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoPlantillaFacturaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoPlantillaFacturaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoplantillafacturaReturnGeneral=new TipoPlantillaFacturaParameterReturnGeneral();
			
			this.tipoplantillafacturaParameterGeneral=new TipoPlantillaFacturaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoplantillafacturaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoPlantillaFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPlantillaFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado(),this.tipoplantillafacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPlantillaFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado(),this.tipoplantillafacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=false;
			this.isVisibilidadCeldaDuplicarTipoPlantillaFactura=true;
			this.isVisibilidadCeldaCopiarTipoPlantillaFactura=true;
			this.isVisibilidadCeldaVerFormTipoPlantillaFactura=true;
			this.isVisibilidadCeldaOrdenTipoPlantillaFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=false;
			this.isVisibilidadCeldaModificarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoPlantillaFactura();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoPlantillaFactura(false);
			
			this.setPermisosUsuarioTipoPlantillaFactura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado() && this.tipoplantillafacturaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoPlantillaFacturaClasesRelacionadas();
			}
			
			if(this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoPlantillaFacturaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoPlantillaFactura();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoPlantillaFactura();
			}
			
			if(!this.isPermisoBusquedaTipoPlantillaFactura) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoPlantillaFactura,this.isPermisoPaginacionMedioTipoPlantillaFactura,this.isPermisoPaginacionTodoTipoPlantillaFactura);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoPlantillaFacturaConstantesFunciones.getTiposSeleccionarTipoPlantillaFactura());
				
				this.tiposColumnasSelect=TipoPlantillaFacturaConstantesFunciones.getTiposSeleccionarTipoPlantillaFactura(true);
				
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
			//if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoPlantillaFactura();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoPlantillaFactura(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoPlantillaFactura(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPlantillaFactura() ;
			
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
				tipoplantillafacturaImplementable= (TipoPlantillaFacturaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPlantillaFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoplantillafacturaImplementableHome= (TipoPlantillaFacturaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPlantillaFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoplantillafacturas= new ArrayList<TipoPlantillaFactura>();
			this.tipoplantillafacturasEliminados= new ArrayList<TipoPlantillaFactura>();
						
			this.isEsNuevoTipoPlantillaFactura=false;
			this.esParaAccionDesdeFormularioTipoPlantillaFactura=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoPlantillaFactura(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoPlantillaFactura();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoPlantillaFacturaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoPlantillaFactura(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoPlantillaFactura();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoPlantillaFactura();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoPlantillaFactura.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoPlantillaFactura.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoPlantillaFactura.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoPlantillaFactura(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoPlantillaFactura: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoPlantillaFactura() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoPlantillaFactura")) {
				iIndex=this.jInternalFrameDetalleFormTipoPlantillaFactura.jTabbedPaneRelacionesTipoPlantillaFactura.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoPlantillaFactura.jTabbedPaneRelacionesTipoPlantillaFactura.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoPlantillaFactura();	
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
	
	public void cargarCombosForeignKeyTipoPlantillaFactura(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoPlantillaFactura(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoPlantillaFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoPlantillaFacturaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoPlantillaFactura();
		
		this.cargarCombosFrameForeignKeyTipoPlantillaFactura();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoPlantillaFactura();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoPlantillaFactura();
		}
	}
	
	
	
	public void jButtonNuevoTipoPlantillaFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
			
			if(jTableDatosTipoPlantillaFactura.getRowCount()>=1) {
				jTableDatosTipoPlantillaFactura.removeRowSelectionInterval(0, jTableDatosTipoPlantillaFactura.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoPlantillaFactura=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoPlantillaFactura(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoPlantillaFactura(true);			
			//this.tipoplantillafactura=new TipoPlantillaFactura();
			//this.tipoplantillafactura.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPlantillaFactura(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPlantillaFactura() ;
			
			if(TipoPlantillaFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPlantillaFactura(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoplantillafactura);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);				
			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
			if(this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoPlantillaFactura: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoPlantillaFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoPlantillaFactura.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoPlantillaFactura.getSelectedRows().length;			
			}
			
			tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoPlantillaFactura--;			
				//TipoPlantillaFactura tipoplantillafacturaAux= new TipoPlantillaFactura();			
				//tipoplantillafacturaAux.setId(this.iIdNuevoTipoPlantillaFactura);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoPlantillaFactura tipoplantillafacturaOrigen=new TipoPlantillaFactura();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoPlantillaFactura tipoplantillafacturaOrigen : tipoplantillafacturasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoplantillafacturaOrigen =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoplantillafacturaOrigen =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoPlantillaFactura();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoplantillafactura.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoPlantillaFactura(tipoplantillafacturaOrigen,this.tipoplantillafactura,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().add(this.tipoplantillafacturaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoplantillafacturas.add(this.tipoplantillafacturaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
				
				this.jTableDatosTipoPlantillaFactura.setRowSelectionInterval(this.getIndiceNuevoTipoPlantillaFactura(), this.getIndiceNuevoTipoPlantillaFactura());
				
				int iLastRow =  this.jTableDatosTipoPlantillaFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPlantillaFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPlantillaFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();									
		
			TipoPlantillaFactura tipoplantillafacturaOrigen=new TipoPlantillaFactura();
			TipoPlantillaFactura tipoplantillafacturaDestino=new TipoPlantillaFactura();
				
			tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoPlantillaFactura.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoplantillafacturasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoPlantillaFactura.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoplantillafacturaOrigen =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoplantillafacturaOrigen =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoplantillafacturaDestino =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoplantillafacturaDestino =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoplantillafacturaOrigen =tipoplantillafacturasSeleccionados.get(0);
				tipoplantillafacturaDestino =tipoplantillafacturasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoPlantillaFactura(tipoplantillafacturaOrigen,tipoplantillafacturaDestino,true,false);
				
				tipoplantillafacturaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoplantillafacturaDestino,tipoplantillafacturaLogic.getTipoPlantillaFacturas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoplantillafacturaDestino,tipoplantillafacturas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
				
				//this.jTableDatosTipoPlantillaFactura.setRowSelectionInterval(this.getIndiceNuevoTipoPlantillaFactura(), this.getIndiceNuevoTipoPlantillaFactura());
				
				int iLastRow =  this.jTableDatosTipoPlantillaFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPlantillaFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPlantillaFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoPlantillaFactura.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoPlantillaFactura.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoPlantillaFactura.setVisible(!isVisible);
			this.jPanelPaginacionTipoPlantillaFactura.setVisible(!isVisible);
			this.jPanelAccionesTipoPlantillaFactura.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoPlantillaFactura();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoPlantillaFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoPlantillaFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoPlantillaFactura();
			
			this.abrirFrameOrderByTipoPlantillaFactura();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoPlantillaFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoPlantillaFactura(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPlantillaFactura);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoPlantillaFactura.isMaximum()) {
					this.jInternalFrameDetalleFormTipoPlantillaFactura.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoPlantillaFactura.setSize(this.jInternalFrameDetalleFormTipoPlantillaFactura.iWidthFormulario,this.jInternalFrameDetalleFormTipoPlantillaFactura.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoPlantillaFactura.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoPlantillaFactura.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoPlantillaFactura.isMaximum()) {
						this.jInternalFrameDetalleFormTipoPlantillaFactura.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoPlantillaFactura.jContentPaneDetalleTipoPlantillaFactura.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoPlantillaFactura.jTabbedPaneRelacionesTipoPlantillaFactura.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoPlantillaFactura.jContentPaneDetalleTipoPlantillaFactura.getWidth(),TipoPlantillaFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPlantillaFactura.jTabbedPaneRelacionesTipoPlantillaFactura.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoPlantillaFactura.jContentPaneDetalleTipoPlantillaFactura.getWidth(),TipoPlantillaFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPlantillaFactura.jTabbedPaneRelacionesTipoPlantillaFactura.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoPlantillaFactura.jContentPaneDetalleTipoPlantillaFactura.getWidth(),TipoPlantillaFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoPlantillaFactura.setVisible(true);
	        this.jInternalFrameDetalleFormTipoPlantillaFactura.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoPlantillaFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoPlantillaFactura==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoPlantillaFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPlantillaFactura,false,this);
				} else {
					this.jInternalFrameOrderByTipoPlantillaFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPlantillaFactura,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoPlantillaFactura);
				this.jInternalFrameOrderByTipoPlantillaFactura.setVisible(false);
				this.jInternalFrameOrderByTipoPlantillaFactura.setSelected(false);
				
				this.jInternalFrameOrderByTipoPlantillaFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPlantillaFactura"));
				
				this.inicializarActualizarBindingTablaOrderByTipoPlantillaFactura();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoPlantillaFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoPlantillaFactura==null) {
				
				this.jInternalFrameImportacionTipoPlantillaFactura=new ImportacionJInternalFrame(TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPlantillaFactura);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoPlantillaFactura);
				this.jInternalFrameImportacionTipoPlantillaFactura.setVisible(false);
				this.jInternalFrameImportacionTipoPlantillaFactura.setSelected(false);


				this.jInternalFrameImportacionTipoPlantillaFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPlantillaFactura"));
				this.jInternalFrameImportacionTipoPlantillaFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPlantillaFactura"));
				this.jInternalFrameImportacionTipoPlantillaFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPlantillaFactura"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoPlantillaFactura() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura==null) {
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura=new ReporteDinamicoJInternalFrame(TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPlantillaFactura);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPlantillaFactura);
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPlantillaFactura"));
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPlantillaFactura"));
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPlantillaFactura"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPlantillaFactura();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoPlantillaFactura() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPlantillaFactura);
			
	       	this.jInternalFrameDetalleFormTipoPlantillaFactura.setVisible(false);
	        this.jInternalFrameDetalleFormTipoPlantillaFactura.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoPlantillaFactura.dispose();
			//this.jInternalFrameDetalleFormTipoPlantillaFactura=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoPlantillaFactura() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoPlantillaFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoPlantillaFactura.setVisible(true);
	        this.jInternalFrameImportacionTipoPlantillaFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoPlantillaFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoPlantillaFactura.setVisible(true);
	        this.jInternalFrameOrderByTipoPlantillaFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoPlantillaFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoPlantillaFactura.setVisible(false);
	        this.jInternalFrameOrderByTipoPlantillaFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoPlantillaFactura() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoPlantillaFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoPlantillaFactura.setVisible(false);
	        this.jInternalFrameImportacionTipoPlantillaFactura.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoPlantillaFactura(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoPlantillaFactura(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoPlantillaFactura(true);
			//this.isEsNuevoTipoPlantillaFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPlantillaFactura(false) ;
			
			if(tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoPlantillaFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPlantillaFactura(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPlantillaFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoPlantillaFacturaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoPlantillaFactura(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoPlantillaFactura(true);
			//this.isEsNuevoTipoPlantillaFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoplantillafactura.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoPlantillaFactura(false) ;
			
			if(TipoPlantillaFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPlantillaFactura(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPlantillaFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoPlantillaFactura(false);
			
			//if(!this.isEsNuevoTipoPlantillaFactura) {								
				int intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.tipoplantillafactura,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
				
			}
			
			if(this.permiteMantenimiento(this.tipoplantillafactura)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoPlantillaFactura=true;
					this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
					this.isEsNuevoTipoPlantillaFactura=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoPlantillaFactura=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoPlantillaFactura=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPlantillaFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPlantillaFactura(false);
				
				this.habilitarDeshabilitarControlesTipoPlantillaFactura(false);
			
												
				
				if(TipoPlantillaFacturaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoPlantillaFactura();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,tipoplantillafacturaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoPlantillaFactura(this.tipoplantillafactura,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoPlantillaFactura.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoplantillafacturaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoplantillafactura.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				this.tipoplantillafactura.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				this.tipoplantillafactura.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoplantillafactura)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoPlantillaFacturaModel) this.jTableDatosTipoPlantillaFactura.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoPlantillaFactura=true;
				this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
				this.isEsNuevoTipoPlantillaFactura=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPlantillaFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPlantillaFactura(false);
				
				this.habilitarDeshabilitarControlesTipoPlantillaFactura(false);
				
				
				
				if(TipoPlantillaFacturaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoPlantillaFactura();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoPlantillaFactura.getRowCount()>=1) {
				jTableDatosTipoPlantillaFactura.removeRowSelectionInterval(0, jTableDatosTipoPlantillaFactura.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoPlantillaFactura(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPlantillaFactura(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPlantillaFactura(false) ;
			
			this.isEsNuevoTipoPlantillaFactura=false;
			
			if(TipoPlantillaFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoPlantillaFactura();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoPlantillaFactura(false);
				
				//SI ES MANUAL
				if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoPlantillaFactura();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoPlantillaFactura--;			
			//TipoPlantillaFactura tipoplantillafacturaAux= new TipoPlantillaFactura();			
			//tipoplantillafacturaAux.setId(this.iIdNuevoTipoPlantillaFactura);
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoPlantillaFactura();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
			
			this.tipoplantillafactura.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().add(this.tipoplantillafacturaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoplantillafacturas.add(this.tipoplantillafacturaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
			
			this.jTableDatosTipoPlantillaFactura.setRowSelectionInterval(this.getIndiceNuevoTipoPlantillaFactura(), this.getIndiceNuevoTipoPlantillaFactura());
			
			int iLastRow =  this.jTableDatosTipoPlantillaFactura.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoPlantillaFactura.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoPlantillaFactura.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoPlantillaFactura(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPlantillaFactura(false);
			
			//SI ES MANUAL
			if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPlantillaFactura();
			}
			
			//this.abrirFrameTreeTipoPlantillaFactura();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Plantilla FacturaS ?", "MANTENIMIENTO DE Tipo Plantilla Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoPlantillaFactura.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoPlantillaFactura();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoplantillafacturaReturnGeneral=tipoplantillafacturaLogic.procesarImportacionTipoPlantillaFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoplantillafacturaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoPlantillaFacturaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoPlantillaFactura.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoPlantillaFactura.setFileImportacion(this.jInternalFrameImportacionTipoPlantillaFactura.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoPlantillaFactura.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoPlantillaFactura.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoPlantillaFactura.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoPlantillaFactura.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();		

		tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoPlantillaFacturaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoPlantillaFacturaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoPlantillaFacturas("Todos",tipoplantillafacturasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plantilla Factura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();		
		
		tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoplantillafactura";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoPlantillaFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoPlantillaFactura tipoplantillafactura:tipoplantillafacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoplantillafactura.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoPlantillaFactura tipoplantillafactura:tipoplantillafacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoplantillafactura.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoPlantillaFactura tipoplantillafactura:tipoplantillafacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoplantillafactura.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoPlantillaFactura(row);				
			//	iRow++;
			//}				
			
			//for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoPlantillaFactura(tipoplantillafacturaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plantilla Factura",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPlantillaFactura(false);
			
			//SI ES MANUAL
			if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPlantillaFactura();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPlantillaFactura(false);
			
			//SI ES MANUAL
			if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPlantillaFactura();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPlantillaFactura(false);
			
			//SI ES MANUAL
			if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPlantillaFactura();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoPlantillaFactura() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoPlantillaFactura.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoPlantillaFactura.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoPlantillaFactura.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoPlantillaFactura.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoPlantillaFactura.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoPlantillaFactura.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoPlantillaFactura.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoPlantillaFactura(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoPlantillaFactura(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoPlantillaFactura(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoPlantillaFactura(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoPlantillaFactura(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoPlantillaFactura(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPlantillaFactura(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoPlantillaFactura(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoPlantillaFactura() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoPlantillaFactura();
		
		this.inicializarActualizarBindingBotonesManualTipoPlantillaFactura(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPlantillaFactura();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPlantillaFactura() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPlantillaFactura(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPlantillaFactura(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoPlantillaFactura.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoPlantillaFactura.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoPlantillaFactura.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoPlantillaFactura.jCheckBoxPostAccionNuevoTipoPlantillaFactura.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoPlantillaFactura.jCheckBoxPostAccionSinCerrarTipoPlantillaFactura.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoPlantillaFactura.jCheckBoxPostAccionSinMensajeTipoPlantillaFactura.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoPlantillaFactura.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoPlantillaFactura.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoPlantillaFactura.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
				this.jInternalFrameDetalleFormTipoPlantillaFactura.jCheckBoxPostAccionNuevoTipoPlantillaFactura.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoPlantillaFactura.jCheckBoxPostAccionSinCerrarTipoPlantillaFactura.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoPlantillaFactura.jCheckBoxPostAccionSinMensajeTipoPlantillaFactura.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoPlantillaFactura.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoPlantillaFactura.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoPlantillaFactura.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoPlantillaFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoPlantillaFactura.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoPlantillaFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoPlantillaFactura.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoPlantillaFactura.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoPlantillaFactura.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoPlantillaFactura(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPlantillaFactura(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoPlantillaFactura() throws Exception {
		try	{
			if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPlantillaFactura();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPlantillaFactura() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPlantillaFactura() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoPlantillaFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoPlantillaFactura.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoPlantillaFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoPlantillaFactura.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoPlantillaFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoPlantillaFactura.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoPlantillaFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoPlantillaFactura.addItem(reporte);
			}
			
			
			if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoPlantillaFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoPlantillaFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoPlantillaFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoPlantillaFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoPlantillaFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoPlantillaFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoPlantillaFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoPlantillaFactura.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoPlantillaFactura.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPlantillaFactura();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPlantillaFactura() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura!=null) {
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura!=null) {
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoPlantillaFactura()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoPlantillaFactura(Boolean esInicializar) throws Exception {				
		if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPlantillaFactura();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoPlantillaFactura() throws Exception {
		this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoPlantillaFactura() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoPlantillaFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoPlantillaFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoPlantillaFacturaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPlantillaFacturaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoPlantillaFacturaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoPlantillaFacturaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoPlantillaFactura(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoplantillafacturaLogic.getTipoPlantillaFacturas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoplantillafacturas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoPlantillaFactura.setModel(new TipoPlantillaFacturaModel(this.tipoplantillafacturaLogic.getTipoPlantillaFacturas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoPlantillaFactura.setModel(new TipoPlantillaFacturaModel(this.tipoplantillafacturas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoPlantillaFactura!=null && this.jInternalFrameOrderByTipoPlantillaFactura.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoPlantillaFactura();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPlantillaFactura,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoPlantillaFacturaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO,tipoplantillafacturaConstantesFunciones.resaltarSeleccionarTipoPlantillaFactura,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoPlantillaFacturaConstantesFunciones.SCLASSWEBTITULO,tipoplantillafacturaConstantesFunciones.resaltarSeleccionarTipoPlantillaFactura,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPlantillaFactura,TipoPlantillaFacturaConstantesFunciones.LABEL_ID));

		if(this.tipoplantillafacturaConstantesFunciones.mostraridTipoPlantillaFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPlantillaFacturaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoplantillafacturaConstantesFunciones.resaltaridTipoPlantillaFactura,this.tipoplantillafacturaConstantesFunciones.activaridTipoPlantillaFactura,this,true,"idTipoPlantillaFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoplantillafacturaConstantesFunciones.resaltaridTipoPlantillaFactura,this.tipoplantillafacturaConstantesFunciones.activaridTipoPlantillaFactura,this,true,"idTipoPlantillaFactura","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPlantillaFactura,TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoplantillafacturaConstantesFunciones.mostrarid_empresaTipoPlantillaFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoplantillafacturaConstantesFunciones.resaltarid_empresaTipoPlantillaFactura,this,this.tipoplantillafacturaConstantesFunciones.activarid_empresaTipoPlantillaFactura));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoplantillafacturaConstantesFunciones.resaltarid_empresaTipoPlantillaFactura,this,this.tipoplantillafacturaConstantesFunciones.activarid_empresaTipoPlantillaFactura,false,"id_empresaTipoPlantillaFactura","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPlantillaFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPlantillaFactura,TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoplantillafacturaConstantesFunciones.mostrarcodigoTipoPlantillaFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoplantillafacturaConstantesFunciones.resaltarcodigoTipoPlantillaFactura,this.tipoplantillafacturaConstantesFunciones.activarcodigoTipoPlantillaFactura,this,true,"codigoTipoPlantillaFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoplantillafacturaConstantesFunciones.resaltarcodigoTipoPlantillaFactura,this.tipoplantillafacturaConstantesFunciones.activarcodigoTipoPlantillaFactura,this,true,"codigoTipoPlantillaFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPlantillaFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPlantillaFactura,TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoplantillafacturaConstantesFunciones.mostrarnombreTipoPlantillaFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoplantillafacturaConstantesFunciones.resaltarnombreTipoPlantillaFactura,this.tipoplantillafacturaConstantesFunciones.activarnombreTipoPlantillaFactura,this,true,"nombreTipoPlantillaFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoplantillafacturaConstantesFunciones.resaltarnombreTipoPlantillaFactura,this.tipoplantillafacturaConstantesFunciones.activarnombreTipoPlantillaFactura,this,true,"nombreTipoPlantillaFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPlantillaFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPlantillaFactura.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPlantillaFactura.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoPlantillaFactura.addColumn(tableColumn);
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
			
			this.jTableDatosTipoPlantillaFactura.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoPlantillaFactura.moveColumn(this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoPlantillaFactura.moveColumn(this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoPlantillaFactura.moveColumn(this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoPlantillaFactura.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoPlantillaFactura.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoPlantillaFactura,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoPlantillaFactura.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoPlantillaFactura.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoPlantillaFactura.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoplantillafacturaLogic.getTipoPlantillaFacturas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoplantillafacturas.size()-1;
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
		//this.jTableDatosTipoPlantillaFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoPlantillaFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoPlantillaFactura();
			
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
				
				//this.isEsNuevoTipoPlantillaFactura=false;
					
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
				if(this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPlantillaFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPlantillaFactura.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoplantillafactura.getsType().equals("DUPLICADO")
				   || this.tipoplantillafactura.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoPlantillaFactura=true;
				
				} else {
					this.isEsNuevoTipoPlantillaFactura=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoplantillafactura.getId()>=0 && !this.tipoplantillafactura.getIsNew()) {						
						this.isEsNuevoTipoPlantillaFactura=false;
						
					} else {
						this.isEsNuevoTipoPlantillaFactura=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoPlantillaFactura(esRelaciones);						
				
				this.seleccionarTipoPlantillaFactura(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoplantillafactura.getId()<0) {
					this.isEsNuevoTipoPlantillaFactura=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoPlantillaFactura(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoPlantillaFactura(evt,rowIndex);
				}	
				
				if(this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoPlantillaFactura: " + this.dDif); 
					}
				}								
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoPlantillaFactura(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoplantillafactura)) {
					if(this.tipoplantillafactura.getId()>0) {
						this.tipoplantillafactura.setIsDeleted(true);
						
						this.tipoplantillafacturasEliminados.add(this.tipoplantillafactura);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().remove(this.tipoplantillafactura);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoplantillafacturas.remove(this.tipoplantillafactura);				
					}
					
					
					((TipoPlantillaFacturaModel) this.jTableDatosTipoPlantillaFactura.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoPlantillaFactura(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoPlantillaFactura) {
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPlantillaFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPlantillaFactura.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoPlantillaFactura(this.tipoplantillafactura);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoplantillafacturaConstantesFunciones.cargarid_empresaTipoPlantillaFactura || this.tipoplantillafacturaConstantesFunciones.event_dependid_empresaTipoPlantillaFactura) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoplantillafactura.getid_empresa());
									//this.inicializarActualizarBindingTipoPlantillaFactura(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoplantillafactura.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoplantillafactura.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoplantillafactura.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoPlantillaFactura("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoPlantillaFactura(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPlantillaFactura() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoPlantillaFactura(tipoplantillafactura,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoPlantillaFactura(tipoplantillafactura);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoPlantillaFactura(tipoplantillafactura,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoPlantillaFactura(tipoplantillafactura);
	}
	
	public void setVariablesObjetoActualToFormularioTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.setText(tipoplantillafactura.getId().toString());
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextFieldcodigoTipoPlantillaFactura.setText(tipoplantillafactura.getcodigo());
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextAreanombreTipoPlantillaFactura.setText(tipoplantillafactura.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoPlantillaFactura tipoplantillafacturaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoplantillafacturaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoPlantillaFactura tipoplantillafacturaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoplantillafacturaLocal=this.tipoplantillafactura;
			} else {
				tipoplantillafacturaLocal=this.tipoplantillafacturaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoplantillafacturaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoPlantillaFactura(tipoplantillafacturaLocal,true);
					
					if(tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoplantillafacturaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoplantillafacturaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(tipoplantillafactura,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(tipoplantillafactura);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(tipoplantillafactura,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.getText()==null || this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.getText()=="" || this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.setText("0");
			}

			if(conColumnasBase) {tipoplantillafactura.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPlantillaFacturaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelIdTipoPlantillaFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoplantillafactura.setcodigo(this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextFieldcodigoTipoPlantillaFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelcodigoTipoPlantillaFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoplantillafactura.setnombre(this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextAreanombreTipoPlantillaFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelnombreTipoPlantillaFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafacturaBean,TipoPlantillaFactura tipoplantillafactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafacturaOrigen,TipoPlantillaFactura tipoplantillafactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoplantillafacturaOrigen.getId()!=null && !tipoplantillafacturaOrigen.getId().equals(0L))) {tipoplantillafactura.setId(tipoplantillafacturaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoplantillafacturaOrigen.getcodigo()!=null && !tipoplantillafacturaOrigen.getcodigo().equals(""))) {tipoplantillafactura.setcodigo(tipoplantillafacturaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoplantillafacturaOrigen.getnombre()!=null && !tipoplantillafacturaOrigen.getnombre().equals(""))) {tipoplantillafactura.setnombre(tipoplantillafacturaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.setText(tipoplantillafactura.getId().toString());
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextFieldcodigoTipoPlantillaFactura.setText(tipoplantillafactura.getcodigo());
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextAreanombreTipoPlantillaFactura.setText(tipoplantillafactura.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPlantillaFactura(TipoPlantillaFacturaBean tipoplantillafacturaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.setText(tipoplantillafacturaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextFieldcodigoTipoPlantillaFactura.setText(tipoplantillafacturaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextAreanombreTipoPlantillaFactura.setText(tipoplantillafacturaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoPlantillaFactura(TipoPlantillaFacturaParameterReturnGeneral tipoplantillafacturaReturnGeneral,TipoPlantillaFacturaBean tipoplantillafacturaBean,Boolean conDefault) throws Exception { 
		try {
			TipoPlantillaFactura tipoplantillafacturaLocal=new TipoPlantillaFactura();
			
			tipoplantillafacturaLocal=tipoplantillafacturaReturnGeneral.getTipoPlantillaFactura();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoplantillafacturaLocal.getId()!=null && !tipoplantillafacturaLocal.getId().equals(0L))) {tipoplantillafacturaBean.setId(tipoplantillafacturaLocal.getId());}}
			if(conDefault || (!conDefault && tipoplantillafacturaLocal.getcodigo()!=null && !tipoplantillafacturaLocal.getcodigo().equals(""))) {tipoplantillafacturaBean.setcodigo(tipoplantillafacturaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoplantillafacturaLocal.getnombre()!=null && !tipoplantillafacturaLocal.getnombre().equals(""))) {tipoplantillafacturaBean.setnombre(tipoplantillafacturaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoPlantillaFacturaGenerico(Long idTipoPlantillaFacturaSeleccionado,JComboBox jComboBoxTipoPlantillaFactura,List<TipoPlantillaFactura> tipoplantillafacturasLocal)throws Exception {
		try {
			TipoPlantillaFactura  tipoplantillafacturaTemp=null;

			for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturasLocal) {
				if(tipoplantillafacturaAux.getId()!=null && tipoplantillafacturaAux.getId().equals(idTipoPlantillaFacturaSeleccionado)) {
					tipoplantillafacturaTemp=tipoplantillafacturaAux;
					break;
				}
			}

			jComboBoxTipoPlantillaFactura.setSelectedItem(tipoplantillafacturaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoPlantillaFacturaGenerico(JComboBox jComboBoxTipoPlantillaFactura,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPlantillaFactura.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoPlantillaFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPlantillaFactura.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoPlantillaFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoPlantillaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoPlantillaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoplantillafactura=(TipoPlantillaFactura) tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoplantillafactura =(TipoPlantillaFactura) tipoplantillafacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoplantillafactura.getIsNew() && !tipoplantillafactura.getIsChanged() && !tipoplantillafactura.getIsDeleted()) {
				sDescripcion=tipoplantillafactura.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoplantillafactura.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoPlantillaFactura tipoplantillafacturaRow=new TipoPlantillaFactura();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoplantillafacturaRow=(TipoPlantillaFactura) tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoplantillafacturaRow=(TipoPlantillaFactura) tipoplantillafacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoPlantillaFactura(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaNuevoTipoPlantillaFactura && this.isPermisoNuevoTipoPlantillaFactura));			
			this.jButtonDuplicarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaDuplicarTipoPlantillaFactura && this.isPermisoDuplicarTipoPlantillaFactura));			
			this.jButtonCopiarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaCopiarTipoPlantillaFactura && this.isPermisoCopiarTipoPlantillaFactura));
			this.jButtonVerFormTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaVerFormTipoPlantillaFactura && this.isPermisoVerFormTipoPlantillaFactura));
			
			this.jButtonAbrirOrderByTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaOrdenTipoPlantillaFactura && this.isPermisoOrdenTipoPlantillaFactura));			
			
			this.jButtonNuevoRelacionesTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura && this.isPermisoNuevoTipoPlantillaFactura));			
			this.jButtonNuevoGuardarCambiosTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaNuevoTipoPlantillaFactura && this.isPermisoNuevoTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura));
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonModificarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaModificarTipoPlantillaFactura && this.isPermisoActualizarTipoPlantillaFactura));	
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonActualizarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaActualizarTipoPlantillaFactura && this.isPermisoActualizarTipoPlantillaFactura));	
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonEliminarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaEliminarTipoPlantillaFactura && this.isPermisoEliminarTipoPlantillaFactura));
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonCancelarTipoPlantillaFactura.setVisible(this.isVisibilidadCeldaCancelarTipoPlantillaFactura);							
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaGuardarTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaNuevoTipoPlantillaFactura && this.isPermisoNuevoTipoPlantillaFactura));						
			this.jButtonDuplicarToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaDuplicarTipoPlantillaFactura && this.isPermisoDuplicarTipoPlantillaFactura));						
			this.jButtonCopiarToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaCopiarTipoPlantillaFactura && this.isPermisoCopiarTipoPlantillaFactura));			
			this.jButtonVerFormToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaVerFormTipoPlantillaFactura && this.isPermisoVerFormTipoPlantillaFactura));			
			this.jButtonAbrirOrderByToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaOrdenTipoPlantillaFactura && this.isPermisoOrdenTipoPlantillaFactura));
			this.jButtonNuevoRelacionesToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura && this.isPermisoNuevoTipoPlantillaFactura));			
			this.jButtonNuevoGuardarCambiosToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaNuevoTipoPlantillaFactura && this.isPermisoNuevoTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura));			
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonModificarToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaModificarTipoPlantillaFactura && this.isPermisoActualizarTipoPlantillaFactura));	
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonActualizarToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaActualizarTipoPlantillaFactura  && this.isPermisoActualizarTipoPlantillaFactura));	
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonEliminarToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaEliminarTipoPlantillaFactura && this.isPermisoEliminarTipoPlantillaFactura));
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonCancelarToolBarTipoPlantillaFactura.setVisible(this.isVisibilidadCeldaCancelarTipoPlantillaFactura);				
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaGuardarTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaNuevoTipoPlantillaFactura && this.isPermisoNuevoTipoPlantillaFactura));			
			this.jMenuItemDuplicarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaDuplicarTipoPlantillaFactura && this.isPermisoDuplicarTipoPlantillaFactura));			
			this.jMenuItemCopiarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaCopiarTipoPlantillaFactura && this.isPermisoCopiarTipoPlantillaFactura));			
			this.jMenuItemVerFormTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaVerFormTipoPlantillaFactura && this.isPermisoVerFormTipoPlantillaFactura));			
			this.jMenuItemAbrirOrderByTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaOrdenTipoPlantillaFactura && this.isPermisoOrdenTipoPlantillaFactura));			
			//this.jMenuItemMostrarOcultarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaOrdenTipoPlantillaFactura && this.isPermisoOrdenTipoPlantillaFactura));
			this.jMenuItemDetalleAbrirOrderByTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaOrdenTipoPlantillaFactura && this.isPermisoOrdenTipoPlantillaFactura));			
			//this.jMenuItemDetalleMostrarOcultarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaOrdenTipoPlantillaFactura && this.isPermisoOrdenTipoPlantillaFactura));			
			this.jMenuItemNuevoRelacionesTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura && this.isPermisoNuevoTipoPlantillaFactura));			
			this.jMenuItemNuevoGuardarCambiosTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaNuevoTipoPlantillaFactura && this.isPermisoNuevoTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura));									
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemModificarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaModificarTipoPlantillaFactura && this.isPermisoActualizarTipoPlantillaFactura));	
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemActualizarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaActualizarTipoPlantillaFactura && this.isPermisoActualizarTipoPlantillaFactura));	
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemEliminarTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaEliminarTipoPlantillaFactura && this.isPermisoEliminarTipoPlantillaFactura));
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemCancelarTipoPlantillaFactura.setVisible(this.isVisibilidadCeldaCancelarTipoPlantillaFactura);				
			}
			
			this.jMenuItemGuardarCambiosTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaGuardarTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura));						
			this.jMenuItemGuardarCambiosTablaTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=this.jButtonNuevoTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaDuplicarTipoPlantillaFactura=this.jButtonDuplicarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaCopiarTipoPlantillaFactura=this.jButtonCopiarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaVerFormTipoPlantillaFactura=this.jButtonVerFormTipoPlantillaFactura.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoPlantillaFactura=this.jButtonAbrirOrderByTipoPlantillaFactura.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=this.jButtonNuevoRelacionesTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaModificarTipoPlantillaFactura=this.jButtonModificarTipoPlantillaFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonActualizarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonEliminarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonCancelarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaGuardarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosTipoPlantillaFactura.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=this.jButtonGuardarCambiosTablaTipoPlantillaFactura.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=this.jButtonNuevoToolBarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=this.jButtonNuevoRelacionesToolBarTipoPlantillaFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			this.isVisibilidadCeldaModificarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonModificarToolBarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonActualizarToolBarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonEliminarToolBarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonCancelarToolBarTipoPlantillaFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPlantillaFactura=this.jButtonGuardarCambiosToolBarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=this.jButtonGuardarCambiosTablaToolBarTipoPlantillaFactura.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=this.jMenuItemNuevoTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=this.jMenuItemNuevoRelacionesTipoPlantillaFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			this.isVisibilidadCeldaModificarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemModificarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemActualizarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemEliminarTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemCancelarTipoPlantillaFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPlantillaFactura=this.jMenuItemGuardarCambiosTipoPlantillaFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=this.jMenuItemGuardarCambiosTablaTipoPlantillaFactura.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoPlantillaFactura(Boolean esInicializar) {
		if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPlantillaFactura();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoPlantillaFactura(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoPlantillaFactura() {
		this.jButtonNuevoTipoPlantillaFactura.setVisible(this.isPermisoNuevoTipoPlantillaFactura);			
		this.jButtonDuplicarTipoPlantillaFactura.setVisible(this.isPermisoDuplicarTipoPlantillaFactura);			
		this.jButtonCopiarTipoPlantillaFactura.setVisible(this.isPermisoCopiarTipoPlantillaFactura);			
		this.jButtonVerFormTipoPlantillaFactura.setVisible(this.isPermisoVerFormTipoPlantillaFactura);			
		
		this.jButtonAbrirOrderByTipoPlantillaFactura.setVisible(this.isPermisoOrdenTipoPlantillaFactura);					
		
		this.jButtonNuevoRelacionesTipoPlantillaFactura.setVisible(this.isPermisoNuevoTipoPlantillaFactura);			
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonModificarTipoPlantillaFactura.setVisible(this.isPermisoActualizarTipoPlantillaFactura);	
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonActualizarTipoPlantillaFactura.setVisible(this.isPermisoActualizarTipoPlantillaFactura);	
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonEliminarTipoPlantillaFactura.setVisible(this.isPermisoEliminarTipoPlantillaFactura);
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonCancelarTipoPlantillaFactura.setVisible(this.isVisibilidadCeldaCancelarTipoPlantillaFactura);						
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosTipoPlantillaFactura.setVisible(this.isPermisoGuardarCambiosTipoPlantillaFactura);							
		}
		
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura.setVisible(this.isPermisoActualizarTipoPlantillaFactura);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPlantillaFactura() {
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonModificarTipoPlantillaFactura.setVisible(this.isPermisoActualizarTipoPlantillaFactura);	
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonActualizarTipoPlantillaFactura.setVisible(this.isPermisoActualizarTipoPlantillaFactura);	
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonEliminarTipoPlantillaFactura.setVisible(this.isPermisoEliminarTipoPlantillaFactura);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonCancelarTipoPlantillaFactura.setVisible(this.isVisibilidadCeldaCancelarTipoPlantillaFactura);							
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosTipoPlantillaFactura.setVisible((this.isVisibilidadCeldaGuardarTipoPlantillaFactura && this.isPermisoGuardarCambiosTipoPlantillaFactura));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoPlantillaFactura() {
		if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoPlantillaFactura();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoPlantillaFactura() {
	}
	
	public void jTableDatosTipoPlantillaFacturaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoPlantillaFactura(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoPlantillaFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.gettipoplantillafactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoplantillafactura==null) {
						this.tipoplantillafactura = new TipoPlantillaFactura();
					}

					this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.tipoplantillafactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
				}

				if(this.tipoplantillafactura.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoplantillafactura.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPlantillaFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoPlantillaFacturaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoPlantillaFactura(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoPlantillaFactura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoPlantillaFactura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.gettipoplantillafactura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoplantillafacturaLogic.getConnexion());

				if(this.tipoplantillafactura.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoplantillafactura.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoPlantillaFactura=(TitledBorder)this.jScrollPanelDatosTipoPlantillaFactura.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoPlantillaFactura.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoPlantillaFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.gettipoplantillafactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoplantillafactura==null) {
						this.tipoplantillafactura = new TipoPlantillaFactura();
					}

					this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.tipoplantillafactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
				}

				if(this.tipoplantillafactura.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoplantillafactura.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPlantillaFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoPlantillaFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.gettipoplantillafactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoplantillafactura==null) {
						this.tipoplantillafactura = new TipoPlantillaFactura();
					}

					this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.tipoplantillafactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
				}

				if(this.tipoplantillafactura.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoplantillafactura.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPlantillaFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoPlantillaFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.gettipoplantillafactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoplantillafactura==null) {
						this.tipoplantillafactura = new TipoPlantillaFactura();
					}

					this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.tipoplantillafactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);
				}

				if(this.tipoplantillafactura.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoplantillafactura.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPlantillaFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoPlantillaFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoPlantillaFactura(false,false);

			this.getTipoPlantillaFacturasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoPlantillaFactura(false);

			//if(TipoPlantillaFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoPlantillaFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoplantillafacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoPlantillaFactura() {
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoPlantillaFactura.dispose();
			this.jInternalFrameDetalleFormTipoPlantillaFactura=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura!=null) {
			this.jInternalFrameReporteDinamicoTipoPlantillaFactura.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoPlantillaFactura.dispose();
			this.jInternalFrameReporteDinamicoTipoPlantillaFactura=null;
		}
		
		if(this.jInternalFrameImportacionTipoPlantillaFactura!=null) {
			this.jInternalFrameImportacionTipoPlantillaFactura.setVisible(false);	    			
			this.jInternalFrameImportacionTipoPlantillaFactura.dispose();
			this.jInternalFrameImportacionTipoPlantillaFactura=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoPlantillaFactura();
			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoPlantillaFactura")) {
				jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoPlantillaFactura")) {
				jButtonDuplicarTipoPlantillaFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoPlantillaFactura")) {
				jButtonCopiarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoPlantillaFactura")) {
				jButtonVerFormTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoPlantillaFactura")) {
				jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoPlantillaFactura")) {
				jButtonDuplicarTipoPlantillaFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoPlantillaFactura")) {
				jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoPlantillaFactura")) {
				jButtonDuplicarTipoPlantillaFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoPlantillaFactura")) {
				jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoPlantillaFactura")) {
				jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoPlantillaFactura")) {
				jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoPlantillaFactura")) {
				jButtonModificarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoPlantillaFactura")) {
				jButtonModificarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoPlantillaFactura")) {
				jButtonModificarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoPlantillaFactura")) {
				jButtonActualizarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoPlantillaFactura")) {
				jButtonActualizarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoPlantillaFactura")) {
				jButtonActualizarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoPlantillaFactura")) {
				jButtonEliminarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoPlantillaFactura")) {
				jButtonEliminarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoPlantillaFactura")) {
				jButtonEliminarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoPlantillaFactura")) {
				jButtonCancelarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoPlantillaFactura")) {
				jButtonCancelarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoPlantillaFactura")) {
				jButtonCancelarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoPlantillaFactura")) {
				jButtonCerrarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoPlantillaFactura")) {
				jButtonCerrarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoPlantillaFactura")) {
				jButtonCerrarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoPlantillaFactura")) {
				jButtonMostrarOcultarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoPlantillaFactura")) {
				jButtonCancelarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoPlantillaFactura")) {
				jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoPlantillaFactura")) {
				jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoPlantillaFactura")) {
				jButtonCopiarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoPlantillaFactura")) {
				jButtonVerFormTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoPlantillaFactura")) {
				jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoPlantillaFactura")) {
				jButtonCopiarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoPlantillaFactura")) {
				jButtonVerFormTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoPlantillaFactura")) {
				jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoPlantillaFactura")) {
				jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoPlantillaFactura")) {
				jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoPlantillaFactura")) {
				jButtonRecargarInformacionTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoPlantillaFactura")) {
				jButtonRecargarInformacionTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoPlantillaFactura")) {
				jButtonRecargarInformacionTipoPlantillaFacturaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoPlantillaFactura")) {
				jButtonAnterioresTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoPlantillaFactura")) {
				jButtonAnterioresTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoPlantillaFactura")) {
				jButtonAnterioresTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoPlantillaFactura")) {
				jButtonSiguientesTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoPlantillaFactura")) {
				jButtonSiguientesTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoPlantillaFactura")) {
				jButtonSiguientesTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoPlantillaFactura") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoPlantillaFactura")) {
				jButtonAbrirOrderByTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoPlantillaFactura") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoPlantillaFactura")) {
				jButtonMostrarOcultarTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPlantillaFactura")) {
				jButtonNuevoGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoPlantillaFactura")) {
				jButtonNuevoGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoPlantillaFactura")) {
				jButtonNuevoGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoPlantillaFactura")) {
				jButtonCerrarReporteDinamicoTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoPlantillaFactura")) {
				jButtonGenerarReporteDinamicoTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoPlantillaFactura")) {
				
				jButtonGenerarExcelReporteDinamicoTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoPlantillaFactura")) {
				jButtonCerrarImportacionTipoPlantillaFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoPlantillaFactura")) {
				
				jButtonGenerarImportacionTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoPlantillaFactura")) {
				
				jButtonAbrirImportacionTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoPlantillaFactura")) {
				jComboBoxTiposAccionesTipoPlantillaFacturaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoPlantillaFactura")) {
				jComboBoxTiposRelacionesTipoPlantillaFacturaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoPlantillaFactura")) {
				jComboBoxTiposAccionesTipoPlantillaFacturaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoPlantillaFactura")) {
				
				jComboBoxTiposSeleccionarTipoPlantillaFacturaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoPlantillaFactura")) {
				jTextFieldValorCampoGeneralTipoPlantillaFacturaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoPlantillaFactura")) {
				jButtonAbrirOrderByTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoPlantillaFactura")) {
				jButtonAbrirOrderByTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoPlantillaFactura")) {
				jButtonCerrarOrderByTipoPlantillaFacturaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPlantillaFacturaBusqueda")) {
				this.jButtonidTipoPlantillaFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoPlantillaFacturaUpdate")) {
				this.jButtonid_empresaTipoPlantillaFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoPlantillaFacturaBusqueda")) {
				this.jButtonid_empresaTipoPlantillaFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPlantillaFacturaBusqueda")) {
				this.jButtoncodigoTipoPlantillaFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPlantillaFacturaBusqueda")) {
				this.jButtonnombreTipoPlantillaFacturaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoPlantillaFactura();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPlantillaFacturaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				


				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoPlantillaFactura tipoplantillafacturaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoplantillafacturaLocal=this.tipoplantillafactura;
			} else {
				tipoplantillafacturaLocal=this.tipoplantillafacturaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
							
				
				


				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPlantillaFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
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
			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
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
			
			


			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPlantillaFacturaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
								
						
				


				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
								
				
				


				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPlantillaFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPlantillaFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPlantillaFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
							
				
				


				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPlantillaFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
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
			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
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
			
			


			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPlantillaFacturaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
								
				
				


				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPlantillaFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPlantillaFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPlantillaFacturaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoPlantillaFactura")) {
					jCheckBoxSeleccionarTodosTipoPlantillaFacturaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoPlantillaFactura")) {
					jCheckBoxSeleccionadosTipoPlantillaFacturaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoPlantillaFactura")) {
					
				}
				
				


				
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
												
				
				


				
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPlantillaFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPlantillaFacturaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
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
			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
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
			
			


			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPlantillaFacturaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoplantillafactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoplantillafactura);
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
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
				
				


				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPlantillaFactura.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPlantillaFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPlantillaFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoplantillafacturaAnterior =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoPlantillaFactura")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoPlantillaFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoPlantillaFactura.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoplantillafactura =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoplantillafactura);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoPlantillaFactura")) {
				
				}
				
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoPlantillaFactura")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoPlantillaFactura.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoPlantillaFactura")) {
			
			}
			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoPlantillaFactura();
			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoPlantillaFactura")) {
				jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoPlantillaFactura")) {
				jButtonDuplicarTipoPlantillaFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoPlantillaFactura")) {
				jButtonCopiarTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoPlantillaFactura")) {
				jButtonVerFormTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoPlantillaFactura")) {
				jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoPlantillaFactura")) {
				jButtonModificarTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoPlantillaFactura")) {
				jButtonActualizarTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoPlantillaFactura")) {
				jButtonEliminarTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoPlantillaFactura")) {
				jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoPlantillaFactura")) {
				jButtonCancelarTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoPlantillaFactura")) {
				jButtonCerrarTipoPlantillaFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoPlantillaFactura")) {
				jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPlantillaFactura")) {
				jButtonNuevoGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoPlantillaFactura")) {
				jButtonAbrirOrderByTipoPlantillaFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoPlantillaFactura")) {
				jButtonRecargarInformacionTipoPlantillaFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoPlantillaFactura")) {
				jButtonAnterioresTipoPlantillaFacturaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoPlantillaFactura")) {
				jButtonSiguientesTipoPlantillaFacturaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPlantillaFacturaBusqueda")) {
				this.jButtonidTipoPlantillaFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoPlantillaFacturaUpdate")) {
				this.jButtonid_empresaTipoPlantillaFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoPlantillaFacturaBusqueda")) {
				this.jButtonid_empresaTipoPlantillaFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoPlantillaFacturaBusqueda")) {
				this.jButtoncodigoTipoPlantillaFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPlantillaFacturaBusqueda")) {
				this.jButtonnombreTipoPlantillaFacturaBusquedaActionPerformed(evt);
			}
			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoPlantillaFactura();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoPlantillaFactura")) {
				closingInternalFrameTipoPlantillaFactura();
				
			} else if(sTipo.equals("jButtonCancelarTipoPlantillaFactura")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoPlantillaFactura = (JInternalFrameBase)evt.getSource();
	            	
	            TipoPlantillaFacturaBeanSwingJInternalFrame jInternalFrameParent=(TipoPlantillaFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPlantillaFactura.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoPlantillaFacturaActionPerformed(null);
			}
			
			TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoplantillafactura,new Object(),this.tipoplantillafacturaParameterGeneral,this.tipoplantillafacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoPlantillaFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoPlantillaFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoPlantillaFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoplantillafactura)) {
			if(!esControlTabla) {
				if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.tipoplantillafactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);			
				}
				
				if(this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoPlantillaFactura(this.tipoplantillafactura,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoplantillafacturaReturnGeneral=tipoplantillafacturaLogic.procesarEventosTipoPlantillaFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoplantillafacturaLogic.getTipoPlantillaFacturas(),this.tipoplantillafactura,this.tipoplantillafacturaParameterGeneral,this.isEsNuevoTipoPlantillaFactura,classes);//this.tipoplantillafacturaLogic.getTipoPlantillaFactura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoPlantillaFactura(this.tipoplantillafacturaReturnGeneral,this.tipoplantillafacturaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoPlantillaFactura(classes,this.tipoplantillafacturaReturnGeneral,this.tipoplantillafacturaBean,false);
					}
						
					if(this.tipoplantillafacturaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoPlantillaFactura(this.tipoplantillafacturaReturnGeneral.getTipoPlantillaFactura());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoPlantillaFactura(this.tipoplantillafacturaReturnGeneral.getTipoPlantillaFactura());	
					}
						
					if(this.tipoplantillafacturaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoPlantillaFactura(this.tipoplantillafacturaReturnGeneral.getTipoPlantillaFactura(),classes);//this.tipoplantillafacturaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoPlantillaFactura(this.tipoplantillafactura,classes);//this.tipoplantillafacturaBean);									
				}
			
				if(TipoPlantillaFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoPlantillaFactura(this.tipoplantillafactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPlantillaFactura(this.tipoplantillafactura);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoplantillafacturaAnterior!=null) {
						this.tipoplantillafactura=this.tipoplantillafacturaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoplantillafacturaReturnGeneral=tipoplantillafacturaLogic.procesarEventosTipoPlantillaFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoplantillafacturaLogic.getTipoPlantillaFacturas(),this.tipoplantillafactura,this.tipoplantillafacturaParameterGeneral,this.isEsNuevoTipoPlantillaFactura,classes);//this.tipoplantillafacturaLogic.getTipoPlantillaFactura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoplantillafacturaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoplantillafacturaReturnGeneral.getTipoPlantillaFactura(),tipoplantillafacturaLogic.getTipoPlantillaFacturas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoplantillafacturaReturnGeneral.getTipoPlantillaFactura(),this.tipoplantillafacturas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoPlantillaFactura.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoPlantillaFactura.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoPlantillaFactura();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoPlantillaFactura() throws Exception {
		
		TipoPlantillaFacturaModel tipoplantillafacturaModel=(TipoPlantillaFacturaModel)this.jTableDatosTipoPlantillaFactura.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoplantillafacturaModel.tipoplantillafacturas=this.tipoplantillafacturaLogic.getTipoPlantillaFacturas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoplantillafacturaModel.tipoplantillafacturas=this.tipoplantillafacturas;
		}
		
		
		((TipoPlantillaFacturaModel) this.jTableDatosTipoPlantillaFactura.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoPlantillaFactura() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoplantillafacturaAnterior(),this.tipoplantillafacturaLogic.getTipoPlantillaFacturas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoplantillafacturaAnterior(),this.tipoplantillafacturas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoPlantillaFactura();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
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
										
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoplantillafactura,new Object(),generalEntityParameterGeneral,this.tipoplantillafacturaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoPlantillaFacturaConstantesFunciones.getClassesRelationshipsOfTipoPlantillaFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoPlantillaFacturaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoPlantillaFactura(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoPlantillaFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoPlantillaFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoplantillafactura,new Object(),generalEntityParameterGeneral,this.tipoplantillafacturaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoPlantillaFactura(TipoPlantillaFacturaBean tipoplantillafacturaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoPlantillaFactura(ArrayList<Classe> classes,TipoPlantillaFacturaReturnGeneral tipoplantillafacturaReturnGeneral,TipoPlantillaFacturaBean tipoplantillafacturaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoplantillafactura)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura = new TipoPlantillaFacturaDetalleFormJInternalFrame(jDesktopPane,this.tipoplantillafacturaSessionBean.getConGuardarRelaciones(),this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPlantillaFactura);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.setVisible(false);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.tipoplantillafacturaLogic=this.tipoplantillafacturaLogic;
		
		this.cargarCombosFrameForeignKeyTipoPlantillaFactura("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPlantillaFactura();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPlantillaFactura();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoPlantillaFactura("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoPlantillaFactura();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPlantillaFactura"));
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonModificarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"ModificarTipoPlantillaFactura"));

		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonModificarToolBarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPlantillaFactura"));
					
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemModificarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPlantillaFactura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonActualizarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"ActualizarTipoPlantillaFactura"));
		
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonActualizarToolBarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPlantillaFactura"));
						
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemActualizarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPlantillaFactura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonEliminarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"EliminarTipoPlantillaFactura"));
		
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonEliminarToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPlantillaFactura"));
								
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemEliminarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPlantillaFactura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonCancelarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"CancelarTipoPlantillaFactura"));
		
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonCancelarToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPlantillaFactura"));
					
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemCancelarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPlantillaFactura"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemDetalleCerrarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPlantillaFactura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPlantillaFactura"));
		
		
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPlantillaFactura"));
		
		
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPlantillaFactura"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonidTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPlantillaFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonid_empresaTipoPlantillaFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPlantillaFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonid_empresaTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPlantillaFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtoncodigoTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPlantillaFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonnombreTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPlantillaFacturaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jTabbedPaneRelacionesTipoPlantillaFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPlantillaFactura"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoPlantillaFactura"));
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPlantillaFactura"));
		}
		
		this.jTableDatosTipoPlantillaFactura.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoPlantillaFactura"));
		
		this.jTableDatosTipoPlantillaFactura.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoPlantillaFactura"));
		
		this.jButtonNuevoTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"NuevoTipoPlantillaFactura"));
		
		this.jButtonDuplicarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"DuplicarTipoPlantillaFactura"));
		
		this.jButtonCopiarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"CopiarTipoPlantillaFactura"));
		
		this.jButtonVerFormTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"VerFormTipoPlantillaFactura"));
		
		
		this.jButtonNuevoToolBarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoPlantillaFactura"));
			
		this.jButtonDuplicarToolBarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoPlantillaFactura"));
			
		this.jMenuItemNuevoTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoPlantillaFactura"));
			
		this.jMenuItemDuplicarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoPlantillaFactura"));		
		
		
		this.jButtonNuevoRelacionesTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoPlantillaFactura"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoPlantillaFactura"));
			
		this.jMenuItemNuevoRelacionesTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoPlantillaFactura"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonModificarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"ModificarTipoPlantillaFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonModificarToolBarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPlantillaFactura"));
			
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemModificarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPlantillaFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonActualizarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"ActualizarTipoPlantillaFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonActualizarToolBarTipoPlantillaFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPlantillaFactura"));
				
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemActualizarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPlantillaFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonEliminarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"EliminarTipoPlantillaFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonEliminarToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPlantillaFactura"));
						
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemEliminarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPlantillaFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonCancelarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"CancelarTipoPlantillaFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonCancelarToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPlantillaFactura"));
			
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemCancelarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPlantillaFactura"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoPlantillaFactura"));		
		
		
		this.jButtonCerrarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"CerrarTipoPlantillaFactura"));
		
		
		this.jButtonCerrarToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoPlantillaFactura"));
			
		this.jMenuItemCerrarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoPlantillaFactura"));
			
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jMenuItemDetalleCerrarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPlantillaFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoPlantillaFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPlantillaFactura"));
		}
		
		this.jButtonCopiarToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoPlantillaFactura"));
			
		this.jButtonVerFormToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoPlantillaFactura"));
		
		this.jMenuItemGuardarCambiosTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoPlantillaFactura"));
			
		this.jMenuItemCopiarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoPlantillaFactura"));		
		
		this.jMenuItemVerFormTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoPlantillaFactura"));		
		
		
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPlantillaFactura"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoPlantillaFactura"));
			
		this.jMenuItemGuardarCambiosTablaTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPlantillaFactura"));		
		
		
		
		this.jButtonRecargarInformacionTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoPlantillaFactura"));
					
		this.jButtonRecargarInformacionToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoPlantillaFactura"));
		
		this.jMenuItemRecargarInformacionTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoPlantillaFactura"));		
		
		
		
		this.jButtonAnterioresTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"AnterioresTipoPlantillaFactura"));
		
		
		this.jButtonAnterioresToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoPlantillaFactura"));
		
		this.jMenuItemAnterioresTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoPlantillaFactura"));		
		
		
		this.jButtonSiguientesTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"SiguientesTipoPlantillaFactura"));
		
		
		this.jButtonSiguientesToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoPlantillaFactura"));
			
		this.jMenuItemSiguientesTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoPlantillaFactura"));
			
		this.jMenuItemAbrirOrderByTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoPlantillaFactura"));
			
		this.jMenuItemMostrarOcultarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoPlantillaFactura"));
			
		this.jMenuItemDetalleAbrirOrderByTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoPlantillaFactura"));
			
		this.jMenuItemDetalleMostarOcultarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoPlantillaFactura"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoPlantillaFactura"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoPlantillaFactura"));
			
		this.jMenuItemNuevoGuardarCambiosTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoPlantillaFactura"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoPlantillaFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoPlantillaFactura"));

		this.jCheckBoxSeleccionadosTipoPlantillaFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoPlantillaFactura"));
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPlantillaFactura"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoPlantillaFactura"));
			
		this.jComboBoxTiposAccionesTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoPlantillaFactura"));
					
		this.jComboBoxTiposSeleccionarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoPlantillaFactura"));
			
		this.jTextFieldValorCampoGeneralTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoPlantillaFactura"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonidTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPlantillaFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonid_empresaTipoPlantillaFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPlantillaFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonid_empresaTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPlantillaFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtoncodigoTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPlantillaFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonnombreTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPlantillaFacturaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoPlantillaFactura!=null) {
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPlantillaFactura"));
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPlantillaFactura"));
				this.jInternalFrameReporteDinamicoTipoPlantillaFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPlantillaFactura"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPlantillaFactura"));				
			//this.jButtonGenerarReporteDinamicoTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPlantillaFactura"));
			//this.jButtonGenerarExcelReporteDinamicoTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPlantillaFactura"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoPlantillaFactura!=null) {
				this.jInternalFrameImportacionTipoPlantillaFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPlantillaFactura"));
				this.jInternalFrameImportacionTipoPlantillaFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPlantillaFactura"));
				this.jInternalFrameImportacionTipoPlantillaFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPlantillaFactura"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoPlantillaFactura"));
			
			this.jButtonAbrirOrderByToolBarTipoPlantillaFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoPlantillaFactura"));			
			
			if(this.jInternalFrameOrderByTipoPlantillaFactura!=null) {
				this.jInternalFrameOrderByTipoPlantillaFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPlantillaFactura"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPlantillaFactura.jTabbedPaneRelacionesTipoPlantillaFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPlantillaFactura"));
		
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
            		closingInternalFrameTipoPlantillaFactura();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoPlantillaFactura = (JInternalFrameBase)event.getSource();
	            	
	            TipoPlantillaFacturaBeanSwingJInternalFrame jInternalFrameParent=(TipoPlantillaFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPlantillaFactura.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoPlantillaFacturaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoPlantillaFactura.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoPlantillaFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoPlantillaFactura.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoPlantillaFactura.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoPlantillaFactura";
		inputMap = this.jButtonNuevoTipoPlantillaFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoPlantillaFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoPlantillaFactura";
		inputMap = this.jButtonNuevoRelacionesTipoPlantillaFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoPlantillaFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPlantillaFacturaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoPlantillaFactura";
		inputMap = this.jButtonModificarTipoPlantillaFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoPlantillaFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoPlantillaFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoPlantillaFactura";
		inputMap = this.jButtonActualizarTipoPlantillaFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoPlantillaFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoPlantillaFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoPlantillaFactura";
		inputMap = this.jButtonEliminarTipoPlantillaFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoPlantillaFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoPlantillaFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoPlantillaFactura";
		inputMap = this.jButtonCancelarTipoPlantillaFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoPlantillaFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoPlantillaFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoPlantillaFactura";
		inputMap = this.jButtonCerrarTipoPlantillaFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoPlantillaFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoPlantillaFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoPlantillaFactura";
		inputMap = this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosTipoPlantillaFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonGuardarCambiosTipoPlantillaFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoPlantillaFactura.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoPlantillaFacturaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoPlantillaFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoPlantillaFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoPlantillaFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoPlantillaFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoPlantillaFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoPlantillaFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonidTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPlantillaFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonid_empresaTipoPlantillaFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoPlantillaFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonid_empresaTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoPlantillaFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtoncodigoTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoPlantillaFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jButtonnombreTipoPlantillaFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPlantillaFacturaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoPlantillaFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoPlantillaFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoPlantillaFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoPlantillaFactura.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoPlantillaFactura(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
					tipoplantillafacturaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturas) {
					tipoplantillafacturaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoPlantillaFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPlantillaFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
						tipoplantillafacturaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturas) {
						tipoplantillafacturaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPlantillaFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPlantillaFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPlantillaFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoPlantillaFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPlantillaFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoPlantillaFactura.getSelectedRows();
			
			TipoPlantillaFactura tipoplantillafacturaLocal=new TipoPlantillaFactura();
			
			//this.seleccionarTodosTipoPlantillaFactura(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoplantillafacturaLocal =(TipoPlantillaFactura) this.tipoplantillafacturaLogic.getTipoPlantillaFacturas().toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoplantillafacturaLocal =(TipoPlantillaFactura) this.tipoplantillafacturas.toArray()[this.jTableDatosTipoPlantillaFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoplantillafacturaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
						tipoplantillafacturaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturas) {
						tipoplantillafacturaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPlantillaFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPlantillaFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPlantillaFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoPlantillaFacturaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoPlantillaFacturaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoPlantillaFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoPlantillaFactura(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoPlantillaFactura.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
				
						if(sTipoSeleccionar.equals(TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoplantillafacturaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoplantillafacturaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturas) {
					
						if(sTipoSeleccionar.equals(TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoplantillafacturaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoplantillafacturaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoPlantillaFacturaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoPlantillaFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoPlantillaFactura=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoPlantillaFactura.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoPlantillaFactura) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoPlantillaFactura(conSplash);
				
					this.generarReporteTipoPlantillaFacturasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPlantillaFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoPlantillaFacturasSeleccionados();
				//this.jComboBoxTiposAccionesTipoPlantillaFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPlantillaFacturasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoPlantillaFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPlantillaFacturasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoPlantillaFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPlantillaFactura();
				
				this.exportarTipoPlantillaFacturasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPlantillaFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoPlantillaFacturas();
				//this.importarTipoPlantillaFacturas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPlantillaFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPlantillaFactura();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoPlantillaFacturasSeleccionados();
				//this.jComboBoxTiposAccionesTipoPlantillaFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Plantilla Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoPlantillaFactura();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoPlantillaFactura)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoPlantillaFactura(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Plantilla Factura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPlantillaFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxTiposAccionesFormularioTipoPlantillaFactura.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoPlantillaFactura();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoPlantillaFactura(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoPlantillaFacturaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoPlantillaFactura();
			
			if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();		
			TipoPlantillaFactura tipoplantillafactura=new TipoPlantillaFactura();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoPlantillaFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoPlantillaFactura.getSelectedItem();
			
			
			
			
			tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoplantillafacturasSeleccionados.size()==1) {
				for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturasSeleccionados) {
					tipoplantillafactura=tipoplantillafacturaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoPlantillaFactura();
			
      		//this.finishProcessTipoPlantillaFactura(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoPlantillaFacturaReturnGeneral() throws Exception {
		if(this.tipoplantillafacturaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoplantillafacturaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoplantillafacturaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoplantillafacturaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoplantillafacturaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoplantillafacturaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoPlantillaFactura(false);
		}
		
		if(this.tipoplantillafacturaReturnGeneral.getConRetornoLista() || this.tipoplantillafacturaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoplantillafacturaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoplantillafacturaLogic.setTipoPlantillaFacturas(this.tipoplantillafacturaReturnGeneral.getTipoPlantillaFacturas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoplantillafacturaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoplantillafacturaLogic.setTipoPlantillaFactura(this.tipoplantillafacturaReturnGeneral.getTipoPlantillaFactura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoPlantillaFactura(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoPlantillaFactura() throws Exception {
		
		
	}
	
	public ArrayList<TipoPlantillaFactura> getTipoPlantillaFacturasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoPlantillaFactura) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturaLogic.getTipoPlantillaFacturas()) {
					if(tipoplantillafacturaAux.getIsSelected()) {
						tipoplantillafacturasSeleccionados.add(tipoplantillafacturaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPlantillaFactura tipoplantillafacturaAux:this.tipoplantillafacturas) {
					if(tipoplantillafacturaAux.getIsSelected()) {
						tipoplantillafacturasSeleccionados.add(tipoplantillafacturaAux);				
					}
				}
			}
			
			if(tipoplantillafacturasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoplantillafacturasSeleccionados.addAll(this.tipoplantillafacturaLogic.getTipoPlantillaFacturas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoplantillafacturasSeleccionados.addAll(this.tipoplantillafacturas);				
					}
				}
			}
		} else {
			tipoplantillafacturasSeleccionados.add(this.tipoplantillafactura);
		}
		
		return tipoplantillafacturasSeleccionados;
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
	
	public void generarReporteTipoPlantillaFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoPlantillaFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoPlantillaFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPlantillaFacturasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPlantillaFacturasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Plantilla Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoPlantillaFacturasSeleccionados() throws Exception {
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();		
		
		tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoPlantillaFacturas("Todos",tipoplantillafacturasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoPlantillaFacturasSeleccionados() throws Exception {
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();		
		
		tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoPlantillaFacturas("Todos",tipoplantillafacturasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoPlantillaFacturasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();
		
		tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoPlantillaFacturas("Todos",tipoplantillafacturasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoPlantillaFacturasSeleccionados() throws Exception {
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoPlantillaFactura();
		
		
		tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoPlantillaFactura();
		
		
		//this.generarReporteTipoPlantillaFacturas("Todos",tipoplantillafacturasSeleccionados ,tipoplantillafacturaImplementable,tipoplantillafacturaImplementableHome);
	}
	
	public void mostrarImportacionTipoPlantillaFacturas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoPlantillaFactura();
		
		this.abrirFrameImportacionTipoPlantillaFactura();		
		
			
		//this.generarReporteTipoPlantillaFacturas("Todos",tipoplantillafacturasSeleccionados ,tipoplantillafacturaImplementable,tipoplantillafacturaImplementableHome);
	}
	
	public void importarTipoPlantillaFacturas() throws Exception {		
	
	}
	
	public void exportarTipoPlantillaFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoPlantillaFacturasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoPlantillaFacturasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoPlantillaFacturasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Plantilla Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoPlantillaFacturasSeleccionados() throws Exception {
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();		
		
		tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoplantillafactura."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoPlantillaFactura(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoPlantillaFactura(tipoplantillafacturaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoplantillafacturaAux.setsDetalleGeneralEntityReporte(tipoplantillafacturaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plantilla Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoPlantillaFactura(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoPlantillaFacturaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPlantillaFacturaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoplantillafactura.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoplantillafactura.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoplantillafactura.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoplantillafactura.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoplantillafactura.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoPlantillaFacturasSeleccionados() throws Exception {
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();		
		
		tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoplantillafactura.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoPlantillaFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoPlantillaFactura(row);				
				iRow++;
			}				
			
			for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoPlantillaFactura(tipoplantillafacturaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plantilla Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoPlantillaFacturasSeleccionados() throws Exception {
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();		
		
		tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoplantillafactura.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoplantillafacturas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoplantillafactura");
			//elementRoot.appendChild(element);
		
			for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturasSeleccionados) {
				element = document.createElement("tipoplantillafactura");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoPlantillaFactura(tipoplantillafacturaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Plantilla Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoPlantillaFactura(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoplantillafactura.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoplantillafactura.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoplantillafactura.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoplantillafactura.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoPlantillaFactura(TipoPlantillaFactura tipoplantillafactura,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoPlantillaFacturaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoplantillafactura.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoPlantillaFacturaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoplantillafactura.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoPlantillaFacturaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoplantillafactura.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoPlantillaFacturaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoplantillafactura.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoPlantillaFacturaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoplantillafactura.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoPlantillaFacturasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados=new ArrayList<TipoPlantillaFactura>();
		
		tipoplantillafacturasSeleccionados=this.getTipoPlantillaFacturasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoPlantillaFactura(tipoplantillafacturasSeleccionados);
		
		this.generarReporteTipoPlantillaFacturas("Todos",tipoplantillafacturasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoPlantillaFactura(ArrayList<TipoPlantillaFactura> tipoplantillafacturasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoPlantillaFactura tipoplantillafacturaAux:tipoplantillafacturasSeleccionados) {
				tipoplantillafacturaAux.setsDetalleGeneralEntityReporte(tipoplantillafacturaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoPlantillaFacturaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoplantillafacturaAux.setsDescripcionGeneralEntityReporte1(tipoplantillafacturaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoPlantillaFacturaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoplantillafacturaAux.setsDescripcionGeneralEntityReporte1(tipoplantillafacturaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoPlantillaFacturaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoplantillafacturaAux.setsDescripcionGeneralEntityReporte1(tipoplantillafacturaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPlantillaFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoPlantillaFactura(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoPlantillaFactura=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=true;
				this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=true;
			}
			
			this.isVisibilidadCeldaModificarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=false;
			this.isVisibilidadCeldaModificarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=true;
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=false;
			this.isVisibilidadCeldaModificarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=true;
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=true;
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=false;
			this.isVisibilidadCeldaModificarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=true;
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=true;
			this.isVisibilidadCeldaModificarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=false;
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=false;
			this.isVisibilidadCeldaModificarTipoPlantillaFactura=true;
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaCancelarTipoPlantillaFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPlantillaFactura=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoPlantillaFacturaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=true;
		} else {
			this.actualizarEstadoPanelsTipoPlantillaFactura(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoPlantillaFactura=false;
			//this.isVisibilidadCeldaVerFormTipoPlantillaFactura=false;
			this.isVisibilidadCeldaDuplicarTipoPlantillaFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoPlantillaFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPlantillaFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoplantillafacturaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=false;												
			}
			
			this.jButtonCerrarTipoPlantillaFactura.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPlantillaFactura=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoplantillafactura)) {
			this.isVisibilidadCeldaActualizarTipoPlantillaFactura=false;
			this.isVisibilidadCeldaEliminarTipoPlantillaFactura=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPlantillaFactura() {
	}
	
	public void actualizarEstadoPanelsTipoPlantillaFactura(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosEdicionTipoPlantillaFactura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPlantillaFactura!=null) {
				this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosTipoPlantillaFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPlantillaFactura!=null) {
				this.jPanelPaginacionTipoPlantillaFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPlantillaFactura!=null) {
				this.jPanelParametrosReportesTipoPlantillaFactura.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosEdicionTipoPlantillaFactura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPlantillaFactura!=null) {
				this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosTipoPlantillaFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPlantillaFactura!=null) {
				this.jPanelPaginacionTipoPlantillaFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPlantillaFactura!=null) {
				this.jPanelParametrosReportesTipoPlantillaFactura.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosEdicionTipoPlantillaFactura.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPlantillaFactura!=null) {
				this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosTipoPlantillaFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPlantillaFactura!=null) {
				this.jPanelPaginacionTipoPlantillaFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPlantillaFactura!=null) {
				this.jPanelParametrosReportesTipoPlantillaFactura.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosEdicionTipoPlantillaFactura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPlantillaFactura!=null) {
				this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosTipoPlantillaFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPlantillaFactura!=null) {
				this.jPanelPaginacionTipoPlantillaFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPlantillaFactura!=null) {
				this.jPanelParametrosReportesTipoPlantillaFactura.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosEdicionTipoPlantillaFactura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPlantillaFactura!=null) {
				this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosTipoPlantillaFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPlantillaFactura!=null) {
				this.jPanelPaginacionTipoPlantillaFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPlantillaFactura!=null) {
				this.jPanelParametrosReportesTipoPlantillaFactura.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosEdicionTipoPlantillaFactura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPlantillaFactura!=null) {
				this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosTipoPlantillaFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPlantillaFactura!=null) {
				this.jPanelPaginacionTipoPlantillaFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPlantillaFactura!=null) {
				this.jPanelParametrosReportesTipoPlantillaFactura.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosEdicionTipoPlantillaFactura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPlantillaFactura!=null) {
				this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPlantillaFactura!=null) {
				this.jScrollPanelDatosTipoPlantillaFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPlantillaFactura!=null) {
				this.jPanelPaginacionTipoPlantillaFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPlantillaFactura!=null) {
				this.jPanelParametrosReportesTipoPlantillaFactura.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoPlantillaFactura!=null) {
					this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoPlantillaFactura!=null) {
				this.jPanelParametrosReportesTipoPlantillaFactura.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoplantillafacturaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPlantillaFactura!=null) {
				this.jTabbedPaneBusquedasTipoPlantillaFactura.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoPlantillaFactura!=null) {
				this.jPanelParametrosReportesTipoPlantillaFactura.setVisible(true);
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
		
		//TipoPlantillaFacturaSessionBean tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean();
		
		if(this.tipoplantillafacturaSessionBean==null) {
			this.tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean();
		}
		
		this.tipoplantillafacturaSessionBean.setsUltimaBusquedaTipoPlantillaFactura(this.getsAccionBusqueda());
		this.tipoplantillafacturaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoplantillafacturaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoplantillafacturaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoPlantillaFacturaSessionBean tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean();
		
		if(this.tipoplantillafacturaSessionBean==null) {
			this.tipoplantillafacturaSessionBean=new TipoPlantillaFacturaSessionBean();
		}
		
		if(this.tipoplantillafacturaSessionBean.getsUltimaBusquedaTipoPlantillaFactura()!=null&&!this.tipoplantillafacturaSessionBean.getsUltimaBusquedaTipoPlantillaFactura().equals("")) {
			this.setsAccionBusqueda(tipoplantillafacturaSessionBean.getsUltimaBusquedaTipoPlantillaFactura());
			this.setiNumeroPaginacion(tipoplantillafacturaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoplantillafacturaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoplantillafacturaSessionBean.getid_empresa());
				tipoplantillafacturaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoplantillafacturaSessionBean.setsUltimaBusquedaTipoPlantillaFactura("");
		this.tipoplantillafacturaSessionBean.setiNumeroPaginacion(TipoPlantillaFacturaConstantesFunciones.INUMEROPAGINACION);
		this.tipoplantillafacturaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoPlantillaFactura(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoPlantillaFactura() {
		this.updateBorderResaltarBusquedasFormularioTipoPlantillaFactura();
		this.updateVisibilidadBusquedasFormularioTipoPlantillaFactura();
		this.updateHabilitarBusquedasFormularioTipoPlantillaFactura();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoPlantillaFactura() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoPlantillaFactura.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoPlantillaFactura() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoPlantillaFactura.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoPlantillaFactura() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoPlantillaFactura.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoPlantillaFactura(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoPlantillaFactura.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoPlantillaFactura() throws Exception {

		if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoPlantillaFactura();
		this.updateVisibilidadResaltarControlesFormularioTipoPlantillaFactura();
		this.updateHabilitarResaltarControlesFormularioTipoPlantillaFactura();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoPlantillaFactura() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoplantillafacturaConstantesFunciones.resaltaridTipoPlantillaFactura!=null && this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.setBorder(this.tipoplantillafacturaConstantesFunciones.resaltaridTipoPlantillaFactura);}
		if(this.tipoplantillafacturaConstantesFunciones.resaltarid_empresaTipoPlantillaFactura!=null && this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.setBorder(this.tipoplantillafacturaConstantesFunciones.resaltarid_empresaTipoPlantillaFactura);}
		if(this.tipoplantillafacturaConstantesFunciones.resaltarcodigoTipoPlantillaFactura!=null && this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextFieldcodigoTipoPlantillaFactura.setBorder(this.tipoplantillafacturaConstantesFunciones.resaltarcodigoTipoPlantillaFactura);}
		if(this.tipoplantillafacturaConstantesFunciones.resaltarnombreTipoPlantillaFactura!=null && this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextAreanombreTipoPlantillaFactura.setBorder(this.tipoplantillafacturaConstantesFunciones.resaltarnombreTipoPlantillaFactura);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoPlantillaFactura() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
	
		//this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.setVisible(this.tipoplantillafacturaConstantesFunciones.mostraridTipoPlantillaFactura);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jPanelidTipoPlantillaFactura.setVisible(this.tipoplantillafacturaConstantesFunciones.mostraridTipoPlantillaFactura);
		//this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.setVisible(this.tipoplantillafacturaConstantesFunciones.mostrarid_empresaTipoPlantillaFactura);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jPanelid_empresaTipoPlantillaFactura.setVisible(this.tipoplantillafacturaConstantesFunciones.mostrarid_empresaTipoPlantillaFactura);
		//this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextFieldcodigoTipoPlantillaFactura.setVisible(this.tipoplantillafacturaConstantesFunciones.mostrarcodigoTipoPlantillaFactura);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jPanelcodigoTipoPlantillaFactura.setVisible(this.tipoplantillafacturaConstantesFunciones.mostrarcodigoTipoPlantillaFactura);
		//this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextAreanombreTipoPlantillaFactura.setVisible(this.tipoplantillafacturaConstantesFunciones.mostrarnombreTipoPlantillaFactura);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jPanelnombreTipoPlantillaFactura.setVisible(this.tipoplantillafacturaConstantesFunciones.mostrarnombreTipoPlantillaFactura);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoPlantillaFactura() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPlantillaFactura!=null) {
	
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jLabelidTipoPlantillaFactura.setEnabled(this.tipoplantillafacturaConstantesFunciones.activaridTipoPlantillaFactura);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jComboBoxid_empresaTipoPlantillaFactura.setEnabled(this.tipoplantillafacturaConstantesFunciones.activarid_empresaTipoPlantillaFactura);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextFieldcodigoTipoPlantillaFactura.setEnabled(this.tipoplantillafacturaConstantesFunciones.activarcodigoTipoPlantillaFactura);
		this.jInternalFrameDetalleFormTipoPlantillaFactura.jTextAreanombreTipoPlantillaFactura.setEnabled(this.tipoplantillafacturaConstantesFunciones.activarnombreTipoPlantillaFactura);
		}
	}
	
		
}