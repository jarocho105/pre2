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

import com.bydan.erp.contabilidad.util.TipoFormatoConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoFormatoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoFormatoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoFormatoBean;
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
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoFormatoBeanSwingJInternalFrame extends TipoFormatoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoFormatoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoFormato> tipoformatoValidator = new ClassValidator<TipoFormato>(TipoFormato.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoFormato tipoformato;	
	public TipoFormato tipoformatoAux;
	public TipoFormato tipoformatoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoFormato tipoformatoTotales;
	public Long idTipoFormatoActual;
	public Long iIdNuevoTipoFormato=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosFormato=false;

	public Boolean getIsTienePermisosFormato() {
		return isTienePermisosFormato;
	}

	public void setIsTienePermisosFormato(Boolean isTienePermisosFormato) {
		this.isTienePermisosFormato= isTienePermisosFormato;
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
	
	public Boolean isPermisoTodoTipoFormato;
	public Boolean isPermisoNuevoTipoFormato;
	public Boolean isPermisoActualizarTipoFormato;
	public Boolean isPermisoActualizarOriginalTipoFormato;
	public Boolean isPermisoEliminarTipoFormato;
	public Boolean isPermisoGuardarCambiosTipoFormato;
	public Boolean isPermisoConsultaTipoFormato;
	public Boolean isPermisoBusquedaTipoFormato;
	public Boolean isPermisoReporteTipoFormato;
	public Boolean isPermisoPaginacionMedioTipoFormato;
	public Boolean isPermisoPaginacionAltoTipoFormato;
	public Boolean isPermisoPaginacionTodoTipoFormato;
	public Boolean isPermisoCopiarTipoFormato;
	public Boolean isPermisoVerFormTipoFormato;
	public Boolean isPermisoDuplicarTipoFormato;
	public Boolean isPermisoOrdenTipoFormato;
	
	
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
	
	public TipoFormatoParameterReturnGeneral tipoformatoReturnGeneral;
	public TipoFormatoParameterReturnGeneral tipoformatoParameterGeneral;
	
	

	public FormatoLogic formatoLogic=null;

	public FormatoLogic getFormatoLogic() {
		return formatoLogic;
	}

	public void setFormatoLogic(FormatoLogic formatoLogic) {
		this.formatoLogic = formatoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoFormato=false;
	public Boolean esParaAccionDesdeFormularioTipoFormato=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoFormatoSessionBeanAdditional tipoformatoSessionBeanAdditional=null;
	
	public TipoFormatoSessionBeanAdditional getTipoFormatoSessionBeanAdditional() {
		return this.tipoformatoSessionBeanAdditional;
	}
	
	public void setTipoFormatoSessionBeanAdditional(TipoFormatoSessionBeanAdditional tipoformatoSessionBeanAdditional) {
		try {
			this.tipoformatoSessionBeanAdditional=tipoformatoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoFormatoBeanSwingJInternalFrameAdditional tipoformatoBeanSwingJInternalFrameAdditional=null;
	//public class TipoFormatoBeanSwingJInternalFrame
	
	public TipoFormatoBeanSwingJInternalFrameAdditional getTipoFormatoBeanSwingJInternalFrameAdditional() {
		return this.tipoformatoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoFormatoBeanSwingJInternalFrameAdditional(TipoFormatoBeanSwingJInternalFrameAdditional tipoformatoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoformatoBeanSwingJInternalFrameAdditional=tipoformatoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoFormatoLogic tipoformatoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoFormato tipoformatoBean;
	public TipoFormatoConstantesFunciones tipoformatoConstantesFunciones;
	//public TipoFormatoParameterReturnGeneral tipoformatoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoFormato> tipoformatos;	
	//public List<TipoFormato> tipoformatosEliminados;
	//public List<TipoFormato> tipoformatosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoFormato=false;
	public Boolean isVisibilidadCeldaDuplicarTipoFormato=true;
	public Boolean isVisibilidadCeldaCopiarTipoFormato=true;
	public Boolean isVisibilidadCeldaVerFormTipoFormato=true;
	public Boolean isVisibilidadCeldaOrdenTipoFormato=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoFormato=false;
	public Boolean isVisibilidadCeldaModificarTipoFormato=false;
	public Boolean isVisibilidadCeldaActualizarTipoFormato=false;
	public Boolean isVisibilidadCeldaEliminarTipoFormato=false;
	public Boolean isVisibilidadCeldaCancelarTipoFormato=false;
	public Boolean isVisibilidadCeldaGuardarTipoFormato=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoFormato=false;	
	
	
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoFormato() {
		return this.iIdNuevoTipoFormato;
	}

	public void setiIdNuevoTipoFormato(Long iIdNuevoTipoFormato) {
		this.iIdNuevoTipoFormato = iIdNuevoTipoFormato;
	}
	
	public Long getidTipoFormatoActual() {
		return this.idTipoFormatoActual;
	}

	public void setidTipoFormatoActual(Long idTipoFormatoActual) {
		this.idTipoFormatoActual = idTipoFormatoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoFormato gettipoformato() {
		return this.tipoformato;
	}

	public void settipoformato(TipoFormato tipoformato) {
		this.tipoformato = tipoformato;
	}
	
	public TipoFormato gettipoformatoAux() {
		return this.tipoformatoAux;
	}

	public void settipoformatoAux(TipoFormato tipoformatoAux) {
		this.tipoformatoAux = tipoformatoAux;
	}				
	
	public TipoFormato gettipoformatoAnterior() {
		return this.tipoformatoAnterior;
	}

	public void settipoformatoAnterior(TipoFormato tipoformatoAnterior) {
		this.tipoformatoAnterior = tipoformatoAnterior;
	}	
	
	public TipoFormato gettipoformatoTotales() {
		return this.tipoformatoTotales;
	}

	public void settipoformatoTotales(TipoFormato tipoformatoTotales) {
		this.tipoformatoTotales = tipoformatoTotales;
	}	
	
	public TipoFormato gettipoformatoBean() {
		return this.tipoformatoBean;
	}

	public void settipoformatoBean(TipoFormato tipoformatoBean) {
		this.tipoformatoBean = tipoformatoBean;
	}	
	
	public TipoFormatoParameterReturnGeneral gettipoformatoReturnGeneral() {
		return this.tipoformatoReturnGeneral;
	}

	public void settipoformatoReturnGeneral(TipoFormatoParameterReturnGeneral tipoformatoReturnGeneral) {
		this.tipoformatoReturnGeneral = tipoformatoReturnGeneral;
	}	
	
	
	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
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
	
	
	public TipoFormatoLogic getTipoFormatoLogic()	{		
		return tipoformatoLogic;
	}

	public void setTipoFormatoLogic(TipoFormatoLogic tipoformatoLogic) {
		this.tipoformatoLogic = tipoformatoLogic;
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
	
	public Boolean getIsEsNuevoTipoFormato() {
		return isEsNuevoTipoFormato;
	}

	public void setIsEsNuevoTipoFormato(Boolean isEsNuevoTipoFormato) {
		this.isEsNuevoTipoFormato = isEsNuevoTipoFormato;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoFormato() {
		return esParaAccionDesdeFormularioTipoFormato;
	}
	
	public void setEsParaAccionDesdeFormularioTipoFormato(Boolean esParaAccionDesdeFormularioTipoFormato) {
		this.esParaAccionDesdeFormularioTipoFormato = esParaAccionDesdeFormularioTipoFormato;
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

			if(this.tipoformatoSessionBean==null) {
				this.tipoformatoSessionBean=new TipoFormatoSessionBean();
			}

			if(!this.tipoformatoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoformatoSessionBean.getlidEmpresaActual());
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

					if(this.tipoformato!=null) {
						this.tipoformato.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoFormato!=null) {
						this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoFormato.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoFormato!=null) {
						if(this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoFormatoGenerico)throws Exception
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
				jComboBoxid_empresaTipoFormatoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoFormatoGenerico!=null && jComboBoxid_empresaTipoFormatoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoFormatoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoFormato tipoformato,JComboBox jComboBoxid_empresaTipoFormatoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoFormatoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoFormatoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoformato.setid_empresa(empresaAux.getId());
				tipoformato.setempresa_descripcion(TipoFormatoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoformato.setEmpresa(empresaAux);			}
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

					if(!TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoFormato!=null) { 
							this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoFormato!=null) { 
					}

					if(!TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoFormato!=null) {
							this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoFormato!=null) {
							this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoFormato() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoFormatoConstantesFunciones.refrescarForeignKeysDescripcionesTipoFormato(this.tipoformatoLogic.getTipoFormatos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoFormatoConstantesFunciones.refrescarForeignKeysDescripcionesTipoFormato(this.tipoformatos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoformatoLogic.setTipoFormatos(this.tipoformatos);
			tipoformatoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoFormatoParameterReturnGeneral getTipoFormatoParameterGeneral() {
		return this.tipoformatoParameterGeneral;
	}
	
	public void setTipoFormatoParameterGeneral(TipoFormatoParameterReturnGeneral tipoformatoParameterGeneral) {
		this.tipoformatoParameterGeneral = tipoformatoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoFormato() {
		return isPermisoTodoTipoFormato;
	}

	public void setIsPermisoTodoTipoFormato(Boolean isPermisoTodoTipoFormato) {
		this.isPermisoTodoTipoFormato = isPermisoTodoTipoFormato;
	}

	public Boolean getIsPermisoNuevoTipoFormato() {
		return isPermisoNuevoTipoFormato;
	}

	public void setIsPermisoNuevoTipoFormato(Boolean isPermisoNuevoTipoFormato) {
		this.isPermisoNuevoTipoFormato = isPermisoNuevoTipoFormato;
	}

	public Boolean getIsPermisoActualizarTipoFormato() {
		return isPermisoActualizarTipoFormato;
	}

	public void setIsPermisoActualizarTipoFormato(Boolean isPermisoActualizarTipoFormato) {
		this.isPermisoActualizarTipoFormato = isPermisoActualizarTipoFormato;
	}

	public Boolean getIsPermisoEliminarTipoFormato() {
		return isPermisoEliminarTipoFormato;
	}

	public void setIsPermisoEliminarTipoFormato(Boolean isPermisoEliminarTipoFormato) {
		this.isPermisoEliminarTipoFormato = isPermisoEliminarTipoFormato;
	}

	public Boolean getIsPermisoGuardarCambiosTipoFormato() {
		return isPermisoGuardarCambiosTipoFormato;
	}

	public void setIsPermisoGuardarCambiosTipoFormato(Boolean isPermisoGuardarCambiosTipoFormato) {
		this.isPermisoGuardarCambiosTipoFormato = isPermisoGuardarCambiosTipoFormato;
	}
	
	public Boolean getIsPermisoConsultaTipoFormato() {
		return isPermisoConsultaTipoFormato;
	}

	public void setIsPermisoConsultaTipoFormato(Boolean isPermisoConsultaTipoFormato) {
		this.isPermisoConsultaTipoFormato = isPermisoConsultaTipoFormato;
	}

	public Boolean getIsPermisoBusquedaTipoFormato() {
		return isPermisoBusquedaTipoFormato;
	}

	public void setIsPermisoBusquedaTipoFormato(Boolean isPermisoBusquedaTipoFormato) {
		this.isPermisoBusquedaTipoFormato = isPermisoBusquedaTipoFormato;
	}

	public Boolean getIsPermisoReporteTipoFormato() {
		return isPermisoReporteTipoFormato;
	}

	public void setIsPermisoReporteTipoFormato(Boolean isPermisoReporteTipoFormato) {
		this.isPermisoReporteTipoFormato = isPermisoReporteTipoFormato;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoFormato() {
		return isPermisoPaginacionMedioTipoFormato;
	}

	public void setIsPermisoPaginacionMedioTipoFormato(Boolean isPermisoPaginacionMedioTipoFormato) {
		this.isPermisoPaginacionMedioTipoFormato = isPermisoPaginacionMedioTipoFormato;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoFormato() {
		return isPermisoPaginacionTodoTipoFormato;
	}

	public void setIsPermisoPaginacionTodoTipoFormato(Boolean isPermisoPaginacionTodoTipoFormato) {
		this.isPermisoPaginacionTodoTipoFormato = isPermisoPaginacionTodoTipoFormato;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoFormato() {
		return isPermisoPaginacionAltoTipoFormato;
	}

	public void setIsPermisoPaginacionAltoTipoFormato(Boolean isPermisoPaginacionAltoTipoFormato) {
		this.isPermisoPaginacionAltoTipoFormato = isPermisoPaginacionAltoTipoFormato;
	}
	
	public Boolean getIsPermisoCopiarTipoFormato() {
		return isPermisoCopiarTipoFormato;
	}

	public void setIsPermisoCopiarTipoFormato(Boolean isPermisoCopiarTipoFormato) {
		this.isPermisoCopiarTipoFormato = isPermisoCopiarTipoFormato;
	}
	
	public Boolean getIsPermisoVerFormTipoFormato() {
		return isPermisoVerFormTipoFormato;
	}

	public void setIsPermisoVerFormTipoFormato(Boolean isPermisoVerFormTipoFormato) {
		this.isPermisoVerFormTipoFormato = isPermisoVerFormTipoFormato;
	}
	
	public Boolean getIsPermisoDuplicarTipoFormato() {
		return isPermisoDuplicarTipoFormato;
	}

	public void setIsPermisoDuplicarTipoFormato(Boolean isPermisoDuplicarTipoFormato) {
		this.isPermisoDuplicarTipoFormato = isPermisoDuplicarTipoFormato;
	}
	
	public Boolean getIsPermisoOrdenTipoFormato() {
		return isPermisoOrdenTipoFormato;
	}

	public void setIsPermisoOrdenTipoFormato(Boolean isPermisoOrdenTipoFormato) {
		this.isPermisoOrdenTipoFormato = isPermisoOrdenTipoFormato;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoFormato() {
		return isVisibilidadCeldaNuevoTipoFormato;
	}

	public void setIsVisibilidadCeldaNuevoTipoFormato(Boolean isVisibilidadCeldaNuevoTipoFormato) {
		this.isVisibilidadCeldaNuevoTipoFormato = isVisibilidadCeldaNuevoTipoFormato;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoFormato() {
		return isVisibilidadCeldaDuplicarTipoFormato;
	}

	public void setIsVisibilidadCeldaDuplicarTipoFormato(Boolean isVisibilidadCeldaDuplicarTipoFormato) {
		this.isVisibilidadCeldaDuplicarTipoFormato = isVisibilidadCeldaDuplicarTipoFormato;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoFormato() {
		return isVisibilidadCeldaCopiarTipoFormato;
	}

	public void setIsVisibilidadCeldaCopiarTipoFormato(Boolean isVisibilidadCeldaCopiarTipoFormato) {
		this.isVisibilidadCeldaCopiarTipoFormato = isVisibilidadCeldaCopiarTipoFormato;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoFormato() {
		return isVisibilidadCeldaVerFormTipoFormato;
	}

	public void setIsVisibilidadCeldaVerFormTipoFormato(Boolean isVisibilidadCeldaVerFormTipoFormato) {
		this.isVisibilidadCeldaVerFormTipoFormato = isVisibilidadCeldaVerFormTipoFormato;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoFormato() {
		return isVisibilidadCeldaOrdenTipoFormato;
	}

	public void setIsVisibilidadCeldaOrdenTipoFormato(Boolean isVisibilidadCeldaOrdenTipoFormato) {
		this.isVisibilidadCeldaOrdenTipoFormato = isVisibilidadCeldaOrdenTipoFormato;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoFormato() {
		return isVisibilidadCeldaNuevoRelacionesTipoFormato;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoFormato(Boolean isVisibilidadCeldaNuevoRelacionesTipoFormato) {
		this.isVisibilidadCeldaNuevoRelacionesTipoFormato = isVisibilidadCeldaNuevoRelacionesTipoFormato;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoFormato() {
		return isVisibilidadCeldaModificarTipoFormato;
	}

	public void setIsVisibilidadCeldaModificarTipoFormato(Boolean isVisibilidadCeldaModificarTipoFormato) {
		this.isVisibilidadCeldaModificarTipoFormato = isVisibilidadCeldaModificarTipoFormato;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoFormato() {
		return isVisibilidadCeldaActualizarTipoFormato;
	}

	public void setIsVisibilidadCeldaActualizarTipoFormato(Boolean isVisibilidadCeldaActualizarTipoFormato) {
		this.isVisibilidadCeldaActualizarTipoFormato = isVisibilidadCeldaActualizarTipoFormato;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoFormato() {
		return isVisibilidadCeldaEliminarTipoFormato;
	}

	public void setIsVisibilidadCeldaEliminarTipoFormato(Boolean isVisibilidadCeldaEliminarTipoFormato) {
		this.isVisibilidadCeldaEliminarTipoFormato = isVisibilidadCeldaEliminarTipoFormato;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoFormato() {
		return isVisibilidadCeldaCancelarTipoFormato;
	}

	public void setIsVisibilidadCeldaCancelarTipoFormato(Boolean isVisibilidadCeldaCancelarTipoFormato) {
		this.isVisibilidadCeldaCancelarTipoFormato = isVisibilidadCeldaCancelarTipoFormato;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoFormato() {
		return isVisibilidadCeldaGuardarTipoFormato;
	}

	public void setIsVisibilidadCeldaGuardarTipoFormato(Boolean isVisibilidadCeldaGuardarTipoFormato) {
		this.isVisibilidadCeldaGuardarTipoFormato = isVisibilidadCeldaGuardarTipoFormato;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoFormato() {
		return isVisibilidadCeldaGuardarCambiosTipoFormato;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoFormato(Boolean isVisibilidadCeldaGuardarCambiosTipoFormato) {
		this.isVisibilidadCeldaGuardarCambiosTipoFormato = isVisibilidadCeldaGuardarCambiosTipoFormato;
	}
		
	public TipoFormatoSessionBean gettipoformatoSessionBean() {
		return this.tipoformatoSessionBean;
	}
	
	public void settipoformatoSessionBean(TipoFormatoSessionBean tipoformatoSessionBean) {
		this.tipoformatoSessionBean=tipoformatoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoFormato(TipoFormato tipoformato)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoformato,null);
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
	
	public void bugActualizarReferenciaActual(TipoFormato tipoformato,TipoFormato tipoformatoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoFormato(tipoformato);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoformatoAux.setId(tipoformato.getId());
		tipoformatoAux.setVersionRow(tipoformato.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoFormato();
		
			int intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoFormato(this.tipoformato,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoformatoValidator.getInvalidValues(this.tipoformato);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoformatoLogic.setDatosCliente(datosCliente);
			tipoformatoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoformatoAux=new  TipoFormato();
				
				tipoformatoAux.setIsNew(true);
				tipoformatoAux.setIsChanged(true);
				
				tipoformatoAux.setTipoFormatoOriginal(this.tipoformato);
				
				tipoformatoAux.setId(this.tipoformato.getId());	
				tipoformatoAux.setVersionRow(this.tipoformato.getVersionRow());	
				tipoformatoAux.setid_empresa(this.tipoformato.getid_empresa());	
				tipoformatoAux.setnombre(this.tipoformato.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoformatoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoformatoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoformatoAux,tipoformatoLogic.getTipoFormatos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformatoAux,tipoformatos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoformatoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoformatoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatoLogic.saveTipoFormatos();//WithConnection
						//tipoformatoLogic.getSetVersionRowTipoFormatos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoformato,tipoformatoAux);
					
					this.refrescarForeignKeysDescripcionesTipoFormato();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoformatoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos().addAll(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatos.addAll(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoformatoLogic.saveTipoFormatoRelaciones(tipoformatoAux,this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos());//WithConnection
								//tipoformatoLogic.getSetVersionRowTipoFormatos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoformato,tipoformatoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.setFormatos(new ArrayList<Formato>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatos= new ArrayList<Formato>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoformatoAux.setFormatos(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoformatoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoformatoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoformatoAux,tipoformatoLogic.getTipoFormatos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoformatoAux,tipoformatos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoformato,tipoformatoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoformatoAux=new  TipoFormato();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoformatoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoformatoSessionBean.getEsGuardarRelacionado() && this.tipoformato.getId()>=0)) {
						
					tipoformatoAux.setIsNew(false);
				}
				
				tipoformatoAux.setIsDeleted(false);
			
				tipoformatoAux.setId(this.tipoformato.getId());	
				tipoformatoAux.setVersionRow(this.tipoformato.getVersionRow());	
				tipoformatoAux.setid_empresa(this.tipoformato.getid_empresa());	
				tipoformatoAux.setnombre(this.tipoformato.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoformatoAux,tipoformatoLogic.getTipoFormatos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformatoAux,tipoformatos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoformatoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoformatoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatoLogic.saveTipoFormatos();//WithConnection
						//tipoformatoLogic.getSetVersionRowTipoFormatos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoformato,tipoformatoAux);
					
					this.refrescarForeignKeysDescripcionesTipoFormato();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoformatoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos().addAll(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatos.addAll(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoformatoLogic.saveTipoFormatoRelaciones(tipoformatoAux,this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos());//WithConnection
								//tipoformatoLogic.getSetVersionRowTipoFormatos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoformato,tipoformatoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.setFormatos(new ArrayList<Formato>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatos= new ArrayList<Formato>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoformatoAux.setFormatos(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoformatoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoformatoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoformatoAux,tipoformatoLogic.getTipoFormatos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoformatoAux,tipoformatos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoformato,tipoformatoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoformatoAux=new  TipoFormato();
				
				tipoformatoAux.setIsNew(false);
				tipoformatoAux.setIsChanged(false);
				
				tipoformatoAux.setIsDeleted(true);
				
				tipoformatoAux.setId(this.tipoformato.getId());	
				tipoformatoAux.setVersionRow(this.tipoformato.getVersionRow());	
				tipoformatoAux.setid_empresa(this.tipoformato.getid_empresa());	
				tipoformatoAux.setnombre(this.tipoformato.getnombre());	
				
				if(this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoformatoAux.getId()>=0) {	
						this.tipoformatosEliminados.add(tipoformatoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoformatoAux,tipoformatoLogic.getTipoFormatos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformatoAux,tipoformatos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoformatoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoformatoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatoLogic.saveTipoFormatos();//WithConnection
						//tipoformatoLogic.getSetVersionRowTipoFormatos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoformatoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos().addAll(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatos.addAll(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoformatoLogic.saveTipoFormatoRelaciones(tipoformatoAux,this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos());//WithConnection
								//tipoformatoLogic.getSetVersionRowTipoFormatos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.setFormatos(new ArrayList<Formato>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatos= new ArrayList<Formato>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoformatoAux.setFormatos(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoformatoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoformatoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoformatoAux,tipoformatoLogic.getTipoFormatos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoformatoAux,tipoformatos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.getTipoFormatos().addAll(this.tipoformatosEliminados);
					
					tipoformatoLogic.saveTipoFormatos();//WithConnection
					//tipoformatoLogic.getSetVersionRowTipoFormatos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoFormato();
				
				this.tipoformatosEliminados= new ArrayList<TipoFormato>();		
			}
			
			if(this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Formato  GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Formato ",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoformato=tipoformatoAux;
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
      		//this.finishProcessTipoFormato();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoFormato tipoformatoLocal) throws Exception {
		
		if(this.tipoformatoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoformatoLocal.setFormatos(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos());
			
			} else {
			
				tipoformatoLocal.setFormatos(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoFormato tipoformatoLocal) throws Exception {	
		if(this.tipoformatoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoformatoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoFormatoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoformatoValidator.getInvalidValues(this.tipoformato);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoFormato tipoformato,List<TipoFormato> tipoformatos) throws Exception {
		try	{		
			TipoFormatoConstantesFunciones.actualizarLista(tipoformato,tipoformatos,this.tipoformatoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoFormato tipoformato,List<TipoFormato> tipoformatos) throws Exception {
		try	{			
			TipoFormatoConstantesFunciones.actualizarSelectedLista(tipoformato,tipoformatos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoFormato> tipoformatosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoformatosLocal=this.tipoformatoLogic.getTipoFormatos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoformatosLocal=this.tipoformatos;
			}
			//ARCHITECTURE
		
			for(TipoFormato tipoformatoLocal:tipoformatosLocal) {
				if(this.permiteMantenimiento(tipoformatoLocal) && tipoformatoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoFormatoConstantesFunciones.getTipoFormatoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoFormatoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormato.jLabelid_empresaTipoFormato,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoFormatoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormato.jLabelnombreTipoFormato,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFormato.jLabelid_empresaTipoFormato,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFormato.jLabelnombreTipoFormato,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Formato")) {
			if(this.tipoformato==null) {
				this.tipoformato= new TipoFormato();
			}

			if(this.tipoformatoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoFormato
				this.setVariablesFormularioToObjetoActualTipoFormato(this.tipoformato,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);

				this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.getformato().setTipoFormato(this.tipoformato);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoFormato--;	
		
		
		this.tipoformatoAux=new TipoFormato();
		
		this.tipoformatoAux.setId(this.iIdNuevoTipoFormato);
		this.tipoformatoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoformatoLogic.getTipoFormatos().add(this.tipoformatoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoformatos.add(this.tipoformatoAux);
		}
		//ARCHITECTURE
		
		this.tipoformato=this.tipoformatoAux;
		
		if(TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoFormato(this.tipoformato);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFormato(this.tipoformato);
		}
				
		//this.setDefaultControlesTipoFormato();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoFormato();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoFormato();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFormato();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFormato(this.tipoformatoBean,this.tipoformato,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoFormatoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoformatoSessionBean.getConGuardarRelaciones()) {
			classes=TipoFormatoConstantesFunciones.getClassesRelationshipsOfTipoFormato(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoformatoReturnGeneral=tipoformatoLogic.procesarEventosTipoFormatosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoformatoLogic.getTipoFormatos(),this.tipoformato,this.tipoformatoParameterGeneral,this.isEsNuevoTipoFormato,classes);//this.tipoformatoLogic.getTipoFormato()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoFormato(this.tipoformatoReturnGeneral,this.tipoformatoBean,false);
		
		if(this.tipoformatoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFormato(this.tipoformatoReturnGeneral.getTipoFormato());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoFormato(this.tipoformatoReturnGeneral.getTipoFormato());
		}
		
		if(this.tipoformatoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoFormato(this.tipoformatoReturnGeneral.getTipoFormato(),classes);//this.tipoformatoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoFormato(this.tipoformato,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoFormato();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoFormato();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFormatoBeanSwingJInternalFrameAdditional.RecargarFormTipoFormato(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoFormato(false);
						
			if(tipoformatoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoSessionBean.getEsGuardarRelacionado() && FormatoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFormato();
			}
			
			this.actualizarVisualTableDatosTipoFormato();
			
			this.jTableDatosTipoFormato.setRowSelectionInterval(this.getIndiceNuevoTipoFormato(), this.getIndiceNuevoTipoFormato());
			
			this.seleccionarFilaTablaTipoFormatoActual();
						
			this.actualizarEstadoCeldasBotonesTipoFormato("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoFormato(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoFormato.jTextAreanombreTipoFormato.setEnabled(isHabilitar && this.tipoformatoConstantesFunciones.activarnombreTipoFormato);	
		//
		this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.setEnabled(isHabilitar && this.tipoformatoConstantesFunciones.activarid_empresaTipoFormato);
	};
	
	public void setDefaultControlesTipoFormato() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoFormato(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoformatoSessionBean.setConGuardarRelaciones(true);			
			this.tipoformatoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoFormato.jTabbedPaneRelacionesTipoFormato.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoformatoSessionBean.setConGuardarRelaciones(false);			
			this.tipoformatoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoFormato.jTabbedPaneRelacionesTipoFormato.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoFormato() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormato tipoformatoAux:this.tipoformatoLogic.getTipoFormatos()) {
				if(tipoformatoAux.getId().equals(this.iIdNuevoTipoFormato)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormato tipoformatoAux:this.tipoformatos) {
				if(tipoformatoAux.getId().equals(this.iIdNuevoTipoFormato)) {
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
	
	public int getIndiceActualTipoFormato(TipoFormato tipoformato,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormato tipoformatoAux:this.tipoformatoLogic.getTipoFormatos()) {
				if(tipoformatoAux.getId().equals(tipoformato.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormato tipoformatoAux:this.tipoformatos) {
				if(tipoformatoAux.getId().equals(tipoformato.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoFormato(TipoFormato tipoformatoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormato tipoformatoAux:this.tipoformatoLogic.getTipoFormatos()) {
				if(tipoformatoAux.getTipoFormatoOriginal().getId().equals(tipoformatoOriginal.getId())) {
					existe=true;
					tipoformatoOriginal.setId(tipoformatoAux.getId());
					tipoformatoOriginal.setVersionRow(tipoformatoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormato tipoformatoAux:this.tipoformatos) {
				if(tipoformatoAux.getTipoFormatoOriginal().getId().equals(tipoformatoOriginal.getId())) {
					existe=true;
					tipoformatoOriginal.setId(tipoformatoAux.getId());
					tipoformatoOriginal.setVersionRow(tipoformatoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoFormato(Boolean esParaCancelar) throws Exception {
		tipoformatosAux=new ArrayList<TipoFormato>();
		tipoformatoAux=new TipoFormato();
		
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFormato tipoformatoAux:this.tipoformatoLogic.getTipoFormatos()) {
					if(tipoformatoAux.getId()<0) {
						tipoformatosAux.add(tipoformatoAux);
					}		
				}
				this.iIdNuevoTipoFormato=0L;
				this.tipoformatoLogic.getTipoFormatos().removeAll(tipoformatosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormato tipoformatoAux:this.tipoformatos) {
					if(tipoformatoAux.getId()<0) {
						tipoformatosAux.add(tipoformatoAux);
					}		
				}
				this.iIdNuevoTipoFormato=0L;
				this.tipoformatos.removeAll(tipoformatosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoFormato 
					&& this.tipoformatoLogic.getTipoFormatos().size()>0
					) {
					tipoformatoAux=this.tipoformatoLogic.getTipoFormatos().get(this.tipoformatoLogic.getTipoFormatos().size() - 1);
				
					if(tipoformatoAux.getId()<0) {
						this.tipoformatoLogic.getTipoFormatos().remove(tipoformatoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoFormato && this.tipoformatos.size()>0) {
					tipoformatoAux=this.tipoformatos.get(this.tipoformatos.size() - 1);
				
					if(tipoformatoAux.getId()<0) {
						this.tipoformatos.remove(tipoformatoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoFormato(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoformato.getId()<0) {
				this.tipoformatoLogic.getTipoFormatos().remove(this.tipoformato);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoformato.getId()<0) {
				this.tipoformatos.remove(this.tipoformato);
			}
		}			
	}
	
	public void setEstadosInicialesTipoFormato(List<TipoFormato> tipoformatosAux) throws Exception {
		TipoFormatoConstantesFunciones.setEstadosInicialesTipoFormato(tipoformatosAux);
	}
	
	public void setEstadosInicialesTipoFormato(TipoFormato tipoformatoAux) throws Exception {
		TipoFormatoConstantesFunciones.setEstadosInicialesTipoFormato(tipoformatoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoFormatoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoFormatoActual()) {
				if(!this.isEsNuevoTipoFormato) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoFormato=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoFormatoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Formato  ?", "MANTENIMIENTO DE Tipo Formato ", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoFormato tipoformato) throws Exception {
		TipoFormatoConstantesFunciones.seleccionarAsignar(this.tipoformato,tipoformato);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoFormato=this.isPermisoActualizarOriginalTipoFormato;
			
			
			this.seleccionarAsignar(tipoformato);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFormatoConstantesFunciones.quitarEspaciosTipoFormato(this.tipoformato,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoFormato("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoformatoSessionBean.setsFuncionBusquedaRapida(this.tipoformatoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoFormato) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoFormato(esParaCancelar);				
				this.cancelarNuevoTipoFormato(esParaCancelar);								
			}
			
			this.tipoformato=new TipoFormato();
			
			this.inicializarTipoFormato();
			
			this.actualizarEstadoCeldasBotonesTipoFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoFormato() throws Exception {
		try {
			TipoFormatoConstantesFunciones.inicializarTipoFormato(this.tipoformato);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoformatoLogic.getTipoFormatos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoFormatos(String sAccionBusqueda,List<TipoFormato> tipoformatosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoFormato"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoFormatoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoFormatoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoFormato"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Formato s");		
		parameters.put("busquedapor", TipoFormatoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Formato.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoFormatoLogic tipoformatoLogicAuxiliar=new TipoFormatoLogic();
					tipoformatoLogicAuxiliar.setDatosCliente(tipoformatoLogic.getDatosCliente());				
					tipoformatoLogicAuxiliar.setTipoFormatos(tipoformatosParaReportes);
					
					tipoformatoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoFormatoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoformatosParaReportes=tipoformatoLogicAuxiliar.getTipoFormatos();
					
					//tipoformatoLogic.getNewConnexionToDeep();
					
					//for (TipoFormato tipoformato:tipoformatosParaReportes) {
					//	tipoformatoLogic.deepLoad(tipoformato, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoformatoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoformatoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFormato = AuxiliarReportes.class.getResourceAsStream("FormatoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_formato", reportFileFormato);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoFormato=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoFormatoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoFormatoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoFormato=new JRBeanArrayDataSource(TipoFormatoJInternalFrame.TraerTipoFormatoBeans(tipoformatosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoFormato);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoFormatoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoFormatoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoFormatoBean.TraerTipoFormatoBeans(tipoformatosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoFormatos(sAccionBusqueda,sTipoArchivoReporte,tipoformatosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoFormatos(sAccionBusqueda,sTipoArchivoReporte,tipoformatosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoFormatoActionPerformed(null);
					//this.generarExcelReporteTipoFormatos(sAccionBusqueda,sTipoArchivoReporte,tipoformatosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoFormatos(sAccionBusqueda,sTipoArchivoReporte,tipoformatosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoFormatos(sAccionBusqueda,sTipoArchivoReporte,tipoformatosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoFormatos(sAccionBusqueda,sTipoArchivoReporte,tipoformatosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoFormatos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFormato> tipoformatosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformato";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFormatos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFormato("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoFormato tipoformato : tipoformatosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoFormatoConstantesFunciones.generarExcelReporteDataTipoFormato("NORMAL",row,workbook,tipoformato,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formato ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoFormato(String sTipo,Row row,Workbook workbook) {
		
		TipoFormatoConstantesFunciones.generarExcelReporteHeaderTipoFormato(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoFormatos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFormato> tipoformatosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformato_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFormatos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoFormato tipoformato : tipoformatosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoFormatoConstantesFunciones.getTipoFormatoDescripcion(tipoformato));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFormatoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFormatoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoformato.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFormatoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFormatoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoformato.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formato ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoFormatos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFormato> tipoformatosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoFormato> tipoformatosRespaldo=null;
		
		classes=TipoFormatoConstantesFunciones.getClassesRelationshipsOfTipoFormato(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoformatoLogic.setDatosCliente(this.datosCliente);
		this.tipoformatoLogic.setDatosDeep(this.datosDeep);
		this.tipoformatoLogic.setIsConDeep(true);
		
		tipoformatosRespaldo=this.tipoformatoLogic.getTipoFormatos();
		
		this.tipoformatoLogic.setTipoFormatos(tipoformatosParaReportes);	
		this.tipoformatoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoformatosParaReportes=this.tipoformatoLogic.getTipoFormatos();
		this.tipoformatoLogic.setTipoFormatos(tipoformatosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformato_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFormatos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFormato("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoFormato tipoformato : tipoformatosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoFormato("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoFormatoConstantesFunciones.generarExcelReporteDataTipoFormato("NORMAL",row,workbook,tipoformato,cellStyleDataAux);
		
			
			


				//Formato
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FormatoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoformato.getFormatos()!=null && tipoformato.getFormatos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FormatoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FormatoConstantesFunciones.generarExcelReporteHeaderFormato("RELACIONADO",row,workbook);
				}

				if(tipoformato.getFormatos()!=null) {
					i2=0;
					for(Formato formato : tipoformato.getFormatos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FormatoConstantesFunciones.generarExcelReporteDataFormato("RELACIONADO",row,workbook,formato,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoFormatoConstantesFunciones.getTipoFormatoDescripcion(tipoformato));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formato ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFormato.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoFormato() throws Exception {		
		this.startProcessTipoFormato(true);
	}
	
	public void startProcessTipoFormato(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoFormato ,this.jPanelParametrosReportesTipoFormato, this.jScrollPanelDatosTipoFormato,this.jPanelPaginacionTipoFormato, this.jScrollPanelDatosEdicionTipoFormato, this.jPanelAccionesTipoFormato,this.jPanelAccionesFormularioTipoFormato,this.jmenuBarTipoFormato,this.jmenuBarDetalleTipoFormato,this.jTtoolBarTipoFormato,this.jTtoolBarDetalleTipoFormato);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFormato=this.jTabbedPaneBusquedasTipoFormato; 
		
		final JPanel jPanelParametrosReportesTipoFormato=this.jPanelParametrosReportesTipoFormato;
		//final JScrollPane jScrollPanelDatosTipoFormato=this.jScrollPanelDatosTipoFormato;
		final JTable jTableDatosTipoFormato=this.jTableDatosTipoFormato;		
		final JPanel jPanelPaginacionTipoFormato=this.jPanelPaginacionTipoFormato;
		//final JScrollPane jScrollPanelDatosEdicionTipoFormato=this.jScrollPanelDatosEdicionTipoFormato;
		final JPanel jPanelAccionesTipoFormato=this.jPanelAccionesTipoFormato;
		
		JPanel jPanelCamposAuxiliarTipoFormato=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoFormato=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			jPanelCamposAuxiliarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jPanelCamposTipoFormato;
			jPanelAccionesFormularioAuxiliarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jPanelAccionesFormularioTipoFormato;
		}
		
		final JPanel jPanelCamposTipoFormato=jPanelCamposAuxiliarTipoFormato;
		final JPanel jPanelAccionesFormularioTipoFormato=jPanelAccionesFormularioAuxiliarTipoFormato;
		
		
		final JMenuBar jmenuBarTipoFormato=this.jmenuBarTipoFormato;
		final JToolBar jTtoolBarTipoFormato=this.jTtoolBarTipoFormato;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoFormato=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFormato=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			jmenuBarDetalleAuxiliarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jmenuBarDetalleTipoFormato;
			jTtoolBarDetalleAuxiliarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jTtoolBarDetalleTipoFormato;
		}
		
		final JMenuBar jmenuBarDetalleTipoFormato=jmenuBarDetalleAuxiliarTipoFormato;
		final JToolBar jTtoolBarDetalleTipoFormato=jTtoolBarDetalleAuxiliarTipoFormato;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFormato;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFormato;
			processRunnable.jTableDatos=jTableDatosTipoFormato;
			processRunnable.jPanelCampos=jPanelCamposTipoFormato;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFormato;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFormato;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFormato;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFormato;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFormato;
			processRunnable.jTtoolBar=jTtoolBarTipoFormato;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFormato;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFormato ,jPanelParametrosReportesTipoFormato,jTableDatosTipoFormato, /*jScrollPanelDatosTipoFormato,*/jPanelCamposTipoFormato,jPanelPaginacionTipoFormato, /*jScrollPanelDatosEdicionTipoFormato,*/ jPanelAccionesTipoFormato,jPanelAccionesFormularioTipoFormato,jmenuBarTipoFormato,jmenuBarDetalleTipoFormato,jTtoolBarTipoFormato,jTtoolBarDetalleTipoFormato);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFormato ,jPanelParametrosReportesTipoFormato, jScrollPanelDatosTipoFormato,jPanelPaginacionTipoFormato, jScrollPanelDatosEdicionTipoFormato, jPanelAccionesTipoFormato,jPanelAccionesFormularioTipoFormato,jmenuBarTipoFormato,jmenuBarDetalleTipoFormato,jTtoolBarTipoFormato,jTtoolBarDetalleTipoFormato);
						
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
	
	public void finishProcessTipoFormato() {// throws Exception 
		this.finishProcessTipoFormato(true);
	}
	
	public void finishProcessTipoFormato(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoFormato ,this.jPanelParametrosReportesTipoFormato, this.jScrollPanelDatosTipoFormato,this.jPanelPaginacionTipoFormato, this.jScrollPanelDatosEdicionTipoFormato, this.jPanelAccionesTipoFormato,this.jPanelAccionesFormularioTipoFormato,this.jmenuBarTipoFormato,this.jmenuBarDetalleTipoFormato,this.jTtoolBarTipoFormato,this.jTtoolBarDetalleTipoFormato);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFormato=this.jTabbedPaneBusquedasTipoFormato; 
		
		final JPanel jPanelParametrosReportesTipoFormato=this.jPanelParametrosReportesTipoFormato;
		//final JScrollPane jScrollPanelDatosTipoFormato=this.jScrollPanelDatosTipoFormato;
		final JTable jTableDatosTipoFormato=this.jTableDatosTipoFormato;		
		final JPanel jPanelPaginacionTipoFormato=this.jPanelPaginacionTipoFormato;
		//final JScrollPane jScrollPanelDatosEdicionTipoFormato=this.jScrollPanelDatosEdicionTipoFormato;
		final JPanel jPanelAccionesTipoFormato=this.jPanelAccionesTipoFormato;
		
		JPanel jPanelCamposAuxiliarTipoFormato=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoFormato=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			jPanelCamposAuxiliarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jPanelCamposTipoFormato;
			jPanelAccionesFormularioAuxiliarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jPanelAccionesFormularioTipoFormato;
		}
		
		final JPanel jPanelCamposTipoFormato=jPanelCamposAuxiliarTipoFormato;
		final JPanel jPanelAccionesFormularioTipoFormato=jPanelAccionesFormularioAuxiliarTipoFormato;
		
		
		final JMenuBar jmenuBarTipoFormato=this.jmenuBarTipoFormato;		
		final JToolBar jTtoolBarTipoFormato=this.jTtoolBarTipoFormato;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoFormato=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFormato=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			jmenuBarDetalleAuxiliarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jmenuBarDetalleTipoFormato;
			jTtoolBarDetalleAuxiliarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jTtoolBarDetalleTipoFormato;		
		}
		
		final JMenuBar jmenuBarDetalleTipoFormato=jmenuBarDetalleAuxiliarTipoFormato;
		final JToolBar jTtoolBarDetalleTipoFormato=jTtoolBarDetalleAuxiliarTipoFormato;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFormato;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFormato;
			processRunnable.jTableDatos=jTableDatosTipoFormato;
			processRunnable.jPanelCampos=jPanelCamposTipoFormato;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFormato;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFormato;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFormato;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFormato;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFormato;
			processRunnable.jTtoolBar=jTtoolBarTipoFormato;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFormato;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoFormato ,jPanelParametrosReportesTipoFormato, jTableDatosTipoFormato,/*jScrollPanelDatosTipoFormato,*/jPanelCamposTipoFormato,jPanelPaginacionTipoFormato, /*jScrollPanelDatosEdicionTipoFormato,*/ jPanelAccionesTipoFormato,jPanelAccionesFormularioTipoFormato,jmenuBarTipoFormato,jmenuBarDetalleTipoFormato,jTtoolBarTipoFormato,jTtoolBarDetalleTipoFormato));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoFormato(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoFormato(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoFormato(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoFormato(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoFormato,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoFormato,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoFormato(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoFormato,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoFormato,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoformatoConstantesFunciones.getsFinalQueryTipoFormato();
		String  finalQueryPaginacionTodos=this.tipoformatoConstantesFunciones.getsFinalQueryTipoFormato();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoFormatoConstantesFunciones.getArrayColumnasGlobalesNoTipoFormato(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoFormatoConstantesFunciones.getArrayColumnasGlobalesTipoFormato(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoFormatoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoformatosEliminados= new ArrayList<TipoFormato>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoFormato();
		
				///*TipoFormatoSessionBean*/this.tipoformatoSessionBean=new TipoFormatoSessionBean();
			
			if(this.tipoformatoSessionBean==null) {
				this.tipoformatoSessionBean=new TipoFormatoSessionBean();
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
					this.iNumeroPaginacion=TipoFormatoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoFormatoConstantesFunciones.getClassesForeignKeysOfTipoFormato(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoformato."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoformatosAux= new ArrayList<TipoFormato>();
			
				
			tipoformatoLogic.setDatosCliente(this.datosCliente);
			tipoformatoLogic.setDatosDeep(this.datosDeep);
			tipoformatoLogic.setIsConDeep(true);
			
			
			tipoformatoLogic.getTipoFormatoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoformatoLogic.getTodosTipoFormatos(finalQueryGlobal,pagination);
					
					//tipoformatoLogic.getTodosTipoFormatosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoformatoLogic.getTipoFormatos()==null|| tipoformatoLogic.getTipoFormatos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoformatosAux= new ArrayList<TipoFormato>();
							tipoformatosAux.addAll(tipoformatoLogic.getTipoFormatos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformatosAux= new ArrayList<TipoFormato>();
							tipoformatosAux.addAll(tipoformatos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoformatoLogic.getTodosTipoFormatos(finalQueryGlobal+"",this.pagination);												
							
							//tipoformatoLogic.getTodosTipoFormatosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoFormatos("Todos",tipoformatoLogic.getTipoFormatos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoformatoLogic.setTipoFormatos(new ArrayList<TipoFormato>());					
							tipoformatoLogic.getTipoFormatos().addAll(tipoformatosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformatos=new ArrayList<TipoFormato>();
							tipoformatos.addAll(tipoformatosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoFormato=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoFormato=this.idActual;
				
				} else if(this.idTipoFormatoActual!=null && this.idTipoFormatoActual!=0L) {
					idTipoFormato=idTipoFormatoActual;
				}
				
					
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndicePorId(idTipoFormato);
				
				this.tipoformatos=new ArrayList<TipoFormato>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoformatoLogic.getEntity(idTipoFormato);
					
					//tipoformatoLogic.getEntityWithConnection(idTipoFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformatoLogic.setTipoFormatos(new ArrayList<TipoFormato>());
					tipoformatoLogic.getTipoFormatos().add(tipoformatoLogic.getTipoFormato());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoformatos=new ArrayList<TipoFormato>();
					this.tipoformatos.add(tipoformato);
				}
				
				if(tipoformatoLogic.getTipoFormato()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoformatoLogic.getTipoFormatosBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoformatoLogic.getTipoFormatos()==null||tipoformatoLogic.getTipoFormatos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoformatos==null|| tipoformatos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatosAux=new ArrayList<TipoFormato>();
						tipoformatosAux.addAll(tipoformatoLogic.getTipoFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformatosAux=new ArrayList<TipoFormato>();
							tipoformatosAux.addAll(tipoformatos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoformatoLogic.getTipoFormatosBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoFormatos("BusquedaPorId",tipoformatoLogic.getTipoFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoFormatos("BusquedaPorId",tipoformatos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatoLogic.setTipoFormatos(new ArrayList<TipoFormato>());
						tipoformatoLogic.getTipoFormatos().addAll(tipoformatosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformatos=new ArrayList<TipoFormato>();
							tipoformatos.addAll(tipoformatosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoformatoLogic.getTipoFormatosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoformatoLogic.getTipoFormatos()==null||tipoformatoLogic.getTipoFormatos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoformatos==null|| tipoformatos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatosAux=new ArrayList<TipoFormato>();
						tipoformatosAux.addAll(tipoformatoLogic.getTipoFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformatosAux=new ArrayList<TipoFormato>();
							tipoformatosAux.addAll(tipoformatos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoformatoLogic.getTipoFormatosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoFormatos("BusquedaPorNombre",tipoformatoLogic.getTipoFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoFormatos("BusquedaPorNombre",tipoformatos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatoLogic.setTipoFormatos(new ArrayList<TipoFormato>());
						tipoformatoLogic.getTipoFormatos().addAll(tipoformatosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformatos=new ArrayList<TipoFormato>();
							tipoformatos.addAll(tipoformatosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoformatoLogic.getTipoFormatosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoformatoLogic.getTipoFormatos()==null||tipoformatoLogic.getTipoFormatos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoformatos==null|| tipoformatos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatosAux=new ArrayList<TipoFormato>();
						tipoformatosAux.addAll(tipoformatoLogic.getTipoFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformatosAux=new ArrayList<TipoFormato>();
							tipoformatosAux.addAll(tipoformatos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoformatoLogic.getTipoFormatosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFormatoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoFormatos("FK_IdEmpresa",tipoformatoLogic.getTipoFormatos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoFormatos("FK_IdEmpresa",tipoformatos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatoLogic.setTipoFormatos(new ArrayList<TipoFormato>());
						tipoformatoLogic.getTipoFormatos().addAll(tipoformatosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformatos=new ArrayList<TipoFormato>();
							tipoformatos.addAll(tipoformatosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoFormato();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoFormato();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoformatoLogic.getTipoFormatos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoformatos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoformatoLogic.getTipoFormatos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoformatos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoFormato tipoformato) {
		Boolean permite=true;
		
		if(this.tipoformato.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoFormatoConstantesFunciones.getOrderByListaTipoFormato();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoFormatoConstantesFunciones.getOrderByListaTipoFormato();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormato tipoformato:tipoformatoLogic.getTipoFormatos()) {
				if(tipoformato.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformatoTotales=tipoformato;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormato tipoformato:this.tipoformatos) {
				if(tipoformato.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformatoTotales=tipoformato;
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
			this.tipoformatoAux=new TipoFormato();
			this.tipoformatoAux.setsType(Constantes2.S_TOTALES);
			this.tipoformatoAux.setIsNew(false);
			this.tipoformatoAux.setIsChanged(false);
			this.tipoformatoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoFormatoConstantesFunciones.TotalizarValoresFilaTipoFormato(this.tipoformatoLogic.getTipoFormatos(),this.tipoformatoAux);
				
				this.tipoformatoLogic.getTipoFormatos().add(this.tipoformatoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoFormatoConstantesFunciones.TotalizarValoresFilaTipoFormato(this.tipoformatos,this.tipoformatoAux);
				
				this.tipoformatos.add(this.tipoformatoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoformatoTotales=new TipoFormato();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoformatoLogic.getTipoFormatos().remove(tipoformatoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoformatos.remove(tipoformatoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoformatoTotales=new TipoFormato();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormato tipoformato:tipoformatoLogic.getTipoFormatos()) {
				if(tipoformato.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformatoTotales=tipoformato;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFormatoConstantesFunciones.TotalizarValoresFilaTipoFormato(this.tipoformatoLogic.getTipoFormatos(),tipoformatoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormato tipoformato:this.tipoformatos) {
				if(tipoformato.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformatoTotales=tipoformato;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFormatoConstantesFunciones.TotalizarValoresFilaTipoFormato(this.tipoformatos,tipoformatoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoFormatosBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoFormatosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoFormatosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoFormatoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoFormatosBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformatoLogic.getTipoFormatosBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoFormatosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformatoLogic.getTipoFormatosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoFormatosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformatoLogic.getTipoFormatosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoFormatoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformatoLogic.getTipoFormatoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoFormato() {
		this.isPermisoTodoTipoFormato=false;
		this.isPermisoNuevoTipoFormato=false;
		this.isPermisoActualizarTipoFormato=false;
		this.isPermisoActualizarOriginalTipoFormato=false;
		this.isPermisoEliminarTipoFormato=false;
		this.isPermisoGuardarCambiosTipoFormato=false;
		this.isPermisoConsultaTipoFormato=false;
		this.isPermisoBusquedaTipoFormato=false;
		this.isPermisoReporteTipoFormato=false;		
		this.isPermisoOrdenTipoFormato=false;		
		this.isPermisoPaginacionMedioTipoFormato=false;		
		this.isPermisoPaginacionAltoTipoFormato=false;
		this.isPermisoPaginacionTodoTipoFormato=false;
		this.isPermisoCopiarTipoFormato=false;		
		this.isPermisoVerFormTipoFormato=false;		
		this.isPermisoDuplicarTipoFormato=false;		
		this.isPermisoOrdenTipoFormato=false;		
	}
	
	public void setPermisosUsuarioTipoFormato(Boolean isPermiso) {
		this.isPermisoTodoTipoFormato=isPermiso;
		this.isPermisoNuevoTipoFormato=isPermiso;
		this.isPermisoActualizarTipoFormato=isPermiso;
		this.isPermisoActualizarOriginalTipoFormato=isPermiso;
		this.isPermisoEliminarTipoFormato=isPermiso;
		this.isPermisoGuardarCambiosTipoFormato=isPermiso;
		this.isPermisoConsultaTipoFormato=isPermiso;
		this.isPermisoBusquedaTipoFormato=isPermiso;
		this.isPermisoReporteTipoFormato=isPermiso;
		this.isPermisoOrdenTipoFormato=isPermiso;		
		this.isPermisoPaginacionMedioTipoFormato=isPermiso;		
		this.isPermisoPaginacionAltoTipoFormato=isPermiso;		
		this.isPermisoPaginacionTodoTipoFormato=isPermiso;		
		this.isPermisoCopiarTipoFormato=isPermiso;		
		this.isPermisoVerFormTipoFormato=isPermiso;		
		this.isPermisoDuplicarTipoFormato=isPermiso;
		this.isPermisoOrdenTipoFormato=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoFormato(Boolean isPermiso) {
		//this.isPermisoTodoTipoFormato=isPermiso;
		this.isPermisoNuevoTipoFormato=isPermiso;
		this.isPermisoActualizarTipoFormato=isPermiso;
		this.isPermisoActualizarOriginalTipoFormato=isPermiso;
		this.isPermisoEliminarTipoFormato=isPermiso;
		this.isPermisoGuardarCambiosTipoFormato=isPermiso;
		//this.isPermisoConsultaTipoFormato=isPermiso;
		//this.isPermisoBusquedaTipoFormato=isPermiso;
		//this.isPermisoReporteTipoFormato=isPermiso;
		//this.isPermisoOrdenTipoFormato=isPermiso;		
		//this.isPermisoPaginacionMedioTipoFormato=isPermiso;		
		//this.isPermisoPaginacionAltoTipoFormato=isPermiso;		
		//this.isPermisoPaginacionTodoTipoFormato=isPermiso;		
		//this.isPermisoCopiarTipoFormato=isPermiso;		
		//this.isPermisoDuplicarTipoFormato=isPermiso;
		//this.isPermisoOrdenTipoFormato=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoFormatoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FormatoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoFormatoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFormato=false;
		this.isTienePermisosFormato=this.verificarGetPermisosUsuarioOpcionTipoFormatoClaseRelacionada(this.opcionsRelacionadas,FormatoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoFormato(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoFormatoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFormato=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoFormatoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoFormatoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoFormatoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFormato && this.jInternalFrameDetalleFormTipoFormato!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFormato.jTabbedPaneRelacionesTipoFormato.remove(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoFormato() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoFormatoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoFormatoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoFormato=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoFormato=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoFormato=this.isPermisoActualizarTipoFormato;
			this.isPermisoEliminarTipoFormato=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoFormato=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoFormato=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoFormato=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoFormato=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoFormato=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFormato=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoFormato=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoFormato=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoFormato=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoFormato=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoFormato=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoFormato=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFormato=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoFormato.setToolTipText(this.jTableDatosTipoFormato.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoFormato(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoFormato(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoFormatoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoFormatoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoFormato() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFormato && this.tipoformatoConstantesFunciones.mostrarFormatoTipoFormato && !TipoFormatoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Formato");
			reporte.setsDescripcion("Formato");
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
	public void inicializarCombosForeignKeyTipoFormatoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoFormatoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoFormatoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoFormatoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoFormatoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoFormatoParameterReturnGeneral tipoformatoReturnGeneral=new TipoFormatoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoformatoConstantesFunciones.cargarid_empresaTipoFormato)
					 || (this.esRecargarFks && this.tipoformatoConstantesFunciones.cargarid_empresaTipoFormato)) {

					if(!this.tipoformatoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoformatoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoformatoReturnGeneral=tipoformatoLogic.cargarCombosLoteForeignKeyTipoFormato(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoformatoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoFormato()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoformatoSessionBean==null) {
				this.tipoformatoSessionBean=new TipoFormatoSessionBean();
			}

			if(!this.tipoformatoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoFormato()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoFormato(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoFormato()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFormato();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoFormato(TipoFormato tipoformato)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoFormato(TipoFormato tipoformato,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoFormato()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFormato()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoFormato()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoFormato()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoFormato()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoFormato()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoFormato(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoFormato()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato!=null && this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoFormatoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoFormatoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoFormatoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoformatoSessionBean=new TipoFormatoSessionBean(); 
		this.tipoformatoConstantesFunciones=new TipoFormatoConstantesFunciones(); 
		this.tipoformatoBean=new TipoFormato();//(this.tipoformatoConstantesFunciones); 		
		this.tipoformatoReturnGeneral=new TipoFormatoParameterReturnGeneral(); 
		
		this.tipoformatoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformatoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoFormatoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoFormatoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoFormatoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoFormato(true);
			
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
			
			this.tipoformatoConstantesFunciones=new TipoFormatoConstantesFunciones(); 
			this.tipoformatoBean=new TipoFormato();//this.tipoformatoConstantesFunciones); 			
			this.tipoformatoReturnGeneral=new TipoFormatoParameterReturnGeneral(); 
		
			TipoFormatoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Formato  Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoformato=new TipoFormato();
			this.tipoformatos = new ArrayList<TipoFormato>();
			this.tipoformatosAux = new ArrayList<TipoFormato>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic=new TipoFormatoLogic();
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoformatoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoformatoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoFormato);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoFormato!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFormato);	
					}
					
					if(this.jInternalFrameImportacionTipoFormato!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFormato);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoFormato!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoFormato);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoFormato!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFormato);
				this.jInternalFrameDetalleFormTipoFormato.setVisible(false);
				this.jInternalFrameDetalleFormTipoFormato.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoFormato!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFormato);
					this.jInternalFrameReporteDinamicoTipoFormato.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoFormato.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoFormato!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoFormato);
					this.jInternalFrameImportacionTipoFormato.setVisible(false);
					this.jInternalFrameImportacionTipoFormato.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoFormato!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoFormato);
					this.jInternalFrameOrderByTipoFormato.setVisible(false);
					this.jInternalFrameOrderByTipoFormato.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoFormatoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoFormatoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoformatoReturnGeneral=new TipoFormatoParameterReturnGeneral();
			
			this.tipoformatoParameterGeneral=new TipoFormatoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoformatoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoFormatoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FormatoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFormatoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoformatoSessionBean.getEsGuardarRelacionado(),this.tipoformatoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFormatoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoformatoSessionBean.getEsGuardarRelacionado(),this.tipoformatoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoFormato=false;
			this.isVisibilidadCeldaDuplicarTipoFormato=true;
			this.isVisibilidadCeldaCopiarTipoFormato=true;
			this.isVisibilidadCeldaVerFormTipoFormato=true;
			this.isVisibilidadCeldaOrdenTipoFormato=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=false;
			this.isVisibilidadCeldaModificarTipoFormato=false;
			this.isVisibilidadCeldaActualizarTipoFormato=false;
			this.isVisibilidadCeldaEliminarTipoFormato=false;
			this.isVisibilidadCeldaCancelarTipoFormato=false;
			this.isVisibilidadCeldaGuardarTipoFormato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=false;
			
			
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoFormato();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoFormato(false);
			
			this.setPermisosUsuarioTipoFormato();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoformatoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoformatoSessionBean.getEsGuardarRelacionado() && this.tipoformatoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoFormatoClasesRelacionadas();
			}
			
			if(this.tipoformatoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoFormatoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoFormato();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoFormato();
			}
			
			if(!this.isPermisoBusquedaTipoFormato) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoFormato.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoFormato,this.isPermisoPaginacionMedioTipoFormato,this.isPermisoPaginacionTodoTipoFormato);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoFormatoConstantesFunciones.getTiposSeleccionarTipoFormato());
				
				this.tiposColumnasSelect=TipoFormatoConstantesFunciones.getTiposSeleccionarTipoFormato(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoFormato();				
				//this.tiposRelacionesSelect=TipoFormatoConstantesFunciones.getTiposRelacionesTipoFormato(true);
				
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
			//if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoFormato();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoFormato(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoFormato(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormato() ;
			
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
			
			
			this.formatoLogic=new FormatoLogic(); 
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
				tipoformatoImplementable= (TipoFormatoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFormatoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoformatoImplementableHome= (TipoFormatoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFormatoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoformatos= new ArrayList<TipoFormato>();
			this.tipoformatosEliminados= new ArrayList<TipoFormato>();
						
			this.isEsNuevoTipoFormato=false;
			this.esParaAccionDesdeFormularioTipoFormato=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoFormato(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoFormato();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoFormatoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoFormatoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoFormato("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoFormato(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoFormato!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoFormato();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoFormato();
			}
			
			TipoFormatoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoFormato.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoFormato.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoFormato.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoFormato(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoFormato: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoFormato() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FormatoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FormatoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoFormato")) {
				iIndex=this.jInternalFrameDetalleFormTipoFormato.jTabbedPaneRelacionesTipoFormato.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoFormato.jTabbedPaneRelacionesTipoFormato.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();	
				
				

				if(sTitle.equals("Formatoes")) {
					if(!FormatoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoFormato();

						this.cargarParteTabPanelRelacionadaFormato(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoFormato();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFormato(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoFormato.cargarSessionConBeanSwingJInternalFrameFormato(false,true,iIndex);
		this.jButtonFormatoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFormato();

		//this.jTabbedPaneRelacionesTipoFormato.updateUI();
		//this.jTabbedPaneRelacionesTipoFormato.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoFormato.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Formato")) {
				int row=this.jTableDatosTipoFormato.getSelectedRow();
				jButtonFormatoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Formato")) {

					if(this.isTienePermisosFormato && this.tipoformatoConstantesFunciones.mostrarFormatoTipoFormato && !TipoFormatoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Formatoes"+"("+FormatoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Formatoes");

						if(tipoformatoConstantesFunciones.resaltarFormatoTipoFormato!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoformatoConstantesFunciones.resaltarFormatoTipoFormato);
						}

						jmenuItem.setEnabled(this.tipoformatoConstantesFunciones.activarFormatoTipoFormato);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Formato"));

						

						this.jInternalFrameDetalleFormTipoFormato.jmenuDetalleTipoFormato.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoFormato(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoFormato(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoFormatoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoFormato();
		
		this.cargarCombosFrameForeignKeyTipoFormato();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoFormato();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoFormato();
		}
	}
	
	
	
	public void jButtonNuevoTipoFormatoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoformatoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
			
			if(jTableDatosTipoFormato.getRowCount()>=1) {
				jTableDatosTipoFormato.removeRowSelectionInterval(0, jTableDatosTipoFormato.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoFormato=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoFormato(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoFormato(true);			
			//this.tipoformato=new TipoFormato();
			//this.tipoformato.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFormato(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormato() ;
			
			if(TipoFormatoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFormato(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoformato);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);				
			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
			if(this.tipoformatoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoFormato: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoFormatoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoFormato.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoFormato.getSelectedRows().length;			
			}
			
			tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoFormato--;			
				//TipoFormato tipoformatoAux= new TipoFormato();			
				//tipoformatoAux.setId(this.iIdNuevoTipoFormato);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoFormato tipoformatoOrigen=new TipoFormato();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoFormato tipoformatoOrigen : tipoformatosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoformatoOrigen =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformatoOrigen =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoFormato();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoformato.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoFormato(tipoformatoOrigen,this.tipoformato,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoformatoLogic.getTipoFormatos().add(this.tipoformatoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoformatos.add(this.tipoformatoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoFormato(false);
				
				this.jTableDatosTipoFormato.setRowSelectionInterval(this.getIndiceNuevoTipoFormato(), this.getIndiceNuevoTipoFormato());
				
				int iLastRow =  this.jTableDatosTipoFormato.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFormato.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFormato.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFormato(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();									
		
			TipoFormato tipoformatoOrigen=new TipoFormato();
			TipoFormato tipoformatoDestino=new TipoFormato();
				
			tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoFormato.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoformatosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoFormato.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatoOrigen =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoformatoOrigen =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformatoDestino =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoformatoDestino =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoformatoOrigen =tipoformatosSeleccionados.get(0);
				tipoformatoDestino =tipoformatosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoFormato(tipoformatoOrigen,tipoformatoDestino,true,false);
				
				tipoformatoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoformatoDestino,tipoformatoLogic.getTipoFormatos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformatoDestino,tipoformatos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoFormato(false);
				
				//this.jTableDatosTipoFormato.setRowSelectionInterval(this.getIndiceNuevoTipoFormato(), this.getIndiceNuevoTipoFormato());
				
				int iLastRow =  this.jTableDatosTipoFormato.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFormato.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFormato.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFormato(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoFormato.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoFormato.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoFormato.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoFormato.setVisible(!isVisible);
			this.jPanelPaginacionTipoFormato.setVisible(!isVisible);
			this.jPanelAccionesTipoFormato.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoFormato();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoFormato();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoFormato();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoFormato();
			
			this.abrirFrameOrderByTipoFormato();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoFormato();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoFormato(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFormato);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoFormato.isMaximum()) {
					this.jInternalFrameDetalleFormTipoFormato.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoFormato.setSize(this.jInternalFrameDetalleFormTipoFormato.iWidthFormulario,this.jInternalFrameDetalleFormTipoFormato.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoFormato.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoFormato.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoFormato.isMaximum()) {
						this.jInternalFrameDetalleFormTipoFormato.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoFormato.jContentPaneDetalleTipoFormato.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoFormato.jTabbedPaneRelacionesTipoFormato.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoFormato.jContentPaneDetalleTipoFormato.getWidth(),TipoFormatoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFormato.jTabbedPaneRelacionesTipoFormato.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoFormato.jContentPaneDetalleTipoFormato.getWidth(),TipoFormatoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFormato.jTabbedPaneRelacionesTipoFormato.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoFormato.jContentPaneDetalleTipoFormato.getWidth(),TipoFormatoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FormatoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFormato();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoFormato.setVisible(true);
	        this.jInternalFrameDetalleFormTipoFormato.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoFormato() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoFormato==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoFormato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormato,false,this);
				} else {
					this.jInternalFrameOrderByTipoFormato=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormato,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoFormato);
				this.jInternalFrameOrderByTipoFormato.setVisible(false);
				this.jInternalFrameOrderByTipoFormato.setSelected(false);
				
				this.jInternalFrameOrderByTipoFormato.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFormato"));
				
				this.inicializarActualizarBindingTablaOrderByTipoFormato();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoFormato() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoFormato==null) {
				
				this.jInternalFrameImportacionTipoFormato=new ImportacionJInternalFrame(TipoFormatoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFormato);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoFormato);
				this.jInternalFrameImportacionTipoFormato.setVisible(false);
				this.jInternalFrameImportacionTipoFormato.setSelected(false);


				this.jInternalFrameImportacionTipoFormato.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFormato"));
				this.jInternalFrameImportacionTipoFormato.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFormato"));
				this.jInternalFrameImportacionTipoFormato.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFormato"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoFormato() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoFormato==null) {
				this.jInternalFrameReporteDinamicoTipoFormato=new ReporteDinamicoJInternalFrame(TipoFormatoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFormato);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFormato);
				this.jInternalFrameReporteDinamicoTipoFormato.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoFormato.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoFormato.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFormato"));
				this.jInternalFrameReporteDinamicoTipoFormato.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFormato"));
				this.jInternalFrameReporteDinamicoTipoFormato.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFormato"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFormato();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFormato() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoFormato.jContentPaneDetalleTipoFormato.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoFormato() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFormato);
			
	       	this.jInternalFrameDetalleFormTipoFormato.setVisible(false);
	        this.jInternalFrameDetalleFormTipoFormato.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoFormato.dispose();
			//this.jInternalFrameDetalleFormTipoFormato=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoFormato() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoFormato.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoFormato.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoFormato() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoFormato.setVisible(true);
	        this.jInternalFrameImportacionTipoFormato.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoFormato() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoFormato.setVisible(true);
	        this.jInternalFrameOrderByTipoFormato.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoFormato() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoFormato.setVisible(false);
	        this.jInternalFrameOrderByTipoFormato.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoFormato() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoFormato.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoFormato.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoFormato() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoFormato.setVisible(false);
	        this.jInternalFrameImportacionTipoFormato.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoFormato(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoFormato(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoFormato(true);
			//this.isEsNuevoTipoFormato=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoFormato("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFormato(false) ;
			
			if(tipoformatoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoSessionBean.getEsGuardarRelacionado() && FormatoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFormatoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoFormatoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFormato(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormato(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoFormatoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoFormato(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoFormato(true);
			//this.isEsNuevoTipoFormato=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoformato.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoFormato("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoFormato(false) ;
			
			if(TipoFormatoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFormato(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormato(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoFormato(false);
			
			//if(!this.isEsNuevoTipoFormato) {								
				int intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoFormato(this.tipoformato,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
				
			}
			
			if(this.permiteMantenimiento(this.tipoformato)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoFormato=true;
					this.inicializarActualizarBindingTablaTipoFormato(false);
					this.isEsNuevoTipoFormato=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoFormato=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoFormato=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFormato(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFormato(false);
				
				this.habilitarDeshabilitarControlesTipoFormato(false);
			
												
				
				if(TipoFormatoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoFormato();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoFormatoActionPerformed(evt,tipoformatoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoFormato(this.tipoformato,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoFormato.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoformatoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoformato.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoFormatoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				this.tipoformato.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				this.tipoformato.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoformato)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoFormatoModel) this.jTableDatosTipoFormato.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoFormato=true;
				this.inicializarActualizarBindingTablaTipoFormato(false);
				this.isEsNuevoTipoFormato=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFormato(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFormato(false);
				
				this.habilitarDeshabilitarControlesTipoFormato(false);
				
				
				
				if(TipoFormatoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoFormato();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoFormatoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoFormato.getRowCount()>=1) {
				jTableDatosTipoFormato.removeRowSelectionInterval(0, jTableDatosTipoFormato.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoFormato(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoFormato(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFormato(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormato(false) ;
			
			this.isEsNuevoTipoFormato=false;
			
			if(TipoFormatoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoFormato();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoFormato(false);
				
				//SI ES MANUAL
				if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoFormato();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoFormato--;			
			//TipoFormato tipoformatoAux= new TipoFormato();			
			//tipoformatoAux.setId(this.iIdNuevoTipoFormato);
			
			if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoFormato();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
			
			this.tipoformato.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoformatoLogic.getTipoFormatos().add(this.tipoformatoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoformatos.add(this.tipoformatoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoFormato(false);
			
			this.jTableDatosTipoFormato.setRowSelectionInterval(this.getIndiceNuevoTipoFormato(), this.getIndiceNuevoTipoFormato());
			
			int iLastRow =  this.jTableDatosTipoFormato.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoFormato.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoFormato.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoFormato(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoFormato(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormato(false);
			
			//SI ES MANUAL
			if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFormato();
			}
			
			//this.abrirFrameTreeTipoFormato();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoFormatoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Formato S ?", "MANTENIMIENTO DE Tipo Formato ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoFormato.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoFormato();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoformatoReturnGeneral=tipoformatoLogic.procesarImportacionTipoFormatosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoformatoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoFormatoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoFormatoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoFormato.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoFormato.setFileImportacion(this.jInternalFrameImportacionTipoFormato.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoFormato.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoFormato.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoFormato.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoFormato.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();		

		tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoFormatoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoFormatoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoFormatos("Todos",tipoformatosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formato ",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFormatoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoFormatoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoFormato.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoFormatoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoFormatoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoFormatoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoFormatoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFormatoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoFormatoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoFormatoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();		
		
		tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformato";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoFormatos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoFormatoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFormatoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoFormato tipoformato:tipoformatosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoformato.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoFormatoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFormatoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoFormato tipoformato:tipoformatosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoformato.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoFormato(row);				
			//	iRow++;
			//}				
			
			//for(TipoFormato tipoformatoAux:tipoformatosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoFormato(tipoformatoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formato ",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormato(false);
			
			//SI ES MANUAL
			if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFormato();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormato(false);
			
			//SI ES MANUAL
			if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFormato();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoFormatoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormato(false);
			
			//SI ES MANUAL
			if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFormato();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoFormato() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoFormato.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoFormato.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoFormato.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoFormato.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoFormato.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoFormato.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoFormato.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoFormato(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoFormato(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoFormato(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoFormato(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoFormato(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoFormato(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormato(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoFormato(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoFormato() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoFormato();
		
		this.inicializarActualizarBindingBotonesManualTipoFormato(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFormato();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormato() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFormato(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFormato(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoFormato.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoFormato.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoFormato.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoFormato!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoFormato.jCheckBoxPostAccionNuevoTipoFormato.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoFormato.jCheckBoxPostAccionSinCerrarTipoFormato.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoFormato.jCheckBoxPostAccionSinMensajeTipoFormato.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoFormato.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoFormato.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoFormato.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoFormato!=null) {
				this.jInternalFrameDetalleFormTipoFormato.jCheckBoxPostAccionNuevoTipoFormato.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoFormato.jCheckBoxPostAccionSinCerrarTipoFormato.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoFormato.jCheckBoxPostAccionSinMensajeTipoFormato.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoFormato.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoFormato.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoFormato.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoFormato!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoFormato.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoFormato.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoFormato.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoFormato.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoFormato!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoFormato.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoFormato.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoFormato(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFormato(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormato() throws Exception {
		try	{
			if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFormato();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFormato() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFormato() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoFormato.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoFormato.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoFormato.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoFormato.addItem(reporte);
			}
			
			
			if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoFormato.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoFormato.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoFormato.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoFormato.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoFormato.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoFormato.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoFormato.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFormato();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFormato() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFormato!=null) {
				this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFormato!=null) {
				this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFormato.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoFormato!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFormato.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoFormato.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFormato.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFormato.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoFormato()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaPorId=Long.parseLong(this.jLabelidTipoFormatoBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoFormato.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoFormato(Boolean esInicializar) throws Exception {				
		if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFormato();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoFormato() throws Exception {
		this.inicializarActualizarBindingTablaTipoFormato(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoFormato() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoFormatoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoFormatoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoFormatoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormatoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoFormatoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoFormatoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoFormato(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoformatoLogic.getTipoFormatos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoformatos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoFormato.setModel(new TipoFormatoModel(this.tipoformatoLogic.getTipoFormatos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoFormato.setModel(new TipoFormatoModel(this.tipoformatos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoFormato!=null && this.jInternalFrameOrderByTipoFormato.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoFormato();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormato,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoFormatoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO,tipoformatoConstantesFunciones.resaltarSeleccionarTipoFormato,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoFormatoConstantesFunciones.SCLASSWEBTITULO,tipoformatoConstantesFunciones.resaltarSeleccionarTipoFormato,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormato,TipoFormatoConstantesFunciones.LABEL_ID));

		if(this.tipoformatoConstantesFunciones.mostraridTipoFormato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFormatoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoformatoConstantesFunciones.resaltaridTipoFormato,this.tipoformatoConstantesFunciones.activaridTipoFormato,this,true,"idTipoFormato","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoformatoConstantesFunciones.resaltaridTipoFormato,this.tipoformatoConstantesFunciones.activaridTipoFormato,this,true,"idTipoFormato","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormato,TipoFormatoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoformatoConstantesFunciones.mostrarid_empresaTipoFormato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFormatoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoformatoConstantesFunciones.resaltarid_empresaTipoFormato,this,this.tipoformatoConstantesFunciones.activarid_empresaTipoFormato));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoformatoConstantesFunciones.resaltarid_empresaTipoFormato,this,this.tipoformatoConstantesFunciones.activarid_empresaTipoFormato,false,"id_empresaTipoFormato","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFormatoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormato,TipoFormatoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoformatoConstantesFunciones.mostrarnombreTipoFormato && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFormatoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoformatoConstantesFunciones.resaltarnombreTipoFormato,this.tipoformatoConstantesFunciones.activarnombreTipoFormato,this,true,"nombreTipoFormato","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoformatoConstantesFunciones.resaltarnombreTipoFormato,this.tipoformatoConstantesFunciones.activarnombreTipoFormato,this,true,"nombreTipoFormato","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoFormatoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFormato && this.tipoformatoConstantesFunciones.mostrarFormatoTipoFormato && !TipoFormatoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Formatoes");
				tableColumn.setHeaderValue("Formatoes");
				tableColumn.setCellRenderer(new FormatoTableCell(tipoformatoConstantesFunciones.resaltarFormatoTipoFormato,this,this.tipoformatoConstantesFunciones.activarFormatoTipoFormato));
				tableColumn.setCellEditor(new FormatoTableCell(tipoformatoConstantesFunciones.resaltarFormatoTipoFormato,this,this.tipoformatoConstantesFunciones.activarFormatoTipoFormato));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoFormato.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoformatoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoformatoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFormato.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoformatoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoformatoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFormato.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoFormato && this.isPermisoGuardarCambiosTipoFormato) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoformatoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoformatoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoFormato.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoformatoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoFormato.addColumn(tableColumn);
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
			
			this.jTableDatosTipoFormato.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFormato && this.isPermisoGuardarCambiosTipoFormato) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoformatoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFormato && this.isPermisoGuardarCambiosTipoFormato) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoFormato.moveColumn(this.jTableDatosTipoFormato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoFormato.moveColumn(this.jTableDatosTipoFormato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoformatoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoFormato.moveColumn(this.jTableDatosTipoFormato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoFormato.moveColumn(this.jTableDatosTipoFormato.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoFormato.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoFormato.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoFormato,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoFormato.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoFormato.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoFormato.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoFormato.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoFormato.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoformatoLogic.getTipoFormatos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoformatos.size()-1;
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
		//this.jTableDatosTipoFormato.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoFormato.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoFormato();
			
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
				
				//this.isEsNuevoTipoFormato=false;
					
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
				if(this.tipoformatoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoFormato==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFormato.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFormato.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoformato.getsType().equals("DUPLICADO")
				   || this.tipoformato.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoFormato=true;
				
				} else {
					this.isEsNuevoTipoFormato=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoformato.getId()>=0 && !this.tipoformato.getIsNew()) {						
						this.isEsNuevoTipoFormato=false;
						
					} else {
						this.isEsNuevoTipoFormato=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoFormato(esRelaciones);						
				
				this.seleccionarTipoFormato(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoformato.getId()<0) {
					this.isEsNuevoTipoFormato=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoFormato(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoFormato(evt,rowIndex);
				}	
				
				if(this.tipoformatoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoFormato: " + this.dDif); 
					}
				}								
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoFormato(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoformato)) {
					if(this.tipoformato.getId()>0) {
						this.tipoformato.setIsDeleted(true);
						
						this.tipoformatosEliminados.add(this.tipoformato);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoformatoLogic.getTipoFormatos().remove(this.tipoformato);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoformatos.remove(this.tipoformato);				
					}
					
					
					((TipoFormatoModel) this.jTableDatosTipoFormato.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFormato(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoFormato(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoFormato) {
			
			if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFormato.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFormato.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoFormato(this.tipoformato);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoformatoConstantesFunciones.cargarid_empresaTipoFormato || this.tipoformatoConstantesFunciones.event_dependid_empresaTipoFormato) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoformato.getid_empresa());
									//this.inicializarActualizarBindingTipoFormato(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoformato.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoformato.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoformato.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoFormato("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoFormato(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFormato() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFormato(TipoFormato tipoformato) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoFormato(tipoformato,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFormato(TipoFormato tipoformato,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoFormato(tipoformato);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoFormato(tipoformato,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoFormato(tipoformato);
	}
	
	public void setVariablesObjetoActualToFormularioTipoFormato(TipoFormato tipoformato) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.setText(tipoformato.getId().toString());
			this.jInternalFrameDetalleFormTipoFormato.jTextAreanombreTipoFormato.setText(tipoformato.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoFormato tipoformatoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoformatoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoFormato tipoformatoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoformatoLocal=this.tipoformato;
			} else {
				tipoformatoLocal=this.tipoformatoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoformatoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoFormato(tipoformatoLocal,true);
					
					if(tipoformatoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoformatoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoformatoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoFormato(TipoFormato tipoformato,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFormato(tipoformato,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(tipoformato);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFormato(TipoFormato tipoformato,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFormato(tipoformato,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFormato(TipoFormato tipoformato,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.getText()==null || this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.getText()=="" || this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.setText("0");
			}

			if(conColumnasBase) {tipoformato.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFormatoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormato.jLabelIdTipoFormato,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoformato.setnombre(this.jInternalFrameDetalleFormTipoFormato.jTextAreanombreTipoFormato.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFormatoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormato.jLabelnombreTipoFormato,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFormato(TipoFormato tipoformatoBean,TipoFormato tipoformato,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoFormato(TipoFormato tipoformatoOrigen,TipoFormato tipoformato,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoformatoOrigen.getId()!=null && !tipoformatoOrigen.getId().equals(0L))) {tipoformato.setId(tipoformatoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoformatoOrigen.getnombre()!=null && !tipoformatoOrigen.getnombre().equals(""))) {tipoformato.setnombre(tipoformatoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFormato(TipoFormato tipoformato) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.setText(tipoformato.getId().toString());
			this.jInternalFrameDetalleFormTipoFormato.jTextAreanombreTipoFormato.setText(tipoformato.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFormato(TipoFormatoBean tipoformatoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.setText(tipoformatoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoFormato.jTextAreanombreTipoFormato.setText(tipoformatoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoFormato(TipoFormatoParameterReturnGeneral tipoformatoReturnGeneral,TipoFormatoBean tipoformatoBean,Boolean conDefault) throws Exception { 
		try {
			TipoFormato tipoformatoLocal=new TipoFormato();
			
			tipoformatoLocal=tipoformatoReturnGeneral.getTipoFormato();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoformatoLocal.getId()!=null && !tipoformatoLocal.getId().equals(0L))) {tipoformatoBean.setId(tipoformatoLocal.getId());}}
			if(conDefault || (!conDefault && tipoformatoLocal.getnombre()!=null && !tipoformatoLocal.getnombre().equals(""))) {tipoformatoBean.setnombre(tipoformatoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoFormatoGenerico(Long idTipoFormatoSeleccionado,JComboBox jComboBoxTipoFormato,List<TipoFormato> tipoformatosLocal)throws Exception {
		try {
			TipoFormato  tipoformatoTemp=null;

			for(TipoFormato tipoformatoAux:tipoformatosLocal) {
				if(tipoformatoAux.getId()!=null && tipoformatoAux.getId().equals(idTipoFormatoSeleccionado)) {
					tipoformatoTemp=tipoformatoAux;
					break;
				}
			}

			jComboBoxTipoFormato.setSelectedItem(tipoformatoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoFormatoGenerico(JComboBox jComboBoxTipoFormato,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFormato.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoFormato.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFormato.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoFormato.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoFormato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoFormato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Formato")) {
			jButtonFormatoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoformato=(TipoFormato) tipoformatoLogic.getTipoFormatos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoformato =(TipoFormato) tipoformatos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoformato.getIsNew() && !tipoformato.getIsChanged() && !tipoformato.getIsDeleted()) {
				sDescripcion=tipoformato.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoformato.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoFormato tipoformatoRow=new TipoFormato();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoformatoRow=(TipoFormato) tipoformatoLogic.getTipoFormatos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoformatoRow=(TipoFormato) tipoformatos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFormatoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoFormato tipoformato) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoFormato==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformato = (TipoFormato)this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoformato = (TipoFormato)this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoformato!=null) {
						this.tipoformato = tipoformato;
					} else {
						this.tipoformato = new TipoFormato();
					}
				}

				if(this.isTienePermisosFormato && this.permiteMantenimiento(this.tipoformato)) {
					FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFramePopup=new FormatoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						formatoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFramePopup;
					} else {
						formatoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame;
					}

					List<TipoFormato> tipoformatos=new ArrayList<TipoFormato>();
					tipoformatos.add(this.tipoformato);
					if(!esRelacionado) {
						//formatoBeanSwingJInternalFrame.formatoSessionBean.setConGuardarRelaciones(false);
						//formatoBeanSwingJInternalFrame.formatoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					formatoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoFormato.cargarFormatoBeanSwingJInternalFrame(tipoformatos,this.tipoformato,formatoBeanSwingJInternalFrame,/*conInicializar,*/formatoBeanSwingJInternalFrame.formatoSessionBean.getConGuardarRelaciones(),formatoBeanSwingJInternalFrame.formatoSessionBean.getEsGuardarRelacionado());
					formatoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						formatoBeanSwingJInternalFrame.actualizarEstadoPanelsFormato("no_relacionado");

						formatoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FormatoConstantesFunciones.ITAMANIOFILATABLA + (FormatoConstantesFunciones.ITAMANIOFILATABLA/2));

						formatoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoFormato=(TitledBorder)this.jScrollPanelDatosTipoFormato.getBorder();
						TitledBorder titledBorderFormato=(TitledBorder)formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

						titledBorderFormato.setTitle(titledBorderTipoFormato.getTitle() + " -> Formato");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,formatoBeanSwingJInternalFrame);
						}

						formatoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(formatoBeanSwingJInternalFrame);

						formatoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoformatoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Formato",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoFormato(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoFormato.setVisible((this.isVisibilidadCeldaNuevoTipoFormato && this.isPermisoNuevoTipoFormato));			
			this.jButtonDuplicarTipoFormato.setVisible((this.isVisibilidadCeldaDuplicarTipoFormato && this.isPermisoDuplicarTipoFormato));			
			this.jButtonCopiarTipoFormato.setVisible((this.isVisibilidadCeldaCopiarTipoFormato && this.isPermisoCopiarTipoFormato));
			this.jButtonVerFormTipoFormato.setVisible((this.isVisibilidadCeldaVerFormTipoFormato && this.isPermisoVerFormTipoFormato));
			
			this.jButtonAbrirOrderByTipoFormato.setVisible((this.isVisibilidadCeldaOrdenTipoFormato && this.isPermisoOrdenTipoFormato));			
			
			this.jButtonNuevoRelacionesTipoFormato.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFormato && this.isPermisoNuevoTipoFormato));			
			this.jButtonNuevoGuardarCambiosTipoFormato.setVisible((this.isVisibilidadCeldaNuevoTipoFormato && this.isPermisoNuevoTipoFormato && this.isPermisoGuardarCambiosTipoFormato));
			
			if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonModificarTipoFormato.setVisible((this.isVisibilidadCeldaModificarTipoFormato && this.isPermisoActualizarTipoFormato));	
			this.jInternalFrameDetalleFormTipoFormato.jButtonActualizarTipoFormato.setVisible((this.isVisibilidadCeldaActualizarTipoFormato && this.isPermisoActualizarTipoFormato));	
			this.jInternalFrameDetalleFormTipoFormato.jButtonEliminarTipoFormato.setVisible((this.isVisibilidadCeldaEliminarTipoFormato && this.isPermisoEliminarTipoFormato));
			this.jInternalFrameDetalleFormTipoFormato.jButtonCancelarTipoFormato.setVisible(this.isVisibilidadCeldaCancelarTipoFormato);							
			this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosTipoFormato.setVisible((this.isVisibilidadCeldaGuardarTipoFormato && this.isPermisoGuardarCambiosTipoFormato));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoFormato.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFormato && this.isPermisoGuardarCambiosTipoFormato));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoFormato.setVisible((this.isVisibilidadCeldaNuevoTipoFormato && this.isPermisoNuevoTipoFormato));						
			this.jButtonDuplicarToolBarTipoFormato.setVisible((this.isVisibilidadCeldaDuplicarTipoFormato && this.isPermisoDuplicarTipoFormato));						
			this.jButtonCopiarToolBarTipoFormato.setVisible((this.isVisibilidadCeldaCopiarTipoFormato && this.isPermisoCopiarTipoFormato));			
			this.jButtonVerFormToolBarTipoFormato.setVisible((this.isVisibilidadCeldaVerFormTipoFormato && this.isPermisoVerFormTipoFormato));			
			this.jButtonAbrirOrderByToolBarTipoFormato.setVisible((this.isVisibilidadCeldaOrdenTipoFormato && this.isPermisoOrdenTipoFormato));
			this.jButtonNuevoRelacionesToolBarTipoFormato.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFormato && this.isPermisoNuevoTipoFormato));			
			this.jButtonNuevoGuardarCambiosToolBarTipoFormato.setVisible((this.isVisibilidadCeldaNuevoTipoFormato && this.isPermisoNuevoTipoFormato && this.isPermisoGuardarCambiosTipoFormato));			
			
			if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonModificarToolBarTipoFormato.setVisible((this.isVisibilidadCeldaModificarTipoFormato && this.isPermisoActualizarTipoFormato));	
			this.jInternalFrameDetalleFormTipoFormato.jButtonActualizarToolBarTipoFormato.setVisible((this.isVisibilidadCeldaActualizarTipoFormato  && this.isPermisoActualizarTipoFormato));	
			this.jInternalFrameDetalleFormTipoFormato.jButtonEliminarToolBarTipoFormato.setVisible((this.isVisibilidadCeldaEliminarTipoFormato && this.isPermisoEliminarTipoFormato));
			this.jInternalFrameDetalleFormTipoFormato.jButtonCancelarToolBarTipoFormato.setVisible(this.isVisibilidadCeldaCancelarTipoFormato);				
			this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosToolBarTipoFormato.setVisible((this.isVisibilidadCeldaGuardarTipoFormato && this.isPermisoGuardarCambiosTipoFormato));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoFormato.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFormato && this.isPermisoGuardarCambiosTipoFormato));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoFormato.setVisible((this.isVisibilidadCeldaNuevoTipoFormato && this.isPermisoNuevoTipoFormato));			
			this.jMenuItemDuplicarTipoFormato.setVisible((this.isVisibilidadCeldaDuplicarTipoFormato && this.isPermisoDuplicarTipoFormato));			
			this.jMenuItemCopiarTipoFormato.setVisible((this.isVisibilidadCeldaCopiarTipoFormato && this.isPermisoCopiarTipoFormato));			
			this.jMenuItemVerFormTipoFormato.setVisible((this.isVisibilidadCeldaVerFormTipoFormato && this.isPermisoVerFormTipoFormato));			
			this.jMenuItemAbrirOrderByTipoFormato.setVisible((this.isVisibilidadCeldaOrdenTipoFormato && this.isPermisoOrdenTipoFormato));			
			//this.jMenuItemMostrarOcultarTipoFormato.setVisible((this.isVisibilidadCeldaOrdenTipoFormato && this.isPermisoOrdenTipoFormato));
			this.jMenuItemDetalleAbrirOrderByTipoFormato.setVisible((this.isVisibilidadCeldaOrdenTipoFormato && this.isPermisoOrdenTipoFormato));			
			//this.jMenuItemDetalleMostrarOcultarTipoFormato.setVisible((this.isVisibilidadCeldaOrdenTipoFormato && this.isPermisoOrdenTipoFormato));			
			this.jMenuItemNuevoRelacionesTipoFormato.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFormato && this.isPermisoNuevoTipoFormato));			
			this.jMenuItemNuevoGuardarCambiosTipoFormato.setVisible((this.isVisibilidadCeldaNuevoTipoFormato && this.isPermisoNuevoTipoFormato && this.isPermisoGuardarCambiosTipoFormato));									
			
			if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			this.jInternalFrameDetalleFormTipoFormato.jMenuItemModificarTipoFormato.setVisible((this.isVisibilidadCeldaModificarTipoFormato && this.isPermisoActualizarTipoFormato));	
			this.jInternalFrameDetalleFormTipoFormato.jMenuItemActualizarTipoFormato.setVisible((this.isVisibilidadCeldaActualizarTipoFormato && this.isPermisoActualizarTipoFormato));	
			this.jInternalFrameDetalleFormTipoFormato.jMenuItemEliminarTipoFormato.setVisible((this.isVisibilidadCeldaEliminarTipoFormato && this.isPermisoEliminarTipoFormato));
			this.jInternalFrameDetalleFormTipoFormato.jMenuItemCancelarTipoFormato.setVisible(this.isVisibilidadCeldaCancelarTipoFormato);				
			}
			
			this.jMenuItemGuardarCambiosTipoFormato.setVisible((this.isVisibilidadCeldaGuardarTipoFormato && this.isPermisoGuardarCambiosTipoFormato));						
			this.jMenuItemGuardarCambiosTablaTipoFormato.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFormato && this.isPermisoGuardarCambiosTipoFormato));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoFormato=this.jButtonNuevoTipoFormato.isVisible();
			this.isVisibilidadCeldaDuplicarTipoFormato=this.jButtonDuplicarTipoFormato.isVisible();
			this.isVisibilidadCeldaCopiarTipoFormato=this.jButtonCopiarTipoFormato.isVisible();
			this.isVisibilidadCeldaVerFormTipoFormato=this.jButtonVerFormTipoFormato.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoFormato=this.jButtonAbrirOrderByTipoFormato.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=this.jButtonNuevoRelacionesTipoFormato.isVisible();
			this.isVisibilidadCeldaModificarTipoFormato=this.jButtonModificarTipoFormato.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			this.isVisibilidadCeldaActualizarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jButtonActualizarTipoFormato.isVisible();
			this.isVisibilidadCeldaEliminarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jButtonEliminarTipoFormato.isVisible();
			this.isVisibilidadCeldaCancelarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jButtonCancelarTipoFormato.isVisible();
			this.isVisibilidadCeldaGuardarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosTipoFormato.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=this.jButtonGuardarCambiosTablaTipoFormato.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoFormato=this.jButtonNuevoToolBarTipoFormato.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=this.jButtonNuevoRelacionesToolBarTipoFormato.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			this.isVisibilidadCeldaModificarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jButtonModificarToolBarTipoFormato.isVisible();
			this.isVisibilidadCeldaActualizarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jButtonActualizarToolBarTipoFormato.isVisible();
			this.isVisibilidadCeldaEliminarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jButtonEliminarToolBarTipoFormato.isVisible();
			this.isVisibilidadCeldaCancelarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jButtonCancelarToolBarTipoFormato.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFormato=this.jButtonGuardarCambiosToolBarTipoFormato.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=this.jButtonGuardarCambiosTablaToolBarTipoFormato.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoFormato=this.jMenuItemNuevoTipoFormato.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=this.jMenuItemNuevoRelacionesTipoFormato.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			this.isVisibilidadCeldaModificarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jMenuItemModificarTipoFormato.isVisible();
			this.isVisibilidadCeldaActualizarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jMenuItemActualizarTipoFormato.isVisible();
			this.isVisibilidadCeldaEliminarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jMenuItemEliminarTipoFormato.isVisible();
			this.isVisibilidadCeldaCancelarTipoFormato=this.jInternalFrameDetalleFormTipoFormato.jMenuItemCancelarTipoFormato.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFormato=this.jMenuItemGuardarCambiosTipoFormato.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=this.jMenuItemGuardarCambiosTablaTipoFormato.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoFormato(Boolean esInicializar) {
		if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoformatoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFormato();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoFormato(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoFormato() {
		this.jButtonNuevoTipoFormato.setVisible(this.isPermisoNuevoTipoFormato);			
		this.jButtonDuplicarTipoFormato.setVisible(this.isPermisoDuplicarTipoFormato);			
		this.jButtonCopiarTipoFormato.setVisible(this.isPermisoCopiarTipoFormato);			
		this.jButtonVerFormTipoFormato.setVisible(this.isPermisoVerFormTipoFormato);			
		
		this.jButtonAbrirOrderByTipoFormato.setVisible(this.isPermisoOrdenTipoFormato);					
		
		this.jButtonNuevoRelacionesTipoFormato.setVisible(this.isPermisoNuevoTipoFormato);			
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonModificarTipoFormato.setVisible(this.isPermisoActualizarTipoFormato);	
			this.jInternalFrameDetalleFormTipoFormato.jButtonActualizarTipoFormato.setVisible(this.isPermisoActualizarTipoFormato);	
			this.jInternalFrameDetalleFormTipoFormato.jButtonEliminarTipoFormato.setVisible(this.isPermisoEliminarTipoFormato);
			this.jInternalFrameDetalleFormTipoFormato.jButtonCancelarTipoFormato.setVisible(this.isVisibilidadCeldaCancelarTipoFormato);						
			this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosTipoFormato.setVisible(this.isPermisoGuardarCambiosTipoFormato);							
		}
		
		this.jButtonGuardarCambiosTablaTipoFormato.setVisible(this.isPermisoActualizarTipoFormato);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFormato() {
		this.jInternalFrameDetalleFormTipoFormato.jButtonModificarTipoFormato.setVisible(this.isPermisoActualizarTipoFormato);	
		this.jInternalFrameDetalleFormTipoFormato.jButtonActualizarTipoFormato.setVisible(this.isPermisoActualizarTipoFormato);	
		this.jInternalFrameDetalleFormTipoFormato.jButtonEliminarTipoFormato.setVisible(this.isPermisoEliminarTipoFormato);
		this.jInternalFrameDetalleFormTipoFormato.jButtonCancelarTipoFormato.setVisible(this.isVisibilidadCeldaCancelarTipoFormato);							
		this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosTipoFormato.setVisible((this.isVisibilidadCeldaGuardarTipoFormato && this.isPermisoGuardarCambiosTipoFormato));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoFormato() {
		if(TipoFormatoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoFormato();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoFormato() {
	}
	
	public void jTableDatosTipoFormatoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoFormato(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoFormatoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFormato(this.gettipoformato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoformato==null) {
						this.tipoformato = new TipoFormato();
					}

					this.setVariablesFormularioToObjetoActualTipoFormato(this.tipoformato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
				}

				if(this.tipoformato.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoformato.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFormato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoFormatoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoFormato(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoFormato.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoFormato.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoFormato(this.gettipoformato(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoformatoLogic.getConnexion());

				if(this.tipoformato.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoformato.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoFormato=(TitledBorder)this.jScrollPanelDatosTipoFormato.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoFormato.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoFormatoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFormato(this.gettipoformato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoformato==null) {
						this.tipoformato = new TipoFormato();
					}

					this.setVariablesFormularioToObjetoActualTipoFormato(this.tipoformato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
				}

				if(this.tipoformato.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoformato.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFormato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoFormatoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFormato(this.gettipoformato(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoformato==null) {
						this.tipoformato = new TipoFormato();
					}

					this.setVariablesFormularioToObjetoActualTipoFormato(this.tipoformato,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);
				}

				if(this.tipoformato.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoformato.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFormato(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdTipoFormatoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoFormato(false,false);

			this.getTipoFormatosBusquedaPorId();

			this.inicializarActualizarBindingTipoFormato(false);

			//if(TipoFormatoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoFormato(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoFormatoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoFormato(false,false);

			this.getTipoFormatosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoFormato(false);

			//if(TipoFormatoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoFormato(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoFormatoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoFormato(false,false);

			this.getTipoFormatosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoFormato(false);

			//if(TipoFormatoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoFormato(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformatoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoFormato() {
		if(this.jInternalFrameDetalleFormTipoFormato!=null) {
		

		if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) {
			this.jInternalFrameDetalleFormTipoFormato.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoFormato.dispose();
			this.jInternalFrameDetalleFormTipoFormato=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoFormato!=null) {
			this.jInternalFrameReporteDinamicoTipoFormato.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoFormato.dispose();
			this.jInternalFrameReporteDinamicoTipoFormato=null;
		}
		
		if(this.jInternalFrameImportacionTipoFormato!=null) {
			this.jInternalFrameImportacionTipoFormato.setVisible(false);	    			
			this.jInternalFrameImportacionTipoFormato.dispose();
			this.jInternalFrameImportacionTipoFormato=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoFormato();
			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoFormato")) {
				jButtonNuevoTipoFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoFormato")) {
				jButtonDuplicarTipoFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoFormato")) {
				jButtonCopiarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoFormato")) {
				jButtonVerFormTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoFormato")) {
				jButtonNuevoTipoFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoFormato")) {
				jButtonDuplicarTipoFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoFormato")) {
				jButtonNuevoTipoFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoFormato")) {
				jButtonDuplicarTipoFormatoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoFormato")) {
				jButtonNuevoTipoFormatoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoFormato")) {
				jButtonNuevoTipoFormatoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoFormato")) {
				jButtonNuevoTipoFormatoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoFormato")) {
				jButtonModificarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoFormato")) {
				jButtonModificarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoFormato")) {
				jButtonModificarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoFormato")) {
				jButtonActualizarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoFormato")) {
				jButtonActualizarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoFormato")) {
				jButtonActualizarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoFormato")) {
				jButtonEliminarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoFormato")) {
				jButtonEliminarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoFormato")) {
				jButtonEliminarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoFormato")) {
				jButtonCancelarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoFormato")) {
				jButtonCancelarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoFormato")) {
				jButtonCancelarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoFormato")) {
				jButtonCerrarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoFormato")) {
				jButtonCerrarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoFormato")) {
				jButtonCerrarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoFormato")) {
				jButtonMostrarOcultarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoFormato")) {
				jButtonCancelarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoFormato")) {
				jButtonGuardarCambiosTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoFormato")) {
				jButtonGuardarCambiosTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoFormato")) {
				jButtonCopiarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoFormato")) {
				jButtonVerFormTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoFormato")) {
				jButtonGuardarCambiosTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoFormato")) {
				jButtonCopiarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoFormato")) {
				jButtonVerFormTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoFormato")) {
				jButtonGuardarCambiosTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoFormato")) {
				jButtonGuardarCambiosTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoFormato")) {
				jButtonGuardarCambiosTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoFormato")) {
				jButtonRecargarInformacionTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoFormato")) {
				jButtonRecargarInformacionTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoFormato")) {
				jButtonRecargarInformacionTipoFormatoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoFormato")) {
				jButtonAnterioresTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoFormato")) {
				jButtonAnterioresTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoFormato")) {
				jButtonAnterioresTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoFormato")) {
				jButtonSiguientesTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoFormato")) {
				jButtonSiguientesTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoFormato")) {
				jButtonSiguientesTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoFormato") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoFormato")) {
				jButtonAbrirOrderByTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoFormato") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoFormato")) {
				jButtonMostrarOcultarTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFormato")) {
				jButtonNuevoGuardarCambiosTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoFormato")) {
				jButtonNuevoGuardarCambiosTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoFormato")) {
				jButtonNuevoGuardarCambiosTipoFormatoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoFormato")) {
				jButtonCerrarReporteDinamicoTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoFormato")) {
				jButtonGenerarReporteDinamicoTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoFormato")) {
				
				jButtonGenerarExcelReporteDinamicoTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoFormato")) {
				jButtonCerrarImportacionTipoFormatoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoFormato")) {
				
				jButtonGenerarImportacionTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoFormato")) {
				
				jButtonAbrirImportacionTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoFormato")) {
				jComboBoxTiposAccionesTipoFormatoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoFormato")) {
				jComboBoxTiposRelacionesTipoFormatoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoFormato")) {
				jComboBoxTiposAccionesTipoFormatoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoFormato")) {
				
				jComboBoxTiposSeleccionarTipoFormatoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoFormato")) {
				jTextFieldValorCampoGeneralTipoFormatoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoFormato")) {
				jButtonAbrirOrderByTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoFormato")) {
				jButtonAbrirOrderByTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoFormato")) {
				jButtonCerrarOrderByTipoFormatoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFormatoBusqueda")) {
				this.jButtonidTipoFormatoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoFormatoUpdate")) {
				this.jButtonid_empresaTipoFormatoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoFormatoBusqueda")) {
				this.jButtonid_empresaTipoFormatoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFormatoBusqueda")) {
				this.jButtonnombreTipoFormatoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdTipoFormato")) {
				this.jButtonBusquedaPorIdTipoFormatoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoFormato")) {
				this.jButtonBusquedaPorNombreTipoFormatoActionPerformed(evt);
			}
			
			;
			
			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoFormato();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormatoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				


				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoFormato tipoformatoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoformatoLocal=this.tipoformato;
			} else {
				tipoformatoLocal=this.tipoformatoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
							
				
				


				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormatoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoAnterior =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformatoAnterior =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
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
			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
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
			
			


			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormatoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
								
						
				


				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
								
				
				


				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormatoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoAnterior =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformatoAnterior =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormatoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoAnterior =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformatoAnterior =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormatoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
							
				
				


				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormatoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformatoAnterior =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoformatoAnterior =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
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
			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
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
			
			


			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormatoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
								
				
				


				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormatoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoAnterior =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformatoAnterior =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormatoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormatoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoFormato")) {
					jCheckBoxSeleccionarTodosTipoFormatoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoFormato")) {
					jCheckBoxSeleccionadosTipoFormatoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoFormato")) {
					
				}
				
				


				
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
												
				
				


				
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormatoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformatoAnterior =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoformatoAnterior =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormatoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
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
			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
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
			
			


			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormatoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformato);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformato);
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
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
				
				


				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormato.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormato.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormatoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformatoAnterior =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformatoAnterior =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoFormato")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoFormatoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoFormato.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoformato =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoformato =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoformato);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoFormato")) {
				
				}
				
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoFormato")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoFormato.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoFormato")) {
			
			}
			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoFormato();
			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoFormato")) {
				jButtonNuevoTipoFormatoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoFormato")) {
				jButtonDuplicarTipoFormatoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoFormato")) {
				jButtonCopiarTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoFormato")) {
				jButtonVerFormTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoFormato")) {
				jButtonNuevoTipoFormatoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoFormato")) {
				jButtonModificarTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoFormato")) {
				jButtonActualizarTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoFormato")) {
				jButtonEliminarTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoFormato")) {
				jButtonGuardarCambiosTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoFormato")) {
				jButtonCancelarTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoFormato")) {
				jButtonCerrarTipoFormatoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoFormato")) {
				jButtonGuardarCambiosTipoFormatoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFormato")) {
				jButtonNuevoGuardarCambiosTipoFormatoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoFormato")) {
				jButtonAbrirOrderByTipoFormatoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoFormato")) {
				jButtonRecargarInformacionTipoFormatoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoFormato")) {
				jButtonAnterioresTipoFormatoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoFormato")) {
				jButtonSiguientesTipoFormatoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFormatoBusqueda")) {
				this.jButtonidTipoFormatoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoFormatoUpdate")) {
				this.jButtonid_empresaTipoFormatoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoFormatoBusqueda")) {
				this.jButtonid_empresaTipoFormatoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFormatoBusqueda")) {
				this.jButtonnombreTipoFormatoBusquedaActionPerformed(evt);
			}
			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoFormato();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoFormato")) {
				closingInternalFrameTipoFormato();
				
			} else if(sTipo.equals("jButtonCancelarTipoFormato")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoFormato = (JInternalFrameBase)evt.getSource();
	            	
	            TipoFormatoBeanSwingJInternalFrame jInternalFrameParent=(TipoFormatoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFormato.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoFormatoActionPerformed(null);
			}
			
			TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoformato,new Object(),this.tipoformatoParameterGeneral,this.tipoformatoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoFormato(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoFormato(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoFormato(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoformato)) {
			if(!esControlTabla) {
				if(TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoFormato(this.tipoformato,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);			
				}
				
				if(this.tipoformatoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoFormato(this.tipoformato,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoformatoReturnGeneral=tipoformatoLogic.procesarEventosTipoFormatosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformatoLogic.getTipoFormatos(),this.tipoformato,this.tipoformatoParameterGeneral,this.isEsNuevoTipoFormato,classes);//this.tipoformatoLogic.getTipoFormato()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoFormato(this.tipoformatoReturnGeneral,this.tipoformatoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoformatoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoFormato(classes,this.tipoformatoReturnGeneral,this.tipoformatoBean,false);
					}
						
					if(this.tipoformatoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoFormato(this.tipoformatoReturnGeneral.getTipoFormato());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoFormato(this.tipoformatoReturnGeneral.getTipoFormato());	
					}
						
					if(this.tipoformatoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoFormato(this.tipoformatoReturnGeneral.getTipoFormato(),classes);//this.tipoformatoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoFormato(this.tipoformato,classes);//this.tipoformatoBean);									
				}
			
				if(TipoFormatoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoFormato(this.tipoformato,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormato(this.tipoformato);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoformatoAnterior!=null) {
						this.tipoformato=this.tipoformatoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoformatoReturnGeneral=tipoformatoLogic.procesarEventosTipoFormatosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformatoLogic.getTipoFormatos(),this.tipoformato,this.tipoformatoParameterGeneral,this.isEsNuevoTipoFormato,classes);//this.tipoformatoLogic.getTipoFormato()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoformatoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoformatoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoformatoReturnGeneral.getTipoFormato(),tipoformatoLogic.getTipoFormatos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoformatoReturnGeneral.getTipoFormato(),this.tipoformatos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoFormato.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoFormato.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoFormato();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoFormato() throws Exception {
		
		TipoFormatoModel tipoformatoModel=(TipoFormatoModel)this.jTableDatosTipoFormato.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoformatoModel.tipoformatos=this.tipoformatoLogic.getTipoFormatos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoformatoModel.tipoformatos=this.tipoformatos;
		}
		
		
		((TipoFormatoModel) this.jTableDatosTipoFormato.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoFormato() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoformatoAnterior(),this.tipoformatoLogic.getTipoFormatos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoformatoAnterior(),this.tipoformatos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoFormato();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoFormato(TipoFormato tipoformato,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Formato.class)) {
					this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.setFormatos(tipoformato.getFormatos());
					this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
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
										
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformato,new Object(),generalEntityParameterGeneral,this.tipoformatoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoformatoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoFormatoConstantesFunciones.getClassesRelationshipsOfTipoFormato(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoFormatoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoFormato(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoFormato(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoFormatoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformato,new Object(),generalEntityParameterGeneral,this.tipoformatoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoFormato(TipoFormatoBean tipoformatoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Formato.class)) {
					this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.setFormatos(tipoformato.getFormatos());
					this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoFormato(ArrayList<Classe> classes,TipoFormatoReturnGeneral tipoformatoReturnGeneral,TipoFormatoBean tipoformatoBean,Boolean conDefault) throws Exception {
		
			this.tipoformatoBean.setFormatos(tipoformatoReturnGeneral.getTipoFormato().getFormatos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoFormato(TipoFormato tipoformato,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Formato.class)) {
					tipoformato.setFormatos(this.jInternalFrameDetalleFormTipoFormato.formatoBeanSwingJInternalFrame.formatoLogic.getFormatos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoformato)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoFormato = new TipoFormatoDetalleFormJInternalFrame(jDesktopPane,this.tipoformatoSessionBean.getConGuardarRelaciones(),this.tipoformatoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFormato);
		this.jInternalFrameDetalleFormTipoFormato.setVisible(false);
		this.jInternalFrameDetalleFormTipoFormato.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoFormato.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoFormato.tipoformatoLogic=this.tipoformatoLogic;
		
		this.cargarCombosFrameForeignKeyTipoFormato("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFormato();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFormato();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoFormato("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoFormato();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoFormato.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFormato"));
		
		this.jInternalFrameDetalleFormTipoFormato.jButtonModificarTipoFormato.addActionListener(new ButtonActionListener(this,"ModificarTipoFormato"));

		
		this.jInternalFrameDetalleFormTipoFormato.jButtonModificarToolBarTipoFormato.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFormato"));
					
		this.jInternalFrameDetalleFormTipoFormato.jMenuItemModificarTipoFormato.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFormato"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormato.jButtonActualizarTipoFormato.addActionListener (new ButtonActionListener(this,"ActualizarTipoFormato"));
		
		
		this.jInternalFrameDetalleFormTipoFormato.jButtonActualizarToolBarTipoFormato.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFormato"));
						
		this.jInternalFrameDetalleFormTipoFormato.jMenuItemActualizarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFormato"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormato.jButtonEliminarTipoFormato.addActionListener (new ButtonActionListener(this,"EliminarTipoFormato"));
		
		
		this.jInternalFrameDetalleFormTipoFormato.jButtonEliminarToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFormato"));
								
		this.jInternalFrameDetalleFormTipoFormato.jMenuItemEliminarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFormato"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormato.jButtonCancelarTipoFormato.addActionListener (new ButtonActionListener(this,"CancelarTipoFormato"));
		
		
		this.jInternalFrameDetalleFormTipoFormato.jButtonCancelarToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFormato"));
					
		this.jInternalFrameDetalleFormTipoFormato.jMenuItemCancelarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFormato"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoFormato.jMenuItemDetalleCerrarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFormato"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFormato"));
		
		
		
		this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFormato"));
		
		
		
		this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFormato"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormato.jButtonidTipoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoFormato.jButtonid_empresaTipoFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormato.jButtonid_empresaTipoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormatoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormato.jButtonnombreTipoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFormatoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoFormato.jTabbedPaneRelacionesTipoFormato.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFormato"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoFormato"));
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFormato"));
		}
		
		this.jTableDatosTipoFormato.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoFormato"));
		
		this.jTableDatosTipoFormato.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoFormato"));
		
		this.jButtonNuevoTipoFormato.addActionListener(new ButtonActionListener(this,"NuevoTipoFormato"));
		
		this.jButtonDuplicarTipoFormato.addActionListener(new ButtonActionListener(this,"DuplicarTipoFormato"));
		
		this.jButtonCopiarTipoFormato.addActionListener(new ButtonActionListener(this,"CopiarTipoFormato"));
		
		this.jButtonVerFormTipoFormato.addActionListener(new ButtonActionListener(this,"VerFormTipoFormato"));
		
		
		this.jButtonNuevoToolBarTipoFormato.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoFormato"));
			
		this.jButtonDuplicarToolBarTipoFormato.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoFormato"));
			
		this.jMenuItemNuevoTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoFormato"));
			
		this.jMenuItemDuplicarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoFormato"));		
		
		
		this.jButtonNuevoRelacionesTipoFormato.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoFormato"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoFormato.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoFormato"));
			
		this.jMenuItemNuevoRelacionesTipoFormato.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoFormato"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonModificarTipoFormato.addActionListener(new ButtonActionListener(this,"ModificarTipoFormato"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonModificarToolBarTipoFormato.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFormato"));
			
			this.jInternalFrameDetalleFormTipoFormato.jMenuItemModificarTipoFormato.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFormato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoFormato.jButtonActualizarTipoFormato.addActionListener (new ButtonActionListener(this,"ActualizarTipoFormato"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonActualizarToolBarTipoFormato.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFormato"));
				
			this.jInternalFrameDetalleFormTipoFormato.jMenuItemActualizarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFormato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonEliminarTipoFormato.addActionListener (new ButtonActionListener(this,"EliminarTipoFormato"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonEliminarToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFormato"));
						
			this.jInternalFrameDetalleFormTipoFormato.jMenuItemEliminarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFormato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonCancelarTipoFormato.addActionListener (new ButtonActionListener(this,"CancelarTipoFormato"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonCancelarToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFormato"));
			
			this.jInternalFrameDetalleFormTipoFormato.jMenuItemCancelarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFormato"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoFormato"));		
		
		
		this.jButtonCerrarTipoFormato.addActionListener (new ButtonActionListener(this,"CerrarTipoFormato"));
		
		
		this.jButtonCerrarToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoFormato"));
			
		this.jMenuItemCerrarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoFormato"));
			
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jMenuItemDetalleCerrarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFormato"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosTipoFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoFormato"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFormato"));
		}
		
		this.jButtonCopiarToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoFormato"));
			
		this.jButtonVerFormToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoFormato"));
		
		this.jMenuItemGuardarCambiosTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoFormato"));
			
		this.jMenuItemCopiarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoFormato"));		
		
		this.jMenuItemVerFormTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoFormato"));		
		
		
		this.jButtonGuardarCambiosTablaTipoFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFormato"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoFormato"));
			
		this.jMenuItemGuardarCambiosTablaTipoFormato.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFormato"));		
		
		
		
		this.jButtonRecargarInformacionTipoFormato.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoFormato"));
					
		this.jButtonRecargarInformacionToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoFormato"));
		
		this.jMenuItemRecargarInformacionTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoFormato"));		
		
		
		
		this.jButtonAnterioresTipoFormato.addActionListener (new ButtonActionListener(this,"AnterioresTipoFormato"));
		
		
		this.jButtonAnterioresToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoFormato"));
		
		this.jMenuItemAnterioresTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoFormato"));		
		
		
		this.jButtonSiguientesTipoFormato.addActionListener (new ButtonActionListener(this,"SiguientesTipoFormato"));
		
		
		this.jButtonSiguientesToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoFormato"));
			
		this.jMenuItemSiguientesTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoFormato"));
			
		this.jMenuItemAbrirOrderByTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoFormato"));
			
		this.jMenuItemMostrarOcultarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoFormato"));
			
		this.jMenuItemDetalleAbrirOrderByTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoFormato"));
			
		this.jMenuItemDetalleMostarOcultarTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoFormato"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoFormato.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoFormato"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoFormato"));
			
		this.jMenuItemNuevoGuardarCambiosTipoFormato.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoFormato"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoFormato.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoFormato"));

		this.jCheckBoxSeleccionadosTipoFormato.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoFormato"));
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFormato"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoFormato.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoFormato"));
			
		this.jComboBoxTiposAccionesTipoFormato.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoFormato"));
					
		this.jComboBoxTiposSeleccionarTipoFormato.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoFormato"));
			
		this.jTextFieldValorCampoGeneralTipoFormato.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoFormato"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormato.jButtonidTipoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoFormato.jButtonid_empresaTipoFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormato.jButtonid_empresaTipoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormatoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormato.jButtonnombreTipoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFormatoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdTipoFormato.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoFormato"));

			this.jButtonBusquedaPorNombreTipoFormato.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoFormato"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoFormato!=null) {
				this.jInternalFrameReporteDinamicoTipoFormato.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFormato"));
				this.jInternalFrameReporteDinamicoTipoFormato.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFormato"));
				this.jInternalFrameReporteDinamicoTipoFormato.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFormato"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoFormato.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFormato"));				
			//this.jButtonGenerarReporteDinamicoTipoFormato.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFormato"));
			//this.jButtonGenerarExcelReporteDinamicoTipoFormato.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFormato"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoFormato!=null) {
				this.jInternalFrameImportacionTipoFormato.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFormato"));
				this.jInternalFrameImportacionTipoFormato.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFormato"));
				this.jInternalFrameImportacionTipoFormato.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFormato"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoFormato.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoFormato"));
			
			this.jButtonAbrirOrderByToolBarTipoFormato.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoFormato"));			
			
			if(this.jInternalFrameOrderByTipoFormato!=null) {
				this.jInternalFrameOrderByTipoFormato.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFormato"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoFormato!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormato.jTabbedPaneRelacionesTipoFormato.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFormato"));
		
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
            		closingInternalFrameTipoFormato();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoFormato.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoFormato = (JInternalFrameBase)event.getSource();
	            	
	            TipoFormatoBeanSwingJInternalFrame jInternalFrameParent=(TipoFormatoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFormato.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoFormatoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoFormato.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoFormatoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoFormato.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoFormato.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormatoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormatoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormatoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoFormato";
		inputMap = this.jButtonNuevoTipoFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFormatoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormatoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormatoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormatoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoFormato";
		inputMap = this.jButtonNuevoRelacionesTipoFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFormatoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoFormato";
		inputMap = this.jButtonModificarTipoFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoFormato";
		inputMap = this.jButtonActualizarTipoFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoFormato";
		inputMap = this.jButtonEliminarTipoFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoFormato";
		inputMap = this.jButtonCancelarTipoFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoFormato";
		inputMap = this.jButtonCerrarTipoFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoFormato";
		inputMap = this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosTipoFormato.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoFormato.jButtonGuardarCambiosTipoFormato.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoFormatoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoFormato.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoFormatoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoFormato.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoFormatoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoFormato.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoFormatoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoFormato.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoFormatoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormato.jButtonidTipoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFormatoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoFormato.jButtonid_empresaTipoFormatoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormatoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormato.jButtonid_empresaTipoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormatoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormato.jButtonnombreTipoFormatoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFormatoBusqueda"));
		
		
		this.jButtonBusquedaPorIdTipoFormato.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoFormato"));

		this.jButtonBusquedaPorNombreTipoFormato.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoFormato"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoFormato.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoFormatoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoFormatoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoFormato.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoFormato(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoFormato tipoformatoAux:this.tipoformatoLogic.getTipoFormatos()) {
					tipoformatoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormato tipoformatoAux:tipoformatos) {
					tipoformatoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoFormatoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFormato(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFormato tipoformatoAux:this.tipoformatoLogic.getTipoFormatos()) {
						tipoformatoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFormato tipoformatoAux:tipoformatos) {
						tipoformatoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoFormato tipoformatoAux:this.tipoformatoLogic.getTipoFormatos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFormato tipoformatoAux:tipoformatos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFormato(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFormato.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFormato.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFormato,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoFormatoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFormato(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoFormato.getSelectedRows();
			
			TipoFormato tipoformatoLocal=new TipoFormato();
			
			//this.seleccionarTodosTipoFormato(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformatoLocal =(TipoFormato) this.tipoformatoLogic.getTipoFormatos().toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoformatoLocal =(TipoFormato) this.tipoformatos.toArray()[this.jTableDatosTipoFormato.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoformatoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFormato tipoformatoAux:this.tipoformatoLogic.getTipoFormatos()) {
						tipoformatoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFormato tipoformatoAux:tipoformatos) {
						tipoformatoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoFormato(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFormato.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFormato.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFormato,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoFormatoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoFormatoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoFormatoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoFormato(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoFormato.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFormato tipoformatoAux:this.tipoformatoLogic.getTipoFormatos()) {
				
						if(sTipoSeleccionar.equals(TipoFormatoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoformatoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormato tipoformatoAux:tipoformatos) {
					
						if(sTipoSeleccionar.equals(TipoFormatoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoformatoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFormato(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoFormatoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoFormato(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoFormato=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoFormato.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoFormato) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoFormato(conSplash);
				
					this.generarReporteTipoFormatosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoFormatosSeleccionados();
				//this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFormatosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFormatosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFormato();
				
				this.exportarTipoFormatosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoFormatos();
				//this.importarTipoFormatos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFormato();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoFormatosSeleccionados();
				//this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Formato ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoFormato();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoFormato)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoFormato(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Formato ",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoFormatoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoFormato) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoFormato(conSplash);
					
						//this.actualizarParametrosGeneralTipoFormato();
						
						this.generarReporteProcesoAccionTipoFormatosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoFormatoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Formato S SELECCIONADOS?", "MANTENIMIENTO DE Tipo Formato ", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoFormato();
				
						this.actualizarParametrosGeneralTipoFormato();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoformatoReturnGeneral=tipoformatoLogic.procesarAccionTipoFormatosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoformatoLogic.getTipoFormatos(),this.tipoformatoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoFormatoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoFormato();
					
					TipoFormatoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoFormatoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoFormato.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoFormato.jComboBoxTiposAccionesFormularioTipoFormato.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoFormato(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoFormatoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoFormato();
			
			if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();		
			TipoFormato tipoformato=new TipoFormato();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoFormato(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoFormato.getSelectedItem();
			
			
			
			
			tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoformatosSeleccionados.size()==1) {
				for(TipoFormato tipoformatoAux:tipoformatosSeleccionados) {
					tipoformato=tipoformatoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Formato")) {
					jButtonFormatoActionPerformed(null,rowIndex,true,false,tipoformato);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoFormato();
			
      		//this.finishProcessTipoFormato(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoFormatoReturnGeneral() throws Exception {
		if(this.tipoformatoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoformatoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoformatoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoformatoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoformatoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoformatoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoFormato(false);
		}
		
		if(this.tipoformatoReturnGeneral.getConRetornoLista() || this.tipoformatoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoformatoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoformatoLogic.setTipoFormatos(this.tipoformatoReturnGeneral.getTipoFormatos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoformatoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoformatoLogic.setTipoFormato(this.tipoformatoReturnGeneral.getTipoFormato());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoFormato(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoFormato() throws Exception {
		
		
	}
	
	public ArrayList<TipoFormato> getTipoFormatosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoFormato) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoFormato tipoformatoAux:tipoformatoLogic.getTipoFormatos()) {
					if(tipoformatoAux.getIsSelected()) {
						tipoformatosSeleccionados.add(tipoformatoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormato tipoformatoAux:this.tipoformatos) {
					if(tipoformatoAux.getIsSelected()) {
						tipoformatosSeleccionados.add(tipoformatoAux);				
					}
				}
			}
			
			if(tipoformatosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoformatosSeleccionados.addAll(this.tipoformatoLogic.getTipoFormatos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoformatosSeleccionados.addAll(this.tipoformatos);				
					}
				}
			}
		} else {
			tipoformatosSeleccionados.add(this.tipoformato);
		}
		
		return tipoformatosSeleccionados;
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
	
	public void generarReporteTipoFormatosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoFormatosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoFormatosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFormatosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFormatosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoFormatosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Formato ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoFormatosSeleccionados() throws Exception {
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();		
		
		tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoFormatos("Todos",tipoformatosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoFormatosSeleccionados() throws Exception {
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();		
		
		tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoFormatos("Todos",tipoformatosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoFormatosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();
		
		tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoFormatos("Todos",tipoformatosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoFormatosSeleccionados() throws Exception {
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoFormato();
		
		
		tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoFormato();
		
		
		//this.generarReporteTipoFormatos("Todos",tipoformatosSeleccionados ,tipoformatoImplementable,tipoformatoImplementableHome);
	}
	
	public void mostrarImportacionTipoFormatos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoFormato();
		
		this.abrirFrameImportacionTipoFormato();		
		
			
		//this.generarReporteTipoFormatos("Todos",tipoformatosSeleccionados ,tipoformatoImplementable,tipoformatoImplementableHome);
	}
	
	public void importarTipoFormatos() throws Exception {		
	
	}
	
	public void exportarTipoFormatosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoFormatosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoFormatosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoFormatosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Formato ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoFormatosSeleccionados() throws Exception {
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();		
		
		tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformato."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoFormato(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoFormato tipoformatoAux:tipoformatosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoFormato(tipoformatoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoformatoAux.setsDetalleGeneralEntityReporte(tipoformatoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formato ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoFormato(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoFormatoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFormatoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFormatoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFormatoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoFormato(TipoFormato tipoformato,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoformato.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoformato.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoformato.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoformato.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoFormatosSeleccionados() throws Exception {
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();		
		
		tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformato.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoFormatos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoFormato(row);				
				iRow++;
			}				
			
			for(TipoFormato tipoformatoAux:tipoformatosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoFormato(tipoformatoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formato ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoFormatosSeleccionados() throws Exception {
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();		
		
		tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformato.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoformatos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoformato");
			//elementRoot.appendChild(element);
		
			for(TipoFormato tipoformatoAux:tipoformatosSeleccionados) {
				element = document.createElement("tipoformato");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoFormato(tipoformatoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Formato ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoFormato(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormatoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormatoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormatoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormatoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoFormato(TipoFormato tipoformato,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoformato.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoformato.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoformato.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoFormato(TipoFormato tipoformato,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoFormatoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoformato.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoFormatoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoformato.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoFormatoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoformato.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoFormatoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoformato.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoFormatosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoFormato> tipoformatosSeleccionados=new ArrayList<TipoFormato>();
		
		tipoformatosSeleccionados=this.getTipoFormatosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoFormato(tipoformatosSeleccionados);
		
		this.generarReporteTipoFormatos("Todos",tipoformatosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoFormato(ArrayList<TipoFormato> tipoformatosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoFormato tipoformatoAux:tipoformatosSeleccionados) {
				tipoformatoAux.setsDetalleGeneralEntityReporte(tipoformatoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoFormatoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoformatoAux.setsDescripcionGeneralEntityReporte1(tipoformatoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoFormatoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoformatoAux.setsDescripcionGeneralEntityReporte1(tipoformatoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormatoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoFormato(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoFormato=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoFormato=true;
				this.isVisibilidadCeldaGuardarCambiosTipoFormato=true;
			}
			
			this.isVisibilidadCeldaModificarTipoFormato=false;
			this.isVisibilidadCeldaActualizarTipoFormato=false;
			this.isVisibilidadCeldaEliminarTipoFormato=false;
			this.isVisibilidadCeldaCancelarTipoFormato=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormato=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormato=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoFormato=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=false;
			this.isVisibilidadCeldaModificarTipoFormato=false;
			this.isVisibilidadCeldaActualizarTipoFormato=true;
			this.isVisibilidadCeldaEliminarTipoFormato=false;
			this.isVisibilidadCeldaCancelarTipoFormato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormato=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormato=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoFormato=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=false;
			this.isVisibilidadCeldaModificarTipoFormato=false;
			this.isVisibilidadCeldaActualizarTipoFormato=true;
			this.isVisibilidadCeldaEliminarTipoFormato=true;
			this.isVisibilidadCeldaCancelarTipoFormato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormato=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormato=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoFormato=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=false;
			this.isVisibilidadCeldaModificarTipoFormato=false;
			this.isVisibilidadCeldaActualizarTipoFormato=true;
			this.isVisibilidadCeldaEliminarTipoFormato=false;
			this.isVisibilidadCeldaCancelarTipoFormato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormato=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormato=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoFormato=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=true;
			this.isVisibilidadCeldaModificarTipoFormato=false;
			this.isVisibilidadCeldaActualizarTipoFormato=false;
			this.isVisibilidadCeldaEliminarTipoFormato=false;
			this.isVisibilidadCeldaCancelarTipoFormato=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormato=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormato=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoFormato=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=false;
			this.isVisibilidadCeldaActualizarTipoFormato=false;
			this.isVisibilidadCeldaEliminarTipoFormato=false;
			this.isVisibilidadCeldaCancelarTipoFormato=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormato=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormato=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoFormato=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=false;
			this.isVisibilidadCeldaModificarTipoFormato=true;
			this.isVisibilidadCeldaActualizarTipoFormato=false;
			this.isVisibilidadCeldaEliminarTipoFormato=false;
			this.isVisibilidadCeldaCancelarTipoFormato=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormato=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormato=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoFormatoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoFormato=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=true;
		} else {
			this.actualizarEstadoPanelsTipoFormato(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoFormato=false;
			//this.isVisibilidadCeldaVerFormTipoFormato=false;
			this.isVisibilidadCeldaDuplicarTipoFormato=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoformatoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoFormato=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormato=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoformatoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoformatoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoFormato=false;												
			}
			
			this.jButtonCerrarTipoFormato.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFormato=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoformato)) {
			this.isVisibilidadCeldaActualizarTipoFormato=false;
			this.isVisibilidadCeldaEliminarTipoFormato=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFormato() {
		this.isVisibilidadCeldaNuevoTipoFormato=false;
		this.isVisibilidadCeldaGuardarCambiosTipoFormato=false;
	}
	
	public void actualizarEstadoPanelsTipoFormato(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoFormato!=null) {
				this.jScrollPanelDatosEdicionTipoFormato.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormato!=null) {
				this.jTabbedPaneBusquedasTipoFormato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormato!=null) {
				this.jScrollPanelDatosTipoFormato.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormato!=null) {
				this.jPanelPaginacionTipoFormato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormato!=null) {
				this.jPanelParametrosReportesTipoFormato.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoFormato!=null) {
				this.jScrollPanelDatosEdicionTipoFormato.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormato!=null) {
				this.jTabbedPaneBusquedasTipoFormato.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoFormato!=null) {
				this.jScrollPanelDatosTipoFormato.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFormato!=null) {
				this.jPanelPaginacionTipoFormato.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFormato!=null) {
				this.jPanelParametrosReportesTipoFormato.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoFormato!=null) {
				this.jScrollPanelDatosEdicionTipoFormato.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormato!=null) {
				this.jTabbedPaneBusquedasTipoFormato.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormato!=null) {
				this.jScrollPanelDatosTipoFormato.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFormato!=null) {
				this.jPanelPaginacionTipoFormato.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFormato!=null) {
				this.jPanelParametrosReportesTipoFormato.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoFormato!=null) {
				this.jScrollPanelDatosEdicionTipoFormato.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormato!=null) {
				this.jTabbedPaneBusquedasTipoFormato.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormato!=null) {
				this.jScrollPanelDatosTipoFormato.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFormato!=null) {
				this.jPanelPaginacionTipoFormato.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFormato!=null) {
				this.jPanelParametrosReportesTipoFormato.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoFormato!=null) {
				this.jScrollPanelDatosEdicionTipoFormato.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormato!=null) {
				this.jTabbedPaneBusquedasTipoFormato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormato!=null) {
				this.jScrollPanelDatosTipoFormato.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormato!=null) {
				this.jPanelPaginacionTipoFormato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormato!=null) {
				this.jPanelParametrosReportesTipoFormato.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoFormato!=null) {
				this.jScrollPanelDatosEdicionTipoFormato.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormato!=null) {
				this.jTabbedPaneBusquedasTipoFormato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormato!=null) {
				this.jScrollPanelDatosTipoFormato.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormato!=null) {
				this.jPanelPaginacionTipoFormato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormato!=null) {
				this.jPanelParametrosReportesTipoFormato.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoFormato!=null) {
				this.jScrollPanelDatosEdicionTipoFormato.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormato!=null) {
				this.jTabbedPaneBusquedasTipoFormato.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormato!=null) {
				this.jScrollPanelDatosTipoFormato.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormato!=null) {
				this.jPanelPaginacionTipoFormato.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormato!=null) {
				this.jPanelParametrosReportesTipoFormato.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoFormato!=null) {
					this.jTabbedPaneBusquedasTipoFormato.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoFormato!=null) {
				this.jPanelParametrosReportesTipoFormato.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoformatoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormato!=null) {
				this.jTabbedPaneBusquedasTipoFormato.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoFormato!=null) {
				this.jPanelParametrosReportesTipoFormato.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorId=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasTipoFormato.remove(jPanelBusquedaPorIdTipoFormato);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoFormato.remove(jPanelBusquedaPorNombreTipoFormato);}
		}
		
	}
	
	

	public String registrarSesionTipoFormatoParaFormatoes() throws Exception {
		Boolean isPaginaPopupFormato=false;

		try {

			if(this.tipoformatoSessionBean==null) {
				this.tipoformatoSessionBean=new TipoFormatoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoFormato.formatoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoFormato.formatoSessionBean=new FormatoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoFormato.formatoSessionBean.setsPathNavegacionActual(tipoformatoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FormatoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoFormato.formatoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFormato=this.jInternalFrameDetalleFormTipoFormato.formatoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoFormato.formatoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFormato(true);
			this.jInternalFrameDetalleFormTipoFormato.formatoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFormato(TipoFormatoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoFormato.formatoSessionBean.setisBusquedaDesdeForeignKeySesionTipoFormato(true);
			this.jInternalFrameDetalleFormTipoFormato.formatoSessionBean.setlidTipoFormatoActual(this.idTipoFormatoActual);

			tipoformatoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoFormato(true);
			tipoformatoSessionBean.setlIdTipoFormatoActualForeignKey(this.idTipoFormatoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoFormatoSessionBean tipoformatoSessionBean=new TipoFormatoSessionBean();
		
		if(this.tipoformatoSessionBean==null) {
			this.tipoformatoSessionBean=new TipoFormatoSessionBean();
		}
		
		this.tipoformatoSessionBean.setsUltimaBusquedaTipoFormato(this.getsAccionBusqueda());
		this.tipoformatoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoformatoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tipoformatoSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoformatoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoformatoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoFormatoSessionBean tipoformatoSessionBean=new TipoFormatoSessionBean();
		
		if(this.tipoformatoSessionBean==null) {
			this.tipoformatoSessionBean=new TipoFormatoSessionBean();
		}
		
		if(this.tipoformatoSessionBean.getsUltimaBusquedaTipoFormato()!=null&&!this.tipoformatoSessionBean.getsUltimaBusquedaTipoFormato().equals("")) {
			this.setsAccionBusqueda(tipoformatoSessionBean.getsUltimaBusquedaTipoFormato());
			this.setiNumeroPaginacion(tipoformatoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoformatoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tipoformatoSessionBean.getid());
				tipoformatoSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoformatoSessionBean.getnombre());
				tipoformatoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoformatoSessionBean.getid_empresa());
				tipoformatoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoformatoSessionBean.setsUltimaBusquedaTipoFormato("");
		this.tipoformatoSessionBean.setiNumeroPaginacion(TipoFormatoConstantesFunciones.INUMEROPAGINACION);
		this.tipoformatoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoFormato(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoFormato() {
		this.updateBorderResaltarBusquedasFormularioTipoFormato();
		this.updateVisibilidadBusquedasFormularioTipoFormato();
		this.updateHabilitarBusquedasFormularioTipoFormato();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoFormato() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoFormato.getComponents().length>0) {
	

		if(this.tipoformatoConstantesFunciones.resaltarBusquedaPorIdTipoFormato!=null) {
			index= this.jTabbedPaneBusquedasTipoFormato.indexOfComponent(this.jPanelBusquedaPorIdTipoFormato);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFormato.getComponent(index);
				jPanel.setBorder(this.tipoformatoConstantesFunciones.resaltarBusquedaPorIdTipoFormato);
			}
		}

		if(this.tipoformatoConstantesFunciones.resaltarBusquedaPorNombreTipoFormato!=null) {
			index= this.jTabbedPaneBusquedasTipoFormato.indexOfComponent(this.jPanelBusquedaPorNombreTipoFormato);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFormato.getComponent(index);
				jPanel.setBorder(this.tipoformatoConstantesFunciones.resaltarBusquedaPorNombreTipoFormato);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoFormato() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoFormato.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoFormato.indexOfComponent(this.jPanelBusquedaPorIdTipoFormato);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFormato.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoformatoConstantesFunciones.mostrarBusquedaPorIdTipoFormato);
			if(!this.tipoformatoConstantesFunciones.mostrarBusquedaPorIdTipoFormato && index>-1) {
				this.jTabbedPaneBusquedasTipoFormato.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoFormato.indexOfComponent(this.jPanelBusquedaPorNombreTipoFormato);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFormato.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoformatoConstantesFunciones.mostrarBusquedaPorNombreTipoFormato);
			if(!this.tipoformatoConstantesFunciones.mostrarBusquedaPorNombreTipoFormato && index>-1) {
				this.jTabbedPaneBusquedasTipoFormato.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoFormato() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoFormato.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoFormato.indexOfComponent(this.jPanelBusquedaPorIdTipoFormato);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFormato.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoformatoConstantesFunciones.activarBusquedaPorIdTipoFormato);
				this.jTabbedPaneBusquedasTipoFormato.setEnabledAt(index,this.tipoformatoConstantesFunciones.activarBusquedaPorIdTipoFormato);
			}

			index= this.jTabbedPaneBusquedasTipoFormato.indexOfComponent(this.jPanelBusquedaPorNombreTipoFormato);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFormato.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoformatoConstantesFunciones.activarBusquedaPorNombreTipoFormato);
				this.jTabbedPaneBusquedasTipoFormato.setEnabledAt(index,this.tipoformatoConstantesFunciones.activarBusquedaPorNombreTipoFormato);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoFormato(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoFormato.indexOfComponent(this.jPanelBusquedaPorIdTipoFormato);

			this.jTabbedPaneBusquedasTipoFormato.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFormato.getComponent(index);

			this.tipoformatoConstantesFunciones.setResaltarBusquedaPorIdTipoFormato(resaltar);

			jPanel.setBorder(this.tipoformatoConstantesFunciones.resaltarBusquedaPorIdTipoFormato);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoFormato.indexOfComponent(this.jPanelBusquedaPorNombreTipoFormato);

			this.jTabbedPaneBusquedasTipoFormato.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoFormato.getComponent(index);

			this.tipoformatoConstantesFunciones.setResaltarBusquedaPorNombreTipoFormato(resaltar);

			jPanel.setBorder(this.tipoformatoConstantesFunciones.resaltarBusquedaPorNombreTipoFormato);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoFormato.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoFormato() throws Exception {

		if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoFormato();
		this.updateVisibilidadResaltarControlesFormularioTipoFormato();
		this.updateHabilitarResaltarControlesFormularioTipoFormato();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoFormato() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoformatoConstantesFunciones.resaltaridTipoFormato!=null && this.jInternalFrameDetalleFormTipoFormato!=null) {this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.setBorder(this.tipoformatoConstantesFunciones.resaltaridTipoFormato);}
		if(this.tipoformatoConstantesFunciones.resaltarid_empresaTipoFormato!=null && this.jInternalFrameDetalleFormTipoFormato!=null) {this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.setBorder(this.tipoformatoConstantesFunciones.resaltarid_empresaTipoFormato);}
		if(this.tipoformatoConstantesFunciones.resaltarnombreTipoFormato!=null && this.jInternalFrameDetalleFormTipoFormato!=null) {this.jInternalFrameDetalleFormTipoFormato.jTextAreanombreTipoFormato.setBorder(this.tipoformatoConstantesFunciones.resaltarnombreTipoFormato);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoFormato() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) {
	
		//this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.setVisible(this.tipoformatoConstantesFunciones.mostraridTipoFormato);
		this.jInternalFrameDetalleFormTipoFormato.jPanelidTipoFormato.setVisible(this.tipoformatoConstantesFunciones.mostraridTipoFormato);
		//this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.setVisible(this.tipoformatoConstantesFunciones.mostrarid_empresaTipoFormato);
		this.jInternalFrameDetalleFormTipoFormato.jPanelid_empresaTipoFormato.setVisible(this.tipoformatoConstantesFunciones.mostrarid_empresaTipoFormato);
		//this.jInternalFrameDetalleFormTipoFormato.jTextAreanombreTipoFormato.setVisible(this.tipoformatoConstantesFunciones.mostrarnombreTipoFormato);
		this.jInternalFrameDetalleFormTipoFormato.jPanelnombreTipoFormato.setVisible(this.tipoformatoConstantesFunciones.mostrarnombreTipoFormato);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoFormato() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFormato==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFormato!=null) {
	
		this.jInternalFrameDetalleFormTipoFormato.jLabelidTipoFormato.setEnabled(this.tipoformatoConstantesFunciones.activaridTipoFormato);
		this.jInternalFrameDetalleFormTipoFormato.jComboBoxid_empresaTipoFormato.setEnabled(this.tipoformatoConstantesFunciones.activarid_empresaTipoFormato);
		this.jInternalFrameDetalleFormTipoFormato.jTextAreanombreTipoFormato.setEnabled(this.tipoformatoConstantesFunciones.activarnombreTipoFormato);
		}
	}
	
		
}